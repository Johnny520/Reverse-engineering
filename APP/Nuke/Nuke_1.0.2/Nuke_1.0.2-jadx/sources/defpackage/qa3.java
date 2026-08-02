package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qa3 implements View.OnApplyWindowInsetsListener {
    public cf3 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ gt1 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public qa3(View view, gt1 gt1Var) {
        this.b = view;
        this.c = gt1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        cf3 cf3VarC = cf3.c(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        gt1 gt1Var = this.c;
        if (i < 30) {
            ra3.a(windowInsets, this.b);
            if (cf3VarC.equals(this.a)) {
                return gt1Var.b(view, cf3VarC).b();
            }
        }
        this.a = cf3VarC;
        cf3 cf3VarB = gt1Var.b(view, cf3VarC);
        if (i >= 30) {
            return cf3VarB.b();
        }
        int i2 = wa3.a;
        view.requestApplyInsets();
        return cf3VarB.b();
    }
}
