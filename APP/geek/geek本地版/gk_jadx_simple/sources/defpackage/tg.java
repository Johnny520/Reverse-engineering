package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class tg extends vg implements qe, ld {
    public static final AtomicReferenceFieldUpdater h = null;
    private volatile Object _reusableCancellableContinuation;
    public final ke d;
    public final m50 e;
    public Object f;
    public final Object g;

    static {
        h = AtomicReferenceFieldUpdater.newUpdater(tg.class, Object.class, "_reusableCancellableContinuation");
    }

    public tg(ke r2, m50 r3) {
        super(-1);
        this.d = r2;
        this.e = r3;
        this.f = a80.d;
        ge r22 = r3.b;
        ip.l(r22);
        Object r23 = r22.h(0, he.e);
        ip.l(r23);
        this.g = r23;
    }

    @Override // defpackage.vg
    public final void a(Object r1, CancellationException r2) {
        if ((r1 instanceof ob) == true) goto L6;
        return;
    L6:
        throw null;
    }

    @Override // defpackage.qe
    public final qe c() {
        m50 r0 = this.e;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return null;
    }

    @Override // defpackage.ld
    public final ge d() {
        ge r0 = this.e.b;
        ip.l(r0);
        return r0;
    }

    @Override // defpackage.ld
    public final void f(Object r10) {
        m50 r0 = this.e;
        ge r1 = r0.b;
        ip.l(r1);
        Throwable r2 = f10.a(r10);
        if (r2 != null) goto L5;
        Object r4 = r10;
    L6:
        ke r22 = this.d;
        if (r22.e() == false) goto L10;
        this.f = r4;
        this.c = 0;
        r22.d(r1, this);
        return;
    L10:
        kj r12 = t60.a();
        if (r12.c < 4294967296L) goto L17;
        this.f = r4;
        this.c = 0;
        k6 r102 = r12.e;
        if (r102 != null) goto L15;
        r102 = new k6();
        r12.e = r102;
    L15:
        r102.addLast(this);
        return;
    L17:
        r12.k(true);
        ge r23 = r0.b;     // Catch: Throwable -> L24
        ip.l(r23);     // Catch: Throwable -> L24
        Object r3 = ff.V(r23, this.g);     // Catch: Throwable -> L24
        r0.f(r10);     // Catch: Throwable -> L26
        ff.L(r23, r3);     // Catch: Throwable -> L24
    L22:
        if (r12.l() == true) goto L22;
    L23:
        r12.f();
        return;
    L26:
        th = move-exception;
        ff.L(r23, r3);     // Catch: Throwable -> L24
        throw th;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        h(th, null);     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        r12.f();
        throw th;
    L5:
        r4 = new nb(r2, false);
        goto L6
    }

    @Override // defpackage.vg
    public final Object i() {
        Object r0 = this.f;
        this.f = a80.d;
        return r0;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + ff.T(this.e) + ']';
    }

    @Override // defpackage.vg
    public final ld b() {
        return this;
    }
}
