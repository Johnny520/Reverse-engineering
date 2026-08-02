package defpackage;

import android.os.Process;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ph implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ in0 i;
    public final /* synthetic */ xk1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ph(in0 in0Var, xk1 xk1Var, int i) {
        this.h = i;
        this.i = in0Var;
        this.j = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.j;
        in0 in0Var = this.i;
        switch (i) {
            case 0:
                in0Var.j((Set) xk1Var.getValue());
                break;
            case 1:
                in0Var.j((Set) xk1Var.getValue());
                break;
            case 2:
                in0Var.j(new cr((List) xk1Var.getValue()));
                break;
            case 3:
                in0Var.j((String) xk1Var.getValue());
                break;
            default:
                xk1Var.setValue(Boolean.FALSE);
                in0Var.j(Boolean.TRUE);
                pp1 pp1Var = pp1.a;
                if (pp1.d() != vu0.i) {
                    Process.killProcess(Process.myPid());
                } else {
                    fd3.b();
                }
                break;
        }
        return a83Var;
    }
}
