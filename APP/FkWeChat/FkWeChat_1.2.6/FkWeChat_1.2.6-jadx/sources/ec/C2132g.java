package ec;

import java.util.concurrent.locks.LockSupport;
import p024b9.AbstractC1061t;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2132g extends AbstractC2105a {

    /* JADX INFO: renamed from: t */
    public final Thread f5959t;

    /* JADX INFO: renamed from: u */
    public final AbstractC2142i1 f5960u;

    public C2132g(InterfaceC5980j interfaceC5980j, Thread thread, AbstractC2142i1 abstractC2142i1) {
        super(interfaceC5980j, true, true);
        this.f5959t = thread;
        this.f5960u = abstractC2142i1;
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: A0 */
    public boolean mo7646A0() {
        return true;
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: C */
    public void mo7599C(Object obj) {
        if (AbstractC1061t.m3842c(Thread.currentThread(), this.f5959t)) {
            return;
        }
        Thread thread = this.f5959t;
        AbstractC2115c.m7635a();
        LockSupport.unpark(thread);
    }

    /* JADX INFO: renamed from: k1 */
    public final Object m7751k1() throws Throwable {
        AbstractC2115c.m7635a();
        try {
            AbstractC2142i1 abstractC2142i1 = this.f5960u;
            if (abstractC2142i1 != null) {
                AbstractC2142i1.m7774P0(abstractC2142i1, false, 1, null);
            }
            while (true) {
                try {
                    AbstractC2142i1 abstractC2142i12 = this.f5960u;
                    long jMo7781S0 = abstractC2142i12 != null ? abstractC2142i12.mo7781S0() : Long.MAX_VALUE;
                    if (mo7693l()) {
                        break;
                    }
                    AbstractC2115c.m7635a();
                    LockSupport.parkNanos(this, jMo7781S0);
                    if (Thread.interrupted()) {
                        m7652H(new InterruptedException());
                    }
                } catch (Throwable th) {
                    AbstractC2142i1 abstractC2142i13 = this.f5960u;
                    if (abstractC2142i13 != null) {
                        AbstractC2142i1.m7773E0(abstractC2142i13, false, 1, null);
                    }
                    throw th;
                }
            }
            AbstractC2142i1 abstractC2142i14 = this.f5960u;
            if (abstractC2142i14 != null) {
                AbstractC2142i1.m7773E0(abstractC2142i14, false, 1, null);
            }
            AbstractC2115c.m7635a();
            Object objM7737h = AbstractC2123d2.m7737h(m7699p0());
            C2111b0 c2111b0 = objM7737h instanceof C2111b0 ? (C2111b0) objM7737h : null;
            if (c2111b0 == null) {
                return objM7737h;
            }
            throw c2111b0.f5913a;
        } catch (Throwable th2) {
            AbstractC2115c.m7635a();
            throw th2;
        }
    }
}
