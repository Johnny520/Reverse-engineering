package p249qg;

import gg.AbstractC1416l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import vg.C4560i;
import vg.C4565n;

/* JADX INFO: renamed from: qg.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3602u0 extends C4560i implements InterfaceC3556d0, InterfaceC3589o0 {

    /* JADX INFO: renamed from: j */
    public C3610y0 f11618j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3556d0
    /* JADX INFO: renamed from: a */
    public final void mo7492a() {
        C3610y0 c3610y0M7546j = m7546j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3610y0.f11641g;
            Object obj = atomicReferenceFieldUpdater.get(c3610y0M7546j);
            if (obj instanceof AbstractC3602u0) {
                if (obj != this) {
                    return;
                }
                C3562f0 c3562f0 = AbstractC3603v.f11628j;
                while (!atomicReferenceFieldUpdater.compareAndSet(c3610y0M7546j, obj, c3562f0)) {
                    if (atomicReferenceFieldUpdater.get(c3610y0M7546j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC3589o0) || ((InterfaceC3589o0) obj).mo7477d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C4560i.f15037g;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C4565n) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                C4560i c4560i = (C4560i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C4560i.f15039i;
                C4565n c4565n = (C4565n) atomicReferenceFieldUpdater3.get(c4560i);
                if (c4565n == null) {
                    c4565n = new C4565n(c4560i);
                    atomicReferenceFieldUpdater3.set(c4560i, c4565n);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c4565n)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c4560i.m9000f();
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3589o0
    /* JADX INFO: renamed from: b */
    public final boolean mo7476b() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3589o0
    /* JADX INFO: renamed from: d */
    public final C3548a1 mo7477d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC3596r0 getParent() {
        return m7546j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C3610y0 m7546j() {
        C3610y0 c3610y0 = this.f11618j;
        if (c3610y0 != null) {
            return c3610y0;
        }
        AbstractC1416l.m3831g("job");
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo7495k();

    /* JADX INFO: renamed from: l */
    public abstract void mo7496l(Throwable th2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // vg.C4560i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC3603v.m7556j(this) + "[job@" + AbstractC3603v.m7556j(m7546j()) + ']';
    }
}
