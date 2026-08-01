// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS43;
import b.ᵔʾ.CLS1227;
import b.ⁱʾ.CLS347;
import java.util.ArrayList;

public final class CLS1280 implements CLS3 {
    public final CLS347 FLD3491;
    public final int FLD3492;
    public final ArrayList FLD3493;
    public final String FLD3494;
    public final Activity FLD3495;
    public final CLS43 FLD3496;
    public final ArrayList FLD3497;
    public final int FLD3498;

    public CLS1280(Activity activity0, CLS43 ˆʿ0, String s, ArrayList arrayList0, int v, ArrayList arrayList1, CLS347 ᐧי0) {
        this.FLD3492 = 0;
        super();
        this.FLD3495 = activity0;
        this.FLD3496 = ˆʿ0;
        this.FLD3494 = s;
        this.FLD3493 = arrayList0;
        this.FLD3498 = v;
        this.FLD3497 = arrayList1;
        this.FLD3491 = ᐧי0;
    }

    public CLS1280(Activity activity0, String s, CLS43 ˆʿ0, ArrayList arrayList0, int v, ArrayList arrayList1, CLS347 ᐧי0) {
        this.FLD3492 = 1;
        super();
        this.FLD3495 = activity0;
        this.FLD3494 = s;
        this.FLD3496 = ˆʿ0;
        this.FLD3493 = arrayList0;
        this.FLD3498 = v;
        this.FLD3497 = arrayList1;
        this.FLD3491 = ᐧי0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        if(this.FLD3492 == 0) {
            CLS1368 ˆˆ$ˆʿ0 = new CLS1368(this.FLD3496, this.FLD3494, this.FLD3493, this.FLD3498, this.FLD3497, this.FLD3491);
            CLS523.MTH7142(this.FLD3495, ((CLS11)ˆˆ$ˆʿ0));
            return;
        }
        String s = CLS27.MTH889("modify");
        CLS1227 ʽי0 = new CLS1227(this.FLD3496, this.FLD3494, this.FLD3493, this.FLD3498, this.FLD3497, this.FLD3491);
        CLS523.MTH7165(this.FLD3495, s, "", this.FLD3494, 1, ((CLS16)ʽי0));
    }
}

