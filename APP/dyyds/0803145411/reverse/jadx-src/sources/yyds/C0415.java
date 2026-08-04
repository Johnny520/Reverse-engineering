package yyds;

/* JADX INFO: renamed from: yyds.ᛲᛸᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0415 implements InterfaceC2050 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2149;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f2150;

    public /* synthetic */ C0415(String str, int i) {
        this.f2149 = i;
        this.f2150 = str;
    }

    public String toString() {
        switch (this.f2149) {
            case 1:
                return AbstractC0897.m2000(new StringBuilder("<"), this.f2150, '>');
            default:
                return super.toString();
        }
    }

    @Override // yyds.InterfaceC2050
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public Object mo807() {
        throw new C1600(this.f2150);
    }
}
