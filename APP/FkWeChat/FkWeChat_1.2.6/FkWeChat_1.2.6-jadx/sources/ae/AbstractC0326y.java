package ae;

import java.util.logging.Logger;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: ae.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0326y {

    /* JADX INFO: renamed from: a */
    public static final Logger f827a = Logger.getLogger("okio.Okio");

    /* JADX INFO: renamed from: b */
    public static final boolean m1000b(AssertionError assertionError) {
        assertionError.getClass();
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC8621f0.m33126a0(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }
}
