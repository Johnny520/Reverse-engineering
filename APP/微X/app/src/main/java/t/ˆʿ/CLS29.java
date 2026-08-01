// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashMap;
import t.ᵔʾ.CLS133;

public final class CLS29 {
    public static final HashMap FLD440;

    static {
        CLS29.FLD440 = new HashMap();
    }

    // 此方法包含解密的字符串
    public static boolean MTH1326(String s) {
        int v;
        if(!TextUtils.isEmpty(s)) {
            if(s.endsWith("@chatroom") || s.endsWith("@im.chatroom")) {
                return true;
            }
            if(!s.endsWith("@chatroom")) {
                return false;
            }
            HashMap hashMap0 = CLS29.FLD440;
            if(hashMap0.containsKey(s)) {
                Object object0 = hashMap0.get(s);
                return Boolean.TRUE.equals(object0);
            }
            CLS34.FLD463.getClass();
            try {
                Cursor cursor0 = CLS34.FLD463.MTH1364("SELECT chatroomStatus FROM chatroom WHERE chatroomname = ?", new String[]{s});
                if(cursor0 == null) {
                    goto label_20;
                }
                else {
                    v = cursor0.moveToFirst() ? cursor0.getInt(cursor0.getColumnIndex("chatroomStatus")) : 0;
                    if(!cursor0.isClosed()) {
                        cursor0.close();
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
                v = 0;
            }
            goto label_21;
        label_20:
            v = 0;
        label_21:
            boolean z = (v & 0x20000) == 0x20000;
            hashMap0.put(s, Boolean.valueOf(z));
            return z;
        }
        return false;
    }
}

