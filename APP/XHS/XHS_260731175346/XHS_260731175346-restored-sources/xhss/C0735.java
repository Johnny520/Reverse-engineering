package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛲᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0735 extends java.util.HashMap implements xhss.InterfaceC0233, xhss.InterfaceC0995 {
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static java.lang.String m1277(java.util.Map r1, xhss.C1021 r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            m1278(r1, r0, r2)     // Catch: java.io.IOException -> L8
        L8:
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static void m1278(java.util.Map r4, java.lang.StringBuilder r5, xhss.C1021 r6) {
            r6.getClass()
            r0 = 123(0x7b, float:1.72E-43)
            r5.append(r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r0 = 1
        L11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            if (r2 != 0) goto L28
            boolean r3 = r6.f3320
            if (r3 == 0) goto L28
            goto L11
        L28:
            if (r0 == 0) goto L2c
            r0 = 0
            goto L31
        L2c:
            r3 = 44
            r5.append(r3)
        L31:
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = r1.toString()
            xhss.C0230.m519(r1, r2, r5, r6)
            goto L11
        L3d:
            r4 = 125(0x7d, float:1.75E-43)
            r5.append(r4)
            return
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
            r1 = this;
            xhss.ᲇᛳᛶ r0 = xhss.AbstractC0518.f1886
            java.lang.String r1 = m1277(r1, r0)
            return r1
    }

    @Override // xhss.InterfaceC0995
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final void mo1276(java.lang.StringBuilder r1, xhss.C1021 r2) {
            r0 = this;
            m1278(r0, r1, r2)
            return
    }

    @Override // xhss.InterfaceC0651
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.String mo1143() {
            r1 = this;
            xhss.ᲇᛳᛶ r0 = xhss.AbstractC0518.f1886
            java.lang.String r1 = m1277(r1, r0)
            return r1
    }

    @Override // xhss.InterfaceC0233
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.String mo539(xhss.C1021 r1) {
            r0 = this;
            java.lang.String r0 = m1277(r0, r1)
            return r0
    }

    @Override // xhss.InterfaceC0560
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final void mo996(java.lang.StringBuilder r2) {
            r1 = this;
            xhss.ᲇᛳᛶ r0 = xhss.AbstractC0518.f1886
            m1278(r1, r2, r0)
            return
    }
}
