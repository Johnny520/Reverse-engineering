// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

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
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS528;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class CLS347 extends BaseAdapter implements Filterable {
    public static final class CLS346 {
        public TextView FLD3378;
        public TextView FLD3379;
        public TextView FLD3380;

    }

    public final WeakReference FLD3381;
    public ArrayList FLD3382;
    public final HashMap FLD3383;
    public ArrayList FLD3384;

    public CLS347(Activity activity0, ArrayList arrayList0) {
        this.FLD3381 = new WeakReference(activity0);
        this.FLD3383 = new HashMap();
        this.FLD3382 = arrayList0;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3382.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS345 extends Filter {
            public final CLS347 FLD3377;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                String s3;
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS347 ᐧי0 = CLS347.this;
                if(ᐧי0.FLD3384 == null) {
                    ᐧי0.FLD3384 = ᐧי0.FLD3382;
                }
                if(charSequence0 != null) {
                    if(ᐧי0.FLD3384 != null && ᐧי0.FLD3384.size() > 0) {
                        Iterator iterator0 = ᐧי0.FLD3384.iterator();
                        while(iterator0.hasNext()) {
                            String s = "";
                            Object object0 = iterator0.next();
                            String s1 = (String)object0;
                            String s2 = "";
                            new String("");
                            new String("");
                            new String("");
                            if(!TextUtils.isEmpty(s1)) {
                                if(!s1.contains("[[") || !s1.contains("]]")) {
                                    s3 = s1;
                                }
                                else {
                                    int v = s1.indexOf("[[");
                                    int v1 = s1.lastIndexOf("]]");
                                    s3 = CLS182.MTH3495(s1, 0, v, new StringBuilder(), v1, 2);
                                    s = s1.substring(v + 2, v1);
                                }
                                String s4 = "";
                                if(s3.contains("{") && s3.contains("}")) {
                                    int v2 = s3.indexOf("{");
                                    int v3 = s3.lastIndexOf("}");
                                    s4 = s3.substring(v2 + 1, v3);
                                    s3 = CLS182.MTH3495(s3, 0, v2, new StringBuilder(), v3, 1);
                                }
                                String s5 = "";
                                if(s3.contains("((") && s3.contains("))")) {
                                    int v4 = s3.indexOf("((");
                                    int v5 = s3.lastIndexOf("))");
                                    String s6 = s3.substring(v4 + 2, v5);
                                    s3 = CLS182.MTH3495(s3, 0, v4, new StringBuilder(), v5, 2);
                                    s5 = s6;
                                }
                                s4.trim();
                                s.trim();
                                s5.trim();
                                s2 = s3.trim();
                            }
                            if(CLS502.MTH6940(s2, new CharSequence[]{charSequence0})) {
                                arrayList0.add(s1);
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS347.this.FLD3382 = (ArrayList)filter$FilterResults0.values;
                CLS347.this.notifyDataSetChanged();
            }
        }

        return new CLS345(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3382.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS346 ᐧי$ᵔʾ0;
        try {
            if(view0 == null) {
                ᐧי$ᵔʾ0 = new CLS346();
                view0 = this.MTH5177(ᐧי$ᵔʾ0);
                view0.setPadding(CLS523.MTH7137(11), 0, CLS523.MTH7137(10), CLS523.MTH7137(10));
                view0.setTag(ᐧי$ᵔʾ0);
            }
            else {
                ᐧי$ᵔʾ0 = (CLS346)view0.getTag();
            }
            this.MTH5178(ᐧי$ᵔʾ0, v);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return view0;
    }

    public final RelativeLayout MTH5177(CLS346 ᐧי$ᵔʾ0) {
        Activity activity0 = (Activity)this.FLD3381.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS523.MTH7138());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS523.MTH7138());
        TextView textView0 = new TextView(activity0);
        textView0.setTextSize(2, 17.0f);
        textView0.setId(CLS523.MTH7138());
        textView0.setTextColor(CLS522.MTH7109());
        textView0.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams0, 10, 9);
        relativeLayout1.addView(textView0, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        textView1.setTextSize(2, 14.0f);
        textView1.setId(CLS523.MTH7138());
        textView1.setTextColor(CLS522.MTH7116());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, textView0.getId());
        textView1.setPadding(CLS523.MTH7137(5), 0, 0, 0);
        relativeLayout1.addView(textView1, relativeLayout$LayoutParams1);
        TextView textView2 = new TextView(activity0);
        textView2.setTextSize(2, 16.0f);
        textView2.setId(CLS523.MTH7138());
        textView2.setTextColor(CLS522.MTH7117());
        textView2.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams2, 10, 11);
        relativeLayout1.addView(textView2, relativeLayout$LayoutParams2);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams3.addRule(10, relativeLayout0.getId());
        relativeLayout1.setPadding(0, 0, CLS523.MTH7137(15), 0);
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        CLS523.MTH7152(linearLayout0, CLS518.MTH7062(CLS522.MTH7118()));
        ᐧי$ᵔʾ0.FLD3378 = textView0;
        ᐧי$ᵔʾ0.FLD3379 = textView1;
        ᐧי$ᵔʾ0.FLD3380 = textView2;
        return relativeLayout0;
    }

    public final void MTH5178(CLS346 ᐧי$ᵔʾ0, int v) {
        CLS528 ʽי0;
        try {
            String s = (String)this.getItem(v);
            HashMap hashMap0 = this.FLD3383;
            if(hashMap0.containsKey(s)) {
                ʽי0 = (CLS528)hashMap0.get(s);
            }
            else {
                CLS528 ʽי1 = new CLS528(s);
                hashMap0.put(s, ʽי1);
                ʽי0 = ʽי1;
            }
            CLS523.MTH7155(ᐧי$ᵔʾ0.FLD3378, ʽי0.FLD5165);
            if(TextUtils.isEmpty(ʽי0.FLD5167)) {
                ᐧי$ᵔʾ0.FLD3379.setVisibility(8);
            }
            else {
                CLS523.MTH7155(ᐧי$ᵔʾ0.FLD3379, ʽי0.FLD5167);
            }
            if(!TextUtils.isEmpty(ʽי0.FLD5166)) {
                CLS523.MTH7155(ᐧי$ᵔʾ0.FLD3380, ʽי0.FLD5166);
                return;
            }
            ᐧי$ᵔʾ0.FLD3380.setVisibility(8);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

