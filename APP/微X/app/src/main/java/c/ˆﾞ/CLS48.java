// Decompiled by JEB v5.42.0.202606242140

package c.ˆﾞ;

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
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS169;
import c.ˏᵎ.CLS176;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS197;
import c.ˏᵎ.CLS205;
import c.ˏᵎ.CLS226;
import c.ﹶˆ.CLS345;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CLS48 extends BaseAdapter implements Filterable {
    public static class CLS47 {
        public TextView FLD143;

        public CLS47() {
        }

        public CLS47(CLS46 ˈᴵ$ⁱˋ0) {
        }
    }

    public final LayoutInflater FLD144;
    public int FLD145;
    public HashSet FLD146;
    public final WeakReference FLD147;
    public ArrayList FLD148;
    public ArrayList FLD149;
    public boolean FLD150;
    public final HashMap FLD151;
    public boolean[] FLD152;
    public final HashMap FLD153;

    public CLS48(Activity activity0) {
        this.FLD151 = new HashMap();
        this.FLD153 = new HashMap();
        this.FLD145 = -1;
        this.FLD150 = false;
        this.FLD146 = new HashSet();
        this.FLD144 = LayoutInflater.from(activity0);
        this.FLD147 = new WeakReference(activity0);
        this.MTH907();
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return this.FLD148 == null ? 0 : this.FLD148.size();
    }

    @Override  // android.widget.Filterable
    public Filter getFilter() {
        public class CLS46 extends Filter {
            public final CLS48 FLD142;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                if(CLS48.this.FLD149 == null) {
                    CLS48.this.FLD149 = CLS48.this.FLD148;
                }
                if(!TextUtils.isEmpty(charSequence0)) {
                    if(CLS48.this.FLD149 != null && !CLS48.this.FLD149.isEmpty()) {
                        for(Object object0: CLS48.this.FLD149) {
                            ContentValues contentValues0 = (ContentValues)object0;
                            if(contentValues0.containsKey("tag") || contentValues0.containsKey("desc")) {
                                String s = contentValues0.containsKey("tag") ? contentValues0.getAsString("tag") : "";
                                String s1 = contentValues0.containsKey("desc") ? contentValues0.getAsString("desc") : "";
                                if(CLS197.MTH2925(s, new CharSequence[]{charSequence0}) || CLS197.MTH2925(s1, new CharSequence[]{charSequence0})) {
                                    arrayList0.add(contentValues0);
                                }
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                    return filter$FilterResults0;
                }
                filter$FilterResults0.values = CLS48.this.FLD149;
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS48.this.MTH906(((ArrayList)filter$FilterResults0.values));
            }
        }

        return new CLS46(this);
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.FLD148 == null ? null : this.FLD148.get(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)v;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        BitmapDrawable bitmapDrawable0;
        CLS47 ˈᴵ$ﾞⁱ0;
        try {
            int v1 = CLS144.MTH2175(5);
            if(view0 == null) {
                View view1 = this.FLD144.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS226.MTH3099());
                textView0.setBackgroundColor(CLS226.MTH3105());
                textView0.setPadding(v1, v1, v1, v1);
                ˈᴵ$ﾞⁱ0 = new CLS47(null);
                ˈᴵ$ﾞⁱ0.FLD143 = textView0;
                view0 = view1;
                view1.setTag(ˈᴵ$ﾞⁱ0);
                view0 = view1;
            }
            else {
                ˈᴵ$ﾞⁱ0 = (CLS47)view0.getTag();
            }
            ContentValues contentValues0 = (ContentValues)this.FLD148.get(v);
            if(contentValues0 == null) {
                return view0;
            }
            String s = contentValues0.getAsString("desc");
            if(this.FLD150) {
                s = v + 1 + ") " + s;
            }
            if(TextUtils.isEmpty(s)) {
                ˈᴵ$ﾞⁱ0.FLD143.setText("");
            }
            else {
                CLS144.MTH2197(ˈᴵ$ﾞⁱ0.FLD143, s);
            }
            view0.setBackgroundColor(CLS226.MTH3105());
            ˈᴵ$ﾞⁱ0.FLD143.setTextColor(CLS226.MTH3099());
            if(this.MTH896(v)) {
                view0.setBackgroundColor(CLS226.MTH3109("#2196F3"));
                ˈᴵ$ﾞⁱ0.FLD143.setTextColor(-1);
            }
            if(contentValues0.containsKey("mp3_uri")) {
                String s1 = this.MTH893(contentValues0.getAsString("mp3_uri"));
                if(!TextUtils.isEmpty(s1)) {
                    CLS144.MTH2197(ˈᴵ$ﾞⁱ0.FLD143, contentValues0.getAsString("desc") + " " + s1);
                }
            }
            if(this.MTH894(contentValues0)) {
                Bitmap bitmap0 = this.MTH899(contentValues0);
                bitmapDrawable0 = bitmap0 == null ? null : new BitmapDrawable(CLS98.MTH1323().getResources(), bitmap0);
            }
            else {
                bitmapDrawable0 = null;
            }
            if(bitmapDrawable0 == null) {
                ˈᴵ$ﾞⁱ0.FLD143.setCompoundDrawables(null, null, null, null);
            }
            else {
                bitmapDrawable0.setBounds(0, 0, 0x60, 0x60);
                ˈᴵ$ﾞⁱ0.FLD143.setCompoundDrawablePadding(CLS144.MTH2175(10));
                ˈᴵ$ﾞⁱ0.FLD143.setCompoundDrawables(bitmapDrawable0, null, null, null);
            }
            CLS144.MTH2160(ˈᴵ$ﾞⁱ0.FLD143, this.MTH896(v));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return view0;
    }

    public void MTH890(ContentValues contentValues0) {
        this.MTH891(this.FLD148.indexOf(contentValues0));
    }

    public void MTH891(int v) {
        this.MTH903(v, !this.MTH896(v));
        this.notifyDataSetChanged();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final String MTH893(String s) {
        return this.FLD153.containsKey(s) ? ((String)this.FLD153.get(s)) : "";
    }

    // 去混淆评级： 中等(90)
    // 此方法包含解密的字符串
    public final boolean MTH894(ContentValues contentValues0) {
        return contentValues0.containsKey("img_uri") || contentValues0.containsKey("vid_uri") || contentValues0.containsKey("gif_uri");
    }

    public boolean MTH896(int v) {
        try {
            return this.FLD152[v];
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    public void MTH898() {
        if(this.FLD148 != null && !this.FLD148.isEmpty()) {
            for(int v = 0; v < this.FLD148.size(); ++v) {
                this.MTH903(v, false);
            }
            this.notifyDataSetChanged();
        }
    }

    // 此方法包含解密的字符串
    public final Bitmap MTH899(ContentValues contentValues0) {
        try {
            String s = "";
            if(contentValues0.containsKey("img_uri")) {
                s = contentValues0.getAsString("img_uri");
            }
            else if(contentValues0.containsKey("gif_uri")) {
                s = contentValues0.getAsString("gif_uri");
            }
            else if(contentValues0.containsKey("vid_uri")) {
                s = contentValues0.getAsString("vid_uri");
            }
            if(!TextUtils.isEmpty(s) && this.FLD151.containsKey(s)) {
                return (Bitmap)this.FLD151.get(s);
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return null;
    }

    private void MTH901(Set set0) {
        if(!set0.isEmpty()) {
            return;
        }
        CLS70.MTH1131().MTH1127(((CLS69)new CLS412(this)));
    }

    public void MTH902(List list0) {
        for(Object object0: list0) {
            this.MTH904(((ContentValues)object0));
        }
    }

    public void MTH903(int v, boolean z) {
        if(this.FLD145 != -1 && z && this.MTH909() >= this.FLD145) {
            return;
        }
        this.FLD152[v] = z;
        ContentValues contentValues0 = (ContentValues)this.FLD148.get(v);
        if(z) {
            this.FLD146.add(contentValues0);
            return;
        }
        this.FLD146.remove(contentValues0);
    }

    public void MTH904(ContentValues contentValues0) {
        int v = this.FLD148.indexOf(contentValues0);
        if(v != -1) {
            this.MTH903(v, true);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH905(ContentValues contentValues0) {
        HashMap hashMap0;
        Bitmap bitmap0;
        String s;
        try {
            if(this.MTH899(contentValues0) != null) {
                return;
            }
            if(contentValues0.containsKey("img_uri")) {
                s = contentValues0.getAsString("img_uri");
                bitmap0 = CLS169.MTH2345(Uri.parse(contentValues0.getAsString("img_uri")));
                if(bitmap0 != null) {
                    hashMap0 = this.FLD151;
                    hashMap0.put(s, bitmap0);
                }
            }
            else if(contentValues0.containsKey("gif_uri")) {
                s = contentValues0.getAsString("gif_uri");
                bitmap0 = CLS169.MTH2345(Uri.parse(contentValues0.getAsString("gif_uri")));
                if(bitmap0 != null) {
                    hashMap0 = this.FLD151;
                    hashMap0.put(s, bitmap0);
                }
            }
            else if(contentValues0.containsKey("vid_uri")) {
                s = contentValues0.getAsString("vid_uri");
                bitmap0 = CLS169.MTH2340(Uri.parse(contentValues0.getAsString("vid_uri")));
                hashMap0 = this.FLD151;
                hashMap0.put(s, bitmap0);
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public void MTH906(ArrayList arrayList0) {
        if(arrayList0 == null) {
            return;
        }
        this.MTH907();
        HashSet hashSet0 = new HashSet();
        if(this.FLD152 != null) {
            for(int v1 = 0; v1 < this.FLD152.length; ++v1) {
                try {
                    if(this.MTH896(v1)) {
                        hashSet0.add(((ContentValues)this.FLD148.get(v1)));
                    }
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }
        this.FLD146 = new HashSet();
        ArrayList arrayList1 = this.MTH910();
        this.FLD148 = arrayList0;
        for(Object object0: arrayList1) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(!this.FLD148.contains(contentValues0)) {
                this.FLD148.add(contentValues0);
            }
        }
        this.FLD152 = new boolean[this.FLD148.size()];
        for(int v = 0; v < this.FLD152.length; ++v) {
            if(hashSet0.contains(this.FLD148.get(v))) {
                this.MTH903(v, true);
            }
        }
        this.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public void MTH907() {
        CLS410 ʾʻ0;
        CLS70 ᵎʾ0;
        CLS70.MTH1131().MTH1127(((CLS69)new CLS412(this)));
        if(this.FLD148 != null && !this.FLD148.isEmpty()) {
            Set set0 = Collections.synchronizedSet(new HashSet());
            CLS413 ﾞⁱ0 = new CLS413(this, set0);
            for(Object object0: this.FLD148) {
                ContentValues contentValues0 = (ContentValues)object0;
                if(this.MTH894(contentValues0)) {
                    set0.add(contentValues0);
                    ᵎʾ0 = CLS70.MTH1131();
                    ʾʻ0 = () -> {
                        this.MTH905(contentValues0);
                        set0.remove(contentValues0);
                        ((CLS345)ﾞⁱ0).MTH4829();
                    };
                }
                else {
                    if(!contentValues0.containsKey("mp3_uri")) {
                        continue;
                    }
                    set0.add(contentValues0);
                    ᵎʾ0 = CLS70.MTH1131();
                    ʾʻ0 = () -> // 此方法包含解密的字符串
                    {
                        this.MTH913(contentValues0.getAsString("mp3_uri"));
                        set0.remove(contentValues0);
                        ((CLS345)ﾞⁱ0).MTH4829();
                    };
                }
                ᵎʾ0.MTH1139(((CLS69)ʾʻ0));
            }
        }
    }

    // 检测为 Lambda 实现
    private void MTH908(ContentValues contentValues0, Set set0, CLS345 ⁱˋ0) [...]

    public int MTH909() {
        int v1 = 0;
        for(int v = 0; v < this.FLD152.length; ++v) {
            if(this.MTH896(v)) {
                ++v1;
            }
        }
        return v1;
    }

    public ArrayList MTH910() {
        ArrayList arrayList0 = new ArrayList();
        if(this.FLD152 != null) {
            try {
            label_3:
                for(int v = 0; v < this.FLD152.length; ++v) {
                    if(this.MTH896(v)) {
                        arrayList0.add(((ContentValues)this.FLD148.get(v)));
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
                if(true) {
                    return arrayList0;
                }
                goto label_3;
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH912(ContentValues contentValues0, Set set0, CLS345 ⁱˋ0) [...]

    public final void MTH913(String s) {
        try {
            if(!TextUtils.isEmpty(this.MTH893(s))) {
                return;
            }
            String s1 = CLS205.MTH2977(CLS176.MTH2583(Uri.parse(s)));
            this.FLD153.put(s, s1);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }
}

