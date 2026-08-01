// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
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
import b.ˈˈ.CLS91;
import b.ˈˈ.CLS92;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS449;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS344 extends BaseAdapter implements Filterable {
    public static final class CLS343 {
        public TextView FLD3368;

    }

    public final LayoutInflater FLD3369;
    public CLS91 FLD3370;
    public final CLS92 FLD3371;
    public final CLS449 FLD3372;
    public ArrayList FLD3373;
    public ArrayList FLD3374;

    public CLS344(Activity activity0, ArrayList arrayList0) {
        this.FLD3370 = null;
        this.FLD3373 = arrayList0;
        this.FLD3369 = LayoutInflater.from(activity0);
        this.FLD3372 = CLS449.FLD4410;
        this.FLD3371 = new CLS92(5000L);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3373.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS342 extends Filter {
            public final CLS344 FLD3367;

            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS344 ٴـ0 = CLS344.this;
                if(ٴـ0.FLD3374 == null) {
                    ٴـ0.FLD3374 = ٴـ0.FLD3373;
                }
                if(charSequence0 != null) {
                    if(ٴـ0.FLD3374 != null && ٴـ0.FLD3374.size() > 0) {
                        for(Object object0: ٴـ0.FLD3374) {
                            CLS91 ᵔʾ0 = (CLS91)object0;
                            if(CLS502.MTH6940(ᵔʾ0.MTH1736(), new CharSequence[]{charSequence0})) {
                                arrayList0.add(ᵔʾ0);
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS344.this.FLD3373 = (ArrayList)filter$FilterResults0.values;
                CLS344.this.notifyDataSetChanged();
            }
        }

        return new CLS342(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3373.get(v);
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
        CLS343 ٴـ$ᵔʾ1;
        boolean z = false;
        if(view0 == null) {
            int v1 = CLS523.MTH7137(16);
            View view1 = this.FLD3369.inflate(0x1090003, viewGroup0, false);
            TextView textView0 = (TextView)view1.findViewById(0x1020014);
            textView0.setTextColor(CLS522.MTH7109());
            textView0.setBackgroundColor(CLS522.MTH7118());
            textView0.setPadding(v1, v1, v1, v1);
            CLS343 ٴـ$ᵔʾ0 = new CLS343();
            ٴـ$ᵔʾ0.FLD3368 = textView0;
            view1.setTag(ٴـ$ᵔʾ0);
            ٴـ$ᵔʾ1 = ٴـ$ᵔʾ0;
            view0 = view1;
        }
        else {
            ٴـ$ᵔʾ1 = (CLS343)view0.getTag();
        }
        CLS91 ᵔʾ0 = (CLS91)this.FLD3373.get(v);
        CLS92 ⁱʽ0 = this.FLD3371;
        String s = (String)ⁱʽ0.MTH1744(ᵔʾ0);
        if(TextUtils.isEmpty(s)) {
            String s1 = ᵔʾ0.MTH1735();
            if(s1.startsWith("{")) {
                try {
                    JSONObject jSONObject0 = new JSONObject(s1);
                    if(jSONObject0.has("response")) {
                        s1 = jSONObject0.getJSONArray("response").getJSONObject(0).getString("msg");
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            if(s1.startsWith("#fav")) {
                String[] arr_s = s1.split(" ");
                if(arr_s.length > 1) {
                    Cursor cursor0 = this.FLD3372.MTH6388(arr_s[1]);
                    if(cursor0 != null) {
                        if(cursor0.moveToFirst()) {
                            ContentValues contentValues0 = CLS404.MTH5911(cursor0);
                            if(contentValues0 != null) {
                                s = contentValues0.getAsString("desc");
                            }
                        }
                        if(!cursor0.isClosed()) {
                            cursor0.close();
                        }
                    }
                }
                else {
                    s = CLS502.MTH6923(s1);
                }
            }
            else {
                s = CLS502.MTH6923(s1);
            }
            ⁱʽ0.MTH1746(ᵔʾ0, s);
        }
        CLS523.MTH7155(ٴـ$ᵔʾ1.FLD3368, s);
        if(ᵔʾ0.FLD386 == 1 || ᵔʾ0 == this.FLD3370) {
            view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
            textView1 = ٴـ$ᵔʾ1.FLD3368;
            v2 = -1;
        }
        else {
            view0.setBackgroundColor(CLS522.MTH7118());
            textView1 = ٴـ$ᵔʾ1.FLD3368;
            v2 = CLS522.MTH7109();
        }
        textView1.setTextColor(v2);
        TextView textView2 = ٴـ$ᵔʾ1.FLD3368;
        if(ᵔʾ0.FLD386 == 1) {
            z = true;
        }
        CLS523.MTH7166(textView2, z);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.FLD3371.MTH1742();
        super.notifyDataSetChanged();
    }
}

