package yyds;

/* JADX INFO: renamed from: yyds.ᲈᲁᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2771 extends AbstractC2026 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final String f13519;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public AbstractC2026 f13520 = this;

    public C2771(char c) {
        this.f13519 = Character.toString(c);
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo827(String str, AbstractC1614 abstractC1614, Object obj, C1762 c1762) {
        boolean zM3900 = m3900();
        String str2 = this.f13519;
        if (zM3900) {
            c1762.m3503(str2, AbstractC1614.f8231, obj);
        } else {
            m3899().mo827(str2, abstractC1614, obj, c1762);
        }
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final String mo828() {
        return this.f13519;
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo829() {
        return true;
    }
}
