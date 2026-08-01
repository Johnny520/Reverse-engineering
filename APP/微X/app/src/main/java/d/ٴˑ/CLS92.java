// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import d.ˑʽ.CLS45;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS122;

public final class CLS92 implements View.OnClickListener {
    public final CLS87 FLD496;
    public final int FLD497;
    public final CLS184 FLD498;
    public final Activity FLD499;

    public CLS92(CLS87 ˏᐧ0, Activity activity0, CLS184 י0, int v) {
        this.FLD497 = v;
        this.FLD496 = ˏᐧ0;
        this.FLD499 = activity0;
        this.FLD498 = י0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS184 י0 = this.FLD498;
        CLS87 ˏᐧ0 = this.FLD496;
        switch(this.FLD497) {
            case 0: {
                ˏᐧ0.getClass();
                String s2 = CLS69.MTH795("red");
                String s3 = String.valueOf(ˏᐧ0.FLD442);
                CLS192 ⁱﾞ1 = new CLS192(ˏᐧ0, י0, 2);
                CLS45.MTH655(this.FLD499, s2, "", s3, 2, ((CLS122)ⁱﾞ1));
                return;
            }
            case 1: {
                ˏᐧ0.getClass();
                String s4 = CLS69.MTH795("green");
                String s5 = String.valueOf(ˏᐧ0.FLD433);
                CLS192 ⁱﾞ2 = new CLS192(ˏᐧ0, י0, 3);
                CLS45.MTH655(this.FLD499, s4, "", s5, 2, ((CLS122)ⁱﾞ2));
                return;
            }
            case 2: {
                ˏᐧ0.getClass();
                String s6 = CLS69.MTH795("blue");
                String s7 = String.valueOf(ˏᐧ0.FLD436);
                CLS192 ⁱﾞ3 = new CLS192(ˏᐧ0, י0, 0);
                CLS45.MTH655(this.FLD499, s6, "", s7, 2, ((CLS122)ⁱﾞ3));
                return;
            }
            default: {
                ˏᐧ0.getClass();
                String s = CLS69.MTH795("alpha");
                String s1 = String.valueOf(ˏᐧ0.FLD432);
                CLS192 ⁱﾞ0 = new CLS192(ˏᐧ0, י0, 1);
                CLS45.MTH655(this.FLD499, s, "", s1, 2, ((CLS122)ⁱﾞ0));
            }
        }
    }
}

