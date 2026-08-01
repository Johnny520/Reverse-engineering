package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class vr {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = null;
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = null;
    private volatile java.lang.Object _next;
    private volatile java.lang.Object _prev;
    private volatile java.lang.Object _removedRef;

    static {
            java.lang.String r0 = "_next"
            java.lang.Class<vr> r1 = defpackage.vr.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.vr.a = r0
            java.lang.String r0 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.vr.b = r0
            java.lang.String r0 = "_removedRef"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.vr.c = r0
            return
    }

    public vr() {
            r0 = this;
            r0.<init>()
            r0._next = r0
            r0._prev = r0
            return
    }

    public final defpackage.vr e() {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vr.b
            java.lang.Object r1 = r0.get(r9)
            vr r1 = (defpackage.vr) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.vr.a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L2d
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            goto L2d
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.j()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            return r3
        L2e:
            boolean r7 = r6 instanceof defpackage.dx
            if (r7 == 0) goto L38
            dx r6 = (defpackage.dx) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof defpackage.m00
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            m00 r6 = (defpackage.m00) r6
            vr r6 = r6.a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            vr r3 = (defpackage.vr) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            defpackage.ip.m(r4, r6)
            r4 = r6
            vr r4 = (defpackage.vr) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
    }

    public final void g(defpackage.vr r4) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vr.b
            java.lang.Object r1 = r0.get(r4)
            vr r1 = (defpackage.vr) r1
            java.lang.Object r2 = r3.h()
            if (r2 == r4) goto Lf
            goto L1e
        Lf:
            boolean r2 = r0.compareAndSet(r4, r1, r3)
            if (r2 == 0) goto L1f
            boolean r0 = r3.j()
            if (r0 == 0) goto L1e
            r4.e()
        L1e:
            return
        L1f:
            java.lang.Object r2 = r0.get(r4)
            if (r2 == r1) goto Lf
            goto L0
    }

    public final java.lang.Object h() {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vr.a
            java.lang.Object r0 = r0.get(r2)
            boolean r1 = r0 instanceof defpackage.dx
            if (r1 != 0) goto Lb
            return r0
        Lb:
            dx r0 = (defpackage.dx) r0
            r0.a(r2)
            goto L0
    }

    public final defpackage.vr i() {
            r2 = this;
            java.lang.Object r0 = r2.h()
            boolean r1 = r0 instanceof defpackage.m00
            if (r1 == 0) goto Lc
            r1 = r0
            m00 r1 = (defpackage.m00) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L15
            vr r1 = r1.a
            if (r1 != 0) goto L14
            goto L15
        L14:
            return r1
        L15:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            defpackage.ip.m(r1, r0)
            vr r0 = (defpackage.vr) r0
            return r0
    }

    public boolean j() {
            r1 = this;
            java.lang.Object r0 = r1.h()
            boolean r0 = r0 instanceof defpackage.m00
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ur r1 = new ur
            r1.<init>(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = defpackage.ff.s(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
