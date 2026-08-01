// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS983 implements CLS3 {
    public final int FLD1947;
    public final ArrayList FLD1948;
    public final CLS210 FLD1949;
    public final CLS359 FLD1950;

    public CLS983(CLS210 ˋʼ0, ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD1947 = v;
        this.FLD1949 = ˋʼ0;
        this.FLD1948 = arrayList0;
        this.FLD1950 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS359 ⁱˉ0 = this.FLD1950;
        ArrayList arrayList0 = this.FLD1948;
        CLS210 ˋʼ0 = this.FLD1949;
        switch(this.FLD1947) {
            case 0: {
                ˋʼ0.getClass();
                Object[] arr_object1 = {new CLS947(ˋʼ0, arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectImg2", arr_object1);
                return;
            }
            case 1: {
                ˋʼ0.getClass();
                Object[] arr_object2 = {new CLS1050(ˋʼ0, arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectImgMulti", arr_object2);
                return;
            }
            case 2: {
                ˋʼ0.getClass();
                Object[] arr_object3 = {new CLS969(arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectVid", arr_object3);
                return;
            }
            default: {
                ˋʼ0.getClass();
                Object[] arr_object = {new CLS1048(arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectGif", arr_object);
            }
        }
    }
}

