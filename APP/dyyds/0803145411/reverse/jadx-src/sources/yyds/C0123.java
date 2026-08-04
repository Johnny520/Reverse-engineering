package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛵᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0123 extends AbstractC1418 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f816;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0603 f817;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f818;

    public C0123(C0603 c0603) {
        this.f817 = c0603;
        this.f816 = c0603.f2865;
        this.f818 = c0603.f2863;
    }

    @Override // yyds.AbstractC1418
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo573() {
        int i = this.f816;
        if (i == 0) {
            this.f6703 = 2;
            return;
        }
        C0603 c0603 = this.f817;
        Object[] objArr = c0603.f2864;
        int i2 = this.f818;
        this.f6704 = objArr[i2];
        this.f6703 = 1;
        this.f818 = (i2 + 1) % c0603.f2866;
        this.f816 = i - 1;
    }
}
