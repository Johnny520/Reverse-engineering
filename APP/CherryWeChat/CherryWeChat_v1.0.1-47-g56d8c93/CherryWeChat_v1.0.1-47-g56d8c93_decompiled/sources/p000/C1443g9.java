package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: g9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1443g9 extends AbstractC1507hm {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5053e;

    /* JADX INFO: renamed from: f */
    public final Object f5054f;

    public /* synthetic */ C1443g9(int i, Object obj) {
        this.f5053e = i;
        this.f5054f = obj;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: j */
    public final boolean mo1505j() {
        switch (this.f5053e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: k */
    public final void mo1506k(Throwable th) throws C1324de {
        switch (this.f5053e) {
            case 0:
                C0523M6 c0523m6 = (C0523M6) this.f5054f;
                C2152km c2152km = this.f5343d;
                if (c2152km == null) {
                    c2152km = null;
                }
                CancellationException cancellationExceptionMo1748p = c2152km.mo1748p();
                if (c0523m6.m1020n()) {
                    C1367ee c1367ee = (C1367ee) c0523m6.f1710d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1367ee.f4893h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c1367ee);
                        C2610v1 c2610v1 = AbstractC1406fG.f4984c;
                        if (AbstractC0585Nj.m1134a(obj, c2610v1)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c1367ee, c2610v1, cancellationExceptionMo1748p)) {
                                if (atomicReferenceFieldUpdater.get(c1367ee) != c2610v1) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c1367ee, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c1367ee) != obj) {
                                }
                            }
                        }
                    }
                }
                c0523m6.m1017k(cancellationExceptionMo1748p);
                if (!c0523m6.m1020n()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0523M6.f1709h;
                    InterfaceC2100je interfaceC2100je = (InterfaceC2100je) atomicReferenceFieldUpdater2.get(c0523m6);
                    if (interfaceC2100je != null) {
                        interfaceC2100je.mo1795a();
                        atomicReferenceFieldUpdater2.set(c0523m6, C0937Vs.f2926a);
                        break;
                    }
                }
                break;
            default:
                ((C1463gm) this.f5054f).mo90g(th);
                break;
        }
    }
}
