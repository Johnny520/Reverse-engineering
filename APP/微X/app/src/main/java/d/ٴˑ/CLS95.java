// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.KeyEvent.Callback;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout;
import d.ˑʽ.CLS10;
import d.ˑʽ.CLS28.CLS138;
import d.ˑʽ.CLS28;
import d.ˑʽ.CLS45;
import d.יʻ.CLS173;
import d.יʻ.CLS69;
import d.ᵎʻ.CLS210;
import d.ⁱٴ.CLS124;
import d.ⁱٴ.CLS125;
import d.ⁱٴ.CLS126;

public final class CLS95 implements View.OnClickListener {
    public final KeyEvent.Callback FLD509;
    public final int FLD510;
    public final Object FLD511;
    public final Object FLD512;

    public CLS95(Activity activity0, double[] arr_f, String s) {
        this.FLD510 = 4;
        super();
        this.FLD509 = activity0;
        this.FLD511 = arr_f;
        this.FLD512 = s;
    }

    public CLS95(CLS125 ⁱٴ0, KeyEvent.Callback keyEvent$Callback0, CLS188 ᴵʾ0, int v) {
        this.FLD510 = v;
        this.FLD511 = ⁱٴ0;
        this.FLD509 = keyEvent$Callback0;
        this.FLD512 = ᴵʾ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Object object0 = this.FLD512;
        KeyEvent.Callback keyEvent$Callback0 = this.FLD509;
        Object object1 = this.FLD511;
        switch(this.FLD510) {
            case 0: {
                CLS185 ـﾞ0 = (CLS185)object1;
                Activity activity0 = (Activity)keyEvent$Callback0;
                CLS188 ᴵʾ0 = (CLS188)object0;
                ـﾞ0.getClass();
                try {
                    CLS87 ˏᐧ0 = new CLS87(activity0, (TextUtils.isEmpty(ـﾞ0.FLD483) ? ـﾞ0.FLD486 : ـﾞ0.FLD483), ـﾞ0.FLD486, new CLS173(ـﾞ0, ᴵʾ0, 3));
                    Activity activity1 = (Activity)ˏᐧ0.FLD438.get();
                    CLS45.MTH653(activity1, CLS69.MTH795("select_color"), ((CLS124)new CLS173(ˏᐧ0, activity1, 2)), ((CLS126)new CLS186(ˏᐧ0)));
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
                return;
            }
            case 1: {
                if(((CLS180)object1).FLD382 == null) {
                    CLS10 ʻﹶ0 = new CLS10(((Activity)keyEvent$Callback0), ((CLS180)object1).FLD385);
                    ((CLS180)object1).FLD382 = ʻﹶ0;
                    ʻﹶ0.FLD44 = new CLS210(((CLS180)object1), 2);
                }
                CLS10 ʻﹶ1 = ((CLS180)object1).FLD382;
                if(ʻﹶ1 != null && !ʻﹶ1.isShowing()) {
                    ((CLS180)object1).FLD382.show();
                }
                return;
            }
            case 2: {
                ((CLS180)object1).getClass();
                if(((LinearLayout)keyEvent$Callback0).getVisibility() == 0) {
                    ((LinearLayout)keyEvent$Callback0).setVisibility(8);
                    if(((CLS188)object0).FLD531) {
                        ((CLS188)object0).FLD533.setRotation(90.0f);
                        return;
                    }
                }
                else {
                    ((LinearLayout)keyEvent$Callback0).setVisibility(0);
                    if(((CLS188)object0).FLD531) {
                        ((CLS188)object0).FLD533.setRotation(-90.0f);
                    }
                }
                return;
            }
            case 3: {
                CLS179 ʾﹶ0 = (CLS179)object1;
                Activity activity2 = (Activity)keyEvent$Callback0;
                CLS188 ᴵʾ1 = (CLS188)object0;
                ʾﹶ0.getClass();
                try {
                    CLS28.MTH530(activity2, ʾﹶ0.FLD377, new CLS178(ʾﹶ0, ᴵʾ1));
                }
                catch(Throwable throwable1) {
                    CLS69.MTH797(throwable1);
                }
                return;
            }
            default: {
                CLS28.MTH533(((Activity)keyEvent$Callback0), ((CLS126)new CLS138(((double[])object1), ((String)object0))));
            }
        }
    }
}

