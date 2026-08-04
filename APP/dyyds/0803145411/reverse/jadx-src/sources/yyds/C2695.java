package yyds;

/* JADX INFO: renamed from: yyds.ᲈᛷᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2695 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2144 f13244;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC2144 f13245;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Throwable f13246;

    public /* synthetic */ C2695(InterfaceC2144 interfaceC2144, C2666 c2666, Throwable th, int i) {
        this(interfaceC2144, (i & 2) != 0 ? null : c2666, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2695)) {
            return false;
        }
        C2695 c2695 = (C2695) obj;
        return AbstractC1544.m3188(this.f13244, c2695.f13244) && AbstractC1544.m3188(this.f13245, c2695.f13245) && AbstractC1544.m3188(this.f13246, c2695.f13246);
    }

    public final int hashCode() {
        int iHashCode = this.f13244.hashCode() * 31;
        InterfaceC2144 interfaceC2144 = this.f13245;
        int iHashCode2 = (iHashCode + (interfaceC2144 == null ? 0 : interfaceC2144.hashCode())) * 31;
        Throwable th = this.f13246;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f13244 + ", nextPlan=" + this.f13245 + ", throwable=" + this.f13246 + ')';
    }

    public C2695(InterfaceC2144 interfaceC2144, InterfaceC2144 interfaceC21442, Throwable th) {
        this.f13244 = interfaceC2144;
        this.f13245 = interfaceC21442;
        this.f13246 = th;
    }
}
