package p160f3;

/* JADX INFO: renamed from: f3.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2144k0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f7083a = new ThreadLocal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static AbstractC2109L m3973a() {
        ThreadLocal threadLocal = f7083a;
        AbstractC2109L abstractC2109L = (AbstractC2109L) threadLocal.get();
        if (abstractC2109L != null) {
            return abstractC2109L;
        }
        C2129d c2129d = new C2129d(Thread.currentThread());
        threadLocal.set(c2129d);
        return c2129d;
    }
}
