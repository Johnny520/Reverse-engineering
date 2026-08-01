// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import org.json.JSONObject;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS146;

public final class CLS227 implements CLS146 {
    public final int FLD266;
    public final JSONObject FLD267;
    public final CLS216 FLD268;

    public CLS227(CLS216 ˎﾞ0, JSONObject jSONObject0, int v) {
        this.FLD266 = v;
        this.FLD268 = ˎﾞ0;
        this.FLD267 = jSONObject0;
        super();
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS146
    public final void MTH2177(Object object0) {
        CLS216 ˎﾞ0 = this.FLD268;
        JSONObject jSONObject0 = this.FLD267;
        switch(this.FLD266) {
            case 0: {
                ˎﾞ0.getClass();
                try {
                    if(((JSONObject)object0).has("p") && !((JSONObject)object0).getString("p").equals(jSONObject0.getString("p2"))) {
                        ˎﾞ0.FLD236.MTH1808("drawer_header.png", ((JSONObject)object0).getString("p"));
                    }
                    ˎﾞ0.FLD236.MTH1795(((JSONObject)object0).getInt("a"), "DrawerHeaderBgAlpha");
                    ˎﾞ0.FLD236.MTH1795(((JSONObject)object0).getInt("b"), "DrawerHeaderBgBlur");
                    ˎﾞ0.FLD236.MTH1823("DrawerHeaderOverlay", ((JSONObject)object0).getString("c"));
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                return;
            }
            case 1: {
                ˎﾞ0.getClass();
                try {
                    if(((JSONObject)object0).has("p") && !((JSONObject)object0).getString("p").equals(jSONObject0.getString("p2"))) {
                        ˎﾞ0.FLD236.MTH1808("drawer_bg.png", ((JSONObject)object0).getString("p"));
                    }
                    ˎﾞ0.FLD236.MTH1795(((JSONObject)object0).getInt("a"), "DrawerListBgAlpha");
                    ˎﾞ0.FLD236.MTH1795(((JSONObject)object0).getInt("b"), "DrawerListBgBlur");
                    ˎﾞ0.FLD236.MTH1823("DrawerListOverlay", ((JSONObject)object0).getString("c"));
                }
                catch(Throwable throwable2) {
                    CLS133.MTH2113(throwable2);
                }
                return;
            }
            default: {
                ˎﾞ0.getClass();
                try {
                    if(((JSONObject)object0).has("p") && !((JSONObject)object0).getString("p").equals(jSONObject0.getString("p2"))) {
                        ˎﾞ0.FLD236.MTH1808("drawer_bg_whole.png", ((JSONObject)object0).getString("p"));
                    }
                    ˎﾞ0.FLD236.MTH1795(((JSONObject)object0).getInt("a"), "DrawerWholeAlpha");
                    ˎﾞ0.FLD236.MTH1795(((JSONObject)object0).getInt("b"), "DrawerWholeBgBlur");
                    ˎﾞ0.FLD236.MTH1823("DrawerWholeOverlay", ((JSONObject)object0).getString("c"));
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }
    }
}

