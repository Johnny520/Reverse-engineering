package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t60 {
    public static final ThreadLocal a = null;

    static {
        a = new ThreadLocal();
    }

    public static kj a() {
        ThreadLocal r0 = a;
        kj r1 = (kj) r0.get();
        if (r1 != null) goto L6;
        n7 r12 = new n7(Thread.currentThread());
        r0.set(r12);
        return r12;
    L6:
        return r1;
    }
}
