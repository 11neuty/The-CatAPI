Feature: POST CAT
  As user i can post my cat

  @TEST
  #POSITIVE TEST CASE
  Scenario: As user i can post cat
    Given I have a cat image "C:/Users/Ryand/Downloads/pexels-pixabay-45201.jpg"
    When  Send POST request with the images
    Then  Status code should be 201