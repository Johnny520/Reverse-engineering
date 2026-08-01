// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS21;
import b.ˈˈ.CLS78;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS976 implements CLS2 {
    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: arrayList0) {
                CLS78 ˊﾞ0 = (CLS78)object0;
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("username", "");
                    jSONObject0.put("nickname", "");
                    jSONObject0.put("alias", "");
                    jSONObject0.put("v1", ˊﾞ0.FLD273);
                    jSONArray0.put(jSONObject0);
                }
                catch(Throwable unused_ex) {
                }
            }
            CLS21.FLD76.MTH818("FriendReq_export", new Object[]{jSONArray0});
        }
    }
}

