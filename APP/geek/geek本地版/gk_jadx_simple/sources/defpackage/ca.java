package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ca extends op {
    public final i8 e;

    public ca(i8 r1) {
        this.e = r1;
    }

    @Override // defpackage.sm
    public final /* bridge */ /* synthetic */ Object f(Object r1) {
        l((Throwable) r1);
        return vh.n;
    }

    @Override // defpackage.sp
    public final void l(Throwable r7) {
        CancellationException r72 = k().t();
        i8 r0 = this.e;
        if (r0.o() == false) goto L19;
        ld r1 = r0.d;
        ip.m("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", r1);
        tg r12 = (tg) r1;
        AtomicReferenceFieldUpdater r2 = tg.h;
    L6:
        Object r3 = r2.get(r12);
        l0 r4 = a80.e;
        if (ip.i(r3, r4) == true) goto L9;
        if ((r3 instanceof Throwable) == true) goto L42;
    L18:
        if (r2.compareAndSet(r12, r3, null) == true) goto L19;
        if (r2.get(r12) == r3) goto L18;
    L42:
        return;
    L9:
        if (r2.compareAndSet(r12, r4, r72) == true) goto L41;
        if (r2.get(r12) == r4) goto L9;
    L41:
        return;
    L19:
        r0.k(r72);
        if (r0.o() == true) goto L39;
        AtomicReferenceFieldUpdater r73 = i8.h;
        zg r13 = (zg) r73.get(r0);
        if (r13 == null) goto L40;
        r13.b();
        r73.set(r0, nw.a);
        return;
    L40:
        return;
    }
}
