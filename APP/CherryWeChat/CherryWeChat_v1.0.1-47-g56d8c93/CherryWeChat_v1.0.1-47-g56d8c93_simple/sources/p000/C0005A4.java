package p000;

/* JADX INFO: renamed from: A4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0005A4 extends AbstractC1293cr {

    /* JADX INFO: renamed from: g */
    public static volatile C0005A4 f2g;

    /* JADX INFO: renamed from: f */
    public final C2370pd f3f;

    public C0005A4() {
        this.f3f = new C2370pd();
    }

    /* JADX INFO: renamed from: X */
    public static C0005A4 m2X() {
        if (f2g == null) goto L7;
        return f2g;
    L7:
        monitor-enter(C0005A4.class);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (f2g != null) goto L13;
        f2g = new C0005A4();     // Catch: Throwable -> L11
    L13:
        monitor-exit(C0005A4.class);     // Catch: Throwable -> L11
        return f2g;
    }
}
