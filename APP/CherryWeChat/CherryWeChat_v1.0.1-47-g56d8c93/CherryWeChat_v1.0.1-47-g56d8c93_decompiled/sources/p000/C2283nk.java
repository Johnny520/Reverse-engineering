package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: nk */
/* JADX INFO: loaded from: classes.dex */
public final class C2283nk extends AbstractC1217bc implements InterfaceC2413qd {

    /* JADX INFO: renamed from: b */
    public final Handler f8017b;

    /* JADX INFO: renamed from: c */
    public final boolean f8018c;

    /* JADX INFO: renamed from: d */
    public final C2283nk f8019d;

    public C2283nk(Handler handler, boolean z) {
        this.f8017b = handler;
        this.f8018c = z;
        this.f8019d = z ? this : new C2283nk(handler, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2283nk)) {
            return false;
        }
        C2283nk c2283nk = (C2283nk) obj;
        return c2283nk.f8017b == this.f8017b && c2283nk.f8018c == this.f8018c;
    }

    @Override // p000.InterfaceC2413qd
    /* JADX INFO: renamed from: f */
    public final void mo2668f(long j, C0523M6 c0523m6) {
        RunnableC2260n3 runnableC2260n3 = new RunnableC2260n3(8, c0523m6, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (!this.f8017b.postDelayed(runnableC2260n3, j)) {
            m4610w(c0523m6.f1711e, runnableC2260n3);
        } else {
            AbstractC0828TB.m1649r(c0523m6, new C0394J6(0, new C2240mk(0, this, runnableC2260n3)));
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8017b) ^ (this.f8018c ? 1231 : 1237);
    }

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: t */
    public final void mo1781t(InterfaceC1137ac interfaceC1137ac, Runnable runnable) {
        if (this.f8017b.post(runnable)) {
            return;
        }
        m4610w(interfaceC1137ac, runnable);
    }

    @Override // p000.AbstractC1217bc
    public final String toString() {
        C2283nk c2283nk;
        String str;
        C1498hd c1498hd = AbstractC1499he.f5282a;
        C2283nk c2283nk2 = AbstractC1106Zp.f3500a;
        if (this == c2283nk2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c2283nk = c2283nk2.f8019d;
            } catch (UnsupportedOperationException unused) {
                c2283nk = null;
            }
            str = this == c2283nk ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f8017b.toString();
        return this.f8018c ? AbstractC0213Ey.m407e(string, ".immediate") : string;
    }

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: u */
    public final boolean mo2333u(InterfaceC1137ac interfaceC1137ac) {
        return (this.f8018c && AbstractC0585Nj.m1134a(Looper.myLooper(), this.f8017b.getLooper())) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public final void m4610w(InterfaceC1137ac interfaceC1137ac, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC1332dm interfaceC1332dm = (InterfaceC1332dm) interfaceC1137ac.mo24m(C1456gf.f5162f);
        if (interfaceC1332dm != null) {
            interfaceC1332dm.mo1749r(cancellationException);
        }
        C1498hd c1498hd = AbstractC1499he.f5282a;
        ExecutorC0921Vc.f2876b.mo1781t(interfaceC1137ac, runnable);
    }
}
