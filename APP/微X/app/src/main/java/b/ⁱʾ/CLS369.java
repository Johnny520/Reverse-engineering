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
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS369 extends BaseAdapter implements Filterable {
    public static final class CLS368 {
        public TextView FLD3459;

    }

    public final LayoutInflater FLD3460;
    public ArrayList FLD3461;
    public ArrayList FLD3462;
    public String FLD3463;

    public CLS369(Activity activity0, ArrayList arrayList0) {
        this.FLD3461 = arrayList0;
        this.FLD3460 = LayoutInflater.from(activity0);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3461.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS367 extends Filter {
            public final CLS369 FLD3458;

            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS369 ﾞᵎ0 = CLS369.this;
                if(ﾞᵎ0.FLD3462 == null) {
                    ﾞᵎ0.FLD3462 = ﾞᵎ0.FLD3461;
                }
                if(charSequence0 != null) {
                    if(ﾞᵎ0.FLD3462 != null && ﾞᵎ0.FLD3462.size() > 0) {
                        for(Object object0: ﾞᵎ0.FLD3462) {
                            String s = (String)object0;
                            if(CLS502.MTH6940(s, new CharSequence[]{charSequence0})) {
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
                CLS369.this.FLD3461 = (ArrayList)filter$FilterResults0.values;
                CLS369.this.notifyDataSetChanged();
            }
        }

        return new CLS367(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3461.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS368 ﾞᵎ$ᵔʾ0;
        try {
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                View view1 = this.FLD3460.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS522.MTH7109());
                textView0.setBackgroundColor(CLS522.MTH7118());
                textView0.setPadding(v1, v1, v1, v1);
                ﾞᵎ$ᵔʾ0 = new CLS368();
                ﾞᵎ$ᵔʾ0.FLD3459 = textView0;
                view0 = view1;
                view1.setTag(ﾞᵎ$ᵔʾ0);
                view0 = view1;
            }
            else {
                ﾞᵎ$ᵔʾ0 = (CLS368)view0.getTag();
            }
            String s = (String)this.FLD3461.get(v);
            CLS523.MTH7155(ﾞᵎ$ᵔʾ0.FLD3459, s);
            if(!TextUtils.isEmpty(this.FLD3463)) {
                if(s.equals(this.FLD3463)) {
                    view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
                    ﾞᵎ$ᵔʾ0.FLD3459.setTextColor(-1);
                    return view0;
                }
                view0.setBackgroundColor(CLS522.MTH7118());
                ﾞᵎ$ᵔʾ0.FLD3459.setTextColor(CLS522.MTH7109());
                return view0;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return view0;
    }
}

