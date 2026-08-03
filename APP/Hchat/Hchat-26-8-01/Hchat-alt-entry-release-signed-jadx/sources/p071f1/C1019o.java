package p071f1;

import p085fg.InterfaceC1231l;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: f1.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C1019o extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1231l f3205a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1019o(InterfaceC1231l interfaceC1231l) {
        this.f3205a = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1019o) {
            return this.f3205a == ((C1019o) obj).f3205a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C1023q(this.f3205a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        AbstractC5614i1 abstractC5614i1;
        C1023q c1023q = (C1023q) abstractC5852n;
        InterfaceC1231l interfaceC1231l = this.f3205a;
        c1023q.f3232u = interfaceC1231l;
        if (c1023q.f23788g.f23801t && (abstractC5614i1 = AbstractC5618k.m10164t(c1023q, 2).f22869v) != null) {
            abstractC5614i1.m10084Q1(interfaceC1231l, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3205a.hashCode();
    }
}
