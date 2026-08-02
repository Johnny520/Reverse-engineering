package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dx implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ dx(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((zt2) obj).c(null);
                break;
            default:
                b03 b03Var = (b03) obj;
                if (b03Var != null) {
                    t91 t91Var = b03Var.d;
                    if (t91Var != null) {
                        t91Var.e(f13.b);
                    }
                    t91 t91Var2 = b03Var.d;
                    if (t91Var2 != null) {
                        t91Var2.f(f13.b);
                    }
                }
                break;
        }
    }
}
