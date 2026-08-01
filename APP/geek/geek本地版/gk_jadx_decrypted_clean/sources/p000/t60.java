package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class t60 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4515a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static AbstractC0413kj m2362a() {
        ThreadLocal threadLocal = f4515a;
        AbstractC0413kj abstractC0413kj = (AbstractC0413kj) threadLocal.get();
        if (abstractC0413kj != null) {
            return abstractC0413kj;
        }
        C0512n7 c0512n7 = new C0512n7(Thread.currentThread());
        threadLocal.set(c0512n7);
        return c0512n7;
    }
}
