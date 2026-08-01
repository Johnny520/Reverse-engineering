// Decompiled by JEB v5.42.0.202606242140

package b.ᐧⁱ;

import android.text.TextUtils;
import b.ʻˑ.CLS10;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423.CLS422;
import b.ⁱᵔ.CLS423;
import org.json.JSONObject;

public final class CLS1224 implements CLS278, CLS420 {
    public final CLS1223 FLD2903;
    public final CLS10 FLD2904;
    public final String FLD2905;

    public CLS1224(CLS1223 ﾞٴ0, String s, CLS10 ᐧˉ0) {
        this.FLD2903 = ﾞٴ0;
        this.FLD2905 = s;
        this.FLD2904 = ᐧˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS423$CLS420
    public final void MTH6065(CLS422 ˊⁱ$ᵔʾ0) {
        String s = this.FLD2905;
        CLS1223 ﾞٴ0 = this.FLD2903;
        ﾞٴ0.getClass();
        byte[] arr_b = ˊⁱ$ᵔʾ0.FLD4069;
        if(arr_b != null) {
            try {
                String s1 = new String(arr_b);
                JSONObject jSONObject0 = new JSONObject(s1);
                boolean z = jSONObject0.has("errcode");
                CLS10 ᐧˉ0 = this.FLD2904;
                if(z) {
                    if(jSONObject0.getInt("errcode") == 1005) {
                        ﾞٴ0.FLD2900 = "";
                        ﾞٴ0.FLD2902 = System.currentTimeMillis();
                        ﾞٴ0.MTH4632(s, ᐧˉ0);
                        return;
                    }
                    CLS412.MTH6011(jSONObject0.getString("errmsg"));
                    return;
                }
                if(jSONObject0.has("answer")) {
                    ᐧˉ0.MTH788(ﾞٴ0.MTH4633(s1));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4636(String s) {
        CLS1223 ﾞٴ0 = this.FLD2903;
        ﾞٴ0.getClass();
        if(!TextUtils.isEmpty(s)) {
            CLS423 ˊⁱ0 = new CLS423(CLS27.MTH882("weixin_aibot_query_url") + ﾞٴ0.FLD2899);
            ˊⁱ0.FLD4072 = CLS27.MTH895().MTH927(15000, "weixinbot_read_timeout");
            ˊⁱ0.FLD4076 = CLS27.MTH895().MTH927(15000, "weixinbot_connection_timeout");
            ˊⁱ0.FLD4078 = "POST";
            ˊⁱ0.FLD4080.put("signature", s);
            ˊⁱ0.FLD4080.put("query", this.FLD2905);
            ˊⁱ0.FLD4085 = true;
            ˊⁱ0.MTH6078(((CLS420)new CLS1224(ﾞٴ0, this.FLD2905, this.FLD2904)));
        }
    }
}

