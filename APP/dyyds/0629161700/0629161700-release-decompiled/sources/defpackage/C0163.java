package defpackage;

/* JADX INFO: renamed from: ᛱᲀᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0163 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f1138;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f1139;

    public C0163(java.lang.String r3, int r4) {
            r2 = this;
            r0 = -1019565391126062(0xfffc60b5ef0961d2, double:NaN)
            r2.<init>()
            r2.f1138 = r3
            r2.f1139 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C0163
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛱᲀᛵᛴ r5 = (defpackage.C0163) r5
            java.lang.String r1 = r4.f1138
            java.lang.String r3 = r5.f1138
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r4 = r4.f1139
            int r5 = r5.f1139
            if (r4 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f1138
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.f1139
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -1019642700537390(0xfffc60a3ef0961d2, double:NaN)
            java.lang.String r1 = "CategoryStats(category="
            r0.<init>(r1)
            java.lang.String r1 = r4.f1138
            r2 = -1019745779752494(0xfffc608bef0961d2, double:NaN)
            r0.append(r1); r0.append(", count=")
            int r4 = r4.f1139
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
