package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d6 extends si implements xk0 {
    public final hh1 h;
    public final tn2 i;
    public final b7 j;
    public final q62 k;
    public final String l;
    public final Rect m = new Rect();
    public final AutofillId n;
    public final ak1 o;
    public boolean p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d6(hh1 hh1Var, tn2 tn2Var, b7 b7Var, q62 q62Var, String str) {
        this.h = hh1Var;
        this.i = tn2Var;
        this.j = b7Var;
        this.k = q62Var;
        this.l = str;
        b7Var.setImportantForAutofill(1);
        AutofillId autofillId = b7Var.getAutofillId();
        if (autofillId == null) {
            throw vi0.e("Required value was null.");
        }
        this.n = autofillId;
        this.o = new ak1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xk0
    public final void a(pl0 pl0Var, pl0 pl0Var2) {
        r61 r61VarC0;
        ln2 ln2VarW;
        r61 r61VarC02;
        ln2 ln2VarW2;
        if (pl0Var != null && (r61VarC02 = sp0.c0(pl0Var)) != null && (ln2VarW2 = r61VarC02.w()) != null) {
            rk1 rk1Var = ln2VarW2.h;
            if (rk1Var.b(kn2.g) || rk1Var.b(kn2.h)) {
                ((AutofillManager) this.h.i).notifyViewExited(this.j, r61VarC02.i);
            }
        }
        if (pl0Var2 == null || (r61VarC0 = sp0.c0(pl0Var2)) == null || (ln2VarW = r61VarC0.w()) == null) {
            return;
        }
        rk1 rk1Var2 = ln2VarW.h;
        if (rk1Var2.b(kn2.g) || rk1Var2.b(kn2.h)) {
            int i = r61VarC0.i;
            this.k.b.v(i, new b6(this, i));
        }
    }
}
