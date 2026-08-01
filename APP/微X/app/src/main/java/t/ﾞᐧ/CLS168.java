// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;

public final class CLS168 {
    public final HashMap FLD1178;
    public final LinkedHashMap FLD1179;
    public final LinearLayout FLD1180;
    public final WeakReference FLD1181;
    public final Menu FLD1182;

    public CLS168(Activity activity0, LinearLayout linearLayout0, Menu menu0) {
        this.FLD1181 = new WeakReference(activity0);
        this.FLD1180 = linearLayout0;
        this.FLD1182 = menu0;
        this.FLD1179 = new LinkedHashMap();
        this.FLD1178 = new HashMap();
    }

    // 此方法包含解密的字符串
    public final void MTH2390(String s, CLS143 ˆٴ0) {
        String s1 = CLS133.MTH2099(s);
        String s2 = TextUtils.isEmpty(s1) ? s : s1;
        String s3 = "";
        String s4 = "";
        new String("");
        new String("");
        new String("");
        if(!TextUtils.isEmpty(s2)) {
            if(s2.contains("[[") && s2.contains("]]")) {
                int v = s2.indexOf("[[");
                int v1 = s2.indexOf("]]");
                s3 = s2.substring(v + 2, v1);
                s2 = CLS15.MTH1076(s2, 0, v, new StringBuilder(), v1, 2);
            }
            String s5 = s2;
            String s6 = "";
            if(s5.contains("{") && s5.contains("}")) {
                int v2 = s5.indexOf("{");
                int v3 = s5.indexOf("}");
                s6 = s5.substring(v2 + 1, v3);
                s5 = CLS15.MTH1076(s5, 0, v2, new StringBuilder(), v3, 1);
            }
            String s7 = "";
            if(s5.contains("((") && s5.contains("))")) {
                int v4 = s5.indexOf("((");
                int v5 = s5.indexOf("))");
                s7 = s5.substring(v4 + 2, v5);
                s5 = CLS15.MTH1076(s5, 0, v4, new StringBuilder(), v5, 2);
            }
            s6.getClass();
            s3.getClass();
            s7.getClass();
            s4 = s5.trim();
        }
        this.FLD1179.put(s, ˆٴ0);
        this.FLD1178.put(s, s4);
    }

    public final void MTH2391() {
        Activity activity0 = (Activity)this.FLD1181.get();
        CLS338 יᐧ0 = new CLS338(activity0);
        יᐧ0.MTH2172(CLS133.MTH2099("menu"));
        יᐧ0.MTH2400(new CLS165(this, activity0, 0));
        View view0 = יᐧ0.MTH2173();
        CLS43.MTH1432(this.FLD1180, view0);
    }

    public final void MTH2392() {
        int v;
        LinkedHashMap linkedHashMap0 = this.FLD1179;
        if(linkedHashMap0.isEmpty()) {
            return;
        }
        Menu menu0 = this.FLD1182;
        if(menu0 == null) {
            this.MTH2391();
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
                menu0.add((this.FLD1178.containsKey(s) ? ((String)this.FLD1178.get(s)) : s)).setOnMenuItemClickListener(new CLS182(this, s));
            }
            if(CLS46.MTH1455()) {
                while(v < menu0.size()) {
                    CLS43.MTH1424(menu0.getItem(v), CLS46.MTH1452(), CLS46.MTH1446());
                    ++v;
                }
            }
            else {
                while(v < menu0.size()) {
                    CLS43.MTH1424(menu0.getItem(v), 0xFF000000, -1);
                    ++v;
                }
            }
            if(menu0.size() != linkedHashMap0.size()) {
                menu0.clear();
                this.MTH2391();
            }
        }
    }
}

