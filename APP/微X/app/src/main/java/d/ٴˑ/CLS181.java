// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
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
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;

public final class CLS181 implements CLS125 {
    public View FLD394;
    public AdapterView.OnItemLongClickListener FLD395;
    public ListAdapter FLD396;
    public SearchView FLD397;
    public int FLD398;
    public final WeakReference FLD399;
    public TextView FLD400;
    public View FLD401;
    public AdapterView.OnItemClickListener FLD402;
    public final ListView FLD403;
    public String FLD404;
    public String FLD405;
    public TextView FLD406;

    public CLS181(Activity activity0) {
        this.FLD398 = 0;
        this.FLD399 = new WeakReference(activity0);
        this.FLD403 = new ListView(activity0);
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD400 == null ? this.FLD405 : this.FLD400.getText().toString();
    }

    public final void MTH893(AdapterView.OnItemClickListener adapterView$OnItemClickListener0) {
        this.FLD402 = adapterView$OnItemClickListener0;
        this.FLD403.setOnItemClickListener(adapterView$OnItemClickListener0);
    }

    public final void MTH894(ListAdapter listAdapter0) {
        this.FLD396 = listAdapter0;
        this.FLD403.setAdapter(listAdapter0);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD398 = v;
        View view0 = this.FLD401;
        if(view0 != null) {
            view0.setVisibility(v);
        }
        View view1 = this.FLD394;
        if(view1 != null) {
            view1.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD401.setBackgroundColor(CLS43.MTH645());
    }

    // 此方法包含解密的字符串
    public final View MTH897() {
        public final class CLS80 implements SearchView.OnQueryTextListener {
            public final CLS181 FLD393;

            @Override  // android.widget.SearchView$OnQueryTextListener
            public final boolean onQueryTextChange(String s) {
                boolean z = TextUtils.isEmpty(s);
                CLS181 ˆـ0 = CLS181.this;
                if(z) {
                    ˆـ0.FLD403.clearTextFilter();
                    ˆـ0.getClass();
                    return true;
                }
                ˆـ0.getClass();
                ˆـ0.FLD403.setFilterText(s);
                return true;
            }

            @Override  // android.widget.SearchView$OnQueryTextListener
            public final boolean onQueryTextSubmit(String s) {
                return false;
            }
        }

        Activity activity0 = (Activity)this.FLD399.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS45.MTH668());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS45.MTH668());
        TextView textView0 = new TextView(activity0);
        this.FLD400 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD400.setId(CLS45.MTH668());
        CLS45.MTH658(this.FLD400, this.FLD405);
        this.FLD400.setTextColor(CLS43.MTH646());
        this.FLD400.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
        if(TextUtils.isEmpty(this.FLD405)) {
            this.FLD400.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD400, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        this.FLD406 = textView1;
        textView1.setTextSize(2, 14.0f);
        this.FLD406.setId(CLS45.MTH668());
        CLS45.MTH658(this.FLD406, this.FLD404);
        this.FLD406.setTextColor(CLS43.MTH640());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD400.getId());
        this.FLD406.setPadding(CLS45.MTH662(5), 0, 0, 0);
        relativeLayout1.addView(this.FLD406, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD404)) {
            this.FLD406.setVisibility(8);
        }
        String s = CLS69.MTH795("search_here");
        try {
            SearchView searchView0 = new SearchView(activity0);
            this.FLD397 = searchView0;
            searchView0.setId(CLS45.MTH668());
            this.FLD397.setIconifiedByDefault(false);
            this.FLD397.setSubmitButtonEnabled(true);
            this.FLD397.setQueryHint(s);
            this.FLD397.setOnQueryTextListener(new CLS80(this));
            CLS45.MTH664(this.FLD397);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        ListView listView0 = this.FLD403;
        listView0.setAdapter(this.FLD396);
        AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = this.FLD402;
        if(adapterView$OnItemClickListener0 != null) {
            listView0.setOnItemClickListener(adapterView$OnItemClickListener0);
        }
        AdapterView.OnItemLongClickListener adapterView$OnItemLongClickListener0 = this.FLD395;
        if(adapterView$OnItemLongClickListener0 != null) {
            listView0.setOnItemLongClickListener(adapterView$OnItemLongClickListener0);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams2.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(3, this.FLD406.getId());
        SearchView searchView1 = this.FLD397;
        if(searchView1 != null) {
            relativeLayout1.addView(searchView1, relativeLayout$LayoutParams2);
        }
        listView0.setTextFilterEnabled(false);
        SearchView searchView2 = this.FLD397;
        if(searchView2 != null) {
            searchView2.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams3.addRule(3, this.FLD397.getId());
        relativeLayout1.addView(listView0, relativeLayout$LayoutParams3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS43.MTH644());
        linearLayout0.setVisibility(this.FLD398);
        return linearLayout0;
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD404 = s;
        CLS45.MTH658(this.FLD406, s);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD394 = view0;
        view0.setVisibility(this.FLD398);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1181(String s) {
        String s5;
        String s4;
        String s3;
        String s2;
        String s1 = "";
        if(TextUtils.isEmpty(s)) {
            s2 = "";
        }
        else {
            if(!s.contains("[[") || !s.contains("]]")) {
                s4 = s;
                s3 = "";
            }
            else {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s3 = s.substring(v + 2, v1);
                s4 = CLS71.MTH825(s, 0, v, new StringBuilder(), v1, 2);
            }
            if(!s4.contains("{") || !s4.contains("}")) {
                s5 = "";
            }
            else {
                int v2 = s4.indexOf("{");
                int v3 = s4.lastIndexOf("}");
                s5 = s4.substring(v2 + 1, v3);
                s4 = CLS71.MTH825(s4, 0, v2, new StringBuilder(), v3, 1);
            }
            if(s4.contains("((") && s4.contains("))")) {
                int v4 = s4.indexOf("((");
                int v5 = s4.lastIndexOf("))");
                s1 = s4.substring(v4 + 2, v5);
                s4 = CLS71.MTH825(s4, 0, v4, new StringBuilder(), v5, 2);
            }
            s2 = s4.trim();
            s5.getClass();
            s1.getClass();
            s1 = s3.trim();
        }
        if(!TextUtils.isEmpty(s1)) {
            this.MTH1179(s1);
        }
        this.FLD405 = s2;
        CLS45.MTH658(this.FLD400, s2);
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        if(this.FLD401 == null) {
            this.FLD401 = this.MTH897();
        }
        return this.FLD401;
    }
}

