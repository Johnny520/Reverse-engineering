// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS1407;
import b.ⁱᵔ.CLS1527;
import b.ⁱᵔ.CLS1548;
import b.ⁱᵔ.CLS395.CLS1332;
import b.ⁱᵔ.CLS395.CLS1335;
import b.ⁱᵔ.CLS395.CLS1338;
import b.ⁱᵔ.CLS395.CLS1348;
import java.util.ArrayList;

public final class CLS913 implements CLS3 {
    public final int FLD1709;
    public final CLS359 FLD1710;
    public final ArrayList FLD1711;

    public CLS913(ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD1709 = v;
        this.FLD1711 = arrayList0;
        this.FLD1710 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS359 ⁱˉ0 = this.FLD1710;
        ArrayList arrayList0 = this.FLD1711;
        switch(this.FLD1709) {
            case 0: {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put(CLS34.MTH1063(4100684438205944629L, contentValues0, -201, 4100684459680781109L), CLS27.MTH889("patmsg"));
                contentValues0.put("msg", "#nudge");
                contentValues0.put("checked", Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues0, ⁱˉ0, arrayList0, contentValues0);
                return;
            }
            case 1: {
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put(CLS34.MTH1063(4100657362732110645L, contentValues1, -201, 4100657384206947125L), CLS27.MTH889("patmsg"));
                contentValues1.put("msg", "#nudge");
                contentValues1.put("checked", Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues1, ⁱˉ0, arrayList0, contentValues1);
                return;
            }
            case 2: {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(CLS34.MTH1063(4100623861987201845L, contentValues2, -201, 4100623883462038325L), CLS27.MTH889("patmsg"));
                contentValues2.put("msg", "#nudge");
                contentValues2.put("checked", Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues2, ⁱˉ0, arrayList0, contentValues2);
                return;
            }
            case 3: {
                Object[] arr_object1 = {new CLS1338(ⁱˉ0, arrayList0)};
                CLS21.FLD76.MTH818("selectImg2", arr_object1);
                return;
            }
            case 4: {
                Object[] arr_object2 = {new CLS1332(ⁱˉ0, arrayList0)};
                CLS21.FLD76.MTH818("selectImgMulti", arr_object2);
                return;
            }
            case 5: {
                Object[] arr_object3 = {new CLS1335(ⁱˉ0, arrayList0)};
                CLS21.FLD76.MTH818("selectGif", arr_object3);
                return;
            }
            case 6: {
                Object[] arr_object4 = {new CLS1348(ⁱˉ0, arrayList0)};
                CLS21.FLD76.MTH818("selectVid", arr_object4);
                return;
            }
            case 7: {
                Object[] arr_object5 = {new CLS1407(ⁱˉ0, arrayList0)};
                CLS21.FLD76.MTH818("selectImg2", arr_object5);
                return;
            }
            case 8: {
                Object[] arr_object6 = {new CLS1548(ⁱˉ0, arrayList0)};
                CLS21.FLD76.MTH818("selectGif", arr_object6);
                return;
            }
            default: {
                Object[] arr_object = {new CLS1527(ⁱˉ0, arrayList0)};
                CLS21.FLD76.MTH818("selectVid", arr_object);
            }
        }
    }
}

