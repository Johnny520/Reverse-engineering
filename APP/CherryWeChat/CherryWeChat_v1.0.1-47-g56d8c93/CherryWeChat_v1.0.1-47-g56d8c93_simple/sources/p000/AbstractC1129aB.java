package p000;

/* JADX INFO: renamed from: aB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1129aB {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f3579a = null;

    static {
        f3579a = new ThreadLocal();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC2588ug m2050a() {
        ThreadLocal r0 = f3579a;
        AbstractC2588ug r1 = (AbstractC2588ug) r0.get();
        if (r1 != null) goto L6;
        C0694Q5 r12 = new C0694Q5(Thread.currentThread());
        r0.set(r12);
        return r12;
    L6:
        return r1;
    }
}
