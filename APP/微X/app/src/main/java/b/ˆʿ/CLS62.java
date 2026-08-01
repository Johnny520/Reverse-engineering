// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;

public final class CLS62 {
    public final CLS48 FLD189;
    public static final CLS62 FLD190;

    static {
        CLS62.FLD190 = new CLS62();
    }

    public CLS62() {
        this.FLD189 = new CLS48(CLS27.MTH900());
    }

    // 此方法包含解密的字符串
    public final void MTH1347(ContentValues contentValues0) {
        CLS48 ˊﾞ0 = this.FLD189;
        ˊﾞ0.getClass();
        String s = contentValues0.getAsString("SECRETKEY");
        String s1 = CLS27.MTH904();
        if(!TextUtils.isEmpty(s1)) {
            ˊﾞ0.getWritableDatabase().delete("ChatroomKeyInvite", "ACCOUNT = ?  AND SECRETKEY = ?", new String[]{s1, s});
        }
    }

    // 此方法包含解密的字符串
    public final ContentValues MTH1348(String s, String s1) {
        boolean z;
        CLS48 ˊﾞ0 = this.FLD189;
        Cursor cursor0 = ˊﾞ0.MTH1207(s);
        if(cursor0 == null) {
            z = false;
        }
        else {
            int v = cursor0.getCount();
            cursor0.close();
            z = v > 0;
        }
        if(z) {
            return null;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS27.MTH904());
        contentValues0.put("SECRETKEY", s);
        contentValues0.put("CREATE_TIME", System.currentTimeMillis());
        contentValues0.put("TAG", s1);
        contentValues0.put("IS_USED", 0);
        ˊﾞ0.MTH1211(contentValues0);
        return contentValues0;
    }
}

