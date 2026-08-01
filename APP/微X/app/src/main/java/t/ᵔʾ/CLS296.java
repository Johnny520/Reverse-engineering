// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.text.TextUtils;
import org.json.JSONObject;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS32;

public final class CLS296 implements CLS136 {
    public final int FLD913;

    public CLS296(int v) {
        this.FLD913 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        switch(this.FLD913) {
            case 0: {
                CLS122.MTH1994();
                try {
                    CLS135 ⁱˉ0 = CLS133.MTH2103();
                    JSONObject jSONObject0 = new JSONObject();
                    ⁱˉ0.getClass();
                    try {
                        Object object0 = ⁱˉ0.MTH2132(jSONObject0, "LatestVersions");
                        if(object0 != null) {
                            jSONObject0 = (JSONObject)object0;
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS133.MTH2113(throwable1);
                    }
                    if(jSONObject0.has("fp_themes") && 0x74 < ((int)Long.parseLong(jSONObject0.getString("fp_themes"), 16))) {
                        CLS123.FLD912.MTH2004("core", "downloadFeaturePack", new Object[]{"themes"});
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                return;
            }
            case 1: {
                boolean z4 = CLS28.MTH1316();
                CLS32 ˉᐧ1 = CLS32.FLD447;
                boolean z5 = TextUtils.isEmpty(ˉᐧ1.MTH1336());
                boolean z6 = ˉᐧ1.MTH1338();
                boolean z7 = ˉᐧ1.MTH1339("themes") && ˉᐧ1.MTH1339("extra_df");
                if(z4 && !z5 != 0 && z6 && z7) {
                    CLS122.FLD906 = 0;
                    ˉᐧ1.FLD453 = true;
                    return;
                }
                CLS133.MTH2109(("1: " + z4));
                CLS133.MTH2109(("2: " + !z5));
                CLS133.MTH2109(("3: " + z6));
                CLS133.MTH2109(("4: " + z7));
                CLS133.MTH2109("themes license failed");
                CLS123.FLD912.MTH2006("core", "unloadFeature", new Object[]{"themes", "themes license failed"});
                CLS123.FLD912.FLD909.clear();
                CLS123.FLD912.FLD907.clear();
                CLS123.FLD912.FLD910.clear();
                return;
            }
            default: {
                boolean z = CLS28.MTH1316();
                CLS32 ˉᐧ0 = CLS32.FLD447;
                boolean z1 = TextUtils.isEmpty(ˉᐧ0.MTH1336());
                boolean z2 = ˉᐧ0.MTH1338();
                boolean z3 = ˉᐧ0.MTH1339("themes") && ˉᐧ0.MTH1339("extra_df");
                if(z && !z1 != 0 && z2 && z3) {
                    CLS122.FLD906 = 0;
                    ˉᐧ0.FLD453 = true;
                    return;
                }
                int v = CLS122.FLD906 + 1;
                CLS122.FLD906 = v;
                if(v == 1) {
                    CLS123.FLD912.MTH2006("core", "check_updates", new Object[0]);
                }
                if(CLS122.FLD906 > 5) {
                    CLS133.MTH2109(("themes check failed " + CLS122.FLD906));
                    CLS133.MTH2109(("1: " + z));
                    CLS133.MTH2109(("2: " + !z1));
                    CLS133.MTH2109(("3: " + z2));
                    CLS133.MTH2109(("4: " + z3));
                    ˉᐧ0.FLD453 = false;
                }
            }
        }
    }
}

