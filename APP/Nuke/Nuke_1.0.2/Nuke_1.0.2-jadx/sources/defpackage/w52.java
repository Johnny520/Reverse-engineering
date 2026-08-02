package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w52 extends u92 {
    public final String j;
    public final long k;
    public final o52 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w52(String str, long j, o52 o52Var) {
        this.j = str;
        this.k = j;
        this.l = o52Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.u92
    public final long c() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.u92
    public final vf1 e() {
        String str = this.j;
        if (str != null) {
            o72 o72Var = vf1.d;
            try {
                return te.C(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.u92
    public final on g() {
        return this.l;
    }
}
