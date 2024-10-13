@loginAsACustomer

Feature: Customer Login

  Scenario Outline: User Logged In As A Customer
    Given User Landed On Home Page
    When Clicked On User Icon
    Then Logged In As A Customer With Username <Username> and Password <Password>
    And Customer Dashboard Displayed

    Examples:
    | Username | Password |
    | demouser | 12345678 |