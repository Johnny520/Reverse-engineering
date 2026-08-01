package defpackage;

/* JADX INFO: renamed from: ᛶᛶᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1090 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f4886;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f4887;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f4888;

    public C1090(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            r0 = -385688347778606(0xfffea137ef0961d2, double:NaN)
            r0 = -385701232680494(0xfffea134ef0961d2, double:NaN)
            r2.<init>()
            r2.f4887 = r3
            r2.f4888 = r5
            r2.f4886 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.C1090
            if (r0 != 0) goto L8
            goto L26
        L8:
            ᛶᛶᛴᛷ r3 = (defpackage.C1090) r3
            java.lang.String r0 = r2.f4887
            java.lang.String r1 = r3.f4887
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.lang.String r0 = r2.f4888
            java.lang.String r1 = r3.f4888
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            int r2 = r2.f4886
            int r3 = r3.f4886
            if (r2 == r3) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4887
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4888
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            int r3 = r3.f4886
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -385757067255342(0xfffea127ef0961d2, double:NaN)
            java.lang.String r1 = "VideoMenuView(id="
            r0.<init>(r1)
            java.lang.String r1 = r4.f4887
            r2 = -385834376666670(0xfffea115ef0961d2, double:NaN)
            r0.append(r1); r0.append(", name=")
            java.lang.String r1 = r4.f4888
            r2 = -385868736405038(0xfffea10def0961d2, double:NaN)
            r0.append(r1); r0.append(", viewId=")
            int r4 = r4.f4886
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
