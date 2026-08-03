package p000;

/* JADX INFO: renamed from: aB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1129aB {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f3579a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static AbstractC2588ug m2050a() {
        ThreadLocal threadLocal = f3579a;
        AbstractC2588ug abstractC2588ug = (AbstractC2588ug) threadLocal.get();
        if (abstractC2588ug != null) {
            return abstractC2588ug;
        }
        C0694Q5 c0694q5 = new C0694Q5(Thread.currentThread());
        threadLocal.set(c0694q5);
        return c0694q5;
    }
}
