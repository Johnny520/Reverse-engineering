package yyds;

/* JADX INFO: renamed from: yyds.ᛳᲈᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0738 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f3428;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f3429;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f3430;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0738 f3427 = new C0738("", "", false);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0738 f3426 = new C0738("\n", "  ", true);

    public C0738(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            C0188.m798("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            C0188.m798("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.f3428 = str;
        this.f3429 = str2;
        this.f3430 = z;
    }
}
