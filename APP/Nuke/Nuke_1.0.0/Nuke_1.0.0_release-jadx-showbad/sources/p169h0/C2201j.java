package p169h0;

import p011B4.AbstractC0231b;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: h0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2201j implements InterfaceC2207p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2207p f7181a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2207p f7182b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2201j(InterfaceC2207p interfaceC2207p, InterfaceC2207p interfaceC2207p2) {
        this.f7181a = interfaceC2207p;
        this.f7182b = interfaceC2207p2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.InterfaceC2207p
    /* JADX INFO: renamed from: a */
    public final boolean mo4019a(InterfaceC1601c interfaceC1601c) {
        return this.f7181a.mo4019a(interfaceC1601c) && this.f7182b.mo4019a(interfaceC1601c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.InterfaceC2207p
    /* JADX INFO: renamed from: b */
    public final Object mo4020b(InterfaceC1603e interfaceC1603e, Object obj) {
        return this.f7182b.mo4020b(interfaceC1603e, this.f7181a.mo4020b(interfaceC1603e, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2201j)) {
            return false;
        }
        C2201j c2201j = (C2201j) obj;
        return AbstractC1665j.m2981a(this.f7181a, c2201j.f7181a) && AbstractC1665j.m2981a(this.f7182b, c2201j.f7182b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f7182b.hashCode() * 31) + this.f7181a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m402m(new StringBuilder("["), (String) mo4020b(C2200i.f7180e, ""), ']');
    }
}
