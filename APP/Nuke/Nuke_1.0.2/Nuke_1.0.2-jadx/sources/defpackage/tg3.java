package defpackage;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tg3 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? pv2.h0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
