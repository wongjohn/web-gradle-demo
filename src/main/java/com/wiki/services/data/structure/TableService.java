package com.wiki.services.data.structure;

import com.wiki.facade.data.structure.TableStructureFacade;
import com.wiki.models.data.structure.TableStructure;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

/**
 * TableService.
 *
 */
@Path("/tables")
public class TableService {
    private TableStructureFacade tableStructureFacade;

    @Inject
    public TableService(TableStructureFacade tableStructureFacade) {
        this.tableStructureFacade = tableStructureFacade;
    }

    /**
     * 获取符合条件的数据表
     * @return
     */
    @GET
    public List<TableStructure> getTableStructures() {
        return tableStructureFacade.getTableStructures();
    }

}
