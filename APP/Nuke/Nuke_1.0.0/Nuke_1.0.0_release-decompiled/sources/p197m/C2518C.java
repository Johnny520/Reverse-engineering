package p197m;

import p041H0.AbstractC0582a0;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p203n.C2636T;
import p203n.C2642Z;

/* JADX INFO: renamed from: m.C */
/* JADX INFO: loaded from: classes.dex */
final class C2518C extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C2642Z f8043a;

    /* JADX INFO: renamed from: b */
    public final C2636T f8044b;

    /* JADX INFO: renamed from: c */
    public final C2636T f8045c;

    /* JADX INFO: renamed from: d */
    public final C2636T f8046d;

    /* JADX INFO: renamed from: e */
    public final C2528M f8047e;

    /* JADX INFO: renamed from: f */
    public final C2529N f8048f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1599a f8049g;

    /* JADX INFO: renamed from: h */
    public final C2519D f8050h;

    public C2518C(C2642Z c2642z, C2636T c2636t, C2636T c2636t2, C2636T c2636t3, C2528M c2528m, C2529N c2529n, InterfaceC1599a interfaceC1599a, C2519D c2519d) {
        this.f8043a = c2642z;
        this.f8044b = c2636t;
        this.f8045c = c2636t2;
        this.f8046d = c2636t3;
        this.f8047e = c2528m;
        this.f8048f = c2529n;
        this.f8049g = interfaceC1599a;
        this.f8050h = c2519d;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C2527L(this.f8043a, this.f8044b, this.f8045c, this.f8046d, this.f8047e, this.f8048f, this.f8049g, this.f8050h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2518C)) {
            return false;
        }
        C2518C c2518c = (C2518C) obj;
        return AbstractC1665j.m2981a(c2518c.f8043a, this.f8043a) && AbstractC1665j.m2981a(c2518c.f8044b, this.f8044b) && AbstractC1665j.m2981a(c2518c.f8045c, this.f8045c) && AbstractC1665j.m2981a(c2518c.f8046d, this.f8046d) && AbstractC1665j.m2981a(c2518c.f8047e, this.f8047e) && AbstractC1665j.m2981a(c2518c.f8048f, this.f8048f) && c2518c.f8049g == this.f8049g && AbstractC1665j.m2981a(c2518c.f8050h, this.f8050h);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C2527L c2527l = (C2527L) abstractC2206o;
        c2527l.f8079r = this.f8043a;
        c2527l.f8080s = this.f8044b;
        c2527l.f8081t = this.f8045c;
        c2527l.f8082u = this.f8046d;
        c2527l.f8083v = this.f8047e;
        c2527l.f8084w = this.f8048f;
        c2527l.f8085x = this.f8049g;
        c2527l.f8086y = this.f8050h;
    }

    public final int hashCode() {
        int iHashCode = this.f8043a.hashCode() * 31;
        C2636T c2636t = this.f8044b;
        int iHashCode2 = (iHashCode + (c2636t != null ? c2636t.hashCode() : 0)) * 31;
        C2636T c2636t2 = this.f8045c;
        int iHashCode3 = (iHashCode2 + (c2636t2 != null ? c2636t2.hashCode() : 0)) * 31;
        C2636T c2636t3 = this.f8046d;
        return this.f8050h.hashCode() + ((this.f8049g.hashCode() + ((this.f8048f.f8092a.hashCode() + ((this.f8047e.f8089a.hashCode() + ((iHashCode3 + (c2636t3 != null ? c2636t3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
