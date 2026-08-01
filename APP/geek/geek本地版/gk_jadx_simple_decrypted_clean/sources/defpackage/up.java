package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class up implements vo {
    public static final AtomicIntegerFieldUpdater b = null;
    public static final AtomicReferenceFieldUpdater c = null;
    public static final AtomicReferenceFieldUpdater d = null;
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting;
    private volatile Object _rootCause;
    public final mw a;

    static {
        b = AtomicIntegerFieldUpdater.newUpdater(up.class, "_isCompleting");
        c = AtomicReferenceFieldUpdater.newUpdater(up.class, Object.class, "_rootCause");
        d = AtomicReferenceFieldUpdater.newUpdater(up.class, Object.class, "_exceptionsHolder");
    }

    public up(mw r1, Throwable r2) {
        this.a = r1;
        this._isCompleting = 0;
        this._rootCause = r2;
    }

    @Override // defpackage.vo
    public final boolean a() {
        if (c() != null) goto L6;
        return true;
    L6:
        return false;
    }

    public final void b(Throwable r5) {
        Throwable r0 = c();
        if (r0 != null) goto L6;
        c.set(this, r5);
        return;
    L6:
        if (r5 == r0) goto L24;
        AtomicReferenceFieldUpdater r02 = d;
        Object r1 = r02.get(this);
        if (r1 != null) goto L13;
        r02.set(this, r5);
        return;
    L13:
        if ((r1 instanceof Throwable) == false) goto L19;
        if (r5 != r1) goto L16;
        return;
    L16:
        ArrayList r2 = new ArrayList(4);
        r2.add(r1);
        r2.add(r5);
        r02.set(this, r2);
        return;
    L19:
        if ((r1 instanceof ArrayList) == false) goto L23;
        ((ArrayList) r1).add(r5);
        return;
    L23:
        throw new IllegalStateException(("State is " + r1).toString());
    }

    public final Throwable c() {
        return (Throwable) c.get(this);
    }

    @Override // defpackage.vo
    public final mw d() {
        return this.a;
    }

    public final boolean e() {
        if (c() == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean f() {
        if (b.get(this) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final ArrayList g(Throwable r5) {
        AtomicReferenceFieldUpdater r0 = d;
        Object r1 = r0.get(this);
        if (r1 != null) goto L6;
        ArrayList r12 = new ArrayList(4);
    L11:
        Throwable r2 = c();
        if (r2 == null) goto L14;
        r12.add(0, r2);
    L14:
        if (r5 != null) goto L16;
    L18:
        r0.set(this, ip.j);
        return r12;
    L16:
        if (r5.equals(r2) == true) goto L18;
        r12.add(r5);
        goto L18
    L6:
        if ((r1 instanceof Throwable) == false) goto L9;
        ArrayList r3 = new ArrayList(4);
        r3.add(r1);
        r12 = r3;
        goto L11
    L9:
        if ((r1 instanceof ArrayList) == false) goto L21;
        r12 = (ArrayList) r1;
        goto L11
    L21:
        throw new IllegalStateException(("State is " + r1).toString());
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + d.get(this) + ", list=" + this.a + ']';
    }
}
