// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS79;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS1524 implements CLS3 {
    public final int FLD4675;
    public final ArrayList FLD4676;
    public final HashMap FLD4677;
    public final Activity FLD4678;
    public final CLS79 FLD4679;
    public final CLS369 FLD4680;

    public CLS1524(Activity activity0, CLS79 ˎᵢ0, HashMap hashMap0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
        this.FLD4675 = 0;
        super();
        this.FLD4678 = activity0;
        this.FLD4679 = ˎᵢ0;
        this.FLD4677 = hashMap0;
        this.FLD4676 = arrayList0;
        this.FLD4680 = ﾞᵎ0;
    }

    public CLS1524(Activity activity0, ArrayList arrayList0, HashMap hashMap0, CLS79 ˎᵢ0, CLS369 ﾞᵎ0) {
        this.FLD4675 = 2;
        super();
        this.FLD4678 = activity0;
        this.FLD4676 = arrayList0;
        this.FLD4677 = hashMap0;
        this.FLD4679 = ˎᵢ0;
        this.FLD4680 = ﾞᵎ0;
    }

    public CLS1524(Activity activity0, HashMap hashMap0, CLS79 ˎᵢ0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
        this.FLD4675 = 1;
        super();
        this.FLD4678 = activity0;
        this.FLD4677 = hashMap0;
        this.FLD4679 = ˎᵢ0;
        this.FLD4676 = arrayList0;
        this.FLD4680 = ﾞᵎ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS369 ﾞᵎ0 = this.FLD4680;
        ArrayList arrayList0 = this.FLD4676;
        HashMap hashMap0 = this.FLD4677;
        CLS79 ˎᵢ0 = this.FLD4679;
        switch(this.FLD4675) {
            case 0: {
                String s = CLS27.MTH889("add");
                CLS1410 ˊˉ0 = new CLS1410(ˎᵢ0, hashMap0, arrayList0, ﾞᵎ0);
                CLS523.MTH7165(this.FLD4678, s, "", "", 1, ((CLS16)ˊˉ0));
                return;
            }
            case 1: {
                CLS1373 ˆˆ$ـˏ0 = new CLS1373(hashMap0, ˎᵢ0, arrayList0, ﾞᵎ0);
                CLS523.MTH7142(this.FLD4678, ((CLS11)ˆˆ$ـˏ0));
                return;
            }
            default: {
                CLS1370 ˆˆ$ˆٴ0 = new CLS1370(this.FLD4678, arrayList0, hashMap0, ˎᵢ0, ﾞᵎ0);
                CLS523.MTH7144(this.FLD4678, ((CLS8)ˆˆ$ˆٴ0), null, arrayList0);
            }
        }
    }
}

