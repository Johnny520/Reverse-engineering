package p263rg;

import p249qg.AbstractC3591p;
import p249qg.AbstractC3603v;
import p249qg.C3564g;
import p276sf.C3967n;
import vg.C4558g;
import wf.C5562h;

/* JADX INFO: renamed from: rg.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3807d implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12491g = 0;

    /* JADX INFO: renamed from: h */
    public Runnable f12492h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC3591p f12493i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC3807d(C3564g c3564g, C3808e c3808e) {
        this.f12492h = c3564g;
        this.f12493i = c3808e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12491g) {
            case 0:
                ((C3564g) this.f12492h).m7504B((C3808e) this.f12493i, C3967n.f12976a);
                break;
            default:
                C4558g c4558g = (C4558g) this.f12493i;
                AbstractC3591p abstractC3591p = c4558g.f15032j;
                int i9 = 0;
                while (true) {
                    try {
                        this.f12492h.run();
                    } catch (Throwable th2) {
                        AbstractC3603v.m7559m(th2, C5562h.f22661g);
                    }
                    Runnable runnableM8998z = c4558g.m8998z();
                    if (runnableM8998z == null) {
                        break;
                    } else {
                        this.f12492h = runnableM8998z;
                        i9++;
                        if (i9 >= 16 && abstractC3591p.mo7542x(c4558g)) {
                            abstractC3591p.mo7538w(c4558g, this);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public RunnableC3807d(C4558g c4558g, Runnable runnable) {
        this.f12493i = c4558g;
        this.f12492h = runnable;
    }
}
