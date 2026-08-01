package defpackage;

/* JADX INFO: renamed from: ᲇᲀᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2124 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f9091;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f9092;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f9093;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f9094;

    public C2124(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r0 = -924573599440430(0xfffcb71aef0961d2, double:NaN)
            r2.<init>()
            r2.f9093 = r4
            r2.f9094 = r5
            r2.f9092 = r6
            r2.f9091 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C2124
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᲇᲀᲇᛴ r5 = (defpackage.C2124) r5
            java.lang.String r1 = r4.f9093
            java.lang.String r3 = r5.f9093
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f9094
            java.lang.String r3 = r5.f9094
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f9092
            java.lang.String r3 = r5.f9092
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            int r4 = r4.f9091
            int r5 = r5.f9091
            if (r4 == r5) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9093
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.String r2 = r3.f9094
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.f9092
            if (r2 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r2.hashCode()
        L1f:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r3 = r3.f9091
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -924659498786350(0xfffcb706ef0961d2, double:NaN)
            java.lang.String r1 = "UserStatsResult(authorUid="
            r0.<init>(r1)
            java.lang.String r1 = r4.f9093
            r2 = -924775462903342(0xfffcb6ebef0961d2, double:NaN)
            r0.append(r1); r0.append(", authorName=")
            java.lang.String r1 = r4.f9094
            r2 = -924835592445486(0xfffcb6ddef0961d2, double:NaN)
            r0.append(r1); r0.append(", authorAvatar=")
            java.lang.String r1 = r4.f9092
            r2 = -924904311922222(0xfffcb6cdef0961d2, double:NaN)
            r0.append(r1); r0.append(", count=")
            int r4 = r4.f9091
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
