// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.os.Bundle;
import android.util.SparseArray;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS3;
import b.ˆٴ.CLS66;
import b.ـˏ.CLS886;
import b.ⁱʾ.CLS1274;
import java.io.File;

public final class CLS588 implements CLS0 {
    public final int FLD422;
    public final int FLD423;
    public final SparseArray FLD424;
    public final CLS3 FLD425;

    public CLS588(SparseArray sparseArray0, int v, CLS1274 ﾞˎ0, int v1) {
        this.FLD422 = v1;
        this.FLD424 = sparseArray0;
        this.FLD423 = v;
        this.FLD425 = ﾞˎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS0
    public final void MTH770(String s) {
        CLS3 ˆٴ0 = this.FLD425;
        int v = this.FLD423;
        SparseArray sparseArray0 = this.FLD424;
        switch(this.FLD422) {
            case 0: {
                sparseArray0.put(v, new CLS886(new File(CLS66.MTH1410(s))));
                if(ˆٴ0 != null) {
                    ˆٴ0.MTH774();
                }
                return;
            }
            case 1: {
                String s1 = CLS66.MTH1410(s);
                Bundle bundle0 = new Bundle();
                bundle0.putInt("type", 3);
                bundle0.putString("img", s1);
                sparseArray0.put(v, bundle0);
                if(ˆٴ0 != null) {
                    ˆٴ0.MTH774();
                }
                return;
            }
            default: {
                sparseArray0.put(v, new CLS886(new File(CLS66.MTH1410(s))));
                if(ˆٴ0 != null) {
                    ˆٴ0.MTH774();
                }
            }
        }
    }
}

