package p000;

import java.util.Set;

/* JADX INFO: renamed from: lh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0424lh implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6115h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xk1 f6116i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f6117j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xk1 f6118k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ xk1 f6119l;

    public /* synthetic */ C0424lh(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, int i) {
        this.f6115h = i;
        this.f6116i = xk1Var;
        this.f6117j = xk1Var2;
        this.f6118k = xk1Var3;
        this.f6119l = xk1Var4;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f6115h;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f6119l;
        xk1 xk1Var2 = this.f6118k;
        xk1 xk1Var3 = this.f6117j;
        xk1 xk1Var4 = this.f6116i;
        Set set = (Set) obj;
        switch (i) {
            case 0:
                set.getClass();
                if (((Boolean) xk1Var4.getValue()).booleanValue()) {
                    xk1Var3.setValue(set);
                } else {
                    xk1Var2.setValue(set);
                }
                xk1Var.setValue(Boolean.FALSE);
                break;
            default:
                set.getClass();
                if (((Boolean) xk1Var4.getValue()).booleanValue()) {
                    xk1Var3.setValue(set);
                } else {
                    xk1Var2.setValue(set);
                }
                xk1Var.setValue(Boolean.FALSE);
                break;
        }
        return a83Var;
    }
}
