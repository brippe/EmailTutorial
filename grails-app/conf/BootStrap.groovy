import grails.converters.JSON;
import edu.nocccd.data.domain.Email;

class BootStrap {

    def init = { servletContext ->
		JSON.registerObjectMarshaller(Email) {
			def returnArray = [:]
			returnArray['email'] = it.address
			return returnArray
		}
    }
    def destroy = {
    }
}
