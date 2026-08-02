package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bc extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ab3 j;
    public final /* synthetic */ r61 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc(ab3 ab3Var, r61 r61Var, int i) {
        super(1);
        this.i = i;
        this.j = ab3Var;
        this.k = r61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        WindowInsets windowInsetsB;
        int i = this.i;
        a83 a83Var = a83.a;
        r61 r61Var = this.k;
        ab3 ab3Var = this.j;
        switch (i) {
            case 0:
                zv1 zv1Var = (zv1) obj;
                b7 b7Var = zv1Var instanceof b7 ? (b7) zv1Var : null;
                if (b7Var != null) {
                    b7Var.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(ab3Var, r61Var);
                    b7Var.getAndroidViewsHandler$ui().addView(ab3Var);
                    b7Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(r61Var, ab3Var);
                    ab3Var.setImportantForAccessibility(1);
                    wa3.a(ab3Var, new q6(b7Var, r61Var, b7Var));
                }
                if (ab3Var.getView().getParent() != ab3Var) {
                    ab3Var.addView(ab3Var.getView());
                }
                break;
            case 1:
                op0.f(ab3Var, r61Var);
                break;
            default:
                op0.f(ab3Var, r61Var);
                ((b7) ab3Var.j).O = true;
                int[] iArr = ab3Var.u;
                int i2 = iArr[0];
                int i3 = iArr[1];
                ab3Var.getView().getLocationOnScreen(iArr);
                long j = ab3Var.v;
                long jL = ((c61) obj).L();
                ab3Var.v = jL;
                cf3 cf3Var = ab3Var.w;
                if (cf3Var != null && ((i2 != iArr[0] || i3 != iArr[1] || !h11.a(j, jL)) && (windowInsetsB = ab3Var.g(cf3Var).b()) != null)) {
                    ab3Var.getView().dispatchApplyWindowInsets(windowInsetsB);
                }
                break;
        }
        return a83Var;
    }
}
