package p211o0;

import p007B0.C0172E;
import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: o0.y */
/* JADX INFO: loaded from: classes.dex */
final class C2766y extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final float f8768a;

    /* JADX INFO: renamed from: b */
    public final float f8769b;

    /* JADX INFO: renamed from: c */
    public final long f8770c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2738M f8771d;

    /* JADX INFO: renamed from: e */
    public final boolean f8772e;

    /* JADX INFO: renamed from: f */
    public final long f8773f;

    /* JADX INFO: renamed from: g */
    public final long f8774g;

    public C2766y(float f2, float f5, long j5, InterfaceC2738M interfaceC2738M, boolean z5, long j6, long j7) {
        this.f8768a = f2;
        this.f8769b = f5;
        this.f8770c = j5;
        this.f8771d = interfaceC2738M;
        this.f8772e = z5;
        this.f8773f = j6;
        this.f8774g = j7;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C2739N c2739n = new C2739N();
        c2739n.f8710r = 1.0f;
        c2739n.f8711s = 1.0f;
        c2739n.f8712t = this.f8768a;
        c2739n.f8713u = this.f8769b;
        c2739n.f8714v = 8.0f;
        c2739n.f8715w = this.f8770c;
        c2739n.f8716x = this.f8771d;
        c2739n.f8717y = this.f8772e;
        c2739n.f8718z = this.f8773f;
        c2739n.f8707A = this.f8774g;
        c2739n.f8708B = 3;
        c2739n.f8709C = new C0172E(24, c2739n);
        return c2739n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2766y)) {
            return false;
        }
        C2766y c2766y = (C2766y) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f8768a, c2766y.f8768a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f8769b, c2766y.f8769b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && C2741P.m4806a(this.f8770c, c2766y.f8770c) && AbstractC1665j.m2981a(this.f8771d, c2766y.f8771d) && this.f8772e == c2766y.f8772e && C2762u.m4921c(this.f8773f, c2766y.f8773f) && C2762u.m4921c(this.f8774g, c2766y.f8774g);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        AbstractC0596h0 abstractC0596h0;
        C2739N c2739n = (C2739N) abstractC2206o;
        c2739n.f8710r = 1.0f;
        c2739n.f8711s = 1.0f;
        c2739n.f8712t = this.f8768a;
        c2739n.f8713u = this.f8769b;
        c2739n.f8714v = 8.0f;
        c2739n.f8715w = this.f8770c;
        c2739n.f8716x = this.f8771d;
        c2739n.f8717y = this.f8772e;
        c2739n.f8718z = this.f8773f;
        c2739n.f8707A = this.f8774g;
        c2739n.f8708B = 3;
        C0172E c0172e = c2739n.f8709C;
        if (c2739n.f7186d.f7199q && (abstractC0596h0 = AbstractC0601k.m1042r(c2739n, 2).f1933s) != null) {
            abstractC0596h0.m1004p1(c0172e, true);
        }
    }

    public final int hashCode() {
        int iM390a = AbstractC0231b.m390a(8.0f, AbstractC0231b.m390a(0.0f, AbstractC0231b.m390a(0.0f, AbstractC0231b.m390a(0.0f, AbstractC0231b.m390a(this.f8769b, AbstractC0231b.m390a(0.0f, AbstractC0231b.m390a(0.0f, AbstractC0231b.m390a(this.f8768a, AbstractC0231b.m390a(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i5 = C2741P.f8721c;
        int iM395f = AbstractC0231b.m395f((this.f8771d.hashCode() + AbstractC0231b.m392c(iM390a, 31, this.f8770c)) * 31, 961, this.f8772e);
        int i6 = C2762u.f8763h;
        return AbstractC0231b.m391b(3, AbstractC0231b.m391b(0, AbstractC0231b.m392c(AbstractC0231b.m392c(iM395f, 31, this.f8773f), 31, this.f8774g), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.f8768a);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f8769b);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) C2741P.m4809d(this.f8770c));
        sb.append(", shape=");
        sb.append(this.f8771d);
        sb.append(", clip=");
        sb.append(this.f8772e);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0231b.m406q(this.f8773f, sb, ", spotShadowColor=");
        sb.append((Object) C2762u.m4927i(this.f8774g));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) AbstractC2767z.m4929B(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
