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

public final class CLS335 extends BaseAdapter implements Filterable {
    public static final class CLS334 {
        public TextView FLD3330;

    }

    public boolean FLD3331;
    public final HashMap FLD3332;
    public ArrayList FLD3333;
    public final LayoutInflater FLD3334;
    public final HashMap FLD3335;
    public final WeakReference FLD3336;
    public int FLD3337;
    public ArrayList FLD3338;

    public CLS335(Activity activity0) {
        this.FLD3332 = new HashMap();
        this.FLD3335 = new HashMap();
        this.FLD3337 = -1;
        this.FLD3331 = false;
        this.FLD3336 = new WeakReference(activity0);
        this.FLD3334 = LayoutInflater.from(activity0);
    }

    public CLS335(Activity activity0, ArrayList arrayList0) {
        this(activity0);
        this.FLD3333 = arrayList0;
        this.FLD3338 = arrayList0;
        this.MTH5112();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3333 == null ? 0 : this.FLD3333.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS333 extends Filter {
            public final CLS335 FLD3329;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                CLS335 ˑٴ0 = CLS335.this;
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                try {
                    ArrayList arrayList0 = new ArrayList();
                    if(ˑٴ0.FLD3338 == null) {
                        ˑٴ0.FLD3338 = ˑٴ0.FLD3333;
                    }
                    if(!TextUtils.isEmpty(charSequence0)) {
                        if(ˑٴ0.FLD3338 != null && !ˑٴ0.FLD3338.isEmpty()) {
                            for(Object object0: ˑٴ0.FLD3338) {
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
                        ˑٴ0.FLD3337 = -1;
                        return filter$FilterResults0;
                    }
                    filter$FilterResults0.values = ˑٴ0.FLD3338;
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS335.this.FLD3333 = (ArrayList)filter$FilterResults0.values;
                CLS335.this.notifyDataSetChanged();
            }
        }

        return new CLS333(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3333 == null || this.FLD3333.isEmpty() ? null : this.FLD3333.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        Drawable drawable0;
        TextView textView1;
        CLS334 ˑٴ$ᵔʾ0;
        View view1;
        try {
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                view1 = this.FLD3334.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS522.MTH7109());
                textView0.setBackgroundColor(CLS522.MTH7118());
                textView0.setPadding(v1, v1, v1, v1);
                ˑٴ$ᵔʾ0 = new CLS334();
                ˑٴ$ᵔʾ0.FLD3330 = textView0;
                try {
                    view1.setTag(ˑٴ$ᵔʾ0);
                    view0 = view1;
                }
                catch(Throwable throwable0) {
                    goto label_81;
                }
            }
            else {
                ˑٴ$ᵔʾ0 = (CLS334)view0.getTag();
            }
            ContentValues contentValues0 = (ContentValues)this.FLD3333.get(v);
            if(contentValues0 == null) {
                return view0;
            }
            String s = contentValues0.containsKey("desc") ? contentValues0.getAsString("desc") : "";
            if(TextUtils.isEmpty(s)) {
                s = "";
            }
            if(this.FLD3331) {
                s = v + 1 + ") " + s;
            }
            if(TextUtils.isEmpty(s)) {
                ˑٴ$ᵔʾ0.FLD3330.setText("");
            }
            else {
                CLS523.MTH7155(ˑٴ$ᵔʾ0.FLD3330, s);
            }
            boolean z = true;
            boolean z1 = contentValues0.containsKey("enabled") || contentValues0.containsKey("enable");
            if((!contentValues0.containsKey("enabled") || !contentValues0.getAsBoolean("enabled").booleanValue()) && (!contentValues0.containsKey("enable") || !contentValues0.getAsBoolean("enable").booleanValue())) {
                z = false;
            }
            if((this.FLD3337 != -1 || z) && (this.FLD3337 == v || z)) {
                view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
                ˑٴ$ᵔʾ0.FLD3330.setTextColor(-1);
            }
            else {
                view0.setBackgroundColor(CLS522.MTH7118());
                ˑٴ$ᵔʾ0.FLD3330.setTextColor(CLS522.MTH7109());
            }
            if(contentValues0.containsKey("mp3")) {
                String s1 = this.MTH5109(new File(contentValues0.getAsString("mp3")));
                if(!TextUtils.isEmpty(s1)) {
                    textView1 = ˑٴ$ᵔʾ0.FLD3330;
                    CLS523.MTH7155(textView1, contentValues0.getAsString("desc") + " " + s1);
                }
            }
            else if(contentValues0.containsKey("mp3_uri")) {
                String s2 = this.MTH5106(Uri.parse(contentValues0.getAsString("mp3_uri")));
                if(!TextUtils.isEmpty(s2)) {
                    textView1 = ˑٴ$ᵔʾ0.FLD3330;
                    CLS523.MTH7155(textView1, contentValues0.getAsString("desc") + " " + s2);
                }
            }
            if(CLS335.MTH5110(contentValues0)) {
                Bitmap bitmap0 = this.MTH5108(contentValues0);
                drawable0 = bitmap0 == null ? null : new BitmapDrawable(CLS27.MTH900().getResources(), bitmap0);
            }
            else {
                drawable0 = null;
            }
            if(drawable0 == null && contentValues0.containsKey("wxid")) {
                ImageView imageView0 = new ImageView(((Context)this.FLD3336.get()));
                if(CLS372.MTH5403(imageView0, contentValues0.getAsString("wxid"))) {
                    drawable0 = imageView0.getDrawable();
                }
            }
            if(drawable0 == null) {
                ˑٴ$ᵔʾ0.FLD3330.setCompoundDrawables(null, null, null, null);
            }
            else {
                drawable0.setBounds(0, 0, 0x60, 0x60);
                ˑٴ$ᵔʾ0.FLD3330.setCompoundDrawablePadding(CLS523.MTH7137(10));
                ˑٴ$ᵔʾ0.FLD3330.setCompoundDrawables(drawable0, null, null, null);
            }
            if(z1) {
                CLS523.MTH7166(ˑٴ$ᵔʾ0.FLD3330, z);
                return view0;
            }
            return view0;
        }
        catch(Throwable throwable0) {
            view1 = view0;
        }
    label_81:
        CLS27.MTH893(throwable0);
        return view1;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final String MTH5106(Uri uri0) {
        return this.FLD3335.containsKey(uri0.toString()) ? ((String)this.FLD3335.get(uri0.toString())) : "";
    }

    public final void MTH5107(int v, int v1) {
        if(v == v1) {
            return;
        }
        try {
            int v2 = Math.min(Math.max(0, v1), this.FLD3333.size() - 1);
            ContentValues contentValues0 = (ContentValues)this.getItem(v);
            this.FLD3333.remove(v);
            this.FLD3333.add(v2, contentValues0);
            this.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final Bitmap MTH5108(ContentValues contentValues0) {
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
                HashMap hashMap0 = this.FLD3332;
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

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH5109(File file0) {
        String s = file0.getAbsolutePath();
        return this.FLD3335.containsKey(s) ? ((String)this.FLD3335.get(s)) : "";
    }

    // 去混淆评级： 高(390)
    // 此方法包含解密的字符串
    public static boolean MTH5110(ContentValues contentValues0) {
        return contentValues0.containsKey("img") || contentValues0.containsKey("vid") || contentValues0.containsKey("gif") || contentValues0.containsKey("web_img") || contentValues0.containsKey("web_vid") || contentValues0.containsKey("web_gif") || contentValues0.containsKey("avatar") || contentValues0.containsKey("img_uri") || contentValues0.containsKey("vid_uri") || contentValues0.containsKey("gif_uri") || contentValues0.containsKey("type") && (contentValues0.containsKey("path") || contentValues0.containsKey("uri")) && CLS182.MTH3474(0x38EBC9A42B3CD335L, contentValues0) == -16;
    }

    public final void MTH5111(ArrayList arrayList0) {
        this.FLD3333 = arrayList0;
        this.FLD3338 = arrayList0;
        this.MTH5112();
        this.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public final void MTH5112() {
        CLS1268 ˈˊ0;
        CLS40 ﾞᵎ0;
        CLS1270 ـˏ0 = new CLS1270(this, 0);
        CLS40.FLD157.MTH1116(((CLS39)ـˏ0));
        if(this.FLD3333 != null && !this.FLD3333.isEmpty()) {
            Set set0 = Collections.synchronizedSet(new HashSet());
            CLS1274 ﾞˎ0 = new CLS1274(this, set0, 0);
            for(Object object0: this.FLD3333) {
                ContentValues contentValues0 = (ContentValues)object0;
                if(CLS335.MTH5110(contentValues0)) {
                    set0.add(contentValues0);
                    ﾞᵎ0 = CLS40.FLD157;
                    ˈˊ0 = new CLS1268(this, contentValues0, set0, ﾞˎ0, 0);
                }
                else if(contentValues0.containsKey("mp3")) {
                    set0.add(contentValues0);
                    ﾞᵎ0 = CLS40.FLD157;
                    ˈˊ0 = new CLS1268(this, contentValues0, set0, ﾞˎ0, 1);
                }
                else {
                    if(!contentValues0.containsKey("mp3_uri")) {
                        continue;
                    }
                    set0.add(contentValues0);
                    ﾞᵎ0 = CLS40.FLD157;
                    ˈˊ0 = new CLS1268(this, contentValues0, set0, ﾞˎ0, 2);
                }
                ﾞᵎ0.MTH1124(((CLS39)ˈˊ0));
            }
        }
    }
}

