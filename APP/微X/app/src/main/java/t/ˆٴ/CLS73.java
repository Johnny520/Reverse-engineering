// Decompiled by JEB v5.42.0.202606242140

package t.ˆٴ;

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
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˑٴ.CLS114;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;

public final class CLS73 extends BaseAdapter implements Filterable {
    public static final class CLS72 {
        public TextView FLD560;

    }

    public final HashMap FLD561;
    public ArrayList FLD562;
    public final LayoutInflater FLD563;
    public final HashMap FLD564;
    public final WeakReference FLD565;
    public int FLD566;
    public ArrayList FLD567;

    public CLS73(Activity activity0) {
        this.FLD561 = new HashMap();
        this.FLD564 = new HashMap();
        this.FLD566 = -1;
        this.FLD565 = new WeakReference(activity0);
        this.FLD563 = LayoutInflater.from(activity0);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD562 == null ? 0 : this.FLD562.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS71 extends Filter {
            public final CLS73 FLD559;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                CLS73 ﾞᐧ0 = CLS73.this;
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                try {
                    ArrayList arrayList0 = new ArrayList();
                    if(ﾞᐧ0.FLD567 == null) {
                        ﾞᐧ0.FLD567 = ﾞᐧ0.FLD562;
                    }
                    if(!TextUtils.isEmpty(charSequence0)) {
                        if(ﾞᐧ0.FLD567 != null && !ﾞᐧ0.FLD567.isEmpty()) {
                            for(Object object0: ﾞᐧ0.FLD567) {
                                ContentValues contentValues0 = (ContentValues)object0;
                                if(contentValues0.containsKey("tag") || contentValues0.containsKey("desc")) {
                                    String s = contentValues0.containsKey("tag") ? contentValues0.getAsString("tag") : "";
                                    String s1 = contentValues0.containsKey("desc") ? contentValues0.getAsString("desc") : "";
                                    if(CLS33.MTH1354(s, new CharSequence[]{charSequence0}) || CLS33.MTH1354(s1, new CharSequence[]{charSequence0})) {
                                        arrayList0.add(contentValues0);
                                    }
                                }
                            }
                        }
                        filter$FilterResults0.values = arrayList0;
                        ﾞᐧ0.FLD566 = -1;
                        return filter$FilterResults0;
                    }
                    filter$FilterResults0.values = ﾞᐧ0.FLD567;
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS73.this.FLD562 = (ArrayList)filter$FilterResults0.values;
                CLS73.this.notifyDataSetChanged();
            }
        }

        return new CLS71(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD562 == null || this.FLD562.isEmpty() ? null : this.FLD562.get(v);
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
        CLS72 ﾞᐧ$ᵔʾ0;
        View view1;
        try {
            int v1 = CLS43.MTH1439(5);
            if(view0 == null) {
                view1 = this.FLD563.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS46.MTH1452());
                textView0.setBackgroundColor(CLS46.MTH1446());
                textView0.setPadding(v1, v1, v1, v1);
                ﾞᐧ$ᵔʾ0 = new CLS72();
                ﾞᐧ$ᵔʾ0.FLD560 = textView0;
                try {
                    view1.setTag(ﾞᐧ$ᵔʾ0);
                    view0 = view1;
                }
                catch(Throwable throwable0) {
                    goto label_84;
                }
            }
            else {
                ﾞᐧ$ᵔʾ0 = (CLS72)view0.getTag();
            }
            ContentValues contentValues0 = (ContentValues)this.FLD562.get(v);
            if(contentValues0 == null) {
                return view0;
            }
            String s = contentValues0.containsKey("desc") ? contentValues0.getAsString("desc") : "";
            if(TextUtils.isEmpty(s)) {
                s = "";
            }
            if(TextUtils.isEmpty(s)) {
                ﾞᐧ$ᵔʾ0.FLD560.setText("");
            }
            else {
                CLS43.MTH1429(ﾞᐧ$ᵔʾ0.FLD560, s);
            }
            boolean z = true;
            boolean z1 = contentValues0.containsKey("enabled") || contentValues0.containsKey("enable");
            boolean z2 = contentValues0.containsKey("enabled") && contentValues0.getAsBoolean("enabled").booleanValue() || contentValues0.containsKey("enable") && contentValues0.getAsBoolean("enable").booleanValue();
            if((this.FLD566 != -1 || z2) && (this.FLD566 == v || z2)) {
                view0.setBackgroundColor(CLS46.MTH1447("#2196F3"));
                ﾞᐧ$ᵔʾ0.FLD560.setTextColor(-1);
            }
            else {
                view0.setBackgroundColor(CLS46.MTH1446());
                ﾞᐧ$ᵔʾ0.FLD560.setTextColor(CLS46.MTH1452());
            }
            if(contentValues0.containsKey("mp3")) {
                String s1 = this.MTH1563(new File(contentValues0.getAsString("mp3")));
                if(!TextUtils.isEmpty(s1)) {
                    textView1 = ﾞᐧ$ᵔʾ0.FLD560;
                    CLS43.MTH1429(textView1, contentValues0.getAsString("desc") + " " + s1);
                }
            }
            else if(contentValues0.containsKey("mp3_uri")) {
                String s2 = this.MTH1560(Uri.parse(contentValues0.getAsString("mp3_uri")));
                if(!TextUtils.isEmpty(s2)) {
                    textView1 = ﾞᐧ$ᵔʾ0.FLD560;
                    CLS43.MTH1429(textView1, contentValues0.getAsString("desc") + " " + s2);
                }
            }
            if(CLS73.MTH1564(contentValues0)) {
                Bitmap bitmap0 = this.MTH1562(contentValues0);
                drawable0 = bitmap0 == null ? null : new BitmapDrawable(CLS133.MTH2108().getResources(), bitmap0);
            }
            else {
                drawable0 = null;
            }
            if(drawable0 == null && contentValues0.containsKey("wxid")) {
                ImageView imageView0 = new ImageView(((Context)this.FLD565.get()));
                String s3 = contentValues0.getAsString("wxid");
                try {
                    CLS33.MTH1350(imageView0, s3);
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                    z = false;
                }
                if(z) {
                    drawable0 = imageView0.getDrawable();
                }
            }
            if(drawable0 == null) {
                ﾞᐧ$ᵔʾ0.FLD560.setCompoundDrawables(null, null, null, null);
            }
            else {
                drawable0.setBounds(0, 0, 0x60, 0x60);
                ﾞᐧ$ᵔʾ0.FLD560.setCompoundDrawablePadding(CLS43.MTH1439(10));
                ﾞᐧ$ᵔʾ0.FLD560.setCompoundDrawables(drawable0, null, null, null);
            }
            if(z1) {
                ﾞᐧ$ᵔʾ0.FLD560.setContentDescription(ﾞᐧ$ᵔʾ0.FLD560.getText() + "\n" + CLS133.MTH2099("status") + CLS133.MTH2099(CLS114.MTH1900((z2 ? -77317275848009L : -77360225520969L))));
                return view0;
            }
            return view0;
        }
        catch(Throwable throwable0) {
            view1 = view0;
        }
    label_84:
        CLS133.MTH2113(throwable0);
        return view1;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final String MTH1560(Uri uri0) {
        return this.FLD564.containsKey(uri0.toString()) ? ((String)this.FLD564.get(uri0.toString())) : "";
    }

    // 此方法包含解密的字符串
    public final void MTH1561() {
        CLS281 ˊﾞ0;
        CLS137 ⁱᵔ0;
        CLS282 ٴـ0 = new CLS282(this, 0);
        CLS137.FLD972.MTH2145(((CLS136)ٴـ0));
        if(this.FLD562 != null && !this.FLD562.isEmpty()) {
            Set set0 = Collections.synchronizedSet(new HashSet());
            CLS283 ⁱʾ0 = new CLS283(this, set0, 0);
            for(Object object0: this.FLD562) {
                ContentValues contentValues0 = (ContentValues)object0;
                if(CLS73.MTH1564(contentValues0)) {
                    set0.add(contentValues0);
                    ⁱᵔ0 = CLS137.FLD972;
                    ˊﾞ0 = new CLS281(this, contentValues0, set0, ⁱʾ0, 0);
                }
                else if(contentValues0.containsKey("mp3")) {
                    set0.add(contentValues0);
                    ⁱᵔ0 = CLS137.FLD972;
                    ˊﾞ0 = new CLS281(this, contentValues0, set0, ⁱʾ0, 1);
                }
                else {
                    if(!contentValues0.containsKey("mp3_uri")) {
                        continue;
                    }
                    set0.add(contentValues0);
                    ⁱᵔ0 = CLS137.FLD972;
                    ˊﾞ0 = new CLS281(this, contentValues0, set0, ⁱʾ0, 2);
                }
                ⁱᵔ0.MTH2141(((CLS136)ˊﾞ0));
            }
        }
    }

    // 此方法包含解密的字符串
    public final Bitmap MTH1562(ContentValues contentValues0) {
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
                HashMap hashMap0 = this.FLD561;
                if(hashMap0.containsKey(s)) {
                    return (Bitmap)hashMap0.get(s);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return null;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH1563(File file0) {
        String s = file0.getAbsolutePath();
        return this.FLD564.containsKey(s) ? ((String)this.FLD564.get(s)) : "";
    }

    // 去混淆评级： 高(410)
    // 此方法包含解密的字符串
    public static boolean MTH1564(ContentValues contentValues0) {
        return contentValues0.containsKey("img") || contentValues0.containsKey("vid") || contentValues0.containsKey("gif") || contentValues0.containsKey("web_img") || contentValues0.containsKey("web_vid") || contentValues0.containsKey("web_gif") || contentValues0.containsKey("avatar") || contentValues0.containsKey("img_uri") || contentValues0.containsKey("vid_uri") || contentValues0.containsKey("gif_uri") || contentValues0.containsKey("type") && (contentValues0.containsKey("path") || contentValues0.containsKey("uri")) && ((int)contentValues0.getAsInteger("type")) == -16;
    }

    public final void MTH1565(ArrayList arrayList0) {
        this.FLD562 = arrayList0;
        this.FLD567 = arrayList0;
        this.MTH1561();
        this.notifyDataSetChanged();
    }
}

