// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS568;
import b.ʾᵢ.CLS576;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS1566 implements CLS3 {
    public final int FLD4883;
    public final ArrayList FLD4884;
    public final Activity FLD4885;
    public final CLS369 FLD4886;

    public CLS1566(Activity activity0, ArrayList arrayList0, int v, CLS369 ﾞᵎ0) {
        this.FLD4883 = v;
        this.FLD4885 = activity0;
        this.FLD4884 = arrayList0;
        this.FLD4886 = ﾞᵎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD4885;
        ArrayList arrayList0 = this.FLD4884;
        CLS369 ﾞᵎ0 = this.FLD4886;
        switch(this.FLD4883) {
            case 0: {
                CLS523.MTH7165(activity0, CLS27.MTH889("add"), "", "", 1, ((CLS16)new CLS1470(0, ﾞᵎ0, arrayList0)));
                return;
            }
            case 1: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1528(ﾞᵎ0, arrayList0)));
                return;
            }
            case 2: {
                CLS523.MTH7165(activity0, CLS27.MTH889("add_wxid"), "", "", 1, ((CLS16)new CLS1470(1, ﾞᵎ0, arrayList0)));
                return;
            }
            case 3: {
                CLS31.MTH991(activity0, ((CLS441)new CLS576(((CLS12)new CLS568(arrayList0, ﾞᵎ0, 17)), 3)));
                return;
            }
            default: {
                CLS523.MTH7165(activity0, CLS27.MTH889("add"), "", "", 1, ((CLS16)new CLS1470(2, ﾞᵎ0, arrayList0)));
            }
        }
    }
}

