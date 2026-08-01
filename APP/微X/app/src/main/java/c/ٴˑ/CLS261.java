// Decompiled by JEB v5.42.0.202606242140

package c.ٴˑ;

import android.graphics.Bitmap;
import c.ﾞʾ.CLS366;

public class CLS261 {
    public static final CLS260 FLD1033;

    static {
        CLS261.FLD1033 = new CLS260();
    }

    public static Bitmap MTH3407(CLS366 ﾞⁱ0, CLS260 ⁱˋ0) {
        int v = ⁱˋ0.MTH3403();
        int v1 = ⁱˋ0.MTH3405();
        int v2 = ﾞⁱ0.MTH5044();
        int v3 = ﾞⁱ0.MTH5046();
        int[] arr_v = new int[v2 * v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = v4 * v2;
            for(int v6 = 0; v6 < v2; ++v6) {
                arr_v[v5 + v6] = ﾞⁱ0.MTH5038(v6, v4) ? v : v1;
            }
        }
        Bitmap bitmap0 = Bitmap.createBitmap(v2, v3, ⁱˋ0.MTH3404());
        bitmap0.setPixels(arr_v, 0, v2, 0, 0, v2, v3);
        return bitmap0;
    }
}

