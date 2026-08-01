// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class CLS525 {
    public final HashMap FLD5145;
    public final LinkedHashMap FLD5146;
    public final LinearLayout FLD5147;
    public final WeakReference FLD5148;
    public final Menu FLD5149;

    public CLS525(Activity activity0, LinearLayout linearLayout0, Menu menu0) {
        this.FLD5148 = new WeakReference(activity0);
        this.FLD5147 = linearLayout0;
        this.FLD5149 = menu0;
        this.FLD5146 = new LinkedHashMap();
        this.FLD5145 = new HashMap();
    }

    public final void MTH7187(String s, CLS3 ˆٴ0) {
        String s1 = CLS27.MTH889(s);
        if(TextUtils.isEmpty(s1)) {
            s1 = s;
        }
        this.MTH7189(s1, s, ˆٴ0);
    }

    public final void MTH7188() {
        int v;
        LinkedHashMap linkedHashMap0 = this.FLD5146;
        if(linkedHashMap0.isEmpty()) {
            return;
        }
        Menu menu0 = this.FLD5149;
        if(menu0 == null) {
            this.MTH7190();
        }
        else {
            Iterator iterator0 = linkedHashMap0.keySet().iterator();
            while(true) {
                v = 0;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                String s = (String)object0;
                menu0.add((this.FLD5145.containsKey(s) ? ((String)this.FLD5145.get(s)) : s)).setOnMenuItemClickListener(new CLS529(this, s, 0));
            }
            if(CLS522.MTH7114()) {
                while(v < menu0.size()) {
                    CLS523.MTH7149(menu0.getItem(v), CLS522.MTH7109(), CLS522.MTH7118());
                    ++v;
                }
            }
            else {
                while(v < menu0.size()) {
                    CLS523.MTH7149(menu0.getItem(v), 0xFF000000, -1);
                    ++v;
                }
            }
            if(menu0.size() != linkedHashMap0.size()) {
                menu0.clear();
                this.MTH7190();
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH7189(String s, String s1, CLS3 ˆٴ0) {
        String s2 = "";
        String s3 = "";
        new String("");
        new String("");
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s2 = s.substring(v + 2, v1);
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
            s2.getClass();
            s6.getClass();
            s3 = s4.trim();
        }
        this.FLD5146.put(s1, ˆٴ0);
        this.FLD5145.put(s1, s3);
    }

    public final void MTH7190() {
        Activity activity0 = (Activity)this.FLD5148.get();
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("menu"));
        ـˏ0.MTH7320(new CLS530(this, activity0, 0));
        View view0 = ـˏ0.MTH803();
        CLS523.MTH7139(this.FLD5147, view0, 0);
    }
}

