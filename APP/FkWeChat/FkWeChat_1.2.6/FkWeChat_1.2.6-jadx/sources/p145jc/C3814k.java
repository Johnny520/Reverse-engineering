package p145jc;

import ec.AbstractC2149k0;
import ec.AbstractC2157m0;
import ec.AbstractC2189u0;
import ec.InterfaceC2126e1;
import ec.InterfaceC2156m;
import ec.InterfaceC2201x0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p228p8.C5981k;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: jc.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3814k extends AbstractC2149k0 implements InterfaceC2201x0 {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10987y = AtomicIntegerFieldUpdater.newUpdater(C3814k.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC2201x0 f10988s;

    /* JADX INFO: renamed from: t */
    public final AbstractC2149k0 f10989t;

    /* JADX INFO: renamed from: u */
    public final int f10990u;

    /* JADX INFO: renamed from: v */
    public final String f10991v;

    /* JADX INFO: renamed from: w */
    public final C3824p f10992w;

    /* JADX INFO: renamed from: x */
    public final Object f10993x;

    /* JADX INFO: renamed from: jc.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: q */
        public Runnable f10994q;

        public a(Runnable runnable) {
            this.f10994q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f10994q.run();
                } catch (Throwable th) {
                    AbstractC2157m0.m7839a(C5981k.f18917q, th);
                }
                Runnable runnableM15191O0 = C3814k.this.m15191O0();
                if (runnableM15191O0 == null) {
                    return;
                }
                try {
                    this.f10994q = runnableM15191O0;
                    i10++;
                    if (i10 >= 16 && AbstractC3810i.m15181d(C3814k.this.f10989t, C3814k.this)) {
                        AbstractC3810i.m15180c(C3814k.this.f10989t, C3814k.this, this);
                        return;
                    }
                } catch (Throwable th2) {
                    Object obj = C3814k.this.f10993x;
                    C3814k c3814k = C3814k.this;
                    synchronized (obj) {
                        C3814k.m15189N0().decrementAndGet(c3814k);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3814k(AbstractC2149k0 abstractC2149k0, int i10, String str) {
        InterfaceC2201x0 interfaceC2201x0 = abstractC2149k0 instanceof InterfaceC2201x0 ? (InterfaceC2201x0) abstractC2149k0 : null;
        this.f10988s = interfaceC2201x0 == null ? AbstractC2189u0.m7911a() : interfaceC2201x0;
        this.f10989t = abstractC2149k0;
        this.f10990u = i10;
        this.f10991v = str;
        this.f10992w = new C3824p(false);
        this.f10993x = new Object();
    }

    /* JADX INFO: renamed from: N0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m15189N0() {
        return f10987y;
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: F */
    public void mo7820F(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        Runnable runnableM15191O0;
        this.f10992w.m15235a(runnable);
        if (f10987y.get(this) >= this.f10990u || !m15192P0() || (runnableM15191O0 = m15191O0()) == null) {
            return;
        }
        try {
            this.f10989t.mo7820F(this, new a(runnableM15191O0));
        } catch (Throwable th) {
            f10987y.decrementAndGet(this);
            throw th;
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final Runnable m15191O0() {
        while (true) {
            Runnable runnable = (Runnable) this.f10992w.m15238e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f10993x) {
                f10987y.decrementAndGet(this);
                if (this.f10992w.m15237c() == 0) {
                    return null;
                }
                f10987y.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m15192P0() {
        synchronized (this.f10993x) {
            if (f10987y.get(this) >= this.f10990u) {
                return false;
            }
            f10987y.incrementAndGet(this);
            return true;
        }
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: b0 */
    public AbstractC2149k0 mo7753b0(int i10, String str) {
        AbstractC3816l.m15199a(i10);
        return i10 >= this.f10990u ? AbstractC3816l.m15200b(this, str) : super.mo7753b0(i10, str);
    }

    @Override // ec.InterfaceC2201x0
    /* JADX INFO: renamed from: k */
    public InterfaceC2126e1 mo7800k(long j10, Runnable runnable, InterfaceC5980j interfaceC5980j) {
        return this.f10988s.mo7800k(j10, runnable, interfaceC5980j);
    }

    @Override // ec.InterfaceC2201x0
    /* JADX INFO: renamed from: m */
    public void mo7803m(long j10, InterfaceC2156m interfaceC2156m) {
        this.f10988s.mo7803m(j10, interfaceC2156m);
    }

    @Override // ec.AbstractC2149k0
    public String toString() {
        String str = this.f10991v;
        if (str != null) {
            return str;
        }
        return this.f10989t + ".limitedParallelism(" + this.f10990u + ')';
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: x */
    public void mo7807x(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        Runnable runnableM15191O0;
        this.f10992w.m15235a(runnable);
        if (f10987y.get(this) >= this.f10990u || !m15192P0() || (runnableM15191O0 = m15191O0()) == null) {
            return;
        }
        try {
            AbstractC3810i.m15180c(this.f10989t, this, new a(runnableM15191O0));
        } catch (Throwable th) {
            f10987y.decrementAndGet(this);
            throw th;
        }
    }
}
