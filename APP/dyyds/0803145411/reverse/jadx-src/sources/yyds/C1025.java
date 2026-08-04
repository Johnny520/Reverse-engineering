package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛱᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1025 implements InterfaceC2144 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2695 f4674;

    public C1025(Throwable th) {
        this.f4674 = new C2695(this, null, th, 2);
    }

    @Override // yyds.InterfaceC2144
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean mo2227() {
        return false;
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2144 mo2228() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2695 mo2229() {
        return this.f4674;
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2695 mo2230() {
        return this.f4674;
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2723 mo2231() {
        throw new IllegalStateException("unexpected call");
    }
}
