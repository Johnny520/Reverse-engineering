package defpackage;

/* JADX INFO: renamed from: ᛴᛴᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0645 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f3169;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f3170;

    public C0645(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = -437932329967150(0xfffe71b3ef0961d2, double:NaN)
            r0 = -437945214869038(0xfffe71b0ef0961d2, double:NaN)
            r2.<init>()
            r2.f3169 = r3
            r2.f3170 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.C0645
            if (r0 != 0) goto L8
            goto L1f
        L8:
            ᛴᛴᛱᲁ r3 = (defpackage.C0645) r3
            java.lang.String r0 = r2.f3169
            java.lang.String r1 = r3.f3169
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.String r2 = r2.f3170
            java.lang.String r3 = r3.f3170
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f3169
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.f3170
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -438001049443886(0xfffe71a3ef0961d2, double:NaN)
            java.lang.String r1 = "VideoMenu(id="
            r0.<init>(r1)
            java.lang.String r1 = r4.f3169
            r2 = -438061178986030(0xfffe7195ef0961d2, double:NaN)
            r0.append(r1); r0.append(", name=")
            java.lang.String r4 = r4.f3170
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}
