// Decompiled by JEB v5.42.0.202606242140

package p.pkg1;

import java.util.ArrayList;
import p.pkg6.CLS36;
import p.pkg9.CLS192;
import p.pkg9.CLS57;

public final class CLS4 extends ArrayList {
    public CLS4() {
    }

    public CLS4(int v) {
        super(v);
    }

    @Override
    public final Object clone() {
        CLS4 ﾞᵢ0 = new CLS4(this.size());
        for(Object object0: this) {
            ﾞᵢ0.add(((CLS192)object0).MTH1037());
        }
        return ﾞᵢ0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = CLS36.MTH850();
        for(Object object0: this) {
            if(stringBuilder0.length() != 0) {
                stringBuilder0.append("\n");
            }
            stringBuilder0.append(((CLS57)(((CLS192)object0))).MTH983());
        }
        return CLS36.MTH848(stringBuilder0);
    }

    public final String MTH421(String s) {
        for(Object object0: this) {
            CLS192 יٴ0 = (CLS192)object0;
            if(((CLS57)יٴ0).MTH980(s)) {
                return ((CLS57)יٴ0).MTH984(s);
            }
            if(false) {
                break;
            }
        }
        return "";
    }

    public final boolean MTH422(String s) {
        for(Object object0: this) {
            if(((CLS57)(((CLS192)object0))).MTH980(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

