package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zo1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: b */
    public static final zo1 f13995b = new zo1(0);

    /* JADX INFO: renamed from: c */
    public static final zo1 f13996c = new zo1(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13997a;

    public /* synthetic */ zo1(int i) {
        this.f13997a = i;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s12 s12Var, t00 t00Var) {
        int i = this.f13997a;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                Object objM6513M0 = ((zw2) s12Var).m6513M0(new yo1(2, null), t00Var);
                return objM6513M0 == k20.f5323h ? objM6513M0 : a83Var;
            default:
                return a83Var;
        }
    }
}
