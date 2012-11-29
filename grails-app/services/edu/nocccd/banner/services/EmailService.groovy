package edu.nocccd.banner.services

import groovy.sql.Sql;
import edu.nocccd.data.domain.Email;

class EmailService {
	static dataSource
	
	def getEmail(String username) {
		assert dataSource != null, "Datasource is null! No Good!!!"
		def sql = Sql.newInstance(dataSource)
		def query = """select email_address from person
			left join email
			on person.pid = email.pid
			where username = ?
			and email_status_ind = 'A' and 
			email_preferred_ind = 'Y'"""
		username = "@${username}"
		log.debug("getEmail address for username ${username}")
			
		Email email = new Email()
		try {
			def row = sql.firstRow(query, [username])
			email.address = row.email_address
		} catch(Exception e) {
			log.error "Exception EmailService.getEmail() ${query} - ${e}"
		}
		log.debug("Username - ${username} Email - ${email.address}")
		return email
	}
}
