package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class i8 extends vg implements ld, qe {
    public static final AtomicIntegerFieldUpdater f = null;
    public static final AtomicReferenceFieldUpdater g = null;
    public static final AtomicReferenceFieldUpdater h = null;
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final ld d;
    public final ge e;

    static {
        f = AtomicIntegerFieldUpdater.newUpdater(i8.class, "_decisionAndIndex");
        g = AtomicReferenceFieldUpdater.newUpdater(i8.class, Object.class, "_state");
        h = AtomicReferenceFieldUpdater.newUpdater(i8.class, Object.class, "_parentHandle");
    }

    public i8(ld r2) {
        super(1);
        this.d = r2;
        this.e = r2.d();
        this._decisionAndIndex = 536870911;
        this._state = o1.a;
    }

    public static void p(ah r3, Object r4) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + r3 + ", already has " + r4).toString());
    }

    public static void r(i8 r6, Object r7, int r8) {
    L2:
        AtomicReferenceFieldUpdater r0 = g;
        Object r1 = r0.get(r6);
        if ((r1 instanceof ow) == false) goto L32;
        ow r2 = (ow) r1;
        if ((r7 instanceof nb) == false) goto L7;
    L6:
        Object r22 = r7;
    L19:
        if (r0.compareAndSet(r6, r1, r22) == true) goto L21;
        if (r0.get(r6) == r1) goto L19;
    L21:
        if (r6.o() == true) goto L26;
        AtomicReferenceFieldUpdater r72 = h;
        zg r02 = (zg) r72.get(r6);
        if (r02 == null) goto L26;
        r02.b();
        r72.set(r6, nw.a);
    L26:
        r6.l(r8);
        return;
    L7:
        if (r8 == 1) goto L11;
        if (r8 != 2) goto L6;
    L11:
        if ((r2 instanceof ah) == false) goto L6;
        CancellationException r5 = null;
        if ((r2 instanceof ah) == false) goto L16;
        ah r23 = (ah) r2;
    L17:
        r22 = new lb(r7, r23, r5, 16);
        goto L19
    L16:
        r23 = null;
        goto L17
    L32:
        if ((r1 instanceof l8) == false) goto L37;
        if (l8.c.compareAndSet((l8) r1, 0, 1) == false) goto L37;
        return;
    L37:
        throw new IllegalStateException(("Already resumed, but proposed with update " + r7).toString());
    }

    @Override // defpackage.vg
    public final void a(Object r5, CancellationException r6) {
    L2:
        AtomicReferenceFieldUpdater r52 = g;
        Object r0 = r52.get(this);
        if ((r0 instanceof ow) == true) goto L37;
        if ((r0 instanceof nb) == true) goto L53;
        ah r2 = null;
        if ((r0 instanceof lb) == true) goto L9;
        lb r1 = new lb(r0, r2, r6, 14);
    L31:
        if (r52.compareAndSet(this, r0, r1) == true) goto L54;
        if (r52.get(this) == r0) goto L31;
    L54:
        return;
    L9:
        lb r12 = (lb) r0;
        if (r12.e != null) goto L28;
        lb r22 = lb.a(r12, null, r6, 15);
    L13:
        if (r52.compareAndSet(this, r0, r22) == true) goto L14;
        if (r52.get(this) == r0) goto L13;
    L14:
        ah r53 = r12.b;
        if (r53 == null) goto L17;
        j(r53, r6);
    L17:
        sm r54 = r12.c;
        if (r54 != null) goto L38;
        return;
    L38:
        r54.f(r6);     // Catch: Throwable -> L21
        return;
    L21:
        th = move-exception;
        ff.u(this.e, new pb("Exception in resume onCancellation handler for " + this, th));
        return;
    L28:
        throw new IllegalStateException("Must be called at most once");
    L53:
        return;
    L37:
        throw new IllegalStateException("Not completed");
    }

    @Override // defpackage.vg
    public final ld b() {
        return this.d;
    }

    @Override // defpackage.qe
    public final qe c() {
        ld r0 = this.d;
        if ((r0 instanceof qe) == true) goto L5;
        return null;
    L5:
        return (qe) r0;
    }

    @Override // defpackage.ld
    public final ge d() {
        return this.e;
    }

    @Override // defpackage.vg
    public final Throwable e(Object r1) {
        Throwable r12 = super.e(r1);
        if (r12 == null) goto L5;
        return r12;
    L5:
        return null;
    }

    @Override // defpackage.ld
    public final void f(Object r3) {
        Throwable r0 = f10.a(r3);
        if (r0 == null) goto L6;
        r3 = new nb(r0, false);
    L6:
        r(this, r3, this.c);
    }

    @Override // defpackage.vg
    public final Object g(Object r2) {
        if ((r2 instanceof lb) == true) goto L5;
        return r2;
    L5:
        return ((lb) r2).a;
    }

    @Override // defpackage.vg
    public final Object i() {
        return g.get(this);
    }

    public final void j(ah r3, Throwable r4) {
        r3.a(r4);     // Catch: Throwable -> L4
        return;
    L4:
        th = move-exception;
        ff.u(this.e, new pb("Exception in invokeOnCancellation handler for " + this, th));
    }

    public final void k(Throwable r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = g;
        Object r1 = r0.get(this);
        if ((r1 instanceof ow) == false) goto L4;
        l8 r2 = new l8(this, r5, r1 instanceof ah);
    L7:
        if (r0.compareAndSet(this, r1, r2) == true) goto L9;
        if (r0.get(this) == r1) goto L7;
    L9:
        if ((((ow) r1) instanceof ah) == false) goto L12;
        j((ah) r1, r5);
    L12:
        if (o() == true) goto L17;
        AtomicReferenceFieldUpdater r52 = h;
        zg r02 = (zg) r52.get(this);
        if (r02 == null) goto L17;
        r02.b();
        r52.set(this, nw.a);
    L17:
        l(this.c);
        return;
    }

    public final void l(int r7) {
    L2:
        AtomicIntegerFieldUpdater r0 = f;
        int r1 = r0.get(this);
        int r2 = r1 >> 29;
        if (r2 != 0) goto L5;
        if (r0.compareAndSet(this, r1, 1073741824 + (536870911 & r1)) == false) goto L2;
        return;
    L5:
        if (r2 != 1) goto L51;
        boolean r22 = false;
        if (r7 != 4) goto L9;
        boolean r12 = true;
    L10:
        ld r3 = this.d;
        if (r12 == false) goto L13;
    L48:
        ip.S(this, r3, r12);
        return;
    L13:
        if ((r3 instanceof tg) == false) goto L48;
        if (r7 == 1) goto L19;
        if (r7 == 2) goto L19;
        boolean r72 = false;
    L20:
        int r5 = this.c;
        if (r5 == 1) goto L23;
        if (r5 == 2) goto L23;
    L24:
        if (r72 != r22) goto L48;
        tg r73 = (tg) r3;
        ke r13 = r73.d;
        ge r74 = r73.e.b;
        ip.l(r74);
        if (r13.e() == false) goto L29;
        r13.d(r74, this);
        return;
    L29:
        kj r75 = t60.a();
        if (r75.c < 4294967296L) goto L36;
        k6 r02 = r75.e;
        if (r02 != null) goto L34;
        r02 = new k6();
        r75.e = r02;
    L34:
        r02.addLast(this);
        return;
    L36:
        r75.k(true);
        ip.S(this, r3, true);     // Catch: Throwable -> L41
    L38:
        if (r75.l() == true) goto L38;
    L40:
        r75.f();
        return;
    L41:
        th = move-exception;
        h(th, null);     // Catch: Throwable -> L45
    L45:
        th = move-exception;
        r75.f();
        throw th;
    L23:
        r22 = true;
    L19:
        r72 = true;
        goto L20
    L9:
        r12 = false;
        goto L10
    L51:
        throw new IllegalStateException("Already resumed");
    }

    public final zg m() {
        mp r0 = (mp) this.e.b(vh.h);
        if (r0 != null) goto L5;
        return null;
    L5:
        zg r02 = a80.p(r0, new ca(this), 2);
    L6:
        AtomicReferenceFieldUpdater r2 = h;
        if (r2.compareAndSet(this, null, r02) == true) goto L11;
        if (r2.get(this) == null) goto L6;
    L11:
        return r02;
    }

    public final void n(sm r7) {
        if ((r7 instanceof ah) == false) goto L5;
        ah r72 = (ah) r7;
    L6:
        AtomicReferenceFieldUpdater r0 = g;
        Object r1 = r0.get(this);
        if ((r1 instanceof o1) == true) goto L9;
        CancellationException r3 = null;
        if ((r1 instanceof ah) == true) goto L50;
        if ((r1 instanceof nb) == true) goto L18;
        if ((r1 instanceof lb) == true) goto L28;
        lb r2 = new lb(r1, r72, r3, 28);
    L45:
        if (r0.compareAndSet(this, r1, r2) == true) goto L73;
        if (r0.get(this) == r1) goto L45;
    L73:
        return;
    L28:
        lb r22 = (lb) r1;
        if (r22.b != null) goto L41;
        Throwable r4 = r22.e;
        if (r4 != null) goto L32;
        lb r23 = lb.a(r22, r72, null, 29);
    L36:
        if (r0.compareAndSet(this, r1, r23) == true) goto L72;
        if (r0.get(this) == r1) goto L36;
    L72:
        return;
    L32:
        j(r72, r4);
        return;
    L41:
        p(r72, r1);
        throw null;
    L18:
        nb r02 = (nb) r1;
        if (nb.b.compareAndSet(r02, 0, 1) == true) goto L21;
        p(r72, r1);
        throw null;
    L21:
        if ((r1 instanceof l8) == false) goto L46;
        j(r72, r02.a);
        return;
    L46:
        return;
    L50:
        p(r72, r1);
        throw null;
    L9:
        if (r0.compareAndSet(this, r1, r72) == true) goto L71;
        if (r0.get(this) == r1) goto L9;
    L71:
        return;
    L5:
        r72 = new ah(1, r7);
        goto L6
    }

    public final boolean o() {
        if (this.c != 2) goto L8;
        ld r1 = this.d;
        ip.m("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", r1);
        AtomicReferenceFieldUpdater r0 = tg.h;
        if (r0.get((tg) r1) == null) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final void q() {
        ld r0 = this.d;
        Throwable r2 = null;
        if ((r0 instanceof tg) == false) goto L5;
        tg r02 = (tg) r0;
    L6:
        if (r02 == null) goto L36;
        AtomicReferenceFieldUpdater r1 = tg.h;
    L8:
        Object r3 = r1.get(r02);
        l0 r4 = a80.e;
        if (r3 != r4) goto L17;
    L11:
        if (r1.compareAndSet(r02, r4, this) == true) goto L21;
        if (r1.get(r02) == r4) goto L11;
    L21:
        if (r2 == null) goto L44;
        AtomicReferenceFieldUpdater r03 = h;
        zg r12 = (zg) r03.get(this);
        if (r12 == null) goto L27;
        r12.b();
        r03.set(this, nw.a);
    L27:
        k(r2);
        return;
    L44:
        return;
    L17:
        if ((r3 instanceof Throwable) == false) goto L35;
    L19:
        if (r1.compareAndSet(r02, r3, null) == true) goto L20;
        if (r1.get(r02) == r3) goto L19;
        throw new IllegalArgumentException("Failed requirement.");
    L20:
        r2 = (Throwable) r3;
        goto L21
    L35:
        throw new IllegalStateException(("Inconsistent state " + r3).toString());
    L36:
        return;
    L5:
        r02 = null;
        goto L6
    }

    public final void s(ke r5) {
        vh r0 = vh.n;
        ld r1 = this.d;
        ke r3 = null;
        if ((r1 instanceof tg) == false) goto L5;
        tg r12 = (tg) r1;
    L6:
        if (r12 == null) goto L8;
        r3 = r12.d;
    L8:
        if (r3 != r5) goto L10;
        int r52 = 4;
    L11:
        r(this, r0, r52);
        return;
    L10:
        r52 = this.c;
        goto L11
    L5:
        r12 = null;
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("CancellableContinuation(");
        r0.append(ff.T(this.d));
        r0.append("){");
        Object r1 = g.get(this);
        if ((r1 instanceof ow) == false) goto L6;
        String r12 = "Active";
    L9:
        r0.append(r12);
        r0.append("}@");
        r0.append(ff.s(this));
        return r0.toString();
    L6:
        if ((r1 instanceof l8) == false) goto L8;
        r12 = "Cancelled";
        goto L9
    L8:
        r12 = "Completed";
        goto L9
    }
}
