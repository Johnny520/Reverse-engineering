package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ia extends w51 implements in0 {
    public final /* synthetic */ d22 i;
    public final /* synthetic */ xm0 j;
    public final /* synthetic */ h22 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ d61 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(d22 d22Var, xm0 xm0Var, h22 h22Var, String str, d61 d61Var) {
        super(1);
        this.i = d22Var;
        this.j = xm0Var;
        this.k = h22Var;
        this.l = str;
        this.m = d61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        d22 d22Var = this.i;
        d22Var.w.addView(d22Var, d22Var.x);
        d22Var.o(this.j, this.k, this.l, this.m);
        return new f8(1, d22Var);
    }
}
