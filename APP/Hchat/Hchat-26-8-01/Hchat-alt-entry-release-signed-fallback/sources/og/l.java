package og;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum l extends java.lang.Enum {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final og.l f9834h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final og.l f9835i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ og.l[] f9836j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9837g;

    static {
            og.l r0 = new og.l
            java.lang.String r1 = "IGNORE_CASE"
            r2 = 0
            r3 = 2
            r0.<init>(r1, r2, r3)
            og.l.f9834h = r0
            og.l r1 = new og.l
            r2 = 8
            java.lang.String r4 = "MULTILINE"
            r5 = 1
            r1.<init>(r4, r5, r2)
            og.l r2 = new og.l
            java.lang.String r4 = "LITERAL"
            r6 = 16
            r2.<init>(r4, r3, r6)
            og.l r3 = new og.l
            java.lang.String r4 = "UNIX_LINES"
            r6 = 3
            r3.<init>(r4, r6, r5)
            og.l r4 = new og.l
            java.lang.String r5 = "COMMENTS"
            r6 = 4
            r4.<init>(r5, r6, r6)
            og.l r5 = new og.l
            r6 = 5
            r7 = 32
            java.lang.String r8 = "DOT_MATCHES_ALL"
            r5.<init>(r8, r6, r7)
            og.l.f9835i = r5
            og.l r6 = new og.l
            r7 = 6
            r8 = 128(0x80, float:1.8E-43)
            java.lang.String r9 = "CANON_EQ"
            r6.<init>(r9, r7, r8)
            og.l[] r0 = new og.l[]{r0, r1, r2, r3, r4, r5, r6}
            og.l.f9836j = r0
            return
    }

    l(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f9837g = r3
            return
    }

    public static og.l valueOf(java.lang.String r1) {
            java.lang.Class<og.l> r0 = og.l.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            og.l r1 = (og.l) r1
            return r1
    }

    public static og.l[] values() {
            og.l[] r0 = og.l.f9836j
            java.lang.Object r0 = r0.clone()
            og.l[] r0 = (og.l[]) r0
            return r0
    }
}
