// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS79;
import b.ⁱᵔ.CLS426;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS750 implements CLS12 {
    public final long FLD971;
    public final long FLD972;
    public final int FLD973;
    public final String FLD974;
    public final int FLD975;
    public final CLS629 FLD976;
    public final String FLD977;
    public final String FLD978;
    public final int FLD979;

    public CLS750(CLS629 ʻˋ0, int v, String s, String s1, int v1, String s2, long v2, long v3, int v4) {
        this.FLD973 = v4;
        this.FLD976 = ʻˋ0;
        this.FLD975 = v;
        this.FLD977 = s;
        this.FLD974 = s1;
        this.FLD979 = v1;
        this.FLD978 = s2;
        this.FLD971 = v2;
        this.FLD972 = v3;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS629 ʻˋ0 = this.FLD976;
        switch(this.FLD973) {
            case 0: {
                int v4 = this.FLD975;
                String s3 = this.FLD977;
                String s4 = this.FLD974;
                int v5 = this.FLD979;
                String s5 = this.FLD978;
                long v6 = this.FLD971;
                long v7 = this.FLD972;
                ʻˋ0.getClass();
                if(!TextUtils.isEmpty(((String)object0))) {
                    CLS862 ﹳﹳ0 = new CLS862(ʻˋ0, ((String)object0), v4, s3, s4, v5, s5, v6, v7, 0);
                    CLS40.FLD157.MTH1124(((CLS39)ﹳﹳ0));
                }
                return;
            }
            case 1: {
                int v8 = this.FLD975;
                String s6 = this.FLD977;
                String s7 = this.FLD974;
                int v9 = this.FLD979;
                String s8 = this.FLD978;
                long v10 = this.FLD971;
                long v11 = this.FLD972;
                ʻˋ0.getClass();
                if(!TextUtils.isEmpty(((String)object0))) {
                    CLS71 ˆٴ1 = new CLS71(((CLS140)ʻˋ0).MTH3042(), CLS27.MTH889("send"));
                    ˆٴ1.MTH1572("normal_send", ((CLS3)new CLS873(ʻˋ0, ((String)object0), v8, s6, s7, v9, s8, v10, v11, 0)));
                    ˆٴ1.MTH1572("mass_send", ((CLS3)new CLS873(ʻˋ0, ((String)object0), v8, s6, s7, v9, s8, v10, v11, 1)));
                    ˆٴ1.MTH1573();
                }
                return;
            }
            default: {
                int v = this.FLD975;
                String s = this.FLD977;
                String s1 = this.FLD974;
                int v1 = this.FLD979;
                String s2 = this.FLD978;
                long v2 = this.FLD971;
                long v3 = this.FLD972;
                ʻˋ0.getClass();
                if(!TextUtils.isEmpty(((String)object0))) {
                    HashSet hashSet0 = CLS79.FLD292.MTH1655(((String)object0));
                    if(!hashSet0.isEmpty()) {
                        boolean z = false;
                        Iterator iterator0 = hashSet0.iterator();
                        while(iterator0.hasNext()) {
                            Object object1 = iterator0.next();
                            if(!ʻˋ0.FLD1444.MTH5382(((String)object1))) {
                                iterator0.remove();
                            }
                            if(!z && CLS426.MTH6126(((String)object1))) {
                                z = true;
                            }
                        }
                        if(z) {
                            ʻˋ0.MTH2044(v, v1, v2, v3, s, s1, s2, TextUtils.join(",", hashSet0));
                            return;
                        }
                        CLS71 ˆٴ0 = new CLS71(((CLS140)ʻˋ0).MTH3042(), CLS27.MTH889("send"));
                        ˆٴ0.MTH1572("normal_send", ((CLS3)new CLS705(ʻˋ0, v, s, s1, v1, s2, v2, v3, hashSet0, 0)));
                        ˆٴ0.MTH1572("mass_send", ((CLS3)new CLS705(ʻˋ0, v, s, s1, v1, s2, v2, v3, hashSet0, 1)));
                        ˆٴ0.MTH1573();
                    }
                }
            }
        }
    }
}

