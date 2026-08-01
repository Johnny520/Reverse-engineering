// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c.ˊﹶ.CLS98;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS169;
import c.ˏᵎ.CLS226;
import c.ﹶˆ.CLS341;
import java.lang.ref.WeakReference;

public class CLS597 implements CLS341 {
    public final TextView FLD1142;
    public View.OnClickListener FLD1143;
    public int FLD1144;
    public final WeakReference FLD1145;
    public boolean FLD1146;
    public final CLS287 FLD1147;
    public View FLD1148;
    public String FLD1149;
    public View FLD1150;
    public String FLD1151;
    public boolean FLD1152;
    public final TextView FLD1153;
    public String FLD1154;
    public final TextView FLD1155;

    // 此方法包含解密的字符串
    public CLS597(Activity activity0) {
        this.FLD1152 = true;
        this.FLD1144 = 0;
        this.FLD1146 = false;
        this.FLD1145 = new WeakReference(activity0);
        TextView textView0 = new TextView(activity0);
        this.FLD1153 = textView0;
        textView0.setTextColor(CLS226.MTH3099());
        TextView textView1 = new TextView(activity0);
        this.FLD1142 = textView1;
        textView1.setTextColor(CLS226.MTH3110());
        TextView textView2 = new TextView(activity0);
        this.FLD1155 = textView2;
        textView2.setTextColor(CLS226.MTH3098());
        this.FLD1147 = new CLS287(activity0);
        if(CLS98.MTH1297().MTH994("preftext_disable_arrow", false)) {
            this.FLD1152 = false;
        }
    }

    public final View MTH3636() {
        int v7;
        int v6;
        TextView textView1;
        int v2;
        int v1;
        TextView textView0;
        Activity activity0 = (Activity)this.FLD1145.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS144.MTH2162());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS144.MTH2162());
        this.FLD1153.setTextSize(2, 17.0f);
        int v = CLS144.MTH2162();
        this.FLD1153.setId(v);
        CLS144.MTH2197(this.FLD1153, this.FLD1149);
        if(this.FLD1146) {
            textView0 = this.FLD1153;
            v1 = CLS144.MTH2175(3);
            v2 = CLS144.MTH2175(1);
        }
        else {
            textView0 = this.FLD1153;
            v1 = CLS144.MTH2175(10);
            v2 = CLS144.MTH2175(5);
        }
        textView0.setPadding(0, v1, 0, v2);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1153, relativeLayout$LayoutParams0);
        this.FLD1155.setTextSize(2, 14.0f);
        int v3 = CLS144.MTH2162();
        this.FLD1155.setId(v3);
        CLS144.MTH2197(this.FLD1155, this.FLD1154);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1153.getId());
        int v4 = CLS144.MTH2175(5);
        this.FLD1155.setPadding(v4, 0, 0, 0);
        relativeLayout1.addView(this.FLD1155, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1154)) {
            this.FLD1155.setVisibility(8);
        }
        this.FLD1142.setTextSize(2, 16.0f);
        int v5 = CLS144.MTH2162();
        this.FLD1142.setId(v5);
        CLS144.MTH2197(this.FLD1142, this.FLD1151);
        if(this.FLD1146) {
            textView1 = this.FLD1142;
            v6 = CLS144.MTH2175(3);
            v7 = CLS144.MTH2175(2);
        }
        else {
            textView1 = this.FLD1142;
            v6 = CLS144.MTH2175(10);
            v7 = CLS144.MTH2175(5);
        }
        textView1.setPadding(0, v6, 0, v7);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1142, relativeLayout$LayoutParams2);
        if(TextUtils.isEmpty(this.FLD1149) && TextUtils.isEmpty(this.FLD1151)) {
            this.FLD1153.setVisibility(8);
            this.FLD1142.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams3.addRule(10, relativeLayout0.getId());
        relativeLayout1.setPadding(0, 0, CLS144.MTH2175(15), 0);
        int v8 = CLS144.MTH2162();
        this.FLD1147.setId(v8);
        int v9 = CLS226.MTH3110();
        this.FLD1147.setColor(v9);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(CLS144.MTH2175(18), CLS144.MTH2175(18));
        relativeLayout$LayoutParams4.addRule(11, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(13, relativeLayout0.getId());
        relativeLayout$LayoutParams4.setMargins(0, 0, CLS144.MTH2175(10), 0);
        if(this.FLD1152) {
            relativeLayout$LayoutParams3.setMargins(0, 0, CLS144.MTH2175(20), 0);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
            relativeLayout0.addView(this.FLD1147, relativeLayout$LayoutParams4);
        }
        else {
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
        }
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        View.OnClickListener view$OnClickListener0 = this.FLD1143;
        if(view$OnClickListener0 == null) {
            linearLayout0.setBackgroundColor(CLS226.MTH3105());
        }
        else {
            linearLayout0.setOnClickListener(view$OnClickListener0);
            CLS144.MTH2185(linearLayout0, CLS169.MTH2335(CLS226.MTH3105()));
        }
        linearLayout0.setVisibility(this.FLD1144);
        return linearLayout0;
    }

    public void MTH3637(String s) {
        this.FLD1151 = s;
        CLS144.MTH2197(this.FLD1142, s);
    }

    public void MTH3638() {
        if(this.FLD1152) {
            this.FLD1147.setRotation(90.0f);
        }
    }

    public void MTH3639() {
        if(this.FLD1152) {
            this.FLD1147.setRotation(-90.0f);
        }
    }

    public void MTH3640(int v) {
        this.FLD1144 = v;
        View view0 = this.FLD1148;
        if(view0 != null) {
            view0.setVisibility(v);
        }
        View view1 = this.FLD1150;
        if(view1 != null) {
            view1.setVisibility(v);
        }
    }

    public void MTH3641(String s) {
        this.FLD1154 = s;
        CLS144.MTH2197(this.FLD1155, s);
    }

    public void MTH3642(View.OnClickListener view$OnClickListener0) {
        this.FLD1143 = view$OnClickListener0;
        View view0 = this.FLD1148;
        if(view0 != null) {
            view0.setOnClickListener(view$OnClickListener0);
            CLS144.MTH2185(this.FLD1148, CLS169.MTH2335(CLS226.MTH3105()));
        }
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public void MTH3643(String s) {
        new CLS284(s);
        this.FLD1149 = "";
        CLS144.MTH2197(this.FLD1153, "");
    }

    @Override  // c.ﹶˆ.CLS341
    public void MTH4822(View view0) {
        this.FLD1150 = view0;
        view0.setVisibility(this.FLD1144);
    }

    public void MTH3645(boolean z) {
        this.FLD1152 = z;
    }

    @Override  // c.ﹶˆ.CLS341
    public View MTH4823() {
        if(this.FLD1148 == null) {
            this.FLD1148 = this.MTH3636();
        }
        return this.FLD1148;
    }
}

