package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ma2 extends s2 {
    public int j;
    public int k;
    public final /* synthetic */ na2 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ma2(na2 na2Var) {
        this.l = na2Var;
        this.j = na2Var.k;
        this.k = na2Var.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.s2
    public final void a() {
        int i = this.j;
        if (i == 0) {
            this.h = 2;
            return;
        }
        na2 na2Var = this.l;
        Object[] objArr = na2Var.h;
        int i2 = this.k;
        this.i = objArr[i2];
        this.h = 1;
        this.k = (i2 + 1) % na2Var.i;
        this.j = i - 1;
    }
}
