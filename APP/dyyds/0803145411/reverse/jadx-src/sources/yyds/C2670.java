package yyds;

/* JADX INFO: renamed from: yyds.ᲈᛵᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2670 extends AbstractC2362 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f13112 = false;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0803 f13113;

    public C2670(C0803 c0803) {
        this.f13113 = c0803;
    }

    @Override // yyds.AbstractC2362
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo4380(int i) {
        if (i == 0 && this.f13112) {
            this.f13112 = false;
            this.f13113.m1852();
        }
    }

    @Override // yyds.AbstractC2362
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1335(C1213 c1213, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f13112 = true;
    }
}
