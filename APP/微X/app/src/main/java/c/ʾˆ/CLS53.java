// Decompiled by JEB v5.42.0.202606242140

package c.ʾˆ;

import android.app.Activity;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter.FilterResults;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import c.ˈⁱ.CLS95;
import c.ˋﹳ.CLS107;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.ـˉ.CLS170;
import c.ـˉ.CLS172;
import c.ـˉ.CLS204;
import c.ـˉ.CLS258;
import c.ـˉ.CLS259;
import c.ـˉ.CLS262;
import c.ـˉ.CLS264;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CLS53 extends BaseAdapter implements Filterable {
    public static class CLS51 {
        public TextView FLD182;

        public CLS51() {
        }

        public CLS51(CLS52 ʿˊ$ˆٴ0) {
        }
    }

    public final HashMap FLD184;
    public HashSet FLD185;
    public final HashMap FLD186;
    public int FLD187;
    public boolean FLD188;
    public final LayoutInflater FLD189;
    public boolean[] FLD190;
    public ArrayList FLD191;
    public ArrayList FLD192;
    public final WeakReference FLD193;

    public CLS53(Activity activity0) {
        this.FLD186 = new HashMap();
        this.FLD184 = new HashMap();
        this.FLD187 = -1;
        this.FLD188 = false;
        this.FLD185 = new HashSet();
        this.FLD189 = LayoutInflater.from(activity0);
        this.FLD193 = new WeakReference(activity0);
        this.MTH1041();
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return this.FLD192 == null ? 0 : this.FLD192.size();
    }

    @Override  // android.widget.Filterable
    public Filter getFilter() {
        public class CLS52 extends Filter {
            public final CLS53 FLD183;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                if(CLS53.this.FLD191 == null) {
                    CLS53.this.FLD191 = CLS53.this.FLD192;
                }
                if(!TextUtils.isEmpty(charSequence0)) {
                    if(CLS53.this.FLD191 != null && !CLS53.this.FLD191.isEmpty()) {
                        for(Object object0: CLS53.this.FLD191) {
                            ContentValues contentValues0 = (ContentValues)object0;
                            if(contentValues0.containsKey("\uD8E3ag") || contentValues0.containsKey("\uD8E3esc")) {
                                String s = contentValues0.containsKey("\uD8E3ag") ? contentValues0.getAsString("\uD8E3ag") : "";
                                String s1 = contentValues0.containsKey("\uD8E3esc") ? contentValues0.getAsString("\uD8E3esc") : "";
                                if(CLS170.MTH3003(s, new CharSequence[]{charSequence0}) || CLS170.MTH3003(s1, new CharSequence[]{charSequence0})) {
                                    arrayList0.add(contentValues0);
                                }
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                    return filter$FilterResults0;
                }
                filter$FilterResults0.values = CLS53.this.FLD191;
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS53.this.MTH1047(((ArrayList)filter$FilterResults0.values));
            }
        }

        return new CLS52(this);
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.FLD192 == null ? null : this.FLD192.get(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)v;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        BitmapDrawable bitmapDrawable0;
        CLS51 ʿˊ$ʻᵢ0;
        try {
            int v1 = CLS258.MTH3770(5);
            if(view0 == null) {
                View view1 = this.FLD189.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS172.MTH3033());
                textView0.setBackgroundColor(CLS172.MTH3039());
                textView0.setPadding(v1, v1, v1, v1);
                ʿˊ$ʻᵢ0 = new CLS51(null);
                ʿˊ$ʻᵢ0.FLD182 = textView0;
                view0 = view1;
                view1.setTag(ʿˊ$ʻᵢ0);
                view0 = view1;
            }
            else {
                ʿˊ$ʻᵢ0 = (CLS51)view0.getTag();
            }
            ContentValues contentValues0 = (ContentValues)this.FLD192.get(v);
            if(contentValues0 == null) {
                return view0;
            }
            String s = contentValues0.getAsString("\uD8E3esc");
            if(this.FLD188) {
                s = v + 1 + "\uD8E3 " + s;
            }
            if(TextUtils.isEmpty(s)) {
                ʿˊ$ʻᵢ0.FLD182.setText("");
            }
            else {
                CLS258.MTH3751(ʿˊ$ʻᵢ0.FLD182, s);
            }
            view0.setBackgroundColor(CLS172.MTH3039());
            ʿˊ$ʻᵢ0.FLD182.setTextColor(CLS172.MTH3033());
            if(this.MTH1036(v)) {
                view0.setBackgroundColor(CLS172.MTH3030("\uD8E32196F3"));
                ʿˊ$ʻᵢ0.FLD182.setTextColor(-1);
            }
            if(contentValues0.containsKey("\uD8E3p3_uri")) {
                String s1 = this.MTH1032(contentValues0.getAsString("\uD8E3p3_uri"));
                if(!TextUtils.isEmpty(s1)) {
                    CLS258.MTH3751(ʿˊ$ʻᵢ0.FLD182, contentValues0.getAsString("\uD8E3esc") + "\uD8E3" + s1);
                }
            }
            if(this.MTH1024(contentValues0)) {
                Bitmap bitmap0 = this.MTH1028(contentValues0);
                bitmapDrawable0 = bitmap0 == null ? null : new BitmapDrawable(CLS95.MTH2017().getResources(), bitmap0);
            }
            else {
                bitmapDrawable0 = null;
            }
            if(bitmapDrawable0 == null) {
                ʿˊ$ʻᵢ0.FLD182.setCompoundDrawables(null, null, null, null);
            }
            else {
                bitmapDrawable0.setBounds(0, 0, 0x60, 0x60);
                ʿˊ$ʻᵢ0.FLD182.setCompoundDrawablePadding(CLS258.MTH3770(10));
                ʿˊ$ʻᵢ0.FLD182.setCompoundDrawables(bitmapDrawable0, null, null, null);
            }
            CLS258.MTH3761(ʿˊ$ʻᵢ0.FLD182, this.MTH1036(v));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return view0;
    }

    // 去混淆评级： 中等(90)
    // 此方法包含解密的字符串
    public final boolean MTH1024(ContentValues contentValues0) {
        return contentValues0.containsKey("\uD8E3mg_uri") || contentValues0.containsKey("\uD8E3id_uri") || contentValues0.containsKey("\uD8E3if_uri");
    }

    // 检测为 Lambda 实现
    private void MTH1026(ContentValues contentValues0, Set set0, CLS107 ˆٴ0) [...]

    // 此方法包含解密的字符串
    public final Bitmap MTH1028(ContentValues contentValues0) {
        try {
            String s = "";
            if(contentValues0.containsKey("\uD8E3mg_uri")) {
                s = contentValues0.getAsString("\uD8E3mg_uri");
            }
            else if(contentValues0.containsKey("\uD8E3if_uri")) {
                s = contentValues0.getAsString("\uD8E3if_uri");
            }
            else if(contentValues0.containsKey("\uD8E3id_uri")) {
                s = contentValues0.getAsString("\uD8E3id_uri");
            }
            if(!TextUtils.isEmpty(s) && this.FLD186.containsKey(s)) {
                return (Bitmap)this.FLD186.get(s);
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return null;
    }

    public void MTH1029() {
        if(this.FLD192 != null && !this.FLD192.isEmpty()) {
            for(int v = 0; v < this.FLD192.size(); ++v) {
                this.MTH1037(v, false);
            }
            this.notifyDataSetChanged();
        }
    }

    public void MTH1030(List list0) {
        for(Object object0: list0) {
            this.MTH1038(((ContentValues)object0));
        }
    }

    private void MTH1031(Set set0) {
        if(!set0.isEmpty()) {
            return;
        }
        CLS144.MTH2583().MTH2604(((CLS142)new CLS414(this)));
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final String MTH1032(String s) {
        return this.FLD184.containsKey(s) ? ((String)this.FLD184.get(s)) : "";
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1033(ContentValues contentValues0, Set set0, CLS107 ˆٴ0) [...]

    // 此方法包含解密的字符串
    public final void MTH1034(ContentValues contentValues0) {
        HashMap hashMap0;
        Bitmap bitmap0;
        String s;
        try {
            if(this.MTH1028(contentValues0) != null) {
                return;
            }
            if(contentValues0.containsKey("\uD8E3mg_uri")) {
                s = contentValues0.getAsString("\uD8E3mg_uri");
                bitmap0 = CLS264.MTH4112(Uri.parse(contentValues0.getAsString("\uD8E3mg_uri")));
                if(bitmap0 != null) {
                    hashMap0 = this.FLD186;
                    hashMap0.put(s, bitmap0);
                }
            }
            else if(contentValues0.containsKey("\uD8E3if_uri")) {
                s = contentValues0.getAsString("\uD8E3if_uri");
                bitmap0 = CLS264.MTH4112(Uri.parse(contentValues0.getAsString("\uD8E3if_uri")));
                if(bitmap0 != null) {
                    hashMap0 = this.FLD186;
                    hashMap0.put(s, bitmap0);
                }
            }
            else if(contentValues0.containsKey("\uD8E3id_uri")) {
                s = contentValues0.getAsString("\uD8E3id_uri");
                bitmap0 = CLS264.MTH4114(Uri.parse(contentValues0.getAsString("\uD8E3id_uri")));
                hashMap0 = this.FLD186;
                hashMap0.put(s, bitmap0);
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public ArrayList MTH1035() {
        ArrayList arrayList0 = new ArrayList();
        if(this.FLD190 != null) {
            try {
            label_3:
                for(int v = 0; v < this.FLD190.length; ++v) {
                    if(this.MTH1036(v)) {
                        arrayList0.add(((ContentValues)this.FLD192.get(v)));
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
                if(true) {
                    return arrayList0;
                }
                goto label_3;
            }
        }
        return arrayList0;
    }

    public boolean MTH1036(int v) {
        try {
            return this.FLD190[v];
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    public void MTH1037(int v, boolean z) {
        if(this.FLD187 != -1 && z && this.MTH1044() >= this.FLD187) {
            return;
        }
        this.FLD190[v] = z;
        ContentValues contentValues0 = (ContentValues)this.FLD192.get(v);
        if(z) {
            this.FLD185.add(contentValues0);
            return;
        }
        this.FLD185.remove(contentValues0);
    }

    public void MTH1038(ContentValues contentValues0) {
        int v = this.FLD192.indexOf(contentValues0);
        if(v != -1) {
            this.MTH1037(v, true);
        }
    }

    public void MTH1040(int v) {
        this.MTH1037(v, !this.MTH1036(v));
        this.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public void MTH1041() {
        CLS415 ـᵎ0;
        CLS144 ˆˆ0;
        CLS144.MTH2583().MTH2604(((CLS142)new CLS414(this)));
        if(this.FLD192 != null && !this.FLD192.isEmpty()) {
            Set set0 = Collections.synchronizedSet(new HashSet());
            CLS413 ʻᵢ0 = new CLS413(this, set0);
            for(Object object0: this.FLD192) {
                ContentValues contentValues0 = (ContentValues)object0;
                if(this.MTH1024(contentValues0)) {
                    set0.add(contentValues0);
                    ˆˆ0 = CLS144.MTH2583();
                    ـᵎ0 = () -> {
                        this.MTH1034(contentValues0);
                        set0.remove(contentValues0);
                        ((CLS107)ʻᵢ0).MTH2281();
                    };
                }
                else {
                    if(!contentValues0.containsKey("\uD8E3p3_uri")) {
                        continue;
                    }
                    set0.add(contentValues0);
                    ˆˆ0 = CLS144.MTH2583();
                    ـᵎ0 = () -> // 此方法包含解密的字符串
                    {
                        this.MTH1042(contentValues0.getAsString("\uD8E3p3_uri"));
                        set0.remove(contentValues0);
                        ((CLS107)ʻᵢ0).MTH2281();
                    };
                }
                ˆˆ0.MTH2589(((CLS142)ـᵎ0));
            }
        }
    }

    public final void MTH1042(String s) {
        try {
            if(!TextUtils.isEmpty(this.MTH1032(s))) {
                return;
            }
            String s1 = CLS259.MTH3820(CLS262.MTH4058(Uri.parse(s)));
            this.FLD184.put(s, s1);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public void MTH1043(ContentValues contentValues0) {
        this.MTH1040(this.FLD192.indexOf(contentValues0));
    }

    public int MTH1044() {
        int v1 = 0;
        for(int v = 0; v < this.FLD190.length; ++v) {
            if(this.MTH1036(v)) {
                ++v1;
            }
        }
        return v1;
    }

    public void MTH1047(ArrayList arrayList0) {
        if(arrayList0 == null) {
            return;
        }
        this.MTH1041();
        HashSet hashSet0 = new HashSet();
        if(this.FLD190 != null) {
            for(int v1 = 0; v1 < this.FLD190.length; ++v1) {
                try {
                    if(this.MTH1036(v1)) {
                        hashSet0.add(((ContentValues)this.FLD192.get(v1)));
                    }
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }
        this.FLD185 = new HashSet();
        ArrayList arrayList1 = this.MTH1035();
        this.FLD192 = arrayList0;
        for(Object object0: arrayList1) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(!this.FLD192.contains(contentValues0)) {
                this.FLD192.add(contentValues0);
            }
        }
        this.FLD190 = new boolean[this.FLD192.size()];
        for(int v = 0; v < this.FLD190.length; ++v) {
            if(hashSet0.contains(this.FLD192.get(v))) {
                this.MTH1037(v, true);
            }
        }
        this.notifyDataSetChanged();
    }
}

