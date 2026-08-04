package yyds;

import java.util.logging.Logger;

/* JADX INFO: renamed from: yyds.ᛵᛶᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1124 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final Logger f5180 = Logger.getLogger("okio.Okio");

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final boolean m2315(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC0473.m1301(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
