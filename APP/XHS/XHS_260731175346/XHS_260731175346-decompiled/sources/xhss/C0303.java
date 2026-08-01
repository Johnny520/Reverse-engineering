package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛸᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0303 extends xhss.AbstractC0954 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.String f1153;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.C0380 f1154;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C0380 f1155;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f1156;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0380 f1157;

    public C0303(org.luckypray.dexkit.DexKitBridge r7, int r8, int r9, int r10, int r11, java.lang.String r12, int r13, java.util.ArrayList r14) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            r6.f1156 = r11
            r6.f1153 = r12
            xhss.ᛸᛱᲁᲁ r10 = new xhss.ᛸᛱᲁᲁ
            r11 = 4
            r10.<init>(r11, r6)
            xhss.ᛴᛷᛱ r11 = new xhss.ᛴᛷᛱ
            r11.<init>(r10)
            r6.f1157 = r11
            xhss.ᛵᛳᲈᲁ r0 = new xhss.ᛵᛳᲈᲁ
            r5 = 1
            r2 = r6
            r1 = r7
            r4 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r8 = r2
            r10 = r4
            xhss.ᛴᛷᛱ r6 = new xhss.ᛴᛷᛱ
            r6.<init>(r0)
            r8.f1155 = r6
            xhss.ᛵᛳᲈᲁ r6 = new xhss.ᛵᛳᲈᲁ
            r11 = 2
            r6.<init>(r7, r8, r9, r10, r11)
            xhss.ᛴᛷᛱ r7 = new xhss.ᛴᛷᛱ
            r7.<init>(r6)
            r8.f1154 = r7
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L13
        L3:
            boolean r0 = r2 instanceof xhss.C0303
            if (r0 == 0) goto L15
            xhss.ᛳᛸᛸᛵ r2 = (xhss.C0303) r2
            java.lang.String r2 = r2.f1153
            java.lang.String r1 = r1.f1153
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f1153
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            int r2 = r4.f1156
            if (r2 == 0) goto L21
            java.lang.String r2 = java.lang.reflect.Modifier.toString(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
        L21:
            xhss.ᲇᛴᲇᛴ r2 = r4.m631()
            java.lang.String r2 = r2.f3344
            r0.append(r2)
            r0.append(r1)
            xhss.ᲇᛴᲇᛴ r1 = r4.m631()
            java.lang.String r1 = r1.f3343
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            xhss.ᲇᛴᲇᛴ r1 = r4.m631()
            java.lang.String r1 = r1.f3340
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            xhss.ᲇᛴᲇᛴ r4 = r4.m631()
            java.util.ArrayList r4 = r4.f3341
            r1 = 0
            r2 = 62
            java.lang.String r3 = ", "
            java.lang.String r4 = xhss.AbstractC0713.m1242(r4, r3, r1, r2)
            r0.append(r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C1035 m631() {
            r0 = this;
            xhss.ᛴᛷᛱ r0 = r0.f1157
            java.lang.Object r0 = r0.m734()
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
    }
}
