package defpackage;

/* JADX INFO: renamed from: ᛷᛳᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1237 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C1919 f5541 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1919 f5542 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f5543;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String[] f5544;

    static {
            ᲁᲀᲈᛵ r0 = new ᲁᲀᲈᛵ
            java.lang.String r1 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            r0.<init>(r1)
            defpackage.C1237.f5542 = r0
            ᲁᲀᲈᛵ r0 = new ᲁᲀᲈᛵ
            java.lang.String r1 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            r0.<init>(r1)
            defpackage.C1237.f5541 = r0
            return
    }

    public C1237(java.lang.String[] r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f5543 = r2
            r0.f5544 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.nio.charset.Charset m2352(defpackage.C1237 r6) {
            java.lang.String[] r6 = r6.f5544
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = defpackage.AbstractC0425.m1187(r2, r0, r1)
            r1 = 0
            if (r0 < 0) goto L27
            r3 = r2
        Lf:
            r4 = r6[r3]
            java.lang.String r5 = "charset"
            if (r4 != 0) goto L17
            r4 = r2
            goto L1b
        L17:
            boolean r4 = r4.equalsIgnoreCase(r5)
        L1b:
            if (r4 == 0) goto L22
            int r3 = r3 + 1
            r6 = r6[r3]
            goto L28
        L22:
            if (r3 == r0) goto L27
            int r3 = r3 + 2
            goto Lf
        L27:
            r6 = r1
        L28:
            if (r6 != 0) goto L2b
            return r1
        L2b:
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.IllegalArgumentException -> L30
            return r6
        L30:
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C1237
            if (r0 == 0) goto L12
            ᛷᛳᛱᛳ r2 = (defpackage.C1237) r2
            java.lang.String r2 = r2.f5543
            java.lang.String r1 = r1.f5543
            boolean r1 = defpackage.AbstractC0498.m1280(r2, r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f5543
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f5543
            return r0
    }
}
