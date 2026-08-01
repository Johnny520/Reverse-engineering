// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS91;
import b.ⁱᵔ.CLS442.CLS441;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1133 implements CLS3 {
    public final int FLD2563;
    public final CLS244 FLD2564;

    public CLS1133(CLS244 ᴵʻ0, int v) {
        this.FLD2563 = v;
        this.FLD2564 = ᴵʻ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS244 ᴵʻ0 = this.FLD2564;
        switch(this.FLD2563) {
            case 0: {
                ᴵʻ0.getClass();
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object0: ᴵʻ0.FLD2545) {
                        jSONArray0.put(((CLS91)object0).MTH1733());
                    }
                    jSONObject0.put("wx_autoresponse", jSONArray0);
                    CLS31.MTH999(ᴵʻ0.MTH4269(), jSONObject0.toString(), "wx_k_autoresponse.json");
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                Activity activity0 = ᴵʻ0.MTH4269();
                CLS31.MTH991(activity0, ((CLS441)new CLS1055(ᴵʻ0, activity0)));
                return;
            }
            case 2: {
                ᴵʻ0.getClass();
                try {
                    if(ᴵʻ0.FLD2538.MTH6895("multi_response")) {
                        ᴵʻ0.MTH4263(null, CLS27.MTH889("add_keyword"));
                        return;
                    }
                    ᴵʻ0.MTH4270(null, CLS27.MTH889("add_keyword"));
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 3: {
                ᴵʻ0.FLD2540.MTH7277("#nudge");
                return;
            }
            case 4: {
                ᴵʻ0.getClass();
                Object[] arr_object1 = {new CLS944(ᴵʻ0)};
                CLS21.FLD76.MTH818("selectImg2", arr_object1);
                return;
            }
            case 5: {
                ᴵʻ0.getClass();
                Object[] arr_object2 = {new CLS1081(ᴵʻ0)};
                CLS21.FLD76.MTH818("selectVid", arr_object2);
                return;
            }
            default: {
                ᴵʻ0.getClass();
                Object[] arr_object = {new CLS1072(ᴵʻ0)};
                CLS21.FLD76.MTH818("selectGif", arr_object);
            }
        }
    }
}

