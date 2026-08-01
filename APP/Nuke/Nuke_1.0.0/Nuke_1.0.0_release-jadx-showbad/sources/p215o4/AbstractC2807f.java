package p215o4;

import java.util.logging.Logger;
import p149d3.AbstractC1976d;

/* JADX INFO: renamed from: o4.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2807f {

    /* JADX INFO: renamed from: a */
    public static final Logger f8835a = Logger.getLogger("okio.Okio");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m4990a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC1976d.m3629W(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }
}
