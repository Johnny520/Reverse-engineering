// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import d.יʻ.CLS69;
import d.ٴˑ.CLS99;
import d.ᐧי.CLS110;
import d.ᐧי.CLS207;
import d.ᵎʻ.CLS117;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public final class CLS32 implements AdapterView.OnItemLongClickListener {
    public final Activity FLD152;
    public final HashMap FLD153;
    public final ArrayList FLD154;
    public final CLS110 FLD155;
    public final ArrayList FLD156;

    public CLS32(Activity activity0, CLS110 ٴˑ0, ArrayList arrayList0, ArrayList arrayList1, HashMap hashMap0) {
        this.FLD154 = arrayList0;
        this.FLD152 = activity0;
        this.FLD156 = arrayList1;
        this.FLD155 = ٴˑ0;
        this.FLD153 = hashMap0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS99 ﹶᵎ0 = new CLS99(((String)this.FLD154.get(v)));
        CLS117 יʻ0 = new CLS117(this.FLD152);
        CLS168 ﹳٴ0 = new CLS168(this.FLD152, this.FLD154, v, this.FLD156, ﹶᵎ0, this.FLD155);
        String s = CLS69.MTH795("delete");
        if(TextUtils.isEmpty(s)) {
            s = "delete";
        }
        LinkedHashMap linkedHashMap0 = יʻ0.FLD658;
        linkedHashMap0.put(s, "delete");
        HashMap hashMap0 = יʻ0.FLD660;
        hashMap0.put("delete", ﹳٴ0);
        HashMap hashMap1 = this.FLD153;
        if(hashMap1.containsKey(ﹶᵎ0.FLD571)) {
            JSONObject jSONObject0 = (JSONObject)hashMap1.get(ﹶᵎ0.FLD571);
            if(!jSONObject0.optBoolean("valid") || jSONObject0.optBoolean("used") && !jSONObject0.optBoolean("registered")) {
                CLS207 יʻ1 = new CLS207(ﹶᵎ0, jSONObject0, 3);
                String s1 = CLS69.MTH795("keycard_feedback");
                if(TextUtils.isEmpty(s1)) {
                    s1 = "keycard_feedback";
                }
                linkedHashMap0.put(s1, "keycard_feedback");
                hashMap0.put("keycard_feedback", יʻ1);
            }
        }
        יʻ0.MTH1147();
        return true;
    }
}

