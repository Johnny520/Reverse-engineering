package defpackage;

/* JADX INFO: renamed from: ᛴᲀᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0750 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1157 f3523;

    static {
            ᛴᲀᛸᛷ r0 = new ᛴᲀᛸᛷ
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r2, r2)
            return
    }

    public C0750(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            ᛶᲁᛷᛲ r0 = new ᛶᲁᛷᛲ
            r0.<init>(r2, r3, r4)
            r1.f3523 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0750 m1666(int r6, int r7, boolean r8, int r9, int r10, int r11, int r12) {
            java.lang.String r0 = " Z"
            java.lang.String r1 = ","
            if (r8 == 0) goto L4d
            int r8 = r6 / 2
            int r9 = r7 / 2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "M0,"
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r11 = " A"
            r10.append(r11)
            r10.append(r8)
            r10.append(r1)
            r10.append(r9)
            java.lang.String r12 = " 0 1,1 "
            r10.append(r12)
            r10.append(r6)
            r10.append(r1)
            r10.append(r9)
            r10.append(r11)
            r10.append(r8)
            r10.append(r1)
            r10.append(r9)
            java.lang.String r8 = " 0 1,1 0,"
            r10.append(r8)
            r10.append(r9)
            r10.append(r0)
            java.lang.String r8 = r10.toString()
            goto L112
        L4d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "M "
            r8.<init>(r2)
            int r2 = r6 / 2
            int r3 = r7 / 2
            int r2 = java.lang.Math.min(r2, r3)
            int r9 = java.lang.Math.min(r2, r9)
            int r10 = java.lang.Math.min(r2, r10)
            int r11 = java.lang.Math.min(r2, r11)
            int r12 = java.lang.Math.min(r2, r12)
            r8.append(r9)
            java.lang.String r2 = ",0 L "
            r8.append(r2)
            int r2 = r6 - r10
            r8.append(r2)
            java.lang.String r2 = ",0"
            r8.append(r2)
            java.lang.String r3 = " 0 0,1 "
            java.lang.String r4 = " A "
            if (r10 <= 0) goto L9c
            r8.append(r4)
            r8.append(r10)
            r8.append(r1)
            r8.append(r10)
            r8.append(r3)
            r8.append(r6)
            r8.append(r1)
            r8.append(r10)
        L9c:
            java.lang.String r10 = " L "
            r8.append(r10)
            r8.append(r6)
            r8.append(r1)
            int r5 = r7 - r11
            r8.append(r5)
            if (r11 <= 0) goto Lc8
            r8.append(r4)
            r8.append(r11)
            r8.append(r1)
            r8.append(r11)
            r8.append(r3)
            int r11 = r6 - r11
            r8.append(r11)
            r8.append(r1)
            r8.append(r7)
        Lc8:
            r8.append(r10)
            r8.append(r12)
            r8.append(r1)
            r8.append(r7)
            if (r12 <= 0) goto Lec
            r8.append(r4)
            r8.append(r12)
            r8.append(r1)
            r8.append(r12)
            java.lang.String r10 = " 0 0,1 0,"
            r8.append(r10)
            int r10 = r7 - r12
            r8.append(r10)
        Lec:
            if (r9 <= 0) goto L10b
            java.lang.String r10 = " L 0,"
            r8.append(r10)
            r8.append(r9)
            r8.append(r4)
            r8.append(r9)
            r8.append(r1)
            r8.append(r9)
            r8.append(r3)
            r8.append(r9)
            r8.append(r2)
        L10b:
            r8.append(r0)
            java.lang.String r8 = r8.toString()
        L112:
            ᛴᲀᛸᛷ r9 = new ᛴᲀᛸᛷ
            r9.<init>(r8, r6, r7)
            return r9
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.C0750
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            ᛴᲀᛸᛷ r2 = (defpackage.C0750) r2
            ᛶᲁᛷᛲ r1 = r1.f3523
            ᛶᲁᛷᛲ r2 = r2.f3523
            boolean r1 = r1.equals(r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ᛶᲁᛷᛲ r0 = r0.f3523
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            ᛶᲁᛷᛲ r0 = r0.f3523
            java.lang.String r0 = r0.toString()
            return r0
    }
}
