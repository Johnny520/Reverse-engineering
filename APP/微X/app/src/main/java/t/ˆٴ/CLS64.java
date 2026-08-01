// Decompiled by JEB v5.42.0.202606242140

package t.ˆٴ;

import android.app.Activity;
import android.content.Context;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˊﾞ.CLS107;
import t.ˊﾞ.CLS113;
import t.ᵔʾ.CLS133;

public final class CLS64 extends BaseAdapter implements Filterable {
    public static final class CLS63 {
        public ImageView FLD527;
        public TextView FLD528;

    }

    public final LayoutInflater FLD529;
    public ArrayList FLD530;
    public final CLS113 FLD531;
    public final WeakReference FLD532;
    public ArrayList FLD533;
    public final String FLD534;

    public CLS64(Activity activity0, ArrayList arrayList0, String s) {
        this.FLD533 = new ArrayList();
        this.FLD532 = new WeakReference(activity0);
        this.FLD529 = LayoutInflater.from(activity0);
        this.FLD531 = new CLS113(5000L);
        this.FLD533 = arrayList0;
        this.FLD534 = s;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD533.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS62 extends Filter {
            public final CLS64 FLD526;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS64 ˆٴ0 = CLS64.this;
                if(ˆٴ0.FLD530 == null) {
                    ˆٴ0.FLD530 = ˆٴ0.FLD533;
                }
                if(charSequence0 != null) {
                    if(ˆٴ0.FLD530 != null && ˆٴ0.FLD530.size() > 0) {
                        for(Object object0: ˆٴ0.FLD530) {
                            CLS107 ᵔʾ0 = (CLS107)object0;
                            if(CLS33.MTH1354("", new CharSequence[]{charSequence0})) {
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
                CLS64.this.FLD533 = (ArrayList)filter$FilterResults0.values;
                CLS64.this.notifyDataSetChanged();
            }
        }

        return new CLS62(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD533.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        boolean z;
        CLS63 ˆٴ$ᵔʾ0;
        View view1;
        try {
            String s = this.FLD534;
            CLS113 ﾞᐧ0 = this.FLD531;
            int v1 = CLS43.MTH1439(5);
            if(view0 == null) {
                view1 = this.FLD529.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                ImageView imageView0 = new ImageView(((Context)this.FLD532.get()));
                imageView0.setMinimumHeight(90);
                imageView0.setMinimumWidth(90);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS46.MTH1452());
                textView0.setBackgroundColor(CLS46.MTH1446());
                textView0.setPadding(v1, v1, v1, v1);
                ˆٴ$ᵔʾ0 = new CLS63();
                ˆٴ$ᵔʾ0.FLD527 = imageView0;
                ˆٴ$ᵔʾ0.FLD528 = textView0;
                try {
                    view1.setTag(ˆٴ$ᵔʾ0);
                    view0 = view1;
                }
                catch(Throwable throwable0) {
                    goto label_59;
                }
            }
            else {
                ˆٴ$ᵔʾ0 = (CLS63)view0.getTag();
            }
            CLS107 ᵔʾ0 = (CLS107)this.FLD533.get(v);
            String s1 = (String)ﾞᐧ0.MTH1896(ᵔʾ0);
            if(TextUtils.isEmpty(s1)) {
                CLS43.MTH1429(ˆٴ$ᵔʾ0.FLD528, ᵔʾ0.FLD799);
                CharSequence charSequence0 = ˆٴ$ᵔʾ0.FLD528.getText();
                ﾞᐧ0.MTH1898(ᵔʾ0, (TextUtils.isEmpty(charSequence0) ? "" : charSequence0.toString()), ﾞᐧ0.FLD838);
            }
            else {
                CLS43.MTH1429(ˆٴ$ᵔʾ0.FLD528, s1);
            }
            try {
                ᵔʾ0.getClass();
                try {
                    CLS33.MTH1350(ˆٴ$ᵔʾ0.FLD527, ᵔʾ0.FLD799);
                    z = true;
                }
                catch(Throwable throwable2) {
                    CLS133.MTH2113(throwable2);
                    z = false;
                }
                Drawable drawable0 = z ? ˆٴ$ᵔʾ0.FLD527.getDrawable() : null;
                if(drawable0 == null) {
                    ˆٴ$ᵔʾ0.FLD528.setCompoundDrawables(null, null, null, null);
                }
                else {
                    drawable0.setBounds(0, 0, 0x60, 0x60);
                    ˆٴ$ᵔʾ0.FLD528.setCompoundDrawablePadding(CLS43.MTH1439(10));
                    ˆٴ$ᵔʾ0.FLD528.setCompoundDrawables(drawable0, null, null, null);
                }
            }
            catch(Throwable throwable1) {
                CLS133.MTH2113(throwable1);
            }
            if(!TextUtils.isEmpty(s)) {
                if(CLS33.MTH1345(s, new String[]{ᵔʾ0.FLD799})) {
                    view0.setBackgroundColor(CLS46.MTH1447("#2196F3"));
                    ˆٴ$ᵔʾ0.FLD528.setTextColor(-1);
                    return view0;
                }
                view0.setBackgroundColor(CLS46.MTH1446());
                ˆٴ$ᵔʾ0.FLD528.setTextColor(CLS46.MTH1452());
                return view0;
            }
            return view0;
        }
        catch(Throwable throwable0) {
            view1 = view0;
        }
    label_59:
        CLS133.MTH2113(throwable0);
        return view1;
    }

    public final void MTH1521(ArrayList arrayList0) {
        this.FLD533 = arrayList0;
        this.notifyDataSetChanged();
    }
}

