package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b6 extends w51 implements on0 {
    public final /* synthetic */ d6 i;
    public final /* synthetic */ int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(d6 d6Var, int i) {
        super(4);
        this.i = d6Var;
        this.j = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        d6 d6Var = this.i;
        hh1 hh1Var = d6Var.h;
        ((AutofillManager) hh1Var.i).notifyViewEntered(d6Var.j, this.j, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return a83.a;
    }
}
