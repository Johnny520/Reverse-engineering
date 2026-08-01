package p051J;

import android.os.CancellationSignal;
import p000A.C0078o0;
import p058L.C0920W;
import p092S0.C1259L;
import p160f3.C2136g0;

/* JADX INFO: renamed from: J.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0820l implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2637a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2638b;

    public /* synthetic */ C0820l(int i5, Object obj) {
        this.f2637a = i5;
        this.f2638b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f2637a) {
            case 0:
                C0920W c0920w = (C0920W) this.f2638b;
                if (c0920w != null) {
                    C0078o0 c0078o0 = c0920w.f2868d;
                    if (c0078o0 != null) {
                        c0078o0.m124e(C1259L.f4536b);
                    }
                    C0078o0 c0078o02 = c0920w.f2868d;
                    if (c0078o02 != null) {
                        c0078o02.m125f(C1259L.f4536b);
                    }
                }
                break;
            default:
                ((C2136g0) this.f2638b).mo3905c(null);
                break;
        }
    }
}
