// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS432;

public final class CLS901 implements CLS16 {
    public final int FLD1668;
    public final int FLD1669;
    public final ContentValues FLD1670;
    public final CLS359 FLD1671;

    public CLS901(ContentValues contentValues0, int v, CLS359 ⁱˉ0, int v1) {
        this.FLD1668 = v1;
        this.FLD1670 = contentValues0;
        this.FLD1669 = v;
        this.FLD1671 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        switch(this.FLD1668) {
            case 0: {
                ContentValues contentValues1 = this.FLD1670;
                int v1 = this.FLD1669;
                CLS359 ⁱˉ1 = this.FLD1671;
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS980(contentValues1, s, v1, ⁱˉ1, 0)));
                }
                return;
            }
            case 1: {
                ContentValues contentValues2 = this.FLD1670;
                int v2 = this.FLD1669;
                CLS359 ⁱˉ2 = this.FLD1671;
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS980(contentValues2, s, v2, ⁱˉ2, 1)));
                }
                return;
            }
            case 2: {
                ContentValues contentValues3 = this.FLD1670;
                int v3 = this.FLD1669;
                CLS359 ⁱˉ3 = this.FLD1671;
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS980(contentValues3, s, v3, ⁱˉ3, 3)));
                }
                return;
            }
            default: {
                ContentValues contentValues0 = this.FLD1670;
                int v = this.FLD1669;
                CLS359 ⁱˉ0 = this.FLD1671;
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS980(contentValues0, s, v, ⁱˉ0, 2)));
                }
            }
        }
    }
}

