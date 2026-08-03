package p265s;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: s.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3820c1 {

    /* JADX INFO: renamed from: a */
    public static final C3817b1 f12529a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    static {
        C3817b1 c3817b1;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            c3817b1 = lowerCase.equals("robolectric") ? new C3817b1() : null;
        }
        f12529a = c3817b1;
    }
}
