// Decompiled by JEB v5.42.0.202606242140

package b.ᐧⁱ;

import android.text.TextUtils;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS14;
import b.ʾᵢ.CLS27;
import b.ˊﾞ.CLS612;
import b.ᵔʾ.CLS1259;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423;
import b.ⁱᵔ.CLS426;
import org.json.JSONObject;

public final class CLS1218 implements CLS14 {
    @Override  // b.ʻˑ.CLS14
    public final void MTH793(String s, String s1, String s2, String s3, CLS10 ᐧˉ0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s4 = CLS27.MTH895().MTH925("chatgpt_for_bot_url", "");
        if(TextUtils.isEmpty(s4)) {
            return;
        }
        if(s4.endsWith("/")) {
            s4 = s4.substring(0, s4.length() - 1);
        }
        CLS423 ˊⁱ0 = new CLS423(s4 + "/v2/chat");
        ˊⁱ0.FLD4072 = CLS27.MTH895().MTH927(30000, "chatgpt_for_bot_read_timeout");
        ˊⁱ0.FLD4076 = CLS27.MTH895().MTH927(30000, "chatgpt_for_bot_connection_timeout");
        ˊⁱ0.FLD4078 = "POST";
        ˊⁱ0.FLD4085 = true;
        ˊⁱ0.MTH6077("Content-Type", "application/json");
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("session_id", (CLS426.MTH6126(s1) ? "chatroom-" : "friend-") + s1);
            jSONObject0.put("username", s3);
            jSONObject0.put("message", s);
            jSONObject0.put("user_id", s2);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        ˊⁱ0.FLD4074 = jSONObject0;
        ˊⁱ0.MTH6078(((CLS420)new CLS1259(this, s4, ᐧˉ0, 4)));
    }

    public final void MTH4618(CLS10 ᐧˉ0, String s, String s1) {
        CLS423 ˊⁱ0 = new CLS423(s + "/v2/chat/response");
        ˊⁱ0.FLD4072 = CLS27.MTH895().MTH927(30000, "chatgpt_for_bot_read_timeout");
        ˊⁱ0.FLD4076 = CLS27.MTH895().MTH927(30000, "chatgpt_for_bot_connection_timeout");
        ˊⁱ0.FLD4078 = "GET";
        ˊⁱ0.FLD4085 = true;
        ˊⁱ0.FLD4080.put("request_id", s1);
        ˊⁱ0.MTH6078(((CLS420)new CLS612(this, s, s1, ᐧˉ0, 2)));
    }
}

