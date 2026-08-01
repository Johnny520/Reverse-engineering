package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0079 extends xhss.AbstractC0252 {

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final xhss.C0564 f421 = null;

    static {
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r1 = 20
            r0.<init>(r1)
            xhss.C0079.f421 = r0
            return
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static void m237(xhss.AbstractC0252 r11, java.lang.String r12, xhss.AbstractC0356 r13, java.lang.Object r14, xhss.C0530 r15, xhss.InterfaceC1060 r16) {
            r4 = r15
            r5 = r16
            xhss.ᲀᛲᲇ r6 = r4.f1940
            xhss.ᲇᛵᛲᲁ r0 = r6.f2745
            r0.getClass()
            boolean r0 = r14 instanceof java.util.Map
            if (r0 == 0) goto L6b
            boolean r0 = r5.mo536(r14)
            if (r0 == 0) goto L17
            r11.mo131(r12, r13, r14, r15)
        L17:
            xhss.ᲇᛵᛲᲁ r13 = r6.f2745
            java.util.Set r13 = r13.m1690(r14)
            java.util.Iterator r13 = r13.iterator()
        L21:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lf8
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = "['"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "']"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            xhss.ᲇᛵᛲᲁ r2 = r6.f2745
            r2.getClass()
            r2 = r14
            java.util.Map r2 = (java.util.Map) r2
            boolean r3 = r2.containsKey(r0)
            java.lang.Object r7 = xhss.C1037.f3347
            if (r3 != 0) goto L58
            r3 = r7
            goto L5d
        L58:
            java.lang.Object r2 = r2.get(r0)
            r3 = r2
        L5d:
            if (r3 == r7) goto L21
            xhss.ᛵᛵᲀᲇ r2 = new xhss.ᛵᛵᲀᲇ
            r2.<init>(r14)
            r2.f1711 = r0
            r0 = r11
            m237(r0, r1, r2, r3, r4, r5)
            goto L21
        L6b:
            xhss.ᲇᛵᛲᲁ r0 = r6.f2745
            xhss.ᲇᛵᛲᲁ r1 = r6.f2745
            r0.getClass()
            boolean r0 = r14 instanceof java.util.List
            if (r0 == 0) goto Lf8
            boolean r0 = r5.mo536(r14)
            java.lang.String r6 = "]"
            java.lang.String r7 = "["
            r2 = 0
            if (r0 == 0) goto Lbf
            boolean r0 = r11.m559()
            if (r0 == 0) goto L8b
            r11.mo131(r12, r13, r14, r15)
            goto Lbf
        L8b:
            xhss.ᛳᛳᛵᛱ r0 = r11.m560()
            java.lang.Iterable r3 = r1.m1691(r14)
            java.util.Iterator r3 = r3.iterator()
            r8 = r2
        L98:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto Lbf
            java.lang.Object r9 = r3.next()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r10.append(r7)
            r10.append(r8)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            r0.f938 = r8
            r0.mo131(r10, r13, r9, r15)
            int r8 = r8 + 1
            goto L98
        Lbf:
            java.lang.Iterable r13 = r1.m1691(r14)
            java.util.Iterator r13 = r13.iterator()
            r8 = r2
        Lc8:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lf8
            java.lang.Object r3 = r13.next()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r7)
            r0.append(r8)
            r0.append(r6)
            java.lang.String r1 = r0.toString()
            xhss.ᛷᛷᛳᛶ r2 = new xhss.ᛷᛷᛳᛶ
            r2.<init>(r14)
            r2.f2295 = r8
            r0 = r11
            m237(r0, r1, r2, r3, r4, r5)
            int r8 = r8 + 1
            r4 = r15
            r5 = r16
            goto Lc8
        Lf8:
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo130() {
            r0 = this;
            java.lang.String r0 = ".."
            return r0
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo131(java.lang.String r7, xhss.AbstractC0356 r8, java.lang.Object r9, xhss.C0530 r10) {
            r6 = this;
            xhss.ᛳᛳᛵᛱ r0 = r6.m560()
            boolean r6 = r0 instanceof xhss.C0511
            r1 = 0
            if (r6 == 0) goto L19
            xhss.ᛳᛱᛲᲀ r6 = new xhss.ᛳᛱᛲᲀ
            r2 = r0
            xhss.ᛵᲀᛲᲇ r2 = (xhss.C0511) r2
            r3 = 14
            r6.<init>(r2, r10, r3, r1)
        L13:
            r5 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto L43
        L19:
            boolean r6 = r0 instanceof xhss.AbstractC1161
            if (r6 == 0) goto L25
            xhss.ᲇᛵᛲᲁ r6 = new xhss.ᲇᛵᛲᲁ
            r1 = 20
            r6.<init>(r1, r10)
            goto L13
        L25:
            boolean r6 = r0 instanceof xhss.C0782
            if (r6 == 0) goto L31
            xhss.ᛶᛵᲇᛸ r6 = new xhss.ᛶᛵᲇᛸ
            r1 = 21
            r6.<init>(r1)
            goto L13
        L31:
            boolean r6 = r0 instanceof xhss.C0026
            if (r6 == 0) goto L40
            xhss.ᛳᛱᛲᲀ r6 = new xhss.ᛳᛱᛲᲀ
            r2 = r0
            xhss.ᛱᛳᛶᛵ r2 = (xhss.C0026) r2
            r3 = 13
            r6.<init>(r2, r10, r3, r1)
            goto L13
        L40:
            xhss.ᛶᛵᲇᛸ r6 = xhss.C0079.f421
            goto L13
        L43:
            m237(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final boolean mo133() {
            r0 = this;
            r0 = 0
            return r0
    }
}
