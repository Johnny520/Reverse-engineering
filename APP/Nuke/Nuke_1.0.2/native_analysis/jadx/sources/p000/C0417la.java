package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: la */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0417la extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f5996i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ d22 f5997j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0417la(d22 d22Var, int i) {
        super(1);
        this.f5996i = i;
        this.f5997j = d22Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f5996i;
        a83 a83Var = a83.f116a;
        d22 d22Var = this.f5997j;
        switch (i) {
            case 0:
                c61 c61VarMo650j = ((c61) obj).mo650j();
                c61VarMo650j.getClass();
                d22Var.m933q(c61VarMo650j);
                break;
            case 1:
                d22Var.m6535setPopupContentSizefhxjrPA(new h11(((h11) obj).f3775a));
                d22Var.m934r();
                break;
            default:
                xm0 xm0Var = (xm0) obj;
                Handler handler = d22Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = d22Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0413l6(xm0Var, 5));
                    }
                } else {
                    xm0Var.mo6a();
                }
                break;
        }
        return a83Var;
    }
}
