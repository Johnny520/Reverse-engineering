package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛵᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0277 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f1070;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.String f1071;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f1072;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.String f1073;

    public C0277(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f1072 = r1
            r0.f1070 = r2
            r0.f1071 = r3
            r0.f1073 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof xhss.C0277
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᛳᛵᲁᲀ r5 = (xhss.C0277) r5
            java.lang.String r1 = r4.f1072
            java.lang.String r3 = r5.f1072
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f1070
            java.lang.String r3 = r5.f1070
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f1071
            java.lang.String r3 = r5.f1071
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r4 = r4.f1073
            java.lang.String r5 = r5.f1073
            boolean r4 = xhss.AbstractC0007.m97(r4, r5)
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.String r1 = r3.f1072
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.String r2 = r3.f1070
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r3.f1071
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r3 = r3.f1073
            if (r3 != 0) goto L2c
            goto L30
        L2c:
            int r0 = r3.hashCode()
        L30:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -285370973784133(0xfffefc74e47a77bb, double:NaN)
            java.lang.String r1 = "UserInfo(registerTime="
            r0.<init>(r1)
            java.lang.String r1 = r3.f1072
            r0.append(r1)
            r1 = -285469758031941(0xfffefc5de47a77bb, double:NaN)
            java.lang.String r1 = ", redId="
            r0.append(r1)
            java.lang.String r1 = r3.f1070
            r0.append(r1)
            r1 = -285508412737605(0xfffefc54e47a77bb, double:NaN)
            java.lang.String r1 = ", nickname="
            r0.append(r1)
            java.lang.String r1 = r3.f1071
            r0.append(r1)
            r1 = -285559952345157(0xfffefc48e47a77bb, double:NaN)
            java.lang.String r1 = ", userid="
            r0.append(r1)
            java.lang.String r3 = r3.f1073
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
