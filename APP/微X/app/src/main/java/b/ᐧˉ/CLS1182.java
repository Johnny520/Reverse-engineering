// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import java.io.File;

public final class CLS1182 implements CLS3 {
    public final int FLD2765;
    public final File FLD2766;
    public final CLS1062 FLD2767;
    public final CLS81 FLD2768;

    public CLS1182(CLS1062 יٴ0, File file0, CLS81 יᐧ0, int v) {
        this.FLD2765 = v;
        this.FLD2767 = יٴ0;
        this.FLD2766 = file0;
        this.FLD2768 = יᐧ0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS81 יᐧ0 = this.FLD2768;
        File file0 = this.FLD2766;
        CLS1062 יٴ0 = this.FLD2767;
        if(this.FLD2765 == 0) {
            יٴ0.getClass();
            יᐧ0.FLD307 = file0.getName();
            CLS47.FLD167.MTH1194(יᐧ0);
            CLS1115 ᐧᴵ0 = new CLS1115(יٴ0, 6);
            CLS40.FLD157.MTH1116(((CLS39)ᐧᴵ0));
            return;
        }
        יٴ0.getClass();
        יᐧ0.FLD307 = file0.getName();
        CLS47.FLD167.MTH1194(יᐧ0);
        CLS1115 ᐧᴵ1 = new CLS1115(יٴ0, 0);
        CLS40.FLD157.MTH1116(((CLS39)ᐧᴵ1));
    }
}

