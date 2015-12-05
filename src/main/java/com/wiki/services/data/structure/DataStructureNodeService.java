package com.wiki.services.data.structure;

import com.wiki.facade.data.structure.DataStructureNodeFacade;
import com.wiki.models.data.structure.DataStructureNode;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

/**
 * DataStructureNodeService.
 */
@Path("/nodes")
public class DataStructureNodeService {
    private DataStructureNodeFacade dataStructureNodeFacade;

    @Inject
    public DataStructureNodeService(DataStructureNodeFacade dataStructureNodeFacade) {
        this.dataStructureNodeFacade = dataStructureNodeFacade;
    }

    /**
     *
     * @return
     */
    @GET
    public List<DataStructureNode> getDataStructureNodes() {
        return dataStructureNodeFacade.getDataStructureNodes();
    }

}
