// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.graphics.Color;
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
import android.widget.SearchView;
import android.widget.TextView;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;

public final class CLS1624 implements CLS18 {
    public interface CLS540 {
        void onQueryTextChange(String arg1);
    }

    public AdapterView.OnItemClickListener FLD5269;
    public int FLD5270;
    public ListAdapter FLD5271;
    public final ListView FLD5272;
    public AdapterView.OnItemLongClickListener FLD5273;
    public CLS540 FLD5274;
    public TextView FLD5275;
    public boolean FLD5276;
    public SearchView FLD5277;
    public String FLD5278;
    public boolean FLD5279;
    public final WeakReference FLD5280;
    public String FLD5281;
    public View FLD5282;
    public LinearLayout FLD5283;
    public TextView FLD5284;

    public CLS1624(Activity activity0) {
        this.FLD5270 = 0;
        this.FLD5276 = true;
        this.FLD5280 = new WeakReference(activity0);
        this.FLD5272 = new ListView(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5275 == null ? this.FLD5278 : CLS502.MTH6936(this.FLD5275.getText());
    }

    public final void MTH7301(AdapterView.OnItemClickListener adapterView$OnItemClickListener0) {
        this.FLD5269 = adapterView$OnItemClickListener0;
        this.FLD5272.setOnItemClickListener(adapterView$OnItemClickListener0);
    }

    public final void MTH7302() {
        this.FLD5279 = true;
        SearchView searchView0 = this.FLD5277;
        if(searchView0 != null) {
            searchView0.setVisibility(0);
            if(this.FLD5274 == null) {
                this.FLD5272.setTextFilterEnabled(true);
            }
        }
    }

    public final void MTH7303(ListAdapter listAdapter0) {
        this.FLD5271 = listAdapter0;
        this.FLD5272.setAdapter(listAdapter0);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5281 = s;
        CLS523.MTH7155(this.FLD5284, s);
    }

    public final void MTH7305(AdapterView.OnItemLongClickListener adapterView$OnItemLongClickListener0) {
        this.FLD5273 = adapterView$OnItemLongClickListener0;
        this.FLD5272.setOnItemLongClickListener(adapterView$OnItemLongClickListener0);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5283.setBackgroundColor(CLS522.MTH7112());
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS18
    public final void MTH800(String s) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        new String("");
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s1 = s.substring(v + 2, v1);
                s = CLS182.MTH3495(s, 0, v, new StringBuilder(), v1, 2);
            }
            String s4 = s;
            String s5 = "";
            if(s4.contains("{") && s4.contains("}")) {
                int v2 = s4.indexOf("{");
                int v3 = s4.lastIndexOf("}");
                s5 = s4.substring(v2 + 1, v3);
                s4 = CLS182.MTH3495(s4, 0, v2, new StringBuilder(), v3, 1);
            }
            String s6 = "";
            if(s4.contains("((") && s4.contains("))")) {
                int v4 = s4.indexOf("((");
                int v5 = s4.lastIndexOf("))");
                s6 = s4.substring(v4 + 2, v5);
                s4 = CLS182.MTH3495(s4, 0, v4, new StringBuilder(), v5, 2);
            }
            s5.trim();
            s6.trim();
            s3 = s1.trim();
            s2 = s4.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.MTH798(s3);
        }
        this.FLD5278 = s2;
        CLS523.MTH7155(this.FLD5275, s2);
    }

    public final void MTH7308(int v) {
        ListAdapter listAdapter0 = this.FLD5271;
        if(listAdapter0 != null) {
            this.FLD5276 = listAdapter0.getCount() < v;
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5270 = v;
        LinearLayout linearLayout0 = this.FLD5283;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD5282;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5282 = view0;
        view0.setVisibility(this.FLD5270);
    }

    public final void MTH7311() {
        int v = CLS523.MTH7137(5);
        long v1 = CLS522.MTH7114() ? 4101241997975409461L : 4101242032335147829L;
        this.FLD5272.setDivider(new ColorDrawable(Color.parseColor(CLS370.MTH5289(v1))));
        this.FLD5272.setDividerHeight(v);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        if(this.FLD5283 == null) {
            Activity activity0 = (Activity)this.FLD5280.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS523.MTH7138());
            TextView textView0 = new TextView(activity0);
            this.FLD5275 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD5275.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5275, this.FLD5278);
            this.FLD5275.setTextColor(CLS522.MTH7109());
            this.FLD5275.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
            if(TextUtils.isEmpty(this.FLD5278)) {
                this.FLD5275.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams0, 10, 9);
            relativeLayout1.addView(this.FLD5275, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD5284 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD5284.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5284, this.FLD5281);
            this.FLD5284.setTextColor(CLS522.MTH7116());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD5275.getId());
            this.FLD5284.setPadding(CLS523.MTH7137(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD5284, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5281)) {
                this.FLD5284.setVisibility(8);
            }
            String s = CLS27.MTH889("search_here");
            try {
                SearchView searchView0 = new SearchView(activity0);
                this.FLD5277 = searchView0;
                searchView0.setId(CLS523.MTH7138());
                this.FLD5277.setIconifiedByDefault(false);
                this.FLD5277.setSubmitButtonEnabled(true);
                this.FLD5277.setQueryHint(s);
                this.FLD5277.setOnQueryTextListener(new CLS546(this));
                CLS523.MTH7141(this.FLD5277);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            ListView listView0 = this.FLD5272;
            listView0.setAdapter(this.FLD5271);
            AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = this.FLD5269;
            if(adapterView$OnItemClickListener0 != null) {
                listView0.setOnItemClickListener(adapterView$OnItemClickListener0);
            }
            AdapterView.OnItemLongClickListener adapterView$OnItemLongClickListener0 = this.FLD5273;
            if(adapterView$OnItemLongClickListener0 != null) {
                listView0.setOnItemLongClickListener(adapterView$OnItemLongClickListener0);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams2.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(3, this.FLD5284.getId());
            SearchView searchView1 = this.FLD5277;
            if(searchView1 != null) {
                relativeLayout1.addView(searchView1, relativeLayout$LayoutParams2);
            }
            if(!this.FLD5279) {
                listView0.setTextFilterEnabled(false);
                SearchView searchView2 = this.FLD5277;
                if(searchView2 != null) {
                    searchView2.setVisibility(8);
                }
            }
            else if(this.FLD5274 == null) {
                listView0.setTextFilterEnabled(true);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, (this.FLD5276 ? -2 : -1));
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD5277.getId());
            relativeLayout1.addView(listView0, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout0, relativeLayout$LayoutParams4, 9, 10);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS522.MTH7118());
            linearLayout0.setVisibility(this.FLD5270);
            this.FLD5283 = linearLayout0;
        }
        return this.FLD5283;
    }
}

