package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛳᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1978 implements InterfaceC2247 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC2289 f9916;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1458 f9917;

    public C1978(InterfaceC2289 interfaceC2289, C1458 c1458) {
        this.f9916 = interfaceC2289;
        this.f9917 = c1458;
    }

    @Override // yyds.InterfaceC2247
    public final InterfaceC2289 getKey() {
        return this.f9916;
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final InterfaceC2213 mo421(InterfaceC2289 interfaceC2289) {
        return AbstractC1579.m3232(this, interfaceC2289);
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛶᛷᲀ */
    public final InterfaceC2213 mo422(InterfaceC2213 interfaceC2213) {
        return AbstractC0879.m1960(this, interfaceC2213);
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛸᲇᛶ */
    public final InterfaceC2247 mo423(InterfaceC2289 interfaceC2289) {
        return AbstractC1579.m3240(this, interfaceC2289);
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final Object mo424(Object obj, InterfaceC0477 interfaceC0477) {
        return interfaceC0477.mo511(obj, this);
    }
}
