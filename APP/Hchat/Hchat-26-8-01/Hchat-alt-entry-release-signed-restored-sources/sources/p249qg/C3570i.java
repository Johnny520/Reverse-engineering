package p249qg;

import gg.AbstractC1416l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p162l3.C2463q;
import p276sf.C3967n;
import vg.AbstractC4552a;
import vg.C4557f;

/* JADX INFO: renamed from: qg.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3570i extends AbstractC3602u0 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f11576k;

    /* JADX INFO: renamed from: l */
    public final C3564g f11577l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3570i(C3564g c3564g, int i9) {
        this.f11576k = i9;
        this.f11577l = c3564g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3602u0
    /* JADX INFO: renamed from: k */
    public final boolean mo7495k() {
        switch (this.f11576k) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3602u0
    /* JADX INFO: renamed from: l */
    public final void mo7496l(Throwable th2) {
        switch (this.f11576k) {
            case 0:
                C3610y0 c3610y0M7546j = m7546j();
                C3564g c3564g = this.f11577l;
                Throwable thMo7511n = c3564g.mo7511n(c3610y0M7546j);
                if (c3564g.m7517t()) {
                    C4557f c4557f = (C4557f) c3564g.f11566j;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4557f.f15025n;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c4557f);
                        C2463q c2463q = AbstractC4552a.f15015c;
                        if (AbstractC1416l.m3825a(obj, c2463q)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c4557f, c2463q, thMo7511n)) {
                                if (atomicReferenceFieldUpdater.get(c4557f) != c2463q) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c4557f, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c4557f) != obj) {
                                }
                            }
                        }
                    }
                }
                c3564g.mo7500w(thMo7511n);
                if (!c3564g.m7517t()) {
                    c3564g.m7509l();
                }
                break;
            default:
                this.f11577l.resumeWith(C3967n.f12976a);
                break;
        }
    }
}
