package p000;

import android.os.CancellationSignal;

/* JADX INFO: renamed from: dx */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0145dx implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2248a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2249b;

    public /* synthetic */ C0145dx(int i, Object obj) {
        this.f2248a = i;
        this.f2249b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.f2248a;
        Object obj = this.f2249b;
        switch (i) {
            case 0:
                ((zt2) obj).mo1704c(null);
                break;
            default:
                b03 b03Var = (b03) obj;
                if (b03Var != null) {
                    t91 t91Var = b03Var.f483d;
                    if (t91Var != null) {
                        t91Var.m5147e(f13.f2737b);
                    }
                    t91 t91Var2 = b03Var.f483d;
                    if (t91Var2 != null) {
                        t91Var2.m5148f(f13.f2737b);
                    }
                }
                break;
        }
    }
}
