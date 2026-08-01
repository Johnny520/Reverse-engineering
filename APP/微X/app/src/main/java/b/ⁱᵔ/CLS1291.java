// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS568;
import b.ˈˈ.CLS82;
import b.ⁱʾ.CLS338;
import java.util.ArrayList;

public final class CLS1291 implements CLS11 {
    public final CLS338 FLD3549;
    public final CLS12 FLD3550;
    public final CLS82 FLD3551;

    public CLS1291(CLS338 יᐧ0, CLS82 יﹳ0, CLS568 יᐧ1) {
        this.FLD3549 = יᐧ0;
        this.FLD3551 = יﹳ0;
        this.FLD3550 = יᐧ1;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        ArrayList arrayList0 = this.FLD3549.MTH5129();
        if(arrayList0.isEmpty()) {
            return;
        }
        try {
            CLS82 יﹳ0 = new CLS82();
            int v = this.FLD3551.MTH1675();
            try {
                יﹳ0.FLD315.put("delay", v);
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            for(Object object0: arrayList0) {
                String s = ((ContentValues)object0).getAsString("file");
                יﹳ0.MTH1673(((int)((ContentValues)object0).getAsInteger("length")), s);
            }
            this.FLD3550.MTH791(יﹳ0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

