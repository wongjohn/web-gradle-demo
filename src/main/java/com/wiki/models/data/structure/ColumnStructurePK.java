package com.wiki.models.data.structure;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * ColumnStructurePK.
 * 对于多字段主键来说，需要使用对于实体表（比如ColumnStructure）需要添加注解@IdClass.
 */
public class ColumnStructurePK implements Serializable{
    @Id
    @JoinColumn(name = "TABLE_ID")
    @ManyToOne
    @NotNull
    private TableStructure tableId;

    @Id
    @Column(name = "COLUMN_SEQ")
    private Integer columnSeq;

    public ColumnStructurePK() {
    }

    public TableStructure getTableId() {
        return tableId;
    }

    public void setTableId(TableStructure tableId) {
        this.tableId = tableId;
    }

    public Integer getColumnSeq() {
        return columnSeq;
    }

    public void setColumnSeq(Integer columnSeq) {
        this.columnSeq = columnSeq;
    }
}
