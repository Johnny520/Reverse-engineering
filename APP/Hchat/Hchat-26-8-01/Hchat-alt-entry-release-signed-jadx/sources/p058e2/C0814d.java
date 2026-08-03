package p058e2;

import android.os.CancellationSignal;
import p100h0.C1511d1;
import p119i2.C1939m0;
import p249qg.C3560e1;
import p321w.C4629q0;

/* JADX INFO: renamed from: e2.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0814d implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2447b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0814d(Object obj, int i9) {
        this.f2446a = i9;
        this.f2447b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f2446a) {
            case 0:
                ((C3560e1) this.f2447b).mo7485a(null);
                break;
            default:
                C1511d1 c1511d1 = (C1511d1) this.f2447b;
                if (c1511d1 != null) {
                    C4629q0 c4629q0 = c1511d1.f5032d;
                    if (c4629q0 != null) {
                        c4629q0.m9052e(C1939m0.f6573b);
                    }
                    C4629q0 c4629q02 = c1511d1.f5032d;
                    if (c4629q02 != null) {
                        c4629q02.m9053f(C1939m0.f6573b);
                    }
                }
                break;
        }
    }
}
