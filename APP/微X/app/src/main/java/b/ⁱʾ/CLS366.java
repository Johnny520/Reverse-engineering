// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter.FilterResults;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS92;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class CLS366 extends BaseAdapter implements Filterable {
    public static final class CLS365 {
        public ImageView FLD3449;
        public TextView FLD3450;

    }

    public final LayoutInflater FLD3451;
    public ArrayList FLD3452;
    public final CLS92 FLD3453;
    public final WeakReference FLD3454;
    public ArrayList FLD3455;
    public boolean FLD3456;
    public String FLD3457;

    public CLS366(Activity activity0) {
        this.FLD3456 = false;
        this.FLD3455 = new ArrayList();
        this.FLD3454 = new WeakReference(activity0);
        this.FLD3451 = LayoutInflater.from(activity0);
        this.FLD3453 = new CLS92(5000L);
    }

    public CLS366(Activity activity0, ArrayList arrayList0) {
        this(activity0);
        this.FLD3455 = arrayList0;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3455.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS364 extends Filter {
            public final CLS366 FLD3448;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS366 ﾞᐧ0 = CLS366.this;
                if(ﾞᐧ0.FLD3452 == null) {
                    ﾞᐧ0.FLD3452 = ﾞᐧ0.FLD3455;
                }
                if(charSequence0 != null) {
                    if(ﾞᐧ0.FLD3452 != null && ﾞᐧ0.FLD3452.size() > 0) {
                        for(Object object0: ﾞᐧ0.FLD3452) {
                            CLS78 ˊﾞ0 = (CLS78)object0;
                            if(CLS502.MTH6940("", new CharSequence[]{charSequence0})) {
                                arrayList0.add(ˊﾞ0);
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS366.this.FLD3455 = (ArrayList)filter$FilterResults0.values;
                CLS366.this.notifyDataSetChanged();
            }
        }

        return new CLS364(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3455.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        Drawable drawable0;
        CLS365 ﾞᐧ$ᵔʾ0;
        try {
            CLS92 ⁱʽ0 = this.FLD3453;
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                View view1 = this.FLD3451.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                ImageView imageView0 = new ImageView(((Context)this.FLD3454.get()));
                imageView0.setMinimumHeight(90);
                imageView0.setMinimumWidth(90);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS522.MTH7109());
                textView0.setBackgroundColor(CLS522.MTH7118());
                textView0.setPadding(v1, v1, v1, v1);
                ﾞᐧ$ᵔʾ0 = new CLS365();
                ﾞᐧ$ᵔʾ0.FLD3449 = imageView0;
                ﾞᐧ$ᵔʾ0.FLD3450 = textView0;
                view0 = view1;
                view1.setTag(ﾞᐧ$ᵔʾ0);
                view0 = view1;
            }
            else {
                ﾞᐧ$ᵔʾ0 = (CLS365)view0.getTag();
            }
            CLS78 ˊﾞ0 = (CLS78)this.FLD3455.get(v);
            String s = (String)ⁱʽ0.MTH1744(ˊﾞ0);
            if(TextUtils.isEmpty(s)) {
                this.MTH5277(ﾞᐧ$ᵔʾ0.FLD3450, ˊﾞ0);
                ⁱʽ0.MTH1746(ˊﾞ0, CLS502.MTH6936(ﾞᐧ$ᵔʾ0.FLD3450.getText()));
            }
            else {
                CLS523.MTH7155(ﾞᐧ$ᵔʾ0.FLD3450, s);
            }
            try {
                if(ˊﾞ0.MTH1612()) {
                    drawable0 = new BitmapDrawable(CLS27.MTH900().getResources(), ˊﾞ0.FLD270);
                }
                else {
                    drawable0 = CLS372.MTH5403(ﾞᐧ$ᵔʾ0.FLD3449, "") ? ﾞᐧ$ᵔʾ0.FLD3449.getDrawable() : null;
                }
                if(drawable0 == null) {
                    ﾞᐧ$ᵔʾ0.FLD3450.setCompoundDrawables(null, null, null, null);
                }
                else {
                    drawable0.setBounds(0, 0, 0x60, 0x60);
                    ﾞᐧ$ᵔʾ0.FLD3450.setCompoundDrawablePadding(CLS523.MTH7137(10));
                    ﾞᐧ$ᵔʾ0.FLD3450.setCompoundDrawables(drawable0, null, null, null);
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            if(!TextUtils.isEmpty(this.FLD3457)) {
                if(CLS502.MTH6934(this.FLD3457, new String[]{""})) {
                    view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
                    ﾞᐧ$ᵔʾ0.FLD3450.setTextColor(-1);
                    return view0;
                }
                view0.setBackgroundColor(CLS522.MTH7118());
                ﾞᐧ$ᵔʾ0.FLD3450.setTextColor(CLS522.MTH7109());
                return view0;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return view0;
    }

    public final void MTH5276(ArrayList arrayList0) {
        this.FLD3455 = arrayList0;
        this.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public final void MTH5277(TextView textView0, CLS78 ˊﾞ0) {
        if(this.FLD3456) {
            StringBuilder stringBuilder0 = new StringBuilder("<b>");
            stringBuilder0.append("");
            stringBuilder0.append("</b>");
            String s = ˊﾞ0.FLD277;
            int v = ˊﾞ0.FLD278;
            if(v != -1) {
                stringBuilder0.append("<br>");
                if(v == 1) {
                    stringBuilder0.append(CLS27.MTH889("radio_male"));
                }
                else if(v == 2) {
                    stringBuilder0.append(CLS27.MTH889("radio_female"));
                }
            }
            if(!TextUtils.isEmpty(s)) {
                stringBuilder0.append("<br><i>");
                stringBuilder0.append(s);
                stringBuilder0.append("</i>");
            }
            CLS523.MTH7155(textView0, stringBuilder0.toString());
            return;
        }
        CLS523.MTH7155(textView0, "");
    }
}

