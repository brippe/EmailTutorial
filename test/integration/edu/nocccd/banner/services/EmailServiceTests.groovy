package edu.nocccd.banner.services

import static org.junit.Assert.*
import org.junit.*

class EmailServiceTests {

	def emailService
	
    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testGetEmail() {
		assert emailService != null, "EmailService is null! BAD!"
		assert emailService.getEmail("00000000") == "brippe@somewhere.com", "EmailService.getEmail() FAIL!"
    }
}
