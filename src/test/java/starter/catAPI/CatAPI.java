package starter.catAPI;

import jdk.vm.ci.meta.Constant;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

class CatAPI {

    public static String GET_RANDOM_CAT_IMAGES = Constants.BASE_URL + "/images/search";

    @Step("Get Cat by random image")
    public void getCatByRandomCat(){
        SerenityRest.given();
    }
}

