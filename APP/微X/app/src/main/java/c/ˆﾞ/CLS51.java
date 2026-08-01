// Decompiled by JEB v5.42.0.202606242140

package c.ˆﾞ;

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
import c.ˊﹶ.CLS98;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS169;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS226;
import c.ᴵˉ.CLS284;
import c.ᴵˉ.CLS287;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class CLS51 extends BaseAdapter implements Filterable {
    public static class CLS50 {
        public TextView FLD159;
        public View FLD160;
        public CLS287 FLD161;
        public TextView FLD162;
        public TextView FLD163;

        public CLS50() {
        }

        public CLS50(CLS49 ˋʼ$ⁱˋ0) {
        }
    }

    public ArrayList FLD164;
    public ArrayList FLD165;
    public final WeakReference FLD166;
    public final ArrayList FLD167;

    public CLS51(Activity activity0) {
        this.FLD166 = new WeakReference(activity0);
        this.FLD167 = new ArrayList();
        this.FLD164 = new ArrayList();
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return this.FLD164.size();
    }

    @Override  // android.widget.Filterable
    public Filter getFilter() {
        public class CLS49 extends Filter {
            public final CLS51 FLD158;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                if(!TextUtils.isEmpty(charSequence0)) {
                    String s = charSequence0.toString();
                    String s1 = s.toLowerCase();
                    for(Object object0: CLS51.this.FLD165) {
                        CLS284 ˊﹶ0 = new CLS284(((String)object0));
                        if("".contains(s1)) {
                            ˊﹶ0.MTH3668(s);
                            arrayList0.add("");
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                    return filter$FilterResults0;
                }
                filter$FilterResults0.values = CLS51.this.FLD167;
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                ArrayList arrayList0 = (ArrayList)filter$FilterResults0.values;
                if(arrayList0 == null) {
                    return;
                }
                CLS51.this.MTH929(arrayList0);
            }
        }

        return new CLS49(this);
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.FLD164.get(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS50 ˋʼ$ﾞⁱ0;
        try {
            if(view0 == null) {
                ˋʼ$ﾞⁱ0 = new CLS50(null);
                view0 = this.MTH928(ˋʼ$ﾞⁱ0);
                view0.setPadding(CLS144.MTH2175(11), 0, CLS144.MTH2175(10), CLS144.MTH2175(10));
                view0.setTag(ˋʼ$ﾞⁱ0);
            }
            else {
                ˋʼ$ﾞⁱ0 = (CLS50)view0.getTag();
            }
            this.MTH930(ˋʼ$ﾞⁱ0, v);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return view0;
    }

    // 此方法包含解密的字符串
    public final View MTH928(CLS50 ˋʼ$ﾞⁱ0) {
        Activity activity0 = (Activity)this.FLD166.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS144.MTH2162());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS144.MTH2162());
        TextView textView0 = new TextView(activity0);
        textView0.setTextSize(2, 17.0f);
        textView0.setId(CLS144.MTH2162());
        textView0.setTextColor(CLS226.MTH3099());
        textView0.setPadding(0, CLS144.MTH2175(10), 0, CLS144.MTH2175(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(textView0, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        textView1.setTextSize(2, 14.0f);
        textView1.setId(CLS144.MTH2162());
        textView1.setTextColor(CLS226.MTH3098());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, textView0.getId());
        textView1.setPadding(CLS144.MTH2175(5), 0, 0, 0);
        relativeLayout1.addView(textView1, relativeLayout$LayoutParams1);
        TextView textView2 = new TextView(activity0);
        textView2.setTextSize(2, 16.0f);
        textView2.setId(CLS144.MTH2162());
        textView2.setTextColor(CLS226.MTH3110());
        textView2.setPadding(0, CLS144.MTH2175(10), 0, CLS144.MTH2175(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(textView2, relativeLayout$LayoutParams2);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams3.addRule(10, relativeLayout0.getId());
        relativeLayout1.setPadding(0, 0, CLS144.MTH2175(15), 0);
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
        CLS287 ⁱˋ0 = new CLS287(activity0);
        ⁱˋ0.setId(CLS144.MTH2162());
        ⁱˋ0.setColor(CLS226.MTH3110());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(CLS144.MTH2175(24), CLS144.MTH2175(18));
        relativeLayout$LayoutParams4.addRule(11, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(13, relativeLayout0.getId());
        if(!CLS98.MTH1297().MTH994("preftext_disable_arrow", false)) {
            relativeLayout0.addView(ⁱˋ0, relativeLayout$LayoutParams4);
        }
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        CLS144.MTH2185(linearLayout0, CLS169.MTH2335(CLS226.MTH3105()));
        ˋʼ$ﾞⁱ0.FLD162 = textView0;
        ˋʼ$ﾞⁱ0.FLD159 = textView1;
        ˋʼ$ﾞⁱ0.FLD161 = ⁱˋ0;
        ˋʼ$ﾞⁱ0.FLD163 = textView2;
        ˋʼ$ﾞⁱ0.FLD160 = linearLayout0;
        return relativeLayout0;
    }

    public void MTH929(ArrayList arrayList0) {
        if(arrayList0 == null) {
            return;
        }
        this.FLD164 = arrayList0;
        this.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public final void MTH930(CLS50 ˋʼ$ﾞⁱ0, int v) {
        try {
            new CLS284(((String)this.getItem(v)));
            CLS144.MTH2197(ˋʼ$ﾞⁱ0.FLD162, "");
            ˋʼ$ﾞⁱ0.FLD159.setVisibility(8);
            ˋʼ$ﾞⁱ0.FLD163.setVisibility(8);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public void MTH931(ArrayList arrayList0) {
        this.FLD165 = arrayList0;
    }

    public void MTH933(ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            this.FLD167.clear();
            this.FLD167.addAll(arrayList0);
            this.MTH929(this.FLD167);
        }
    }
}

