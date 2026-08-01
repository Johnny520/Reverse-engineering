package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l8 extends defpackage.nb {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater c = null;
    private volatile int _resumed;

    static {
            java.lang.Class<l8> r0 = defpackage.l8.class
            java.lang.String r1 = "_resumed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.l8.c = r0
            return
    }

    public l8(defpackage.i8 r1, java.lang.Throwable r2, boolean r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r1 = 0
            r0._resumed = r1
            return
    }
}
