package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ca extends defpackage.op {
    public final defpackage.i8 e;

    public ca(defpackage.i8 r1) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            return
    }

    @Override // defpackage.sm
    public final /* bridge */ /* synthetic */ java.lang.Object f(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.l(r1)
            vh r1 = defpackage.vh.n
            return r1
    }

    @Override // defpackage.sp
    public final void l(java.lang.Throwable r7) {
            r6 = this;
            wp r7 = r6.k()
            java.util.concurrent.CancellationException r7 = r7.t()
            i8 r0 = r6.e
            boolean r1 = r0.o()
            if (r1 != 0) goto L11
            goto L42
        L11:
            ld r1 = r0.d
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            defpackage.ip.m(r2, r1)
            tg r1 = (defpackage.tg) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.tg.h
        L1c:
            java.lang.Object r3 = r2.get(r1)
            l0 r4 = defpackage.a80.e
            boolean r5 = defpackage.ip.i(r3, r4)
            if (r5 == 0) goto L36
        L28:
            boolean r3 = r2.compareAndSet(r1, r4, r7)
            if (r3 == 0) goto L2f
            goto L5e
        L2f:
            java.lang.Object r3 = r2.get(r1)
            if (r3 == r4) goto L28
            goto L1c
        L36:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L3b
            goto L5e
        L3b:
            r4 = 0
            boolean r4 = r2.compareAndSet(r1, r3, r4)
            if (r4 == 0) goto L5f
        L42:
            r0.k(r7)
            boolean r7 = r0.o()
            if (r7 != 0) goto L5e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.i8.h
            java.lang.Object r1 = r7.get(r0)
            zg r1 = (defpackage.zg) r1
            if (r1 != 0) goto L56
            goto L5e
        L56:
            r1.b()
            nw r1 = defpackage.nw.a
            r7.set(r0, r1)
        L5e:
            return
        L5f:
            java.lang.Object r4 = r2.get(r1)
            if (r4 == r3) goto L3b
            goto L1c
    }
}
