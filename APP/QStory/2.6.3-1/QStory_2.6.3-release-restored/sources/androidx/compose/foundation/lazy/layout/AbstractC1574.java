package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1574 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1573 f2413;

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    static {
        C1573 c1573;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            c1573 = lowerCase.equals("robolectric") ? new C1573() : null;
        }
        f2413 = c1573;
    }
}
