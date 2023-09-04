package app.body.screen1.tile.rule.action.helper;

import java.net.URL;

public class ActionsResourcesConstants {

    private static final String BASE_PACKAGE = "/app/body/screen1/tile/rule/action";
    private static final  String IDS_FXML_RESOURCE_IDENTIFIER = BASE_PACKAGE + "/increase/decrease/set/idsAction - Copy.fxml";

    private static final  String CALCULATION_FXML_RESOURCE_IDENTIFIER = BASE_PACKAGE + "/calculation/calculationAction - Copy.fxml";

    private static final  String KILL_FXML_RESOURCE_IDENTIFIER = BASE_PACKAGE + "/kill/killAction - Copy.fxml";

    private static final  String SINGLE_CONDITION_FXML_RESOURCE_IDENTIFIER = BASE_PACKAGE + "/condition/singleConditionAction.fxml";
    private static final  String MULTIPLE_CONDITION_FXML_RESOURCE_IDENTIFIER = BASE_PACKAGE + "/condition/multipleConditionAction.fxml";
    public static final URL KILL_FXML_URL = ActionsResourcesConstants.class.getResource(ActionsResourcesConstants.KILL_FXML_RESOURCE_IDENTIFIER);
    public static final URL IDS_FXML_URL = ActionsResourcesConstants.class.getResource(ActionsResourcesConstants.IDS_FXML_RESOURCE_IDENTIFIER);

    public static final URL CALCULATION_FXML_URL = ActionsResourcesConstants.class.getResource(ActionsResourcesConstants.CALCULATION_FXML_RESOURCE_IDENTIFIER);

    public static final URL SINGLE_CONDITION_FXML_URL = ActionsResourcesConstants.class.getResource(ActionsResourcesConstants.SINGLE_CONDITION_FXML_RESOURCE_IDENTIFIER);
    public static final URL MULTIPLE_CONDITION_FXML_URL = ActionsResourcesConstants.class.getResource(ActionsResourcesConstants.MULTIPLE_CONDITION_FXML_RESOURCE_IDENTIFIER);
}