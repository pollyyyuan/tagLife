package me.yuanye.taglife.target;

import com.j256.ormlite.table.DatabaseTable;

import java.sql.Date;

@DatabaseTable(tableName = "goal")
public class GoalModel {

    /**
     * id
     */
    private long id;

    /**
     * 目标名称
     */
    private String name;

    /**
     * 制定时间
     */
    private String makeTime;

    /**
     * 预计完成时间
     */
    private Date expectTime;

    /**
     * 内容
     */
    private String content;

    /**
     * 计划
     */
    private String plan;

    /**
     * 计划执行周期
     */
    private String cycle;

    /**
     * 完成时间
     */
    private String finishTime;

    /**
     * 月份
     */
    private String monthNum;

}
