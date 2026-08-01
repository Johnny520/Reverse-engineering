// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.SearchView;
import android.widget.TextView;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS226;
import c.ﹶˆ.CLS341;
import java.lang.ref.WeakReference;

public class CLS594 implements CLS341 {
    public interface CLS282 {
        void onQueryTextChange(String arg1);
    }

    public String FLD1104;
    public ListAdapter FLD1105;
    public boolean FLD1106;
    public TextView FLD1107;
    public SearchView FLD1108;
    public String FLD1109;
    public AdapterView.OnItemLongClickListener FLD1110;
    public TextView FLD1111;
    public View FLD1112;
    public CLS282 FLD1113;
    public int FLD1114;
    public AdapterView.OnItemClickListener FLD1115;
    public final ListView FLD1116;
    public boolean FLD1117;
    public View FLD1118;
    public final WeakReference FLD1119;

    public CLS594(Activity activity0) {
        this.FLD1114 = 0;
        this.FLD1117 = true;
        this.FLD1119 = new WeakReference(activity0);
        this.FLD1116 = new ListView(activity0);
    }

    public ListView MTH3605() {
        return this.FLD1116;
    }

    public void MTH3606(AdapterView.OnItemLongClickListener adapterView$OnItemLongClickListener0) {
        this.FLD1110 = adapterView$OnItemLongClickListener0;
        this.FLD1116.setOnItemLongClickListener(adapterView$OnItemLongClickListener0);
    }

    // 此方法包含解密的字符串
    public final View MTH3607() {
        public class CLS281 implements SearchView.OnQueryTextListener {
            public final CLS594 FLD1103;

            @Override  // android.widget.SearchView$OnQueryTextListener
            public boolean onQueryTextChange(String s) {
                if(TextUtils.isEmpty(s)) {
                    CLS594.this.FLD1116.clearTextFilter();
                    if(CLS594.this.FLD1113 != null) {
                        CLS594.this.FLD1113.onQueryTextChange(s);
                        return true;
                    }
                }
                else {
                    if(CLS594.this.FLD1113 != null) {
                        CLS594.this.FLD1113.onQueryTextChange(s);
                        return true;
                    }
                    CLS594.this.FLD1116.setFilterText(s);
                }
                return true;
            }

            @Override  // android.widget.SearchView$OnQueryTextListener
            public boolean onQueryTextSubmit(String s) {
                return false;
            }
        }

        Activity activity0 = (Activity)this.FLD1119.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS144.MTH2162());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS144.MTH2162());
        TextView textView0 = new TextView(activity0);
        this.FLD1107 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1107.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1107, this.FLD1104);
        this.FLD1107.setTextColor(CLS226.MTH3099());
        this.FLD1107.setPadding(0, CLS144.MTH2175(10), 0, CLS144.MTH2175(5));
        if(TextUtils.isEmpty(this.FLD1104)) {
            this.FLD1107.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1107, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        this.FLD1111 = textView1;
        textView1.setTextSize(2, 14.0f);
        this.FLD1111.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1111, this.FLD1109);
        this.FLD1111.setTextColor(CLS226.MTH3098());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1107.getId());
        this.FLD1111.setPadding(CLS144.MTH2175(5), 0, 0, 0);
        relativeLayout1.addView(this.FLD1111, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1109)) {
            this.FLD1111.setVisibility(8);
        }
        try {
            SearchView searchView0 = new SearchView(activity0);
            this.FLD1108 = searchView0;
            searchView0.setId(CLS144.MTH2162());
            this.FLD1108.setIconifiedByDefault(false);
            this.FLD1108.setSubmitButtonEnabled(true);
            this.FLD1108.setQueryHint("");
            this.FLD1108.setOnQueryTextListener(new CLS281(this));
            CLS144.MTH2189(this.FLD1108);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        this.FLD1116.setAdapter(this.FLD1105);
        AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = this.FLD1115;
        if(adapterView$OnItemClickListener0 != null) {
            this.FLD1116.setOnItemClickListener(adapterView$OnItemClickListener0);
        }
        AdapterView.OnItemLongClickListener adapterView$OnItemLongClickListener0 = this.FLD1110;
        if(adapterView$OnItemLongClickListener0 != null) {
            this.FLD1116.setOnItemLongClickListener(adapterView$OnItemLongClickListener0);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams2.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(3, this.FLD1111.getId());
        SearchView searchView1 = this.FLD1108;
        if(searchView1 != null) {
            relativeLayout1.addView(searchView1, relativeLayout$LayoutParams2);
        }
        if(!this.FLD1106) {
            this.FLD1116.setTextFilterEnabled(false);
            SearchView searchView2 = this.FLD1108;
            if(searchView2 != null) {
                searchView2.setVisibility(8);
            }
        }
        else if(this.FLD1113 == null) {
            this.FLD1116.setTextFilterEnabled(true);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, (this.FLD1117 ? -2 : -1));
        relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams3.addRule(3, this.FLD1108.getId());
        relativeLayout1.addView(this.FLD1116, relativeLayout$LayoutParams3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS226.MTH3105());
        linearLayout0.setVisibility(this.FLD1114);
        return linearLayout0;
    }

    public void MTH3608(CLS282 ʾᐧ$ﾞⁱ0) {
        this.FLD1113 = ʾᐧ$ﾞⁱ0;
    }

    public void MTH3610(AdapterView.OnItemClickListener adapterView$OnItemClickListener0) {
        this.FLD1115 = adapterView$OnItemClickListener0;
        this.FLD1116.setOnItemClickListener(adapterView$OnItemClickListener0);
    }

    public void MTH3611() {
        this.MTH3615(CLS144.MTH2175(5));
    }

    public void MTH3612() {
        this.FLD1106 = true;
        SearchView searchView0 = this.FLD1108;
        if(searchView0 != null) {
            searchView0.setVisibility(0);
            if(this.FLD1113 == null) {
                this.FLD1116.setTextFilterEnabled(true);
            }
        }
    }

    public void MTH3613(ListAdapter listAdapter0) {
        this.FLD1105 = listAdapter0;
        this.FLD1116.setAdapter(listAdapter0);
    }

    @Override  // c.ﹶˆ.CLS341
    public void MTH4822(View view0) {
        this.FLD1112 = view0;
        view0.setVisibility(this.FLD1114);
    }

    public void MTH3615(int v) {
        ColorDrawable colorDrawable0 = new ColorDrawable(CLS226.MTH3103());
        this.FLD1116.setDivider(colorDrawable0);
        this.FLD1116.setDividerHeight(v);
    }

    @Override  // c.ﹶˆ.CLS341
    public View MTH4823() {
        if(this.FLD1118 == null) {
            this.FLD1118 = this.MTH3607();
        }
        return this.FLD1118;
    }
}

