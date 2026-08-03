package p071f1;

import gg.AbstractC1416l;
import p016b1.C0166f;
import p068eh.AbstractC0921a;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: f1.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C0994b0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final float f3152a;

    /* JADX INFO: renamed from: b */
    public final float f3153b;

    /* JADX INFO: renamed from: c */
    public final long f3154c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1026r0 f3155d;

    /* JADX INFO: renamed from: e */
    public final boolean f3156e;

    /* JADX INFO: renamed from: f */
    public final long f3157f;

    /* JADX INFO: renamed from: g */
    public final long f3158g;

    /* JADX INFO: renamed from: h */
    public final C1017n f3159h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0994b0(float f3, float f10, long j3, InterfaceC1026r0 interfaceC1026r0, boolean z9, long j4, long j5, C1017n c1017n) {
        this.f3152a = f3;
        this.f3153b = f10;
        this.f3154c = j3;
        this.f3155d = interfaceC1026r0;
        this.f3156e = z9;
        this.f3157f = j4;
        this.f3158g = j5;
        this.f3159h = c1017n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0994b0)) {
            return false;
        }
        C0994b0 c0994b0 = (C0994b0) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f3152a, c0994b0.f3152a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f3153b, c0994b0.f3153b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && C1032u0.m2631a(this.f3154c, c0994b0.f3154c) && AbstractC1416l.m3825a(this.f3155d, c0994b0.f3155d) && this.f3156e == c0994b0.f3156e && C1034w.m2635c(this.f3157f, c0994b0.f3157f) && C1034w.m2635c(this.f3158g, c0994b0.f3158g) && AbstractC1416l.m3825a(this.f3159h, c0994b0.f3159h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C1028s0 c1028s0 = new C1028s0();
        c1028s0.f3246u = 1.0f;
        c1028s0.f3247v = 1.0f;
        c1028s0.f3248w = this.f3152a;
        c1028s0.f3249x = this.f3153b;
        c1028s0.f3250y = 8.0f;
        c1028s0.f3251z = this.f3154c;
        c1028s0.f3239A = this.f3155d;
        c1028s0.f3240B = this.f3156e;
        c1028s0.f3241C = this.f3157f;
        c1028s0.f3242D = this.f3158g;
        c1028s0.f3243E = 3;
        c1028s0.f3244F = this.f3159h;
        c1028s0.f3245G = new C0166f(c1028s0, 7);
        return c1028s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        AbstractC5614i1 abstractC5614i1;
        C1028s0 c1028s0 = (C1028s0) abstractC5852n;
        c1028s0.f3246u = 1.0f;
        c1028s0.f3247v = 1.0f;
        c1028s0.f3248w = this.f3152a;
        c1028s0.f3249x = this.f3153b;
        c1028s0.f3250y = 8.0f;
        c1028s0.f3251z = this.f3154c;
        c1028s0.f3239A = this.f3155d;
        c1028s0.f3240B = this.f3156e;
        c1028s0.f3241C = this.f3157f;
        c1028s0.f3242D = this.f3158g;
        c1028s0.f3243E = 3;
        c1028s0.f3244F = this.f3159h;
        C0166f c0166f = c1028s0.f3245G;
        if (c1028s0.f23788g.f23801t && (abstractC5614i1 = AbstractC5618k.m10164t(c1028s0, 2).f22869v) != null) {
            abstractC5614i1.m10084Q1(c0166f, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2241d = AbstractC0921a.m2241d(8.0f, AbstractC0921a.m2241d(0.0f, AbstractC0921a.m2241d(0.0f, AbstractC0921a.m2241d(0.0f, AbstractC0921a.m2241d(this.f3153b, AbstractC0921a.m2241d(0.0f, AbstractC0921a.m2241d(0.0f, AbstractC0921a.m2241d(this.f3152a, AbstractC0921a.m2241d(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i9 = C1032u0.f3255c;
        int iM2245h = AbstractC0921a.m2245h((this.f3155d.hashCode() + AbstractC0921a.m2243f(iM2241d, 31, this.f3154c)) * 31, 961, this.f3156e);
        int i10 = C1034w.f3264h;
        int iM2242e = AbstractC0921a.m2242e(3, AbstractC0921a.m2242e(0, AbstractC0921a.m2243f(AbstractC0921a.m2243f(iM2245h, 31, this.f3157f), 31, this.f3158g), 31), 31);
        C1017n c1017n = this.f3159h;
        return iM2242e + (c1017n != null ? c1017n.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=" + this.f3152a + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.f3153b + ", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=" + ((Object) C1032u0.m2632b(this.f3154c)) + ", shape=" + this.f3155d + ", clip=" + this.f3156e + ", renderEffect=null, ambientShadowColor=" + ((Object) C1034w.m2641i(this.f3157f)) + ", spotShadowColor=" + ((Object) C1034w.m2641i(this.f3158g)) + ", compositingStrategy=CompositingStrategy(value=0), blendMode=" + ((Object) AbstractC0996c0.m2503A(3)) + ", colorFilter=" + this.f3159h + ')';
    }
}
