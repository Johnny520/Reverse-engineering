package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bg3 implements xx, fa1 {
    public final b7 h;
    public final fy i;
    public boolean j;
    public ba1 k;
    public mn0 l = rw.a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bg3(b7 b7Var, fy fyVar) {
        this.h = b7Var;
        this.i = fyVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (!this.j) {
            this.j = true;
            this.h.getView().setTag(R.id.wrapped_composition_tag, null);
            ba1 ba1Var = this.k;
            if (ba1Var != null) {
                ba1Var.b(this);
            }
            this.k = null;
        }
        this.i.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(mn0 mn0Var) {
        this.h.setOnReadyForComposition(new fa(9, this, mn0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fa1
    public final void g(ia1 ia1Var, z91 z91Var) {
        if (z91Var == z91.ON_DESTROY) {
            a();
        } else {
            if (z91Var != z91.ON_CREATE || this.j) {
                return;
            }
            d(this.l);
        }
    }
}
