// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS43;
import b.ⁱʾ.CLS347;
import java.util.ArrayList;

public final class CLS1425 implements CLS3 {
    public final int FLD4164;
    public final ArrayList FLD4165;
    public final CLS43 FLD4166;
    public final Activity FLD4167;
    public final ArrayList FLD4168;
    public final CLS347 FLD4169;

    public CLS1425(Activity activity0, CLS43 ˆʿ0, ArrayList arrayList0, ArrayList arrayList1, CLS347 ᐧי0) {
        this.FLD4164 = 1;
        super();
        this.FLD4167 = activity0;
        this.FLD4166 = ˆʿ0;
        this.FLD4168 = arrayList0;
        this.FLD4165 = arrayList1;
        this.FLD4169 = ᐧי0;
    }

    public CLS1425(Activity activity0, ArrayList arrayList0, CLS43 ˆʿ0, ArrayList arrayList1, CLS347 ᐧי0) {
        this.FLD4164 = 0;
        super();
        this.FLD4167 = activity0;
        this.FLD4168 = arrayList0;
        this.FLD4166 = ˆʿ0;
        this.FLD4165 = arrayList1;
        this.FLD4169 = ᐧי0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        if(this.FLD4164 == 0) {
            String s = CLS27.MTH889("delete");
            CLS1366 ˆˆ$ʻˑ0 = new CLS1366(this.FLD4167, this.FLD4166, this.FLD4168, this.FLD4165, this.FLD4169);
            CLS523.MTH7146(this.FLD4167, s, this.FLD4168, ((CLS8)ˆˆ$ʻˑ0), null);
            return;
        }
        String s1 = CLS27.MTH889("add");
        CLS1506 ٴʿ0 = new CLS1506(this.FLD4166, this.FLD4168, this.FLD4165, this.FLD4169, 0);
        CLS523.MTH7165(this.FLD4167, s1, "", "", 1, ((CLS16)ٴʿ0));
    }
}

