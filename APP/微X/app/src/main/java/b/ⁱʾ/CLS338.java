// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.Filter.FilterResults;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class CLS338 extends BaseAdapter implements Filterable {
    public static final class CLS337 {
        public CheckedTextView FLD3340;

    }

    public final int FLD3341;
    public boolean[] FLD3342;
    public ArrayList FLD3343;
    public final HashMap FLD3344;
    public static final int FLD3345;
    public final WeakReference FLD3346;
    public final LayoutInflater FLD3347;
    public final HashMap FLD3348;
    public final ListView FLD3349;
    public ArrayList FLD3350;
    public HashSet FLD3351;

    public CLS338(Activity activity0, ArrayList arrayList0, CLS1624 יﹳ0) {
        this.FLD3344 = new HashMap();
        this.FLD3348 = new HashMap();
        this.FLD3341 = -1;
        this.FLD3350 = arrayList0;
        this.FLD3342 = new boolean[arrayList0.size()];
        this.FLD3349 = יﹳ0.FLD5272;
        this.FLD3351 = new HashSet();
        this.FLD3347 = LayoutInflater.from(activity0);
        this.FLD3346 = new WeakReference(activity0);
        this.MTH5133();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3350 == null ? 0 : this.FLD3350.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS336 extends Filter {
            public final CLS338 FLD3339;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS338 יᐧ0 = CLS338.this;
                if(יᐧ0.FLD3343 == null) {
                    יᐧ0.FLD3343 = יᐧ0.FLD3350;
                }
                if(!TextUtils.isEmpty(charSequence0)) {
                    if(יᐧ0.FLD3343 != null && יᐧ0.FLD3343.size() > 0) {
                        for(Object object0: יᐧ0.FLD3343) {
                            ContentValues contentValues0 = (ContentValues)object0;
                            if(contentValues0.containsKey("tag") || contentValues0.containsKey("desc")) {
                                String s = contentValues0.containsKey("tag") ? contentValues0.getAsString("tag") : "";
                                String s1 = contentValues0.containsKey("desc") ? contentValues0.getAsString("desc") : "";
                                if(CLS502.MTH6940(s, new CharSequence[]{charSequence0}) || CLS502.MTH6940(s1, new CharSequence[]{charSequence0})) {
                                    arrayList0.add(contentValues0);
                                }
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                    return filter$FilterResults0;
                }
                filter$FilterResults0.values = יᐧ0.FLD3343;
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS338.this.MTH5123(((ArrayList)filter$FilterResults0.values));
            }
        }

        return new CLS336(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3350 == null ? null : this.FLD3350.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        Drawable drawable0;
        CheckedTextView checkedTextView1;
        CLS337 יᐧ$ᵔʾ0;
        View view1;
        try {
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                view1 = this.FLD3347.inflate(0x1090010, viewGroup0, false);
                view1.setPadding(v1, CLS523.MTH7137(10), v1, CLS523.MTH7137(10));
                CheckedTextView checkedTextView0 = (CheckedTextView)view1.findViewById(0x1020014);
                checkedTextView0.setTextColor(CLS522.MTH7109());
                checkedTextView0.setBackgroundColor(CLS522.MTH7118());
                checkedTextView0.setPadding(v1, v1, v1, v1);
                checkedTextView0.setMinHeight(90);
                checkedTextView0.setHeight(90);
                יᐧ$ᵔʾ0 = new CLS337();
                יᐧ$ᵔʾ0.FLD3340 = checkedTextView0;
                try {
                    view1.setTag(יᐧ$ᵔʾ0);
                    view0 = view1;
                }
                catch(Throwable throwable0) {
                    goto label_66;
                }
            }
            else {
                יᐧ$ᵔʾ0 = (CLS337)view0.getTag();
            }
            if(this.FLD3350 != null && !this.FLD3350.isEmpty()) {
                ContentValues contentValues0 = (ContentValues)this.FLD3350.get(v);
                String s = contentValues0.containsKey("desc") ? contentValues0.getAsString("desc") : "";
                if(TextUtils.isEmpty(s)) {
                    s = "";
                }
                CLS523.MTH7155(יᐧ$ᵔʾ0.FLD3340, s);
                יᐧ$ᵔʾ0.FLD3340.setChecked(this.MTH5134(v));
                if(contentValues0.containsKey("mp3")) {
                    String s1 = this.MTH5131(new File(contentValues0.getAsString("mp3")));
                    if(!TextUtils.isEmpty(s1)) {
                        checkedTextView1 = יᐧ$ᵔʾ0.FLD3340;
                        CLS523.MTH7155(checkedTextView1, contentValues0.getAsString("desc") + " " + s1);
                    }
                }
                else if(contentValues0.containsKey("mp3_uri")) {
                    String s2 = this.MTH5126(Uri.parse(contentValues0.getAsString("mp3_uri")));
                    if(!TextUtils.isEmpty(s2)) {
                        checkedTextView1 = יᐧ$ᵔʾ0.FLD3340;
                        CLS523.MTH7155(checkedTextView1, contentValues0.getAsString("desc") + " " + s2);
                    }
                }
                if(CLS338.MTH5128(contentValues0)) {
                    Bitmap bitmap0 = this.MTH5132(contentValues0);
                    drawable0 = bitmap0 == null ? null : new BitmapDrawable(CLS27.MTH900().getResources(), bitmap0);
                }
                else {
                    drawable0 = null;
                }
                if(drawable0 == null && contentValues0.containsKey("wxid")) {
                    ImageView imageView0 = new ImageView(((Context)this.FLD3346.get()));
                    if(CLS372.MTH5403(imageView0, contentValues0.getAsString("wxid"))) {
                        drawable0 = imageView0.getDrawable();
                    }
                }
                if(drawable0 != null) {
                    drawable0.setBounds(0, 0, 0x60, 0x60);
                    יᐧ$ᵔʾ0.FLD3340.setCompoundDrawablePadding(CLS523.MTH7137(10));
                    יᐧ$ᵔʾ0.FLD3340.setCompoundDrawables(drawable0, null, null, null);
                    return view0;
                }
                יᐧ$ᵔʾ0.FLD3340.setCompoundDrawables(null, null, null, null);
                return view0;
            }
            return view0;
        }
        catch(Throwable throwable0) {
            view1 = view0;
        }
    label_66:
        CLS27.MTH893(throwable0);
        return view1;
    }

    public final void MTH5123(ArrayList arrayList0) {
        if(arrayList0 == null) {
            return;
        }
        this.MTH5133();
        HashSet hashSet0 = new HashSet();
        if(this.FLD3342 != null) {
            for(int v1 = 0; v1 < this.FLD3342.length; ++v1) {
                try {
                    if(this.MTH5134(v1)) {
                        hashSet0.add(((ContentValues)this.FLD3350.get(v1)));
                    }
                    this.FLD3349.setItemChecked(v1, false);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        this.FLD3351 = new HashSet();
        ArrayList arrayList1 = this.MTH5129();
        this.FLD3350 = arrayList0;
        for(Object object0: arrayList1) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(!this.FLD3350.contains(contentValues0)) {
                this.FLD3350.add(contentValues0);
            }
        }
        this.FLD3342 = new boolean[this.FLD3350.size()];
        for(int v = 0; v < this.FLD3342.length; ++v) {
            if(hashSet0.contains(this.FLD3350.get(v))) {
                this.MTH5125(v, true);
            }
        }
        this.notifyDataSetChanged();
    }

    public final void MTH5124() {
        this.MTH5130();
        for(int v = 0; v < this.FLD3350.size(); ++v) {
            this.MTH5125(v, true);
            this.FLD3349.setItemChecked(v, true);
            int v1 = this.FLD3341;
            if(v1 != -1 && this.MTH5134(v)) {
                int v3 = 0;
                for(int v2 = 0; v2 < this.FLD3342.length; ++v2) {
                    if(this.MTH5134(v2)) {
                        ++v3;
                    }
                }
                if(v3 >= v1) {
                    return;
                }
            }
        }
        this.notifyDataSetChanged();
    }

    public final void MTH5125(int v, boolean z) {
        int v1 = this.FLD3341;
        if(v1 != -1 && z) {
            int v3 = 0;
            for(int v2 = 0; v2 < this.FLD3342.length; ++v2) {
                if(this.MTH5134(v2)) {
                    ++v3;
                }
            }
            if(v3 >= v1) {
                return;
            }
        }
        this.FLD3342[v] = z;
        ContentValues contentValues0 = (ContentValues)this.FLD3350.get(v);
        HashSet hashSet0 = this.FLD3351;
        if(z) {
            hashSet0.add(contentValues0);
        }
        else {
            hashSet0.remove(contentValues0);
        }
        this.FLD3349.setItemChecked(v, z);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final String MTH5126(Uri uri0) {
        return this.FLD3348.containsKey(uri0.toString()) ? ((String)this.FLD3348.get(uri0.toString())) : "";
    }

    public final void MTH5127(int v) {
        this.MTH5125(v, !this.MTH5134(v));
        this.notifyDataSetChanged();
    }

    // 去混淆评级： 高(390)
    // 此方法包含解密的字符串
    public static boolean MTH5128(ContentValues contentValues0) {
        return contentValues0.containsKey("img") || contentValues0.containsKey("vid") || contentValues0.containsKey("gif") || contentValues0.containsKey("web_img") || contentValues0.containsKey("web_vid") || contentValues0.containsKey("web_gif") || contentValues0.containsKey("avatar") || contentValues0.containsKey("img_uri") || contentValues0.containsKey("vid_uri") || contentValues0.containsKey("gif_uri") || contentValues0.containsKey("type") && (contentValues0.containsKey("path") || contentValues0.containsKey("uri")) && CLS182.MTH3474(4101570807786689333L, contentValues0) == -16;
    }

    public final ArrayList MTH5129() {
        ArrayList arrayList0 = new ArrayList();
        if(this.FLD3342 != null) {
            try {
            label_3:
                for(int v = 0; v < this.FLD3342.length; ++v) {
                    if(this.MTH5134(v)) {
                        arrayList0.add(((ContentValues)this.FLD3350.get(v)));
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                if(true) {
                    return arrayList0;
                }
                goto label_3;
            }
        }
        return arrayList0;
    }

    public final void MTH5130() {
        for(int v = 0; v < this.FLD3350.size(); ++v) {
            this.MTH5125(v, false);
        }
        this.notifyDataSetChanged();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH5131(File file0) {
        String s = file0.getAbsolutePath();
        return this.FLD3348.containsKey(s) ? ((String)this.FLD3348.get(s)) : "";
    }

    // 此方法包含解密的字符串
    public final Bitmap MTH5132(ContentValues contentValues0) {
        try {
            String s = "";
            if(contentValues0.containsKey("img")) {
                s = contentValues0.getAsString("img");
            }
            else if(contentValues0.containsKey("gif")) {
                s = contentValues0.getAsString("gif");
            }
            else if(contentValues0.containsKey("vid")) {
                s = contentValues0.getAsString("vid");
            }
            else if(contentValues0.containsKey("img_uri")) {
                s = contentValues0.getAsString("img_uri");
            }
            else if(contentValues0.containsKey("gif_uri")) {
                s = contentValues0.getAsString("gif_uri");
            }
            else if(contentValues0.containsKey("vid_uri")) {
                s = contentValues0.getAsString("vid_uri");
            }
            else if(contentValues0.containsKey("web_img")) {
                s = contentValues0.getAsString("web_img");
            }
            else if(contentValues0.containsKey("web_gif")) {
                s = contentValues0.getAsString("web_gif");
            }
            else if(contentValues0.containsKey("web_vid")) {
                s = contentValues0.getAsString("web_vid");
            }
            else if(!contentValues0.containsKey("type") || !contentValues0.containsKey("path") && !contentValues0.containsKey("uri")) {
                if(contentValues0.containsKey("avatar")) {
                    s = contentValues0.getAsString("avatar");
                }
            }
            else if(((int)contentValues0.getAsInteger("type")) == -16) {
                if(contentValues0.containsKey("path")) {
                    s = contentValues0.getAsString("path");
                }
                else if(contentValues0.containsKey("uri")) {
                    s = contentValues0.getAsString("uri");
                }
            }
            if(!TextUtils.isEmpty(s)) {
                HashMap hashMap0 = this.FLD3344;
                if(hashMap0.containsKey(s)) {
                    return (Bitmap)hashMap0.get(s);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH5133() {
        CLS1273 ⁱᵔ0;
        CLS40 ﾞᵎ0;
        CLS1271 ᐧˉ0 = new CLS1271(this, 0);
        CLS40.FLD157.MTH1116(((CLS39)ᐧˉ0));
        if(this.FLD3350 != null && !this.FLD3350.isEmpty()) {
            Set set0 = Collections.synchronizedSet(new HashSet());
            CLS1274 ﾞˎ0 = new CLS1274(this, set0, 1);
            for(Object object0: this.FLD3350) {
                ContentValues contentValues0 = (ContentValues)object0;
                if(CLS338.MTH5128(contentValues0)) {
                    set0.add(contentValues0);
                    ﾞᵎ0 = CLS40.FLD157;
                    ⁱᵔ0 = new CLS1273(this, contentValues0, set0, ﾞˎ0, 0);
                }
                else if(contentValues0.containsKey("mp3")) {
                    set0.add(contentValues0);
                    ﾞᵎ0 = CLS40.FLD157;
                    ⁱᵔ0 = new CLS1273(this, contentValues0, set0, ﾞˎ0, 1);
                }
                else {
                    if(!contentValues0.containsKey("mp3_uri")) {
                        continue;
                    }
                    set0.add(contentValues0);
                    ﾞᵎ0 = CLS40.FLD157;
                    ⁱᵔ0 = new CLS1273(this, contentValues0, set0, ﾞˎ0, 2);
                }
                ﾞᵎ0.MTH1124(((CLS39)ⁱᵔ0));
            }
        }
    }

    public final boolean MTH5134(int v) {
        try {
            return v <= this.FLD3342.length ? this.FLD3342[v] : false;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }
}

