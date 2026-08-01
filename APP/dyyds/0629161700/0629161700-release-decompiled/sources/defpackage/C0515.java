package defpackage;

/* JADX INFO: renamed from: ᛳᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0515 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f2543;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f2544;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f2545;

    public C0515(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            r0 = -518918233300526(0xfffe280bef0961d2, double:NaN)
            r0 = -518931118202414(0xfffe2808ef0961d2, double:NaN)
            r2.<init>()
            r2.f2544 = r3
            r2.f2545 = r5
            r2.f2543 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.C0515
            if (r0 != 0) goto L8
            goto L26
        L8:
            ᛳᛷᛸ r3 = (defpackage.C0515) r3
            java.lang.String r0 = r2.f2544
            java.lang.String r1 = r3.f2544
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.lang.String r0 = r2.f2545
            java.lang.String r1 = r3.f2545
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            int r2 = r2.f2543
            int r3 = r3.f2543
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
            java.lang.String r0 = r3.f2544
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f2545
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            int r3 = r3.f2543
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -518995542711854(0xfffe27f9ef0961d2, double:NaN)
            java.lang.String r1 = "Tool(id="
            r0.<init>(r1)
            java.lang.String r1 = r4.f2544
            r2 = -519034197417518(0xfffe27f0ef0961d2, double:NaN)
            r0.append(r1); r0.append(", label=")
            java.lang.String r1 = r4.f2545
            r2 = -519072852123182(0xfffe27e7ef0961d2, double:NaN)
            r0.append(r1); r0.append(", viewId=")
            int r4 = r4.f2543
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
