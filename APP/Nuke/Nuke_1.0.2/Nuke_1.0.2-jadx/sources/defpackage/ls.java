package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ls extends n21 {
    public final /* synthetic */ int l;
    public final mp m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ls(mp mpVar, int i) {
        this.l = i;
        this.m = mpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n21
    public final boolean k() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n21
    public final void l(Throwable th) throws j90 {
        int i = this.l;
        mp mpVar = this.m;
        switch (i) {
            case 0:
                Throwable thS = mpVar.s(j());
                if (mpVar.z()) {
                    k90 k90Var = (k90) mpVar.k;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k90.o;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(k90Var);
                        hh1 hh1Var = p40.e;
                        if (t11.l(obj, hh1Var)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(k90Var, hh1Var, thS)) {
                                if (atomicReferenceFieldUpdater.get(k90Var) != hh1Var) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(k90Var, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(k90Var) != obj) {
                                }
                            }
                        }
                    }
                }
                mpVar.n(thS);
                if (!mpVar.z()) {
                    mpVar.q();
                }
                break;
            default:
                mpVar.h(a83.a);
                break;
        }
    }
}
