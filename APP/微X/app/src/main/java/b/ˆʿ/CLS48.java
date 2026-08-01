// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import b.ʻˑ.CLS1;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˑٴ.CLS858;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS48 extends SQLiteOpenHelper {
    public static final int FLD168;

    // 此方法包含解密的字符串
    static {
        new String("ChatroomKeyInvite");
        new String("WX_ChatroomKeyInvite");
        new String("CREATE TABLE ChatroomKeyInvite(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, SECRETKEY TEXT, INVITED_TO_CHATROOM TEXT, USERNAME TEXT, TAG TEXT, CREATE_TIME INTEGER, USE_TIME INTEGER, IS_USED INTEGER)");
        new String("_ID");
        new String("ACCOUNT");
        new String("USERNAME");
        new String("SECRETKEY");
        new String("INVITED_TO_CHATROOM");
        new String("CREATE_TIME");
        new String("USE_TIME");
        new String("TAG");
        new String("IS_USED");
    }

    // 此方法包含解密的字符串
    public CLS48(Context context0) {
        super(context0, "WX_ChatroomKeyInvite", null, 1);
        new String("ACCOUNT = ? ");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE ChatroomKeyInvite(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, SECRETKEY TEXT, INVITED_TO_CHATROOM TEXT, USERNAME TEXT, TAG TEXT, CREATE_TIME INTEGER, USE_TIME INTEGER, IS_USED INTEGER)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS ChatroomKeyInvite");
        this.onCreate(sQLiteDatabase0);
    }

    // 此方法包含解密的字符串
    public final void MTH1206(ContentValues contentValues0, String s) {
        String s1 = CLS27.MTH904();
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        if(contentValues0.containsKey("_ID")) {
            contentValues0.remove("_ID");
        }
        if(contentValues0.containsKey("desc")) {
            contentValues0.remove("desc");
        }
        this.getWritableDatabase().update("ChatroomKeyInvite", contentValues0, "ACCOUNT = ?  AND SECRETKEY = ?", new String[]{s1, s});
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Cursor MTH1207(String s) {
        String s1 = CLS27.MTH904();
        return TextUtils.isEmpty(s1) ? null : this.getReadableDatabase().rawQuery("SELECT * FROM ChatroomKeyInvite WHERE ACCOUNT = ?  AND SECRETKEY = ?", new String[]{s1, s});
    }

    public static ContentValues MTH1208(Cursor cursor0) {
        ContentValues contentValues0 = null;
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.getCount() > 1) {
            contentValues0 = new ContentValues();
            if(cursor0.moveToFirst()) {
                contentValues0 = CLS48.MTH1210(cursor0);
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public static void MTH1209(Cursor cursor0, ArrayList arrayList0) {
        if(cursor0 == null) {
            return;
        }
        HashSet hashSet0 = new HashSet();
        if(cursor0.moveToFirst()) {
            while(true) {
                ContentValues contentValues0 = CLS48.MTH1210(cursor0);
                String s = contentValues0.getAsString("SECRETKEY");
                if(!hashSet0.contains(s)) {
                    hashSet0.add(s);
                    arrayList0.add(contentValues0);
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
    }

    // 去混淆评级： 低(32)
    // 此方法包含解密的字符串
    public static ContentValues MTH1210(Cursor cursor0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("_ID", cursor0.getInt(cursor0.getColumnIndex("_ID")));
        contentValues0.put("ACCOUNT", cursor0.getString(cursor0.getColumnIndex("ACCOUNT")));
        contentValues0.put("USERNAME", cursor0.getString(cursor0.getColumnIndex("USERNAME")));
        contentValues0.put("SECRETKEY", cursor0.getString(cursor0.getColumnIndex("SECRETKEY")));
        contentValues0.put("INVITED_TO_CHATROOM", cursor0.getString(cursor0.getColumnIndex("INVITED_TO_CHATROOM")));
        contentValues0.put("CREATE_TIME", cursor0.getLong(cursor0.getColumnIndex("CREATE_TIME")));
        contentValues0.put("USE_TIME", cursor0.getLong(cursor0.getColumnIndex("USE_TIME")));
        contentValues0.put("TAG", cursor0.getString(cursor0.getColumnIndex("TAG")));
        contentValues0.put("IS_USED", cursor0.getInt(cursor0.getColumnIndex("IS_USED")));
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final void MTH1211(ContentValues contentValues0) {
        if(TextUtils.isEmpty(CLS27.MTH904())) {
            return;
        }
        if(contentValues0.containsKey("_ID")) {
            contentValues0.remove("_ID");
        }
        if(contentValues0.containsKey("desc")) {
            contentValues0.remove("desc");
        }
        this.getWritableDatabase().insert("ChatroomKeyInvite", null, contentValues0);
    }

    // 此方法包含解密的字符串
    public final void MTH1212(String s, String s1, String s2) {
        ContentValues contentValues0 = CLS48.MTH1208(this.MTH1207(s2));
        contentValues0.put("USERNAME", s);
        contentValues0.put("INVITED_TO_CHATROOM", s1);
        contentValues0.put("USE_TIME", System.currentTimeMillis());
        contentValues0.put("IS_USED", 1);
        this.MTH1206(contentValues0, s2);
    }

    // 此方法包含解密的字符串
    public static void MTH1213(String s, String s1) {
        try {
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(s1);
                if(!CLS371.FLD3470.MTH5382(s1)) {
                    CLS372.MTH5399(s1, ((CLS1)new CLS858(s, arrayList0)));
                    return;
                }
                CLS66.MTH1425(s, "", "wx2", arrayList0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

