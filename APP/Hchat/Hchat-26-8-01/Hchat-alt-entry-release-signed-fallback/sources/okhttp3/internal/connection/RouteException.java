package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RouteException extends java.lang.RuntimeException {
    private final java.io.IOException firstConnectException;
    private java.io.IOException lastConnectException;

    public RouteException(java.io.IOException r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            r0.firstConnectException = r1
            r0.lastConnectException = r1
            return
    }

    public final void addConnectException(java.io.IOException r2) {
            r1 = this;
            r2.getClass()
            java.io.IOException r0 = r1.firstConnectException
            ac.p.e(r0, r2)
            r1.lastConnectException = r2
            return
    }

    public final java.io.IOException getFirstConnectException() {
            r1 = this;
            java.io.IOException r0 = r1.firstConnectException
            return r0
    }

    public final java.io.IOException getLastConnectException() {
            r1 = this;
            java.io.IOException r0 = r1.lastConnectException
            return r0
    }
}
