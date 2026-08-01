// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS404;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class CLS595 extends CLS99 {
    public final ArrayList FLD449;

    public CLS595() {
        this.FLD449 = new ArrayList();
        this.FLD501 = 1;
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1929() {
        return true;
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
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: this.FLD449) {
                jSONArray0.put(((String)object0));
            }
            jSONObject0.put("target", jSONArray0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public String MTH1934() {
        return CLS27.MTH889("mass_delete_msg");
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final void MTH1935(JSONObject jSONObject0) {
        ((CLS99)this).super.MTH1935(jSONObject0);
        try {
            if(jSONObject0.has("target")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("target");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    this.MTH1827(jSONArray0.getString(v));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public void MTH1827(String s) {
        ArrayList arrayList0 = this.FLD449;
        if(!arrayList0.contains(s) && !CLS404.MTH5909(s)) {
            arrayList0.add(s);
        }
    }

    @Override  // b.ˈˊ.CLS99
    public void MTH1936() {
        CLS66.MTH1500(this.FLD449, null);
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public void MTH1938(Activity activity0) {
        public final class CLS594 implements CLS2 {
            public final CLS595 FLD448;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS595 ˊﾞ0 = CLS595.this;
                ˊﾞ0.FLD449.clear();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    ˊﾞ0.MTH1827("");
                }
            }
        }

        HashSet hashSet0 = new HashSet();
        String s = CLS27.MTH904();
        CLS371.FLD3470.MTH5314(s, hashSet0);
        CLS387.MTH5585(false, activity0, CLS372.MTH5414(hashSet0), ((CLS2)new CLS594(this)), TextUtils.join(",", this.FLD449), -1);
    }
}

