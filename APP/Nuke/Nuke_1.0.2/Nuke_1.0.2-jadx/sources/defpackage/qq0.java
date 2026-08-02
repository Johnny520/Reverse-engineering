package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class qq0 extends yh1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final eq2 f;
    public final boolean g;
    public final long h;
    public final long i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qq0(float f, float f2, float f3, float f4, long j, eq2 eq2Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = eq2Var;
        this.g = z;
        this.h = j2;
        this.i = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq0)) {
            return false;
        }
        qq0 qq0Var = (qq0) obj;
        return Float.compare(this.a, qq0Var.a) == 0 && Float.compare(this.b, qq0Var.b) == 0 && Float.compare(this.c, qq0Var.c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.d, qq0Var.d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && m33.a(this.e, qq0Var.e) && t11.l(this.f, qq0Var.f) && this.g == qq0Var.g && ju.c(this.h, qq0Var.h) && ju.c(this.i, qq0Var.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        vq2 vq2Var = new vq2();
        vq2Var.v = this.a;
        vq2Var.w = this.b;
        vq2Var.x = this.c;
        vq2Var.y = this.d;
        vq2Var.z = 8.0f;
        vq2Var.A = this.e;
        vq2Var.B = this.f;
        vq2Var.C = this.g;
        vq2Var.D = this.h;
        vq2Var.E = this.i;
        vq2Var.F = 3;
        vq2Var.G = new v5(21, vq2Var);
        return vq2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        zn1 zn1Var;
        vq2 vq2Var = (vq2) th1Var;
        vq2Var.v = this.a;
        vq2Var.w = this.b;
        vq2Var.x = this.c;
        vq2Var.y = this.d;
        vq2Var.z = 8.0f;
        vq2Var.A = this.e;
        vq2Var.B = this.f;
        vq2Var.C = this.g;
        vq2Var.D = this.h;
        vq2Var.E = this.i;
        vq2Var.F = 3;
        v5 v5Var = vq2Var.G;
        if (vq2Var.h.u && (zn1Var = sp0.Z(vq2Var, 2).w) != null) {
            zn1Var.r1(v5Var, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iC = vi0.c(8.0f, vi0.c(0.0f, vi0.c(0.0f, vi0.c(0.0f, vi0.c(this.d, vi0.c(0.0f, vi0.c(0.0f, vi0.c(this.c, vi0.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = m33.c;
        int iD = hk1.d((this.f.hashCode() + hk1.c(iC, 31, this.e)) * 31, 961, this.g);
        int i2 = ju.h;
        return vi0.d(3, vi0.d(0, hk1.c(hk1.c(iD, 31, this.h), 31, this.i), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.b);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) m33.b(this.e));
        sb.append(", shape=");
        sb.append(this.f);
        sb.append(", clip=");
        sb.append(this.g);
        sb.append(", renderEffect=null, ambientShadowColor=");
        hk1.l(this.h, sb, ", spotShadowColor=");
        sb.append((Object) ju.i(this.i));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) gf1.a0(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
