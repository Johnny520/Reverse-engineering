package p000;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tg3 {

    /* JADX INFO: renamed from: a */
    public static final Logger f10745a = Logger.getLogger("okio.Okio");

    /* JADX INFO: renamed from: a */
    public static final boolean m5254a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? pv2.m3995h0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
