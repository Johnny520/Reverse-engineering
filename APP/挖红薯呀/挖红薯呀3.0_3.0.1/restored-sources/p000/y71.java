package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y71 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f7566a = new ThreadLocal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static AbstractC0030at m5216a() {
        ThreadLocal threadLocal = f7566a;
        AbstractC0030at abstractC0030at = (AbstractC0030at) threadLocal.get();
        if (abstractC0030at != null) {
            return abstractC0030at;
        }
        C0505na c0505na = new C0505na(Thread.currentThread());
        threadLocal.set(c0505na);
        return c0505na;
    }
}
