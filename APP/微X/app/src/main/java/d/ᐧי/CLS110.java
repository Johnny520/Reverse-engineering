// Decompiled by JEB v5.42.0.202606242140

package d.ᐧי;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.ˑʽ.CLS5;
import d.יʻ.CLS69;
import d.ٴˑ.CLS99;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class CLS110 extends BaseAdapter {
    public static final class CLS109 {
        public TextView FLD629;
        public TextView FLD630;
        public TextView FLD631;

    }

    public final HashMap FLD632;
    public final WeakReference FLD633;
    public final ArrayList FLD634;

    public CLS110(Activity activity0, ArrayList arrayList0) {
        this.FLD633 = new WeakReference(activity0);
        this.FLD632 = new HashMap();
        this.FLD634 = arrayList0;
    }

    public CLS110(Activity activity0, Set set0) {
        this(activity0, new ArrayList(set0));
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD634.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD634.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS109 ٴˑ$ᐧי0;
        try {
            if(view0 == null) {
                ٴˑ$ᐧי0 = new CLS109();
                view0 = this.MTH1114(ٴˑ$ᐧי0);
                view0.setPadding(CLS45.MTH662(11), 0, CLS45.MTH662(10), CLS45.MTH662(10));
                view0.setTag(ٴˑ$ᐧי0);
            }
            else {
                ٴˑ$ᐧי0 = (CLS109)view0.getTag();
            }
            this.MTH1113(ٴˑ$ᐧי0, v);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return view0;
    }

    public final void MTH1113(CLS109 ٴˑ$ᐧי0, int v) {
        CLS99 ﹶᵎ0;
        try {
            String s = (String)this.getItem(v);
            HashMap hashMap0 = this.FLD632;
            if(hashMap0.containsKey(s)) {
                ﹶᵎ0 = (CLS99)hashMap0.get(s);
            }
            else {
                CLS99 ﹶᵎ1 = new CLS99(s);
                hashMap0.put(s, ﹶᵎ1);
                ﹶᵎ0 = ﹶᵎ1;
            }
            String s1 = ﹶᵎ0.FLD573;
            CLS45.MTH658(ٴˑ$ᐧי0.FLD630, ﹶᵎ0.FLD571);
            if(TextUtils.isEmpty(ﹶᵎ0.FLD570)) {
                ٴˑ$ᐧי0.FLD631.setVisibility(8);
            }
            else {
                CLS45.MTH658(ٴˑ$ᐧי0.FLD631, ﹶᵎ0.FLD570);
            }
            if(!TextUtils.isEmpty(s1)) {
                CLS45.MTH658(ٴˑ$ᐧי0.FLD629, s1);
                return;
            }
            ٴˑ$ᐧי0.FLD629.setVisibility(8);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }

    public final RelativeLayout MTH1114(CLS109 ٴˑ$ᐧי0) {
        Activity activity0 = (Activity)this.FLD633.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS45.MTH668());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS45.MTH668());
        TextView textView0 = new TextView(activity0);
        textView0.setTextSize(2, 17.0f);
        textView0.setId(CLS45.MTH668());
        textView0.setTextColor(CLS43.MTH646());
        textView0.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(textView0, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        textView1.setTextSize(2, 14.0f);
        textView1.setId(CLS45.MTH668());
        textView1.setTextColor(CLS43.MTH640());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, textView0.getId());
        textView1.setPadding(CLS45.MTH662(5), 0, 0, 0);
        relativeLayout1.addView(textView1, relativeLayout$LayoutParams1);
        TextView textView2 = new TextView(activity0);
        textView2.setTextSize(2, 16.0f);
        textView2.setId(CLS45.MTH668());
        textView2.setTextColor(CLS43.MTH641());
        textView2.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(textView2, relativeLayout$LayoutParams2);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams3.addRule(10, relativeLayout0.getId());
        relativeLayout1.setPadding(0, 0, CLS45.MTH662(15), 0);
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        CLS45.MTH657(linearLayout0, CLS5.MTH400(CLS43.MTH644()));
        ٴˑ$ᐧי0.FLD630 = textView0;
        ٴˑ$ᐧי0.FLD631 = textView1;
        ٴˑ$ᐧי0.FLD629 = textView2;
        return relativeLayout0;
    }
}

