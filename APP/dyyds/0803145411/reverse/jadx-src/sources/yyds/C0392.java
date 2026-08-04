package yyds;

/* JADX INFO: renamed from: yyds.ᛲᛷᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0392 extends AbstractC1861 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f2023;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1549 f2024;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1277 f2025;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0392(C1277 c1277, String str, InterfaceC1549 interfaceC1549, InterfaceC0274 interfaceC0274) {
        super(1, interfaceC0274);
        this.f2025 = c1277;
        this.f2023 = str;
        this.f2024 = interfaceC1549;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Exception {
        AbstractC1544.m3189(obj);
        InterfaceC1212 interfaceC1212Mo575 = this.f2025.f5866.mo575(this.f2023);
        try {
            Object objMo371 = this.f2024.mo371(interfaceC1212Mo575);
            AbstractC0797.m1819(interfaceC1212Mo575, null);
            return objMo371;
        } finally {
        }
    }

    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final Object mo371(Object obj) {
        String str = this.f2023;
        InterfaceC1549 interfaceC1549 = this.f2024;
        return new C0392(this.f2025, str, interfaceC1549, (InterfaceC0274) obj).mo474(C2746.f13459);
    }
}
