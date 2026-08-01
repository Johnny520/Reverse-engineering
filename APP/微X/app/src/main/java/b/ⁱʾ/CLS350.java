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
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS350 extends BaseAdapter implements Filterable {
    public static final class CLS349 {
        public ImageView FLD3386;
        public TextView FLD3387;

    }

    public final LayoutInflater FLD3388;
    public ArrayList FLD3389;
    public final WeakReference FLD3390;
    public final CLS29 FLD3391;
    public ArrayList FLD3392;
    public HashSet FLD3393;
    public String FLD3394;

    public CLS350(Activity activity0, ArrayList arrayList0) {
        this.FLD3390 = new WeakReference(activity0);
        this.FLD3392 = arrayList0;
        this.FLD3388 = LayoutInflater.from(activity0);
        this.FLD3391 = CLS27.MTH895();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3392.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS348 extends Filter {
            public final CLS350 FLD3385;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS350 ᐧⁱ0 = CLS350.this;
                if(ᐧⁱ0.FLD3389 == null) {
                    ᐧⁱ0.FLD3389 = ᐧⁱ0.FLD3392;
                }
                if(charSequence0 != null) {
                    if(ᐧⁱ0.FLD3389 != null && ᐧⁱ0.FLD3389.size() > 0) {
                        for(Object object0: ᐧⁱ0.FLD3389) {
                            CLS78 ˊﾞ0 = (CLS78)object0;
                            if(CLS502.MTH6940("", new CharSequence[]{charSequence0}) || CLS502.MTH6938("", new CharSequence[]{charSequence0})) {
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
                CLS350.this.FLD3392 = (ArrayList)filter$FilterResults0.values;
                CLS350.this.notifyDataSetChanged();
            }
        }

        return new CLS348(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3392.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        Drawable drawable0;
        int v2;
        TextView textView1;
        String s;
        CLS349 ᐧⁱ$ᵔʾ0;
        View view1;
        if(view0 == null) {
            int v1 = CLS523.MTH7137(5);
            view1 = this.FLD3388.inflate(0x1090003, viewGroup0, false);
            view1.setPadding(v1, v1, v1, v1);
            ImageView imageView0 = new ImageView(((Context)this.FLD3390.get()));
            imageView0.setMinimumHeight(90);
            imageView0.setMinimumWidth(90);
            TextView textView0 = (TextView)view1.findViewById(0x1020014);
            textView0.setTextColor(CLS522.MTH7109());
            textView0.setBackgroundColor(CLS522.MTH7118());
            textView0.setPadding(v1, v1, v1, v1);
            ᐧⁱ$ᵔʾ0 = new CLS349();
            ᐧⁱ$ᵔʾ0.FLD3386 = imageView0;
            ᐧⁱ$ᵔʾ0.FLD3387 = textView0;
            view1.setTag(ᐧⁱ$ᵔʾ0);
        }
        else {
            view1 = view0;
            ᐧⁱ$ᵔʾ0 = (CLS349)view0.getTag();
        }
        CLS78 ˊﾞ0 = (CLS78)this.FLD3392.get(v);
        ᐧⁱ$ᵔʾ0.FLD3387.setText("");
        if(!TextUtils.isEmpty(null) && this.FLD3391.MTH938("" + "_null_enable", false)) {
            s = "#2196F3";
            goto label_25;
        }
        else if(this.FLD3393 == null || this.FLD3393.isEmpty() || TextUtils.isEmpty(this.FLD3394) || !this.FLD3393.contains(ˊﾞ0)) {
            view1.setBackgroundColor(CLS522.MTH7118());
            textView1 = ᐧⁱ$ᵔʾ0.FLD3387;
            v2 = CLS522.MTH7109();
        }
        else {
            s = this.FLD3394;
        label_25:
            view1.setBackgroundColor(CLS522.MTH7110(s));
            textView1 = ᐧⁱ$ᵔʾ0.FLD3387;
            v2 = -1;
        }
        textView1.setTextColor(v2);
        if(ˊﾞ0.MTH1612()) {
            drawable0 = new BitmapDrawable(CLS27.MTH900().getResources(), ˊﾞ0.FLD270);
        }
        else {
            drawable0 = CLS372.MTH5403(ᐧⁱ$ᵔʾ0.FLD3386, "") ? ᐧⁱ$ᵔʾ0.FLD3386.getDrawable() : null;
        }
        if(drawable0 != null) {
            drawable0.setBounds(0, 0, 0x60, 0x60);
            ᐧⁱ$ᵔʾ0.FLD3387.setCompoundDrawablePadding(CLS523.MTH7137(10));
            ᐧⁱ$ᵔʾ0.FLD3387.setCompoundDrawables(drawable0, null, null, null);
            return view1;
        }
        ᐧⁱ$ᵔʾ0.FLD3387.setCompoundDrawables(null, null, null, null);
        return view1;
    }
}

