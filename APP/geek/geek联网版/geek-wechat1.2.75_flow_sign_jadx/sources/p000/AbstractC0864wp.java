package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: wp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0864wp extends C0977zr implements InterfaceC0068bh, InterfaceC0974zo, InterfaceC0786um {

    /* JADX INFO: renamed from: d */
    public C0040aq f5102d;

    @Override // p000.InterfaceC0974zo
    /* JADX INFO: renamed from: a */
    public final boolean mo2497a() {
        return true;
    }

    @Override // p000.InterfaceC0068bh
    /* JADX INFO: renamed from: b */
    public final void mo522b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0040aq c0040aqM2618k = m2618k();
        while (true) {
            Object objM465x = c0040aqM2618k.m465x();
            if (objM465x instanceof AbstractC0864wp) {
                if (objM465x != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0040aq.f616a;
                C0857wi c0857wi = AbstractC0493mp.f3174l;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c0040aqM2618k, objM465x, c0857wi)) {
                    if (atomicReferenceFieldUpdater2.get(c0040aqM2618k) != objM465x) {
                        break;
                    }
                }
                return;
            }
            if (!(objM465x instanceof InterfaceC0974zo) || ((InterfaceC0974zo) objM465x).mo2498d() == null) {
                return;
            }
            while (true) {
                Object objM2851h = m2851h();
                if (objM2851h instanceof t00) {
                    return;
                }
                if (objM2851h == this) {
                    return;
                }
                AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objM2851h);
                C0977zr c0977zr = (C0977zr) objM2851h;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C0977zr.f5615c;
                t00 t00Var = (t00) atomicReferenceFieldUpdater3.get(c0977zr);
                if (t00Var == null) {
                    t00Var = new t00(c0977zr);
                    atomicReferenceFieldUpdater3.lazySet(c0977zr, t00Var);
                }
                do {
                    atomicReferenceFieldUpdater = C0977zr.f5613a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objM2851h, t00Var)) {
                        c0977zr.m2849e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objM2851h);
            }
        }
    }

    @Override // p000.InterfaceC0974zo
    /* JADX INFO: renamed from: d */
    public final C0796uw mo2498d() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C0040aq m2618k() {
        C0040aq c0040aq = this.f5102d;
        if (c0040aq != null) {
            return c0040aq;
        }
        C0924yb c0924yb = new C0924yb("lateinit property job has not been initialized");
        AbstractC0493mp.m1839M(c0924yb, AbstractC0493mp.class.getName());
        throw c0924yb;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1671l(Throwable th);

    @Override // p000.C0977zr
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0259gf.m1262x(this) + "[job@" + AbstractC0259gf.m1262x(m2618k()) + ']';
    }
}
