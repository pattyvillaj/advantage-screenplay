# Actor: Ana

@stories
Feature: As a user of technological products, want to register on the Advantage page

  @scenario1
  Scenario: Registration on the advantage page

    Given than Ana wants to register on the Advantage page
    When she enters her data in the registration form
      |  userName     |         email           |  password     |   firstName    |   lastName   |   phoneNumber  |  country   |   city     |    address     | stateProvinceRegion  |   postalCode   |
      |  AnaL2       |  anamari2@gmail.com      |   Maria123456 |     Ana        |   Lopez      |  3115423654    | Colombia   |  Medellin   |  Dg 79 756-65  |       Robledo        |    0057        |
    Then she will check that your registration was successful
      |  userName     |
      |  AnaL2       |


