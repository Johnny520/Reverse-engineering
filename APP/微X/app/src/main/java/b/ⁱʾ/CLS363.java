// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import android.widget.TextView;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS92;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CLS363 extends BaseAdapter implements Filterable {
    public static final class CLS361 {
        public ImageView FLD3436;
        public CheckedTextView FLD3437;

    }

    public interface CLS362 {
        void MTH5249(TextView arg1, CLS78 arg2);
    }

    public CLS362 FLD3438;
    public ArrayList FLD3439;
    public int FLD3440;
    public final LayoutInflater FLD3441;
    public HashSet FLD3442;
    public final CLS92 FLD3443;
    public final WeakReference FLD3444;
    public ListView FLD3445;
    public boolean[] FLD3446;
    public ArrayList FLD3447;

    public CLS363(Activity activity0) {
        this.FLD3440 = -1;
        this.FLD3444 = new WeakReference(activity0);
        this.FLD3441 = LayoutInflater.from(activity0);
        this.FLD3443 = new CLS92(5000L);
    }

    public CLS363(Activity activity0, ArrayList arrayList0, CLS1624 יﹳ0) {
        this(activity0);
        this.FLD3447 = arrayList0;
        this.FLD3446 = new boolean[arrayList0.size()];
        this.FLD3442 = new HashSet();
        this.FLD3445 = יﹳ0.FLD5272;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3447.size();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        public final class CLS360 extends Filter {
            public final CLS363 FLD3435;

            // 此方法包含解密的字符串
            @Override  // android.widget.Filter
            public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
                Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
                ArrayList arrayList0 = new ArrayList();
                CLS363 ﾞٴ0 = CLS363.this;
                if(ﾞٴ0.FLD3439 == null) {
                    ﾞٴ0.FLD3439 = ﾞٴ0.FLD3447;
                }
                if(charSequence0 != null) {
                    if(ﾞٴ0.FLD3439 != null && ﾞٴ0.FLD3439.size() > 0) {
                        HashSet hashSet0 = new HashSet();
                        for(Object object0: ﾞٴ0.FLD3439) {
                            CLS78 ˊﾞ0 = (CLS78)object0;
                            if(CLS502.MTH6940("", new CharSequence[]{charSequence0})) {
                                arrayList0.add(ˊﾞ0);
                            }
                            hashSet0.add("");
                        }
                        for(Object object1: ﾞٴ0.FLD3439) {
                            CLS78 ˊﾞ1 = (CLS78)object1;
                            if(!hashSet0.contains("") && ﾞٴ0.FLD3442.contains("")) {
                                arrayList0.add(ˊﾞ1);
                            }
                        }
                    }
                    filter$FilterResults0.values = arrayList0;
                }
                return filter$FilterResults0;
            }

            @Override  // android.widget.Filter
            public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
                CLS363.this.MTH5264(((ArrayList)filter$FilterResults0.values));
            }
        }

        return new CLS360(this);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3447.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        Drawable drawable0;
        CLS361 ﾞٴ$ٴـ0;
        View view1;
        try {
            CLS92 ⁱʽ0 = this.FLD3443;
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                view1 = this.FLD3441.inflate(0x1090010, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                ImageView imageView0 = new ImageView(((Context)this.FLD3444.get()));
                imageView0.setMinimumHeight(90);
                imageView0.setMinimumWidth(90);
                CheckedTextView checkedTextView0 = (CheckedTextView)view1.findViewById(0x1020014);
                checkedTextView0.setTextColor(CLS522.MTH7109());
                checkedTextView0.setBackgroundColor(CLS522.MTH7118());
                checkedTextView0.setPadding(v1, v1, v1, v1);
                ﾞٴ$ٴـ0 = new CLS361();
                ﾞٴ$ٴـ0.FLD3436 = imageView0;
                ﾞٴ$ٴـ0.FLD3437 = checkedTextView0;
                try {
                    view1.setTag(ﾞٴ$ٴـ0);
                    view0 = view1;
                }
                catch(Throwable throwable0) {
                    goto label_48;
                }
            }
            else {
                ﾞٴ$ٴـ0 = (CLS361)view0.getTag();
            }
            CLS78 ˊﾞ0 = (CLS78)this.FLD3447.get(v);
            String s = (String)ⁱʽ0.MTH1744(ˊﾞ0);
            if(TextUtils.isEmpty(s)) {
                CheckedTextView checkedTextView1 = ﾞٴ$ٴـ0.FLD3437;
                CLS362 ﾞٴ$ᵔʾ0 = this.FLD3438;
                if(ﾞٴ$ᵔʾ0 == null) {
                    CLS523.MTH7155(checkedTextView1, "");
                }
                else {
                    ﾞٴ$ᵔʾ0.MTH5249(checkedTextView1, ˊﾞ0);
                }
                ⁱʽ0.MTH1746(ˊﾞ0, CLS502.MTH6936(ﾞٴ$ٴـ0.FLD3437.getText()));
            }
            else {
                CLS523.MTH7155(ﾞٴ$ٴـ0.FLD3437, s);
            }
            if(ˊﾞ0.MTH1612()) {
                drawable0 = new BitmapDrawable(CLS27.MTH900().getResources(), ˊﾞ0.FLD270);
            }
            else {
                drawable0 = CLS372.MTH5403(ﾞٴ$ٴـ0.FLD3436, "") ? ﾞٴ$ٴـ0.FLD3436.getDrawable() : null;
            }
            if(drawable0 == null) {
                ﾞٴ$ٴـ0.FLD3437.setCompoundDrawables(null, null, null, null);
            }
            else {
                drawable0.setBounds(0, 0, 0x60, 0x60);
                ﾞٴ$ٴـ0.FLD3437.setCompoundDrawablePadding(CLS523.MTH7137(10));
                ﾞٴ$ٴـ0.FLD3437.setCompoundDrawables(drawable0, null, null, null);
            }
            ﾞٴ$ٴـ0.FLD3437.setChecked(this.FLD3446[v]);
            return view0;
        }
        catch(Throwable throwable0) {
            view1 = view0;
        }
    label_48:
        CLS27.MTH893(throwable0);
        return view1;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.FLD3443.MTH1742();
        super.notifyDataSetChanged();
    }

    public final int MTH5258() {
        int v1 = 0;
        for(int v = 0; true; ++v) {
            boolean[] arr_z = this.FLD3446;
            if(v >= arr_z.length) {
                break;
            }
            if(arr_z[v]) {
                ++v1;
            }
        }
        return v1;
    }

    // 此方法包含解密的字符串
    public final void MTH5259(List list0) {
        HashSet hashSet0 = new HashSet(list0);
        for(int v = 0; v < this.FLD3447.size(); ++v) {
            if(hashSet0.contains("")) {
                this.MTH5262(v, true);
            }
        }
    }

    public final void MTH5260() {
        this.MTH5263();
        for(int v = 0; v < this.FLD3447.size(); ++v) {
            this.MTH5262(v, true);
            if(this.FLD3440 != -1 && this.FLD3446[v] && this.MTH5258() >= this.FLD3440) {
                return;
            }
        }
        this.notifyDataSetChanged();
    }

    public final ArrayList MTH5261() {
        ArrayList arrayList0 = new ArrayList();
        if(this.FLD3446 != null && (this.FLD3447 != null && !this.FLD3447.isEmpty())) {
            for(int v = 0; true; ++v) {
                boolean[] arr_z = this.FLD3446;
                if(v >= arr_z.length) {
                    break;
                }
                if(arr_z[v]) {
                    arrayList0.add(((CLS78)this.FLD3447.get(v)));
                }
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH5262(int v, boolean z) {
        if(this.FLD3440 != -1 && z && this.MTH5258() >= this.FLD3440) {
            return;
        }
        ListView listView0 = this.FLD3445;
        if(listView0 != null) {
            listView0.setItemChecked(v, z);
        }
        this.FLD3446[v] = z;
        CLS78 ˊﾞ0 = (CLS78)this.FLD3447.get(v);
        if(z) {
            this.FLD3442.add("");
            return;
        }
        this.FLD3442.remove("");
    }

    public final void MTH5263() {
        for(int v = 0; v < this.FLD3447.size(); ++v) {
            this.MTH5262(v, false);
        }
        this.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public final void MTH5264(ArrayList arrayList0) {
        HashSet hashSet0 = new HashSet();
        if(this.FLD3446 != null) {
            for(int v1 = 0; true; ++v1) {
                boolean[] arr_z = this.FLD3446;
                if(v1 >= arr_z.length) {
                    break;
                }
                if(arr_z[v1]) {
                    hashSet0.add("");
                }
                ListView listView0 = this.FLD3445;
                if(listView0 != null) {
                    listView0.setItemChecked(v1, false);
                }
            }
        }
        this.FLD3442 = new HashSet();
        ArrayList arrayList1 = this.MTH5261();
        this.FLD3447 = arrayList0;
        for(Object object0: arrayList1) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!this.FLD3447.contains(ˊﾞ0)) {
                this.FLD3447.add(ˊﾞ0);
            }
        }
        this.FLD3446 = new boolean[this.FLD3447.size()];
        for(int v = 0; v < this.FLD3446.length; ++v) {
            if(hashSet0.contains("")) {
                this.MTH5262(v, true);
            }
        }
        this.notifyDataSetChanged();
    }
}

