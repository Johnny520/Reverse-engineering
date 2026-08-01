package defpackage;

/* JADX INFO: renamed from: ᛷᛵᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1283 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1316 f5711;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1992 f5712;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f5713;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f5714;

    public C1283(java.lang.String r3, java.lang.Object r4, defpackage.C1992 r5, defpackage.C1316 r6) {
            r2 = this;
            r0 = -495218603761198(0xfffe3d99ef0961d2, double:NaN)
            r0 = -495235783630382(0xfffe3d95ef0961d2, double:NaN)
            r0 = -495274438336046(0xfffe3d8cef0961d2, double:NaN)
            r2.<init>()
            r2.f5713 = r3
            r2.f5714 = r4
            r2.f5712 = r5
            r2.f5711 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C1283
            r2 = 0
            if (r1 != 0) goto La
            goto L21
        La:
            ᛷᛵᲇᛴ r5 = (defpackage.C1283) r5
            java.lang.String r1 = r4.f5713
            java.lang.String r3 = r5.f5713
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            goto L21
        L17:
            java.lang.Object r1 = r4.f5714
            java.lang.Object r3 = r5.f5714
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L22
        L21:
            return r2
        L22:
            ᲇᛱᲈᲀ r1 = r4.f5712
            ᲇᛱᲈᲀ r3 = r5.f5712
            if (r1 == r3) goto L29
            return r2
        L29:
            ᛷᛷᲀᛳ r4 = r4.f5711
            ᛷᛷᲀᛳ r5 = r5.f5711
            if (r4 == r5) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f5713
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f5714
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            ᲇᛱᲈᲀ r0 = r2.f5712
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            ᛷᛷᲀᛳ r2 = r2.f5711
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -495407582322222(0xfffe3d6def0961d2, double:NaN)
            java.lang.String r1 = "ConfigEntry(key="
            r0.<init>(r1)
            java.lang.String r1 = r4.f5713
            r2 = -495480596766254(0xfffe3d5cef0961d2, double:NaN)
            r0.append(r1); r0.append(", defaultValue=")
            java.lang.Object r1 = r4.f5714
            r0.append(r1)
            r1 = -495549316242990(0xfffe3d4cef0961d2, double:NaN)
            java.lang.String r1 = ", getValue="
            r0.append(r1)
            ᲇᛱᲈᲀ r1 = r4.f5712
            r0.append(r1)
            r1 = -495600855850542(0xfffe3d40ef0961d2, double:NaN)
            java.lang.String r1 = ", setValue="
            r0.append(r1)
            ᛷᛷᲀᛳ r4 = r4.f5711
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
