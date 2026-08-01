// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.database.Cursor;
import android.os.Handler;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS52;
import b.ᐧˉ.CLS182;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS290 {
    public static final CLS290 FLD3007;
    public final ArrayDeque FLD3008;
    public final HashSet FLD3009;
    public final Handler FLD3010;
    public final CLS52 FLD3011;
    public final CLS291 FLD3012;
    public boolean FLD3013;
    public final HashMap FLD3014;

    static {
        CLS290.FLD3007 = new CLS290();
    }

    public CLS290() {
        this.FLD3013 = false;
        this.FLD3014 = new HashMap();
        this.FLD3008 = new ArrayDeque();
        this.FLD3009 = new HashSet();
        this.FLD3011 = new CLS52(CLS27.MTH900());
        this.FLD3010 = CLS40.FLD157.MTH1121();
        this.FLD3012 = new CLS291(2, this);
    }

    // 此方法包含解密的字符串
    public final String MTH4759(String s) {
        String s2;
        HashMap hashMap0 = this.FLD3014;
        if(hashMap0.containsKey(s)) {
            return (String)hashMap0.get(s);
        }
        String s1 = "";
        Cursor cursor0 = this.FLD3011.getReadableDatabase().rawQuery("SELECT * FROM RName WHERE USERNAME = ?", new String[]{s});
        if(cursor0 == null) {
            s2 = null;
        }
        else {
            if(cursor0.moveToFirst()) {
                s1 = CLS182.MTH3472(4100882779795673909L, cursor0);
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
            s2 = s1;
        }
        if(!TextUtils.isEmpty(s2)) {
            hashMap0.put(s, s2);
        }
        return s2;
    }

    public final void MTH4760(String s, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        if(!jSONObject0.has("receiver_true_name")) {
            return;
        }
        String s1 = jSONObject0.optString("receiver_true_name");
        this.FLD3014.put(s, s1);
        this.FLD3011.MTH1227(s, s1);
        this.FLD3009.remove(s);
    }

    public final void MTH4761() {
        this.FLD3010.removeCallbacks(this.FLD3012);
        if(this.FLD3008.isEmpty()) {
            this.FLD3013 = false;
            return;
        }
        CLS1229 ˆٴ0 = new CLS1229(3, this);
        CLS40.FLD157.MTH1123(((CLS39)ˆٴ0), 5000L);
    }
}

