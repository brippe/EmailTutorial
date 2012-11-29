package edu.nocccd.data.controllers

import grails.converters.JSON;

class EmailController {

	def emailService
	
    def getEmail = { 
		if(emailService == null) {
			log.error("Missing EmailService - need to implement EmailService")
			response.status = 500
			render "Missing my work buddy EmailService!!!"
		} else {
			log.debug("Getting some banner data for ${params.bannerID}")
			
			def email = emailService.getEmail(params.bannerID) 
			render email as JSON
			/*if(email != null)
				render email as JSON
			else {
				response.status = 404
				render "No email information ${params.bannerID}"
			}*/
		}
	}
}
