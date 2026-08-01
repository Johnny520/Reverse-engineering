// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS286;
import org.json.JSONObject;

public final class CLS590 extends CLS99 {
    public int FLD432;
    public String FLD433;
    public String FLD434;
    public String FLD435;

    public CLS590() {
        this.FLD501 = 15;
        this.FLD497 = true;
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1929() {
        return false;
    }

    @Override  // b.ˈˊ.CLS99
    public final void MTH1930(Activity activity0) {
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1931() {
        return false;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final JSONObject MTH1933() {
        JSONObject jSONObject0 = ((CLS99)this).super.MTH1933();
        try {
            jSONObject0.put("content", this.FLD435);
            jSONObject0.put("thumb", this.FLD434);
            jSONObject0.put("des", this.FLD433);
            jSONObject0.put("joinType", this.FLD432);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }

    // 去混淆评级： 低(35)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final String MTH1934() {
        String s = CLS27.MTH889("auto_accept_chatroom_invite");
        return TextUtils.isEmpty(this.FLD433) ? s : "<i>" + this.FLD433 + "</i><br><br>" + s;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final void MTH1935(JSONObject jSONObject0) {
        ((CLS99)this).super.MTH1935(jSONObject0);
        try {
            if(jSONObject0.has("content")) {
                this.FLD435 = jSONObject0.getString("content");
            }
            if(jSONObject0.has("des")) {
                this.FLD433 = jSONObject0.getString("des");
            }
            if(jSONObject0.has("thumb")) {
                this.FLD434 = jSONObject0.getString("thumb");
            }
            if(jSONObject0.has("joinType")) {
                this.FLD432 = jSONObject0.getInt("joinType");
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ˈˊ.CLS99
    public final void MTH1936() {
        if(TextUtils.isEmpty(this.FLD435)) {
            return;
        }
        CLS286.FLD2962.MTH4706(this.FLD432, this.FLD435);
    }

    @Override  // b.ˈˊ.CLS99
    public final void MTH1938(Activity activity0) {
    }
}

