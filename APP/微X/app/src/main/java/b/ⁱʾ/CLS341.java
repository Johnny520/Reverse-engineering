// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.Filter.FilterResults;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListView;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS341 extends BaseAdapter implements Filterable {
    public static final class CLS340 {
        public CheckedTextView FLD3360;

    }

    public final LayoutInflater FLD3361;
    public HashSet FLD3362;
    public ArrayList FLD3363;
    public final ListView FLD3364;
    public ArrayList FLD3365;
    public boolean[] FLD3366;

    public CLS341(Activity activity0, ArrayList arrayList0, ListView listView0) {
        this.FLD3365 = arrayList0;
        this.FLD3366 = new boolean[arrayList0.size()];
        this.FLD3362 = new HashSet();
        this.FLD3361 = LayoutInflater.from(activity0);
        this.FLD3364 = listView0;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3365.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS339 extends Filter {
            public final CLS341 FLD3359;

            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS341 ـﹳ0 = CLS341.this;
                if(ـﹳ0.FLD3363 == null) {
                    ـﹳ0.FLD3363 = ـﹳ0.FLD3365;
                }
                if(charSequence0 != null) {
                    if(ـﹳ0.FLD3363 != null && ـﹳ0.FLD3363.size() > 0) {
                        for(Object object0: ـﹳ0.FLD3363) {
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
                CLS341.this.FLD3365 = (ArrayList)filter$FilterResults0.values;
                CLS341.this.notifyDataSetChanged();
            }
        }

        return new CLS339(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3365.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS340 ـﹳ$ᵔʾ0;
        try {
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                View view1 = this.FLD3361.inflate(0x1090010, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                CheckedTextView checkedTextView0 = (CheckedTextView)view1.findViewById(0x1020014);
                checkedTextView0.setTextColor(CLS522.MTH7109());
                checkedTextView0.setBackgroundColor(CLS522.MTH7118());
                checkedTextView0.setPadding(v1, v1, v1, v1);
                ـﹳ$ᵔʾ0 = new CLS340();
                ـﹳ$ᵔʾ0.FLD3360 = checkedTextView0;
                view0 = view1;
                view1.setTag(ـﹳ$ᵔʾ0);
                view0 = view1;
            }
            else {
                ـﹳ$ᵔʾ0 = (CLS340)view0.getTag();
            }
            String s = (String)this.FLD3365.get(v);
            CLS523.MTH7155(ـﹳ$ᵔʾ0.FLD3360, s);
            ـﹳ$ᵔʾ0.FLD3360.setChecked(this.FLD3366[v]);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return view0;
    }

    public final ArrayList MTH5150() {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; true; ++v) {
            boolean[] arr_z = this.FLD3366;
            if(v >= arr_z.length) {
                break;
            }
            if(arr_z[v]) {
                arrayList0.add(((String)this.FLD3365.get(v)));
            }
        }
        return arrayList0;
    }

    public final void MTH5151(ArrayList arrayList0) {
        HashSet hashSet0 = new HashSet();
        if(this.FLD3366 != null) {
            for(int v1 = 0; true; ++v1) {
                boolean[] arr_z = this.FLD3366;
                if(v1 >= arr_z.length) {
                    break;
                }
                try {
                    if(arr_z[v1]) {
                        hashSet0.add(((String)arrayList0.get(v1)));
                    }
                    this.FLD3364.setItemChecked(v1, false);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        this.FLD3362 = new HashSet();
        ArrayList arrayList1 = this.MTH5150();
        this.FLD3365 = arrayList0;
        for(Object object0: arrayList1) {
            String s = (String)object0;
            if(!arrayList0.contains(s)) {
                arrayList0.add(s);
            }
        }
        this.FLD3366 = new boolean[arrayList0.size()];
        for(int v = 0; v < this.FLD3366.length; ++v) {
            if(hashSet0.contains(arrayList0.get(v))) {
                this.MTH5152(v, true);
            }
        }
        this.notifyDataSetChanged();
    }

    public final void MTH5152(int v, boolean z) {
        this.FLD3366[v] = z;
        String s = (String)this.FLD3365.get(v);
        HashSet hashSet0 = this.FLD3362;
        if(z) {
            hashSet0.add(s);
        }
        else {
            hashSet0.remove(s);
        }
        this.FLD3364.setItemChecked(v, z);
    }
}

