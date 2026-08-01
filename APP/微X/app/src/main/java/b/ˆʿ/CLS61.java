// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS93;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS61 extends SQLiteOpenHelper {
    public boolean FLD185;
    public boolean FLD186;
    public int FLD187;
    public boolean FLD188;

    // 此方法包含解密的字符串
    static {
        new String("ChatroomMod");
        new String("FKZ_WX_ChatroomMod");
        new String("CREATE TABLE ChatroomMod(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, TYPE INTEGER, CHATROOM TEXT, TIME TEXT, EXTRA TEXT)");
        new String("_ID");
        new String("ACCOUNT");
        new String("USERNAME");
        new String("CHATROOM");
        new String("TIME");
        new String("EXTRA");
        new String("TYPE");
    }

    // 此方法包含解密的字符串
    public CLS61(Context context0) {
        super(context0, "FKZ_WX_ChatroomMod", null, 1);
        new String("ACCOUNT = ? AND CHATROOM = ?");
        this.FLD187 = 0;
        this.FLD186 = false;
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE ChatroomMod(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, TYPE INTEGER, CHATROOM TEXT, TIME TEXT, EXTRA TEXT)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS ChatroomMod");
        this.onCreate(sQLiteDatabase0);
    }

    public final boolean MTH1302(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        if(!CLS371.FLD3470.MTH5337(s, s1)) {
            return false;
        }
        if(CLS27.MTH891(s1)) {
            return false;
        }
        try {
            if(this.MTH1321(4, s, s1) != null) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1303(String s, ArrayList arrayList0) {
        HashSet hashSet0 = new HashSet();
        for(Object object0: arrayList0) {
            String s1 = (String)object0;
            ArrayList arrayList1 = new ArrayList();
            if(!TextUtils.isEmpty(s)) {
                try {
                    CLS93 ⁱʾ0 = this.MTH1321(1, s1, s);
                    if(ⁱʾ0 != null) {
                        String s2 = ⁱʾ0.FLD394;
                        if(!TextUtils.isEmpty(s2)) {
                            JSONObject jSONObject0 = new JSONObject(s2);
                            if(jSONObject0.has("by")) {
                                JSONArray jSONArray0 = jSONObject0.getJSONArray("by");
                                for(int v = 0; v < jSONArray0.length(); ++v) {
                                    arrayList1.add(s1 + ":" + jSONArray0.getString(v));
                                }
                            }
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            hashSet0.addAll(arrayList1);
        }
        return new ArrayList(hashSet0);
    }

    public final boolean MTH1304(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        if(this.MTH1307(s1)) {
            return true;
        }
        try {
            return this.MTH1325(this.MTH1321(1, s, s1));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    public final boolean MTH1305() {
        return this.FLD186;
    }

    // 此方法包含解密的字符串
    public final void MTH1306(int v, String s, String s1, String s2, String s3) {
        String s4 = CLS27.MTH904();
        if(TextUtils.isEmpty(s4)) {
            return;
        }
        this.getWritableDatabase().insert("ChatroomMod", null, CLS61.MTH1323(v, s4, s, s1, s2, s3));
    }

    // 此方法包含解密的字符串
    public final boolean MTH1307(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        if(CLS502.MTH6934(CLS27.MTH882("wx_ban_id"), new String[]{s})) {
            return true;
        }
        try {
            return this.MTH1325(this.MTH1312(5, s));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH1308(SQLiteDatabase sQLiteDatabase0, String s, int v) {
        String s1 = CLS27.MTH904();
        return TextUtils.isEmpty(s1) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM ChatroomMod WHERE ACCOUNT = ? AND CHATROOM = ? AND TYPE = " + v, new String[]{s1, s});
    }

    public final ArrayList MTH1309(String s, ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            String s1 = (String)object0;
            if(this.MTH1304(s1, s)) {
                arrayList1.add(s1);
            }
        }
        return arrayList1;
    }

    // 此方法包含解密的字符串
    public final void MTH1310(String s, String s1) {
        this.MTH1344(1, s, s1, Long.toHexString(System.currentTimeMillis()), "");
    }

    // 此方法包含解密的字符串
    public final String MTH1311(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return "";
        }
        try {
            CLS93 ⁱʾ0 = this.MTH1321(1, s, s1);
            if(ⁱʾ0 == null) {
                return "";
            }
            String s2 = ⁱʾ0.FLD394;
            if(!TextUtils.isEmpty(s2)) {
                JSONObject jSONObject0 = new JSONObject(s2);
                if(jSONObject0.has("reason")) {
                    return jSONObject0.getString("reason");
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return "";
    }

    public final CLS93 MTH1312(int v, String s) {
        CLS93 ⁱʾ0 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        Cursor cursor0 = CLS61.MTH1322(this.getReadableDatabase(), s, v);
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.moveToFirst()) {
            ⁱʾ0 = CLS61.MTH1328(cursor0);
        }
        cursor0.close();
        return ⁱʾ0;
    }

    // 此方法包含解密的字符串
    public final JSONArray MTH1313() {
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        Cursor cursor0 = TextUtils.isEmpty(CLS27.MTH904()) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM ChatroomMod", null);
        ArrayList arrayList0 = new ArrayList();
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                while(true) {
                    arrayList0.add(CLS61.MTH1328(cursor0));
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: arrayList0) {
            jSONArray0.put(((CLS93)object0).MTH1751());
        }
        return jSONArray0;
    }

    public final boolean MTH1314(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        if(this.MTH1307(s)) {
            return true;
        }
        try {
            return this.MTH1325(this.MTH1312(1, s));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    public final void MTH1315(String s, String s1) {
        this.MTH1318(1, s, s1);
        this.MTH1318(3, s, s1);
    }

    public final HashSet MTH1316() {
        HashSet hashSet0 = new HashSet();
        Cursor cursor0 = CLS61.MTH1342(this.getReadableDatabase(), 5);
        if(cursor0 == null) {
            return hashSet0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                hashSet0.add(CLS61.MTH1328(cursor0).FLD396);
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return hashSet0;
    }

    public final void MTH1317(String s) {
        this.MTH1335(5, s);
        this.MTH1335(1, s);
        this.MTH1335(3, s);
    }

    // 此方法包含解密的字符串
    public final void MTH1318(int v, String s, String s1) {
        String s2 = CLS27.MTH904();
        if(TextUtils.isEmpty(s2)) {
            return;
        }
        this.getWritableDatabase().delete("ChatroomMod", "ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ? AND TYPE = " + v, new String[]{s2, s, s1});
    }

    // 此方法包含解密的字符串
    public final void MTH1319(String s, String s1, String s2) {
        String s3 = CLS27.MTH904();
        if(TextUtils.isEmpty(s3)) {
            return;
        }
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS27.MTH904());
        contentValues0.put("USERNAME", s1);
        contentValues0.put("CHATROOM", s);
        contentValues0.put("TYPE", 1);
        contentValues0.put("EXTRA", s2);
        sQLiteDatabase0.update("ChatroomMod", contentValues0, "ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ? AND TYPE = 1", new String[]{s3, s, s1});
    }

    public final boolean MTH1320(String s, ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            if(this.MTH1304(((String)object0), s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final CLS93 MTH1321(int v, String s, String s1) {
        CLS93 ⁱʾ0 = null;
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
            Cursor cursor0 = (v != 1 || !this.FLD185) && (v != 0 && v != 6 || !this.FLD188) ? CLS61.MTH1334(sQLiteDatabase0, s, s1, v) : CLS61.MTH1322(sQLiteDatabase0, s1, v);
            if(cursor0 == null) {
                return null;
            }
            if(cursor0.moveToFirst()) {
                ⁱʾ0 = CLS61.MTH1328(cursor0);
            }
            cursor0.close();
        }
        return ⁱʾ0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH1322(SQLiteDatabase sQLiteDatabase0, String s, int v) {
        String s1 = CLS27.MTH904();
        return TextUtils.isEmpty(s1) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM ChatroomMod WHERE ACCOUNT = ? AND USERNAME = ? AND TYPE = " + v, new String[]{s1, s});
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1323(int v, String s, String s1, String s2, String s3, String s4) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", s);
        contentValues0.put("USERNAME", s2);
        contentValues0.put("CHATROOM", s1);
        contentValues0.put("TYPE", v);
        contentValues0.put("TIME", s3);
        contentValues0.put("EXTRA", s4);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final long MTH1324(String s, String s1) {
        try {
            CLS93 ⁱʾ0 = this.MTH1321(1, s, s1);
            if(ⁱʾ0 == null) {
                return 0L;
            }
            if(TextUtils.isEmpty(ⁱʾ0.FLD397) || TextUtils.isEmpty(ⁱʾ0.FLD394)) {
                return 0L;
            }
            JSONObject jSONObject0 = new JSONObject(ⁱʾ0.FLD394);
            long v = Long.parseLong(ⁱʾ0.FLD397, 16);
            long v1 = Long.parseLong(jSONObject0.getString("time"), 16);
            return v1 == 0L ? 0L : v + v1;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return 0L;
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH1325(CLS93 ⁱʾ0) {
        if(ⁱʾ0 == null) {
            return false;
        }
        try {
            if(ⁱʾ0.FLD395 == 5) {
                return true;
            }
            if(!this.FLD186) {
                return true;
            }
            if(!TextUtils.isEmpty(ⁱʾ0.FLD397) && !TextUtils.isEmpty(ⁱʾ0.FLD394)) {
                JSONObject jSONObject0 = new JSONObject(ⁱʾ0.FLD394);
                long v = Long.parseLong(ⁱʾ0.FLD397, 16);
                String s = jSONObject0.getString("time");
                long v1 = TextUtils.isEmpty(s) ? 0L : Long.parseLong(s, 16);
                if(v1 == 0L) {
                    return true;
                }
                if(System.currentTimeMillis() >= v + v1) {
                    this.MTH1315(ⁱʾ0.FLD393, ⁱʾ0.FLD396);
                    return false;
                }
            }
            return true;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    public final void MTH1326(CLS93 ⁱʾ0) {
        this.MTH1344(ⁱʾ0.FLD395, ⁱʾ0.FLD393, ⁱʾ0.FLD396, ⁱʾ0.FLD397, ⁱʾ0.FLD394);
    }

    public final void MTH1327(String s, ArrayList arrayList0, String s1, String s2, String s3) {
        for(Object object0: arrayList0) {
            this.MTH1331(s, ((String)object0), s1, s2, s3);
        }
    }

    public static CLS93 MTH1328(Cursor cursor0) {
        String s = CLS182.MTH3472(4100884270149325621L, cursor0);
        String s1 = CLS182.MTH3472(4100884308804031285L, cursor0);
        String s2 = CLS182.MTH3472(4100884347458736949L, cursor0);
        String s3 = CLS182.MTH3472(4100884368933573429L, cursor0);
        return new CLS93(CLS182.MTH3490(4100884394703377205L, cursor0), s1, s, s2, s3);
    }

    public final ArrayList MTH1329() {
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = CLS61.MTH1342(this.getReadableDatabase(), 5);
        if(cursor0 == null) {
            return arrayList0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                CLS93 ⁱʾ0 = CLS61.MTH1328(cursor0);
                if(!hashSet0.contains(ⁱʾ0.FLD396)) {
                    arrayList0.add(ⁱʾ0);
                }
                hashSet0.add(ⁱʾ0.FLD396);
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final String MTH1330(String s, ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            String s1 = this.MTH1311(((String)object0), s);
            if(!TextUtils.isEmpty(s1)) {
                return s1;
            }
            if(false) {
                break;
            }
        }
        return "";
    }

    // 此方法包含解密的字符串
    public final void MTH1331(String s, String s1, String s2, String s3, String s4) {
        try {
            CLS93 ⁱʾ0 = this.MTH1321(1, s, s1);
            if(ⁱʾ0 != null && !TextUtils.isEmpty(ⁱʾ0.FLD394)) {
                String s5 = ⁱʾ0.FLD394;
                JSONObject jSONObject0 = TextUtils.isEmpty(s5) ? new JSONObject() : new JSONObject(s5);
                JSONArray jSONArray0 = jSONObject0.has("by") ? jSONObject0.getJSONArray("by") : new JSONArray();
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    if(jSONArray0.getString(v).equals(s2)) {
                        return;
                    }
                }
                jSONArray0.put(s2);
                if(this.FLD187 != 0 && jSONArray0.length() >= this.FLD187) {
                    jSONObject0.put("time", "0");
                }
                if(jSONArray0.length() > 0) {
                    jSONObject0.put("by", jSONArray0);
                }
                this.MTH1319(s, s1, jSONObject0.toString());
                return;
            }
            JSONObject jSONObject1 = new JSONObject();
            JSONArray jSONArray1 = new JSONArray();
            jSONArray1.put(s2);
            jSONObject1.put("by", jSONArray1);
            jSONObject1.put("time", s3);
            jSONObject1.put("reason", s4);
            this.MTH1306(1, s, s1, Long.toHexString(System.currentTimeMillis()), jSONObject1.toString());
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final boolean MTH1332(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        if(!CLS371.FLD3470.MTH5337(s, s1)) {
            return false;
        }
        if(CLS27.MTH891(s1)) {
            return false;
        }
        try {
            if(this.MTH1321(6, s, s1) != null) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH1333(String s, String s1) {
        this.MTH1344(2, s, s1, "", "");
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH1334(SQLiteDatabase sQLiteDatabase0, String s, String s1, int v) {
        String s2 = CLS27.MTH904();
        return TextUtils.isEmpty(s2) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM ChatroomMod WHERE ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ? AND TYPE = " + v, new String[]{s2, s, s1});
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH1335(int v, String s) {
        this.getWritableDatabase().delete("ChatroomMod", "ACCOUNT = ? AND USERNAME = ? AND TYPE = " + v, new String[]{CLS27.MTH904(), s});
    }

    public final long MTH1336(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return 0L;
        }
        try {
            CLS93 ⁱʾ0 = this.MTH1321(3, s, s1);
            return ⁱʾ0 == null ? 0L : Long.parseLong(ⁱʾ0.FLD397);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return 0L;
        }
    }

    public final boolean MTH1337(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        if(CLS27.MTH891(s1)) {
            return false;
        }
        try {
            if(this.MTH1321(2, s, s1) != null) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    public final ArrayList MTH1338(int v, String s) {
        Cursor cursor0;
        ArrayList arrayList0 = new ArrayList();
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        if(v != 0) {
            if(v != 1) {
                if(v == 2 || v == 4) {
                    cursor0 = CLS61.MTH1308(sQLiteDatabase0, s, 2);
                label_22:
                    if(cursor0 == null) {
                        return arrayList0;
                    }
                    HashSet hashSet0 = new HashSet();
                    if(cursor0.moveToFirst()) {
                        while(true) {
                            CLS93 ⁱʾ0 = CLS61.MTH1328(cursor0);
                            if(!hashSet0.contains(ⁱʾ0.FLD396)) {
                                hashSet0.add(ⁱʾ0.FLD396);
                                arrayList0.add(ⁱʾ0);
                            }
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                        }
                    }
                    cursor0.close();
                }
                else if(v == 6) {
                    cursor0 = this.FLD188 ? CLS61.MTH1342(sQLiteDatabase0, 2) : CLS61.MTH1308(sQLiteDatabase0, s, 2);
                    goto label_22;
                }
            }
            else if(this.FLD185) {
                cursor0 = CLS61.MTH1342(sQLiteDatabase0, 1);
                goto label_22;
            }
            else {
                cursor0 = CLS61.MTH1308(sQLiteDatabase0, s, 1);
                goto label_22;
            }
        }
        else if(this.FLD188) {
            cursor0 = CLS61.MTH1342(sQLiteDatabase0, 1);
            goto label_22;
        }
        else {
            cursor0 = CLS61.MTH1308(sQLiteDatabase0, s, 1);
            goto label_22;
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final boolean MTH1339(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        if(!CLS371.FLD3470.MTH5337(s, s1)) {
            return false;
        }
        if(!CLS27.MTH891(s1) && !CLS502.MTH6934(CLS27.MTH882("wx_ban_id"), new String[]{s1})) {
            if(this.MTH1332(s, s1)) {
                return true;
            }
            try {
                if(this.MTH1321(0, s, s1) != null) {
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return false;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH1340(String s, String s1) {
        this.MTH1344(0, s, s1, "", "");
    }

    public final long MTH1341(String s, ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            long v = this.MTH1324(((String)object0), s);
            if(v != 0L) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return 0L;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH1342(SQLiteDatabase sQLiteDatabase0, int v) {
        String s = CLS27.MTH904();
        return TextUtils.isEmpty(s) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM ChatroomMod WHERE ACCOUNT = ? AND TYPE = " + v, new String[]{s});
    }

    public final void MTH1343(JSONArray jSONArray0) {
        try {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                this.MTH1326(new CLS93(jSONArray0.getJSONObject(v)));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1344(int v, String s, String s1, String s2, String s3) {
        Cursor cursor0 = CLS61.MTH1334(this.getReadableDatabase(), s, s1, v);
        if(cursor0 == null) {
            this.MTH1306(v, s, s1, s2, s3);
            return;
        }
        int v1 = cursor0.getCount();
        cursor0.close();
        if(v1 > 0) {
            String s4 = CLS27.MTH904();
            if(!TextUtils.isEmpty(s4)) {
                this.getWritableDatabase().update("ChatroomMod", CLS61.MTH1323(v, s4, s, s1, s2, s3), "ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ? AND TYPE = " + v, new String[]{s4, s, s1});
            }
        }
        else {
            this.MTH1306(v, s, s1, s2, s3);
        }
    }
}

