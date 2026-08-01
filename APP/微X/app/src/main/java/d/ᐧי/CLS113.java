// Decompiled by JEB v5.42.0.202606242140

package d.ᐧי;

import android.app.Activity;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.Filter.FilterResults;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListView;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS68.CLS67;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.ٴˑ.CLS181;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class CLS113 extends BaseAdapter implements Filterable {
    public static final class CLS111 {
        public CheckedTextView FLD637;

    }

    public final int FLD639;
    public ArrayList FLD640;
    public final HashMap FLD641;
    public HashSet FLD642;
    public boolean[] FLD643;
    public final HashMap FLD644;
    public final ListView FLD645;
    public final LayoutInflater FLD646;
    public ArrayList FLD647;

    public CLS113(Activity activity0, ArrayList arrayList0, CLS181 ˆـ0) {
        this.FLD644 = new HashMap();
        this.FLD641 = new HashMap();
        this.FLD639 = -1;
        this.FLD647 = arrayList0;
        this.FLD643 = new boolean[arrayList0.size()];
        this.FLD645 = ˆـ0.FLD403;
        this.FLD642 = new HashSet();
        this.FLD646 = LayoutInflater.from(activity0);
        new WeakReference(activity0);
        this.MTH1128();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD647 == null ? 0 : this.FLD647.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS112 extends Filter {
            public final CLS113 FLD638;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS113 ᵎʻ0 = CLS113.this;
                if(ᵎʻ0.FLD640 == null) {
                    ᵎʻ0.FLD640 = ᵎʻ0.FLD647;
                }
                if(!TextUtils.isEmpty(charSequence0)) {
                    if(ᵎʻ0.FLD640 != null && ᵎʻ0.FLD640.size() > 0) {
                        for(Object object0: ᵎʻ0.FLD640) {
                            ContentValues contentValues0 = (ContentValues)object0;
                            if(contentValues0.containsKey("tag") || contentValues0.containsKey("desc")) {
                                String s = contentValues0.containsKey("tag") ? contentValues0.getAsString("tag") : "";
                                String s1 = contentValues0.containsKey("desc") ? contentValues0.getAsString("desc") : "";
                                String s2 = charSequence0.toString().toLowerCase();
                                if(s.toLowerCase().contains(s2) || s1.contains(s2)) {
                                    arrayList0.add(contentValues0);
                                }
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                    return filter$FilterResults0;
                }
                filter$FilterResults0.values = ᵎʻ0.FLD640;
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS113.this.MTH1129(((ArrayList)filter$FilterResults0.values));
            }
        }

        return new CLS112(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD647 == null ? null : this.FLD647.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        BitmapDrawable bitmapDrawable0;
        CLS111 ᵎʻ$יʻ0;
        View view1;
        try {
            int v1 = CLS45.MTH662(5);
            if(view0 == null) {
                view1 = this.FLD646.inflate(0x1090010, viewGroup0, false);
                view1.setPadding(v1, CLS45.MTH662(10), v1, CLS45.MTH662(10));
                CheckedTextView checkedTextView0 = (CheckedTextView)view1.findViewById(0x1020014);
                checkedTextView0.setTextColor(CLS43.MTH646());
                checkedTextView0.setBackgroundColor(CLS43.MTH644());
                checkedTextView0.setPadding(v1, v1, v1, v1);
                checkedTextView0.setMinHeight(90);
                checkedTextView0.setHeight(90);
                ᵎʻ$יʻ0 = new CLS111();
                ᵎʻ$יʻ0.FLD637 = checkedTextView0;
                try {
                    view1.setTag(ᵎʻ$יʻ0);
                    view0 = view1;
                }
                catch(Throwable throwable0) {
                    goto label_48;
                }
            }
            else {
                ᵎʻ$יʻ0 = (CLS111)view0.getTag();
            }
            if(this.FLD647 != null && !this.FLD647.isEmpty()) {
                ContentValues contentValues0 = (ContentValues)this.FLD647.get(v);
                String s = contentValues0.containsKey("desc") ? contentValues0.getAsString("desc") : "";
                if(TextUtils.isEmpty(s)) {
                    s = "";
                }
                CLS45.MTH658(ᵎʻ$יʻ0.FLD637, s);
                ᵎʻ$יʻ0.FLD637.setChecked(this.MTH1131(v));
                if(contentValues0.containsKey("mp3")) {
                    String s1 = this.MTH1130(new File(contentValues0.getAsString("mp3")));
                    if(!TextUtils.isEmpty(s1)) {
                        CLS45.MTH658(ᵎʻ$יʻ0.FLD637, contentValues0.getAsString("desc") + " " + s1);
                    }
                }
                if(CLS113.MTH1132(contentValues0)) {
                    Bitmap bitmap0 = this.MTH1127(contentValues0);
                    bitmapDrawable0 = bitmap0 == null ? null : new BitmapDrawable(CLS69.MTH810().getResources(), bitmap0);
                }
                else {
                    bitmapDrawable0 = null;
                }
                if(bitmapDrawable0 != null) {
                    bitmapDrawable0.setBounds(0, 0, 0x60, 0x60);
                    ᵎʻ$יʻ0.FLD637.setCompoundDrawablePadding(CLS45.MTH662(10));
                    ᵎʻ$יʻ0.FLD637.setCompoundDrawables(bitmapDrawable0, null, null, null);
                    return view0;
                }
                ᵎʻ$יʻ0.FLD637.setCompoundDrawables(null, null, null, null);
                return view0;
            }
            return view0;
        }
        catch(Throwable throwable0) {
            view1 = view0;
        }
    label_48:
        CLS69.MTH797(throwable0);
        return view1;
    }

    // 此方法包含解密的字符串
    public final Bitmap MTH1127(ContentValues contentValues0) {
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
            else if(contentValues0.containsKey("web_img")) {
                s = contentValues0.getAsString("web_img");
            }
            else if(contentValues0.containsKey("web_gif")) {
                s = contentValues0.getAsString("web_gif");
            }
            else if(contentValues0.containsKey("web_vid")) {
                s = contentValues0.getAsString("web_vid");
            }
            else if(contentValues0.containsKey("type") && contentValues0.containsKey("path") && ((int)contentValues0.getAsInteger("type")) == -16) {
                s = contentValues0.getAsString("path");
            }
            if(!TextUtils.isEmpty(s)) {
                HashMap hashMap0 = this.FLD644;
                if(hashMap0.containsKey(s)) {
                    return (Bitmap)hashMap0.get(s);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH1128() {
        CLS209 ⁱٴ0;
        CLS68 ٴˆ0;
        CLS208 ᐧי0 = new CLS208(this, 0);
        CLS68.FLD326.MTH791(((CLS67)ᐧי0));
        if(this.FLD647 != null && !this.FLD647.isEmpty()) {
            Set set0 = Collections.synchronizedSet(new HashSet());
            CLS207 יʻ0 = new CLS207(this, set0, 0);
            for(Object object0: this.FLD647) {
                ContentValues contentValues0 = (ContentValues)object0;
                if(CLS113.MTH1132(contentValues0)) {
                    set0.add(contentValues0);
                    ٴˆ0 = CLS68.FLD326;
                    ⁱٴ0 = new CLS209(this, contentValues0, set0, יʻ0, 0);
                }
                else {
                    if(!contentValues0.containsKey("mp3")) {
                        continue;
                    }
                    set0.add(contentValues0);
                    ٴˆ0 = CLS68.FLD326;
                    ⁱٴ0 = new CLS209(this, contentValues0, set0, יʻ0, 1);
                }
                ٴˆ0.MTH787(((CLS67)ⁱٴ0));
            }
        }
    }

    public final void MTH1129(ArrayList arrayList0) {
        if(arrayList0 == null) {
            return;
        }
        this.MTH1128();
        HashSet hashSet0 = new HashSet();
        if(this.FLD643 != null) {
            for(int v1 = 0; v1 < this.FLD643.length; ++v1) {
                try {
                    if(this.MTH1131(v1)) {
                        hashSet0.add(((ContentValues)this.FLD647.get(v1)));
                    }
                    this.FLD645.setItemChecked(v1, false);
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
            }
        }
        this.FLD642 = new HashSet();
        ArrayList arrayList1 = new ArrayList();
        if(this.FLD643 != null) {
            try {
            label_20:
                for(int v2 = 0; v2 < this.FLD643.length; ++v2) {
                    if(this.MTH1131(v2)) {
                        arrayList1.add(((ContentValues)this.FLD647.get(v2)));
                    }
                }
            }
            catch(Throwable throwable1) {
                CLS69.MTH797(throwable1);
                if(true) {
                    goto label_28;
                }
                goto label_20;
            }
        }
    label_28:
        this.FLD647 = arrayList0;
        for(Object object0: arrayList1) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(!this.FLD647.contains(contentValues0)) {
                this.FLD647.add(contentValues0);
            }
        }
        this.FLD643 = new boolean[this.FLD647.size()];
        for(int v = 0; v < this.FLD643.length; ++v) {
            if(hashSet0.contains(this.FLD647.get(v))) {
                this.MTH1133(v, true);
            }
        }
        this.notifyDataSetChanged();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH1130(File file0) {
        String s = file0.getAbsolutePath();
        return this.FLD641.containsKey(s) ? ((String)this.FLD641.get(s)) : "";
    }

    public final boolean MTH1131(int v) {
        try {
            return this.FLD643[v];
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return false;
        }
    }

    // 去混淆评级： 高(260)
    // 此方法包含解密的字符串
    public static boolean MTH1132(ContentValues contentValues0) {
        return contentValues0.containsKey("img") || contentValues0.containsKey("vid") || contentValues0.containsKey("gif") || contentValues0.containsKey("web_img") || contentValues0.containsKey("web_vid") || contentValues0.containsKey("web_gif") || contentValues0.containsKey("type") && contentValues0.containsKey("path") && ((int)contentValues0.getAsInteger("type")) == -16;
    }

    public final void MTH1133(int v, boolean z) {
        int v1 = this.FLD639;
        if(v1 != -1 && z) {
            int v3 = 0;
            for(int v2 = 0; v2 < this.FLD643.length; ++v2) {
                if(this.MTH1131(v2)) {
                    ++v3;
                }
            }
            if(v3 >= v1) {
                return;
            }
        }
        this.FLD643[v] = z;
        ContentValues contentValues0 = (ContentValues)this.FLD647.get(v);
        HashSet hashSet0 = this.FLD642;
        if(z) {
            hashSet0.add(contentValues0);
        }
        else {
            hashSet0.remove(contentValues0);
        }
        this.FLD645.setItemChecked(v, z);
    }
}

