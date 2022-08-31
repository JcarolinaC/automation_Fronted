Feature: login
  As to QA Automation
  Want to Login
  For to start navegate to linkedIn

  Scenario: Login
    Given That user is join LinkeIn
    When the user to request in the login
      | usuario              | contraseña |
      | testqacaro@gmail.com | 12345      |
    Then the user can to see the name

