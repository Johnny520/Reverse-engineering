// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS71;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class CLS189 implements CLS125 {
    public View FLD536;
    public TextView FLD537;
    public LinearLayout FLD538;
    public final WeakReference FLD539;
    public String FLD540;
    public TextView FLD541;
    public int FLD542;
    public final CLS83 FLD543;
    public String FLD544;
    public String FLD545;
    public TextView FLD546;

    public CLS189(Activity activity0) {
        this.FLD542 = 0;
        this.FLD539 = new WeakReference(activity0);
        this.FLD543 = new CLS83(activity0);
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD546 == null ? this.FLD545 : this.FLD546.getText().toString();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD542 = v;
        LinearLayout linearLayout0 = this.FLD538;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD536;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD538.setBackgroundColor(CLS43.MTH645());
    }

    public final void MTH1009(String s) {
        CLS83 ˈˈ0 = this.FLD543;
        ArrayList arrayList0 = ˈˈ0.FLD426;
        if(arrayList0.contains(s)) {
            for(int v = 0; v < arrayList0.size(); ++v) {
                if(((String)arrayList0.get(v)).equals(s)) {
                    if(ˈˈ0.FLD425 == 0) {
                        ˈˈ0.FLD425 = 1;
                    }
                    if(v >= arrayList0.size()) {
                        break;
                    }
                    ˈˈ0.FLD424.setSelection(v, true);
                    ˈˈ0.FLD423.notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD544 = s;
        CLS45.MTH658(this.FLD541, s);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD536 = view0;
        view0.setVisibility(this.FLD542);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1181(String s) {
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1 = "";
        if(TextUtils.isEmpty(s)) {
            s2 = "";
            s3 = "";
        }
        else {
            if(!s.contains("[[") || !s.contains("]]")) {
                s5 = s;
                s4 = "";
            }
            else {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s4 = s.substring(v + 2, v1);
                s5 = CLS71.MTH825(s, 0, v, new StringBuilder(), v1, 2);
            }
            if(!s5.contains("{") || !s5.contains("}")) {
                s6 = "";
            }
            else {
                int v2 = s5.indexOf("{");
                int v3 = s5.lastIndexOf("}");
                s6 = s5.substring(v2 + 1, v3);
                s5 = CLS71.MTH825(s5, 0, v2, new StringBuilder(), v3, 1);
            }
            if(s5.contains("((") && s5.contains("))")) {
                int v4 = s5.indexOf("((");
                int v5 = s5.lastIndexOf("))");
                s1 = s5.substring(v4 + 2, v5);
                s5 = CLS71.MTH825(s5, 0, v4, new StringBuilder(), v5, 2);
            }
            s3 = s5.trim();
            s2 = s6.trim();
            s1.trim();
            s1 = s4.trim();
        }
        if(!TextUtils.isEmpty(s1)) {
            this.MTH1179(s1);
        }
        if(TextUtils.isEmpty(s2)) {
            this.FLD540 = s2;
            CLS45.MTH658(this.FLD537, s2);
        }
        this.FLD545 = s3;
        CLS45.MTH658(this.FLD546, s3);
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        if(this.FLD538 == null) {
            Activity activity0 = (Activity)this.FLD539.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS45.MTH668());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS45.MTH668());
            TextView textView0 = new TextView(activity0);
            this.FLD546 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD546.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD546, this.FLD545);
            this.FLD546.setTextColor(CLS43.MTH646());
            this.FLD546.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD546, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD541 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD541.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD541, this.FLD544);
            this.FLD541.setTextColor(CLS43.MTH640());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD546.getId());
            this.FLD541.setPadding(CLS45.MTH662(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD541, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD544)) {
                this.FLD541.setVisibility(8);
            }
            TextView textView2 = new TextView(activity0);
            this.FLD537 = textView2;
            textView2.setTextSize(2, 16.0f);
            this.FLD537.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD537, this.FLD540);
            this.FLD537.setTextColor(CLS43.MTH641());
            this.FLD537.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD537, relativeLayout$LayoutParams2);
            if(TextUtils.isEmpty(this.FLD545) && TextUtils.isEmpty(this.FLD540)) {
                this.FLD546.setVisibility(8);
                this.FLD537.setVisibility(8);
            }
            boolean z = CLS43.MTH639();
            CLS83 ˈˈ0 = this.FLD543;
            if(z) {
                Drawable drawable0 = ˈˈ0.FLD424.getBackground().getConstantState().newDrawable();
                drawable0.setColorFilter(CLS43.MTH646(), PorterDuff.Mode.SRC_ATOP);
                CLS45.MTH657(ˈˈ0.FLD424, drawable0);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD541.getId());
            int v = CLS45.MTH662(6);
            int v1 = CLS45.MTH662(6);
            ˈˈ0.FLD424.setPadding(v, 0, v1, 0);
            relativeLayout1.addView(ˈˈ0.FLD424, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
            relativeLayout1.setPadding(0, 0, CLS45.MTH662(15), 0);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS43.MTH644());
            linearLayout0.setVisibility(this.FLD542);
            this.FLD538 = linearLayout0;
        }
        return this.FLD538;
    }
}

