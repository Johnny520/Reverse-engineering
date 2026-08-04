package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛸᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0654 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f3138;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3139;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1633 f3140;

    public /* synthetic */ C0654(C1633 c1633, C0172 c0172, int i) {
        this.f3139 = i;
        this.f3140 = c1633;
        this.f3138 = c0172;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() {
        int i = this.f3139;
        C2746 c2746 = C2746.f13459;
        C0312 c0312 = null;
        C0172 c0172 = this.f3138;
        C1633 c1633 = this.f3140;
        switch (i) {
            case 0:
                Object obj = c0172.f997;
                if (obj == null) {
                    AbstractC2328.m4341(-215113009890158L);
                } else {
                    c0312 = (C0312) obj;
                }
                AbstractC2071.m3949(c1633, c0312);
                break;
            default:
                Object obj2 = c0172.f997;
                if (obj2 == null) {
                    AbstractC2328.m4341(-214898261525358L);
                } else {
                    c0312 = (C0312) obj2;
                }
                AbstractC2071.m3949(c1633, c0312);
                break;
        }
        return c2746;
    }
}
