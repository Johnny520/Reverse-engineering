package p000a;

/* JADX INFO: renamed from: a.C1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0040C1 extends AbstractC0472a2 {

    /* JADX INFO: renamed from: b */
    public static volatile C0040C1 f156b;

    /* JADX INFO: renamed from: a */
    public final C0312R4 f157a = new C0312R4();

    /* JADX INFO: renamed from: g */
    public static C0040C1 m122g() {
        if (f156b != null) {
            return f156b;
        }
        synchronized (C0040C1.class) {
            try {
                if (f156b == null) {
                    f156b = new C0040C1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f156b;
    }
}
