// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS92;
import b.ᵔʾ.CLS304.CLS303;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS319 extends BaseAdapter {
    public static final class CLS318 {
        public TextView FLD3267;

    }

    public final LayoutInflater FLD3268;
    public final CLS92 FLD3269;
    public final ArrayList FLD3270;

    public CLS319(Activity activity0, ArrayList arrayList0) {
        this.FLD3270 = arrayList0;
        this.FLD3268 = LayoutInflater.from(activity0);
        this.FLD3269 = new CLS92(5000L);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3270.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3270.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS318 ˆٴ$ˆٴ0;
        View view1;
        try {
            CLS92 ⁱʽ0 = this.FLD3269;
            if(view0 == null) {
                int v1 = CLS523.MTH7137(16);
                view1 = this.FLD3268.inflate(0x1090003, viewGroup0, false);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS522.MTH7109());
                textView0.setBackgroundColor(CLS522.MTH7118());
                textView0.setPadding(v1, v1, v1, v1);
                ˆٴ$ˆٴ0 = new CLS318();
                ˆٴ$ˆٴ0.FLD3267 = textView0;
                try {
                    view1.setTag(ˆٴ$ˆٴ0);
                    view0 = view1;
                }
                catch(Throwable throwable0) {
                    goto label_33;
                }
            }
            else {
                ˆٴ$ˆٴ0 = (CLS318)view0.getTag();
            }
            CLS303 ᵔʾ$ˆٴ0 = (CLS303)this.FLD3270.get(v);
            if(ᵔʾ$ˆٴ0.FLD3159) {
                view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
                ˆٴ$ˆٴ0.FLD3267.setTextColor(-1);
            }
            else {
                view0.setBackgroundColor(CLS522.MTH7118());
                ˆٴ$ˆٴ0.FLD3267.setTextColor(CLS522.MTH7109());
            }
            String s = (String)ⁱʽ0.MTH1744(ᵔʾ$ˆٴ0.FLD3167);
            if(TextUtils.isEmpty(s)) {
                s = CLS319.MTH5035(ᵔʾ$ˆٴ0);
                ⁱʽ0.MTH1746(ᵔʾ$ˆٴ0.FLD3167, s);
            }
            CLS523.MTH7155(ˆٴ$ˆٴ0.FLD3267, s);
            CLS523.MTH7166(ˆٴ$ˆٴ0.FLD3267, ᵔʾ$ˆٴ0.FLD3159);
            return view0;
        }
        catch(Throwable throwable0) {
            view1 = view0;
        }
    label_33:
        CLS27.MTH893(throwable0);
        return view1;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.FLD3269.MTH1742();
        super.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public static String MTH5035(CLS303 ᵔʾ$ˆٴ0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("<i>");
        stringBuilder0.append(CLS27.MTH889("title"));
        stringBuilder0.append("</i><br>");
        stringBuilder0.append((TextUtils.isEmpty(ᵔʾ$ˆٴ0.FLD3160) ? ᵔʾ$ˆٴ0.FLD3167 : ᵔʾ$ˆٴ0.FLD3160));
        stringBuilder0.append("<br><br><i>");
        stringBuilder0.append(CLS27.MTH889("members"));
        stringBuilder0.append("</i><br>");
        stringBuilder0.append(CLS372.MTH5417(TextUtils.join(",", ᵔʾ$ˆٴ0.FLD3162)));
        stringBuilder0.append("<br><br><i>");
        stringBuilder0.append(CLS27.MTH889("num_of_msg"));
        stringBuilder0.append("</i><br>");
        String s = ᵔʾ$ˆٴ0.FLD3166 ? "[" + ᵔʾ$ˆٴ0.MTH4903() + "]" : ᵔʾ$ˆٴ0.MTH4904();
        stringBuilder0.append(s);
        stringBuilder0.append("<br><br>");
        return stringBuilder0.toString();
    }
}

