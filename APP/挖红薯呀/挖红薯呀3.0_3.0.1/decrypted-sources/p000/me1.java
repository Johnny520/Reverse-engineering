package p000;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class me1 implements v90 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0286hk f3923d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0715s6 f3924e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ot0 f3925f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zt0 f3926g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ View f3927h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public me1(C0286hk c0286hk, C0715s6 c0715s6, ot0 ot0Var, zt0 zt0Var, View view) {
        this.f3923d = c0286hk;
        this.f3924e = c0715s6;
        this.f3925f = ot0Var;
        this.f3926g = zt0Var;
        this.f3927h = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v90
    /* JADX INFO: renamed from: e */
    public final void mo350e(x90 x90Var, q90 q90Var) {
        boolean z;
        InterfaceC0798uc interfaceC0798ucM2956y = null;
        switch (le1.f3425a[q90Var.ordinal()]) {
            case 1:
                AbstractC0307i4.m1547w(this.f3923d, null, new C0162e7(this.f3926g, this.f3925f, x90Var, this, this.f3927h, null, 3), 1);
                return;
            case 2:
                C0715s6 c0715s6 = this.f3924e;
                if (c0715s6 != null) {
                    d50 d50Var = (d50) c0715s6.f5657f;
                    synchronized (d50Var.f970b) {
                        try {
                            synchronized (d50Var.f970b) {
                                z = d50Var.f969a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) d50Var.f971c;
                                d50Var.f971c = (ArrayList) d50Var.f972d;
                                d50Var.f972d = arrayList;
                                d50Var.f969a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((InterfaceC0322ik) arrayList.get(i)).mo541i(na1.f4229a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ot0 ot0Var = this.f3925f;
                synchronized (ot0Var.f4633c) {
                    if (ot0Var.f4650t) {
                        ot0Var.f4650t = false;
                        interfaceC0798ucM2956y = ot0Var.m2956y();
                    }
                    break;
                }
                if (interfaceC0798ucM2956y != null) {
                    ((C0884wc) interfaceC0798ucM2956y).mo541i(na1.f4229a);
                    return;
                }
                return;
            case 3:
                ot0 ot0Var2 = this.f3925f;
                synchronized (ot0Var2.f4633c) {
                    ot0Var2.f4650t = true;
                }
                return;
            case 4:
                this.f3925f.m2955x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                C0921xc.m5129j();
                return;
        }
    }
}
