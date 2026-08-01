// Decompiled by JEB v5.42.0.202606242140

package p.pkg5;

import android.os.Build;
import android.webkit.WebSettings;

public final class CLS33 {
    public static void MTH842(WebSettings webSettings0) {
        webSettings0.setMixedContentMode(0);
    }

    public static String[] MTH843() {
        return Build.SUPPORTED_ABIS;
    }
}

