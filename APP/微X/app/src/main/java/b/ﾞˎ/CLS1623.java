// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

public final class CLS1623 implements CLS18 {
    public boolean FLD5259;
    public TextView FLD5260;
    public boolean FLD5261;
    public final ArrayList FLD5262;
    public LinearLayout FLD5263;
    public String FLD5264;
    public final WeakReference FLD5265;
    public String FLD5266;
    public TextView FLD5267;
    public int FLD5268;

    public CLS1623(Activity activity0) {
        this.FLD5268 = 0;
        this.FLD5261 = false;
        this.FLD5259 = true;
        this.FLD5265 = new WeakReference(activity0);
        this.FLD5262 = new ArrayList();
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5267 == null ? this.FLD5264 : CLS502.MTH6936(this.FLD5267.getText());
    }

    public final void MTH7289(Object[] arr_object) {
        Collections.addAll(this.FLD5262, arr_object);
    }

    public final void MTH7290(LinearLayout linearLayout0, int v) {
        if(this.FLD5262.isEmpty()) {
            return;
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)this), v);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5266 = s;
        CLS523.MTH7155(this.FLD5260, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5263.setBackgroundColor(CLS522.MTH7112());
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS18
    public final void MTH800(String s) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        new String("");
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s1 = s.substring(v + 2, v1);
                s = CLS182.MTH3495(s, 0, v, new StringBuilder(), v1, 2);
            }
            String s4 = s;
            String s5 = "";
            if(s4.contains("{") && s4.contains("}")) {
                int v2 = s4.indexOf("{");
                int v3 = s4.lastIndexOf("}");
                s5 = s4.substring(v2 + 1, v3);
                s4 = CLS182.MTH3495(s4, 0, v2, new StringBuilder(), v3, 1);
            }
            String s6 = "";
            if(s4.contains("((") && s4.contains("))")) {
                int v4 = s4.indexOf("((");
                int v5 = s4.lastIndexOf("))");
                s6 = s4.substring(v4 + 2, v5);
                s4 = CLS182.MTH3495(s4, 0, v4, new StringBuilder(), v5, 2);
            }
            s5.trim();
            s6.trim();
            s3 = s1.trim();
            s2 = s4.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.MTH798(s3);
        }
        this.FLD5264 = s2;
        CLS523.MTH7155(this.FLD5267, s2);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5268 = v;
        LinearLayout linearLayout0 = this.FLD5263;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
    }

    public final void MTH7296(Object object0) {
        this.FLD5262.add(object0);
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        View view1;
        if(this.FLD5263 == null) {
            Activity activity0 = (Activity)this.FLD5265.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            TextView textView0 = new TextView(activity0);
            this.FLD5267 = textView0;
            CLS523.MTH7155(textView0, this.FLD5264);
            this.FLD5267.setTextSize(2, 14.0f);
            this.FLD5267.setTextColor(Color.parseColor(CLS370.MTH5289((CLS522.MTH7114() ? 0x38EA890E2B3CD335L : 4101241138981950261L))));
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout$LayoutParams0.setMargins(CLS523.MTH7137(4), 0, 0, 0);
            linearLayout0.addView(this.FLD5267, linearLayout$LayoutParams0);
            if(TextUtils.isEmpty(this.FLD5264)) {
                this.FLD5267.setVisibility(8);
            }
            TextView textView1 = new TextView(activity0);
            this.FLD5260 = textView1;
            CLS523.MTH7155(textView1, this.FLD5266);
            this.FLD5260.setTextSize(2, 12.0f);
            this.FLD5260.setBackgroundColor(CLS522.MTH7118());
            this.FLD5260.setTextColor(CLS522.MTH7116());
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
            this.FLD5260.setPadding(CLS523.MTH7137(10), 0, 0, 0);
            linearLayout0.addView(this.FLD5260, linearLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5266)) {
                this.FLD5260.setVisibility(8);
            }
            LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, 1);
            LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            int v = CLS523.MTH7137(10);
            for(Object object0: this.FLD5262) {
                try {
                    if(object0 instanceof CLS1617) {
                        if(((CLS1617)object0).FLD5151) {
                            View view0 = ((CLS1617)object0).MTH803();
                            if(this.FLD5261) {
                                view0.setPadding(CLS523.MTH7137(11), 0, CLS523.MTH7137(10), CLS523.MTH7137(2));
                            }
                            else {
                                view0.setPadding(CLS523.MTH7137(11), 0, CLS523.MTH7137(10), v);
                            }
                            linearLayout0.addView(view0, linearLayout$LayoutParams3);
                            goto label_63;
                        }
                        else if(((CLS1617)object0).FLD5152) {
                            LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                            linearLayout$LayoutParams4.setMargins(0, CLS523.MTH7137(2), 0, CLS523.MTH7137(2));
                            View view2 = ((CLS1617)object0).MTH803();
                            view2.setPadding(0, 0, 0, v);
                            linearLayout0.addView(view2, linearLayout$LayoutParams4);
                            goto label_63;
                        }
                        else {
                            view1 = ((CLS1617)object0).MTH803();
                            goto label_62;
                        }
                        goto label_50;
                    }
                    else {
                    label_50:
                        if(object0 instanceof CLS1623) {
                            view1 = ((CLS1623)object0).MTH803();
                        }
                        else {
                            if(object0 instanceof CLS18) {
                                view1 = ((CLS18)object0).MTH803();
                            }
                            else {
                                view1 = object0 instanceof View ? ((View)object0) : null;
                            }
                            if(view1 == null) {
                                continue;
                            }
                            if(this.FLD5261) {
                                view1.setPadding(CLS523.MTH7137(11), 0, CLS523.MTH7137(10), CLS523.MTH7137(2));
                            }
                            else {
                                view1.setPadding(CLS523.MTH7137(11), 0, CLS523.MTH7137(10), v);
                            }
                        }
                    }
                label_62:
                    linearLayout0.addView(view1, linearLayout$LayoutParams3);
                label_63:
                    if(!this.FLD5259) {
                        continue;
                    }
                    View view3 = new View(activity0);
                    view3.setBackgroundColor(Color.parseColor(CLS370.MTH5289((CLS522.MTH7114() ? 4101241997975409461L : 4101242032335147829L))));
                    view3.setPadding(CLS523.MTH7137(11), 0, 0, 0);
                    linearLayout0.addView(view3, linearLayout$LayoutParams2);
                    if(!(object0 instanceof CLS18)) {
                        continue;
                    }
                    ((CLS18)object0).MTH802(view3);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            linearLayout0.setVisibility(this.FLD5268);
            this.FLD5263 = linearLayout0;
        }
        return this.FLD5263;
    }
}

