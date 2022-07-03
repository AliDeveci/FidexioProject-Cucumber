Feature: Fidexi log in fuctionality
  User Story: As a user, I should be able to log in so that I can land on homepage.


  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the Fidexi login page




  @fidexi_412
  Scenario Outline:  Log in fuctionality verification
    When user clicks email blank and enters "<username>"
    Then user clicks password blank and enters "<password>"
    And user clicks Log in button
    Then user should see title is Odoo

    Examples: login credentials we are going to use in this scenario are as below
      | username                | password     |
      | salesmanager11@info.com | salesmanager |
      | salesmanager61@info.com | salesmanager |
      | salesmanager99@info.com | salesmanager |
      | salesmanager13@info.com | salesmanager |
      | salesmanager9@info.com  | salesmanager |
      | posmanager13@info.com   | posmanager   |
      | posmanager61@info.com   | posmanager   |
      | posmanager9@info.com    | posmanager   |
      | posmanager111@info.com  | posmanager   |
      | posmanager45@info.com   | posmanager   |

  @fidexi_412
  Scenario Outline:  Log in fuctionality with invalid credentials verification
    When user clicks email blank and enters "<username>"
    Then user clicks password blank and enters "<password>"
    And user clicks Log in button
    Then user should see text wrong login password alert

    Examples: Invalid login credentials we are going to use in this scenario are as below
      | username                | password     |
      | sales.com               | salesmanager |
      | salesmanage@info.com    | salesmanager |
      | salesmanager99@info.com | salesman     |
      | salesmanager13@info.com | manager      |
      | salesmanager9@info.com  | lesmanager   |
      | posman@info.com         | posmanager   |
      | posmanager@info.com     | posmanager   |
      | posmanager9             | posmanager   |
      | posmanager111@info.com  | posman       |
      | posmanager45@info.com   | manager      |
  @fidexi_412
  Scenario: "Please fill out this field" message when blanks are empty verification
    When user clicks Log in button
    Then user should see please fill out this field message
  @fidexi_412
  Scenario: "Please fill out this field" message when password blank is empty verification
    When user clicks email blank and enters username
    Then user clicks Log in button
    And user should see please fill out this field message
  @fidexi_412
  Scenario: Landing reset password page verification
    When user clicks reset password
    Then user lands on reset password page

  @fidexi_412
  Scenario: See the password in bullet signs verification
    Then user clicks password blank and enters password
    And password is in bullet signs
  @fidexi_412
  Scenario: Enter key of the keyboard works verification
    When user clicks email blank and enters username
    Then user clicks password blank enters password and presses enter key
    And user should see title is Odoo
  @fidexi_412
  Scenario: Enter key of the keyboard negative works verification
    When user clicks email blank and enters username and presses enter key
    And user should see please fill out this field message