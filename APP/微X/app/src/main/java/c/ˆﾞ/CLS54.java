// Decompiled by JEB v5.42.0.202606242140

package c.ˆﾞ;

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
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS226;
import java.util.ArrayList;

public class CLS54 extends BaseAdapter implements Filterable {
    public static class CLS53 {
        public TextView FLD170;

        public CLS53() {
        }

        public CLS53(CLS52 ﾞʿ$ⁱˋ0) {
        }
    }

    public ArrayList FLD171;
    public String FLD172;
    public final LayoutInflater FLD173;
    public ArrayList FLD174;

    public CLS54(Activity activity0, ArrayList arrayList0) {
        this.FLD171 = arrayList0;
        this.FLD173 = LayoutInflater.from(activity0);
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return this.FLD171.size();
    }

    @Override  // android.widget.Filterable
    public Filter getFilter() {
        public class CLS52 extends Filter {
            public final CLS54 FLD169;

            @Override  // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                if(CLS54.this.FLD174 == null) {
                    CLS54.this.FLD174 = CLS54.this.FLD171;
                }
                if(charSequence0 != null) {
                    if(CLS54.this.FLD174 != null && CLS54.this.FLD174.size() > 0) {
                        for(Object object0: CLS54.this.FLD174) {
                            String s = (String)object0;
                            if(s.toLowerCase().contains(charSequence0.toString().toLowerCase())) {
                                arrayList0.add(s);
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS54.this.FLD171 = (ArrayList)filter$FilterResults0.values;
                CLS54.this.notifyDataSetChanged();
            }
        }

        return new CLS52(this);
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.FLD171.get(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS53 ﾞʿ$ﾞⁱ0;
        try {
            int v1 = CLS144.MTH2175(5);
            if(view0 == null) {
                View view1 = this.FLD173.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS226.MTH3099());
                textView0.setBackgroundColor(CLS226.MTH3105());
                textView0.setPadding(v1, v1, v1, v1);
                ﾞʿ$ﾞⁱ0 = new CLS53(null);
                ﾞʿ$ﾞⁱ0.FLD170 = textView0;
                view0 = view1;
                view1.setTag(ﾞʿ$ﾞⁱ0);
                view0 = view1;
            }
            else {
                ﾞʿ$ﾞⁱ0 = (CLS53)view0.getTag();
            }
            String s = (String)this.FLD171.get(v);
            CLS144.MTH2197(ﾞʿ$ﾞⁱ0.FLD170, s);
            if(!TextUtils.isEmpty(this.FLD172)) {
                if(s.equals(this.FLD172)) {
                    view0.setBackgroundColor(CLS226.MTH3109("#2196F3"));
                    ﾞʿ$ﾞⁱ0.FLD170.setTextColor(-1);
                    return view0;
                }
                view0.setBackgroundColor(CLS226.MTH3105());
                ﾞʿ$ﾞⁱ0.FLD170.setTextColor(CLS226.MTH3099());
                return view0;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return view0;
    }
}

