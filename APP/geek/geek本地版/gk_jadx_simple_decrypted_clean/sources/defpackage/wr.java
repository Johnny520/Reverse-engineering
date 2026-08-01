package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class wr {
    public static final AtomicReferenceFieldUpdater a = null;
    private volatile Object _cur;

    static {
        a = AtomicReferenceFieldUpdater.newUpdater(wr.class, Object.class, "_cur");
    }

    public wr() {
        this._cur = new yr(8, false);
    }

    public final boolean a(Runnable r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = a;
        yr r1 = (yr) r0.get(this);
        int r2 = r1.a(r5);
        if (r2 == 0) goto L17;
        if (r2 != 1) goto L6;
        yr r22 = r1.c();
    L12:
        if (r0.compareAndSet(this, r1, r22) == true) goto L2;
        if (r0.get(this) == r1) goto L12;
    L6:
        if (r2 != 2) goto L2;
        return false;
    L17:
        return true;
    }

    public final void b() {
    L2:
        AtomicReferenceFieldUpdater r0 = a;
        yr r1 = (yr) r0.get(this);
        if (r1.b() == true) goto L4;
        yr r2 = r1.c();
    L7:
        if (r0.compareAndSet(this, r1, r2) == true) goto L2;
        if (r0.get(this) == r1) goto L7;
    }

    public final int c() {
        yr r0 = (yr) a.get(this);
        r0.getClass();
        long r02 = yr.f.get(r0);
        int r2 = (int) (1073741823 & r02);
        return (((int) ((r02 & 1152921503533105152L) >> 30)) - r2) & 1073741823;
    }

    public final Object d() {
    L2:
        AtomicReferenceFieldUpdater r0 = a;
        yr r1 = (yr) r0.get(this);
        Object r2 = r1.d();
        if (r2 != yr.g) goto L4;
        yr r22 = r1.c();
    L7:
        if (r0.compareAndSet(this, r1, r22) == true) goto L2;
        if (r0.get(this) == r1) goto L7;
    L4:
        return r2;
    }
}
