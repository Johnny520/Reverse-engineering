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
import android.widget.Filter.FilterResults;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class CLS359 extends BaseAdapter implements Filterable {
    public static final class CLS358 {
        public TextView FLD3416;

    }

    public static final int FLD3417;
    public ArrayList FLD3418;
    public final int FLD3419;
    public final HashMap FLD3420;
    public HashSet FLD3421;
    public final LayoutInflater FLD3422;
    public final HashMap FLD3423;
    public final WeakReference FLD3424;
    public boolean[] FLD3425;
    public ArrayList FLD3426;

    public CLS359(Activity activity0) {
        this.FLD3420 = new HashMap();
        this.FLD3423 = new HashMap();
        this.FLD3419 = -1;
        this.FLD3421 = new HashSet();
        this.FLD3422 = LayoutInflater.from(activity0);
        this.FLD3424 = new WeakReference(activity0);
        this.MTH5228();
    }

    public CLS359(Activity activity0, ArrayList arrayList0) {
        this(activity0);
        this.FLD3426 = arrayList0;
        this.FLD3418 = arrayList0;
        this.FLD3425 = new boolean[arrayList0.size()];
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3426 == null ? 0 : this.FLD3426.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS357 extends Filter {
            public final CLS359 FLD3415;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS359 ⁱˉ0 = CLS359.this;
                if(ⁱˉ0.FLD3418 == null) {
                    ⁱˉ0.FLD3418 = ⁱˉ0.FLD3426;
                }
                if(!TextUtils.isEmpty(charSequence0)) {
                    if(ⁱˉ0.FLD3418 != null && !ⁱˉ0.FLD3418.isEmpty()) {
                        for(Object object0: ⁱˉ0.FLD3418) {
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
                filter$FilterResults0.values = ⁱˉ0.FLD3418;
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS359.this.MTH5235(((ArrayList)filter$FilterResults0.values));
            }
        }

        return new CLS357(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3426 == null ? null : this.FLD3426.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        Drawable drawable0;
        TextView textView1;
        CLS358 ⁱˉ$ᵔʾ0;
        View view1;
        try {
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                view1 = this.FLD3422.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS522.MTH7109());
                textView0.setBackgroundColor(CLS522.MTH7118());
                textView0.setPadding(v1, v1, v1, v1);
                ⁱˉ$ᵔʾ0 = new CLS358();
                ⁱˉ$ᵔʾ0.FLD3416 = textView0;
                try {
                    view1.setTag(ⁱˉ$ᵔʾ0);
                    view0 = view1;
                }
                catch(Throwable throwable0) {
                    goto label_72;
                }
            }
            else {
                ⁱˉ$ᵔʾ0 = (CLS358)view0.getTag();
            }
            ContentValues contentValues0 = (ContentValues)this.FLD3426.get(v);
            if(contentValues0 == null) {
                return view0;
            }
            String s = contentValues0.containsKey("desc") ? contentValues0.getAsString("desc") : "";
            if(TextUtils.isEmpty(s)) {
                s = "";
            }
            if(TextUtils.isEmpty(s)) {
                ⁱˉ$ᵔʾ0.FLD3416.setText("");
            }
            else {
                CLS523.MTH7155(ⁱˉ$ᵔʾ0.FLD3416, s);
            }
            view0.setBackgroundColor(CLS522.MTH7118());
            ⁱˉ$ᵔʾ0.FLD3416.setTextColor(CLS522.MTH7109());
            if(this.MTH5240(v)) {
                view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
                ⁱˉ$ᵔʾ0.FLD3416.setTextColor(-1);
            }
            if(contentValues0.containsKey("mp3")) {
                String s1 = this.MTH5236(new File(contentValues0.getAsString("mp3")));
                if(!TextUtils.isEmpty(s1)) {
                    textView1 = ⁱˉ$ᵔʾ0.FLD3416;
                    CLS523.MTH7155(textView1, contentValues0.getAsString("desc") + " " + s1);
                }
            }
            else if(contentValues0.containsKey("mp3_uri")) {
                String s2 = this.MTH5230(Uri.parse(contentValues0.getAsString("mp3_uri")));
                if(!TextUtils.isEmpty(s2)) {
                    textView1 = ⁱˉ$ᵔʾ0.FLD3416;
                    CLS523.MTH7155(textView1, contentValues0.getAsString("desc") + " " + s2);
                }
            }
            if(CLS359.MTH5232(contentValues0)) {
                Bitmap bitmap0 = this.MTH5237(contentValues0);
                drawable0 = bitmap0 == null ? null : new BitmapDrawable(CLS27.MTH900().getResources(), bitmap0);
            }
            else {
                drawable0 = null;
            }
            if(drawable0 == null && contentValues0.containsKey("wxid")) {
                ImageView imageView0 = new ImageView(((Context)this.FLD3424.get()));
                if(CLS372.MTH5403(imageView0, contentValues0.getAsString("wxid"))) {
                    drawable0 = imageView0.getDrawable();
                }
            }
            if(drawable0 == null) {
                ⁱˉ$ᵔʾ0.FLD3416.setCompoundDrawables(null, null, null, null);
            }
            else {
                drawable0.setBounds(0, 0, 0x60, 0x60);
                ⁱˉ$ᵔʾ0.FLD3416.setCompoundDrawablePadding(CLS523.MTH7137(10));
                ⁱˉ$ᵔʾ0.FLD3416.setCompoundDrawables(drawable0, null, null, null);
            }
            CLS523.MTH7166(ⁱˉ$ᵔʾ0.FLD3416, this.MTH5240(v));
            return view0;
        }
        catch(Throwable throwable0) {
            view1 = view0;
        }
    label_72:
        CLS27.MTH893(throwable0);
        return view1;
    }

    public final void MTH5227(int v, boolean z) {
        int v1 = this.FLD3419;
        if(v1 != -1 && z) {
            int v3 = 0;
            for(int v2 = 0; v2 < this.FLD3425.length; ++v2) {
                if(this.MTH5240(v2)) {
                    ++v3;
                }
            }
            if(v3 >= v1) {
                return;
            }
        }
        this.FLD3425[v] = z;
        ContentValues contentValues0 = (ContentValues)this.FLD3426.get(v);
        if(z) {
            this.FLD3421.add(contentValues0);
            return;
        }
        this.FLD3421.remove(contentValues0);
    }

    // 此方法包含解密的字符串
    public final void MTH5228() {
        CLS1269 יﹳ0;
        CLS40 ﾞᵎ0;
        CLS1272 ⁱʽ0 = new CLS1272(this, 0);
        CLS40.FLD157.MTH1116(((CLS39)ⁱʽ0));
        if(this.FLD3426 != null && !this.FLD3426.isEmpty()) {
            Set set0 = Collections.synchronizedSet(new HashSet());
            CLS1274 ﾞˎ0 = new CLS1274(this, set0, 2);
            for(Object object0: this.FLD3426) {
                ContentValues contentValues0 = (ContentValues)object0;
                if(CLS359.MTH5232(contentValues0)) {
                    set0.add(contentValues0);
                    ﾞᵎ0 = CLS40.FLD157;
                    יﹳ0 = new CLS1269(this, contentValues0, set0, ﾞˎ0, 0);
                }
                else if(contentValues0.containsKey("mp3")) {
                    set0.add(contentValues0);
                    ﾞᵎ0 = CLS40.FLD157;
                    יﹳ0 = new CLS1269(this, contentValues0, set0, ﾞˎ0, 1);
                }
                else {
                    if(!contentValues0.containsKey("mp3_uri")) {
                        continue;
                    }
                    set0.add(contentValues0);
                    ﾞᵎ0 = CLS40.FLD157;
                    יﹳ0 = new CLS1269(this, contentValues0, set0, ﾞˎ0, 2);
                }
                ﾞᵎ0.MTH1124(((CLS39)יﹳ0));
            }
        }
    }

    public final void MTH5229() {
        if(this.FLD3426 != null && !this.FLD3426.isEmpty()) {
            this.MTH5238();
            for(int v = 0; v < this.FLD3426.size(); ++v) {
                this.MTH5227(v, true);
                int v1 = this.FLD3419;
                if(v1 != -1 && this.MTH5240(v)) {
                    int v3 = 0;
                    for(int v2 = 0; v2 < this.FLD3425.length; ++v2) {
                        if(this.MTH5240(v2)) {
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
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final String MTH5230(Uri uri0) {
        return this.FLD3423.containsKey(uri0.toString()) ? ((String)this.FLD3423.get(uri0.toString())) : "";
    }

    public final void MTH5231(ContentValues contentValues0) {
        int v = this.FLD3426.indexOf(contentValues0);
        if(v != -1) {
            this.MTH5227(v, true);
        }
    }

    // 去混淆评级： 高(390)
    // 此方法包含解密的字符串
    public static boolean MTH5232(ContentValues contentValues0) {
        return contentValues0.containsKey("img") || contentValues0.containsKey("vid") || contentValues0.containsKey("gif") || contentValues0.containsKey("web_img") || contentValues0.containsKey("web_vid") || contentValues0.containsKey("web_gif") || contentValues0.containsKey("avatar") || contentValues0.containsKey("img_uri") || contentValues0.containsKey("vid_uri") || contentValues0.containsKey("gif_uri") || contentValues0.containsKey("type") && (contentValues0.containsKey("path") || contentValues0.containsKey("uri")) && CLS182.MTH3474(0x38EBB33E2B3CD335L, contentValues0) == -16;
    }

    public final void MTH5233(int v) {
        this.MTH5227(v, !this.MTH5240(v));
        this.notifyDataSetChanged();
    }

    public final ArrayList MTH5234() {
        ArrayList arrayList0 = new ArrayList();
        if(this.FLD3425 != null) {
            try {
            label_3:
                for(int v = 0; v < this.FLD3425.length; ++v) {
                    if(this.MTH5240(v)) {
                        arrayList0.add(((ContentValues)this.FLD3426.get(v)));
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

    public final void MTH5235(ArrayList arrayList0) {
        if(arrayList0 == null) {
            return;
        }
        this.MTH5228();
        HashSet hashSet0 = new HashSet();
        if(this.FLD3425 != null) {
            for(int v1 = 0; v1 < this.FLD3425.length; ++v1) {
                try {
                    if(this.MTH5240(v1)) {
                        hashSet0.add(((ContentValues)this.FLD3426.get(v1)));
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        this.FLD3421 = new HashSet();
        ArrayList arrayList1 = this.MTH5234();
        this.FLD3426 = arrayList0;
        for(Object object0: arrayList1) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(!this.FLD3426.contains(contentValues0)) {
                this.FLD3426.add(contentValues0);
            }
        }
        this.FLD3425 = new boolean[this.FLD3426.size()];
        for(int v = 0; v < this.FLD3425.length; ++v) {
            if(hashSet0.contains(this.FLD3426.get(v))) {
                this.MTH5227(v, true);
            }
        }
        this.notifyDataSetChanged();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH5236(File file0) {
        String s = file0.getAbsolutePath();
        return this.FLD3423.containsKey(s) ? ((String)this.FLD3423.get(s)) : "";
    }

    // 此方法包含解密的字符串
    public final Bitmap MTH5237(ContentValues contentValues0) {
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
                HashMap hashMap0 = this.FLD3420;
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

    public final void MTH5238() {
        if(this.FLD3426 != null && !this.FLD3426.isEmpty()) {
            for(int v = 0; v < this.FLD3426.size(); ++v) {
                this.MTH5227(v, false);
            }
            this.notifyDataSetChanged();
        }
    }

    public final void MTH5239(int v, int v1) {
        if(v == v1) {
            return;
        }
        try {
            boolean z = this.MTH5240(v);
            int v2 = Math.min(Math.max(0, v1), this.FLD3426.size() - 1);
            ContentValues contentValues0 = (ContentValues)this.getItem(v);
            this.MTH5227(v, false);
            this.FLD3426.remove(v);
            this.FLD3426.add(v2, contentValues0);
            this.MTH5227(v, z);
            this.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final boolean MTH5240(int v) {
        try {
            return this.FLD3425[v];
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }
}

