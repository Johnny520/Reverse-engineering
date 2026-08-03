package p263rg;

import android.os.Handler;
import android.os.Looper;
import gg.AbstractC1416l;
import java.util.concurrent.CancellationException;
import p025bc.AbstractC0255e;
import p174m.C2576b;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3591p;
import p249qg.C3554c1;
import p249qg.C3564g;
import p249qg.C3593q;
import p249qg.InterfaceC3556d0;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3609y;
import p249qg.RunnableC3575j1;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import vg.AbstractC4564m;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: rg.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3808e extends AbstractC3591p implements InterfaceC3609y {

    /* JADX INFO: renamed from: i */
    public final Handler f12494i;

    /* JADX INFO: renamed from: j */
    public final String f12495j;

    /* JADX INFO: renamed from: k */
    public final boolean f12496k;

    /* JADX INFO: renamed from: l */
    public final C3808e f12497l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3808e(Handler handler, String str, boolean z9) {
        this.f12494i = handler;
        this.f12495j = str;
        this.f12496k = z9;
        this.f12497l = z9 ? this : new C3808e(handler, str, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3808e)) {
            return false;
        }
        C3808e c3808e = (C3808e) obj;
        return c3808e.f12494i == this.f12494i && c3808e.f12496k == this.f12496k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return System.identityHashCode(this.f12494i) ^ (this.f12496k ? 1231 : 1237);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3609y
    /* JADX INFO: renamed from: q */
    public final InterfaceC3556d0 mo7536q(long j3, final RunnableC3575j1 runnableC3575j1, InterfaceC5561g interfaceC5561g) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f12494i.postDelayed(runnableC3575j1, j3)) {
            return new InterfaceC3556d0() { // from class: rg.c
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p249qg.InterfaceC3556d0
                /* JADX INFO: renamed from: a */
                public final void mo7492a() {
                    this.f12489g.f12494i.removeCallbacks(runnableC3575j1);
                }
            };
        }
        m7997z(interfaceC5561g, runnableC3575j1);
        return C3554c1.f11556g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    public final String toString() {
        C3808e c3808e;
        String str;
        C5808e c5808e = AbstractC3553c0.f11555a;
        C3808e c3808e2 = AbstractC4564m.f15049a;
        if (this == c3808e2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c3808e = c3808e2.f12497l;
            } catch (UnsupportedOperationException unused) {
                c3808e = null;
            }
            str = this == c3808e ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f12495j;
        if (string == null) {
            string = this.f12494i.toString();
        }
        return this.f12496k ? AbstractC0255e.m1020i(string, ".immediate") : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3609y
    /* JADX INFO: renamed from: u */
    public final void mo7537u(long j3, C3564g c3564g) {
        RunnableC3807d runnableC3807d = new RunnableC3807d(c3564g, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f12494i.postDelayed(runnableC3807d, j3)) {
            c3564g.m7515r(new C2576b(this, 11, runnableC3807d));
        } else {
            m7997z(c3564g.f11567k, runnableC3807d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    /* JADX INFO: renamed from: w */
    public final void mo7538w(InterfaceC5561g interfaceC5561g, Runnable runnable) {
        if (this.f12494i.post(runnable)) {
            return;
        }
        m7997z(interfaceC5561g, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    /* JADX INFO: renamed from: x */
    public final boolean mo7542x(InterfaceC5561g interfaceC5561g) {
        return (this.f12496k && AbstractC1416l.m3825a(Looper.myLooper(), this.f12494i.getLooper())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m7997z(InterfaceC5561g interfaceC5561g, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) interfaceC5561g.mo2062s(C3593q.f11607h);
        if (interfaceC3596r0 != null) {
            interfaceC3596r0.mo7485a(cancellationException);
        }
        C5808e c5808e = AbstractC3553c0.f11555a;
        ExecutorC5807d.f23583i.mo7538w(interfaceC5561g, runnable);
    }

    public C3808e(Handler handler) {
        this(handler, null, false);
    }
}
