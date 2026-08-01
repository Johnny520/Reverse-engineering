package defpackage;

/* JADX INFO: renamed from: ᛸᛷᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1530 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Point f6746;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f6747;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f6748;

    public C1530(int r2, int r3, android.graphics.Point r4) {
            r1 = this;
            int r0 = r4.x
            int r4 = r4.y
            r1.<init>()
            r1.f6747 = r2
            r1.f6748 = r3
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r0, r4)
            r1.f6746 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1f
        L3:
            boolean r0 = r3 instanceof defpackage.C1530
            if (r0 == 0) goto L21
            ᛸᛷᛵᛵ r3 = (defpackage.C1530) r3
            int r0 = r2.f6747
            int r1 = r3.f6747
            if (r0 != r1) goto L21
            int r0 = r2.f6748
            int r1 = r3.f6748
            if (r0 != r1) goto L21
            android.graphics.Point r2 = r2.f6746
            android.graphics.Point r3 = r3.f6746
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L21
        L1f:
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f6747
            int r0 = r0 * 31
            int r1 = r2.f6748
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.graphics.Point r2 = r2.f6746
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RoundedCornerCompat{position="
            r0.<init>(r1)
            int r1 = r3.f6747
            if (r1 == 0) goto L20
            r2 = 1
            if (r1 == r2) goto L1d
            r2 = 2
            if (r1 == r2) goto L1a
            r2 = 3
            if (r1 == r2) goto L17
            java.lang.String r1 = "Invalid"
            goto L22
        L17:
            java.lang.String r1 = "BottomLeft"
            goto L22
        L1a:
            java.lang.String r1 = "BottomRight"
            goto L22
        L1d:
            java.lang.String r1 = "TopRight"
            goto L22
        L20:
            java.lang.String r1 = "TopLeft"
        L22:
            r0.append(r1)
            java.lang.String r1 = ", radius="
            r0.append(r1)
            int r1 = r3.f6748
            r0.append(r1)
            java.lang.String r1 = ", center="
            r0.append(r1)
            android.graphics.Point r3 = r3.f6746
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
