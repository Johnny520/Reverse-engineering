// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.Bundle;
import android.util.SparseArray;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS80;
import b.ˈˈ.CLS87;
import b.יᐧ.CLS158;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS412;
import java.io.File;

public final class CLS773 implements CLS12 {
    public final int FLD1076;
    public final Object FLD1077;
    public final int FLD1078;
    public final String FLD1079;
    public final Object FLD1080;

    public CLS773(int v, SparseArray sparseArray0, CLS1274 ﾞˎ0, String s) {
        this.FLD1076 = 1;
        super();
        this.FLD1079 = s;
        this.FLD1080 = sparseArray0;
        this.FLD1078 = v;
        this.FLD1077 = ﾞˎ0;
    }

    public CLS773(int v, CLS87 ᐧˉ0, CLS629 ʻˋ0, String s) {
        this.FLD1076 = 0;
        super();
        this.FLD1080 = ʻˋ0;
        this.FLD1077 = ᐧˉ0;
        this.FLD1079 = s;
        this.FLD1078 = v;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        int v = this.FLD1078;
        String s = this.FLD1079;
        Object object1 = this.FLD1077;
        Object object2 = this.FLD1080;
        if(this.FLD1076 == 0) {
            ((CLS629)object2).getClass();
            String s1 = ((CLS87)object1).FLD355;
            ((CLS87)object1).FLD355 = CLS31.MTH992(((File)object0).getAbsolutePath());
            if(CLS66.MTH1443(s1) && new File(CLS31.MTH992(CLS66.MTH1498(s1))).length() > 20000000L) {
                ((CLS87)object1).FLD355 = CLS31.MTH992(CLS66.MTH1449(s1));
            }
            int v1 = 0;
            if(!CLS31.MTH1027(((CLS87)object1).FLD355)) {
                CLS412.MTH6014(((CLS140)(((CLS629)object2))).MTH3042(), String.format(CLS27.MTH889("file_not_found"), ((CLS87)object1).FLD355));
            }
            CLS80 ˑٴ0 = new CLS80(s, v, ((CLS87)object1));
            CLS158 ⁱʾ0 = ((CLS629)object2).FLD555;
            ⁱʾ0.MTH3150(ˑٴ0);
            if(!((CLS629)object2).FLD1447.FLD1438.MTH6895("mass_send_by_one_hack") || !((CLS629)object2).FLD1445.MTH938("mass_send_by_one_hack", false)) {
                if(!CLS412.MTH6002()) {
                    v1 = 300000;
                }
                v1 = CLS412.MTH6005(v1, "mass_send_delay");
            }
            ⁱʾ0.MTH3156(((long)v1));
            ⁱʾ0.MTH3155();
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putInt("type", -16);
        bundle0.putString("content", ((File)object0).getAbsolutePath());
        bundle0.putString("imgPath", s);
        ((SparseArray)object2).put(v, bundle0);
        if(((CLS3)object1) != null) {
            ((CLS3)object1).MTH774();
        }
    }
}

