package starter.ImagesCat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.ImagesCat.ImagesCatAPI;
import starter.utils.Constants;

import java.io.File;

public class PostImageStepDef {
    @Steps
    ImagesCatAPI imagesCatAPI;
    File imageFile;
    Response response;

    @Given("I have a cat image {string}")
    public void iHaveACatImage(String imagePath) {
        File imageFile = new File(imagePath);
        imagesCatAPI.postCatImage(imageFile.getPath());
    }

    @When("Send POST request with the images")
    public void sendPOSTRequestWithTheImage() {
        response = imagesCatAPI.postCatImage(imageFile.getPath());
    }

}
