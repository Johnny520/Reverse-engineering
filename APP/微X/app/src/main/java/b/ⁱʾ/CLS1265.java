// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS97;
import b.ˑٴ.CLS783;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS1395;
import java.io.File;
import java.util.HashSet;

public final class CLS1265 implements CLS39 {
    public final int FLD3251;
    public final Object FLD3252;
    public final String FLD3253;
    public final boolean FLD3254;
    public final boolean FLD3255;

    public CLS1265(CLS12 ᵔʾ0, String s, boolean z) {
        this.FLD3251 = 1;
        super();
        this.FLD3252 = ᵔʾ0;
        this.FLD3254 = false;
        this.FLD3253 = s;
        this.FLD3255 = z;
    }

    public CLS1265(CLS323 ˈˈ0, boolean z, boolean z1, String s) {
        this.FLD3251 = 0;
        super();
        this.FLD3252 = ˈˈ0;
        this.FLD3254 = z;
        this.FLD3255 = z1;
        this.FLD3253 = s;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS1395 ˈי0;
        boolean z = true;
        String s = this.FLD3253;
        boolean z1 = this.FLD3255;
        boolean z2 = this.FLD3254;
        Object object0 = this.FLD3252;
        if(this.FLD3251 == 0) {
            if(!z2) {
                if(z1) {
                    ((CLS323)object0).getClass();
                }
                else {
                    for(Object object1: ((CLS323)object0).FLD3301.values()) {
                        HashSet hashSet0 = (HashSet)object1;
                        if(hashSet0 == null || hashSet0.isEmpty() || !hashSet0.contains(s)) {
                            continue;
                        }
                        goto label_15;
                    }
                    z = false;
                label_15:
                    if(z) {
                        ((CLS323)object0).MTH5044();
                        return;
                    }
                }
                return;
            }
            ((CLS323)object0).MTH5044();
            return;
        }
        CLS97 ﾞٴ0 = new CLS97(((CLS12)object0));
        if(z2) {
            ˈי0 = new CLS1395(ﾞٴ0, s, 0);
        }
        else if(CLS66.MTH1394(s)) {
            if(CLS66.MTH1443(s)) {
                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                stringBuilder0.append("origin");
                ﾞٴ0.MTH1768(new File(CLS66.MTH1449(stringBuilder0.toString())));
                return;
            }
            ˈי0 = new CLS783(s, ﾞٴ0, z1);
        }
        else {
            ˈי0 = new CLS1395(ﾞٴ0, s, 1);
        }
        CLS783 ᐧـ0 = new CLS783(s, ˈי0, z1);
        CLS40.FLD157.MTH1124(((CLS39)ᐧـ0));
    }
}

