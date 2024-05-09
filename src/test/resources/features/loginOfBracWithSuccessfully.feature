Feature: login  brac application with successfully and input stckholder data info
  As a user I can login  and stakholder data input with successfully

  Scenario: user can login without any error and user input stackholder information
    Given I am in the login page
    Then I fill user email "sqa"
    And I fill user password "123"
    And I click on login button
    Then I click on the admin button
    And I click on the stakeholder Management
    And I Select on the Stakeholder information
    Then I want to click on add data sign
    Then I CLick on working area
    And I fill value of villageArea "Misoli(Village)"
    And I CLick on village name
    And I click on next button
    And I fill name "abdullah"
    And I select gender
    And I select stakholder type
    And I select designation
    And I fill phone number "01924818814"
    And I select disability
   Then I click save button
