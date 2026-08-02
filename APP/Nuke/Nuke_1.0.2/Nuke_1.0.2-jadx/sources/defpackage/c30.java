package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c30 extends m30 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w53
    public final o43 a() {
        return o43.g(this.i.i.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dz
    public final int e(dz dzVar) {
        m30 m30Var = (m30) dzVar;
        int iCompareTo = this.h.compareTo(m30Var.h);
        o30 o30Var = this.i;
        if (iCompareTo == 0) {
            iCompareTo = o30Var.h.compareTo(m30Var.i.h);
        }
        return iCompareTo != 0 ? iCompareTo : o30Var.i.compareTo(((c30) dzVar).i.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dz
    public final String f() {
        return "field";
    }
}
