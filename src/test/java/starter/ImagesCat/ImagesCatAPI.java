package starter.ImagesCat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class ImagesCatAPI {
    public static String ID = Constants.BASE_URL + "/images/{id}";
    public static String PARAM = Constants.BASE_URL + "/images/search?{param}";
    public static String MY_CAT = Constants.BASE_URL + "/images/";

    @Step("Get cat by id")
    public void getCatById(String id){
        SerenityRest.given()
               // .headers("Authorization", "API Key live_je6aL1sEUIm4Fr5m3cay64xVn86SKZoMdnt8vgrPwZBQOsqxWXD8GCrOSK3wQgs0")
                .pathParam("id", id);
    }
    @Step("Get cat by param")
    public void getCatByParam(String param){
        SerenityRest.given()
               // .headers("Authorization", "API Key live_je6aL1sEUIm4Fr5m3cay64xVn86SKZoMdnt8vgrPwZBQOsqxWXD8GCrOSK3wQgs0")
                .pathParam("param", param);
    }
    @Step("Get My Cat")
    public void getMyCat(){
        SerenityRest.given()
                .header("x-api-key", "API Key live_je6aL1sEUIm4Fr5m3cay64xVn86SKZoMdnt8vgrPwZBQOsqxWXD8GCrOSK3wQgs0");
    }
}
