package me.yuanye.taglife.target;


import android.content.Context;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import me.yuanye.taglife.DBHelper;

public class GoalDao {

    private Dao<GoalModel, Integer> dao;

    private DBHelper db;

    public GoalDao(Context context) {
        db = DBHelper.getInstance(context);
        try {
            dao = db.getDao(GoalModel.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(GoalModel goalModel) {
        try {
            dao.create(goalModel);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
