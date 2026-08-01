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
import b.ˈˈ.CLS92;
import b.ˈˊ.CLS99;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS309;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public final class CLS329 extends BaseAdapter implements Filterable {
    public static final class CLS328 {
        public TextView FLD3315;

    }

    public final SimpleDateFormat FLD3316;
    public ArrayList FLD3317;
    public final LayoutInflater FLD3318;
    public final CLS500 FLD3319;
    public final CLS92 FLD3320;
    public ArrayList FLD3321;

    // 此方法包含解密的字符串
    public CLS329(Activity activity0, ArrayList arrayList0) {
        this.FLD3317 = arrayList0;
        this.FLD3321 = arrayList0;
        this.FLD3318 = LayoutInflater.from(activity0);
        this.FLD3316 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.FLD3319 = CLS500.FLD4928;
        this.FLD3320 = new CLS92(5000L);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3317.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS327 extends Filter {
            public final CLS329 FLD3314;

            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                CLS329 ˊˏ0 = CLS329.this;
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                try {
                    ArrayList arrayList0 = new ArrayList();
                    if(ˊˏ0.FLD3321 == null) {
                        ˊˏ0.FLD3321 = ˊˏ0.FLD3317;
                    }
                    if(!TextUtils.isEmpty(charSequence0)) {
                        if(ˊˏ0.FLD3321 != null && !ˊˏ0.FLD3321.isEmpty()) {
                            for(Object object0: ˊˏ0.FLD3321) {
                                CLS99 ﾞᵎ0 = (CLS99)object0;
                                if(CLS502.MTH6940(ﾞᵎ0.FLD491, new CharSequence[]{charSequence0}) || CLS502.MTH6940(ﾞᵎ0.MTH1934(), new CharSequence[]{charSequence0})) {
                                    arrayList0.add(ﾞᵎ0);
                                }
                            }
                        }
                        filter$FilterResults0.values = arrayList0;
                        return filter$FilterResults0;
                    }
                    filter$FilterResults0.values = ˊˏ0.FLD3321;
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS329.this.FLD3317 = (ArrayList)filter$FilterResults0.values;
                CLS329.this.notifyDataSetChanged();
            }
        }

        return new CLS327(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3317.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS328 ˊˏ$ᵔʾ0;
        try {
            CLS92 ⁱʽ0 = this.FLD3320;
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                View view1 = this.FLD3318.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS522.MTH7109());
                textView0.setBackgroundColor(CLS522.MTH7118());
                textView0.setPadding(v1, v1, v1, v1);
                ˊˏ$ᵔʾ0 = new CLS328();
                ˊˏ$ᵔʾ0.FLD3315 = textView0;
                view0 = view1;
                view1.setTag(ˊˏ$ᵔʾ0);
                view0 = view1;
            }
            else {
                ˊˏ$ᵔʾ0 = (CLS328)view0.getTag();
            }
            CLS99 ﾞᵎ0 = (CLS99)this.FLD3317.get(v);
            String s = (String)ⁱʽ0.MTH1744(ﾞᵎ0);
            if(TextUtils.isEmpty(s)) {
                s = this.MTH5082(ﾞᵎ0);
                ⁱʽ0.MTH1746(ﾞᵎ0, s);
            }
            CLS523.MTH7155(ˊˏ$ᵔʾ0.FLD3315, s);
            if(ﾞᵎ0.FLD500) {
                view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
                ˊˏ$ᵔʾ0.FLD3315.setTextColor(-1);
            }
            else {
                view0.setBackgroundColor(CLS522.MTH7118());
                ˊˏ$ᵔʾ0.FLD3315.setTextColor(CLS522.MTH7109());
            }
            CLS523.MTH7166(ˊˏ$ᵔʾ0.FLD3315, ﾞᵎ0.FLD500);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.FLD3320.MTH1742();
        super.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    // This method was un-flattened
    public final String MTH5082(CLS99 ﾞᵎ0) {
        long v4;
        long v;
        StringBuilder stringBuilder0 = new StringBuilder();
        if(!TextUtils.isEmpty(ﾞᵎ0.FLD491)) {
            stringBuilder0.append("<b>");
            stringBuilder0.append(ﾞᵎ0.FLD491);
            stringBuilder0.append("</b><br>");
        }
        for(Object object0: (ﾞᵎ0.FLD489 ? ﾞᵎ0.FLD496 : ﾞᵎ0.FLD499)) {
            String s = (String)object0;
            if(s.startsWith("#")) {
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
                if(!this.FLD3319.MTH6895("st_r_di") || !arr_s[0].equals(CLS27.MTH889("every_day"))) {
                    v = 4101579213037687605L;
                }
                else {
                    if(arr_s.length > 2) {
                        String[] arr_s1 = arr_s[2].split("_");
                        if(arr_s1.length <= 3 || !arr_s1[3].equals("t")) {
                            v = 0x38EBBC8C2B3CD335L;
                            goto label_42;
                        }
                        else {
                            StringBuilder stringBuilder1 = new StringBuilder();
                            stringBuilder1.append(arr_s[0]);
                            stringBuilder1.append(" -- ");
                            s = CLS182.MTH3481(CLS27.MTH889("timestring_repeat_interval"), new Object[]{arr_s1[0], arr_s1[1], arr_s1[2]}, stringBuilder1);
                            goto label_43;
                        }
                    }
                    v = 4101579204447753013L;
                }
            label_42:
                s = TextUtils.join(CLS370.MTH5289(v), arr_s);
            }
        label_43:
            stringBuilder0.append(s);
            stringBuilder0.append("<br>");
        }
        long v1 = ﾞᵎ0.FLD493;
        SimpleDateFormat simpleDateFormat0 = this.FLD3316;
        if(v1 != 0L) {
            stringBuilder0.append("<i>");
            stringBuilder0.append(CLS27.MTH889("last_execution_time"));
            stringBuilder0.append(simpleDateFormat0.format(v1));
            stringBuilder0.append("</i><br>");
        }
        String s1 = ﾞᵎ0.FLD494;
        CLS309.FLD3190.getClass();
        long v2 = System.currentTimeMillis();
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: CLS309.FLD3190.FLD3192.keySet()) {
            String s2 = (String)object1;
            if(CLS502.MTH6934(s2, new String[]{s1})) {
                long v3 = Long.parseLong(s2.split(" ")[3]);
                if(v3 >= v2) {
                    arrayList0.add(v3);
                }
            }
        }
        if(arrayList0.isEmpty()) {
            v4 = 0L;
        }
        else {
            Collections.sort(arrayList0);
            v4 = (long)(((Long)arrayList0.get(0)));
        }
        if(v4 != 0L) {
            stringBuilder0.append("<i>");
            stringBuilder0.append(CLS27.MTH889("next_execution_time"));
            stringBuilder0.append(simpleDateFormat0.format(v4));
            stringBuilder0.append("</i><br>");
        }
        stringBuilder0.append("<br>");
        stringBuilder0.append(ﾞᵎ0.MTH1934());
        return stringBuilder0.toString();
    }
}

