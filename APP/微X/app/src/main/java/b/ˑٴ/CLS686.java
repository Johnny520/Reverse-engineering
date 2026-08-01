// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS69;
import b.ـˏ.CLS169;
import b.ـˏ.CLS886;
import b.ٴـ.CLS896.CLS170;
import java.io.File;
import java.util.ArrayList;

public final class CLS686 implements CLS2 {
    public final ArrayList FLD767;
    public final CLS629 FLD768;

    public CLS686(CLS629 ʻˋ0, ArrayList arrayList0) {
        this.FLD768 = ʻˋ0;
        this.FLD767 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            return;
        }
        try {
            for(Object object0: this.FLD767) {
                CLS886 ʾᵢ0 = new CLS886(new File(new CLS69(((String)object0)).MTH1563()));
                this.FLD768.FLD1447.getClass();
                CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)ʾᵢ0), 3, arrayList0);
                this.FLD768.FLD1447.MTH3029(ˆٴ$ˆٴ0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

