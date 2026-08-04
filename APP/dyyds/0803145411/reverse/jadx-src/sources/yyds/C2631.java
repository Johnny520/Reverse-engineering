package yyds;

/* JADX INFO: renamed from: yyds.ᲈᛳᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2631 implements InterfaceC2067 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f12962;

    public C2631(boolean z) {
        this.f12962 = z;
    }

    public final String toString() {
        return AbstractC0897.m2000(new StringBuilder("Empty{"), this.f12962 ? "Active" : "New", '}');
    }

    @Override // yyds.InterfaceC2067
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo2048() {
        return this.f12962;
    }

    @Override // yyds.InterfaceC2067
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final C1518 mo2049() {
        return null;
    }
}
