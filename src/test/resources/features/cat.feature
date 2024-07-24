Feature : CAT
  As user i can used method GET and POST for get cat and uploud cat

  Scenario: Get random cat images
    Given Get cat by random image
    When  Send request get cat images
    Then  Status code should be 200
