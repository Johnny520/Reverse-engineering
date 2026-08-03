package p236q1;

import p085fg.InterfaceC1231l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: q1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3423c extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1231l f11092a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1231l f11093b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3423c(InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        this.f11092a = interfaceC1231l;
        this.f11093b = interfaceC1231l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3423c)) {
            return false;
        }
        C3423c c3423c = (C3423c) obj;
        return this.f11092a == c3423c.f11092a && this.f11093b == c3423c.f11093b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3426f c3426f = new C3426f();
        c3426f.f11094u = this.f11092a;
        c3426f.f11095v = this.f11093b;
        return c3426f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3426f c3426f = (C3426f) abstractC5852n;
        c3426f.f11094u = this.f11092a;
        c3426f.f11095v = this.f11093b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        InterfaceC1231l interfaceC1231l = this.f11092a;
        int iHashCode = (interfaceC1231l != null ? interfaceC1231l.hashCode() : 0) * 31;
        InterfaceC1231l interfaceC1231l2 = this.f11093b;
        return iHashCode + (interfaceC1231l2 != null ? interfaceC1231l2.hashCode() : 0);
    }
}
