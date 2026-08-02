package p000;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: i9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0306i9 implements ak0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4489h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f4490i;

    public /* synthetic */ C0306i9(int i, Object obj) {
        this.f4489h = i;
        this.f4490i = obj;
    }

    @Override // p000.ak0
    /* JADX INFO: renamed from: m */
    public final Object mo181m(Object obj, t00 t00Var) {
        int i = this.f4489h;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f4490i;
        switch (i) {
            case 0:
                sz0 sz0Var = (sz0) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    sz0Var.m5033F().startStylusHandwriting((View) sz0Var.f10436i);
                }
                return a83Var;
            case 1:
                ep1 ep1Var = (ep1) obj2;
                float f = ((C0132dj) obj).f2074c;
                if (ep1Var.f2553f != fp1.f3105j) {
                    return a83Var;
                }
                return ep1Var.f2549b.m4789e(t00Var, new Float(ep1Var.f2554g * (1.0f - ci0.m778C(f, 0.0f, 1.0f))));
            default:
                ((gi1) obj2).f3535j.m2592h(((Number) obj).floatValue());
                return a83Var;
        }
    }
}
