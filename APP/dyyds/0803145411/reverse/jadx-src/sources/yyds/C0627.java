package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛶᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0627 extends AbstractC0379 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final long f3022;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2066 f3023;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f3024;

    public C0627(String str, long j, C2066 c2066) {
        this.f3024 = str;
        this.f3022 = j;
        this.f3023 = c2066;
    }

    @Override // yyds.AbstractC0379
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final InterfaceC0981 mo908() {
        return this.f3023;
    }

    @Override // yyds.AbstractC0379
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final long mo909() {
        return this.f3022;
    }

    @Override // yyds.AbstractC0379
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final C0811 mo910() {
        String str = this.f3024;
        if (str != null) {
            C0051 c0051 = C0811.f3734;
            try {
                return C2810.m4948(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
