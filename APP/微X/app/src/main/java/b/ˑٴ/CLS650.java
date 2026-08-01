// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS13;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1255;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS466;
import java.io.File;
import java.util.LinkedList;

public final class CLS650 implements CLS39 {
    public final int FLD640;
    public final CLS12 FLD641;
    public final String FLD642;

    public CLS650(int v, CLS12 ᵔʾ0, String s) {
        this.FLD640 = v;
        this.FLD642 = s;
        this.FLD641 = ᵔʾ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS12 ᵔʾ0 = this.FLD641;
        String s = this.FLD642;
        if(this.FLD640 == 0) {
            Object object0 = CLS66.MTH1516(s);
            if(object0 == null) {
                ᵔʾ0.MTH791(null);
                return;
            }
            Object object1 = ((LinkedList)CLS182.MTH3492(0x38ECC20D2B3CD335L, CLS182.MTH3492(4101867186299917109L, CLS166.MTH3195(object0, CLS27.MTH897("snsSightMethod5"), new Object[0])))).get(0);
            CLS466.MTH6517(object1, s, ((CLS13)new CLS1255(ᵔʾ0, object1, 27)), false);
            return;
        }
        File file0 = new File(CLS31.MTH980());
        if(!CLS432.MTH6185(file0.getAbsolutePath(), s)) {
            CLS27.MTH906("download failed");
            return;
        }
        ᵔʾ0.MTH791(file0);
    }
}

