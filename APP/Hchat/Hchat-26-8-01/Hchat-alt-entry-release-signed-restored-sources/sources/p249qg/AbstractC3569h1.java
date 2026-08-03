package p249qg;

/* JADX INFO: renamed from: qg.h1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3569h1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f11575a = new ThreadLocal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static AbstractC3565g0 m7527a() {
        ThreadLocal threadLocal = f11575a;
        AbstractC3565g0 abstractC3565g0 = (AbstractC3565g0) threadLocal.get();
        if (abstractC3565g0 != null) {
            return abstractC3565g0;
        }
        C3555d c3555d = new C3555d(Thread.currentThread());
        threadLocal.set(c3555d);
        return c3555d;
    }
}
