package p166g3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p000A.C0010F;
import p027E4.RunnableC0338y;
import p074O2.InterfaceC1051i;
import p117X2.AbstractC1665j;
import p160f3.AbstractC2100C;
import p160f3.AbstractC2153p;
import p160f3.C2130d0;
import p160f3.C2135g;
import p160f3.C2155q;
import p160f3.InterfaceC2101D;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2165y;
import p160f3.RunnableC2148m0;
import p190k3.AbstractC2466n;
import p201m3.C2608e;
import p201m3.ExecutorC2607d;

/* JADX INFO: renamed from: g3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2187d extends AbstractC2153p implements InterfaceC2165y {

    /* JADX INFO: renamed from: f */
    public final Handler f7150f;

    /* JADX INFO: renamed from: g */
    public final String f7151g;

    /* JADX INFO: renamed from: h */
    public final boolean f7152h;

    /* JADX INFO: renamed from: i */
    public final C2187d f7153i;

    public C2187d(Handler handler, String str, boolean z5) {
        this.f7150f = handler;
        this.f7151g = str;
        this.f7152h = z5;
        this.f7153i = z5 ? this : new C2187d(handler, str, true);
    }

    @Override // p160f3.AbstractC2153p
    /* JADX INFO: renamed from: D */
    public final void mo1207D(InterfaceC1051i interfaceC1051i, Runnable runnable) {
        if (this.f7150f.post(runnable)) {
            return;
        }
        m4009G(interfaceC1051i, runnable);
    }

    @Override // p160f3.AbstractC2153p
    /* JADX INFO: renamed from: E */
    public final boolean mo3975E(InterfaceC1051i interfaceC1051i) {
        return (this.f7152h && AbstractC1665j.m2981a(Looper.myLooper(), this.f7150f.getLooper())) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public final void m4009G(InterfaceC1051i interfaceC1051i, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC2115S interfaceC2115S = (InterfaceC2115S) interfaceC1051i.mo1166C(C2155q.f7102e);
        if (interfaceC2115S != null) {
            interfaceC2115S.mo3905c(cancellationException);
        }
        C2608e c2608e = AbstractC2100C.f7029a;
        ExecutorC2607d.f8303f.mo1207D(interfaceC1051i, runnable);
    }

    @Override // p160f3.InterfaceC2165y
    /* JADX INFO: renamed from: d */
    public final void mo3896d(long j5, C2135g c2135g) {
        RunnableC0338y runnableC0338y = new RunnableC0338y(2, c2135g, this);
        if (j5 > 4611686018427387903L) {
            j5 = 4611686018427387903L;
        }
        if (this.f7150f.postDelayed(runnableC0338y, j5)) {
            c2135g.m3970w(new C0010F(10, this, runnableC0338y));
        } else {
            m4009G(c2135g.f7078h, runnableC0338y);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2187d)) {
            return false;
        }
        C2187d c2187d = (C2187d) obj;
        return c2187d.f7150f == this.f7150f && c2187d.f7152h == this.f7152h;
    }

    @Override // p160f3.InterfaceC2165y
    /* JADX INFO: renamed from: f */
    public final InterfaceC2101D mo3897f(long j5, final RunnableC2148m0 runnableC2148m0, InterfaceC1051i interfaceC1051i) {
        if (j5 > 4611686018427387903L) {
            j5 = 4611686018427387903L;
        }
        if (this.f7150f.postDelayed(runnableC2148m0, j5)) {
            return new InterfaceC2101D() { // from class: g3.c
                @Override // p160f3.InterfaceC2101D
                /* JADX INFO: renamed from: a */
                public final void mo3883a() {
                    this.f7148d.f7150f.removeCallbacks(runnableC2148m0);
                }
            };
        }
        m4009G(interfaceC1051i, runnableC2148m0);
        return C2130d0.f7071d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f7150f) ^ (this.f7152h ? 1231 : 1237);
    }

    @Override // p160f3.AbstractC2153p
    public final String toString() {
        C2187d c2187d;
        String str;
        C2608e c2608e = AbstractC2100C.f7029a;
        C2187d c2187d2 = AbstractC2466n.f7954a;
        if (this == c2187d2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c2187d = c2187d2.f7153i;
            } catch (UnsupportedOperationException unused) {
                c2187d = null;
            }
            str = this == c2187d ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f7151g;
        if (string == null) {
            string = this.f7150f.toString();
        }
        if (!this.f7152h) {
            return string;
        }
        return string + ".immediate";
    }

    public C2187d(Handler handler) {
        this(handler, null, false);
    }
}
