// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS226;
import c.ﹶˆ.CLS341;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

public class CLS601 implements CLS341 {
    public String FLD1202;
    public boolean FLD1203;
    public View FLD1204;
    public String FLD1205;
    public int FLD1206;
    public TextView FLD1207;
    public boolean FLD1208;
    public final ArrayList FLD1209;
    public TextView FLD1210;
    public final WeakReference FLD1211;

    public CLS601(Activity activity0) {
        this.FLD1206 = 0;
        this.FLD1203 = false;
        this.FLD1208 = true;
        this.FLD1211 = new WeakReference(activity0);
        this.FLD1209 = new ArrayList();
    }

    public CLS601 MTH3701(Object object0) {
        this.FLD1209.add(object0);
        return this;
    }

    public void MTH3702(LinearLayout linearLayout0) {
        this.MTH3704(linearLayout0, 0);
    }

    public CLS601 MTH3703(Object[] arr_object) {
        Collections.addAll(this.FLD1209, arr_object);
        return this;
    }

    public void MTH3704(LinearLayout linearLayout0, int v) {
        if(this.MTH3705()) {
            return;
        }
        CLS144.MTH2180(linearLayout0, ((CLS341)this), v);
    }

    public boolean MTH3705() {
        return this.FLD1209.isEmpty();
    }

    @Override  // c.ﹶˆ.CLS341
    public void MTH4822(View view0) {
    }

    public final View MTH3707() {
        View view1;
        Activity activity0 = (Activity)this.FLD1211.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        TextView textView0 = new TextView(activity0);
        this.FLD1210 = textView0;
        CLS144.MTH2197(textView0, this.FLD1202);
        this.FLD1210.setTextSize(2, 14.0f);
        this.FLD1210.setTextColor(CLS226.MTH3101());
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(CLS144.MTH2175(4), 0, 0, 0);
        linearLayout0.addView(this.FLD1210, linearLayout$LayoutParams0);
        if(TextUtils.isEmpty(this.FLD1202)) {
            this.FLD1210.setVisibility(8);
        }
        TextView textView1 = new TextView(activity0);
        this.FLD1207 = textView1;
        CLS144.MTH2197(textView1, this.FLD1205);
        this.FLD1207.setTextSize(2, 12.0f);
        this.FLD1207.setBackgroundColor(CLS226.MTH3105());
        this.FLD1207.setTextColor(CLS226.MTH3098());
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        this.FLD1207.setPadding(CLS144.MTH2175(10), 0, 0, 0);
        linearLayout0.addView(this.FLD1207, linearLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1205)) {
            this.FLD1207.setVisibility(8);
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, 1);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int v = CLS144.MTH2175(10);
        for(Object object0: this.FLD1209) {
            try {
                if(object0 instanceof CLS599) {
                    if(((CLS599)object0).MTH3686()) {
                        View view0 = ((CLS599)object0).MTH4823();
                        if(this.FLD1203) {
                            view0.setPadding(CLS144.MTH2175(11), 0, CLS144.MTH2175(10), CLS144.MTH2175(2));
                        }
                        else {
                            view0.setPadding(CLS144.MTH2175(11), 0, CLS144.MTH2175(10), v);
                        }
                        linearLayout0.addView(view0, linearLayout$LayoutParams3);
                        goto label_62;
                    }
                    else if(((CLS599)object0).MTH3689()) {
                        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        linearLayout$LayoutParams4.setMargins(0, CLS144.MTH2175(2), 0, CLS144.MTH2175(2));
                        View view2 = ((CLS599)object0).MTH4823();
                        view2.setPadding(0, 0, 0, v);
                        linearLayout0.addView(view2, linearLayout$LayoutParams4);
                        goto label_62;
                    }
                    else {
                        view1 = ((CLS599)object0).MTH4823();
                        goto label_61;
                    }
                    goto label_49;
                }
                else {
                label_49:
                    if(object0 instanceof CLS601) {
                        view1 = ((CLS601)object0).MTH4823();
                    }
                    else {
                        if(object0 instanceof CLS341) {
                            view1 = ((CLS341)object0).MTH4823();
                        }
                        else {
                            view1 = object0 instanceof View ? ((View)object0) : null;
                        }
                        if(view1 == null) {
                            continue;
                        }
                        if(this.FLD1203) {
                            view1.setPadding(CLS144.MTH2175(11), 0, CLS144.MTH2175(10), CLS144.MTH2175(2));
                        }
                        else {
                            view1.setPadding(CLS144.MTH2175(11), 0, CLS144.MTH2175(10), v);
                        }
                    }
                }
            label_61:
                linearLayout0.addView(view1, linearLayout$LayoutParams3);
            label_62:
                if(!this.FLD1208) {
                    continue;
                }
                View view3 = new View(activity0);
                view3.setBackgroundColor(CLS226.MTH3103());
                view3.setPadding(CLS144.MTH2175(11), 0, 0, 0);
                linearLayout0.addView(view3, linearLayout$LayoutParams2);
                if(!(object0 instanceof CLS341)) {
                    continue;
                }
                ((CLS341)object0).MTH4822(view3);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        linearLayout0.setVisibility(this.FLD1206);
        return linearLayout0;
    }

    @Override  // c.ﹶˆ.CLS341
    public View MTH4823() {
        if(this.FLD1204 == null) {
            this.FLD1204 = this.MTH3707();
        }
        return this.FLD1204;
    }
}

