package test

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

import models._

class UsersSpec extends Specification {
  "Users Model" should {

    "be get all users" in {
      running(FakeApplication(additionalConfiguration = inMemoryDatabase("helloworld"))) {
        val users = Users.get()
          users.map { user =>
            user must have key('name)
            user must have key('message)
          }
      }
    }
  }
}
