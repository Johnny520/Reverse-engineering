// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.graphics.Bitmap;
import d.יʻ.CLS62;
import d.ᐧˈ.CLS205;
import d.ᐧˈ.CLS206;
import d.ᵎʻ.CLS210;

public final class CLS50 {
    public static void MTH690(Activity activity0, String s, String s1, String s2) {
        Bitmap bitmap0 = (Bitmap)CLS62.FLD317.MTH761("genQRCode", new Object[]{s2, 640, 640});
        CLS10 ʻﹶ0 = new CLS10(activity0, s);
        ʻﹶ0.FLD52 = new CLS210(bitmap0, 6);
        ʻﹶ0.FLD47 = new CLS205(activity0, bitmap0, s1, 4);
        ʻﹶ0.FLD48 = true;
        ʻﹶ0.FLD43 = new CLS206(5);
        ʻﹶ0.show();
        CLS46.FLD233.MTH672();
    }
}

