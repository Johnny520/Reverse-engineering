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

public final class CLS1479 implements CLS3 {
    public final int FLD4417;
    public final CLS369 FLD4418;
    public final CLS29 FLD4419;
    public final Activity FLD4420;
    public final ArrayList FLD4421;

    public CLS1479(int v, Activity activity0, CLS369 ﾞᵎ0, CLS29 ˎᵢ0, ArrayList arrayList0) {
        this.FLD4417 = v;
        this.FLD4420 = activity0;
        this.FLD4419 = ˎᵢ0;
        this.FLD4421 = arrayList0;
        this.FLD4418 = ﾞᵎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS369 ﾞᵎ0 = this.FLD4418;
        ArrayList arrayList0 = this.FLD4421;
        CLS29 ˎᵢ0 = this.FLD4419;
        switch(this.FLD4417) {
            case 0: {
                String s1 = CLS27.MTH889("add");
                CLS1360 ʿˋ1 = new CLS1360(ˎᵢ0, arrayList0, ﾞᵎ0, 0);
                CLS523.MTH7165(this.FLD4420, s1, "", "", 1, ((CLS16)ʿˋ1));
                return;
            }
            case 1: {
                CLS1364 ʿᵢ0 = new CLS1364(ˎᵢ0, arrayList0, ﾞᵎ0);
                CLS523.MTH7142(this.FLD4420, ((CLS11)ʿᵢ0));
                return;
            }
            default: {
                String s = CLS27.MTH889("add");
                CLS1360 ʿˋ0 = new CLS1360(ˎᵢ0, arrayList0, ﾞᵎ0, 1);
                CLS523.MTH7165(this.FLD4420, s, "", "", 1, ((CLS16)ʿˋ0));
            }
        }
    }
}

