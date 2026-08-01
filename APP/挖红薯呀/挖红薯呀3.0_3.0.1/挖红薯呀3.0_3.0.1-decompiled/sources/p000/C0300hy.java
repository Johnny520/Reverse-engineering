package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: hy */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0300hy extends AbstractC0692rk implements InterfaceC0657qm {

    /* JADX INFO: renamed from: f */
    public final Handler f2372f;

    /* JADX INFO: renamed from: g */
    public final String f2373g;

    /* JADX INFO: renamed from: h */
    public final boolean f2374h;

    /* JADX INFO: renamed from: i */
    public final C0300hy f2375i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0300hy(Handler handler, String str, boolean z) {
        this.f2372f = handler;
        this.f2373g = str;
        this.f2374h = z;
        this.f2375i = z ? this : new C0300hy(handler, str, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0657qm
    /* JADX INFO: renamed from: c */
    public final InterfaceC0622po mo1073c(long j, final k81 k81Var, InterfaceC0618pk interfaceC0618pk) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f2372f.postDelayed(k81Var, j)) {
            return new InterfaceC0622po() { // from class: fy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0622po
                /* JADX INFO: renamed from: a */
                public final void mo623a() {
                    this.f1819d.f2372f.removeCallbacks(k81Var);
                }
            };
        }
        m1510j(interfaceC0618pk, k81Var);
        return xj0.f7353d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0657qm
    /* JADX INFO: renamed from: d */
    public final void mo1074d(long j, C0884wc c0884wc) {
        RunnableC0263gy runnableC0263gy = new RunnableC0263gy(c0884wc, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f2372f.postDelayed(runnableC0263gy, j)) {
            c0884wc.m4994y(new C0073c(6, this, runnableC0263gy));
        } else {
            m1510j(c0884wc.f7077h, runnableC0263gy);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    /* JADX INFO: renamed from: e */
    public final void mo358e(InterfaceC0618pk interfaceC0618pk, Runnable runnable) {
        if (this.f2372f.post(runnable)) {
            return;
        }
        m1510j(interfaceC0618pk, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0300hy)) {
            return false;
        }
        C0300hy c0300hy = (C0300hy) obj;
        return c0300hy.f2372f == this.f2372f && c0300hy.f2374h == this.f2374h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    /* JADX INFO: renamed from: f */
    public final boolean mo1509f(InterfaceC0618pk interfaceC0618pk) {
        return (this.f2374h && p30.m3002l(Looper.myLooper(), this.f2372f.getLooper())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f2374h ? 1231 : 1237) ^ System.identityHashCode(this.f2372f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1510j(InterfaceC0618pk interfaceC0618pk, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        c40 c40Var = (c40) interfaceC0618pk.mo64l(C0496n2.f4129I);
        if (c40Var != null) {
            c40Var.mo478a(cancellationException);
        }
        C0436lm c0436lm = AbstractC0326io.f2592a;
        ExecutorC0060bm.f545f.mo358e(interfaceC0618pk, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    public final String toString() {
        C0300hy c0300hy;
        String str;
        C0436lm c0436lm = AbstractC0326io.f2592a;
        C0300hy c0300hy2 = ad0.f110a;
        if (this == c0300hy2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c0300hy = c0300hy2.f2375i;
            } catch (UnsupportedOperationException unused) {
                c0300hy = null;
            }
            str = this == c0300hy ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f2373g;
        if (string == null) {
            string = this.f2372f.toString();
        }
        if (!this.f2374h) {
            return string;
        }
        return string + ".immediate";
    }

    public C0300hy(Handler handler) {
        this(handler, null, false);
    }
}
