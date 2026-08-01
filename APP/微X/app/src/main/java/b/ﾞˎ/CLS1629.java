// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ˑٴ.CLS129;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class CLS1629 implements CLS18 {
    public interface CLS548 {
        void MTH7368(String arg1);
    }

    public boolean FLD5352;
    public LinearLayout FLD5353;
    public int FLD5354;
    public final RadioGroup FLD5355;
    public CLS548 FLD5356;
    public String FLD5357;
    public View FLD5358;
    public final WeakReference FLD5359;
    public boolean FLD5360;
    public final ArrayList FLD5361;
    public String FLD5362;
    public TextView FLD5363;
    public TextView FLD5364;

    public CLS1629(Activity activity0) {
        this.FLD5354 = 0;
        this.FLD5360 = false;
        this.FLD5359 = new WeakReference(activity0);
        this.FLD5361 = new ArrayList();
        this.FLD5355 = new RadioGroup(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5364 == null ? this.FLD5362 : CLS502.MTH6936(this.FLD5364.getText());
    }

    public final boolean MTH7371(String s) {
        for(Object object0: this.FLD5361) {
            RadioButton radioButton0 = (RadioButton)object0;
            if(((String)radioButton0.getTag()).equals(s)) {
                return radioButton0.isChecked();
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final void MTH7372(String s, String s1) {
        RadioButton radioButton0 = new RadioButton(((Context)this.FLD5359.get()));
        radioButton0.setText(s);
        radioButton0.setTag(s1);
        radioButton0.setTextColor(CLS522.MTH7109());
        this.FLD5355.addView(radioButton0);
        this.FLD5361.add(radioButton0);
    }

    public final String MTH7373() {
        for(Object object0: this.FLD5361) {
            RadioButton radioButton0 = (RadioButton)object0;
            if(radioButton0.isChecked()) {
                return (String)radioButton0.getTag();
            }
            if(false) {
                break;
            }
        }
        return "";
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5357 = s;
        CLS523.MTH7155(this.FLD5363, s);
    }

    public final void MTH7375(String s) {
        for(Object object0: this.FLD5361) {
            RadioButton radioButton0 = (RadioButton)object0;
            if(((String)radioButton0.getTag()).equals(s)) {
                radioButton0.setChecked(true);
                return;
            }
            if(false) {
                break;
            }
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5353.setBackgroundColor(CLS522.MTH7112());
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
        this.FLD5362 = s2;
        CLS523.MTH7155(this.FLD5364, s2);
    }

    public final void MTH7378(String s) {
        for(Object object0: this.FLD5361) {
            RadioButton radioButton0 = (RadioButton)object0;
            if(((String)radioButton0.getTag()).equals(s)) {
                radioButton0.setVisibility(8);
                return;
            }
            if(false) {
                break;
            }
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5354 = v;
        LinearLayout linearLayout0 = this.FLD5353;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD5358;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5358 = view0;
        view0.setVisibility(this.FLD5354);
    }

    public final void MTH7381(String s) {
        this.MTH7372(CLS27.MTH889(s), s);
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        int v1;
        int v;
        TextView textView1;
        if(this.FLD5353 == null) {
            Activity activity0 = (Activity)this.FLD5359.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS523.MTH7138());
            TextView textView0 = new TextView(activity0);
            this.FLD5364 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD5364.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5364, this.FLD5362);
            this.FLD5364.setTextColor(CLS522.MTH7109());
            if(this.FLD5360) {
                textView1 = this.FLD5364;
                v = CLS523.MTH7137(3);
                v1 = CLS523.MTH7137(1);
            }
            else {
                textView1 = this.FLD5364;
                v = CLS523.MTH7137(10);
                v1 = CLS523.MTH7137(5);
            }
            textView1.setPadding(0, v, 0, v1);
            if(TextUtils.isEmpty(this.FLD5362)) {
                this.FLD5364.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams0, 10, 9);
            relativeLayout1.addView(this.FLD5364, relativeLayout$LayoutParams0);
            TextView textView2 = new TextView(activity0);
            this.FLD5363 = textView2;
            textView2.setTextSize(2, 14.0f);
            this.FLD5363.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5363, this.FLD5357);
            this.FLD5363.setTextColor(CLS522.MTH7116());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD5364.getId());
            this.FLD5363.setPadding(CLS523.MTH7137(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD5363, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5357)) {
                this.FLD5363.setVisibility(8);
            }
            RadioGroup radioGroup0 = this.FLD5355;
            if(this.FLD5352) {
                radioGroup0.setOrientation(1);
                radioGroup0.setGravity(16);
            }
            else {
                radioGroup0.setOrientation(0);
                radioGroup0.setGravity(1);
            }
            if(this.FLD5356 != null) {
                radioGroup0.setOnCheckedChangeListener(new CLS129(2, this));
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams2.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(3, this.FLD5363.getId());
            if(TextUtils.isEmpty(this.FLD5362) && TextUtils.isEmpty(this.FLD5357)) {
                if(this.FLD5360) {
                    radioGroup0.setPadding(0, CLS523.MTH7137(3), 0, CLS523.MTH7137(1));
                }
                else {
                    radioGroup0.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
                }
            }
            relativeLayout1.addView(radioGroup0, relativeLayout$LayoutParams2);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout0, relativeLayout$LayoutParams3, 9, 10);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS522.MTH7118());
            linearLayout0.setVisibility(this.FLD5354);
            this.FLD5353 = linearLayout0;
        }
        return this.FLD5353;
    }
}

