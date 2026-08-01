package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class s6 extends dx {
    public static final AtomicReferenceFieldUpdater a = null;
    private volatile Object _consensus;

    static {
        a = AtomicReferenceFieldUpdater.newUpdater(s6.class, Object.class, "_consensus");
    }

    public s6() {
        this._consensus = ip.a;
    }

    @Override // defpackage.dx
    public final Object a(Object r5) {
        AtomicReferenceFieldUpdater r0 = a;
        Object r1 = r0.get(this);
        l0 r2 = ip.a;
        if (r1 != r2) goto L13;
        l0 r3 = c(r5);
        r1 = r0.get(this);
        if (r1 != r2) goto L13;
    L8:
        if (r0.compareAndSet(this, r2, r3) == true) goto L9;
        if (r0.get(this) == r2) goto L8;
        r1 = r0.get(this);
        goto L13
    L9:
        r1 = r3;
    L13:
        b(r5, r1);
        return r1;
    }

    public abstract void b(Object r1, Object r2);

    public abstract l0 c(Object r1);
}
