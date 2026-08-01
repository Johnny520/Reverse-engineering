package defpackage;

/* JADX INFO: renamed from: ᛱᛲᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0046 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f562;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f563;

    public C0046(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = -160236924476974(0xffff6e43ef0961d2, double:NaN)
            r0 = -160271284215342(0xffff6e3bef0961d2, double:NaN)
            r2.<init>()
            r2.f562 = r3
            r2.f563 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C0046
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛱᛲᲈᛲ r5 = (defpackage.C0046) r5
            java.lang.String r1 = r4.f562
            java.lang.String r3 = r5.f562
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r4 = r4.f563
            java.lang.String r5 = r5.f563
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f562
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.f563
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -160382953365038(0xffff6e21ef0961d2, double:NaN)
            java.lang.String r1 = "DecoratedEmojiItem(emojiId="
            r0.<init>(r1)
            java.lang.String r1 = r4.f562
            r2 = -160503212449326(0xffff6e05ef0961d2, double:NaN)
            r0.append(r1); r0.append(", emojiUrl=")
            java.lang.String r4 = r4.f563
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}
