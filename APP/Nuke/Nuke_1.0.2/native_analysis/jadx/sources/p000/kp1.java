package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kp1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f5699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xk1 f5700b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xk1 f5701c;

    public kp1(boolean z, xk1 xk1Var, xk1 xk1Var2) {
        this.f5699a = z;
        this.f5700b = xk1Var;
        this.f5701c = xk1Var2;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s12 s12Var, t00 t00Var) {
        if (this.f5699a) {
            Object objM6513M0 = ((zw2) s12Var).m6513M0(new lm0(this.f5700b, this.f5701c, null, 3), t00Var);
            if (objM6513M0 == k20.f5323h) {
                return objM6513M0;
            }
        }
        return a83.f116a;
    }
}
