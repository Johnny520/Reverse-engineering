package p260x;

import android.os.Build;
import java.util.Locale;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: x.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3413T {

    /* JADX INFO: renamed from: a */
    public static final C3412S f10680a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    static {
        C3412S c3412s;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC1665j.m2984d(lowerCase, "toLowerCase(...)");
            c3412s = lowerCase.equals("robolectric") ? new C3412S() : null;
        }
        f10680a = c3412s;
    }
}
