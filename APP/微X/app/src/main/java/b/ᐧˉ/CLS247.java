// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS86;
import org.json.JSONObject;

public final class CLS247 implements AdapterView.OnItemClickListener {
    public final int FLD2598;
    public final CLS1112 FLD2599;

    public CLS247(CLS1112 ᐧˏ0, int v) {
        this.FLD2598 = v;
        this.FLD2599 = ᐧˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS1112 ᐧˏ0 = this.FLD2599;
        if(this.FLD2598 == 0) {
            ᐧˏ0.getClass();
            String s = CLS27.MTH889("modify");
            ᐧˏ0.MTH4198(((CLS86)ᐧˏ0.FLD2465.getItem(v)), s);
            return;
        }
        String s1 = (String)ᐧˏ0.FLD2459.getItem(v);
        for(Object object0: ᐧˏ0.FLD2482) {
            JSONObject jSONObject0 = (JSONObject)object0;
            try {
                if(!s1.equals(jSONObject0.getString("n"))) {
                    continue;
                }
                ᐧˏ0.MTH4200(jSONObject0);
                return;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

