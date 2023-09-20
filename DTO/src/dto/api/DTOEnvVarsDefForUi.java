package dto.api;

import dto.definition.property.definition.api.PropertyDefinitionDTO;

import java.util.List;

public class DTOEnvVarsDefForUi  {

    private final List<PropertyDefinitionDTO> environmentVars;

    public DTOEnvVarsDefForUi(List<PropertyDefinitionDTO> environmentVars){
        this.environmentVars = environmentVars;
    }

    public List<PropertyDefinitionDTO> getEnvironmentVars() {
        return environmentVars;
    }
}
