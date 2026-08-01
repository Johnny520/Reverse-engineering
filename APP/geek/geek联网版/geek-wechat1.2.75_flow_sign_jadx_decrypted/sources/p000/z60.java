package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class z60 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f5555a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static AbstractC0487mj m2797a() {
        ThreadLocal threadLocal = f5555a;
        AbstractC0487mj abstractC0487mj = (AbstractC0487mj) threadLocal.get();
        if (abstractC0487mj != null) {
            return abstractC0487mj;
        }
        C0883x7 c0883x7 = new C0883x7(Thread.currentThread());
        threadLocal.set(c0883x7);
        return c0883x7;
    }
}
