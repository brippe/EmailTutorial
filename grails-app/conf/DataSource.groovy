
// environment specific settings
environments {
    development {
        dataSource {
			pooled = true
			dialect = org.hibernate.dialect.Oracle10gDialect
			driverClassName = 'oracle.jdbc.OracleDriver'
			username = ''
			password = ''
			url = 'jdbc:oracle:thin:@<server>:<port>:<db>'
			dbCreate = 'validate'
        }
    }
    test {
        dataSource {
			pooled = true
			dialect = org.hibernate.dialect.Oracle10gDialect
			driverClassName = 'oracle.jdbc.OracleDriver'
			username = ''
			password = ''
			url = 'jdbc:oracle:thin:@<server>:<port>:<db>'
			dbCreate = 'validate'
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
            pooled = true
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}
