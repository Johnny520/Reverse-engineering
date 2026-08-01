// Decompiled by JEB v5.42.0.202606242140

package c.ʾˆ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter.FilterResults;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c.ˈⁱ.CLS95;
import c.ـˉ.CLS172;
import c.ـˉ.CLS204;
import c.ـˉ.CLS258;
import c.ـˉ.CLS264;
import c.ٴˈ.CLS283;
import c.ٴˈ.CLS284;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class CLS59 extends BaseAdapter implements Filterable {
    public static class CLS57 {
        public TextView FLD205;
        public View FLD206;
        public TextView FLD207;
        public TextView FLD208;
        public CLS283 FLD209;

        public CLS57() {
        }

        public CLS57(CLS58 ᴵⁱ$ˆٴ0) {
        }
    }

    public final ArrayList FLD211;
    public final WeakReference FLD212;
    public ArrayList FLD213;
    public ArrayList FLD214;

    public CLS59(Activity activity0) {
        this.FLD212 = new WeakReference(activity0);
        this.FLD211 = new ArrayList();
        this.FLD213 = new ArrayList();
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return this.FLD213.size();
    }

    @Override  // android.widget.Filterable
    public Filter getFilter() {
        public class CLS58 extends Filter {
            public final CLS59 FLD210;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                if(!TextUtils.isEmpty(charSequence0)) {
                    String s = charSequence0.toString();
                    String s1 = s.toLowerCase();
                    for(Object object0: CLS59.this.FLD214) {
                        CLS284 ˈⁱ0 = new CLS284(((String)object0));
                        if("".contains(s1)) {
                            ˈⁱ0.MTH4229(s);
                            arrayList0.add("");
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                    return filter$FilterResults0;
                }
                filter$FilterResults0.values = CLS59.this.FLD211;
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                ArrayList arrayList0 = (ArrayList)filter$FilterResults0.values;
                if(arrayList0 == null) {
                    return;
                }
                CLS59.this.MTH1079(arrayList0);
            }
        }

        return new CLS58(this);
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.FLD213.get(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS57 ᴵⁱ$ʻᵢ0;
        try {
            if(view0 == null) {
                ᴵⁱ$ʻᵢ0 = new CLS57(null);
                view0 = this.MTH1081(ᴵⁱ$ʻᵢ0);
                view0.setPadding(CLS258.MTH3770(11), 0, CLS258.MTH3770(10), CLS258.MTH3770(10));
                view0.setTag(ᴵⁱ$ʻᵢ0);
            }
            else {
                ᴵⁱ$ʻᵢ0 = (CLS57)view0.getTag();
            }
            this.MTH1084(ᴵⁱ$ʻᵢ0, v);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return view0;
    }

    public void MTH1079(ArrayList arrayList0) {
        if(arrayList0 == null) {
            return;
        }
        this.FLD213 = arrayList0;
        this.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public final View MTH1081(CLS57 ᴵⁱ$ʻᵢ0) {
        Activity activity0 = (Activity)this.FLD212.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS258.MTH3807());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS258.MTH3807());
        TextView textView0 = new TextView(activity0);
        textView0.setTextSize(2, 17.0f);
        textView0.setId(CLS258.MTH3807());
        textView0.setTextColor(CLS172.MTH3033());
        textView0.setPadding(0, CLS258.MTH3770(10), 0, CLS258.MTH3770(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(textView0, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        textView1.setTextSize(2, 14.0f);
        textView1.setId(CLS258.MTH3807());
        textView1.setTextColor(CLS172.MTH3036());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, textView0.getId());
        textView1.setPadding(CLS258.MTH3770(5), 0, 0, 0);
        relativeLayout1.addView(textView1, relativeLayout$LayoutParams1);
        TextView textView2 = new TextView(activity0);
        textView2.setTextSize(2, 16.0f);
        textView2.setId(CLS258.MTH3807());
        textView2.setTextColor(CLS172.MTH3037());
        textView2.setPadding(0, CLS258.MTH3770(10), 0, CLS258.MTH3770(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(textView2, relativeLayout$LayoutParams2);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams3.addRule(10, relativeLayout0.getId());
        relativeLayout1.setPadding(0, 0, CLS258.MTH3770(15), 0);
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
        CLS283 ˆٴ0 = new CLS283(activity0);
        ˆٴ0.setId(CLS258.MTH3807());
        ˆٴ0.setColor(CLS172.MTH3037());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(CLS258.MTH3770(24), CLS258.MTH3770(18));
        relativeLayout$LayoutParams4.addRule(11, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(13, relativeLayout0.getId());
        if(!CLS95.MTH2031().MTH2725("\uD8E3reftext_disable_arrow", false)) {
            relativeLayout0.addView(ˆٴ0, relativeLayout$LayoutParams4);
        }
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        CLS258.MTH3785(linearLayout0, CLS264.MTH4104(CLS172.MTH3039()));
        ᴵⁱ$ʻᵢ0.FLD207 = textView0;
        ᴵⁱ$ʻᵢ0.FLD208 = textView1;
        ᴵⁱ$ʻᵢ0.FLD209 = ˆٴ0;
        ᴵⁱ$ʻᵢ0.FLD205 = textView2;
        ᴵⁱ$ʻᵢ0.FLD206 = linearLayout0;
        return relativeLayout0;
    }

    public void MTH1082(ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            this.FLD211.clear();
            this.FLD211.addAll(arrayList0);
            this.MTH1079(this.FLD211);
        }
    }

    public void MTH1083(ArrayList arrayList0) {
        this.FLD214 = arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH1084(CLS57 ᴵⁱ$ʻᵢ0, int v) {
        try {
            new CLS284(((String)this.getItem(v)));
            CLS258.MTH3751(ᴵⁱ$ʻᵢ0.FLD207, "");
            ᴵⁱ$ʻᵢ0.FLD208.setVisibility(8);
            ᴵⁱ$ʻᵢ0.FLD205.setVisibility(8);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }
}

