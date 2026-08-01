// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;

public final class CLS1630 implements CLS18 {
    public interface CLS550 {
    }

    public AdapterView.OnItemClickListener FLD5367;
    public int FLD5368;
    public ListAdapter FLD5369;
    public final GridView FLD5370;
    public boolean FLD5371;
    public TextView FLD5372;
    public CLS550 FLD5373;
    public String FLD5374;
    public SearchView FLD5375;
    public final WeakReference FLD5376;
    public String FLD5377;
    public LinearLayout FLD5378;
    public TextView FLD5379;

    public CLS1630(Activity activity0) {
        this.FLD5368 = 0;
        this.FLD5376 = new WeakReference(activity0);
        this.FLD5370 = new GridView(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5372 == null ? this.FLD5374 : CLS502.MTH6936(this.FLD5372.getText());
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5377 = s;
        CLS523.MTH7155(this.FLD5379, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5378.setBackgroundColor(CLS522.MTH7112());
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
            s5.getClass();
            s6.getClass();
            s3 = s1.trim();
            s2 = s4.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.MTH798(s3);
        }
        this.FLD5374 = s2;
        CLS523.MTH7155(this.FLD5372, s2);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5368 = v;
        LinearLayout linearLayout0 = this.FLD5378;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        if(this.FLD5378 == null) {
            Activity activity0 = (Activity)this.FLD5376.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS523.MTH7138());
            TextView textView0 = new TextView(activity0);
            this.FLD5372 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD5372.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5372, this.FLD5374);
            this.FLD5372.setTextColor(CLS522.MTH7109());
            this.FLD5372.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
            if(TextUtils.isEmpty(this.FLD5374)) {
                this.FLD5372.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams0, 10, 9);
            relativeLayout1.addView(this.FLD5372, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD5379 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD5379.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5379, this.FLD5377);
            this.FLD5379.setTextColor(CLS522.MTH7116());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD5372.getId());
            this.FLD5379.setPadding(CLS523.MTH7137(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD5379, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5377)) {
                this.FLD5379.setVisibility(8);
            }
            String s = CLS27.MTH889("search_here");
            try {
                SearchView searchView0 = new SearchView(activity0);
                this.FLD5375 = searchView0;
                searchView0.setId(CLS523.MTH7138());
                this.FLD5375.setIconifiedByDefault(false);
                this.FLD5375.setSubmitButtonEnabled(true);
                this.FLD5375.setQueryHint(s);
                this.FLD5375.setOnQueryTextListener(new CLS541(this));
                CLS523.MTH7141(this.FLD5375);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            GridView gridView0 = this.FLD5370;
            gridView0.setAdapter(this.FLD5369);
            AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = this.FLD5367;
            if(adapterView$OnItemClickListener0 != null) {
                gridView0.setOnItemClickListener(adapterView$OnItemClickListener0);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams2.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(3, this.FLD5379.getId());
            SearchView searchView1 = this.FLD5375;
            if(searchView1 != null) {
                relativeLayout1.addView(searchView1, relativeLayout$LayoutParams2);
            }
            if(!this.FLD5371) {
                gridView0.setTextFilterEnabled(false);
                SearchView searchView2 = this.FLD5375;
                if(searchView2 != null) {
                    searchView2.setVisibility(8);
                }
            }
            else if(this.FLD5373 == null) {
                gridView0.setTextFilterEnabled(true);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD5375.getId());
            relativeLayout1.addView(gridView0, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout0, relativeLayout$LayoutParams4, 9, 10);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS522.MTH7118());
            linearLayout0.setVisibility(this.FLD5368);
            this.FLD5378 = linearLayout0;
        }
        return this.FLD5378;
    }
}

