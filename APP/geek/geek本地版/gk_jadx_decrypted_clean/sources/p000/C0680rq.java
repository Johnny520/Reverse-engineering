package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: rq */
/* JADX INFO: loaded from: classes.dex */
public final class C0680rq extends AbstractC0408ke implements InterfaceC0186eg {

    /* JADX INFO: renamed from: h */
    public static final AtomicIntegerFieldUpdater f4336h = AtomicIntegerFieldUpdater.newUpdater(C0680rq.class, "runningWorkers");

    /* JADX INFO: renamed from: c */
    public final AbstractC0408ke f4337c;

    /* JADX INFO: renamed from: d */
    public final int f4338d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0186eg f4339e;

    /* JADX INFO: renamed from: f */
    public final C0866wr f4340f;

    /* JADX INFO: renamed from: g */
    public final Object f4341g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public C0680rq(AbstractC0408ke abstractC0408ke, int i) {
        this.f4337c = abstractC0408ke;
        this.f4338d = i;
        InterfaceC0186eg interfaceC0186eg = abstractC0408ke instanceof InterfaceC0186eg ? (InterfaceC0186eg) abstractC0408ke : null;
        this.f4339e = interfaceC0186eg == null ? AbstractC0446lf.f3047a : interfaceC0186eg;
        this.f4340f = new C0866wr();
        this.f4341g = new Object();
    }

    @Override // p000.InterfaceC0186eg
    /* JADX INFO: renamed from: c */
    public final void mo1026c(long j, C0326i8 c0326i8) {
        this.f4339e.mo1026c(j, c0326i8);
    }

    @Override // p000.AbstractC0408ke
    /* JADX INFO: renamed from: d */
    public final void mo1598d(InterfaceC0258ge interfaceC0258ge, Runnable runnable) {
        this.f4340f.m2595a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4336h;
        if (atomicIntegerFieldUpdater.get(this) < this.f4338d) {
            synchronized (this.f4341g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f4338d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM2296f = m2296f();
                if (runnableM2296f == null) {
                    return;
                }
                this.f4337c.mo1598d(this, new RunnableC0282h1(this, 7, runnableM2296f));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Runnable m2296f() {
        while (true) {
            Runnable runnable = (Runnable) this.f4340f.m2598d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f4341g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4336h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f4340f.m2597c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
