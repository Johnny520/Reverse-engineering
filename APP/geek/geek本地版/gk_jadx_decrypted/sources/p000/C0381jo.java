package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: jo */
/* JADX INFO: loaded from: classes.dex */
public final class C0381jo extends AbstractC0408ke implements InterfaceC0186eg {
    private volatile C0381jo _immediate;

    /* JADX INFO: renamed from: c */
    public final Handler f2651c;

    /* JADX INFO: renamed from: d */
    public final boolean f2652d;

    /* JADX INFO: renamed from: e */
    public final C0381jo f2653e;

    public C0381jo(Handler handler, boolean z) {
        this.f2651c = handler;
        this.f2652d = z;
        this._immediate = z ? this : null;
        C0381jo c0381jo = this._immediate;
        if (c0381jo == null) {
            c0381jo = new C0381jo(handler, true);
            this._immediate = c0381jo;
        }
        this.f2653e = c0381jo;
    }

    @Override // p000.InterfaceC0186eg
    /* JADX INFO: renamed from: c */
    public final void mo1026c(long j, C0326i8 c0326i8) {
        RunnableC0282h1 runnableC0282h1 = new RunnableC0282h1(c0326i8, this, 6, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f2651c.postDelayed(runnableC0282h1, j)) {
            c0326i8.m1413n(new C0341io(this, runnableC0282h1));
        } else {
            m1606f(c0326i8.f2367e, runnableC0282h1);
        }
    }

    @Override // p000.AbstractC0408ke
    /* JADX INFO: renamed from: d */
    public final void mo1598d(InterfaceC0258ge interfaceC0258ge, Runnable runnable) {
        if (this.f2651c.post(runnable)) {
            return;
        }
        m1606f(interfaceC0258ge, runnable);
    }

    @Override // p000.AbstractC0408ke
    /* JADX INFO: renamed from: e */
    public final boolean mo1605e() {
        return (this.f2652d && AbstractC0346ip.m1497i(Looper.myLooper(), this.f2651c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0381jo) && ((C0381jo) obj).f2651c == this.f2651c;
    }

    /* JADX INFO: renamed from: f */
    public final void m1606f(InterfaceC0258ge interfaceC0258ge, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0493mp interfaceC0493mp = (InterfaceC0493mp) interfaceC0258ge.mo1272b(C0819vh.f4849h);
        if (interfaceC0493mp != null) {
            ((C0864wp) interfaceC0493mp).m2585m(cancellationException);
        }
        AbstractC0855wg.f4965b.mo1598d(interfaceC0258ge, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2651c);
    }

    @Override // p000.AbstractC0408ke
    public final String toString() {
        C0381jo c0381jo;
        String str;
        C0891xf c0891xf = AbstractC0855wg.f4964a;
        C0381jo c0381jo2 = AbstractC0459ls.f3102a;
        if (this == c0381jo2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c0381jo = c0381jo2.f2653e;
            } catch (UnsupportedOperationException unused) {
                c0381jo = null;
            }
            str = this == c0381jo ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f2651c.toString();
        return this.f2652d ? z30.m2764i(string, ".immediate") : string;
    }
}
