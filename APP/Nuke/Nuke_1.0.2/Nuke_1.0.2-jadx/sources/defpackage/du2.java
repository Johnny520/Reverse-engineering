package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class du2 implements x93 {
    public final x93 h;
    public final long i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public du2(x93 x93Var, long j) {
        this.h = x93Var;
        this.i = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public final boolean a() {
        return this.h.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public final long b(nd ndVar, nd ndVar2, nd ndVar3) {
        return this.h.b(ndVar, ndVar2, ndVar3) + this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof du2)) {
            return false;
        }
        du2 du2Var = (du2) obj;
        return du2Var.i == this.i && t11.l(du2Var.h, this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.i) + (this.h.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public final nd q(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        long j2 = this.i;
        return j < j2 ? ndVar3 : this.h.q(j - j2, ndVar, ndVar2, ndVar3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public final nd s(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        long j2 = this.i;
        return j < j2 ? ndVar : this.h.s(j - j2, ndVar, ndVar2, ndVar3);
    }
}
