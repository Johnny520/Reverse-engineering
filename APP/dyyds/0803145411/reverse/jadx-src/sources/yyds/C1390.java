package yyds;

import java.io.InputStream;

/* JADX INFO: renamed from: yyds.ᛶᛸᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1390 implements InterfaceC2649 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2267 f6484;

    public C1390(C2267 c2267) {
        this.f6484 = c2267;
    }

    @Override // yyds.InterfaceC2649
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Class mo2804() {
        return InputStream.class;
    }

    @Override // yyds.InterfaceC2649
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0740 mo2805(Object obj) {
        return new C2014((InputStream) obj, this.f6484);
    }
}
