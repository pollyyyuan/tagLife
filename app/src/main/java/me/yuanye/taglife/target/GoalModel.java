package me.yuanye.taglife.target;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.sql.Date;

@DatabaseTable(tableName = "t_goal")
public class GoalModel implements Serializable {

    /**
     * id
     */
    @DatabaseField(generatedId = true)
    private long id;

    /**
     * 目标名称
     */
    @DatabaseField
    private String name;

    /**
     * 制定时间
     */
    @DatabaseField
    private Date makeTime;

    /**
     * 预计完成时间
     */
    @DatabaseField
    private Date expectTime;

    /**
     * 内容
     */
    @DatabaseField
    private String content;

    /**
     * 计划
     */
    @DatabaseField
    private String plan;

    /**
     * 计划执行周期
     */
    @DatabaseField
    private String cycle;

    /**
     * 完成时间
     */
    @DatabaseField
    private Date finishTime;

    /**
     * 月份
     */
    @DatabaseField
    private String monthNum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMakeTime() {
        return makeTime;
    }

    public void setMakeTime(Date makeTime) {
        this.makeTime = makeTime;
    }

    public Date getExpectTime() {
        return expectTime;
    }

    public void setExpectTime(Date expectTime) {
        this.expectTime = expectTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(String monthNum) {
        this.monthNum = monthNum;
    }
}
