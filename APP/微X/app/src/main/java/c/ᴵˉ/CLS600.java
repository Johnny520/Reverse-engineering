// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS226;
import c.ﹶˆ.CLS341;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLS600 implements CLS341 {
    public TextView FLD1187;
    public String FLD1188;
    public boolean FLD1189;
    public TextView FLD1190;
    public TextView FLD1191;
    public View FLD1192;
    public int FLD1193;
    public String FLD1194;
    public String FLD1195;
    public final ArrayList FLD1196;
    public View FLD1197;
    public final WeakReference FLD1198;

    public CLS600(Activity activity0) {
        this.FLD1193 = 0;
        this.FLD1198 = new WeakReference(activity0);
        this.FLD1196 = new ArrayList();
    }

    public void MTH3692(View view0) {
        this.FLD1196.add(view0);
    }

    public final View MTH3693() {
        LinearLayout.LayoutParams linearLayout$LayoutParams0;
        Activity activity0 = (Activity)this.FLD1198.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS144.MTH2162());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS144.MTH2162());
        TextView textView0 = new TextView(activity0);
        this.FLD1190 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1190.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1190, this.FLD1194);
        this.FLD1190.setTextColor(CLS226.MTH3099());
        this.FLD1190.setPadding(0, CLS144.MTH2175(10), 0, CLS144.MTH2175(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1190, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        this.FLD1187 = textView1;
        textView1.setTextSize(2, 14.0f);
        this.FLD1187.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1187, this.FLD1188);
        this.FLD1187.setTextColor(CLS226.MTH3098());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1190.getId());
        this.FLD1187.setPadding(CLS144.MTH2175(5), 0, 0, 0);
        relativeLayout1.addView(this.FLD1187, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1188)) {
            this.FLD1187.setVisibility(8);
        }
        TextView textView2 = new TextView(activity0);
        this.FLD1191 = textView2;
        textView2.setTextSize(2, 16.0f);
        this.FLD1191.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1191, this.FLD1195);
        this.FLD1191.setTextColor(CLS226.MTH3110());
        this.FLD1191.setPadding(0, CLS144.MTH2175(10), 0, CLS144.MTH2175(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1191, relativeLayout$LayoutParams2);
        if(TextUtils.isEmpty(this.FLD1194) && TextUtils.isEmpty(this.FLD1195)) {
            this.FLD1190.setVisibility(8);
            this.FLD1191.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams3.addRule(3, this.FLD1187.getId());
        LinearLayout linearLayout1 = new LinearLayout(activity0);
        if(this.FLD1189) {
            linearLayout1.setGravity(17);
        }
        else {
            linearLayout1.setGravity(0x30);
        }
        linearLayout1.setOrientation(1);
        linearLayout1.setPadding(0, CLS144.MTH2175(5), 0, 0);
        if(this.FLD1189) {
            linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
            linearLayout$LayoutParams0.gravity = 17;
        }
        else {
            linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        }
        for(Object object0: this.FLD1196) {
            View view0 = (View)object0;
            if(view0 != null) {
                view0.setPadding(0, 0, 0, CLS144.MTH2175(3));
                linearLayout1.addView(view0, linearLayout$LayoutParams0);
            }
        }
        relativeLayout1.addView(linearLayout1, relativeLayout$LayoutParams3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS226.MTH3105());
        linearLayout0.setVisibility(this.FLD1193);
        return linearLayout0;
    }

    public void MTH3694(View[] arr_view) {
        List list0 = Arrays.asList(arr_view);
        this.FLD1196.addAll(list0);
    }

    public void MTH3695() {
        this.FLD1189 = true;
    }

    @Override  // c.ﹶˆ.CLS341
    public void MTH4822(View view0) {
        this.FLD1197 = view0;
        view0.setVisibility(this.FLD1193);
    }

    @Override  // c.ﹶˆ.CLS341
    public View MTH4823() {
        if(this.FLD1192 == null) {
            this.FLD1192 = this.MTH3693();
        }
        return this.FLD1192;
    }
}

