// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1183 implements CLS3 {
    public final int FLD2769;
    public final ArrayList FLD2770;
    public final CLS244 FLD2771;
    public final CLS359 FLD2772;

    public CLS1183(CLS244 ᴵʻ0, ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD2769 = v;
        this.FLD2771 = ᴵʻ0;
        this.FLD2770 = arrayList0;
        this.FLD2772 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS359 ⁱˉ0 = this.FLD2772;
        ArrayList arrayList0 = this.FLD2770;
        CLS244 ᴵʻ0 = this.FLD2771;
        switch(this.FLD2769) {
            case 0: {
                ᴵʻ0.getClass();
                Object[] arr_object1 = {new CLS1128(ᴵʻ0, arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectImg2", arr_object1);
                return;
            }
            case 1: {
                ᴵʻ0.getClass();
                Object[] arr_object2 = {new CLS1125(ᴵʻ0, arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectImgMulti", arr_object2);
                return;
            }
            case 2: {
                ᴵʻ0.getClass();
                Object[] arr_object3 = {new CLS1130(arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectVid", arr_object3);
                return;
            }
            case 3: {
                ᴵʻ0.getClass();
                Object[] arr_object4 = {new CLS1129(arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectGif", arr_object4);
                return;
            }
            case 4: {
                ᴵʻ0.getClass();
                ᴵʻ0.MTH4264(((CLS12)new CLS1207(arrayList0, ⁱˉ0, 2)), null);
                return;
            }
            case 5: {
                ᴵʻ0.getClass();
                Object[] arr_object5 = {new CLS1154(ᴵʻ0, arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectImg2", arr_object5);
                return;
            }
            case 6: {
                ᴵʻ0.getClass();
                Object[] arr_object6 = {new CLS1187(ᴵʻ0, arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectImgMulti", arr_object6);
                return;
            }
            case 7: {
                ᴵʻ0.getClass();
                Object[] arr_object7 = {new CLS1100(arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectVid", arr_object7);
                return;
            }
            default: {
                ᴵʻ0.getClass();
                Object[] arr_object = {new CLS1045(arrayList0, ⁱˉ0)};
                CLS21.FLD76.MTH818("selectGif", arr_object);
            }
        }
    }
}

