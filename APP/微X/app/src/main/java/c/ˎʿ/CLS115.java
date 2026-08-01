// Decompiled by JEB v5.42.0.202606242140

package c.ˎʿ;

import android.graphics.Bitmap;
import c.ˎˊ.CLS117;

public class CLS115 {
    public static final CLS116 FLD559;

    static {
        CLS115.FLD559 = new CLS116();
    }

    public static Bitmap MTH2300(CLS117 ʻᵢ0, CLS116 ˆٴ0) {
        int v = ˆٴ0.MTH2305();
        int v1 = ˆٴ0.MTH2303();
        int v2 = ʻᵢ0.MTH2325();
        int v3 = ʻᵢ0.MTH2328();
        int[] arr_v = new int[v2 * v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = v4 * v2;
            for(int v6 = 0; v6 < v2; ++v6) {
                arr_v[v5 + v6] = ʻᵢ0.MTH2331(v6, v4) ? v : v1;
            }
        }
        Bitmap bitmap0 = Bitmap.createBitmap(v2, v3, ˆٴ0.MTH2304());
        bitmap0.setPixels(arr_v, 0, v2, 0, 0, v2, v3);
        return bitmap0;
    }
}

