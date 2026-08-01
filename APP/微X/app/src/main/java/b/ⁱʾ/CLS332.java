// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter.FilterResults;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS86;
import b.ˈˈ.CLS92;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS332 extends BaseAdapter implements Filterable {
    public static final class CLS331 {
        public TextView FLD3323;

    }

    public final LayoutInflater FLD3324;
    public ArrayList FLD3325;
    public final CLS92 FLD3326;
    public final CLS371 FLD3327;
    public ArrayList FLD3328;

    public CLS332(Activity activity0, ArrayList arrayList0) {
        this.FLD3328 = arrayList0;
        this.FLD3324 = LayoutInflater.from(activity0);
        this.FLD3327 = CLS371.FLD3470;
        this.FLD3326 = new CLS92(5000L);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3328.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS330 extends Filter {
            public final CLS332 FLD3322;

            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS332 ˊﾞ0 = CLS332.this;
                if(ˊﾞ0.FLD3325 == null) {
                    ˊﾞ0.FLD3325 = ˊﾞ0.FLD3328;
                }
                if(charSequence0 != null) {
                    if(ˊﾞ0.FLD3325 != null && ˊﾞ0.FLD3325.size() > 0) {
                        for(Object object0: ˊﾞ0.FLD3325) {
                            CLS86 ٴـ0 = (CLS86)object0;
                            String s = ٴـ0.FLD346;
                            if(CLS502.MTH6938(s, new CharSequence[]{charSequence0}) || CLS502.MTH6938(ˊﾞ0.FLD3327.MTH5311(s), new CharSequence[]{charSequence0})) {
                                arrayList0.add(ٴـ0);
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS332.this.FLD3328 = (ArrayList)filter$FilterResults0.values;
                CLS332.MTH5094(CLS332.this);
            }
        }

        return new CLS330(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3328.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        int v2;
        TextView textView1;
        CLS331 ˊﾞ$ᵔʾ1;
        if(view0 == null) {
            int v1 = CLS523.MTH7137(16);
            View view1 = this.FLD3324.inflate(0x1090003, viewGroup0, false);
            TextView textView0 = (TextView)view1.findViewById(0x1020014);
            textView0.setTextColor(CLS522.MTH7109());
            textView0.setBackgroundColor(CLS522.MTH7118());
            textView0.setPadding(v1, v1, v1, v1);
            CLS331 ˊﾞ$ᵔʾ0 = new CLS331();
            ˊﾞ$ᵔʾ0.FLD3323 = textView0;
            view1.setTag(ˊﾞ$ᵔʾ0);
            ˊﾞ$ᵔʾ1 = ˊﾞ$ᵔʾ0;
            view0 = view1;
        }
        else {
            ˊﾞ$ᵔʾ1 = (CLS331)view0.getTag();
        }
        CLS86 ٴـ0 = (CLS86)this.FLD3328.get(v);
        if(ٴـ0.FLD344 == 1) {
            view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
            textView1 = ˊﾞ$ᵔʾ1.FLD3323;
            v2 = -1;
        }
        else {
            view0.setBackgroundColor(CLS522.MTH7118());
            textView1 = ˊﾞ$ᵔʾ1.FLD3323;
            v2 = CLS522.MTH7109();
        }
        textView1.setTextColor(v2);
        CLS92 ⁱʽ0 = this.FLD3326;
        String s = (String)ⁱʽ0.MTH1744(ٴـ0);
        if(TextUtils.isEmpty(s)) {
            String s1 = CLS372.MTH5417(ٴـ0.FLD346);
            s = "<i>" + CLS27.MTH889("chatroom_lbl") + "</i><br>" + CLS502.MTH6923(s1);
            ⁱʽ0.MTH1746(ٴـ0, s);
        }
        CLS523.MTH7155(ˊﾞ$ᵔʾ1.FLD3323, s);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.FLD3326.MTH1742();
        super.notifyDataSetChanged();
    }

    public static void MTH5094(CLS332 ˊﾞ0) {
        ˊﾞ0.super.notifyDataSetChanged();
    }
}

