Feature: Login
@tag
  Scenario Outline: Success
    Given Homepage
    And clicks on SignIn
    When usernam in the field as "<username>" 
    And passwor in the field as "<password>" 
    Then clicks on the  login
    
    Examples: 
      | username     | password   |
      | Lalitha      | Password123|
