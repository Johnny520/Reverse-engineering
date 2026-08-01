// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import t.ˆʿ.CLS43;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS140;

public final class CLS183 implements View.OnClickListener {
    public final int FLD1316;
    public final Activity FLD1317;
    public final CLS172 FLD1318;
    public final CLS340 FLD1319;

    public CLS183(CLS172 ـˏ0, Activity activity0, CLS340 ـﹳ0, int v) {
        this.FLD1316 = v;
        this.FLD1318 = ـˏ0;
        this.FLD1317 = activity0;
        this.FLD1319 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS340 ـﹳ0 = this.FLD1319;
        CLS172 ـˏ0 = this.FLD1318;
        switch(this.FLD1316) {
            case 0: {
                ـˏ0.getClass();
                String s2 = CLS133.MTH2099("red");
                String s3 = String.valueOf(ـˏ0.FLD1208);
                CLS346 ﾞٴ1 = new CLS346(ـˏ0, ـﹳ0, 1);
                CLS43.MTH1422(this.FLD1317, s2, "", s3, 2, ((CLS140)ﾞٴ1));
                return;
            }
            case 1: {
                ـˏ0.getClass();
                String s4 = CLS133.MTH2099("green");
                String s5 = String.valueOf(ـˏ0.FLD1212);
                CLS346 ﾞٴ2 = new CLS346(ـˏ0, ـﹳ0, 3);
                CLS43.MTH1422(this.FLD1317, s4, "", s5, 2, ((CLS140)ﾞٴ2));
                return;
            }
            case 2: {
                ـˏ0.getClass();
                String s6 = CLS133.MTH2099("blue");
                String s7 = String.valueOf(ـˏ0.FLD1218);
                CLS346 ﾞٴ3 = new CLS346(ـˏ0, ـﹳ0, 0);
                CLS43.MTH1422(this.FLD1317, s6, "", s7, 2, ((CLS140)ﾞٴ3));
                return;
            }
            default: {
                ـˏ0.getClass();
                String s = CLS133.MTH2099("alpha");
                String s1 = String.valueOf(ـˏ0.FLD1216);
                CLS346 ﾞٴ0 = new CLS346(ـˏ0, ـﹳ0, 2);
                CLS43.MTH1422(this.FLD1317, s, "", s1, 2, ((CLS140)ﾞٴ0));
            }
        }
    }
}

