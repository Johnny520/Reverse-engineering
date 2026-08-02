package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: oe */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0540oe implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7641a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7642b;

    public /* synthetic */ C0540oe(int i, Object obj) {
        this.f7641a = i;
        this.f7642b = obj;
    }

    public final void onBackInvoked() {
        int i = this.f7641a;
        Object obj = this.f7642b;
        switch (i) {
            case 0:
                xm0 xm0Var = (xm0) obj;
                if (xm0Var != null) {
                    xm0Var.mo6a();
                }
                break;
            default:
                ((ht1) obj).m2515a();
                break;
        }
    }
}
