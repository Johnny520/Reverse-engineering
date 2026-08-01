package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class SafeNavigate extends RuntimeException {
    private static final SafeNavigate abortException = new SafeNavigate();

    private SafeNavigate() {
    }

    public static SafeNavigate doAbort() {
        return abortException;
    }
}
