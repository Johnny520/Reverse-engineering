package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class sp extends defpackage.vr implements defpackage.zg, defpackage.vo, defpackage.sm {
    public defpackage.wp d;

    @Override // defpackage.vo
    public final boolean a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.zg
    public final void b() {
            r5 = this;
            wp r0 = r5.k()
        L4:
            java.lang.Object r1 = r0.x()
            boolean r2 = r1 instanceof defpackage.sp
            if (r2 == 0) goto L21
            if (r1 == r5) goto Lf
            goto L68
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.wp.a
            ui r3 = defpackage.ip.l
        L13:
            boolean r4 = r2.compareAndSet(r0, r1, r3)
            if (r4 == 0) goto L1a
            goto L68
        L1a:
            java.lang.Object r4 = r2.get(r0)
            if (r4 == r1) goto L13
            goto L4
        L21:
            boolean r0 = r1 instanceof defpackage.vo
            if (r0 == 0) goto L68
            vo r1 = (defpackage.vo) r1
            mw r0 = r1.d()
            if (r0 == 0) goto L68
        L2d:
            java.lang.Object r0 = r5.h()
            boolean r1 = r0 instanceof defpackage.m00
            if (r1 == 0) goto L36
            goto L68
        L36:
            if (r0 != r5) goto L3b
            vr r0 = (defpackage.vr) r0
            return
        L3b:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            defpackage.ip.m(r1, r0)
            r1 = r0
            vr r1 = (defpackage.vr) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.vr.c
            java.lang.Object r3 = r2.get(r1)
            m00 r3 = (defpackage.m00) r3
            if (r3 != 0) goto L55
            m00 r3 = new m00
            r3.<init>(r1)
            r2.lazySet(r1, r3)
        L55:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.vr.a
            boolean r4 = r2.compareAndSet(r5, r0, r3)
            if (r4 == 0) goto L61
            r1.e()
            return
        L61:
            java.lang.Object r2 = r2.get(r5)
            if (r2 == r0) goto L55
            goto L2d
        L68:
            return
    }

    @Override // defpackage.vo
    public final defpackage.mw d() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final defpackage.wp k() {
            r2 = this;
            wp r0 = r2.d
            if (r0 == 0) goto L5
            return r0
        L5:
            pb r0 = new pb
            java.lang.String r1 = "lateinit property job has not been initialized"
            r0.<init>(r1)
            java.lang.Class<ip> r1 = defpackage.ip.class
            java.lang.String r1 = r1.getName()
            defpackage.ip.U(r0, r1)
            throw r0
    }

    public abstract void l(java.lang.Throwable r1);

    @Override // defpackage.vr
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = defpackage.ff.s(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            wp r1 = r2.k()
            java.lang.String r1 = defpackage.ff.s(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
