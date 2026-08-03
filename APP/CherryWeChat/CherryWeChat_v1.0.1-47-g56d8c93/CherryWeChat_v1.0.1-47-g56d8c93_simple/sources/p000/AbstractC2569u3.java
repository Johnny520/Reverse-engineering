package p000;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: renamed from: u3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2569u3 {
    /* JADX INFO: renamed from: a */
    public static boolean m5078a(PowerManager r0) {
        return r0.isPowerSaveMode();
    }

    /* JADX INFO: renamed from: b */
    public static String m5079b(Locale r0) {
        return r0.toLanguageTag();
    }
}
