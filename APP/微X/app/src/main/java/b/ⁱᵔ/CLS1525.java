// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ᐧˉ.CLS1156;
import b.ﾞᐧ.CLS557;
import java.io.File;

public final class CLS1525 implements CLS12 {
    public final int FLD4681;
    public final String FLD4682;

    public CLS1525(int v, String s) {
        this.FLD4681 = v;
        this.FLD4682 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        String s = this.FLD4682;
        if(this.FLD4681 == 0) {
            if(((CLS557)object0) != null) {
                CLS1156 ᵔᵎ0 = new CLS1156(((CLS557)object0), s, 25);
                CLS40.FLD157.MTH1124(((CLS39)ᵔᵎ0));
            }
            return;
        }
        CLS466.MTH6522(((File)object0).getAbsolutePath(), CLS66.MTH1482(s), null);
    }
}

