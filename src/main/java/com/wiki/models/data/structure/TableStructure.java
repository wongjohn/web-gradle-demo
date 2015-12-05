package com.wiki.models.data.structure;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

/**
 * TableStructure.数据表的结构定义
 * 一个实体表示一张表。
 */
@Entity
@Table(name = "TABLE_STRUCTURE")
@XmlRootElement
public class TableStructure {
    /**
     * 结构表主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TABLE_ID")
    private Integer tableId;

    /**
     * 表名称
     */
    @Column(name = "TABLE_NAME")
    private String tableName;

    /**
     * 表中文名称
     */
    @Column(name = "CHINESE_NAME")
    private String chineseName;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 表中定义的各个列。
     */
    @OneToMany(mappedBy = "tableId", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private Set<ColumnStructure> columns = new HashSet<>();

    public TableStructure() {
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ColumnStructure> getColumns() {
        return columns;
    }

    public void setColumns(Set<ColumnStructure> columns) {
        this.columns = columns;
    }
}
