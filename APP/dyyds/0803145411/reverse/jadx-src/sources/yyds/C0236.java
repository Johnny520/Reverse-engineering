package yyds;

/* JADX INFO: renamed from: yyds.ᛱᲇᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0236 implements InterfaceC1851, InterfaceC2349 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1319;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f1320;

    public /* synthetic */ C0236(int i, Object obj) {
        this.f1319 = i;
        this.f1320 = obj;
    }

    @Override // yyds.InterfaceC1851
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0124 mo885() {
        int i = this.f1319;
        Object obj = this.f1320;
        switch (i) {
            case 0:
                return ((C1277) obj).f5866;
            default:
                return ((C1458) obj).f6956;
        }
    }

    @Override // yyds.InterfaceC2349
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object mo886(String str, InterfaceC1549 interfaceC1549, AbstractC1320 abstractC1320) {
        int i = this.f1319;
        Object obj = this.f1320;
        switch (i) {
            case 0:
                return ((C1277) obj).mo886(str, interfaceC1549, abstractC1320);
            default:
                return ((C1458) obj).mo886(str, interfaceC1549, abstractC1320);
        }
    }
}
