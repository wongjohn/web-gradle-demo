package com.wiki.models.data.structure;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * ColumnStructure.数据表各个字段的定义。
 * 一张表，可以有多个字段。
 */
@Entity
@Table(name = "COLUMN_STRUCTURE")
@IdClass(ColumnStructurePK.class)
@XmlRootElement
public class ColumnStructure {
    /**
     * 隶属的结构表
     */
    @Id
    @JoinColumn(name = "TABLE_ID")
    @ManyToOne
    @NotNull
    private TableStructure tableId;

    /**
     * 序号
     */
    @Id
    @Column(name = "COLUMN_SEQ")
    @NotNull
    private Integer columnSeq;

    /**
     * 字段中文名称
     */
    @Column(name = "COLUMN_CHINESE_NAME")
    private String columnChineseName;

    /**
     * 字段名
     */
    @Column(name = "COLUMN_NAME")
    private String columnName;

    /**
     * 类型
     */
    @Column(name = "COLUMN_DATA_TYPE")
    private String columnDataType;

    /**
     * 长度
     */
    @Column(name = "COLUMN_LENGTH")
    private Integer columnLength;

    /**
     * 不允许为空
     */
    @Column(name = "NOT_ENABLE_NULL")
    private Integer notEnableNull;

    /**
     * 说明
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 默认
     */
    @Column(name = "DEFAULT_VALUE")
    private String defaultValue;

    public ColumnStructure() {
    }

    @XmlTransient
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

    public String getColumnChineseName() {
        return columnChineseName;
    }

    public void setColumnChineseName(String columnChineseName) {
        this.columnChineseName = columnChineseName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnDataType() {
        return columnDataType;
    }

    public void setColumnDataType(String columnDataType) {
        this.columnDataType = columnDataType;
    }

    public Integer getColumnLength() {
        return columnLength;
    }

    public void setColumnLength(Integer columnLength) {
        this.columnLength = columnLength;
    }

    public Integer getNotEnableNull() {
        return notEnableNull;
    }

    public void setNotEnableNull(Integer notEnableNull) {
        this.notEnableNull = notEnableNull;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
