package defpackage;

/* JADX INFO: renamed from: ᛳᲈᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0602 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f2985;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f2986;

    public C0602(java.lang.String r3, int r4) {
            r2 = this;
            r0 = -954951903125038(0xfffc9b79ef0961d2, double:NaN)
            r2.<init>()
            r2.f2985 = r3
            r2.f2986 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C0602
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛳᲈᲈᲁ r5 = (defpackage.C0602) r5
            java.lang.String r1 = r4.f2985
            java.lang.String r3 = r5.f2985
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r4 = r4.f2986
            int r5 = r5.f2986
            if (r4 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f2985
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.f2986
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -955029212536366(0xfffc9b67ef0961d2, double:NaN)
            java.lang.String r1 = "CategoryStatsResult(category="
            r0.<init>(r1)
            java.lang.String r1 = r4.f2985
            r2 = -955158061555246(0xfffc9b49ef0961d2, double:NaN)
            r0.append(r1); r0.append(", count=")
            int r4 = r4.f2986
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
