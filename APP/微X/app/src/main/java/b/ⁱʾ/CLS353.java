// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter.FilterResults;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ᵔʾ.CLS1255;
import b.ᵔʾ.CLS1259;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS353 extends BaseAdapter implements Filterable {
    public static final class CLS352 {
        public Object FLD3396;
        public ContentValues FLD3397;
        public ImageView FLD3398;

    }

    public final WeakReference FLD3399;
    public ArrayList FLD3400;
    public final HashMap FLD3401;
    public final HashMap FLD3402;
    public ArrayList FLD3403;
    public static final int FLD3404;
    public int FLD3405;

    public CLS353(Activity activity0, ArrayList arrayList0) {
        this.FLD3405 = -1;
        this.FLD3399 = new WeakReference(activity0);
        this.FLD3402 = new HashMap();
        this.FLD3401 = new HashMap();
        this.FLD3403 = arrayList0;
        this.FLD3400 = arrayList0;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3403 == null ? 0 : this.FLD3403.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS351 extends Filter {
            public final CLS353 FLD3395;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                CLS353 ᵔʾ0 = CLS353.this;
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                try {
                    ArrayList arrayList0 = new ArrayList();
                    if(ᵔʾ0.FLD3400 == null) {
                        ᵔʾ0.FLD3400 = ᵔʾ0.FLD3403;
                    }
                    if(!TextUtils.isEmpty(charSequence0)) {
                        if(ᵔʾ0.FLD3400 != null && !ᵔʾ0.FLD3400.isEmpty()) {
                            for(Object object0: ᵔʾ0.FLD3400) {
                                ContentValues contentValues0 = (ContentValues)object0;
                                if(CLS502.MTH6938(contentValues0.getAsString("name"), new CharSequence[]{charSequence0})) {
                                    arrayList0.add(contentValues0);
                                }
                            }
                        }
                        filter$FilterResults0.values = arrayList0;
                        ᵔʾ0.FLD3405 = -1;
                        return filter$FilterResults0;
                    }
                    filter$FilterResults0.values = ᵔʾ0.FLD3400;
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS353.this.FLD3403 = (ArrayList)filter$FilterResults0.values;
                CLS353.this.notifyDataSetChanged();
            }
        }

        return new CLS351(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3403 == null || this.FLD3403.isEmpty() ? null : this.FLD3403.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS352 ᵔʾ$ᵔʾ0;
        try {
            ContentValues contentValues0 = (ContentValues)this.getItem(v);
            if(view0 == null) {
                ᵔʾ$ᵔʾ0 = new CLS352();
                view0 = this.MTH5199(ᵔʾ$ᵔʾ0);
                view0.setTag(ᵔʾ$ᵔʾ0);
            }
            else {
                ᵔʾ$ᵔʾ0 = (CLS352)view0.getTag();
            }
            this.MTH5200(ᵔʾ$ᵔʾ0, contentValues0);
            view0.setBackgroundColor((this.FLD3405 == -1 || this.FLD3405 != v ? CLS522.MTH7118() : CLS522.MTH7110("#2196F3")));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return view0;
    }

    // 此方法包含解密的字符串
    public final RelativeLayout MTH5199(CLS352 ᵔʾ$ᵔʾ0) {
        try {
            Activity activity0 = (Activity)this.FLD3399.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(320, 320);
            relativeLayout$LayoutParams0.addRule(13, relativeLayout0.getId());
            FrameLayout frameLayout0 = new FrameLayout(activity0);
            ImageView imageView0 = new ImageView(activity0);
            imageView0.setMinimumHeight(320);
            imageView0.setMinimumWidth(320);
            Object object0 = CLS66.MTH1522(activity0);
            CLS166.MTH3195(object0, "setMinimumHeight", new Object[]{320});
            CLS166.MTH3195(object0, "setMinimumWidth", new Object[]{320});
            frameLayout0.addView(imageView0);
            frameLayout0.addView(((View)object0));
            relativeLayout0.addView(frameLayout0, relativeLayout$LayoutParams0);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            CLS523.MTH7152(linearLayout0, CLS518.MTH7062(CLS522.MTH7118()));
            ᵔʾ$ᵔʾ0.FLD3396 = object0;
            ᵔʾ$ᵔʾ0.FLD3398 = imageView0;
            return relativeLayout0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH5200(CLS352 ᵔʾ$ᵔʾ0, ContentValues contentValues0) {
        Bitmap bitmap1;
        Bitmap bitmap0;
        CLS1255 ᵢﹶ0;
        CLS40 ﾞᵎ0;
        if(contentValues0.equals(ᵔʾ$ᵔʾ0.FLD3397)) {
            return;
        }
        ᵔʾ$ᵔʾ0.FLD3397 = contentValues0;
        if("gif".equals(contentValues0.getAsString("ext"))) {
            ᵔʾ$ᵔʾ0.FLD3398.setVisibility(8);
            ((View)ᵔʾ$ᵔʾ0.FLD3396).setVisibility(0);
            if(contentValues0.containsKey("file")) {
                ﾞᵎ0 = CLS40.FLD157;
                ᵢﹶ0 = new CLS1255(ᵔʾ$ᵔʾ0, contentValues0, 1);
            }
            else {
                ﾞᵎ0 = CLS40.FLD157;
                ᵢﹶ0 = new CLS1259(this, ᵔʾ$ᵔʾ0, contentValues0, 1);
            }
            ﾞᵎ0.MTH1116(((CLS39)ᵢﹶ0));
            return;
        }
        ᵔʾ$ᵔʾ0.FLD3398.setVisibility(0);
        ((View)ᵔʾ$ᵔʾ0.FLD3396).setVisibility(8);
        boolean z = contentValues0.containsKey("file");
        HashMap hashMap0 = this.FLD3402;
        if(z) {
            String s = contentValues0.getAsString("file");
            if(hashMap0.containsKey(s)) {
                bitmap0 = (Bitmap)hashMap0.get(s);
            }
            else {
                bitmap1 = CLS518.MTH7074(320, 320, s);
                hashMap0.put(s, bitmap1);
                bitmap0 = bitmap1;
            }
        }
        else {
            Uri uri0 = Uri.parse(contentValues0.getAsString("uri"));
            if(hashMap0.containsKey(uri0.toString())) {
                bitmap0 = (Bitmap)hashMap0.get(uri0.toString());
            }
            else {
                bitmap1 = CLS518.MTH7056(uri0, 320, 320);
                hashMap0.put(uri0.toString(), bitmap1);
                bitmap0 = bitmap1;
            }
        }
        ᵔʾ$ᵔʾ0.FLD3398.setImageBitmap(bitmap0);
    }
}

