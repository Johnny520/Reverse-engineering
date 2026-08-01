// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS366;
import b.ﾞˎ.CLS1624.CLS540;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;

public final class CLS1326 implements CLS533, CLS540 {
    public final CLS1629 FLD3669;
    public final ArrayList FLD3670;
    public final CLS366 FLD3671;

    public CLS1326(CLS1629 ⁱˉ0, CLS366 ﾞᐧ0, ArrayList arrayList0) {
        this.FLD3669 = ⁱˉ0;
        this.FLD3671 = ﾞᐧ0;
        this.FLD3670 = arrayList0;
    }

    public CLS1326(ArrayList arrayList0, CLS1629 ⁱˉ0, CLS366 ﾞᐧ0) {
        this.FLD3670 = arrayList0;
        this.FLD3669 = ⁱˉ0;
        this.FLD3671 = ﾞᐧ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        int v = 0;
        switch(this.FLD3669.MTH7373()) {
            case "none": {
                break;
            }
            case "radio_female": {
                v = 2;
                break;
            }
            case "radio_male": {
                v = 1;
                break;
            }
            default: {
                v = -1;
            }
        }
        ArrayList arrayList0 = CLS372.MTH5415(v, CLS372.MTH5404(s, this.FLD3670));
        this.FLD3671.MTH5276(arrayList0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        try {
            ArrayList arrayList0 = this.FLD3670;
            CLS1629 ⁱˉ0 = this.FLD3669;
            CLS366 ﾞᐧ0 = this.FLD3671;
            if(v == 0) {
                s = "";
            }
            ArrayList arrayList1 = CLS372.MTH5404(s, arrayList0);
            int v1 = -1;
            switch(ⁱˉ0.MTH7373()) {
                case "none": {
                    v1 = 0;
                    break;
                }
                case "radio_female": {
                    v1 = 2;
                    break;
                }
                case "radio_male": {
                    v1 = 1;
                }
            }
            ﾞᐧ0.MTH5276(CLS372.MTH5415(v1, arrayList1));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

