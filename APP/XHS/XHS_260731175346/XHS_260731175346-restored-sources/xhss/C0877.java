package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛷᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0877 extends xhss.AbstractC0954 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.String f2828;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C0380 f2829;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.C0380 f2830;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C0380 f2831;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f2832;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int f2833;

    public C0877(org.luckypray.dexkit.DexKitBridge r7, int r8, int r9, int r10, int r11, java.lang.String r12, int r13) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            r6.f2832 = r11
            r6.f2828 = r12
            r6.f2833 = r13
            xhss.ᛸᛱᲁᲁ r10 = new xhss.ᛸᛱᲁᲁ
            r11 = 3
            r10.<init>(r11, r6)
            xhss.ᛴᛷᛱ r11 = new xhss.ᛴᛷᛱ
            r11.<init>(r10)
            r6.f2831 = r11
            xhss.ᛶᲇᲇᛸ r10 = new xhss.ᛶᲇᲇᛸ
            r11 = 2
            r10.<init>(r7, r6, r9, r11)
            xhss.ᛴᛷᛱ r11 = new xhss.ᛴᛷᛱ
            r11.<init>(r10)
            r6.f2830 = r11
            xhss.ᛵᛳᲈᲁ r0 = new xhss.ᛵᛳᲈᲁ
            r5 = 0
            r2 = r6
            r1 = r7
            r4 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            xhss.ᛴᛷᛱ r6 = new xhss.ᛴᛷᛱ
            r6.<init>(r0)
            r2.f2829 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof xhss.C0877
            if (r1 == 0) goto L15
            xhss.ᲀᛷᲀᲇ r3 = (xhss.C0877) r3
            java.lang.String r3 = r3.f2828
            java.lang.String r2 = r2.f2828
            boolean r2 = xhss.AbstractC0007.m97(r3, r2)
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f2828
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            int r2 = r4.f2832
            if (r2 <= 0) goto L21
            java.lang.String r2 = java.lang.reflect.Modifier.toString(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
        L21:
            xhss.ᛷᛲᛲᛲ r2 = r4.m1443()
            java.lang.String r2 = r2.f2168
            r0.append(r2)
            r0.append(r1)
            xhss.ᛷᛲᛲᛲ r1 = r4.m1443()
            java.lang.String r1 = r1.f2169
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            xhss.ᛷᛲᛲᛲ r4 = r4.m1443()
            java.lang.String r4 = r4.f2167
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0630 m1443() {
            r0 = this;
            xhss.ᛴᛷᛱ r0 = r0.f2831
            java.lang.Object r0 = r0.m734()
            xhss.ᛷᛲᛲᛲ r0 = (xhss.C0630) r0
            return r0
    }
}
