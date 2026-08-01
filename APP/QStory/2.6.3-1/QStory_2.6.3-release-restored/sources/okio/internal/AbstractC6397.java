package okio.internal;

import java.util.logging.Logger;
import kotlin.text.AbstractC5976;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6397 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Logger f15689 = Logger.getLogger("okio.Okio");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m11488(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC5976.m10735(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
