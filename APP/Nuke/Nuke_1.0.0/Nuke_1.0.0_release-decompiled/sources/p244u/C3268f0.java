package p244u;

import p029F0.InterfaceC0379Q;
import p117X2.AbstractC1665j;
import p153e1.EnumC2017m;

/* JADX INFO: renamed from: u.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3268f0 implements InterfaceC3276j0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3276j0 f10101a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3276j0 f10102b;

    public C3268f0(InterfaceC3276j0 interfaceC3276j0, InterfaceC3276j0 interfaceC3276j02) {
        this.f10101a = interfaceC3276j0;
        this.f10102b = interfaceC3276j02;
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: a */
    public final int mo5494a(InterfaceC0379Q interfaceC0379Q, EnumC2017m enumC2017m) {
        return Math.max(this.f10101a.mo5494a(interfaceC0379Q, enumC2017m), this.f10102b.mo5494a(interfaceC0379Q, enumC2017m));
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: b */
    public final int mo5495b(InterfaceC0379Q interfaceC0379Q) {
        return Math.max(this.f10101a.mo5495b(interfaceC0379Q), this.f10102b.mo5495b(interfaceC0379Q));
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: c */
    public final int mo5496c(InterfaceC0379Q interfaceC0379Q) {
        return Math.max(this.f10101a.mo5496c(interfaceC0379Q), this.f10102b.mo5496c(interfaceC0379Q));
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: d */
    public final int mo5497d(InterfaceC0379Q interfaceC0379Q, EnumC2017m enumC2017m) {
        return Math.max(this.f10101a.mo5497d(interfaceC0379Q, enumC2017m), this.f10102b.mo5497d(interfaceC0379Q, enumC2017m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3268f0)) {
            return false;
        }
        C3268f0 c3268f0 = (C3268f0) obj;
        return AbstractC1665j.m2981a(c3268f0.f10101a, this.f10101a) && AbstractC1665j.m2981a(c3268f0.f10102b, this.f10102b);
    }

    public final int hashCode() {
        return (this.f10102b.hashCode() * 31) + this.f10101a.hashCode();
    }

    public final String toString() {
        return "(" + this.f10101a + " ∪ " + this.f10102b + ')';
    }
}
