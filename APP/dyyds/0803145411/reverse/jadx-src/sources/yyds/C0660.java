package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0660 implements InterfaceC0584 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC0477 f3150;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC0498 f3151;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0078 f3152 = new C0078(new C1223(16, this));

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f3153;

    public C0660(InterfaceC0498 interfaceC0498, String str, InterfaceC0477 interfaceC0477) {
        this.f3151 = interfaceC0498;
        this.f3153 = str;
        this.f3150 = interfaceC0477;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        C0078 c0078 = this.f3152;
        if (c0078.f651 != C1586.f8039) {
            ((InterfaceC0124) c0078.getValue()).close();
        }
    }

    @Override // yyds.InterfaceC0584
    /* JADX INFO: renamed from: ᛲᛶᛱᲈ */
    public final Object mo1465(boolean z, InterfaceC0477 interfaceC0477, AbstractC1320 abstractC1320) {
        C1442 c1442 = (C1442) abstractC1320.f6070.mo423(C1442.f6855);
        C1277 c1277 = c1442 != null ? c1442.f6856 : null;
        if (c1277 != null) {
            return interfaceC0477.mo511(c1277, abstractC1320);
        }
        C1277 c12772 = new C1277(this.f3150, (InterfaceC0124) this.f3152.getValue());
        return AbstractC2071.m3955(new C1442(c12772), new C0219(interfaceC0477, c12772, null, 10), abstractC1320);
    }
}
