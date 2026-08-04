package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛴᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1083 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C1083 f4987 = new C1083(0);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1083 f4988 = new C1083(2);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f4989;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0503 f4990;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC0503 f4991;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC0966 f4992;

    public C1083(int i) {
        boolean z = (i & 2) == 0;
        this.f4989 = false;
        C0135 c0135 = AbstractC1960.f9834;
        this.f4991 = c0135;
        this.f4990 = c0135;
        if (z) {
            this.f4992 = AbstractC1960.f9827;
        } else {
            this.f4992 = AbstractC1960.f9832;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2293(String str, StringBuilder sb) {
        if (!this.f4991.mo609(str)) {
            sb.append((CharSequence) str);
            return;
        }
        sb.append('\"');
        C1083 c1083 = AbstractC2084.f10334;
        if (str != null) {
            this.f4992.mo1273(str, sb);
        }
        sb.append('\"');
    }
}
