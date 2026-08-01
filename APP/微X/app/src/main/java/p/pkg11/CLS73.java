// Decompiled by JEB v5.42.0.202606242140

package p.pkg11;

import p.pkg12.CLS76;
import p.pkg8.CLS44;

public class CLS73 {
    public int FLD436;

    public CLS73() {
        this.FLD436 = 0;
    }

    public final boolean MTH1144(CLS76 ﾞᵢ0) {
        if(this.FLD436 < 5) {
            return false;
        }
        try {
            ((CLS196)ﾞᵢ0).MTH1151(null);
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
        return true;
    }

    public static void MTH1145(CLS76 ﾞᵢ0, String s, String s1) {
        try {
            CLS74 ﾞˈ0 = new CLS74();
            ﾞˈ0.FLD444 = s;
            ﾞˈ0.FLD445 = s1;
            ((CLS196)ﾞᵢ0).MTH1151(ﾞˈ0);
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
    }

    public boolean MTH1146(String s, CLS76 ﾞᵢ0) {
        ++this.FLD436;
        return false;
    }
}

