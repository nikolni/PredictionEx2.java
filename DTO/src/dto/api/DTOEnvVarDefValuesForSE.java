package dto.api;

import dto.definition.property.definition.api.PropertyDefinitionDTO;

import java.util.List;

public class DTOEnvVarDefValuesForSE {

    private List<Object> environmentVarInitValues;
    private List<PropertyDefinitionDTO> propertyDefinitionDTOList;

    public DTOEnvVarDefValuesForSE(List<Object> environmentVarInitValues, List<PropertyDefinitionDTO> propertyDefinitionDTOList){
        this.environmentVarInitValues = environmentVarInitValues;
        this.propertyDefinitionDTOList = propertyDefinitionDTOList;
    }

    public List<Object> getEnvironmentVarInitValues() {
        return environmentVarInitValues;
    }

    public List<PropertyDefinitionDTO> getPropertyDefinitionDTOList() {
        return propertyDefinitionDTOList;
    }
}
