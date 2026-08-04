package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛵᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0125 implements InterfaceC1979 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0157 f819;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1013 f820;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f821;

    public C0125(C0157 c0157) {
        this.f819 = c0157;
        this.f820 = new C1013(((C2776) c0157.f967.f3101).f13529.mo577());
    }

    @Override // yyds.InterfaceC1979, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f821) {
            return;
        }
        this.f821 = true;
        C1013 c1013 = this.f820;
        C2755 c2755 = c1013.f4603;
        c1013.f4603 = C2755.f13475;
        c2755.mo2196();
        c2755.mo2197();
        this.f819.f968 = 3;
    }

    @Override // yyds.InterfaceC1979, java.io.Flushable
    public final void flush() {
        if (this.f821) {
            return;
        }
        ((C2776) this.f819.f967.f3101).flush();
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void mo576(long j, C1507 c1507) {
        if (this.f821) {
            C0188.m800("closed");
        } else {
            AbstractC1429.m2917(c1507.f7087, 0L, j);
            ((C2776) this.f819.f967.f3101).mo576(j, c1507);
        }
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2755 mo577() {
        return this.f820;
    }
}
