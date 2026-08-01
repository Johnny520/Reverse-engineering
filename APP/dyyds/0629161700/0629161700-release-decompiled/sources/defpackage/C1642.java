package defpackage;

/* JADX INFO: renamed from: ᲀᛳᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1642 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f7329;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f7330;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f7331;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f7332;

    public C1642(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f7331 = r1
            r0.f7332 = r2
            r0.f7330 = r3
            r0.f7329 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C1642
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᲀᛳᛱᲈ r5 = (defpackage.C1642) r5
            int r1 = r4.f7331
            int r3 = r5.f7331
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f7332
            int r3 = r5.f7332
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.f7330
            int r3 = r5.f7330
            if (r1 == r3) goto L21
            return r2
        L21:
            int r4 = r4.f7329
            int r5 = r5.f7329
            if (r4 == r5) goto L28
            return r2
        L28:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f7331
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f7332
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            int r2 = r3.f7330
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            int r3 = r3.f7329
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -1117890077433390(0xfffc0748ef0961d2, double:NaN)
            java.lang.String r1 = "TypeFilterCountsResult(allCount="
            r0.<init>(r1)
            int r1 = r4.f7331
            r2 = -1118031811354158(0xfffc0727ef0961d2, double:NaN)
            r0.append(r1); r0.append(", videoCount=")
            int r1 = r4.f7332
            r2 = -1118091940896302(0xfffc0719ef0961d2, double:NaN)
            r0.append(r1); r0.append(", commentCount=")
            int r1 = r4.f7330
            r2 = -1118160660373038(0xfffc0709ef0961d2, double:NaN)
            r0.append(r1); r0.append(", userCount=")
            int r4 = r4.f7329
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
