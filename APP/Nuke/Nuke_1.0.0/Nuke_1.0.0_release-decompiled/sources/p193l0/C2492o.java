package p193l0;

import p007B0.C0172E;
import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p117X2.AbstractC1665j;
import p153e1.C2010f;
import p169h0.AbstractC2206o;
import p211o0.C2756o;
import p211o0.C2762u;
import p211o0.InterfaceC2738M;

/* JADX INFO: renamed from: l0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2492o extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final float f7999a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2738M f8000b;

    /* JADX INFO: renamed from: c */
    public final boolean f8001c;

    /* JADX INFO: renamed from: d */
    public final long f8002d;

    /* JADX INFO: renamed from: e */
    public final long f8003e;

    public C2492o(float f2, InterfaceC2738M interfaceC2738M, boolean z5, long j5, long j6) {
        this.f7999a = f2;
        this.f8000b = interfaceC2738M;
        this.f8001c = z5;
        this.f8002d = j5;
        this.f8003e = j6;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C2756o(new C0172E(19, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2492o)) {
            return false;
        }
        C2492o c2492o = (C2492o) obj;
        return C2010f.m3696b(this.f7999a, c2492o.f7999a) && AbstractC1665j.m2981a(this.f8000b, c2492o.f8000b) && this.f8001c == c2492o.f8001c && C2762u.m4921c(this.f8002d, c2492o.f8002d) && C2762u.m4921c(this.f8003e, c2492o.f8003e);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        AbstractC0596h0 abstractC0596h0;
        C2756o c2756o = (C2756o) abstractC2206o;
        C0172E c0172e = new C0172E(19, this);
        c2756o.f8750r = c0172e;
        if (c2756o.f7186d.f7199q && (abstractC0596h0 = AbstractC0601k.m1042r(c2756o, 2).f1933s) != null) {
            abstractC0596h0.m1004p1(c0172e, true);
        }
    }

    public final int hashCode() {
        int iM395f = AbstractC0231b.m395f((this.f8000b.hashCode() + (Float.hashCode(this.f7999a) * 31)) * 31, 31, this.f8001c);
        int i5 = C2762u.f8763h;
        return Long.hashCode(this.f8003e) + AbstractC0231b.m392c(iM395f, 31, this.f8002d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) C2010f.m3697c(this.f7999a));
        sb.append(", shape=");
        sb.append(this.f8000b);
        sb.append(", clip=");
        sb.append(this.f8001c);
        sb.append(", ambientColor=");
        AbstractC0231b.m406q(this.f8002d, sb, ", spotColor=");
        sb.append((Object) C2762u.m4927i(this.f8003e));
        sb.append(')');
        return sb.toString();
    }
}
