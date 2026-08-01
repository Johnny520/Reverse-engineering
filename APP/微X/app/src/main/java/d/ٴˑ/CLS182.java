// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ᐧˏ.CLS108;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class CLS182 implements CLS125 {
    public TextView FLD407;
    public final WeakReference FLD408;
    public LinearLayout FLD409;
    public TextView FLD410;
    public final ArrayList FLD411;
    public String FLD412;
    public String FLD413;
    public int FLD414;

    public CLS182(Activity activity0) {
        this.FLD414 = 0;
        this.FLD408 = new WeakReference(activity0);
        this.FLD411 = new ArrayList();
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD410 == null ? this.FLD413 : this.FLD410.getText().toString();
    }

    public final void MTH904(LinearLayout linearLayout0, int v) {
        if(this.FLD411.isEmpty()) {
            return;
        }
        CLS45.MTH667(linearLayout0, ((CLS125)this), v);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD414 = v;
        LinearLayout linearLayout0 = this.FLD409;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD409.setBackgroundColor(CLS43.MTH645());
    }

    public final void MTH907(CLS125 ⁱٴ0) {
        this.FLD411.add(ⁱٴ0);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD412 = s;
        CLS45.MTH658(this.FLD407, s);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1181(String s) {
        String s5;
        String s4;
        String s3;
        String s2;
        String s1 = "";
        if(TextUtils.isEmpty(s)) {
            s2 = "";
        }
        else {
            if(!s.contains("[[") || !s.contains("]]")) {
                s4 = s;
                s3 = "";
            }
            else {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s3 = s.substring(v + 2, v1);
                s4 = CLS71.MTH825(s, 0, v, new StringBuilder(), v1, 2);
            }
            if(!s4.contains("{") || !s4.contains("}")) {
                s5 = "";
            }
            else {
                int v2 = s4.indexOf("{");
                int v3 = s4.lastIndexOf("}");
                s5 = s4.substring(v2 + 1, v3);
                s4 = CLS71.MTH825(s4, 0, v2, new StringBuilder(), v3, 1);
            }
            if(s4.contains("((") && s4.contains("))")) {
                int v4 = s4.indexOf("((");
                int v5 = s4.lastIndexOf("))");
                s1 = s4.substring(v4 + 2, v5);
                s4 = CLS71.MTH825(s4, 0, v4, new StringBuilder(), v5, 2);
            }
            s2 = s4.trim();
            s5.getClass();
            s1.getClass();
            s1 = s3.trim();
        }
        if(!TextUtils.isEmpty(s1)) {
            this.MTH1179(s1);
        }
        this.FLD413 = s2;
        CLS45.MTH658(this.FLD410, s2);
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        View view0;
        if(this.FLD409 == null) {
            Activity activity0 = (Activity)this.FLD408.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            TextView textView0 = new TextView(activity0);
            this.FLD410 = textView0;
            CLS45.MTH658(textView0, this.FLD413);
            this.FLD410.setTextSize(2, 14.0f);
            this.FLD410.setTextColor(Color.parseColor(CLS108.MTH1103((CLS43.MTH639() ? 0xFFFF5B6B2DFB3E45L : 0xFFFF5B632DFB3E45L))));
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout$LayoutParams0.setMargins(CLS45.MTH662(4), 0, 0, 0);
            linearLayout0.addView(this.FLD410, linearLayout$LayoutParams0);
            if(TextUtils.isEmpty(this.FLD413)) {
                this.FLD410.setVisibility(8);
            }
            TextView textView1 = new TextView(activity0);
            this.FLD407 = textView1;
            CLS45.MTH658(textView1, this.FLD412);
            this.FLD407.setTextSize(2, 12.0f);
            this.FLD407.setBackgroundColor(CLS43.MTH644());
            this.FLD407.setTextColor(CLS43.MTH640());
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
            this.FLD407.setPadding(CLS45.MTH662(10), 0, 0, 0);
            linearLayout0.addView(this.FLD407, linearLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD412)) {
                this.FLD407.setVisibility(8);
            }
            LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, 1);
            LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            int v = CLS45.MTH662(10);
            for(Object object0: this.FLD411) {
                try {
                    if(!(object0 instanceof CLS180)) {
                        if(object0 instanceof CLS182) {
                            view0 = ((CLS182)object0).MTH1182();
                        }
                        else {
                            if(object0 instanceof CLS125) {
                                view0 = ((CLS125)object0).MTH1182();
                            }
                            else {
                                view0 = object0 instanceof View ? ((View)object0) : null;
                            }
                            if(view0 == null) {
                                continue;
                            }
                            view0.setPadding(CLS45.MTH662(11), 0, CLS45.MTH662(10), v);
                        }
                        linearLayout0.addView(view0, linearLayout$LayoutParams3);
                    }
                    else if(((CLS180)object0).FLD384) {
                        View view2 = ((CLS180)object0).MTH1182();
                        view2.setPadding(CLS45.MTH662(11), 0, CLS45.MTH662(10), v);
                        linearLayout0.addView(view2, linearLayout$LayoutParams3);
                    }
                    else if(((CLS180)object0).FLD383) {
                        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        linearLayout$LayoutParams4.setMargins(0, CLS45.MTH662(2), 0, CLS45.MTH662(2));
                        View view1 = ((CLS180)object0).MTH1182();
                        view1.setPadding(0, 0, 0, v);
                        linearLayout0.addView(view1, linearLayout$LayoutParams4);
                    }
                    else {
                        linearLayout0.addView(((CLS180)object0).MTH1182(), linearLayout$LayoutParams3);
                    }
                    View view3 = new View(activity0);
                    view3.setBackgroundColor(Color.parseColor(CLS108.MTH1103((CLS43.MTH639() ? 0xFFFF58DB2DFB3E45L : 0xFFFF58D32DFB3E45L))));
                    view3.setPadding(CLS45.MTH662(11), 0, 0, 0);
                    linearLayout0.addView(view3, linearLayout$LayoutParams2);
                    if(!(object0 instanceof CLS125)) {
                        continue;
                    }
                    ((CLS125)object0).MTH1180(view3);
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
            }
            linearLayout0.setVisibility(this.FLD414);
            this.FLD409 = linearLayout0;
        }
        return this.FLD409;
    }
}

