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
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS92;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS326 extends BaseAdapter implements Filterable {
    public static final class CLS325 {
        public TextView FLD3309;

    }

    public final LayoutInflater FLD3310;
    public ArrayList FLD3311;
    public final CLS92 FLD3312;
    public ArrayList FLD3313;

    public CLS326(Activity activity0, ArrayList arrayList0) {
        this.FLD3313 = arrayList0;
        this.FLD3310 = LayoutInflater.from(activity0);
        this.FLD3312 = new CLS92(5000L);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3313.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS324 extends Filter {
            public final CLS326 FLD3308;

            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS326 ˉᐧ0 = CLS326.this;
                if(ˉᐧ0.FLD3311 == null) {
                    ˉᐧ0.FLD3311 = ˉᐧ0.FLD3313;
                }
                if(charSequence0 != null) {
                    if(ˉᐧ0.FLD3311 != null && ˉᐧ0.FLD3311.size() > 0) {
                        for(Object object0: ˉᐧ0.FLD3311) {
                            CLS82 יﹳ0 = (CLS82)object0;
                            if(CLS502.MTH6940(יﹳ0.FLD317, new CharSequence[]{charSequence0})) {
                                arrayList0.add(יﹳ0);
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS326.this.FLD3313 = (ArrayList)filter$FilterResults0.values;
                CLS326.this.notifyDataSetChanged();
            }
        }

        return new CLS324(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3313.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS325 ˉᐧ$ᵔʾ0;
        View view1;
        try {
            CLS92 ⁱʽ0 = this.FLD3312;
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                view1 = this.FLD3310.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS522.MTH7109());
                textView0.setBackgroundColor(CLS522.MTH7118());
                textView0.setPadding(v1, v1, v1, v1);
                ˉᐧ$ᵔʾ0 = new CLS325();
                ˉᐧ$ᵔʾ0.FLD3309 = textView0;
                try {
                    view1.setTag(ˉᐧ$ᵔʾ0);
                    view0 = view1;
                }
                catch(Throwable throwable0) {
                    goto label_27;
                }
            }
            else {
                ˉᐧ$ᵔʾ0 = (CLS325)view0.getTag();
            }
            CLS82 יﹳ0 = (CLS82)this.getItem(v);
            String s = (String)ⁱʽ0.MTH1744(יﹳ0);
            if(TextUtils.isEmpty(s)) {
                s = CLS326.MTH5070(יﹳ0);
                ⁱʽ0.MTH1746(יﹳ0, s);
            }
            CLS523.MTH7155(ˉᐧ$ᵔʾ0.FLD3309, s);
            return view0;
        }
        catch(Throwable throwable0) {
            view1 = view0;
        }
    label_27:
        CLS27.MTH893(throwable0);
        return view1;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.FLD3312.MTH1742();
        super.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public static String MTH5070(CLS82 יﹳ0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("<b>");
        stringBuilder0.append(יﹳ0.FLD317);
        stringBuilder0.append("</b><br>");
        stringBuilder0.append("(");
        int v = יﹳ0.MTH1678();
        int v1 = 0;
        if(v != 0) {
            int v2 = 0;
            while(v1 < v) {
                try {
                    v2 += ((JSONObject)יﹳ0.FLD313.get(v1)).getInt("length");
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                ++v1;
            }
            v1 = v2;
        }
        stringBuilder0.append(((double)v1) / 1000.0);
        stringBuilder0.append(CLS27.MTH889("second"));
        stringBuilder0.append(")");
        if(יﹳ0.MTH1678() > 1) {
            stringBuilder0.append("[");
            stringBuilder0.append(יﹳ0.MTH1678());
            stringBuilder0.append("]");
        }
        HashSet hashSet0 = יﹳ0.FLD316;
        if(!hashSet0.isEmpty() != 0) {
            stringBuilder0.append("<br><i>");
            stringBuilder0.append(TextUtils.join(",", hashSet0));
            stringBuilder0.append("</i>");
        }
        return stringBuilder0.toString();
    }
}

