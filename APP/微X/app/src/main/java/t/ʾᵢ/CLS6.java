// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import java.util.ArrayList;
import org.json.JSONObject;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55.CLS54;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS146;
import t.ⁱʾ.CLS147;

public final class CLS6 implements AdapterView.OnItemClickListener {
    public final int FLD86;
    public final ArrayList FLD87;
    public final CLS216 FLD88;
    public final CLS143 FLD89;

    public CLS6(CLS216 ˎﾞ0, ArrayList arrayList0, CLS143 ˆٴ0, int v) {
        this.FLD86 = v;
        this.FLD88 = ˎﾞ0;
        this.FLD87 = arrayList0;
        this.FLD89 = ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS216 ˎﾞ0 = this.FLD88;
        CLS143 ˆٴ0 = this.FLD89;
        ArrayList arrayList0 = this.FLD87;
        switch(this.FLD86) {
            case 0: {
                ˎﾞ0.getClass();
                try {
                    JSONObject jSONObject0 = (JSONObject)arrayList0.get(v);
                    CLS196 ˈﾞ0 = new CLS196(ˆٴ0);
                    Activity activity0 = ((CLS10)ˎﾞ0).MTH1048();
                    CLS43.MTH1426(activity0, CLS133.MTH2099("select_time"), ((CLS54)new CLS256(ˎﾞ0, activity0, jSONObject0, 0)), null, ((CLS141)ˈﾞ0));
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                return;
            }
            case 1: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1140(((JSONObject)arrayList0.get(v)), ((CLS146)new CLS254(ˆٴ0, 0)));
                return;
            }
            case 2: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1141(((CLS147)arrayList0.get(v)), ((CLS146)new CLS254(ˆٴ0, 2)));
                return;
            }
            case 3: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1141(((CLS147)arrayList0.get(v)), ((CLS146)new CLS254(ˆٴ0, 3)));
                return;
            }
            default: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1140(((JSONObject)arrayList0.get(v)), ((CLS146)new CLS254(ˆٴ0, 1)));
            }
        }
    }
}

