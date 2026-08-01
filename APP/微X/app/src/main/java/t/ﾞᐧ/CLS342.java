// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˑٴ.CLS114;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS145;

public final class CLS342 implements CLS145 {
    public TextView FLD1282;
    public final ArrayList FLD1283;
    public View FLD1284;
    public String FLD1285;
    public final WeakReference FLD1286;
    public String FLD1287;
    public TextView FLD1288;
    public int FLD1289;

    public CLS342(Activity activity0) {
        this.FLD1289 = 0;
        this.FLD1286 = new WeakReference(activity0);
        this.FLD1283 = new ArrayList();
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1288 == null ? this.FLD1285 : this.FLD1288.getText().toString();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS145
    public final void MTH2172(String s) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        new String("");
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.indexOf("]]");
                s1 = s.substring(v + 2, v1);
                s = CLS15.MTH1076(s, 0, v, new StringBuilder(), v1, 2);
            }
            String s4 = s;
            String s5 = "";
            if(s4.contains("{") && s4.contains("}")) {
                int v2 = s4.indexOf("{");
                int v3 = s4.indexOf("}");
                s5 = s4.substring(v2 + 1, v3);
                s4 = CLS15.MTH1076(s4, 0, v2, new StringBuilder(), v3, 1);
            }
            String s6 = "";
            if(s4.contains("((") && s4.contains("))")) {
                int v4 = s4.indexOf("((");
                int v5 = s4.indexOf("))");
                s6 = s4.substring(v4 + 2, v5);
                s4 = CLS15.MTH1076(s4, 0, v4, new StringBuilder(), v5, 2);
            }
            s5.getClass();
            s6.getClass();
            s3 = s1.trim();
            s2 = s4.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.FLD1287 = s3;
            CLS43.MTH1429(this.FLD1282, s3);
        }
        this.FLD1285 = s2;
        CLS43.MTH1429(this.FLD1288, s2);
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        if(this.FLD1284 == null) {
            this.FLD1284 = this.MTH2470();
        }
        return this.FLD1284;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1289 = v;
        View view0 = this.FLD1284;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1284.setBackgroundColor(CLS46.MTH1445());
    }

    public final View MTH2470() {
        View view0;
        Activity activity0 = (Activity)this.FLD1286.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        TextView textView0 = new TextView(activity0);
        this.FLD1288 = textView0;
        CLS43.MTH1429(textView0, this.FLD1285);
        this.FLD1288.setTextSize(2, 14.0f);
        this.FLD1288.setTextColor(Color.parseColor(CLS114.MTH1900((CLS46.MTH1455() ? 0xFFFFBB082B3CF2B7L : 0xFFFFBB002B3CF2B7L))));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(CLS43.MTH1439(4), 0, 0, 0);
        linearLayout0.addView(this.FLD1288, linearLayout$LayoutParams0);
        if(TextUtils.isEmpty(this.FLD1285)) {
            this.FLD1288.setVisibility(8);
        }
        TextView textView1 = new TextView(activity0);
        this.FLD1282 = textView1;
        CLS43.MTH1429(textView1, this.FLD1287);
        this.FLD1282.setTextSize(2, 12.0f);
        this.FLD1282.setBackgroundColor(CLS46.MTH1446());
        this.FLD1282.setTextColor(CLS46.MTH1457());
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        this.FLD1282.setPadding(CLS43.MTH1439(10), 0, 0, 0);
        linearLayout0.addView(this.FLD1282, linearLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1287)) {
            this.FLD1282.setVisibility(8);
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        for(Object object0: this.FLD1283) {
            try {
                if(object0 instanceof CLS145) {
                    view0 = ((CLS145)object0).MTH2173();
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
                CLS133.MTH2113(throwable0);
            }
        }
        linearLayout0.setVisibility(this.FLD1289);
        return linearLayout0;
    }
}

