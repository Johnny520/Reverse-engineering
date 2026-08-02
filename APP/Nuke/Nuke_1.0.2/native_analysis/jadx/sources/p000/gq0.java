package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gq0 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3656h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ in0 f3657i;

    public /* synthetic */ gq0(in0 in0Var, int i) {
        this.f3656h = i;
        this.f3657i = in0Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        long j;
        switch (this.f3656h) {
            case 0:
                bs2 bs2Var = (bs2) obj;
                synchronized (ds2.f2181c) {
                    j = ds2.f2183e;
                    ds2.f2183e = 1 + j;
                }
                return new l52(j, bs2Var, this.f3657i);
            default:
                return this.f3657i.mo5j(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
