// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;

public final class CLS852 implements CLS39 {
    public final int FLD1346;
    public final int FLD1347;

    public CLS852(int v, int v1) {
        this.FLD1346 = v1;
        this.FLD1347 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        int v = this.FLD1347;
        if(this.FLD1346 == 0) {
            try {
                Object[] arr_object = {String.format(CLS27.MTH889("ct_amount"), ((double)(((double)v) / 100.0)))};
                CLS21.FLD76.MTH818("speak", arr_object);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            Object[] arr_object1 = {String.format(CLS27.MTH889("rp_amount"), ((double)(((double)v) / 100.0)))};
            CLS21.FLD76.MTH818("speak", arr_object1);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

