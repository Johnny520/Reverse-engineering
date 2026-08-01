package p216p;

import p041H0.AbstractC0582a0;
import p041H0.AbstractC0601k;
import p117X2.AbstractC1665j;
import p153e1.C2010f;
import p169h0.AbstractC2206o;
import p193l0.C2480c;
import p211o0.C2740O;
import p211o0.InterfaceC2738M;

/* JADX INFO: renamed from: p.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2862s extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final float f9020a;

    /* JADX INFO: renamed from: b */
    public final C2740O f9021b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2738M f9022c;

    public C2862s(float f2, C2740O c2740o, InterfaceC2738M interfaceC2738M) {
        this.f9020a = f2;
        this.f9021b = c2740o;
        this.f9022c = interfaceC2738M;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C2861r(this.f9020a, this.f9021b, this.f9022c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2862s)) {
            return false;
        }
        C2862s c2862s = (C2862s) obj;
        return C2010f.m3696b(this.f9020a, c2862s.f9020a) && this.f9021b.equals(c2862s.f9021b) && AbstractC1665j.m2981a(this.f9022c, c2862s.f9022c);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C2861r c2861r = (C2861r) abstractC2206o;
        float f2 = c2861r.f9016u;
        C2480c c2480c = c2861r.f9019x;
        float f5 = this.f9020a;
        if (!C2010f.m3696b(f2, f5)) {
            c2861r.f9016u = f5;
            c2480c.m4425J0();
        }
        C2740O c2740o = c2861r.f9017v;
        C2740O c2740o2 = this.f9021b;
        if (!AbstractC1665j.m2981a(c2740o, c2740o2)) {
            c2861r.f9017v = c2740o2;
            c2480c.m4425J0();
        }
        InterfaceC2738M interfaceC2738M = c2861r.f9018w;
        InterfaceC2738M interfaceC2738M2 = this.f9022c;
        if (AbstractC1665j.m2981a(interfaceC2738M, interfaceC2738M2)) {
            return;
        }
        c2861r.f9018w = interfaceC2738M2;
        c2480c.m4425J0();
        AbstractC0601k.m1036l(c2861r);
    }

    public final int hashCode() {
        return this.f9022c.hashCode() + ((this.f9021b.hashCode() + (Float.hashCode(this.f9020a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C2010f.m3697c(this.f9020a)) + ", brush=" + this.f9021b + ", shape=" + this.f9022c + ')';
    }
}
