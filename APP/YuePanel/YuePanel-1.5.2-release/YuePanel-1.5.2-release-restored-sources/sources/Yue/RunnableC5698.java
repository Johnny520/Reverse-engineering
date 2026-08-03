package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5698 extends AbstractC4232 implements Runnable, InterfaceC4364 {
    private volatile int runningWorkers;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC4232 f14028;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f14029;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4364 f14030;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5857<Runnable> f14031;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final Object f14032;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۧۦۨ */
    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC5698(@InterfaceC6399 AbstractC4232 abstractC4232, int i) {
        this.f14028 = abstractC4232;
        this.f14029 = i;
        InterfaceC4364 interfaceC4364 = abstractC4232 instanceof InterfaceC4364 ? (InterfaceC4364) abstractC4232 : null;
        this.f14030 = interfaceC4364 == null ? C4338.m1303() : interfaceC4364;
        this.f14031 = new C5857<>(false);
        this.f14032 = new Object();
    }

    @Override // Yue.AbstractC4232
    public void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        if (m17600(runnable) || !m17602()) {
            return;
        }
        this.f14028.dispatch(this, this);
    }

    @Override // Yue.AbstractC4232
    @InterfaceC5495
    public void dispatchYield(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        if (m17600(runnable) || !m17602()) {
            return;
        }
        this.f14028.dispatchYield(this, this);
    }

    @Override // Yue.AbstractC4232
    @InterfaceC6399
    @InterfaceC4764
    public AbstractC4232 limitedParallelism(int i) {
        C5699.m2376(i);
        return i >= this.f14029 ? this : super.limitedParallelism(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        r1 = r4.f14032;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r4.f14031.m18128() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r4.runningWorkers++;
        r2 = Yue.C8107.f3222;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Object obj;
        while (true) {
            int i = 0;
            while (true) {
                Runnable runnableM18132 = this.f14031.m18132();
                if (runnableM18132 == null) {
                    break;
                }
                try {
                    runnableM18132.run();
                } catch (Throwable th) {
                    C4236.m1201(C4629.f9940, th);
                }
                i++;
                if (i >= 16 && this.f14028.isDispatchNeeded(this)) {
                    this.f14028.dispatch(this, this);
                    return;
                }
            }
        }
    }

    @Override // Yue.InterfaceC4364
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated without replacement as an internal method never intended for public use")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Object mo12617(long j, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return this.f14030.mo12617(j, interfaceC4199);
    }

    @Override // Yue.InterfaceC4364
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public InterfaceC4433 mo12587(long j, @InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return this.f14030.mo12587(j, runnable, interfaceC4225);
    }

    @Override // Yue.InterfaceC4364
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo12618(long j, @InterfaceC6399 InterfaceC3665<? super C8107> interfaceC3665) {
        this.f14030.mo12618(j, interfaceC3665);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final boolean m17600(Runnable runnable) {
        this.f14031.m2521(runnable);
        return this.runningWorkers >= this.f14029;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final void m17601(Runnable runnable, InterfaceC5122<C8107> interfaceC5122) {
        if (!m17600(runnable) && m17602()) {
            interfaceC5122.invoke();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final boolean m17602() {
        synchronized (this.f14032) {
            if (this.runningWorkers >= this.f14029) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }
}
