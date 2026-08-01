package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class sp extends vr implements zg, vo, sm {
    public wp d;

    @Override // defpackage.vo
    public final boolean a() {
        return true;
    }

    @Override // defpackage.zg
    public final void b() {
        wp r0 = k();
    L3:
        Object r1 = r0.x();
        if ((r1 instanceof sp) == false) goto L15;
        if (r1 != this) goto L47;
        AtomicReferenceFieldUpdater r2 = wp.a;
        ui r3 = ip.l;
    L9:
        if (r2.compareAndSet(r0, r1, r3) == true) goto L48;
        if (r2.get(r0) == r1) goto L9;
    L48:
        return;
    L47:
        return;
    L15:
        if ((r1 instanceof vo) == true) goto L17;
        return;
    L17:
        if (((vo) r1).d() == null) goto L46;
    L18:
        Object r02 = h();
        if ((r02 instanceof m00) == true) goto L49;
        if (r02 == this) goto L22;
        ip.m("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", r02);
        vr r12 = (vr) r02;
        AtomicReferenceFieldUpdater r22 = vr.c;
        m00 r32 = (m00) r22.get(r12);
        if (r32 != null) goto L27;
        r32 = new m00(r12);
        r22.lazySet(r12, r32);
    L27:
        AtomicReferenceFieldUpdater r23 = vr.a;
        if (r23.compareAndSet(this, r02, r32) == true) goto L29;
        if (r23.get(this) == r02) goto L27;
    L29:
        r12.e();
        return;
    L22:
        vr r03 = (vr) r02;
        return;
    L49:
        return;
    }

    @Override // defpackage.vo
    public final mw d() {
        return null;
    }

    public final wp k() {
        wp r0 = this.d;
        if (r0 == null) goto L5;
        return r0;
    L5:
        pb r02 = new pb("lateinit property job has not been initialized");
        ip.U(r02, ip.class.getName());
        throw r02;
    }

    public abstract void l(Throwable r1);

    @Override // defpackage.vr
    public final String toString() {
        return getClass().getSimpleName() + '@' + ff.s(this) + "[job@" + ff.s(k()) + ']';
    }
}
