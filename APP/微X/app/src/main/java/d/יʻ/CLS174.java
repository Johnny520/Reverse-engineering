// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import d.ˑʽ.CLS13;
import d.ˑʽ.CLS38;
import org.json.JSONObject;

public final class CLS174 implements CLS68.CLS67 {
    public final int FLD341;

    public CLS174(int v) {
        this.FLD341 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.יʻ.CLS68$CLS67
    public final void run() {
        switch(this.FLD341) {
            case 0: {
                CLS62 ˎˏ0 = CLS62.FLD317;
                if(!ˎˏ0.MTH760("requires_fp_donation", new Object[0])) {
                    ˎˏ0.MTH754("core", "unloadFeature", new Object[]{"donation"});
                    ˎˏ0.FLD316.clear();
                    ˎˏ0.FLD314.clear();
                    ˎˏ0.FLD312.clear();
                }
                return;
            }
            case 1: {
                CLS59.MTH727();
                try {
                    JSONObject jSONObject0 = CLS69.MTH801().MTH742("LatestVersions", new JSONObject());
                    if(jSONObject0.has("fp_donation") && 72 < ((int)Long.parseLong(jSONObject0.getString("fp_donation"), 16))) {
                        CLS62.FLD317.MTH759("core", "downloadFeaturePack", new Object[]{"donation"});
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
                return;
            }
            case 2: {
                String s = CLS69.MTH806("wx_donate_update_check_url");
                CLS38.FLD200.getClass();
                CLS38.MTH612(s, false);
                return;
            }
            default: {
                CLS13.MTH431(CLS69.MTH795("donate_update_reminder"));
            }
        }
    }
}

