package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲀᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0089 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0089 f434 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0089 f435 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f436;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final boolean f437;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f438;

    static {
            xhss.ᛱᲀᛸᛸ r0 = new xhss.ᛱᲀᛸᛸ
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r1, r2)
            xhss.C0089.f435 = r0
            xhss.ᛱᲀᛸᛸ r0 = new xhss.ᛱᲀᛸᛸ
            java.lang.String r1 = "  "
            r2 = 1
            java.lang.String r3 = "\n"
            r0.<init>(r3, r1, r2)
            xhss.C0089.f434 = r0
            return
    }

    public C0089(java.lang.String r3, java.lang.String r4, boolean r5) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "[\r\n]*"
            boolean r0 = r3.matches(r0)
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r0 = "[ \t]*"
            boolean r0 = r4.matches(r0)
            if (r0 == 0) goto L1b
            r2.f438 = r3
            r2.f436 = r4
            r2.f437 = r5
            return
        L1b:
            java.lang.String r2 = "Only combinations of spaces and tabs are allowed in indent."
            xhss.C0532.m959(r2)
            throw r1
        L21:
            java.lang.String r2 = "Only combinations of \\n and \\r are allowed in newline."
            xhss.C0532.m959(r2)
            throw r1
    }
}
