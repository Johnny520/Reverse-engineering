// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˑٴ.CLS755;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1571 implements CLS3 {
    public final int FLD4906;
    public final Object FLD4907;
    public final ArrayList FLD4908;
    public final Activity FLD4909;
    public final int FLD4910;
    public final BaseAdapter FLD4911;
    public final Object FLD4912;

    public CLS1571(Activity activity0, CLS29 ˎᵢ0, String s, ArrayList arrayList0, CLS369 ﾞᵎ0, int v) {
        this.FLD4906 = 0;
        super();
        this.FLD4909 = activity0;
        this.FLD4907 = s;
        this.FLD4912 = ˎᵢ0;
        this.FLD4908 = arrayList0;
        this.FLD4910 = v;
        this.FLD4911 = ﾞᵎ0;
    }

    public CLS1571(Activity activity0, Object object0, ArrayList arrayList0, int v, ArrayList arrayList1, CLS335 ˑٴ0, int v1) {
        this.FLD4906 = v1;
        this.FLD4909 = activity0;
        this.FLD4907 = object0;
        this.FLD4908 = arrayList0;
        this.FLD4910 = v;
        this.FLD4912 = arrayList1;
        this.FLD4911 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD4909;
        BaseAdapter baseAdapter0 = this.FLD4911;
        Object object0 = this.FLD4912;
        Object object1 = this.FLD4907;
        switch(this.FLD4906) {
            case 0: {
                CLS523.MTH7165(activity0, CLS27.MTH889("modify"), "", ((String)object1), 1, ((CLS16)new CLS755(this.FLD4910, ((CLS369)baseAdapter0), ((CLS29)object0), ((String)object1), this.FLD4908)));
                return;
            }
            case 1: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1451(((Bundle)object1), this.FLD4908, this.FLD4910, ((ArrayList)object0), ((CLS335)baseAdapter0))));
                return;
            }
            default: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1559(((JSONObject)object1), this.FLD4908, this.FLD4910, ((ArrayList)object0), ((CLS335)baseAdapter0))));
            }
        }
    }
}

