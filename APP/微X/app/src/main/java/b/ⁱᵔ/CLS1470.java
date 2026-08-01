// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1470 implements CLS16 {
    public final int FLD4381;
    public final CLS369 FLD4382;
    public final ArrayList FLD4383;

    public CLS1470(int v, CLS369 ﾞᵎ0, ArrayList arrayList0) {
        this.FLD4381 = v;
        this.FLD4383 = arrayList0;
        this.FLD4382 = ﾞᵎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS369 ﾞᵎ0 = this.FLD4382;
        ArrayList arrayList0 = this.FLD4383;
        switch(this.FLD4381) {
            case 0: {
                if(!TextUtils.isEmpty(s)) {
                    arrayList0.add(s);
                    ﾞᵎ0.notifyDataSetChanged();
                    CLS27.MTH895().MTH922(TextUtils.join(",", arrayList0), "hidden_chat_menu_items");
                }
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(s)) {
                    String s1 = s.trim();
                    if(!arrayList0.contains(s1)) {
                        arrayList0.add(s1);
                        ﾞᵎ0.notifyDataSetChanged();
                    }
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    arrayList0.add(s);
                    ﾞᵎ0.notifyDataSetChanged();
                    try {
                        JSONObject jSONObject0 = CLS27.MTH895().MTH921("invite_key_tags");
                        jSONObject0.put(s, "");
                        CLS27.MTH895().MTH922(jSONObject0, "invite_key_tags");
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
    }
}

