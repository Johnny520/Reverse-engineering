// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import b.ˑٴ.CLS702;
import b.ᐧˉ.CLS1049;
import java.io.File;
import java.util.ArrayList;

public final class CLS1424 implements CLS12 {
    public final int FLD4162;
    public final CLS3 FLD4163;

    public CLS1424(CLS3 ˆٴ0, int v) {
        this.FLD4162 = v;
        this.FLD4163 = ˆٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS3 ˆٴ0 = this.FLD4163;
        if(this.FLD4162 == 0) {
            if(((Boolean)object0).booleanValue()) {
                ˆٴ0.MTH774();
            }
            return;
        }
        if(((ArrayList)object0) != null && !((ArrayList)object0).isEmpty()) {
            for(Object object1: ((ArrayList)object0)) {
                CLS81 יᐧ0 = new CLS81(CLS47.FLD167.MTH1197());
                CLS1049 ˑᴵ0 = new CLS1049(((File)object1).getAbsolutePath(), יᐧ0, new CLS702(((File)object1), יᐧ0, ˆٴ0, 24), 3);
                CLS40.FLD157.MTH1124(((CLS39)ˑᴵ0));
            }
        }
    }
}

