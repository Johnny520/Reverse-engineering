// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import d.יʻ.CLS69;
import d.ᐧˏ.CLS108;
import d.ⁱٴ.CLS123;
import org.json.JSONObject;

public final class CLS165 implements CLS123 {
    public final int[] FLD244;
    public final int FLD245;
    public final String FLD246;

    public CLS165(int v, int[] arr_v, String s) {
        this.FLD245 = v;
        this.FLD244 = arr_v;
        this.FLD246 = s;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        String s = this.FLD246;
        int v = this.FLD244[0];
        String s1 = "";
        int v1 = this.FLD245;
        switch(v1) {
            case 1: {
                if(v == 2) {
                    s1 = CLS108.MTH1103(0xFFFF4CBD2DFB3E45L);
                }
                break;
            }
            case 2: {
                if(v == 2) {
                    s1 = CLS108.MTH1103(0xFFFF4CB02DFB3E45L);
                }
                break;
            }
            case 3: {
                if(v == 2) {
                    s1 = CLS108.MTH1103(-197194062021051L);
                }
                break;
            }
            case 101: {
                if(v == 2) {
                    s1 = CLS108.MTH1103(0xFFFF4C5A2DFB3E45L);
                }
                break;
            }
            case 104: {
                if(v == 2) {
                    s1 = CLS108.MTH1103(0xFFFF4C492DFB3E45L);
                }
            }
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("d", Long.toHexString(System.currentTimeMillis()));
            jSONObject0.put("wxid", CLS69.MTH805());
            jSONObject0.put("t", v1);
            jSONObject0.put("s", v);
            jSONObject0.put("v", s1);
            jSONObject0.put("x", s);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        CLS35.MTH580(jSONObject0);
    }
}

