// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS91;
import b.ᐧˉ.CLS182;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS880 implements CLS39 {
    public final int FLD1483;
    public final String FLD1484;
    public final String FLD1485;
    public final CLS794 FLD1486;
    public final String FLD1487;

    public CLS880(CLS794 ᴵʽ0, String s, String s1, String s2, int v) {
        this.FLD1483 = v;
        this.FLD1486 = ᴵʽ0;
        this.FLD1485 = s;
        this.FLD1487 = s1;
        this.FLD1484 = s2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        String s3;
        CLS794 ᴵʽ0 = this.FLD1486;
        if(this.FLD1483 == 0) {
            String s = this.FLD1485;
            String s1 = this.FLD1487;
            String s2 = this.FLD1484;
            ᴵʽ0.getClass();
            if(CLS27.MTH890("chatroomMemberInviterField")) {
                Object object0 = CLS66.MTH1505(s);
                if(object0 == null) {
                    s3 = null;
                }
                else {
                    Map map0 = CLS66.MTH1403(object0);
                    if(map0 == null || !CLS27.MTH890("chatroomMemberInviterField")) {
                        s3 = null;
                    }
                    else {
                        Object object1 = map0.get(s1);
                        s3 = object1 == null ? null : ((String)CLS182.MTH3492(0x38EA3B002B3CD335L, object1));
                    }
                }
            }
            else {
                s3 = null;
            }
            if(!TextUtils.isEmpty(s3)) {
                CLS682 ˈˊ0 = new CLS682(ᴵʽ0, s, s3, s1, CLS66.MTH1452(s, s3), s2, 0);
                CLS40.FLD157.MTH1124(((CLS39)ˈˊ0));
                return;
            }
            ᴵʽ0.MTH2697(s, s1);
            return;
        }
        String s4 = this.FLD1485;
        String s5 = this.FLD1487;
        String s6 = this.FLD1484;
        if(ᴵʽ0.FLD1447.FLD1438.MTH6895("multi_response")) {
            boolean z = TextUtils.isEmpty(s4);
            Class class0 = CLS44.class;
            if(!z) {
                ((CLS44)CLS40.FLD157.MTH1118(class0)).MTH1180("_CHATROOM_INTRO_" + s5);
                String s7 = CLS34.MTH1079(0x38EC95892B3CD335L, new StringBuilder(), s5, 4101817845715620661L);
                ᴵʽ0.FLD1445.MTH922("", s7);
                try {
                    JSONArray jSONArray0 = new JSONArray();
                    JSONObject jSONObject0 = new JSONObject();
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("checked", true);
                    jSONObject1.put("type", 1);
                    jSONObject1.put("desc", s4);
                    jSONObject1.put("msg", s4);
                    jSONArray0.put(jSONObject1);
                    jSONObject0.put("response", jSONArray0);
                    CLS27.MTH904();
                    CLS91 ᵔʾ0 = new CLS91(1, "", jSONObject0.toString(), "_CHATROOM_INTRO_" + s5);
                    ((CLS44)CLS40.FLD157.MTH1118(class0)).MTH1182(ᵔʾ0);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            CLS91 ᵔʾ1 = ((CLS44)CLS40.FLD157.MTH1118(class0)).MTH1184("_CHATROOM_INTRO_" + s5);
            if(ᵔʾ1 != null) {
                String s8 = ᵔʾ1.MTH1735();
                ᴵʽ0.FLD1447.MTH3021(s8, s5, s6, "\n", true);
            }
        }
        else if(!TextUtils.isEmpty(s4)) {
            ᴵʽ0.FLD1447.MTH3021(s4, s5, s6, "\n", true);
        }
    }
}

