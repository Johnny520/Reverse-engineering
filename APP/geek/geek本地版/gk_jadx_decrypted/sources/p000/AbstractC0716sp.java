package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: sp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0716sp extends C0829vr implements InterfaceC0966zg, InterfaceC0826vo, InterfaceC0713sm {

    /* JADX INFO: renamed from: d */
    public C0864wp f4450d;

    @Override // p000.InterfaceC0826vo
    /* JADX INFO: renamed from: a */
    public final boolean mo1875a() {
        return true;
    }

    @Override // p000.InterfaceC0966zg
    /* JADX INFO: renamed from: b */
    public final void mo1361b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0864wp c0864wpM2336k = m2336k();
        while (true) {
            Object objM2592x = c0864wpM2336k.m2592x();
            if (objM2592x instanceof AbstractC0716sp) {
                if (objM2592x != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0864wp.f5000a;
                C0783ui c0783ui = AbstractC0346ip.f2483l;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c0864wpM2336k, objM2592x, c0783ui)) {
                    if (atomicReferenceFieldUpdater2.get(c0864wpM2336k) != objM2592x) {
                        break;
                    }
                }
                return;
            }
            if (!(objM2592x instanceof InterfaceC0826vo) || ((InterfaceC0826vo) objM2592x).mo1876d() == null) {
                return;
            }
            while (true) {
                Object objM2523h = m2523h();
                if (objM2523h instanceof m00) {
                    return;
                }
                if (objM2523h == this) {
                    return;
                }
                AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objM2523h);
                C0829vr c0829vr = (C0829vr) objM2523h;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C0829vr.f4884c;
                m00 m00Var = (m00) atomicReferenceFieldUpdater3.get(c0829vr);
                if (m00Var == null) {
                    m00Var = new m00(c0829vr);
                    atomicReferenceFieldUpdater3.lazySet(c0829vr, m00Var);
                }
                do {
                    atomicReferenceFieldUpdater = C0829vr.f4882a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objM2523h, m00Var)) {
                        c0829vr.m2521e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objM2523h);
            }
        }
    }

    @Override // p000.InterfaceC0826vo
    /* JADX INFO: renamed from: d */
    public final C0500mw mo1876d() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C0864wp m2336k() {
        C0864wp c0864wp = this.f4450d;
        if (c0864wp != null) {
            return c0864wp;
        }
        C0591pb c0591pb = new C0591pb("lateinit property job has not been initialized");
        AbstractC0346ip.m1483U(c0591pb, AbstractC0346ip.class.getName());
        throw c0591pb;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo647l(Throwable th);

    @Override // p000.C0829vr
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0222ff.m1197s(this) + "[job@" + AbstractC0222ff.m1197s(m2336k()) + ']';
    }
}
