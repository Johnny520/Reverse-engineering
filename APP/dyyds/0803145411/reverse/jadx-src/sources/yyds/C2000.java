package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛴᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2000 implements InterfaceC1979 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0157 f10010;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1013 f10011;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f10012;

    public C2000(C0157 c0157) {
        this.f10010 = c0157;
        this.f10011 = new C1013(((C2776) c0157.f967.f3101).f13529.mo577());
    }

    @Override // yyds.InterfaceC1979, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f10012) {
            return;
        }
        this.f10012 = true;
        ((C2776) this.f10010.f967.f3101).m4892("0\r\n\r\n");
        C1013 c1013 = this.f10011;
        C2755 c2755 = c1013.f4603;
        c1013.f4603 = C2755.f13475;
        c2755.mo2196();
        c2755.mo2197();
        this.f10010.f968 = 3;
    }

    @Override // yyds.InterfaceC1979, java.io.Flushable
    public final synchronized void flush() {
        if (this.f10012) {
            return;
        }
        ((C2776) this.f10010.f967.f3101).flush();
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo576(long j, C1507 c1507) {
        if (this.f10012) {
            C0188.m800("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        C2776 c2776 = (C2776) this.f10010.f967.f3101;
        if (c2776.f13528) {
            C0188.m800("closed");
            return;
        }
        c2776.f13530.m3020(j);
        c2776.m4891();
        c2776.m4892("\r\n");
        c2776.mo576(j, c1507);
        c2776.m4892("\r\n");
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo577() {
        return this.f10011;
    }
}
