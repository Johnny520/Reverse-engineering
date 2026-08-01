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

public final class CLS183 implements CLS125 {
    public TextView FLD415;
    public final WeakReference FLD416;
    public View FLD417;
    public TextView FLD418;
    public final ArrayList FLD419;
    public String FLD420;
    public String FLD421;
    public int FLD422;

    public CLS183(Activity activity0) {
        this.FLD422 = 0;
        this.FLD416 = new WeakReference(activity0);
        this.FLD419 = new ArrayList();
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD418 == null ? this.FLD421 : this.FLD418.getText().toString();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD422 = v;
        View view0 = this.FLD417;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD417.setBackgroundColor(CLS43.MTH645());
    }

    public final View MTH916() {
        View view0;
        Activity activity0 = (Activity)this.FLD416.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        TextView textView0 = new TextView(activity0);
        this.FLD418 = textView0;
        CLS45.MTH658(textView0, this.FLD421);
        this.FLD418.setTextSize(2, 14.0f);
        this.FLD418.setTextColor(Color.parseColor(CLS108.MTH1103((CLS43.MTH639() ? 0xFFFF5B6B2DFB3E45L : 0xFFFF5B632DFB3E45L))));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(CLS45.MTH662(4), 0, 0, 0);
        linearLayout0.addView(this.FLD418, linearLayout$LayoutParams0);
        if(TextUtils.isEmpty(this.FLD421)) {
            this.FLD418.setVisibility(8);
        }
        TextView textView1 = new TextView(activity0);
        this.FLD415 = textView1;
        CLS45.MTH658(textView1, this.FLD420);
        this.FLD415.setTextSize(2, 12.0f);
        this.FLD415.setBackgroundColor(CLS43.MTH644());
        this.FLD415.setTextColor(CLS43.MTH640());
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        this.FLD415.setPadding(CLS45.MTH662(10), 0, 0, 0);
        linearLayout0.addView(this.FLD415, linearLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD420)) {
            this.FLD415.setVisibility(8);
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        for(Object object0: this.FLD419) {
            try {
                if(object0 instanceof CLS125) {
                    view0 = ((CLS125)object0).MTH1182();
                }
                else {
                    view0 = object0 instanceof View ? ((View)object0) : null;
                }
                if(view0 == null) {
                    continue;
                }
                linearLayout0.addView(view0, linearLayout$LayoutParams2);
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
        linearLayout0.setVisibility(this.FLD422);
        return linearLayout0;
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD420 = s;
        CLS45.MTH658(this.FLD415, s);
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
            s5.trim();
            s1.trim();
            s1 = s3.trim();
        }
        if(!TextUtils.isEmpty(s1)) {
            this.MTH1179(s1);
        }
        this.FLD421 = s2;
        CLS45.MTH658(this.FLD418, s2);
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        if(this.FLD417 == null) {
            this.FLD417 = this.MTH916();
        }
        return this.FLD417;
    }
}

