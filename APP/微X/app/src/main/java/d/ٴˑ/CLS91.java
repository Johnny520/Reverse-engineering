// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ⁱٴ.CLS123;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class CLS91 {
    public final WeakReference FLD491;
    public final LinkedHashMap FLD492;
    public final HashMap FLD493;
    public final Menu FLD494;
    public final LinearLayout FLD495;

    public CLS91(Activity activity0, LinearLayout linearLayout0, Menu menu0) {
        this.FLD491 = new WeakReference(activity0);
        this.FLD495 = linearLayout0;
        this.FLD494 = menu0;
        this.FLD492 = new LinkedHashMap();
        this.FLD493 = new HashMap();
    }

    public final void MTH968(String s, String s1, CLS123 ᐧי0) {
        String s5;
        String s4;
        String s3;
        String s2 = "";
        if(!TextUtils.isEmpty(s)) {
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
                s2 = s4.substring(v4 + 2, v5);
                s4 = CLS71.MTH825(s4, 0, v4, new StringBuilder(), v5, 2);
            }
            s5.getClass();
            s3.getClass();
            s2.getClass();
            s2 = s4.trim();
        }
        this.FLD492.put(s1, ᐧי0);
        this.FLD493.put(s1, s2);
    }

    public final void MTH969(String s, CLS123 ᐧי0) {
        String s1 = CLS69.MTH795(s);
        if(TextUtils.isEmpty(s1)) {
            s1 = s;
        }
        this.MTH968(s1, s, ᐧי0);
    }

    public final void MTH970() {
        Activity activity0 = (Activity)this.FLD491.get();
        CLS187 ᐧﹶ0 = new CLS187(activity0);
        ᐧﹶ0.MTH1181(CLS69.MTH795("menu"));
        ᐧﹶ0.MTH991(new CLS74(activity0, this));
        View view0 = ᐧﹶ0.MTH1182();
        CLS45.MTH665(this.FLD495, view0);
    }

    public final void MTH971() {
        int v;
        LinkedHashMap linkedHashMap0 = this.FLD492;
        if(linkedHashMap0.isEmpty()) {
            return;
        }
        Menu menu0 = this.FLD494;
        if(menu0 == null) {
            this.MTH970();
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
                menu0.add((this.FLD493.containsKey(s) ? ((String)this.FLD493.get(s)) : s)).setOnMenuItemClickListener(new CLS75(this, s));
            }
            if(CLS43.MTH639()) {
                while(v < menu0.size()) {
                    CLS45.MTH654(menu0.getItem(v), CLS43.MTH646(), CLS43.MTH644());
                    ++v;
                }
            }
            else {
                while(v < menu0.size()) {
                    CLS45.MTH654(menu0.getItem(v), 0xFF000000, -1);
                    ++v;
                }
            }
            if(menu0.size() != linkedHashMap0.size()) {
                menu0.clear();
                this.MTH970();
            }
        }
    }
}

