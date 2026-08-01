// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import java.util.ArrayList;

public final class CLS993 implements CLS11 {
    public final CLS1062 FLD1987;

    public CLS993(CLS1062 יٴ0) {
        this.FLD1987 = יٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            CLS1062 יٴ0 = this.FLD1987;
            CLS47 ˈˊ0 = יٴ0.FLD2276;
            ˈˊ0.getClass();
            for(Object object0: new ArrayList(ˈˊ0.FLD164.values())) {
                ˈˊ0.MTH1195(((CLS81)object0));
            }
            יٴ0.FLD2279.clear();
            יٴ0.FLD2278.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

