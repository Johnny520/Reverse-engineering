// Decompiled by JEB v5.42.0.202606242140

package p.pkg3;

import java.util.ArrayList;
import java.util.HashMap;
import p.pkg9.CLS192;
import p.pkg9.CLS207;

public abstract class CLS8 {
    public CLS207 FLD31;
    public String FLD32;
    public ArrayList FLD33;
    public final CLS201 FLD34;
    public HashMap FLD35;
    public CLS18 FLD36;
    public final CLS199 FLD37;
    public CLS9 FLD38;
    public CLS11 FLD39;
    public CLS12 FLD40;
    public CLS13 FLD41;

    public CLS8() {
        this.FLD34 = new CLS201();
        this.FLD37 = new CLS199();
    }

    public final boolean MTH442(String s) {
        CLS199 יٴ$ˋˈ0 = this.FLD37;
        if(this.FLD40 == יٴ$ˋˈ0) {
            CLS199 יٴ$ˋˈ1 = new CLS199();
            ((CLS87)יٴ$ˋˈ1).MTH489(s);
            return this.MTH446(((CLS12)יٴ$ˋˈ1));
        }
        ((CLS87)יٴ$ˋˈ0).MTH485();
        ((CLS87)יٴ$ˋˈ0).MTH489(s);
        return this.MTH446(((CLS12)יٴ$ˋˈ0));
    }

    public final CLS15 MTH443(String s, CLS9 ˋˈ0) {
        CLS15 ᴵᐧ0 = (CLS15)this.FLD35.get(s);
        if(ᴵᐧ0 == null) {
            ᴵᐧ0 = CLS15.MTH690(s, ˋˈ0);
            this.FLD35.put(s, ᴵᐧ0);
        }
        return ᴵᐧ0;
    }

    public final void MTH444(String s) {
        CLS201 יٴ$ﾞˈ0 = this.FLD34;
        if(this.FLD40 == יٴ$ﾞˈ0) {
            CLS201 יٴ$ﾞˈ1 = new CLS201();
            ((CLS87)יٴ$ﾞˈ1).MTH489(s);
            this.MTH446(((CLS12)יٴ$ﾞˈ1));
            return;
        }
        יٴ$ﾞˈ0.MTH485();
        ((CLS87)יٴ$ﾞˈ0).MTH489(s);
        this.MTH446(((CLS12)יٴ$ﾞˈ0));
    }

    public final CLS192 MTH445() {
        int v = this.FLD33.size();
        return v > 0 ? ((CLS192)this.FLD33.get(v - 1)) : this.FLD31;
    }

    public abstract boolean MTH446(CLS12 arg1);

    public final boolean MTH447(String s) {
        if(this.FLD33.size() == 0) {
            return false;
        }
        CLS192 יٴ0 = this.MTH445();
        return יٴ0 != null && יٴ0.FLD388.FLD187.equals(s);
    }
}

