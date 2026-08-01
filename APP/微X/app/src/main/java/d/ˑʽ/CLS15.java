// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import d.יʻ.CLS173;
import d.יʻ.CLS69;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS124;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

public final class CLS15 implements AdapterView.OnItemClickListener {
    public final LinkedHashMap FLD59;
    public final CLS110 FLD60;
    public final Activity FLD61;
    public final HashMap FLD62;

    public CLS15(CLS110 ٴˑ0, LinkedHashMap linkedHashMap0, HashMap hashMap0, Activity activity0) {
        this.FLD60 = ٴˑ0;
        this.FLD59 = linkedHashMap0;
        this.FLD62 = hashMap0;
        this.FLD61 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        try {
            Activity activity0 = this.FLD61;
            String s = (String)this.FLD60.getItem(v);
            String s1 = (String)this.FLD59.get(s);
            String s2 = (String)this.FLD62.get(s1);
            if(!TextUtils.isEmpty(s2)) {
                String[] arr_s = s2.split(Pattern.quote("|"));
                if(arr_s.length != 0) {
                    CLS45.MTH653(activity0, CLS69.MTH795(arr_s[0].trim()), ((CLS124)new CLS173(activity0, new CLS173(activity0, arr_s, 12), 5)), null);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }
}

