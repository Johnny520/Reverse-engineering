package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class nb {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;
    private volatile int _handled;
    public final java.lang.Throwable a;

    static {
            java.lang.Class<nb> r0 = defpackage.nb.class
            java.lang.String r1 = "_handled"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.nb.b = r0
            return
    }

    public nb(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0._handled = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.Throwable r1 = r2.a
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
