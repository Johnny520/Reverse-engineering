package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ca */
/* JADX INFO: loaded from: classes.dex */
public final class C0097ca extends AbstractC0567op {

    /* JADX INFO: renamed from: e */
    public final C0326i8 f941e;

    public C0097ca(C0326i8 c0326i8) {
        this.f941e = c0326i8;
    }

    @Override // p000.InterfaceC0713sm
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo96f(Object obj) throws IllegalAccessException, InvocationTargetException {
        mo647l((Throwable) obj);
        return C0819vh.f4855n;
    }

    @Override // p000.AbstractC0716sp
    /* JADX INFO: renamed from: l */
    public final void mo647l(Throwable th) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationExceptionM2590t = m2336k().m2590t();
        C0326i8 c0326i8 = this.f941e;
        if (c0326i8.m1414o()) {
            InterfaceC0444ld interfaceC0444ld = c0326i8.f2366d;
            AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", interfaceC0444ld);
            C0744tg c0744tg = (C0744tg) interfaceC0444ld;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0744tg.f4571h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c0744tg);
                C0431l0 c0431l0 = a80.f72e;
                if (!AbstractC0346ip.m1497i(obj, c0431l0)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(c0744tg, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(c0744tg) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c0744tg, c0431l0, cancellationExceptionM2590t)) {
                    if (atomicReferenceFieldUpdater.get(c0744tg) != c0431l0) {
                        break;
                    }
                }
                return;
            }
        }
        c0326i8.m1410k(cancellationExceptionM2590t);
        if (c0326i8.m1414o()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0326i8.f2365h;
        InterfaceC0966zg interfaceC0966zg = (InterfaceC0966zg) atomicReferenceFieldUpdater2.get(c0326i8);
        if (interfaceC0966zg == null) {
            return;
        }
        interfaceC0966zg.mo1361b();
        atomicReferenceFieldUpdater2.set(c0326i8, C0537nw.f3454a);
    }
}
