package yyds;

/* JADX INFO: renamed from: yyds.ᛵᲁᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1205 implements InterfaceC0845 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0845 f5491;

    public C1205(AbstractC2703 abstractC2703) {
        this.f5491 = abstractC2703;
    }

    public final String toString() {
        String string = this.f5491.toString();
        return string.startsWith("(") ? AbstractC2104.m4014("[?", string, "]") : AbstractC2104.m4014("[?(", string, ")]");
    }

    @Override // yyds.InterfaceC0845
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo1922(C0864 c0864) {
        return this.f5491.mo1922(c0864);
    }
}
