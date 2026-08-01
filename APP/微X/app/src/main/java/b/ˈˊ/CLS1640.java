// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ᵔʾ.CLS280;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS443;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

public final class CLS1640 extends CLS587 {
    public long FLD454;

    public CLS1640() {
        this.FLD501 = 14;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS587
    public final void MTH1930(Activity activity0) {
        try {
            JSONObject jSONObject0 = this.FLD421.isEmpty() ? new JSONObject() : new JSONObject(((String)this.FLD421.get(0)));
            String s = CLS396.FLD3775.MTH5752(this.FLD454);
            if(!jSONObject0.has("content")) {
                jSONObject0.put("content", s);
            }
            CLS443.MTH6311(activity0, jSONObject0, new CLS1274(this, jSONObject0, 8), true);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS587
    public final JSONObject MTH1933() {
        JSONObject jSONObject0 = ((CLS587)this).super.MTH1933();
        try {
            jSONObject0.put("snsId", this.FLD454);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS587
    public final String MTH1934() {
        return CLS27.MTH889("sns_forward");
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS587
    public final void MTH1935(JSONObject jSONObject0) {
        ((CLS587)this).super.MTH1935(jSONObject0);
        try {
            this.FLD454 = jSONObject0.getLong("snsId");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS587
    public final void MTH1936() {
        int v1;
        ArrayList arrayList0 = this.FLD421;
        String s = "";
        String s1 = CLS396.FLD3775.MTH5752(this.FLD454);
        int v = 0;
        if(arrayList0 == null || arrayList0.isEmpty()) {
            v1 = 0;
        }
        else {
            try {
                JSONObject jSONObject0 = new JSONObject(((String)arrayList0.get(0)));
                if(jSONObject0.has("content")) {
                    s1 = jSONObject0.getString("content");
                }
                if(jSONObject0.has("shareType")) {
                    v = jSONObject0.getInt("shareType");
                }
                s = jSONObject0.has("userlist") ? jSONObject0.getString("userlist") : "";
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            v1 = v;
        }
        ArrayList arrayList1 = new ArrayList();
        if(v1 > 1) {
            arrayList1.addAll(Arrays.asList(CLS502.MTH6941(s)));
        }
        long v2 = this.FLD454;
        String s2 = CLS466.MTH6541(s1);
        ContentValues contentValues0 = CLS66.MTH1430(v2);
        CLS280.FLD2910.MTH4659(contentValues0, v2, s2, v1, null, arrayList1, null);
    }

    @Override  // b.ˈˊ.CLS587
    public final void MTH1938(Activity activity0) {
    }
}

