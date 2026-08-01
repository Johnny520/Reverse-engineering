// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import d.יʻ.CLS69;
import d.ᐧˏ.CLS108;
import d.ⁱٴ.CLS123;
import org.json.JSONObject;

public final class CLS136 implements CLS123 {
    public final int[] FLD113;
    public final int FLD114;

    public CLS136(int v, int[] arr_v) {
        this.FLD114 = v;
        this.FLD113 = arr_v;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        int v = this.FLD113[0];
        String s = "";
        int v1 = this.FLD114;
        switch(v1) {
            case 1: {
                if(v == 2) {
                    s = CLS108.MTH1103(0xFFFF4C1E2DFB3E45L);
                }
                break;
            }
            case 2: {
                if(v == 2) {
                    s = CLS108.MTH1103(0xFFFF4C0D2DFB3E45L);
                }
                break;
            }
            case 3: {
                if(v == 2) {
                    s = CLS108.MTH1103(0xFFFF4C002DFB3E45L);
                }
                break;
            }
            case 101: {
                if(v == 2) {
                    s = CLS108.MTH1103(0xFFFF4C372DFB3E45L);
                }
                break;
            }
            case 104: {
                if(v == 2) {
                    s = CLS108.MTH1103(0xFFFF4C2A2DFB3E45L);
                }
            }
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("d", Long.toHexString(System.currentTimeMillis()));
            jSONObject0.put("wxid", CLS69.MTH805());
            jSONObject0.put("t", v1);
            jSONObject0.put("s", v);
            jSONObject0.put("v", s);
            jSONObject0.put("p", 0);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        CLS35.MTH576(jSONObject0);
    }
}

