package defpackage;

/* JADX INFO: renamed from: ᛸᛲᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1441 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.ViewOnLayoutChangeListenerC1014 f6326;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1175 f6327;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f6328;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f6329;

    public C1441(java.lang.String r3, java.lang.String r4, defpackage.C1175 r5, defpackage.ViewOnLayoutChangeListenerC1014 r6) {
            r2 = this;
            r0 = -387835831426606(0xfffe9f43ef0961d2, double:NaN)
            r0 = -387874486132270(0xfffe9f3aef0961d2, double:NaN)
            r0 = -387908845870638(0xfffe9f32ef0961d2, double:NaN)
            r0 = -387947500576302(0xfffe9f29ef0961d2, double:NaN)
            r2.<init>()
            r2.f6328 = r3
            r2.f6329 = r4
            r2.f6327 = r5
            r2.f6326 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C1441
            r2 = 0
            if (r1 != 0) goto La
            goto L21
        La:
            ᛸᛲᲀᛱ r5 = (defpackage.C1441) r5
            java.lang.String r1 = r4.f6328
            java.lang.String r3 = r5.f6328
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            goto L21
        L17:
            java.lang.String r1 = r4.f6329
            java.lang.String r3 = r5.f6329
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L22
        L21:
            return r2
        L22:
            ᛶᲇᲀᲇ r1 = r4.f6327
            ᛶᲇᲀᲇ r3 = r5.f6327
            if (r1 == r3) goto L29
            return r2
        L29:
            ᛶᛱᛷᛶ r4 = r4.f6326
            ᛶᛱᛷᛶ r5 = r5.f6326
            if (r4 == r5) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f6328
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f6329
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            ᛶᲇᲀᲇ r2 = r3.f6327
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            ᛶᛱᛷᛶ r3 = r3.f6326
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -388261033188910(0xfffe9ee0ef0961d2, double:NaN)
            java.lang.String r1 = "WatermarkOverlayState(nickname="
            r0.<init>(r1)
            java.lang.String r1 = r4.f6328
            r2 = -388398472142382(0xfffe9ec0ef0961d2, double:NaN)
            r0.append(r1); r0.append(", account=")
            java.lang.String r1 = r4.f6329
            r2 = -388445716782638(0xfffe9eb5ef0961d2, double:NaN)
            r0.append(r1); r0.append(", drawable=")
            ᛶᲇᲀᲇ r1 = r4.f6327
            r0.append(r1)
            r1 = -388497256390190(0xfffe9ea9ef0961d2, double:NaN)
            java.lang.String r1 = ", layoutListener="
            r0.append(r1)
            ᛶᛱᛷᛶ r4 = r4.f6326
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
