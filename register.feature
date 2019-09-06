
Feature: Registration
@tag
  Scenario: Success
   Given User launches TestMeApp
   And User clicks on SignUp
    When User Enters username as "madhuvahh" in the field
    And User Enters firstname as "Mounika" in the field
    And User Enters lastname as "Rb" in the field
    And User Enters password as "Mouni123" in the field
    And User Enters confirmpassword as "Mouni123" in the field
    And User clicks the "Female" in the button
    And User enters email as "mouni@gmail.com" in the field
    And User enters the mobile number as "1234567891" in the field
    And User selects the date as "20/04/2000" in the field
    And User enters the address as "56,ngo_nagar" in the field
    And User selects the security question in the field
    And User enters the answer as "mad" in the field
      And Click on Register button
      Then Login is displayed
      