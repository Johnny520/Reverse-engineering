package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ka */
/* JADX INFO: loaded from: classes.dex */
public final class C0404ka extends AbstractC0715sp {

    /* JADX INFO: renamed from: e */
    public final C0698s8 f2801e;

    public C0404ka(C0698s8 c0698s8) {
        this.f2801e = c0698s8;
    }

    @Override // p000.InterfaceC0786um
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo26f(Object obj) {
        mo1671l((Throwable) obj);
        return C0893xh.f5258n;
    }

    @Override // p000.AbstractC0864wp
    /* JADX INFO: renamed from: l */
    public final void mo1671l(Throwable th) {
        CancellationException cancellationExceptionM461t = m2618k().m461t();
        C0698s8 c0698s8 = this.f2801e;
        if (c0698s8.m2323o()) {
            InterfaceC0814vd interfaceC0814vd = c0698s8.f4216d;
            AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", interfaceC0814vd);
            C0817vg c0817vg = (C0817vg) interfaceC0814vd;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0817vg.f4954h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c0817vg);
                C0431l0 c0431l0 = g80.f1911e;
                if (!AbstractC0493mp.m1853c(obj, c0431l0)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(c0817vg, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(c0817vg) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c0817vg, c0431l0, cancellationExceptionM461t)) {
                    if (atomicReferenceFieldUpdater.get(c0817vg) != c0431l0) {
                        break;
                    }
                }
                return;
            }
        }
        c0698s8.m2319k(cancellationExceptionM461t);
        if (c0698s8.m2323o()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0698s8.f4215h;
        InterfaceC0068bh interfaceC0068bh = (InterfaceC0068bh) atomicReferenceFieldUpdater2.get(c0698s8);
        if (interfaceC0068bh == null) {
            return;
        }
        interfaceC0068bh.mo522b();
        atomicReferenceFieldUpdater2.set(c0698s8, C0833vw.f5012a);
    }
}
