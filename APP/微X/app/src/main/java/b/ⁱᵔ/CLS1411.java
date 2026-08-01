// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˑٴ.CLS110;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1411 implements CLS3 {
    public final int FLD4047;
    public final CLS335 FLD4048;
    public final ArrayList FLD4049;

    public CLS1411(int v, CLS335 ˑٴ0, ArrayList arrayList0) {
        this.FLD4047 = v;
        this.FLD4049 = arrayList0;
        this.FLD4048 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS335 ˑٴ0 = this.FLD4048;
        ArrayList arrayList0 = this.FLD4049;
        switch(this.FLD4047) {
            case 0: {
                try {
                    String s = CLS31.MTH998(CLS25.MTH867(1, "DisableWxid.json"));
                    if(!TextUtils.isEmpty(s)) {
                        JSONArray jSONArray0 = new JSONArray(s);
                        arrayList0.clear();
                        for(int v = 0; true; ++v) {
                            if(v >= jSONArray0.length()) {
                                ˑٴ0.MTH5111(arrayList0);
                                return;
                            }
                            try {
                                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                                ContentValues contentValues0 = new ContentValues();
                                contentValues0.put("wxid", jSONObject0.getString("wxid"));
                                contentValues0.put("nickname", jSONObject0.getString("nickname"));
                                contentValues0.put("desc", jSONObject0.getString("wxid") + "<br>" + jSONObject0.getString("nickname"));
                                arrayList0.add(contentValues0);
                            }
                            catch(Throwable throwable2) {
                                CLS27.MTH893(throwable2);
                            }
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                Collections.reverse(arrayList0);
                ˑٴ0.notifyDataSetChanged();
                return;
            }
            case 2: {
                try {
                    Collections.sort(arrayList0, Comparator.comparing(new CLS521(2)));
                    ˑٴ0.notifyDataSetChanged();
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 3: {
                try {
                    Collections.sort(arrayList0, new CLS110(4));
                    ˑٴ0.notifyDataSetChanged();
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 4: {
                try {
                    Collections.sort(arrayList0, new CLS110(6));
                    ˑٴ0.notifyDataSetChanged();
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            default: {
                try {
                    Collections.sort(arrayList0, new CLS110(5));
                    ˑٴ0.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

