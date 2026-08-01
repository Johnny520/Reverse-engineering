// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS91;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1073 implements CLS11 {
    public final CLS210 FLD2301;

    public CLS1073(CLS210 ˋʼ0) {
        this.FLD2301 = ˋʼ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS210 ˋʼ0 = this.FLD2301;
        Iterator iterator0 = ˋʼ0.FLD2010.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ˋʼ0.FLD2001.MTH1174(((CLS91)object0));
            String s = ((CLS91)object0).MTH1735();
            if(s.startsWith("#img")) {
                ˋʼ0.FLD2002.MTH1252(s.substring(s.indexOf(" ")).trim());
            }
            else if(s.startsWith("{")) {
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    if(jSONObject0.has("response")) {
                        JSONArray jSONArray0 = jSONObject0.getJSONArray("response");
                        for(int v = 0; v < jSONArray0.length(); ++v) {
                            String s1 = jSONArray0.getJSONObject(v).getString("msg");
                            if(s1.startsWith("#img")) {
                                ˋʼ0.FLD2002.MTH1252(s1.substring(s1.indexOf(" ")).trim());
                            }
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            iterator0.remove();
        }
        ˋʼ0.FLD2020.notifyDataSetChanged();
    }
}

