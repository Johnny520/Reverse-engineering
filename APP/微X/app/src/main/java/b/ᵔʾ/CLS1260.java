// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.os.Bundle;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS69;
import b.ⁱʾ.CLS335;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;

public final class CLS1260 implements CLS533 {
    public final ArrayList FLD3210;
    public final int FLD3211;
    public final CLS335 FLD3212;
    public final Bundle FLD3213;
    public final CLS69 FLD3214;
    public final CLS1625 FLD3215;
    public final CLS1624 FLD3216;
    public final ArrayList FLD3217;

    public CLS1260(CLS69 ʾᵢ0, Bundle bundle0, CLS1625 ـˏ0, CLS335 ˑٴ0, ArrayList arrayList0, CLS1624 יﹳ0, ArrayList arrayList1, int v) {
        this.FLD3211 = v;
        this.FLD3214 = ʾᵢ0;
        this.FLD3213 = bundle0;
        this.FLD3215 = ـˏ0;
        this.FLD3212 = ˑٴ0;
        this.FLD3217 = arrayList0;
        this.FLD3216 = יﹳ0;
        this.FLD3210 = arrayList1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        CLS1624 יﹳ0 = this.FLD3216;
        CLS335 ˑٴ0 = this.FLD3212;
        CLS1625 ـˏ0 = this.FLD3215;
        ArrayList arrayList0 = this.FLD3210;
        ArrayList arrayList1 = this.FLD3217;
        Bundle bundle0 = this.FLD3213;
        CLS69 ʾᵢ0 = this.FLD3214;
        if(this.FLD3211 == 0) {
            try {
                int v1 = (int)(((Integer)ʾᵢ0.MTH1565(s)));
                bundle0.putInt("type", v1);
                boolean z = false;
                if(v1 == 1) {
                    z = true;
                    ـˏ0.MTH800(CLS27.MTH889("add_img_path"));
                    ـˏ0.MTH801(0);
                    ˑٴ0.MTH5111(arrayList1);
                }
                else if(v1 == 15) {
                    z = true;
                    ـˏ0.MTH800(CLS27.MTH889("set_vid_path"));
                    ˑٴ0.MTH5111(arrayList0);
                    ـˏ0.MTH801(0);
                }
                if(z) {
                    יﹳ0.MTH801(0);
                    return;
                }
                ـˏ0.MTH801(8);
                יﹳ0.MTH801(8);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            int v2 = (int)(((Integer)ʾᵢ0.MTH1565(s)));
            bundle0.putInt("type", v2);
            boolean z1 = false;
            if(v2 == 1) {
                z1 = true;
                ـˏ0.MTH800(CLS27.MTH889("add_img_path"));
                ـˏ0.MTH801(0);
                ˑٴ0.MTH5111(arrayList1);
            }
            else if(v2 == 15) {
                z1 = true;
                ـˏ0.MTH800(CLS27.MTH889("set_vid_path"));
                ˑٴ0.MTH5111(arrayList0);
                ـˏ0.MTH801(0);
            }
            if(z1) {
                יﹳ0.MTH801(0);
                return;
            }
            ـˏ0.MTH801(8);
            יﹳ0.MTH801(8);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

