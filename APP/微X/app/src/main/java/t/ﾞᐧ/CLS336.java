// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

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
import android.widget.SearchView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS145;

public final class CLS336 implements CLS145 {
    public interface CLS166 {
    }

    public AdapterView.OnItemClickListener FLD1147;
    public int FLD1148;
    public ListAdapter FLD1149;
    public final ListView FLD1150;
    public AdapterView.OnItemLongClickListener FLD1151;
    public CLS166 FLD1152;
    public TextView FLD1153;
    public boolean FLD1154;
    public SearchView FLD1155;
    public String FLD1156;
    public boolean FLD1157;
    public final WeakReference FLD1158;
    public String FLD1159;
    public View FLD1160;
    public LinearLayout FLD1161;
    public TextView FLD1162;

    public CLS336(Activity activity0) {
        this.FLD1148 = 0;
        this.FLD1154 = true;
        this.FLD1158 = new WeakReference(activity0);
        this.FLD1150 = new ListView(activity0);
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1153 == null ? this.FLD1156 : this.FLD1153.getText().toString();
    }

    public final void MTH2368(AdapterView.OnItemLongClickListener adapterView$OnItemLongClickListener0) {
        this.FLD1151 = adapterView$OnItemLongClickListener0;
        this.FLD1150.setOnItemLongClickListener(adapterView$OnItemLongClickListener0);
    }

    public final void MTH2369() {
        ListAdapter listAdapter0 = this.FLD1149;
        if(listAdapter0 != null) {
            this.FLD1154 = listAdapter0.getCount() < 10;
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS145
    public final void MTH2172(String s) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        new String("");
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.indexOf("]]");
                s1 = s.substring(v + 2, v1);
                s = CLS15.MTH1076(s, 0, v, new StringBuilder(), v1, 2);
            }
            String s4 = s;
            String s5 = "";
            if(s4.contains("{") && s4.contains("}")) {
                int v2 = s4.indexOf("{");
                int v3 = s4.indexOf("}");
                s5 = s4.substring(v2 + 1, v3);
                s4 = CLS15.MTH1076(s4, 0, v2, new StringBuilder(), v3, 1);
            }
            String s6 = "";
            if(s4.contains("((") && s4.contains("))")) {
                int v4 = s4.indexOf("((");
                int v5 = s4.indexOf("))");
                s6 = s4.substring(v4 + 2, v5);
                s4 = CLS15.MTH1076(s4, 0, v4, new StringBuilder(), v5, 2);
            }
            s5.trim();
            s6.trim();
            s3 = s1.trim();
            s2 = s4.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.FLD1159 = s3;
            CLS43.MTH1429(this.FLD1162, s3);
        }
        this.FLD1156 = s2;
        CLS43.MTH1429(this.FLD1153, s2);
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        if(this.FLD1161 == null) {
            Activity activity0 = (Activity)this.FLD1158.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS43.MTH1438());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS43.MTH1438());
            TextView textView0 = new TextView(activity0);
            this.FLD1153 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD1153.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1153, this.FLD1156);
            this.FLD1153.setTextColor(CLS46.MTH1452());
            this.FLD1153.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
            if(TextUtils.isEmpty(this.FLD1156)) {
                this.FLD1153.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD1153, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD1162 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD1162.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1162, this.FLD1159);
            this.FLD1162.setTextColor(CLS46.MTH1457());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD1153.getId());
            this.FLD1162.setPadding(CLS43.MTH1439(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD1162, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD1159)) {
                this.FLD1162.setVisibility(8);
            }
            String s = CLS133.MTH2099("search_here");
            try {
                SearchView searchView0 = new SearchView(activity0);
                this.FLD1155 = searchView0;
                searchView0.setId(CLS43.MTH1438());
                this.FLD1155.setIconifiedByDefault(false);
                this.FLD1155.setSubmitButtonEnabled(true);
                this.FLD1155.setQueryHint(s);
                this.FLD1155.setOnQueryTextListener(new CLS178(this));
                CLS43.MTH1421(this.FLD1155);
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            ListView listView0 = this.FLD1150;
            listView0.setAdapter(this.FLD1149);
            AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = this.FLD1147;
            if(adapterView$OnItemClickListener0 != null) {
                listView0.setOnItemClickListener(adapterView$OnItemClickListener0);
            }
            AdapterView.OnItemLongClickListener adapterView$OnItemLongClickListener0 = this.FLD1151;
            if(adapterView$OnItemLongClickListener0 != null) {
                listView0.setOnItemLongClickListener(adapterView$OnItemLongClickListener0);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams2.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(3, this.FLD1162.getId());
            SearchView searchView1 = this.FLD1155;
            if(searchView1 != null) {
                relativeLayout1.addView(searchView1, relativeLayout$LayoutParams2);
            }
            if(!this.FLD1157) {
                listView0.setTextFilterEnabled(false);
                SearchView searchView2 = this.FLD1155;
                if(searchView2 != null) {
                    searchView2.setVisibility(8);
                }
            }
            else if(this.FLD1152 == null) {
                listView0.setTextFilterEnabled(true);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, (this.FLD1154 ? -2 : -1));
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD1155.getId());
            relativeLayout1.addView(listView0, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS46.MTH1446());
            linearLayout0.setVisibility(this.FLD1148);
            this.FLD1161 = linearLayout0;
        }
        return this.FLD1161;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1160 = view0;
        view0.setVisibility(this.FLD1148);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1148 = v;
        LinearLayout linearLayout0 = this.FLD1161;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD1160;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1161.setBackgroundColor(CLS46.MTH1445());
    }

    public final void MTH2375(AdapterView.OnItemClickListener adapterView$OnItemClickListener0) {
        this.FLD1147 = adapterView$OnItemClickListener0;
        this.FLD1150.setOnItemClickListener(adapterView$OnItemClickListener0);
    }

    public final void MTH2376(ListAdapter listAdapter0) {
        this.FLD1149 = listAdapter0;
        this.FLD1150.setAdapter(listAdapter0);
    }
}

