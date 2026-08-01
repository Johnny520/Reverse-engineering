// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1622;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class CLS956 implements CLS16 {
    public final int FLD1847;
    public final CLS1622 FLD1848;
    public final JSONObject FLD1849;

    public CLS956(CLS1622 ˑٴ0, JSONObject jSONObject0) {
        this.FLD1847 = 0;
        super();
        this.FLD1848 = ˑٴ0;
        this.FLD1849 = jSONObject0;
    }

    public CLS956(JSONObject jSONObject0, CLS1622 ˑٴ0) {
        this.FLD1847 = 1;
        super();
        this.FLD1849 = jSONObject0;
        this.FLD1848 = ˑٴ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        String s1 = "";
        JSONObject jSONObject0 = this.FLD1849;
        CLS1622 ˑٴ0 = this.FLD1848;
        if(this.FLD1847 == 0) {
            try {
                HashSet hashSet0 = new HashSet();
                String s2 = ˑٴ0.MTH7285();
                if(!TextUtils.isEmpty(s2)) {
                    hashSet0.addAll(Arrays.asList(s2.split(Pattern.quote("|"))));
                }
                hashSet0.add(s);
                String s3 = TextUtils.join("|", hashSet0);
                jSONObject0.put("auto_kick_keyword_text", s3);
                ˑٴ0.MTH7277(s3);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            if(jSONObject0.optBoolean("grab_red_packet_filter_onlyopen_enable", false)) {
                s1 = jSONObject0.optString("red_packet_filter_onlyopen_text", "");
            }
            else if(jSONObject0.optBoolean("grab_red_packet_filter_notopen_enable", false)) {
                s1 = jSONObject0.optString("red_packet_filter_text", "");
            }
            HashSet hashSet1 = new HashSet();
            if(!TextUtils.isEmpty(s1)) {
                hashSet1.addAll(Arrays.asList(s1.split(Pattern.quote("|"))));
            }
            hashSet1.add(s);
            String s4 = TextUtils.join("|", hashSet1);
            if(jSONObject0.optBoolean("grab_red_packet_filter_onlyopen_enable", false)) {
                jSONObject0.put("red_packet_filter_onlyopen_text", s4);
                CLS21.FLD76.MTH818("rp_update_filter_onlyopen", new Object[0]);
            }
            else if(jSONObject0.optBoolean("grab_red_packet_filter_notopen_enable", false)) {
                jSONObject0.put("red_packet_filter_text", s4);
                CLS21.FLD76.MTH818("rp_update_filter_notopen", new Object[0]);
            }
            ˑٴ0.MTH7277(s4);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

