package p190k3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p027E4.RunnableC0338y;
import p074O2.InterfaceC1051i;
import p160f3.AbstractC2153p;
import p160f3.AbstractC2164x;
import p160f3.C2135g;
import p160f3.InterfaceC2101D;
import p160f3.InterfaceC2165y;
import p160f3.RunnableC2148m0;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: k3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2459g extends AbstractC2153p implements InterfaceC2165y {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7934k = AtomicIntegerFieldUpdater.newUpdater(C2459g.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2165y f7935f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2153p f7936g;

    /* JADX INFO: renamed from: h */
    public final int f7937h;

    /* JADX INFO: renamed from: i */
    public final C2463k f7938i;

    /* JADX INFO: renamed from: j */
    public final Object f7939j;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f3.p */
    /* JADX WARN: Multi-variable type inference failed */
    public C2459g(AbstractC2153p abstractC2153p, int i5) {
        InterfaceC2165y interfaceC2165y = abstractC2153p instanceof InterfaceC2165y ? (InterfaceC2165y) abstractC2153p : null;
        this.f7935f = interfaceC2165y == null ? AbstractC2164x.f7122a : interfaceC2165y;
        this.f7936g = abstractC2153p;
        this.f7937h = i5;
        this.f7938i = new C2463k();
        this.f7939j = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2153p
    /* JADX INFO: renamed from: D */
    public final void mo1207D(InterfaceC1051i interfaceC1051i, Runnable runnable) {
        boolean z5;
        Runnable runnableM4389G;
        this.f7938i.m4394a(runnable);
        if (f7934k.get(this) < this.f7937h) {
            synchronized (this.f7939j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7934k;
                if (atomicIntegerFieldUpdater.get(this) >= this.f7937h) {
                    z5 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z5 = true;
                }
            }
            if (!z5 || (runnableM4389G = m4389G()) == null) {
                return;
            }
            this.f7936g.mo1207D(this, new RunnableC0338y(this, runnableM4389G, 3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final Runnable m4389G() {
        while (true) {
            Runnable runnable = (Runnable) this.f7938i.m4397d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f7939j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7934k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f7938i.m4396c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2165y
    /* JADX INFO: renamed from: d */
    public final void mo3896d(long j5, C2135g c2135g) {
        this.f7935f.mo3896d(j5, c2135g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2165y
    /* JADX INFO: renamed from: f */
    public final InterfaceC2101D mo3897f(long j5, RunnableC2148m0 runnableC2148m0, InterfaceC1051i interfaceC1051i) {
        return this.f7935f.mo3897f(j5, runnableC2148m0, interfaceC1051i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2153p
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7936g);
        sb.append(".limitedParallelism(");
        return AbstractC3202a.m5466a(sb, this.f7937h, ')');
    }
}
