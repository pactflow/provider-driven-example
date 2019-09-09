package io.swagger.api

import io.pactflow.oasverifier.OASContract
import org.junit.jupiter.api.TestTemplate
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension


@ExtendWith(SpringExtension::class)
@SpringBootTest
@OASContract(classpath = "petstore-oas.yaml", tags = ["store"])
class StoreApiControllerIntegrationTest {

  @TestTemplate
  @ExtendWith(OASVerifierExtension::class)
  fun testTemplate(request: HttpRequest, context: VerificationContext) {
    request.addHeader("X-ContractTest", "true")
    context.verifyInteraction()
  }

}
