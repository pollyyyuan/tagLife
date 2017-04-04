package me.yuanye.taglife;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import me.yuanye.taglife.target.GoalModel;

public class DBHelper extends OrmLiteSqliteOpenHelper {

    private final static String DB_NAME = "tag_life.db";

    private final static int DB_VERSION = 1;

    private DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, GoalModel.class);
        } catch (SQLException e) {
            Log.e("数据库", "创建数据库失败", e);
        }
    }

    private static DBHelper instance;

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            TableUtils.dropTable(connectionSource, GoalModel.class, true);
        } catch (Exception e) {
            Log.e("数据库", "更新数据库失败", e);
        }
    }

    public static synchronized DBHelper getInstance(Context context) {
        context = context.getApplicationContext();
        if (instance == null) {
            synchronized (DBHelper.class) {
                if (instance == null) {
                    instance = new DBHelper(context);
                }
            }
        }
        return instance;
    }


}
