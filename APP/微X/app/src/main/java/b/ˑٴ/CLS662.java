// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS566;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS432;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class CLS662 implements CLS8 {
    public final CLS629 FLD677;

    public CLS662(CLS629 ʻˋ0) {
        this.FLD677 = ʻˋ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        CLS728 ˏٴ0;
        CLS672 ˆˋ0;
        String s1;
        Set set0 = Collections.synchronizedSet(new HashSet());
        CLS702 ˊᵔ0 = new CLS702(this, set0, ((ArrayList)object0), 0);
        for(Object object1: ((ArrayList)object0)) {
            ContentValues contentValues0 = (ContentValues)object1;
            int v = CLS182.MTH3474(0x38EB48DB2B3CD335L, contentValues0);
            if(v == -100) {
                String s = contentValues0.getAsString("url");
                set0.add(s);
                CLS432.MTH6179(s, ((CLS12)new CLS566(set0, s, contentValues0, ˊᵔ0, 2)), new CLS728(set0, s, ˊᵔ0, 0));
            }
            else {
                switch(v) {
                    case -102: {
                        s1 = contentValues0.getAsString("url");
                        set0.add(s1);
                        ˆˋ0 = new CLS672(this, set0, s1, contentValues0, ˊᵔ0, 1);
                        ˏٴ0 = new CLS728(set0, s1, ˊᵔ0, 2);
                        break;
                    }
                    case -101: {
                        s1 = contentValues0.getAsString("url");
                        set0.add(s1);
                        ˆˋ0 = new CLS672(this, set0, s1, contentValues0, ˊᵔ0, 0);
                        ˏٴ0 = new CLS728(set0, s1, ˊᵔ0, 1);
                        break;
                    }
                    default: {
                        continue;
                    }
                }
                CLS432.MTH6179(s1, ((CLS12)ˆˋ0), ˏٴ0);
            }
        }
        ˊᵔ0.MTH774();
    }
}

