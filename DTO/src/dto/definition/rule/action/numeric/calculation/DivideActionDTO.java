package dto.definition.rule.action.numeric.calculation;

import dto.definition.entity.api.EntityDefinitionDTO;

public class DivideActionDTO extends CalculationActionDTO {
    public DivideActionDTO(String entityDefinitionParam,String secondEntityDefinitionDTO,
                           String propertyNameParam, String expressionStrParam1, String expressionStrParam2){
        super(entityDefinitionParam,secondEntityDefinitionDTO, propertyNameParam, expressionStrParam1, expressionStrParam2);
    }


}


