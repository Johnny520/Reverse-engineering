// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

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
import c.ˋﹳ.CLS108;
import c.ـˉ.CLS172;
import c.ـˉ.CLS204;
import c.ـˉ.CLS258;
import java.lang.ref.WeakReference;

public class CLS791 implements CLS108 {
    public interface CLS286 {
        void onQueryTextChange(String arg1);
    }

    public final WeakReference FLD1243;
    public boolean FLD1244;
    public TextView FLD1245;
    public CLS286 FLD1246;
    public final ListView FLD1247;
    public AdapterView.OnItemLongClickListener FLD1248;
    public View FLD1249;
    public ListAdapter FLD1250;
    public boolean FLD1251;
    public AdapterView.OnItemClickListener FLD1252;
    public SearchView FLD1253;
    public String FLD1254;
    public View FLD1255;
    public int FLD1256;
    public TextView FLD1257;
    public String FLD1258;

    public CLS791(Activity activity0) {
        this.FLD1256 = 0;
        this.FLD1251 = true;
        this.FLD1243 = new WeakReference(activity0);
        this.FLD1247 = new ListView(activity0);
    }

    @Override  // c.ˋﹳ.CLS108
    public View MTH2282() {
        if(this.FLD1255 == null) {
            this.FLD1255 = this.MTH4242();
        }
        return this.FLD1255;
    }

    public void MTH4241(AdapterView.OnItemLongClickListener adapterView$OnItemLongClickListener0) {
        this.FLD1248 = adapterView$OnItemLongClickListener0;
        this.FLD1247.setOnItemLongClickListener(adapterView$OnItemLongClickListener0);
    }

    // 此方法包含解密的字符串
    public final View MTH4242() {
        public class CLS287 implements SearchView.OnQueryTextListener {
            public final CLS791 FLD1242;

            @Override  // android.widget.SearchView$OnQueryTextListener
            public boolean onQueryTextChange(String s) {
                if(TextUtils.isEmpty(s)) {
                    CLS791.this.FLD1247.clearTextFilter();
                    if(CLS791.this.FLD1246 != null) {
                        CLS791.this.FLD1246.onQueryTextChange(s);
                        return true;
                    }
                }
                else {
                    if(CLS791.this.FLD1246 != null) {
                        CLS791.this.FLD1246.onQueryTextChange(s);
                        return true;
                    }
                    CLS791.this.FLD1247.setFilterText(s);
                }
                return true;
            }

            @Override  // android.widget.SearchView$OnQueryTextListener
            public boolean onQueryTextSubmit(String s) {
                return false;
            }
        }

        Activity activity0 = (Activity)this.FLD1243.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS258.MTH3807());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS258.MTH3807());
        TextView textView0 = new TextView(activity0);
        this.FLD1245 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1245.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1245, this.FLD1254);
        this.FLD1245.setTextColor(CLS172.MTH3033());
        this.FLD1245.setPadding(0, CLS258.MTH3770(10), 0, CLS258.MTH3770(5));
        if(TextUtils.isEmpty(this.FLD1254)) {
            this.FLD1245.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1245, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        this.FLD1257 = textView1;
        textView1.setTextSize(2, 14.0f);
        this.FLD1257.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1257, this.FLD1258);
        this.FLD1257.setTextColor(CLS172.MTH3036());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1245.getId());
        this.FLD1257.setPadding(CLS258.MTH3770(5), 0, 0, 0);
        relativeLayout1.addView(this.FLD1257, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1258)) {
            this.FLD1257.setVisibility(8);
        }
        try {
            SearchView searchView0 = new SearchView(activity0);
            this.FLD1253 = searchView0;
            searchView0.setId(CLS258.MTH3807());
            this.FLD1253.setIconifiedByDefault(false);
            this.FLD1253.setSubmitButtonEnabled(true);
            this.FLD1253.setQueryHint("");
            this.FLD1253.setOnQueryTextListener(new CLS287(this));
            CLS258.MTH3780(this.FLD1253);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        this.FLD1247.setAdapter(this.FLD1250);
        AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = this.FLD1252;
        if(adapterView$OnItemClickListener0 != null) {
            this.FLD1247.setOnItemClickListener(adapterView$OnItemClickListener0);
        }
        AdapterView.OnItemLongClickListener adapterView$OnItemLongClickListener0 = this.FLD1248;
        if(adapterView$OnItemLongClickListener0 != null) {
            this.FLD1247.setOnItemLongClickListener(adapterView$OnItemLongClickListener0);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams2.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(3, this.FLD1257.getId());
        SearchView searchView1 = this.FLD1253;
        if(searchView1 != null) {
            relativeLayout1.addView(searchView1, relativeLayout$LayoutParams2);
        }
        if(!this.FLD1244) {
            this.FLD1247.setTextFilterEnabled(false);
            SearchView searchView2 = this.FLD1253;
            if(searchView2 != null) {
                searchView2.setVisibility(8);
            }
        }
        else if(this.FLD1246 == null) {
            this.FLD1247.setTextFilterEnabled(true);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, (this.FLD1251 ? -2 : -1));
        relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams3.addRule(3, this.FLD1253.getId());
        relativeLayout1.addView(this.FLD1247, relativeLayout$LayoutParams3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS172.MTH3039());
        linearLayout0.setVisibility(this.FLD1256);
        return linearLayout0;
    }

    @Override  // c.ˋﹳ.CLS108
    public void MTH2283(View view0) {
        this.FLD1249 = view0;
        view0.setVisibility(this.FLD1256);
    }

    public void MTH4244(AdapterView.OnItemClickListener adapterView$OnItemClickListener0) {
        this.FLD1252 = adapterView$OnItemClickListener0;
        this.FLD1247.setOnItemClickListener(adapterView$OnItemClickListener0);
    }

    public ListView MTH4245() {
        return this.FLD1247;
    }

    public void MTH4246(ListAdapter listAdapter0) {
        this.FLD1250 = listAdapter0;
        this.FLD1247.setAdapter(listAdapter0);
    }

    public void MTH4247(CLS286 ˋᵎ$ʻᵢ0) {
        this.FLD1246 = ˋᵎ$ʻᵢ0;
    }

    public void MTH4249(int v) {
        ColorDrawable colorDrawable0 = new ColorDrawable(CLS172.MTH3040());
        this.FLD1247.setDivider(colorDrawable0);
        this.FLD1247.setDividerHeight(v);
    }

    public void MTH4250() {
        this.FLD1244 = true;
        SearchView searchView0 = this.FLD1253;
        if(searchView0 != null) {
            searchView0.setVisibility(0);
            if(this.FLD1246 == null) {
                this.FLD1247.setTextFilterEnabled(true);
            }
        }
    }

    public void MTH4251() {
        this.MTH4249(CLS258.MTH3770(5));
    }
}

