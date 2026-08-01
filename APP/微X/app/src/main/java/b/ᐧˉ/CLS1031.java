// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS309;
import b.ⁱʾ.CLS329;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS525;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1031 implements CLS378, CLS379, CLS441 {
    public final CLS1078 FLD2139;
    public final Activity FLD2140;

    public CLS1031(CLS1078 ـˆ0, Activity activity0) {
        this.FLD2139 = ـˆ0;
        this.FLD2140 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS1078 ـˆ0 = this.FLD2139;
        ـˆ0.getClass();
        Activity activity0 = this.FLD2140;
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1083(ـˆ0, activity0, 0)));
        if(ـˆ0.FLD2153.MTH6895("scheduled_task")) {
            ʻˑ0.MTH7187("import_", ((CLS3)new CLS1083(ـˆ0, activity0, 1)));
            ʻˑ0.MTH7187("export_", ((CLS3)new CLS1083(ـˆ0, activity0, 2)));
            ʻˑ0.MTH7187("add_task", ((CLS3)new CLS1212(ـˆ0, 1)));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS442$CLS441
    public final void MTH6222(InputStream inputStream0) {
        CLS309 ⁱʾ0;
        Activity activity0 = this.FLD2140;
        CLS1078 ـˆ0 = this.FLD2139;
        ـˆ0.getClass();
        try {
            String s = CLS31.MTH998(inputStream0);
            if(TextUtils.isEmpty(s)) {
                return;
            }
            else {
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    if(jSONObject0.has("wx_tasks")) {
                        JSONArray jSONArray0 = jSONObject0.getJSONArray("wx_tasks");
                        try {
                            for(int v = 0; true; ++v) {
                                int v1 = jSONArray0.length();
                                ⁱʾ0 = ـˆ0.FLD2313;
                                if(v >= v1) {
                                    break;
                                }
                                JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                                ⁱʾ0.getClass();
                                ⁱʾ0.MTH4941(CLS309.MTH4942(jSONObject1));
                            }
                            ـˆ0.FLD2314.clear();
                            ⁱʾ0.getClass();
                            ArrayList arrayList0 = CLS309.MTH4938();
                            ـˆ0.FLD2314.addAll(arrayList0);
                            ـˆ0.FLD2317.notifyDataSetChanged();
                        }
                        catch(Throwable throwable2) {
                            CLS27.MTH893(throwable2);
                        }
                        CLS412.MTH6013(activity0, CLS27.MTH889("import_done"));
                        return;
                    }
                    return;
                }
                catch(Throwable throwable1) {
                }
            }
            CLS27.MTH893(throwable1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        this.FLD2139.getClass();
        CLS1624 יﹳ0 = new CLS1624(this.FLD2140);
        this.FLD2139.FLD2314.clear();
        this.FLD2139.FLD2313.getClass();
        ArrayList arrayList0 = CLS309.MTH4938();
        this.FLD2139.FLD2314.addAll(arrayList0);
        this.FLD2139.FLD2317 = new CLS329(this.FLD2140, this.FLD2139.FLD2314);
        יﹳ0.FLD5274 = new CLS1229(24, this.FLD2139);
        יﹳ0.MTH7302();
        יﹳ0.MTH7311();
        יﹳ0.MTH7303(this.FLD2139.FLD2317);
        יﹳ0.MTH7308(4);
        יﹳ0.MTH7301(new CLS249(3, this.FLD2139));
        יﹳ0.MTH7305(new CLS220(1, this.FLD2140, this.FLD2139));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}

