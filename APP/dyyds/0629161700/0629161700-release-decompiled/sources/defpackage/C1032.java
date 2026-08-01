package defpackage;

/* JADX INFO: renamed from: ᛶᛳᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1032 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C1032 f4594 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f4595;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f4596;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f4597;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f4598;

    static {
            ᛶᛳᛴᛲ r0 = new ᛶᛳᛴᛲ
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            defpackage.C1032.f4594 = r0
            return
    }

    public C1032(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f4597 = r1
            r0.f4598 = r2
            r0.f4596 = r3
            r0.f4595 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C1032 m1985(int r1, int r2, int r3, int r4) {
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            ᛶᛳᛴᛲ r1 = defpackage.C1032.f4594
            return r1
        Lb:
            ᛶᛳᛴᛲ r0 = new ᛶᛳᛴᛲ
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C1032 m1986(android.graphics.Insets r3) {
            int r0 = r3.left
            int r1 = r3.top
            int r2 = r3.right
            int r3 = r3.bottom
            ᛶᛳᛴᛲ r3 = m1985(r0, r1, r2, r3)
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class<ᛶᛳᛴᛲ> r2 = defpackage.C1032.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2f
        L10:
            ᛶᛳᛴᛲ r5 = (defpackage.C1032) r5
            int r2 = r4.f4595
            int r3 = r5.f4595
            if (r2 == r3) goto L19
            return r1
        L19:
            int r2 = r4.f4597
            int r3 = r5.f4597
            if (r2 == r3) goto L20
            return r1
        L20:
            int r2 = r4.f4596
            int r3 = r5.f4596
            if (r2 == r3) goto L27
            return r1
        L27:
            int r4 = r4.f4598
            int r5 = r5.f4598
            if (r4 == r5) goto L2e
            return r1
        L2e:
            return r0
        L2f:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f4597
            int r0 = r0 * 31
            int r1 = r2.f4598
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f4596
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.f4595
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Insets{left="
            r0.<init>(r1)
            int r1 = r2.f4597
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            int r1 = r2.f4598
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r2.f4596
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r2 = r2.f4595
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Insets m1987() {
            r3 = this;
            int r0 = r3.f4596
            int r1 = r3.f4595
            int r2 = r3.f4597
            int r3 = r3.f4598
            android.graphics.Insets r3 = android.graphics.Insets.of(r2, r3, r0, r1)
            return r3
    }
}
