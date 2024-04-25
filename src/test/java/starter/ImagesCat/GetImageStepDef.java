package starter.ImagesCat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;


public class GetImageStepDef {
    @Steps
    ImagesCatAPI imagesCatAPI;

    @Given("Get cat images by id {string}")
    public void getCatImagesById(String id) {
        imagesCatAPI.getCatById(id);
    }

    @When("Send request get cat by ID")
    public void sendRequestGetCatByID() {
        SerenityRest.when().get(ImagesCatAPI.ID);
    }

    @Given("Get cat image by valid parameter {string}")
    public void getCatImagebyValidParameter(String param){
    imagesCatAPI.getCatByParam(param);

    }
    @When("Send request search cat by param")
    public void sendRequestSearchCatByParam() {
        SerenityRest.when().get(ImagesCatAPI.PARAM);
    }

    @Given("Get my cat")
    public void getMyCat(){
        imagesCatAPI.getMyCat();
    }
    @When("Send request get my cat")
    public void sendRequestGetMyCat(){
        SerenityRest.when().get(ImagesCatAPI.MY_CAT);
    }
}
