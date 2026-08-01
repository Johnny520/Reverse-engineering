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
import java.util.Collections;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˑٴ.CLS114;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS145;

public final class CLS344 implements CLS145 {
    public TextView FLD1292;
    public final ArrayList FLD1293;
    public LinearLayout FLD1294;
    public String FLD1295;
    public final WeakReference FLD1296;
    public String FLD1297;
    public TextView FLD1298;
    public int FLD1299;

    public CLS344(Activity activity0) {
        this.FLD1299 = 0;
        this.FLD1296 = new WeakReference(activity0);
        this.FLD1293 = new ArrayList();
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1298 == null ? this.FLD1295 : this.FLD1298.getText().toString();
    }

    public final void MTH2475(LinearLayout linearLayout0, int v) {
        if(this.FLD1293.isEmpty()) {
            return;
        }
        CLS43.MTH1428(linearLayout0, ((CLS145)this), v);
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
            s5.trim();
            s6.trim();
            s3 = s1.trim();
            s2 = s4.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.FLD1297 = s3;
            CLS43.MTH1429(this.FLD1292, s3);
        }
        this.FLD1295 = s2;
        CLS43.MTH1429(this.FLD1298, s2);
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        View view0;
        if(this.FLD1294 == null) {
            Activity activity0 = (Activity)this.FLD1296.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            TextView textView0 = new TextView(activity0);
            this.FLD1298 = textView0;
            CLS43.MTH1429(textView0, this.FLD1295);
            this.FLD1298.setTextSize(2, 14.0f);
            this.FLD1298.setTextColor(Color.parseColor(CLS114.MTH1900((CLS46.MTH1455() ? 0xFFFFBB082B3CF2B7L : 0xFFFFBB002B3CF2B7L))));
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout$LayoutParams0.setMargins(CLS43.MTH1439(4), 0, 0, 0);
            linearLayout0.addView(this.FLD1298, linearLayout$LayoutParams0);
            if(TextUtils.isEmpty(this.FLD1295)) {
                this.FLD1298.setVisibility(8);
            }
            TextView textView1 = new TextView(activity0);
            this.FLD1292 = textView1;
            CLS43.MTH1429(textView1, this.FLD1297);
            this.FLD1292.setTextSize(2, 12.0f);
            this.FLD1292.setBackgroundColor(CLS46.MTH1446());
            this.FLD1292.setTextColor(CLS46.MTH1457());
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
            this.FLD1292.setPadding(CLS43.MTH1439(10), 0, 0, 0);
            linearLayout0.addView(this.FLD1292, linearLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD1297)) {
                this.FLD1292.setVisibility(8);
            }
            LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, 1);
            LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            int v = CLS43.MTH1439(10);
            for(Object object0: this.FLD1293) {
                try {
                    if(!(object0 instanceof CLS333)) {
                        if(object0 instanceof CLS344) {
                            view0 = ((CLS344)object0).MTH2173();
                        }
                        else {
                            if(object0 instanceof CLS145) {
                                view0 = ((CLS145)object0).MTH2173();
                            }
                            else {
                                view0 = object0 instanceof View ? ((View)object0) : null;
                            }
                            if(view0 == null) {
                                continue;
                            }
                            view0.setPadding(CLS43.MTH1439(11), 0, CLS43.MTH1439(10), v);
                        }
                        linearLayout0.addView(view0, linearLayout$LayoutParams3);
                    }
                    else if(((CLS333)object0).FLD1120) {
                        View view2 = ((CLS333)object0).MTH2173();
                        view2.setPadding(CLS43.MTH1439(11), 0, CLS43.MTH1439(10), v);
                        linearLayout0.addView(view2, linearLayout$LayoutParams3);
                    }
                    else if(((CLS333)object0).FLD1113) {
                        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        linearLayout$LayoutParams4.setMargins(0, CLS43.MTH1439(2), 0, CLS43.MTH1439(2));
                        View view1 = ((CLS333)object0).MTH2173();
                        view1.setPadding(0, 0, 0, v);
                        linearLayout0.addView(view1, linearLayout$LayoutParams4);
                    }
                    else {
                        linearLayout0.addView(((CLS333)object0).MTH2173(), linearLayout$LayoutParams3);
                    }
                    View view3 = new View(activity0);
                    view3.setBackgroundColor(CLS46.MTH1456());
                    view3.setPadding(CLS43.MTH1439(11), 0, 0, 0);
                    linearLayout0.addView(view3, linearLayout$LayoutParams2);
                    if(!(object0 instanceof CLS145)) {
                        continue;
                    }
                    ((CLS145)object0).MTH2174(view3);
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
            linearLayout0.setVisibility(this.FLD1299);
            this.FLD1294 = linearLayout0;
        }
        return this.FLD1294;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1299 = v;
        LinearLayout linearLayout0 = this.FLD1294;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1294.setBackgroundColor(CLS46.MTH1445());
    }

    public final void MTH2481(Object[] arr_object) {
        Collections.addAll(this.FLD1293, arr_object);
    }

    public final void MTH2482(CLS145 ٴـ0) {
        this.FLD1293.add(ٴـ0);
    }
}

