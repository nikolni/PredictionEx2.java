package dto.api;

import dto.definition.property.instance.api.PropertyInstanceDTO;

import java.util.List;

public class DTOEnvVarsInsForUi{
    private final List<PropertyInstanceDTO> environmentVars;

    public DTOEnvVarsInsForUi(List<PropertyInstanceDTO> environmentVars){
        this.environmentVars = environmentVars;
    }

    public List<PropertyInstanceDTO> getEnvironmentVars() {
        return environmentVars;
    }
}
