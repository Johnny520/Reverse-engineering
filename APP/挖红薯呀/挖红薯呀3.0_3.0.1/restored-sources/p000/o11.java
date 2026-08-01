package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class o11 extends oe0 implements r50, vz0 {

    /* JADX INFO: renamed from: A */
    public long f4395A;

    /* JADX INFO: renamed from: B */
    public int f4396B;

    /* JADX INFO: renamed from: C */
    public C0711s2 f4397C;

    /* JADX INFO: renamed from: r */
    public float f4398r;

    /* JADX INFO: renamed from: s */
    public float f4399s;

    /* JADX INFO: renamed from: t */
    public float f4400t;

    /* JADX INFO: renamed from: u */
    public float f4401u;

    /* JADX INFO: renamed from: v */
    public float f4402v;

    /* JADX INFO: renamed from: w */
    public long f4403w;

    /* JADX INFO: renamed from: x */
    public x01 f4404x;

    /* JADX INFO: renamed from: y */
    public boolean f4405y;

    /* JADX INFO: renamed from: z */
    public long f4406z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: S */
    public final void mo757S(f01 f01Var) {
        if (this.f4405y) {
            d01.m621b(f01Var, this.f4404x);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        xq0 xq0VarMo184e = sd0Var.mo184e(j);
        return zd0Var.mo1279Q(xq0VarMo184e.f7400d, xq0VarMo184e.f7401e, C0330is.f2614d, new C0537o4(5, xq0VarMo184e, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: e */
    public final boolean mo2008e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f4398r);
        sb.append(", scaleY=");
        sb.append(this.f4399s);
        sb.append(", alpha = ");
        sb.append(this.f4400t);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f4401u);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f4402v);
        sb.append(", transformOrigin=");
        sb.append((Object) t81.m4192a(this.f4403w));
        sb.append(", shape=");
        sb.append(this.f4404x);
        sb.append(", clip=");
        sb.append(this.f4405y);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0748t1.m4158p(this.f4406z, sb, ", spotShadowColor=");
        AbstractC0748t1.m4158p(this.f4395A, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) o30.m2760D(this.f4396B));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
