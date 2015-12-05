package com.wiki.models.data.structure;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * DataStructureNode.
 * 各个表在以树形表示时，各个节点，分别挂靠各个表。
 */
@Entity
@Table(name = "DATA_STRUCTURE_NODE")
@XmlRootElement
public class DataStructureNode {
    /**
     * 节点Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NODE_ID")
    @NotNull
    private Integer nodeId;

    /**
     * 节点名称
     */
    @Column(name = "NODE_NAME")
    @NotNull
    private String nodeName;

    /**
     * 父节点Id
     */
    @Column(name = "PARENT_ID")
    private Integer parentId;

    /**
     * 节点多对应的表
     */
    @Column(name = "TABLE_ID")
    private Integer tableId;

    public DataStructureNode() {
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }
}
