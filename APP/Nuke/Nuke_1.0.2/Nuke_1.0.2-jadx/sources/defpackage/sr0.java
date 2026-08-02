package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sr0 implements g22 {
    public final r5 h;
    public final ws1 i;
    public long j = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sr0(r5 r5Var, ws1 ws1Var) {
        this.h = r5Var;
        this.i = ws1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g22
    public final long a(d11 d11Var, long j, d61 d61Var, long j2) {
        long jA = this.i.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.j;
        }
        this.j = jA;
        return z01.c(z01.c((((long) d11Var.b) & 4294967295L) | (((long) d11Var.a) << 32), tp0.J(jA)), this.h.a(j2, 0L, d61Var));
    }
}
