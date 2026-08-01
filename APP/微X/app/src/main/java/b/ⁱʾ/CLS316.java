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
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS316 extends BaseAdapter {
    public static final class CLS315 {
        public TextView FLD3256;

    }

    public final CLS500 FLD3257;
    public final CLS92 FLD3258;
    public final LayoutInflater FLD3259;
    public ArrayList FLD3260;

    public CLS316(Activity activity0, ArrayList arrayList0) {
        this.FLD3260 = arrayList0;
        this.FLD3259 = LayoutInflater.from(activity0);
        this.FLD3257 = CLS500.FLD4928;
        this.FLD3258 = new CLS92(5000L);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3260.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3260.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS315 ʽי$ˆٴ0;
        try {
            CLS92 ⁱʽ0 = this.FLD3258;
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                View view1 = this.FLD3259.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS522.MTH7109());
                textView0.setBackgroundColor(CLS522.MTH7118());
                textView0.setPadding(v1, v1, v1, v1);
                ʽי$ˆٴ0 = new CLS315();
                ʽי$ˆٴ0.FLD3256 = textView0;
                view0 = view1;
                view1.setTag(ʽי$ˆٴ0);
                view0 = view1;
            }
            else {
                ʽי$ˆٴ0 = (CLS315)view0.getTag();
            }
            String s = (String)this.FLD3260.get(v);
            String s1 = (String)ⁱʽ0.MTH1744(s);
            if(TextUtils.isEmpty(s1)) {
                s1 = this.MTH5022(s);
                ⁱʽ0.MTH1746(s, s1);
            }
            CLS523.MTH7155(ʽי$ˆٴ0.FLD3256, s1);
            if(!TextUtils.isEmpty(null)) {
                if(CLS502.MTH6934(null, new String[]{s})) {
                    view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
                    ʽי$ˆٴ0.FLD3256.setTextColor(-1);
                    return view0;
                }
                view0.setBackgroundColor(CLS522.MTH7118());
                ʽי$ˆٴ0.FLD3256.setTextColor(CLS522.MTH7109());
                return view0;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.FLD3258.MTH1742();
        super.notifyDataSetChanged();
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public final String MTH5022(String s) {
        if(!s.startsWith("#")) {
            return s;
        }
        String[] arr_s = s.split(" ");
        switch(arr_s[0]) {
            case "#1": {
                arr_s[0] = CLS27.MTH889("week_sun");
                break;
            }
            case "#2": {
                arr_s[0] = CLS27.MTH889("week_mon");
                break;
            }
            case "#3": {
                arr_s[0] = CLS27.MTH889("week_tue");
                break;
            }
            case "#4": {
                arr_s[0] = CLS27.MTH889("week_wed");
                break;
            }
            case "#5": {
                arr_s[0] = CLS27.MTH889("week_thu");
                break;
            }
            case "#6": {
                arr_s[0] = CLS27.MTH889("week_fri");
                break;
            }
            case "#7": {
                arr_s[0] = CLS27.MTH889("week_sat");
                break;
            }
            case "#8": {
                arr_s[0] = CLS27.MTH889("every_day");
            }
        }
        if(this.FLD3257.MTH6895("st_r_di") && arr_s[0].equals(CLS27.MTH889("every_day")) && arr_s.length > 2) {
            String[] arr_s1 = arr_s[2].split("_");
            if(arr_s1.length > 3 && arr_s1[3].equals("t")) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(arr_s[0]);
                stringBuilder0.append(" -- ");
                return CLS182.MTH3481(CLS27.MTH889("timestring_repeat_interval"), new Object[]{arr_s1[0], arr_s1[1], arr_s1[2]}, stringBuilder0);
            }
            return TextUtils.join(" ", arr_s);
        }
        return TextUtils.join(" ", arr_s);
    }
}

