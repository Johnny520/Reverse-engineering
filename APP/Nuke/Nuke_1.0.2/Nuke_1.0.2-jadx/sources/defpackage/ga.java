package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ga implements j20 {
    public final View h;
    public final o03 i;
    public final j20 j;
    public final AtomicReference k = new AtomicReference(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ga(View view, o03 o03Var, j20 j20Var) {
        this.h = view;
        this.i = o03Var;
        this.j = j20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(u91 u91Var, u00 u00Var) {
        da daVar;
        if (u00Var instanceof da) {
            daVar = (da) u00Var;
            int i = daVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                daVar.m = i - Integer.MIN_VALUE;
            } else {
                daVar = new da(this, u00Var);
            }
        }
        Object obj = daVar.k;
        int i2 = daVar.m;
        if (i2 == 0) {
            fg1.T(obj);
            fa faVar = new fa(0, u91Var, this);
            t00 t00Var = null;
            a2 a2Var = new a2(this, t00Var, 4);
            daVar.m = 1;
            if (te.u(new k9(faVar, this.k, a2Var, t00Var, 8), daVar) == k20.h) {
                return;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            fg1.T(obj);
        }
        s.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j20
    public final a20 g() {
        return this.j.g();
    }
}
