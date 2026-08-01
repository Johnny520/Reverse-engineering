package p000;

/* JADX INFO: renamed from: un */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0809un extends RuntimeException {

    /* JADX INFO: renamed from: d */
    public final transient InterfaceC0618pk f6267d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0809un(InterfaceC0618pk interfaceC0618pk) {
        this.f6267d = interfaceC0618pk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f6267d.toString();
    }
}
