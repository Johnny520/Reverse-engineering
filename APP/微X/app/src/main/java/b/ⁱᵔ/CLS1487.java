// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;

public final class CLS1487 implements CLS17 {
    public final int FLD4450;
    public final CLS17 FLD4451;
    public final Activity FLD4452;

    public CLS1487(Activity activity0, CLS17 ﾞٴ0, int v) {
        this.FLD4450 = v;
        this.FLD4452 = activity0;
        this.FLD4451 = ﾞٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        CLS17 ﾞٴ0 = this.FLD4451;
        Activity activity0 = this.FLD4452;
        if(this.FLD4450 == 0) {
            Menu menu0 = (Menu)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
            ScrollView scrollView0 = new ScrollView(activity0);
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setOrientation(1);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            if(ﾞٴ0 != null) {
                try {
                    ﾞٴ0.MTH796(new Object[]{menu0, linearLayout1, linearLayout0});
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            scrollView0.addView(linearLayout1, new LinearLayout.LayoutParams(-1, -2));
            linearLayout0.addView(scrollView0, new LinearLayout.LayoutParams(-1, -2));
            return;
        }
        Menu menu1 = (Menu)arr_object[0];
        LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -1);
        ScrollView scrollView1 = new ScrollView(activity0);
        LinearLayout linearLayout3 = new LinearLayout(activity0);
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(linearLayout$LayoutParams1);
        if(ﾞٴ0 != null) {
            try {
                ﾞٴ0.MTH796(new Object[]{menu1, linearLayout3, linearLayout2});
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        scrollView1.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.addView(scrollView1, new LinearLayout.LayoutParams(-1, -2));
    }
}

