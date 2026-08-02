package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vq2 extends th1 implements j61, on2 {
    public long A;
    public eq2 B;
    public boolean C;
    public long D;
    public long E;
    public int F;
    public v5 G;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarE = if1Var.e(j);
        return pf1Var.j0(sz1VarE.h, sz1VarE.i, ce0.h, new fa(8, sz1VarE, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final boolean i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        if (this.C) {
            xn2.c(zn2Var, this.B);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.v);
        sb.append(", scaleY=");
        sb.append(this.w);
        sb.append(", alpha = ");
        sb.append(this.x);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.y);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.z);
        sb.append(", transformOrigin=");
        sb.append((Object) m33.b(this.A));
        sb.append(", shape=");
        sb.append(this.B);
        sb.append(", clip=");
        sb.append(this.C);
        sb.append(", renderEffect=null, ambientShadowColor=");
        hk1.l(this.D, sb, ", spotShadowColor=");
        hk1.l(this.E, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) gf1.a0(this.F));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
