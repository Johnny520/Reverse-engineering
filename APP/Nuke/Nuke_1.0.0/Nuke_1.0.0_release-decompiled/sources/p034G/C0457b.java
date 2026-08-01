package p034G;

import p000A.C0049a;
import p028F.C0352m;
import p041H0.AbstractC0582a0;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: G.b */
/* JADX INFO: loaded from: classes.dex */
final class C0457b extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C0352m f1360a;

    public C0457b(C0352m c0352m) {
        this.f1360a = c0352m;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C0458c c0458c = new C0458c();
        c0458c.f1361t = this.f1360a;
        C0049a c0049a = new C0049a(3, c0458c);
        C0456a c0456a = new C0456a();
        c0456a.f1359r = c0049a;
        c0458c.m1021J0(c0456a);
        return c0458c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0457b) {
            return this.f1360a == ((C0457b) obj).f1360a;
        }
        return false;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C0458c) abstractC2206o).f1361t = this.f1360a;
    }

    public final int hashCode() {
        return this.f1360a.hashCode();
    }
}
