package p160f3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p056K2.C0891q;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p190k3.AbstractC2453a;
import p190k3.C2458f;

/* JADX INFO: renamed from: f3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2139i extends AbstractC2118V {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7080h;

    /* JADX INFO: renamed from: i */
    public final C2135g f7081i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2139i(C2135g c2135g, int i5) {
        this.f7080h = i5;
        this.f7081i = c2135g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2118V
    /* JADX INFO: renamed from: k */
    public final boolean mo3884k() {
        switch (this.f7080h) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2118V
    /* JADX INFO: renamed from: l */
    public final void mo3885l(Throwable th) {
        switch (this.f7080h) {
            case 0:
                C2122Z c2122zM3913j = m3913j();
                C2135g c2135g = this.f7081i;
                Throwable thMo3915q = c2135g.mo3915q(c2122zM3913j);
                if (c2135g.m3972y()) {
                    C2458f c2458f = (C2458f) c2135g.f7077g;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2458f.f7929k;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c2458f);
                        C1753n c1753n = AbstractC2453a.f7919c;
                        if (AbstractC1665j.m2981a(obj, c1753n)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c2458f, c1753n, thMo3915q)) {
                                if (atomicReferenceFieldUpdater.get(c2458f) != c1753n) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c2458f, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c2458f) != obj) {
                                }
                            }
                        }
                    }
                }
                c2135g.mo3952k(thMo3915q);
                if (!c2135g.m3972y()) {
                    c2135g.m3965o();
                }
                break;
            default:
                this.f7081i.mo278i(C0891q.f2780a);
                break;
        }
    }
}
