package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛳᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1061 implements InterfaceC2144 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2723 f4850;

    public C1061(C2723 c2723) {
        this.f4850 = c2723;
    }

    @Override // yyds.InterfaceC2144
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final boolean mo2227() {
        return true;
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final InterfaceC2144 mo2228() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final C2695 mo2229() {
        throw new IllegalStateException("already connected");
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final C2695 mo2230() {
        throw new IllegalStateException("already connected");
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2723 mo2231() {
        return this.f4850;
    }
}
