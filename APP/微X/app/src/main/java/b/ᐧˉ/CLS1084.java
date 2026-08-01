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

public final class CLS1084 implements CLS3 {
    public final int FLD2340;
    public final CLS210 FLD2341;

    public CLS1084(CLS210 ˋʼ0, int v) {
        this.FLD2340 = v;
        this.FLD2341 = ˋʼ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS210 ˋʼ0 = this.FLD2341;
        switch(this.FLD2340) {
            case 0: {
                ˋʼ0.getClass();
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object0: ˋʼ0.FLD2010) {
                        jSONArray0.put(((CLS91)object0).MTH1733());
                    }
                    jSONObject0.put("wx_autoresponse", jSONArray0);
                    CLS31.MTH999(ˋʼ0.MTH3745(), jSONObject0.toString(), "wx_autoresponse.json");
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                Activity activity0 = ˋʼ0.MTH3745();
                CLS31.MTH991(activity0, ((CLS441)new CLS1135(ˋʼ0, activity0)));
                return;
            }
            case 2: {
                ˋʼ0.getClass();
                ˋʼ0.MTH3741(-1, CLS27.MTH889("add"));
                return;
            }
            case 3: {
                ˋʼ0.getClass();
                try {
                    if(!ˋʼ0.FLD1999 && ˋʼ0.FLD2011.MTH6895("multi_response") || ˋʼ0.FLD1998.equals("_MOMENT_POST_MESSAGE_")) {
                        ˋʼ0.MTH3743(-1, CLS27.MTH889("add_response"));
                        return;
                    }
                    ˋʼ0.MTH3742(-1, CLS27.MTH889("add_response"));
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 4: {
                ˋʼ0.FLD2007.MTH7277("#nudge");
                return;
            }
            case 5: {
                ˋʼ0.getClass();
                Object[] arr_object1 = {new CLS1051(ˋʼ0)};
                CLS21.FLD76.MTH818("selectImg2", arr_object1);
                return;
            }
            case 6: {
                ˋʼ0.getClass();
                Object[] arr_object2 = {new CLS1053(ˋʼ0)};
                CLS21.FLD76.MTH818("selectVid", arr_object2);
                return;
            }
            default: {
                ˋʼ0.getClass();
                Object[] arr_object = {new CLS1068(ˋʼ0)};
                CLS21.FLD76.MTH818("selectGif", arr_object);
            }
        }
    }
}

