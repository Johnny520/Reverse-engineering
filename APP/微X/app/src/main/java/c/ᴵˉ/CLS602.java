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
import android.widget.SeekBar;
import android.widget.TextView;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS226;
import c.ﹶˆ.CLS341;
import java.lang.ref.WeakReference;

public class CLS602 implements CLS341 {
    public TextView FLD1212;
    public String FLD1213;
    public boolean FLD1214;
    public TextView FLD1215;
    public View.OnClickListener FLD1216;
    public TextView FLD1217;
    public View FLD1218;
    public int FLD1219;
    public String FLD1220;
    public String FLD1221;
    public final SeekBar FLD1222;
    public View FLD1223;
    public final WeakReference FLD1224;

    public CLS602(Activity activity0) {
        this.FLD1219 = 0;
        this.FLD1214 = false;
        this.FLD1224 = new WeakReference(activity0);
        this.FLD1222 = new SeekBar(activity0);
    }

    public final View MTH3710() {
        int v1;
        int v;
        Activity activity0 = (Activity)this.FLD1224.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS144.MTH2162());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS144.MTH2162());
        TextView textView0 = new TextView(activity0);
        this.FLD1215 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1215.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1215, this.FLD1220);
        this.FLD1215.setTextColor(CLS226.MTH3099());
        if(this.FLD1214) {
            this.FLD1215.setPadding(0, CLS144.MTH2175(1), 0, 0);
        }
        else {
            this.FLD1215.setPadding(0, CLS144.MTH2175(10), 0, CLS144.MTH2175(5));
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1215, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        this.FLD1212 = textView1;
        textView1.setTextSize(2, 14.0f);
        this.FLD1212.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1212, this.FLD1213);
        this.FLD1212.setTextColor(CLS226.MTH3098());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1215.getId());
        this.FLD1212.setPadding(CLS144.MTH2175(5), 0, 0, 0);
        relativeLayout1.addView(this.FLD1212, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1213)) {
            this.FLD1212.setVisibility(8);
        }
        TextView textView2 = new TextView(activity0);
        this.FLD1217 = textView2;
        textView2.setTextSize(2, 16.0f);
        this.FLD1217.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1217, this.FLD1221);
        this.FLD1217.setTextColor(CLS226.MTH3110());
        if(this.FLD1214) {
            this.FLD1217.setPadding(0, CLS144.MTH2175(1), 0, 0);
        }
        else {
            this.FLD1217.setPadding(0, CLS144.MTH2175(10), 0, CLS144.MTH2175(5));
        }
        View.OnClickListener view$OnClickListener0 = this.FLD1216;
        if(view$OnClickListener0 != null) {
            this.FLD1217.setOnClickListener(view$OnClickListener0);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1217, relativeLayout$LayoutParams2);
        if(TextUtils.isEmpty(this.FLD1220) && TextUtils.isEmpty(this.FLD1221)) {
            this.FLD1215.setVisibility(8);
            this.FLD1217.setVisibility(8);
            if(!this.FLD1214) {
                v = CLS144.MTH2175(10);
                v1 = CLS144.MTH2175(5);
                this.FLD1222.setPadding(0, v, 0, v1);
            }
        }
        else if(!this.FLD1214) {
            v = CLS144.MTH2175(5);
            v1 = CLS144.MTH2175(3);
            this.FLD1222.setPadding(0, v, 0, v1);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams3.addRule(3, this.FLD1212.getId());
        int v2 = CLS144.MTH2162();
        this.FLD1222.setId(v2);
        relativeLayout1.addView(this.FLD1222, relativeLayout$LayoutParams3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS226.MTH3105());
        linearLayout0.setVisibility(this.FLD1219);
        return linearLayout0;
    }

    public SeekBar MTH3711() {
        return this.FLD1222;
    }

    @Override  // c.ﹶˆ.CLS341
    public void MTH4822(View view0) {
        this.FLD1223 = view0;
        view0.setVisibility(this.FLD1219);
    }

    @Override  // c.ﹶˆ.CLS341
    public View MTH4823() {
        if(this.FLD1218 == null) {
            this.FLD1218 = this.MTH3710();
        }
        return this.FLD1218;
    }
}

