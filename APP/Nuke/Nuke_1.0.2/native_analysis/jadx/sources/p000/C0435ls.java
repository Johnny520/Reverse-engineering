package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ls */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0435ls extends n21 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f6289l;

    /* JADX INFO: renamed from: m */
    public final C0469mp f6290m;

    public /* synthetic */ C0435ls(C0469mp c0469mp, int i) {
        this.f6289l = i;
        this.f6290m = c0469mp;
    }

    @Override // p000.n21
    /* JADX INFO: renamed from: k */
    public final boolean mo1214k() {
        switch (this.f6289l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.n21
    /* JADX INFO: renamed from: l */
    public final void mo1215l(Throwable th) throws j90 {
        int i = this.f6289l;
        C0469mp c0469mp = this.f6290m;
        switch (i) {
            case 0:
                Throwable thMo3149s = c0469mp.mo3149s(m3225j());
                if (c0469mp.m3156z()) {
                    k90 k90Var = (k90) c0469mp.f6742k;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k90.f5403o;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(k90Var);
                        hh1 hh1Var = p40.f7969e;
                        if (t11.m5086l(obj, hh1Var)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(k90Var, hh1Var, thMo3149s)) {
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
                c0469mp.mo2512n(thMo3149s);
                if (!c0469mp.m3156z()) {
                    c0469mp.m3147q();
                }
                break;
            default:
                c0469mp.mo2509h(a83.f116a);
                break;
        }
    }
}
