package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛶᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0610 extends AbstractC0659 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0811 f2964;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2965;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ byte[] f2966;

    public C0610(C0811 c0811, int i, byte[] bArr) {
        this.f2964 = c0811;
        this.f2965 = i;
        this.f2966 = bArr;
    }

    @Override // yyds.AbstractC0659
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final long mo1496() {
        return this.f2965;
    }

    @Override // yyds.AbstractC0659
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0811 mo1497() {
        return this.f2964;
    }

    @Override // yyds.AbstractC0659
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void mo1498(C2776 c2776) {
        if (c2776.f13528) {
            C0188.m800("closed");
        } else {
            c2776.f13530.m3018(this.f2965, this.f2966);
            c2776.m4891();
        }
    }
}
