package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qa3 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public cf3 f8860a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f8861b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gt1 f8862c;

    public qa3(View view, gt1 gt1Var) {
        this.f8861b = view;
        this.f8862c = gt1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        cf3 cf3VarM769c = cf3.m769c(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        gt1 gt1Var = this.f8862c;
        if (i < 30) {
            ra3.m4424a(windowInsets, this.f8861b);
            if (cf3VarM769c.equals(this.f8860a)) {
                return gt1Var.mo333b(view, cf3VarM769c).m770b();
            }
        }
        this.f8860a = cf3VarM769c;
        cf3 cf3VarMo333b = gt1Var.mo333b(view, cf3VarM769c);
        if (i >= 30) {
            return cf3VarMo333b.m770b();
        }
        int i2 = wa3.f12444a;
        view.requestApplyInsets();
        return cf3VarMo333b.m770b();
    }
}
