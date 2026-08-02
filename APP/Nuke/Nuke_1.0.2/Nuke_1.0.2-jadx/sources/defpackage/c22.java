package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c22 extends w51 implements xm0 {
    public final /* synthetic */ b72 i;
    public final /* synthetic */ d22 j;
    public final /* synthetic */ d11 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c22(b72 b72Var, d22 d22Var, d11 d11Var, long j, long j2) {
        super(0);
        this.i = b72Var;
        this.j = d22Var;
        this.k = d11Var;
        this.l = j;
        this.m = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        d22 d22Var = this.j;
        this.i.h = d22Var.getPositionProvider().a(this.k, this.l, d22Var.getParentLayoutDirection(), this.m);
        return a83.a;
    }
}
