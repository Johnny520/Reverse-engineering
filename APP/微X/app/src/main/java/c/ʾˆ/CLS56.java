// Decompiled by JEB v5.42.0.202606242140

package c.ʾˆ;

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
import c.ـˉ.CLS172;
import c.ـˉ.CLS204;
import c.ـˉ.CLS258;
import java.util.ArrayList;

public class CLS56 extends BaseAdapter implements Filterable {
    public static class CLS54 {
        public TextView FLD199;

        public CLS54() {
        }

        public CLS54(CLS55 ٴˑ$ˆٴ0) {
        }
    }

    public ArrayList FLD201;
    public final LayoutInflater FLD202;
    public ArrayList FLD203;
    public String FLD204;

    public CLS56(Activity activity0, ArrayList arrayList0) {
        this.FLD203 = arrayList0;
        this.FLD202 = LayoutInflater.from(activity0);
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return this.FLD203.size();
    }

    @Override  // android.widget.Filterable
    public Filter getFilter() {
        public class CLS55 extends Filter {
            public final CLS56 FLD200;

            @Override  // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                if(CLS56.this.FLD201 == null) {
                    CLS56.this.FLD201 = CLS56.this.FLD203;
                }
                if(charSequence0 != null) {
                    if(CLS56.this.FLD201 != null && CLS56.this.FLD201.size() > 0) {
                        for(Object object0: CLS56.this.FLD201) {
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
                CLS56.this.FLD203 = (ArrayList)filter$FilterResults0.values;
                CLS56.this.notifyDataSetChanged();
            }
        }

        return new CLS55(this);
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.FLD203.get(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS54 ٴˑ$ʻᵢ0;
        try {
            int v1 = CLS258.MTH3770(5);
            if(view0 == null) {
                View view1 = this.FLD202.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS172.MTH3033());
                textView0.setBackgroundColor(CLS172.MTH3039());
                textView0.setPadding(v1, v1, v1, v1);
                ٴˑ$ʻᵢ0 = new CLS54(null);
                ٴˑ$ʻᵢ0.FLD199 = textView0;
                view0 = view1;
                view1.setTag(ٴˑ$ʻᵢ0);
                view0 = view1;
            }
            else {
                ٴˑ$ʻᵢ0 = (CLS54)view0.getTag();
            }
            String s = (String)this.FLD203.get(v);
            CLS258.MTH3751(ٴˑ$ʻᵢ0.FLD199, s);
            if(!TextUtils.isEmpty(this.FLD204)) {
                if(s.equals(this.FLD204)) {
                    view0.setBackgroundColor(CLS172.MTH3030("#2196F3"));
                    ٴˑ$ʻᵢ0.FLD199.setTextColor(-1);
                    return view0;
                }
                view0.setBackgroundColor(CLS172.MTH3039());
                ٴˑ$ʻᵢ0.FLD199.setTextColor(CLS172.MTH3033());
                return view0;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return view0;
    }
}

