package yyds;

import java.io.File;

/* JADX INFO: renamed from: yyds.ᛵᛷᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1147 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1853 f5250;

    public C1147(C1853 c1853) {
        this.f5250 = c1853;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        AbstractC2328.m4341(-565011110593390L);
        AbstractC2328.m4341(-565058355233646L);
        C1853 c1853 = this.f5250;
        if (c1853.m3628() instanceof InterfaceC0576) {
            c1853.mo812(new File(str, str2).getAbsolutePath());
        }
        return C2746.f13459;
    }
}
