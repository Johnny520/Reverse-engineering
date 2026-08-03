package p000;

/* JADX INFO: renamed from: A4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0005A4 extends AbstractC1293cr {

    /* JADX INFO: renamed from: g */
    public static volatile C0005A4 f2g;

    /* JADX INFO: renamed from: f */
    public final C2370pd f3f = new C2370pd();

    /* JADX INFO: renamed from: X */
    public static C0005A4 m2X() {
        if (f2g != null) {
            return f2g;
        }
        synchronized (C0005A4.class) {
            try {
                if (f2g == null) {
                    f2g = new C0005A4();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2g;
    }
}
