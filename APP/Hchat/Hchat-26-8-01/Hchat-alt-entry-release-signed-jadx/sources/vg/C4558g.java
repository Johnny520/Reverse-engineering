package vg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p222p.AbstractC3199a;
import p249qg.AbstractC3591p;
import p249qg.AbstractC3607x;
import p249qg.C3564g;
import p249qg.InterfaceC3556d0;
import p249qg.InterfaceC3609y;
import p249qg.RunnableC3575j1;
import p263rg.RunnableC3807d;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: vg.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4558g extends AbstractC3591p implements InterfaceC3609y {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15030n = AtomicIntegerFieldUpdater.newUpdater(C4558g.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC3609y f15031i;

    /* JADX INFO: renamed from: j */
    public final AbstractC3591p f15032j;

    /* JADX INFO: renamed from: k */
    public final int f15033k;

    /* JADX INFO: renamed from: l */
    public final C4561j f15034l;

    /* JADX INFO: renamed from: m */
    public final Object f15035m;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: qg.p */
    /* JADX WARN: Multi-variable type inference failed */
    public C4558g(AbstractC3591p abstractC3591p, int i9) {
        InterfaceC3609y interfaceC3609y = abstractC3591p instanceof InterfaceC3609y ? (InterfaceC3609y) abstractC3591p : null;
        this.f15031i = interfaceC3609y == null ? AbstractC3607x.f11636a : interfaceC3609y;
        this.f15032j = abstractC3591p;
        this.f15033k = i9;
        this.f15034l = new C4561j();
        this.f15035m = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3609y
    /* JADX INFO: renamed from: q */
    public final InterfaceC3556d0 mo7536q(long j3, RunnableC3575j1 runnableC3575j1, InterfaceC5561g interfaceC5561g) {
        return this.f15031i.mo7536q(j3, runnableC3575j1, interfaceC5561g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15032j);
        sb2.append(".limitedParallelism(");
        return AbstractC3199a.m6841n(sb2, this.f15033k, ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3609y
    /* JADX INFO: renamed from: u */
    public final void mo7537u(long j3, C3564g c3564g) {
        this.f15031i.mo7537u(j3, c3564g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    /* JADX INFO: renamed from: w */
    public final void mo7538w(InterfaceC5561g interfaceC5561g, Runnable runnable) {
        boolean z9;
        Runnable runnableM8998z;
        this.f15034l.m9003a(runnable);
        if (f15030n.get(this) < this.f15033k) {
            synchronized (this.f15035m) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15030n;
                if (atomicIntegerFieldUpdater.get(this) >= this.f15033k) {
                    z9 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z9 = true;
                }
            }
            if (!z9 || (runnableM8998z = m8998z()) == null) {
                return;
            }
            this.f15032j.mo7538w(this, new RunnableC3807d(this, runnableM8998z));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final Runnable m8998z() {
        while (true) {
            Runnable runnable = (Runnable) this.f15034l.m9006d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f15035m) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15030n;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f15034l.m9005c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
