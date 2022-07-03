Feature: Fidexi log out fuctionality
  User Story: As a user, I should be able to log out.

  Background: For the scenarios in the feature file, user is expected to be on log in page after logs out
    Given user enters valid credentials and lands on the Fidexi home page
  @fidexi_413
  Scenario: Log out fuctionality verification
    When user clicks username on top right
    Then user clicks Log out
    And user lands on Log in page and should see title is Login Best solution for startups

  Scenario: Not go to the home page again by clicking the step back button after logged out verification
    When user clicks username on top right
    Then user clicks Log out
    And user lands on Log in page and clicks step back button
    Then user sees expiry message

