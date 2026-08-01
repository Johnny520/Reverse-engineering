// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.ArrayList;
import org.json.JSONObject;
import t.ʾᵢ.CLS216;
import t.ʾᵢ.CLS221;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˆٴ.CLS70;
import t.ᵔʾ.CLS304;
import t.ⁱʾ.CLS140;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS143;

public final class CLS322 implements CLS143 {
    public final int FLD1057;
    public final Object FLD1058;
    public final Activity FLD1059;
    public final Object FLD1060;

    public CLS322(Activity activity0, ArrayList arrayList0, CLS70 ﾞٴ0) {
        this.FLD1057 = 3;
        super();
        this.FLD1059 = activity0;
        this.FLD1058 = arrayList0;
        this.FLD1060 = ﾞٴ0;
    }

    public CLS322(Object object0, Activity activity0, Object object1, int v) {
        this.FLD1057 = v;
        this.FLD1058 = object0;
        this.FLD1059 = activity0;
        this.FLD1060 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        Activity activity0 = this.FLD1059;
        Object object0 = this.FLD1060;
        Object object1 = this.FLD1058;
        switch(this.FLD1057) {
            case 0: {
                ((CLS331)object1).getClass();
                CLS43.MTH1416(activity0, ((CLS141)new CLS316(((CLS331)object1), ((ImageView)object0))));
                return;
            }
            case 1: {
                if(!((CLS216)object1).MTH1137()) {
                    CLS43.MTH1416(activity0, ((CLS141)new CLS221(((CLS216)object1), ((ArrayList)object0))));
                }
                return;
            }
            case 2: {
                Bitmap bitmap0 = CLS41.MTH1408(activity0, CLS41.MTH1397(CLS41.MTH1402(CLS41.MTH1393(((JSONObject)object1).optString("p1")), 0.3f), CLS46.MTH1447(((JSONObject)object1).optString("c", "#00FFFFFF"))), ((JSONObject)object1).optInt("b", 0));
                if(bitmap0 != null) {
                    ((ImageView)object0).setImageBitmap(bitmap0);
                }
                return;
            }
            default: {
                CLS43.MTH1430(activity0, "", "", 1, ((CLS140)new CLS304(((ArrayList)object1), ((CLS70)object0), 13)));
            }
        }
    }
}

