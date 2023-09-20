package dto.creation;

import dto.api.DTOEntityPropertyConsistency;
import system.engine.world.api.WorldInstance;

public class CreateDTOEntityPropertyConsistency {

    public DTOEntityPropertyConsistency getData(WorldInstance worldInstance, String entityName, String propertyName){
        Float propertyConsistency=worldInstance.getEntityInstanceManager().getConsistencyByEntityAndPropertyName(entityName,propertyName);
        return new DTOEntityPropertyConsistency(propertyConsistency);
    }
}
