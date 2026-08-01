// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import java.util.ArrayList;
import java.util.List;

public final class CLS1397 implements CLS6 {
    public final int FLD3963;
    public final List FLD3964;
    public final CLS6 FLD3965;

    public CLS1397(CLS6 ˑٴ0, List list0, int v) {
        this.FLD3963 = v;
        this.FLD3965 = ˑٴ0;
        this.FLD3964 = list0;
        super();
    }

    @Override  // b.ʻˑ.CLS6
    public final void MTH783(ArrayList arrayList0) {
        List list0 = this.FLD3964;
        CLS6 ˑٴ0 = this.FLD3965;
        switch(this.FLD3963) {
            case 0: {
                if(ˑٴ0 != null) {
                    try {
                        ˑٴ0.MTH783(CLS66.MTH1465(list0));
                        return;
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 1: {
                if(ˑٴ0 != null) {
                    try {
                        ˑٴ0.MTH783(CLS66.MTH1465(list0));
                        return;
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                return;
            }
            default: {
                if(ˑٴ0 != null) {
                    try {
                        ˑٴ0.MTH783(CLS66.MTH1465(list0));
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
    }
}

