// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import d.יʻ.CLS69;
import d.ᐧי.CLS110;
import d.ᵎʻ.CLS117;
import d.ⁱٴ.CLS120;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class CLS14 implements AdapterView.OnItemLongClickListener {
    public final LinkedHashMap FLD55;
    public final int FLD56;
    public final Object FLD57;
    public final Object FLD58;

    public CLS14(CLS110 ٴˑ0, LinkedHashMap linkedHashMap0, Activity activity0) {
        this.FLD56 = 1;
        super();
        this.FLD58 = ٴˑ0;
        this.FLD55 = linkedHashMap0;
        this.FLD57 = activity0;
    }

    public CLS14(CLS120 ˑʽ0, ListAdapter listAdapter0, LinkedHashMap linkedHashMap0) {
        this.FLD56 = 0;
        super();
        this.FLD58 = ˑʽ0;
        this.FLD57 = listAdapter0;
        this.FLD55 = linkedHashMap0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        LinkedHashMap linkedHashMap0 = this.FLD55;
        Object object0 = this.FLD57;
        Object object1 = this.FLD58;
        if(this.FLD56 == 0) {
            CLS120 ˑʽ0 = (CLS120)object1;
            ListAdapter listAdapter0 = (ListAdapter)object0;
            if(ˑʽ0 != null) {
                try {
                    ˑʽ0.MTH1170(linkedHashMap0.get(((String)listAdapter0.getItem(v))));
                    return true;
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
            }
            return true;
        }
        String s = (String)linkedHashMap0.get(((String)((CLS110)object1).getItem(v)));
        if(s.startsWith("#")) {
            s = s.substring(1);
        }
        if(!s.startsWith("$") && !s.startsWith("*")) {
            CLS117 יʻ0 = new CLS117(((Activity)object0));
            CLS135 ˈˉ0 = new CLS135(((Activity)object0), s, 2);
            String s1 = CLS69.MTH795("open_with_internal_browser");
            if(TextUtils.isEmpty(s1)) {
                s1 = "open_with_internal_browser";
            }
            LinkedHashMap linkedHashMap1 = יʻ0.FLD658;
            linkedHashMap1.put(s1, "open_with_internal_browser");
            HashMap hashMap0 = יʻ0.FLD660;
            hashMap0.put("open_with_internal_browser", ˈˉ0);
            CLS135 ˈˉ1 = new CLS135(((Activity)object0), s, 3);
            String s2 = CLS69.MTH795("open_with_external_browser");
            if(TextUtils.isEmpty(s2)) {
                s2 = "open_with_external_browser";
            }
            linkedHashMap1.put(s2, "open_with_external_browser");
            hashMap0.put("open_with_external_browser", ˈˉ1);
            יʻ0.MTH1147();
        }
        return true;
    }
}

