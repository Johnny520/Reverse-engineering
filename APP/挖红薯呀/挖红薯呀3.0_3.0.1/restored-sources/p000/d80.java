package p000;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class d80 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0742sw f989a;

    /* JADX INFO: renamed from: c */
    public d50 f991c;

    /* JADX INFO: renamed from: f */
    public int f994f;

    /* JADX INFO: renamed from: b */
    public final C0541o8 f990b = new C0541o8(7);

    /* JADX INFO: renamed from: d */
    public int f992d = -1;

    /* JADX INFO: renamed from: e */
    public int f993e = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d80(InterfaceC0742sw interfaceC0742sw) {
        this.f989a = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final c80 m660a(int i, long j, boolean z, InterfaceC0742sw interfaceC0742sw) {
        d50 d50Var = this.f991c;
        if (d50Var == null) {
            return C0898wq.f7169a;
        }
        cs0 cs0Var = (cs0) d50Var.f972d;
        boolean z2 = cs0Var instanceof ViewOnAttachStateChangeListenerC0344j6;
        bs0 bs0Var = new bs0(d50Var, i, this.f990b, interfaceC0742sw);
        bs0Var.f567d = new C0617pj(j);
        if (!z2) {
            cs0Var.mo601a(bs0Var);
        } else if (z) {
            ViewOnAttachStateChangeListenerC0344j6 viewOnAttachStateChangeListenerC0344j6 = (ViewOnAttachStateChangeListenerC0344j6) cs0Var;
            viewOnAttachStateChangeListenerC0344j6.f2739e.add(new ms0(1, bs0Var));
            if (!viewOnAttachStateChangeListenerC0344j6.f2740f) {
                viewOnAttachStateChangeListenerC0344j6.f2740f = true;
                viewOnAttachStateChangeListenerC0344j6.f2738d.post(viewOnAttachStateChangeListenerC0344j6);
            }
        } else {
            ViewOnAttachStateChangeListenerC0344j6 viewOnAttachStateChangeListenerC0344j62 = (ViewOnAttachStateChangeListenerC0344j6) cs0Var;
            viewOnAttachStateChangeListenerC0344j62.f2739e.add(new ms0(0, bs0Var));
            if (!viewOnAttachStateChangeListenerC0344j62.f2740f) {
                viewOnAttachStateChangeListenerC0344j62.f2740f = true;
                viewOnAttachStateChangeListenerC0344j62.f2738d.post(viewOnAttachStateChangeListenerC0344j62);
            }
        }
        Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
        return bs0Var;
    }
}
