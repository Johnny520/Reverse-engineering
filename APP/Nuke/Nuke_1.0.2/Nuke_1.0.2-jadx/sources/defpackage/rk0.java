package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rk0 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ sk0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rk0(sk0 sk0Var, int i) {
        super(1);
        this.i = i;
        this.j = sk0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        a83 a83Var = a83.a;
        sk0 sk0Var = this.j;
        switch (i) {
            case 0:
                jp jpVar = (jp) obj;
                View viewJ = pp0.j(sk0Var);
                if (!viewJ.isFocused() && !viewJ.hasFocus()) {
                    yk0 focusOwner = ((b7) sp0.f0(sk0Var)).getFocusOwner();
                    View viewH = tp0.H(sk0Var);
                    Integer numC = vk0.c(jpVar.a);
                    int[] iArr = new int[2];
                    viewH.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewJ.getLocationOnScreen(iArr2);
                    pl0 pl0VarA0 = rp0.a0(((bl0) focusOwner).c);
                    Rect rect = null;
                    o62 o62VarE0 = pl0VarA0 != null ? rp0.e0(pl0VarA0) : null;
                    if (o62VarE0 != null) {
                        int i2 = (int) o62VarE0.a;
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = (int) o62VarE0.b;
                        int i6 = iArr[1];
                        int i7 = iArr2[1];
                        rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) o62VarE0.c) + i3) - i4, (((int) o62VarE0.d) + i6) - i7);
                    }
                    if (!vk0.b(viewJ, numC, rect)) {
                        jpVar.b = true;
                    }
                }
                break;
            default:
                pp0.j(sk0Var);
                break;
        }
        return a83Var;
    }
}
