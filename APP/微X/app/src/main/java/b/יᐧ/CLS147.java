// Decompiled by JEB v5.42.0.202606242140

package b.יᐧ;

import android.os.Handler;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS40;
import b.ᵔʾ.CLS291;
import java.util.ArrayDeque;

public final class CLS147 {
    public static final class CLS146 {
        public final CLS3 FLD1534;
        public final int FLD1535;

        public CLS146(CLS3 ˆٴ0) {
            this.FLD1534 = ˆٴ0;
            this.FLD1535 = 5000;
        }
    }

    public final Handler FLD1536;
    public final ArrayDeque FLD1537;
    public final CLS291 FLD1538;

    public CLS147() {
        this.FLD1537 = new ArrayDeque();
        this.FLD1536 = CLS40.FLD157.MTH1121();
        this.FLD1538 = new CLS291(4, this);
    }

    public final void MTH3130() {
        ArrayDeque arrayDeque0 = this.FLD1537;
        if(arrayDeque0.isEmpty()) {
            return;
        }
        CLS146 ˆٴ$ˆٴ0 = (CLS146)arrayDeque0.peekFirst();
        if(ˆٴ$ˆٴ0 == null) {
            return;
        }
        this.FLD1536.postDelayed(this.FLD1538, ((long)ˆٴ$ˆٴ0.FLD1535));
    }
}

