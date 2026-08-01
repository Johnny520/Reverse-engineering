package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: vq */
/* JADX INFO: loaded from: classes.dex */
public final class C0827vq extends AbstractC0445le implements InterfaceC0223fg {

    /* JADX INFO: renamed from: h */
    public static final AtomicIntegerFieldUpdater f4973h = AtomicIntegerFieldUpdater.newUpdater(C0827vq.class, "runningWorkers");

    /* JADX INFO: renamed from: c */
    public final AbstractC0445le f4974c;

    /* JADX INFO: renamed from: d */
    public final int f4975d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0223fg f4976e;

    /* JADX INFO: renamed from: f */
    public final C0042as f4977f;

    /* JADX INFO: renamed from: g */
    public final Object f4978g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public C0827vq(AbstractC0445le abstractC0445le, int i) {
        this.f4974c = abstractC0445le;
        this.f4975d = i;
        InterfaceC0223fg interfaceC0223fg = abstractC0445le instanceof InterfaceC0223fg ? (InterfaceC0223fg) abstractC0445le : null;
        this.f4976e = interfaceC0223fg == null ? AbstractC0483mf.f3131a : interfaceC0223fg;
        this.f4977f = new C0042as();
        this.f4978g = new Object();
    }

    @Override // p000.InterfaceC0223fg
    /* JADX INFO: renamed from: c */
    public final void mo1099c(long j, C0698s8 c0698s8) {
        this.f4976e.mo1099c(j, c0698s8);
    }

    @Override // p000.AbstractC0445le
    /* JADX INFO: renamed from: d */
    public final void mo584d(InterfaceC0295he interfaceC0295he, Runnable runnable) {
        this.f4977f.m470a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4973h;
        if (atomicIntegerFieldUpdater.get(this) < this.f4975d) {
            synchronized (this.f4978g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f4975d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM2574f = m2574f();
                if (runnableM2574f == null) {
                    return;
                }
                this.f4974c.mo584d(this, new RunnableC0282h1(this, 7, runnableM2574f));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Runnable m2574f() {
        while (true) {
            Runnable runnable = (Runnable) this.f4977f.m473d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f4978g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4973h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f4977f.m472c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
