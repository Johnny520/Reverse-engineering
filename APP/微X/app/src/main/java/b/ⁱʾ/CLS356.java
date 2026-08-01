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

public final class CLS356 extends BaseAdapter implements Filterable {
    public static final class CLS355 {
        public TextView FLD3409;

    }

    public final LayoutInflater FLD3410;
    public ArrayList FLD3411;
    public final CLS92 FLD3412;
    public final CLS449 FLD3413;
    public ArrayList FLD3414;

    public CLS356(Activity activity0, ArrayList arrayList0) {
        this.FLD3414 = arrayList0;
        this.FLD3410 = LayoutInflater.from(activity0);
        this.FLD3413 = CLS449.FLD4410;
        this.FLD3412 = new CLS92(5000L);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3414.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS354 extends Filter {
            public final CLS356 FLD3408;

            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS356 ⁱʾ0 = CLS356.this;
                if(ⁱʾ0.FLD3411 == null) {
                    ⁱʾ0.FLD3411 = ⁱʾ0.FLD3414;
                }
                if(charSequence0 != null) {
                    if(ⁱʾ0.FLD3411 != null && ⁱʾ0.FLD3411.size() > 0) {
                        for(Object object0: ⁱʾ0.FLD3411) {
                            CLS91 ᵔʾ0 = (CLS91)object0;
                            if(CLS502.MTH6940(ᵔʾ0.MTH1736(), new CharSequence[]{charSequence0}) || CLS502.MTH6940(ᵔʾ0.MTH1735(), new CharSequence[]{charSequence0})) {
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
                CLS356.this.FLD3414 = (ArrayList)filter$FilterResults0.values;
                CLS356.this.notifyDataSetChanged();
            }
        }

        return new CLS354(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3414.get(v);
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
        CLS355 ⁱʾ$ᵔʾ1;
        boolean z = false;
        if(view0 == null) {
            int v1 = CLS523.MTH7137(16);
            View view1 = this.FLD3410.inflate(0x1090003, viewGroup0, false);
            TextView textView0 = (TextView)view1.findViewById(0x1020014);
            textView0.setTextColor(CLS522.MTH7109());
            textView0.setBackgroundColor(CLS522.MTH7118());
            textView0.setPadding(v1, v1, v1, v1);
            CLS355 ⁱʾ$ᵔʾ0 = new CLS355();
            ⁱʾ$ᵔʾ0.FLD3409 = textView0;
            view1.setTag(ⁱʾ$ᵔʾ0);
            ⁱʾ$ᵔʾ1 = ⁱʾ$ᵔʾ0;
            view0 = view1;
        }
        else {
            ⁱʾ$ᵔʾ1 = (CLS355)view0.getTag();
        }
        CLS91 ᵔʾ0 = (CLS91)this.FLD3414.get(v);
        CLS92 ⁱʽ0 = this.FLD3412;
        String s = (String)ⁱʽ0.MTH1744(ᵔʾ0);
        if(TextUtils.isEmpty(s)) {
            String s1 = ᵔʾ0.MTH1736();
            String s2 = ᵔʾ0.MTH1735();
            if(s2.startsWith("#fav")) {
                String[] arr_s = s2.split(" ");
                if(arr_s.length > 1) {
                    Cursor cursor0 = this.FLD3413.MTH6388(arr_s[1]);
                    if(cursor0 != null) {
                        if(cursor0.moveToFirst()) {
                            ContentValues contentValues0 = CLS404.MTH5911(cursor0);
                            if(contentValues0 != null) {
                                s2 = contentValues0.getAsString("desc");
                            }
                        }
                        if(!cursor0.isClosed()) {
                            cursor0.close();
                        }
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("<i>");
            stringBuilder0.append(CLS27.MTH889("keywords_lbl"));
            stringBuilder0.append("</i><br>");
            stringBuilder0.append(CLS502.MTH6923(s1));
            stringBuilder0.append("<br>");
            stringBuilder0.append("<i>");
            stringBuilder0.append(CLS27.MTH889("response_lbl"));
            stringBuilder0.append("</i><br>");
            if(s2.startsWith("{")) {
                try {
                    JSONObject jSONObject0 = new JSONObject(s2);
                    if(jSONObject0.has("response")) {
                        stringBuilder0.append(CLS502.MTH6923(jSONObject0.getJSONArray("response").getJSONObject(0).getString("msg")));
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            else {
                stringBuilder0.append(CLS502.MTH6923(s2));
            }
            s = stringBuilder0.toString();
            ⁱʽ0.MTH1746(ᵔʾ0, s);
        }
        CLS523.MTH7155(ⁱʾ$ᵔʾ1.FLD3409, s);
        if(ᵔʾ0.FLD386 == 1) {
            view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
            textView1 = ⁱʾ$ᵔʾ1.FLD3409;
            v2 = -1;
        }
        else {
            view0.setBackgroundColor(CLS522.MTH7118());
            textView1 = ⁱʾ$ᵔʾ1.FLD3409;
            v2 = CLS522.MTH7109();
        }
        textView1.setTextColor(v2);
        TextView textView2 = ⁱʾ$ᵔʾ1.FLD3409;
        if(ᵔʾ0.FLD386 == 1) {
            z = true;
        }
        CLS523.MTH7166(textView2, z);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.FLD3412.MTH1742();
        super.notifyDataSetChanged();
    }
}

