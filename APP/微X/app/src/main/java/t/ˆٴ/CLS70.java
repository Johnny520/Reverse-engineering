// Decompiled by JEB v5.42.0.202606242140

package t.ˆٴ;

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
import java.util.ArrayList;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ᵔʾ.CLS133;

public final class CLS70 extends BaseAdapter implements Filterable {
    public static final class CLS69 {
        public TextView FLD555;

    }

    public final LayoutInflater FLD556;
    public ArrayList FLD557;
    public ArrayList FLD558;

    public CLS70(Activity activity0, ArrayList arrayList0) {
        this.FLD557 = arrayList0;
        this.FLD556 = LayoutInflater.from(activity0);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD557.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS68 extends Filter {
            public final CLS70 FLD554;

            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS70 ﾞٴ0 = CLS70.this;
                if(ﾞٴ0.FLD558 == null) {
                    ﾞٴ0.FLD558 = ﾞٴ0.FLD557;
                }
                if(charSequence0 != null) {
                    if(ﾞٴ0.FLD558 != null && ﾞٴ0.FLD558.size() > 0) {
                        for(Object object0: ﾞٴ0.FLD558) {
                            String s = (String)object0;
                            if(CLS33.MTH1354(s, new CharSequence[]{charSequence0})) {
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
                CLS70.this.FLD557 = (ArrayList)filter$FilterResults0.values;
                CLS70.this.notifyDataSetChanged();
            }
        }

        return new CLS68(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD557.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS69 ﾞٴ$ᵔʾ0;
        try {
            int v1 = CLS43.MTH1439(5);
            if(view0 == null) {
                View view1 = this.FLD556.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS46.MTH1452());
                textView0.setBackgroundColor(CLS46.MTH1446());
                textView0.setPadding(v1, v1, v1, v1);
                ﾞٴ$ᵔʾ0 = new CLS69();
                ﾞٴ$ᵔʾ0.FLD555 = textView0;
                view0 = view1;
                view1.setTag(ﾞٴ$ᵔʾ0);
                view0 = view1;
            }
            else {
                ﾞٴ$ᵔʾ0 = (CLS69)view0.getTag();
            }
            String s = (String)this.FLD557.get(v);
            CLS43.MTH1429(ﾞٴ$ᵔʾ0.FLD555, s);
            if(!TextUtils.isEmpty(null)) {
                if(s.equals(null)) {
                    view0.setBackgroundColor(CLS46.MTH1447("#2196F3"));
                    ﾞٴ$ᵔʾ0.FLD555.setTextColor(-1);
                    return view0;
                }
                view0.setBackgroundColor(CLS46.MTH1446());
                ﾞٴ$ᵔʾ0.FLD555.setTextColor(CLS46.MTH1452());
                return view0;
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return view0;
    }
}

