@registerAsCustomer

Feature: Customer Registration

  Scenario Outline: User Register As A Customer
    Given User Landed On Home Page
    When Clicked On User Icon
    Then Registered As A Customer With Email <Email> and Password <Password>
    And Customer Dashboard Displayed

    Examples:
      | Email | Password |
      | user2@demo.com | @DemoUser2024@ |