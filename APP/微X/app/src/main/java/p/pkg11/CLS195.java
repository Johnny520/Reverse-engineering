// Decompiled by JEB v5.42.0.202606242140

package p.pkg11;

import p.pkg8.CLS43.CLS42;
import p.pkg8.CLS43;

public final class CLS195 implements CLS42 {
    public final int FLD437;
    public final String FLD438;
    public final CLS72 FLD439;

    public CLS195(CLS72 ˎᵔ0, String s, int v) {
        this.FLD437 = v;
        this.FLD439 = ˎᵔ0;
        this.FLD438 = s;
        super();
    }

    @Override  // p.pkg8.CLS43$CLS42
    public final void run() {
        String s = this.FLD438;
        CLS72 ˎᵔ0 = this.FLD439;
        switch(this.FLD437) {
            case 0: {
                ˎᵔ0.loadUrl(s);
                return;
            }
            case 1: {
                CLS195 ᐧᴵ0 = new CLS195(ˎᵔ0, s, 2);
                CLS43.FLD320.MTH880(((CLS42)ᐧᴵ0));
                return;
            }
            default: {
                ˎᵔ0.loadUrl(s);
            }
        }
    }
}

