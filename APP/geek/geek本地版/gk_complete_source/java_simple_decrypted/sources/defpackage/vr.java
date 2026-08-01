package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class vr {
    public static final AtomicReferenceFieldUpdater a = null;
    public static final AtomicReferenceFieldUpdater b = null;
    public static final AtomicReferenceFieldUpdater c = null;
    private volatile Object _next;
    private volatile Object _prev;
    private volatile Object _removedRef;

    static {
        a = AtomicReferenceFieldUpdater.newUpdater(vr.class, Object.class, "_next");
        b = AtomicReferenceFieldUpdater.newUpdater(vr.class, Object.class, "_prev");
        c = AtomicReferenceFieldUpdater.newUpdater(vr.class, Object.class, "_removedRef");
    }

    public vr() {
        this._next = this;
        this._prev = this;
    }

    public final vr e() {
    L2:
        AtomicReferenceFieldUpdater r0 = b;
        vr r1 = (vr) r0.get(this);
        vr r3 = r1;
    L3:
        vr r4 = null;
    L4:
        AtomicReferenceFieldUpdater r5 = a;
        Object r6 = r5.get(r3);
        if (r6 == this) goto L6;
        if (j() == true) goto L16;
        if (r6 == null) goto L18;
        if ((r6 instanceof dx) == true) goto L21;
        if ((r6 instanceof m00) == true) goto L24;
        ip.m("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", r6);
        r4 = r3;
        r3 = (vr) r6;
        goto L4
    L24:
        if (r4 != null) goto L25;
        r3 = (vr) r0.get(r3);
        goto L4
    L25:
        vr r62 = ((m00) r6).a;
    L27:
        if (r5.compareAndSet(r4, r3, r62) == true) goto L28;
        if (r5.get(r4) == r3) goto L27;
    L28:
        r3 = r4;
        goto L3
    L21:
        ((dx) r6).a(r3);
    L18:
        return r3;
    L16:
        return null;
    L6:
        if (r1 == r3) goto L18;
    L9:
        if (r0.compareAndSet(this, r1, r3) == true) goto L18;
        if (r0.get(this) == r1) goto L9;
        goto L2
    }

    public final void g(vr r4) {
    L2:
        AtomicReferenceFieldUpdater r0 = b;
        vr r1 = (vr) r0.get(r4);
        if (h() != r4) goto L19;
    L6:
        if (r0.compareAndSet(r4, r1, this) == true) goto L8;
        if (r0.get(r4) == r1) goto L6;
    L8:
        if (j() == false) goto L18;
        r4.e();
        return;
    L18:
        return;
    }

    public final Object h() {
    L2:
        Object r0 = a.get(this);
        if ((r0 instanceof dx) == false) goto L4;
        ((dx) r0).a(this);
        goto L2
    L4:
        return r0;
    }

    public final vr i() {
        Object r0 = h();
        if ((r0 instanceof m00) == false) goto L5;
        m00 r1 = (m00) r0;
    L6:
        if (r1 == null) goto L11;
        vr r12 = r1.a;
        if (r12 == null) goto L11;
        return r12;
    L11:
        ip.m("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", r0);
        return (vr) r0;
    L5:
        r1 = null;
        goto L6
    }

    public boolean j() {
        return h() instanceof m00;
    }

    public String toString() {
        return new ur(this) + '@' + ff.s(this);
    }
}
