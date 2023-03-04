Feature: Sign up for Payback website
    As a user
    I want to sign up for the Payback website
    So that I can earn and redeem points

  Background: User must be on signup page
    Given User should click login
    And User should click the signup buttonn
    Then user is navigated to signup page
 
 @login
  Scenario Outline: Successful sign up
    Given User am on the Payback signup page
    When User enter "<first name>","<last name>","<phone number>" and "<email>"
    And User click on the Generate OTP1
    And User should see a otp entry page1
    Then User should able to see success message

    Examples: 
      | first name | last name | phone number | email    |
      | shaik   | imthiyaz      | 7981809886    | shaikimthiyaz9154@gmail.com |

  Scenario: Unsuccessful sign up with invalid email
    Given User am on the Payback websitte
    When User enter my details2
    And User click on the Generate OTP2
    Then User should see an error message indicating the invalid email format

  Scenario: Unsuccessful sign up with existing email
    Given User am on the Payback webssite
    When User enter my details3
    And User click on the Generate OTP3
    Then User should see an error message indicating the email is already registered

  Scenario: Unsuccessful sign up with invalid PhoneNumber
    Given User am on the Paybackk website
    When User enter my details4
    And User click on the Generate OTP4
    Then User should see an error message indicating the invalid PhoneNumber format
