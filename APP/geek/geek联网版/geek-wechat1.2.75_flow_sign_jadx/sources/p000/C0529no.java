package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: no */
/* JADX INFO: loaded from: classes.dex */
public final class C0529no extends AbstractC0445le implements InterfaceC0223fg {
    private volatile C0529no _immediate;

    /* JADX INFO: renamed from: c */
    public final Handler f3324c;

    /* JADX INFO: renamed from: d */
    public final boolean f3325d;

    /* JADX INFO: renamed from: e */
    public final C0529no f3326e;

    public C0529no(Handler handler, boolean z) {
        this.f3324c = handler;
        this.f3325d = z;
        this._immediate = z ? this : null;
        C0529no c0529no = this._immediate;
        if (c0529no == null) {
            c0529no = new C0529no(handler, true);
            this._immediate = c0529no;
        }
        this.f3326e = c0529no;
    }

    @Override // p000.InterfaceC0223fg
    /* JADX INFO: renamed from: c */
    public final void mo1099c(long j, C0698s8 c0698s8) {
        RunnableC0282h1 runnableC0282h1 = new RunnableC0282h1(c0698s8, this, 6, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f3324c.postDelayed(runnableC0282h1, j)) {
            c0698s8.m2322n(new C0492mo(this, runnableC0282h1));
        } else {
            m1958f(c0698s8.f4217e, runnableC0282h1);
        }
    }

    @Override // p000.AbstractC0445le
    /* JADX INFO: renamed from: d */
    public final void mo584d(InterfaceC0295he interfaceC0295he, Runnable runnable) {
        if (this.f3324c.post(runnable)) {
            return;
        }
        m1958f(interfaceC0295he, runnable);
    }

    @Override // p000.AbstractC0445le
    /* JADX INFO: renamed from: e */
    public final boolean mo1760e() {
        return (this.f3325d && AbstractC0493mp.m1853c(Looper.myLooper(), this.f3324c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0529no) && ((C0529no) obj).f3324c == this.f3324c;
    }

    /* JADX INFO: renamed from: f */
    public final void m1958f(InterfaceC0295he interfaceC0295he, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0641qp interfaceC0641qp = (InterfaceC0641qp) interfaceC0295he.mo447b(C0893xh.f5252h);
        if (interfaceC0641qp != null) {
            ((C0040aq) interfaceC0641qp).m454m(cancellationException);
        }
        AbstractC0929yg.f5431b.mo584d(interfaceC0295he, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3324c);
    }

    @Override // p000.AbstractC0445le
    public final String toString() {
        C0529no c0529no;
        String str;
        C0928yf c0928yf = AbstractC0929yg.f5430a;
        C0529no c0529no2 = AbstractC0607ps.f3752a;
        if (this == c0529no2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c0529no = c0529no2.f3326e;
            } catch (UnsupportedOperationException unused) {
                c0529no = null;
            }
            str = this == c0529no ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f3324c.toString();
        return this.f3325d ? g40.m1146i(string, ".immediate") : string;
    }
}
