package p000;

import android.os.Process;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ph */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0580ph implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8345h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ in0 f8346i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f8347j;

    public /* synthetic */ C0580ph(in0 in0Var, xk1 xk1Var, int i) {
        this.f8345h = i;
        this.f8346i = in0Var;
        this.f8347j = xk1Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f8345h;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f8347j;
        in0 in0Var = this.f8346i;
        switch (i) {
            case 0:
                in0Var.mo5j((Set) xk1Var.getValue());
                break;
            case 1:
                in0Var.mo5j((Set) xk1Var.getValue());
                break;
            case 2:
                in0Var.mo5j(new C0103cr((List) xk1Var.getValue()));
                break;
            case 3:
                in0Var.mo5j((String) xk1Var.getValue());
                break;
            default:
                xk1Var.setValue(Boolean.FALSE);
                in0Var.mo5j(Boolean.TRUE);
                pp1 pp1Var = pp1.f8445a;
                if (pp1.m3932d() != vu0.f12174i) {
                    Process.killProcess(Process.myPid());
                } else {
                    fd3.m1599b();
                }
                break;
        }
        return a83Var;
    }
}
