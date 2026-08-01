// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.text.TextUtils;
import t.ⁱʾ.CLS140;

public final class CLS346 implements CLS140 {
    public final int FLD1313;
    public final CLS340 FLD1314;
    public final CLS172 FLD1315;

    public CLS346(CLS172 ـˏ0, CLS340 ـﹳ0, int v) {
        this.FLD1313 = v;
        this.FLD1315 = ـˏ0;
        this.FLD1314 = ـﹳ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS140
    public final void MTH2164(String s) {
        CLS340 ـﹳ0 = this.FLD1314;
        CLS172 ـˏ0 = this.FLD1315;
        switch(this.FLD1313) {
            case 0: {
                ـˏ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v1 = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ـˏ0.FLD1218 = v1;
                    ـﹳ0.MTH2429(String.valueOf(v1));
                    ـˏ0.MTH2420();
                }
                return;
            }
            case 1: {
                ـˏ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v2 = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ـˏ0.FLD1208 = v2;
                    ـﹳ0.MTH2429(String.valueOf(v2));
                    ـˏ0.MTH2420();
                }
                return;
            }
            case 2: {
                ـˏ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v3 = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ـˏ0.FLD1216 = v3;
                    ـﹳ0.MTH2429(String.valueOf(v3));
                    ـˏ0.MTH2420();
                }
                return;
            }
            default: {
                ـˏ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ـˏ0.FLD1212 = v;
                    ـﹳ0.MTH2429(String.valueOf(v));
                    ـˏ0.MTH2420();
                }
            }
        }
    }
}

