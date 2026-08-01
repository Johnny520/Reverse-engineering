// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS1469 implements CLS3 {
    public final int FLD4375;
    public final ArrayList FLD4376;
    public final CLS29 FLD4377;
    public final Activity FLD4378;
    public final String FLD4379;
    public final CLS369 FLD4380;

    public CLS1469(Activity activity0, CLS29 ˎᵢ0, String s, ArrayList arrayList0, CLS369 ﾞᵎ0, int v) {
        this.FLD4375 = v;
        this.FLD4378 = activity0;
        this.FLD4377 = ˎᵢ0;
        this.FLD4379 = s;
        this.FLD4376 = arrayList0;
        this.FLD4380 = ﾞᵎ0;
        super();
    }

    public CLS1469(Activity activity0, CLS369 ﾞᵎ0, CLS29 ˎᵢ0, String s, ArrayList arrayList0) {
        this.FLD4375 = 3;
        super();
        this.FLD4378 = activity0;
        this.FLD4376 = arrayList0;
        this.FLD4377 = ˎᵢ0;
        this.FLD4379 = s;
        this.FLD4380 = ﾞᵎ0;
    }

    public CLS1469(Activity activity0, String s, CLS29 ˎᵢ0, ArrayList arrayList0, CLS369 ﾞᵎ0, int v) {
        this.FLD4375 = v;
        this.FLD4378 = activity0;
        this.FLD4379 = s;
        this.FLD4377 = ˎᵢ0;
        this.FLD4376 = arrayList0;
        this.FLD4380 = ﾞᵎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD4378;
        ArrayList arrayList0 = this.FLD4376;
        String s = this.FLD4379;
        CLS29 ˎᵢ0 = this.FLD4377;
        CLS369 ﾞᵎ0 = this.FLD4380;
        switch(this.FLD4375) {
            case 0: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1342(ﾞᵎ0, ˎᵢ0, s, arrayList0)));
                return;
            }
            case 1: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1389(ﾞᵎ0, ˎᵢ0, s, arrayList0)));
                return;
            }
            case 2: {
                CLS523.MTH7165(activity0, CLS27.MTH889("modify"), "", s, 1, ((CLS16)new CLS1503(0, ﾞᵎ0, ˎᵢ0, s, arrayList0)));
                return;
            }
            case 3: {
                CLS523.MTH7165(activity0, CLS27.MTH889("add"), "", "", 1, ((CLS16)new CLS1503(ﾞᵎ0, ˎᵢ0, s, arrayList0)));
                return;
            }
            case 4: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1500(ﾞᵎ0, ˎᵢ0, s, arrayList0)));
                return;
            }
            default: {
                CLS523.MTH7165(activity0, CLS27.MTH889("modify"), "", s, 1, ((CLS16)new CLS1503(2, ﾞᵎ0, ˎᵢ0, s, arrayList0)));
            }
        }
    }
}

