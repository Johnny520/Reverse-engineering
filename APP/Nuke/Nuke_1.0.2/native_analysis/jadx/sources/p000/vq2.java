package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vq2 extends th1 implements j61, on2 {

    /* JADX INFO: renamed from: A */
    public long f12126A;

    /* JADX INFO: renamed from: B */
    public eq2 f12127B;

    /* JADX INFO: renamed from: C */
    public boolean f12128C;

    /* JADX INFO: renamed from: D */
    public long f12129D;

    /* JADX INFO: renamed from: E */
    public long f12130E;

    /* JADX INFO: renamed from: F */
    public int f12131F;

    /* JADX INFO: renamed from: G */
    public C0798v5 f12132G;

    /* JADX INFO: renamed from: v */
    public float f12133v;

    /* JADX INFO: renamed from: w */
    public float f12134w;

    /* JADX INFO: renamed from: x */
    public float f12135x;

    /* JADX INFO: renamed from: y */
    public float f12136y;

    /* JADX INFO: renamed from: z */
    public float f12137z;

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarMo2340e = if1Var.mo2340e(j);
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, new C0196fa(8, sz1VarMo2340e, this));
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: i */
    public final boolean mo1364i() {
        return false;
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        if (this.f12128C) {
            xn2.m6163c(zn2Var, this.f12127B);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f12133v);
        sb.append(", scaleY=");
        sb.append(this.f12134w);
        sb.append(", alpha = ");
        sb.append(this.f12135x);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f12136y);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f12137z);
        sb.append(", transformOrigin=");
        sb.append((Object) m33.m3030b(this.f12126A));
        sb.append(", shape=");
        sb.append(this.f12127B);
        sb.append(", clip=");
        sb.append(this.f12128C);
        sb.append(", renderEffect=null, ambientShadowColor=");
        hk1.m2213l(this.f12129D, sb, ", spotShadowColor=");
        hk1.m2213l(this.f12130E, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) gf1.m1880a0(this.f12131F));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
