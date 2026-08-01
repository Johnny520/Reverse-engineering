package defpackage;

/* JADX INFO: renamed from: ᛴᛲᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0622 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C0622 f3053 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C0622 f3054 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean f3055;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f3056;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f3057;

    static {
            ᛴᛲᛵᛱ r0 = new ᛴᛲᛵᛱ
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r1, r2)
            defpackage.C0622.f3054 = r0
            ᛴᛲᛵᛱ r0 = new ᛴᛲᛵᛱ
            java.lang.String r1 = "  "
            r2 = 1
            java.lang.String r3 = "\n"
            r0.<init>(r3, r1, r2)
            defpackage.C0622.f3053 = r0
            return
    }

    public C0622(java.lang.String r3, java.lang.String r4, boolean r5) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "[\r\n]*"
            boolean r0 = r3.matches(r0)
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r0 = "[ \t]*"
            boolean r0 = r4.matches(r0)
            if (r0 == 0) goto L1b
            r2.f3056 = r3
            r2.f3057 = r4
            r2.f3055 = r5
            return
        L1b:
            java.lang.String r2 = "Only combinations of spaces and tabs are allowed in indent."
            defpackage.C2264.m3684(r2)
            throw r1
        L21:
            java.lang.String r2 = "Only combinations of \\n and \\r are allowed in newline."
            defpackage.C2264.m3684(r2)
            throw r1
    }
}
