package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cq2 extends yh1 {
    public final float a;
    public final eq2 b;
    public final boolean c;
    public final long d;
    public final long e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cq2(float f, eq2 eq2Var, boolean z, long j, long j2) {
        this.a = f;
        this.b = eq2Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq2)) {
            return false;
        }
        cq2 cq2Var = (cq2) obj;
        return za0.b(this.a, cq2Var.a) && t11.l(this.b, cq2Var.b) && this.c == cq2Var.c && ju.c(this.d, cq2Var.d) && ju.c(this.e, cq2Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new el(new v5(20, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        zn1 zn1Var;
        el elVar = (el) th1Var;
        v5 v5Var = new v5(20, this);
        elVar.v = v5Var;
        if (elVar.h.u && (zn1Var = sp0.Z(elVar, 2).w) != null) {
            zn1Var.r1(v5Var, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iD = hk1.d((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c);
        int i = ju.h;
        return Long.hashCode(this.e) + hk1.c(iD, 31, this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) za0.c(this.a));
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        hk1.l(this.d, sb, ", spotColor=");
        sb.append((Object) ju.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
