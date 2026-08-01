package p000;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class es0 {

    /* JADX INFO: renamed from: a */
    public static final ds0 f1524a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    static {
        ds0 ds0Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            ds0Var = lowerCase.equals("robolectric") ? new ds0() : null;
        }
        f1524a = ds0Var;
    }
}
