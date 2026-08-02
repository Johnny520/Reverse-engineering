package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s10 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kz2 f9860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b03 f9861b;

    public s10(kz2 kz2Var, b03 b03Var) {
        this.f9860a = kz2Var;
        this.f9861b = b03Var;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s12 s12Var, t00 t00Var) {
        Object objM5238u = AbstractC0731te.m5238u(new r10(s12Var, this.f9860a, this.f9861b, null), t00Var);
        return objM5238u == k20.f5323h ? objM5238u : a83.f116a;
    }
}
