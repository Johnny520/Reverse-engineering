// Decompiled by JEB v5.42.0.202606242140

package d.ᐧי;

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
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS69;
import java.util.ArrayList;

public final class CLS116 extends BaseAdapter implements Filterable {
    public static final class CLS114 {
        public TextView FLD653;

    }

    public ArrayList FLD655;
    public final LayoutInflater FLD656;
    public ArrayList FLD657;

    public CLS116(Activity activity0, ArrayList arrayList0) {
        this.FLD657 = arrayList0;
        this.FLD656 = LayoutInflater.from(activity0);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD657.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS115 extends Filter {
            public final CLS116 FLD654;

            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS116 ⁱﾞ0 = CLS116.this;
                if(ⁱﾞ0.FLD655 == null) {
                    ⁱﾞ0.FLD655 = ⁱﾞ0.FLD657;
                }
                if(charSequence0 != null) {
                    if(ⁱﾞ0.FLD655 != null && ⁱﾞ0.FLD655.size() > 0) {
                        for(Object object0: ⁱﾞ0.FLD655) {
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
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS116.this.FLD657 = (ArrayList)filter$FilterResults0.values;
                CLS116.this.notifyDataSetChanged();
            }
        }

        return new CLS115(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD657.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS114 ⁱﾞ$יʻ0;
        try {
            int v1 = CLS45.MTH662(5);
            if(view0 == null) {
                View view1 = this.FLD656.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS43.MTH646());
                textView0.setBackgroundColor(CLS43.MTH644());
                textView0.setPadding(v1, v1, v1, v1);
                ⁱﾞ$יʻ0 = new CLS114();
                ⁱﾞ$יʻ0.FLD653 = textView0;
                view0 = view1;
                view1.setTag(ⁱﾞ$יʻ0);
                view0 = view1;
            }
            else {
                ⁱﾞ$יʻ0 = (CLS114)view0.getTag();
            }
            String s = (String)this.FLD657.get(v);
            CLS45.MTH658(ⁱﾞ$יʻ0.FLD653, s);
            if(!TextUtils.isEmpty(null)) {
                if(s.equals(null)) {
                    view0.setBackgroundColor(CLS43.MTH643("#2196F3"));
                    ⁱﾞ$יʻ0.FLD653.setTextColor(-1);
                    return view0;
                }
                view0.setBackgroundColor(CLS43.MTH644());
                ⁱﾞ$יʻ0.FLD653.setTextColor(CLS43.MTH646());
                return view0;
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return view0;
    }
}

