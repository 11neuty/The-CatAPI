Feature: GET CAT
  As user i can get cat by ID, images

  @Project
  #POSITIVE TEST CASE
  Scenario: As user i can get cat by ID
    Given Get cat images by id "cs8MHOb5I"
    When  Send request get cat by ID
    Then  Status code should be 200
