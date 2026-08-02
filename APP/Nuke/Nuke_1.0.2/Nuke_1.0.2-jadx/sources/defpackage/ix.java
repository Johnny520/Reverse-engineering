package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ix extends o2 {
    public final nx1 q;
    public boolean r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ix(Context context) {
        super(context);
        this.q = op0.u(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o2
    public final void a(int i, px pxVar) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(420213850);
        int i2 = 2;
        int i3 = (go0Var.h(this) ? 4 : 2) | i;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            mn0 mn0Var = (mn0) this.q.getValue();
            if (mn0Var == null) {
                go0Var.W(-1238823553);
            } else {
                go0Var.W(98585282);
                mn0Var.g(go0Var, 0);
            }
            go0Var.p(false);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n2(this, i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ix.class.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o2
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setContent(mn0 mn0Var) {
        this.r = true;
        this.q.setValue(mn0Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            e();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
