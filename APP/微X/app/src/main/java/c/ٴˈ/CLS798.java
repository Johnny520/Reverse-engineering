// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.ˋﹳ.CLS108;
import c.ـˉ.CLS172;
import c.ـˉ.CLS204;
import c.ـˉ.CLS258;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

public class CLS798 implements CLS108 {
    public final WeakReference FLD1329;
    public View FLD1330;
    public final ArrayList FLD1331;
    public boolean FLD1332;
    public boolean FLD1333;
    public String FLD1334;
    public TextView FLD1335;
    public TextView FLD1336;
    public int FLD1337;
    public String FLD1338;

    public CLS798(Activity activity0) {
        this.FLD1337 = 0;
        this.FLD1332 = false;
        this.FLD1333 = true;
        this.FLD1329 = new WeakReference(activity0);
        this.FLD1331 = new ArrayList();
    }

    @Override  // c.ˋﹳ.CLS108
    public View MTH2282() {
        if(this.FLD1330 == null) {
            this.FLD1330 = this.MTH4314();
        }
        return this.FLD1330;
    }

    public void MTH4311(LinearLayout linearLayout0) {
        this.MTH4316(linearLayout0, 0);
    }

    @Override  // c.ˋﹳ.CLS108
    public void MTH2283(View view0) {
    }

    public CLS798 MTH4313(Object object0) {
        this.FLD1331.add(object0);
        return this;
    }

    public final View MTH4314() {
        View view1;
        Activity activity0 = (Activity)this.FLD1329.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        TextView textView0 = new TextView(activity0);
        this.FLD1335 = textView0;
        CLS258.MTH3751(textView0, this.FLD1334);
        this.FLD1335.setTextSize(2, 14.0f);
        this.FLD1335.setTextColor(CLS172.MTH3029());
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(CLS258.MTH3770(4), 0, 0, 0);
        linearLayout0.addView(this.FLD1335, linearLayout$LayoutParams0);
        if(TextUtils.isEmpty(this.FLD1334)) {
            this.FLD1335.setVisibility(8);
        }
        TextView textView1 = new TextView(activity0);
        this.FLD1336 = textView1;
        CLS258.MTH3751(textView1, this.FLD1338);
        this.FLD1336.setTextSize(2, 12.0f);
        this.FLD1336.setBackgroundColor(CLS172.MTH3039());
        this.FLD1336.setTextColor(CLS172.MTH3036());
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        this.FLD1336.setPadding(CLS258.MTH3770(10), 0, 0, 0);
        linearLayout0.addView(this.FLD1336, linearLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1338)) {
            this.FLD1336.setVisibility(8);
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, 1);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int v = CLS258.MTH3770(10);
        for(Object object0: this.FLD1331) {
            try {
                if(object0 instanceof CLS793) {
                    if(((CLS793)object0).MTH4263()) {
                        View view0 = ((CLS793)object0).MTH2282();
                        if(this.FLD1332) {
                            view0.setPadding(CLS258.MTH3770(11), 0, CLS258.MTH3770(10), CLS258.MTH3770(2));
                        }
                        else {
                            view0.setPadding(CLS258.MTH3770(11), 0, CLS258.MTH3770(10), v);
                        }
                        linearLayout0.addView(view0, linearLayout$LayoutParams3);
                        goto label_62;
                    }
                    else if(((CLS793)object0).MTH4262()) {
                        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        linearLayout$LayoutParams4.setMargins(0, CLS258.MTH3770(2), 0, CLS258.MTH3770(2));
                        View view2 = ((CLS793)object0).MTH2282();
                        view2.setPadding(0, 0, 0, v);
                        linearLayout0.addView(view2, linearLayout$LayoutParams4);
                        goto label_62;
                    }
                    else {
                        view1 = ((CLS793)object0).MTH2282();
                        goto label_61;
                    }
                    goto label_49;
                }
                else {
                label_49:
                    if(object0 instanceof CLS798) {
                        view1 = ((CLS798)object0).MTH2282();
                    }
                    else {
                        if(object0 instanceof CLS108) {
                            view1 = ((CLS108)object0).MTH2282();
                        }
                        else {
                            view1 = object0 instanceof View ? ((View)object0) : null;
                        }
                        if(view1 == null) {
                            continue;
                        }
                        if(this.FLD1332) {
                            view1.setPadding(CLS258.MTH3770(11), 0, CLS258.MTH3770(10), CLS258.MTH3770(2));
                        }
                        else {
                            view1.setPadding(CLS258.MTH3770(11), 0, CLS258.MTH3770(10), v);
                        }
                    }
                }
            label_61:
                linearLayout0.addView(view1, linearLayout$LayoutParams3);
            label_62:
                if(!this.FLD1333) {
                    continue;
                }
                View view3 = new View(activity0);
                view3.setBackgroundColor(CLS172.MTH3040());
                view3.setPadding(CLS258.MTH3770(11), 0, 0, 0);
                linearLayout0.addView(view3, linearLayout$LayoutParams2);
                if(!(object0 instanceof CLS108)) {
                    continue;
                }
                ((CLS108)object0).MTH2283(view3);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        linearLayout0.setVisibility(this.FLD1337);
        return linearLayout0;
    }

    public boolean MTH4315() {
        return this.FLD1331.isEmpty();
    }

    public void MTH4316(LinearLayout linearLayout0, int v) {
        if(this.MTH4315()) {
            return;
        }
        CLS258.MTH3791(linearLayout0, ((CLS108)this), v);
    }

    public CLS798 MTH4317(Object[] arr_object) {
        Collections.addAll(this.FLD1331, arr_object);
        return this;
    }
}

