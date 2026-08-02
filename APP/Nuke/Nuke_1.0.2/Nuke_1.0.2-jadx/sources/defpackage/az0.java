package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class az0 implements gu2 {
    public Float h;
    public Float i;
    public final nx1 j;
    public cy2 k;
    public boolean l;
    public boolean m;
    public long n;
    public final /* synthetic */ cz0 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public az0(cz0 cz0Var, Float f, Float f2, zy0 zy0Var) {
        this.o = cz0Var;
        this.h = f;
        this.i = f2;
        this.j = op0.u(f);
        this.k = new cy2(zy0Var, rg3.n, this.h, this.i, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gu2
    public final Object getValue() {
        return this.j.getValue();
    }
}
