package yyds;

import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᛱᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0149 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f928;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0082 f929;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0157 f930;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1013 f931;

    public AbstractC0149(C0157 c0157, C0082 c0082) {
        this.f930 = c0157;
        this.f929 = c0082;
        this.f931 = new C1013(((C2066) c0157.f967.f3102).f10219.mo693());
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m691(C1605 c1605) {
        C1284 c1284;
        C1985 c1985;
        C0157 c0157 = this.f930;
        int i = c0157.f968;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + c0157.f968);
        }
        C1013 c1013 = this.f931;
        C2755 c2755 = c1013.f4603;
        c1013.f4603 = C2755.f13475;
        c2755.mo2196();
        c2755.mo2197();
        c0157.f968 = 6;
        if (c1605.size() <= 0 || (c1284 = c0157.f965) == null || (c1985 = c1284.f5917) == null) {
            return;
        }
        AbstractC2191.m4186(c1985, this.f929, c1605);
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public long mo692(long j, C1507 c1507) throws IOException {
        C0157 c0157 = this.f930;
        try {
            return ((C2066) c0157.f967.f3102).mo692(j, c1507);
        } catch (IOException e) {
            c0157.f966.mo3290();
            this.m691(C0157.f963);
            throw e;
        }
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2755 mo693() {
        return this.f931;
    }
}
