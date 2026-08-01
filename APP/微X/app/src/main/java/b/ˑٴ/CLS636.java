// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.Intent;
import android.graphics.Bitmap;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS518.CLS516;

public final class CLS636 implements CLS516 {
    public final int FLD580;
    public final String FLD581;
    public final String FLD582;
    public final CLS760 FLD583;
    public final String FLD584;
    public final Bitmap FLD585;

    public CLS636(CLS760 ـˑ0, String s, String s1, String s2, Bitmap bitmap0, int v) {
        this.FLD580 = v;
        this.FLD583 = ـˑ0;
        this.FLD582 = s;
        this.FLD584 = s1;
        this.FLD581 = s2;
        this.FLD585 = bitmap0;
        super();
    }

    @Override  // b.ⁱᵔ.CLS518$CLS516
    public final void MTH7045(Bitmap bitmap0) {
        CLS760 ـˑ0 = this.FLD583;
        if(this.FLD580 == 0) {
            CLS485 ᐧﾞ0 = ـˑ0.MTH2541();
            ـˑ0.MTH2541().getClass();
            Intent intent0 = CLS485.MTH6731(this.FLD582);
            ᐧﾞ0.MTH6715(this.FLD582, this.FLD584, bitmap0, intent0, this.FLD581, this.FLD585);
            return;
        }
        CLS485 ᐧﾞ1 = ـˑ0.MTH2541();
        ـˑ0.MTH2541().getClass();
        Intent intent1 = CLS485.MTH6731(this.FLD582);
        ᐧﾞ1.MTH6715(this.FLD582, this.FLD584, bitmap0, intent1, this.FLD581, this.FLD585);
    }
}

