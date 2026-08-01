// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import d.יʻ.CLS62;
import java.util.ArrayList;

public final class CLS46 {
    public static final CLS46 FLD233;
    public final ArrayList FLD234;

    static {
        CLS46.FLD233 = new CLS46();
    }

    public CLS46() {
        this.FLD234 = new ArrayList();
    }

    public final void MTH671() {
        CLS62.FLD317.MTH759("core", "wxsettings_reappear", new Object[0]);
        for(Object object0: this.FLD234) {
            ((CLS10)object0).MTH422();
        }
    }

    public final void MTH672() {
        CLS62.FLD317.MTH759("core", "wxsettings_disappear", new Object[0]);
        for(Object object0: this.FLD234) {
            ((CLS10)object0).hide();
        }
    }
}

