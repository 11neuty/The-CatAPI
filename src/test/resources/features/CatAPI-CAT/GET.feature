Feature: GET CAT
  As user i can get cat by ID, images

  @Test
  #POSITIVE TEST CASE
  Scenario: As user i can get cat by ID
    Given Get cat images by id "cs8MHOb5I"
    When  Send request get cat by ID
    Then  Status code should be 200

  Scenario: As user i can search cat with valid parameters
    Given Get cat image by valid parameter "size=med&mime_types=jpg&format=json&has_breeds=true&order=RANDOM&page=0&limit=1"
    When  Send request search cat by param
    Then  Status code should be 200

  Scenario: As user i can get my cat
    Given Get my cat
    When  Send request get my cat
    Then  Status code should be 200


    #NEGATIVE TEST CASE
  Scenario: As user i cant get cat by unregistered ID
    Given Get cat images by id "askdjb"
    When  Send request get cat by ID
    Then  Status code should be 400

  Scenario: As user i cant search cat with invalid parameters
    Given Get cat image by valid parameter "siz=hard"
    When  Send request search cat by param
    Then  Status code should be 404
