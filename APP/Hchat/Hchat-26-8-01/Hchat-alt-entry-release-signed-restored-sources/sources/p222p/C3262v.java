package p222p;

import p085fg.InterfaceC1231l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3262v extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1231l f10396a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3262v(InterfaceC1231l interfaceC1231l) {
        this.f10396a = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3262v) && ((C3262v) obj).f10396a == this.f10396a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3265w c3265w = new C3265w();
        c3265w.f10403w = this.f10396a;
        return c3265w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3265w c3265w = (C3265w) abstractC5852n;
        InterfaceC1231l interfaceC1231l = c3265w.f10403w;
        InterfaceC1231l interfaceC1231l2 = this.f10396a;
        if (interfaceC1231l2 != interfaceC1231l) {
            c3265w.f10403w = interfaceC1231l2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10396a.hashCode();
    }
}
