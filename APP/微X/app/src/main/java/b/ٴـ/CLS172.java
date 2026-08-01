// Decompiled by JEB v5.42.0.202606242140

package b.ٴـ;

import b.ʾᵢ.CLS27;
import java.util.HashSet;

public final class CLS172 implements Runnable {
    public final int FLD1647;
    public final CLS171 FLD1648;

    public CLS172(CLS171 ٴـ0, int v) {
        this.FLD1647 = v;
        this.FLD1648 = ٴـ0;
        super();
    }

    @Override
    public final void run() {
        CLS171 ٴـ0 = this.FLD1648;
        if(this.FLD1647 == 0) {
            ٴـ0.getClass();
            try {
                ٴـ0.MTH3330();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            HashSet hashSet0 = ٴـ0.FLD1643;
            if(!hashSet0.isEmpty()) {
                hashSet0.clear();
            }
            ٴـ0.MTH3330();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

