package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class qq0 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final float f9087a;

    /* JADX INFO: renamed from: b */
    public final float f9088b;

    /* JADX INFO: renamed from: c */
    public final float f9089c;

    /* JADX INFO: renamed from: d */
    public final float f9090d;

    /* JADX INFO: renamed from: e */
    public final long f9091e;

    /* JADX INFO: renamed from: f */
    public final eq2 f9092f;

    /* JADX INFO: renamed from: g */
    public final boolean f9093g;

    /* JADX INFO: renamed from: h */
    public final long f9094h;

    /* JADX INFO: renamed from: i */
    public final long f9095i;

    public qq0(float f, float f2, float f3, float f4, long j, eq2 eq2Var, boolean z, long j2, long j3) {
        this.f9087a = f;
        this.f9088b = f2;
        this.f9089c = f3;
        this.f9090d = f4;
        this.f9091e = j;
        this.f9092f = eq2Var;
        this.f9093g = z;
        this.f9094h = j2;
        this.f9095i = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq0)) {
            return false;
        }
        qq0 qq0Var = (qq0) obj;
        return Float.compare(this.f9087a, qq0Var.f9087a) == 0 && Float.compare(this.f9088b, qq0Var.f9088b) == 0 && Float.compare(this.f9089c, qq0Var.f9089c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f9090d, qq0Var.f9090d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && m33.m3029a(this.f9091e, qq0Var.f9091e) && t11.m5086l(this.f9092f, qq0Var.f9092f) && this.f9093g == qq0Var.f9093g && C0363ju.m2566c(this.f9094h, qq0Var.f9094h) && C0363ju.m2566c(this.f9095i, qq0Var.f9095i);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        vq2 vq2Var = new vq2();
        vq2Var.f12133v = this.f9087a;
        vq2Var.f12134w = this.f9088b;
        vq2Var.f12135x = this.f9089c;
        vq2Var.f12136y = this.f9090d;
        vq2Var.f12137z = 8.0f;
        vq2Var.f12126A = this.f9091e;
        vq2Var.f12127B = this.f9092f;
        vq2Var.f12128C = this.f9093g;
        vq2Var.f12129D = this.f9094h;
        vq2Var.f12130E = this.f9095i;
        vq2Var.f12131F = 3;
        vq2Var.f12132G = new C0798v5(21, vq2Var);
        return vq2Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        zn1 zn1Var;
        vq2 vq2Var = (vq2) th1Var;
        vq2Var.f12133v = this.f9087a;
        vq2Var.f12134w = this.f9088b;
        vq2Var.f12135x = this.f9089c;
        vq2Var.f12136y = this.f9090d;
        vq2Var.f12137z = 8.0f;
        vq2Var.f12126A = this.f9091e;
        vq2Var.f12127B = this.f9092f;
        vq2Var.f12128C = this.f9093g;
        vq2Var.f12129D = this.f9094h;
        vq2Var.f12130E = this.f9095i;
        vq2Var.f12131F = 3;
        C0798v5 c0798v5 = vq2Var.f12132G;
        if (vq2Var.f10757h.f10770u && (zn1Var = sp0.m4927Z(vq2Var, 2).f13986w) != null) {
            zn1Var.m6473r1(c0798v5, true);
        }
    }

    public final int hashCode() {
        int iM5684c = vi0.m5684c(8.0f, vi0.m5684c(0.0f, vi0.m5684c(0.0f, vi0.m5684c(0.0f, vi0.m5684c(this.f9090d, vi0.m5684c(0.0f, vi0.m5684c(0.0f, vi0.m5684c(this.f9089c, vi0.m5684c(this.f9088b, Float.hashCode(this.f9087a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = m33.f6465c;
        int iM2205d = hk1.m2205d((this.f9092f.hashCode() + hk1.m2204c(iM5684c, 31, this.f9091e)) * 31, 961, this.f9093g);
        int i2 = C0363ju.f5218h;
        return vi0.m5685d(3, vi0.m5685d(0, hk1.m2204c(hk1.m2204c(iM2205d, 31, this.f9094h), 31, this.f9095i), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f9087a);
        sb.append(", scaleY=");
        sb.append(this.f9088b);
        sb.append(", alpha=");
        sb.append(this.f9089c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f9090d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) m33.m3030b(this.f9091e));
        sb.append(", shape=");
        sb.append(this.f9092f);
        sb.append(", clip=");
        sb.append(this.f9093g);
        sb.append(", renderEffect=null, ambientShadowColor=");
        hk1.m2213l(this.f9094h, sb, ", spotShadowColor=");
        sb.append((Object) C0363ju.m2572i(this.f9095i));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) gf1.m1880a0(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
