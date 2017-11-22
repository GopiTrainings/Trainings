Feature: Test

  Background:
    * url baseURL+'/example'

  Scenario: test springboot

    Given path '/echo'
    Given method get
    Then print response
    Then assert response == 'I am alive: version: 0.0.1'
    