package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gq0 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ in0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gq0(in0 in0Var, int i) {
        this.h = i;
        this.i = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        long j;
        switch (this.h) {
            case 0:
                bs2 bs2Var = (bs2) obj;
                synchronized (ds2.c) {
                    j = ds2.e;
                    ds2.e = 1 + j;
                }
                return new l52(j, bs2Var, this.i);
            default:
                return this.i.j(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
