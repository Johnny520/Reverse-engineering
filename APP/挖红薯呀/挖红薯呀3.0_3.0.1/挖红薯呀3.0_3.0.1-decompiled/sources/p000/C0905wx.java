package p000;

/* JADX INFO: renamed from: wx */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class C0905wx extends te0 {

    /* JADX INFO: renamed from: a */
    public final float f7198a;

    /* JADX INFO: renamed from: b */
    public final long f7199b;

    /* JADX INFO: renamed from: c */
    public final x01 f7200c;

    /* JADX INFO: renamed from: d */
    public final boolean f7201d;

    /* JADX INFO: renamed from: e */
    public final long f7202e;

    /* JADX INFO: renamed from: f */
    public final long f7203f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0905wx(float f, long j, x01 x01Var, boolean z, long j2, long j3) {
        this.f7198a = f;
        this.f7199b = j;
        this.f7200c = x01Var;
        this.f7201d = z;
        this.f7202e = j2;
        this.f7203f = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        o11 o11Var = new o11();
        o11Var.f4398r = 1.0f;
        o11Var.f4399s = 1.0f;
        o11Var.f4400t = 1.0f;
        o11Var.f4401u = this.f7198a;
        o11Var.f4402v = 8.0f;
        o11Var.f4403w = this.f7199b;
        o11Var.f4404x = this.f7200c;
        o11Var.f4405y = this.f7201d;
        o11Var.f4406z = this.f7202e;
        o11Var.f4395A = this.f7203f;
        o11Var.f4396B = 3;
        o11Var.f4397C = new C0711s2(22, o11Var);
        return o11Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0905wx) {
            C0905wx c0905wx = (C0905wx) obj;
            if (Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f7198a, c0905wx.f7198a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                long j = c0905wx.f7199b;
                int i = t81.f5954b;
                if (this.f7199b == j && p30.m3002l(this.f7200c, c0905wx.f7200c) && this.f7201d == c0905wx.f7201d && C0207ff.m1094c(this.f7202e, c0905wx.f7202e) && C0207ff.m1094c(this.f7203f, c0905wx.f7203f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        qj0 qj0Var;
        o11 o11Var = (o11) oe0Var;
        o11Var.f4398r = 1.0f;
        o11Var.f4399s = 1.0f;
        o11Var.f4400t = 1.0f;
        o11Var.f4401u = this.f7198a;
        o11Var.f4402v = 8.0f;
        o11Var.f4403w = this.f7199b;
        o11Var.f4404x = this.f7200c;
        o11Var.f4405y = this.f7201d;
        o11Var.f4406z = this.f7202e;
        o11Var.f4395A = this.f7203f;
        o11Var.f4396B = 3;
        C0711s2 c0711s2 = o11Var.f4397C;
        if (o11Var.f4529d.f4542q && (qj0Var = pf1.m3037O(o11Var, 2).f5181s) != null) {
            qj0Var.m3287c1(c0711s2, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM4143a = AbstractC0748t1.m4143a(8.0f, AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(this.f7198a, AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(1.0f, AbstractC0748t1.m4143a(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = t81.f5954b;
        int iM4145c = AbstractC0748t1.m4145c((this.f7200c.hashCode() + AbstractC0748t1.m4146d(this.f7199b, iM4143a, 31)) * 31, 961, this.f7201d);
        int i2 = C0207ff.f1708h;
        return AbstractC0748t1.m4144b(3, AbstractC0748t1.m4144b(0, AbstractC0748t1.m4146d(this.f7203f, AbstractC0748t1.m4146d(this.f7202e, iM4145c, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=1.0, translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f7198a);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) t81.m4192a(this.f7199b));
        sb.append(", shape=");
        sb.append(this.f7200c);
        sb.append(", clip=");
        sb.append(this.f7201d);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0748t1.m4158p(this.f7202e, sb, ", spotShadowColor=");
        sb.append((Object) C0207ff.m1100i(this.f7203f));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) o30.m2760D(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
