package starter.ImagesCat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class ImagesCatAPI {
    public static String ID = Constants.BASE_URL + "/images/{id}";

    @Step("Get cat by id")
    public void getCatById(String id){
        SerenityRest.given()
                .headers("Authorization", "API Key live_je6aL1sEUIm4Fr5m3cay64xVn86SKZoMdnt8vgrPwZBQOsqxWXD8GCrOSK3wQgs0")
                .pathParam("id", id);
    }
}
