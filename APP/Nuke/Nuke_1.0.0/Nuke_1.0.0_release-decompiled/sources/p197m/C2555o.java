package p197m;

import p041H0.AbstractC0582a0;
import p095T.InterfaceC1347Y;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p203n.C2636T;

/* JADX INFO: renamed from: m.o */
/* JADX INFO: loaded from: classes.dex */
final class C2555o<S> extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C2636T f8159a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1347Y f8160b;

    /* JADX INFO: renamed from: c */
    public final C2559s f8161c;

    public C2555o(C2636T c2636t, InterfaceC1347Y interfaceC1347Y, C2559s c2559s) {
        this.f8159a = c2636t;
        this.f8160b = interfaceC1347Y;
        this.f8161c = c2559s;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C2558r c2558r = new C2558r();
        c2558r.f8168r = this.f8159a;
        c2558r.f8169s = this.f8160b;
        c2558r.f8170t = this.f8161c;
        c2558r.f8171u = AbstractC2550j.f8152a;
        return c2558r;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2555o)) {
            return false;
        }
        C2555o c2555o = (C2555o) obj;
        return AbstractC1665j.m2981a(c2555o.f8159a, this.f8159a) && c2555o.f8160b.equals(this.f8160b);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C2558r c2558r = (C2558r) abstractC2206o;
        c2558r.f8168r = this.f8159a;
        c2558r.f8169s = this.f8160b;
        c2558r.f8170t = this.f8161c;
    }

    public final int hashCode() {
        int iHashCode = this.f8161c.hashCode() * 31;
        C2636T c2636t = this.f8159a;
        return this.f8160b.hashCode() + ((iHashCode + (c2636t != null ? c2636t.hashCode() : 0)) * 31);
    }
}
