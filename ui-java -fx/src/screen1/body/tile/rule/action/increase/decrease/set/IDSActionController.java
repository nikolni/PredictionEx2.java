package screen1.body.tile.rule.action.increase.decrease.set;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class IDSActionController {
        @FXML
        private Label actionTypeLabel;

        @FXML
        private Label primaryEntityLabel;

        @FXML
        private Label propertyNameLabel;

        @FXML
        private Label expressionLabel;

        public void setActionTypeLabel(String actionTypeText) {
                this.actionTypeLabel.setText(actionTypeText);
        }

        public void setPrimaryEntityLabel(String primaryEntityText) {
                this.primaryEntityLabel.setText(primaryEntityText);
        }

        public void setPropertyNameLabel(String propertyNameText) {
                this.propertyNameLabel.setText(propertyNameText);
        }

        public void setExpressionLabel(String expressionText) {
                this.expressionLabel.setText(expressionText);
        }
}
