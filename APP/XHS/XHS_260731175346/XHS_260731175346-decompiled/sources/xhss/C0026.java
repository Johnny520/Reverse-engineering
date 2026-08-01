package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛳᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0026 extends xhss.AbstractC0252 {

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.util.List f205;

    public C0026(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            r0.f205 = r1
            return
    }

    public C0026(xhss.C0072 r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.f205 = r1
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String mo130() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            r1 = 0
        L8:
            java.util.List r2 = r3.f205
            int r2 = r2.size()
            if (r1 >= r2) goto L1f
            if (r1 == 0) goto L17
            java.lang.String r2 = ","
            r0.append(r2)
        L17:
            java.lang.String r2 = "?"
            r0.append(r2)
            int r1 = r1 + 1
            goto L8
        L1f:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void mo131(java.lang.String r5, xhss.AbstractC0356 r6, java.lang.Object r7, xhss.C0530 r8) {
            r4 = this;
            xhss.ᲀᛲᲇ r6 = r8.f1940
            java.lang.Object r0 = r8.f1939
            xhss.ᲇᛵᛲᲁ r1 = r6.f2745
            r1.getClass()
            boolean r1 = r7 instanceof java.util.Map
            if (r1 == 0) goto L27
            boolean r6 = r4.m132(r7, r0, r6, r8)
            if (r6 == 0) goto L57
            boolean r6 = r4.m559()
            xhss.ᲀᛱᛸᛳ r0 = xhss.AbstractC0356.f1319
            if (r6 == 0) goto L1f
            r8.m944(r5, r0, r7)
            return
        L1f:
            xhss.ᛳᛳᛵᛱ r4 = r4.m560()
            r4.mo131(r5, r0, r7, r8)
            return
        L27:
            xhss.ᲇᛵᛲᲁ r1 = r6.f2745
            r1.getClass()
            boolean r1 = r7 instanceof java.util.List
            if (r1 == 0) goto L51
            xhss.ᲇᛵᛲᲁ r1 = r6.f2745
            java.lang.Iterable r1 = r1.m1691(r7)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L3b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            boolean r3 = r4.m132(r3, r0, r6, r8)
            if (r3 == 0) goto L4e
            r4.m558(r2, r5, r7, r8)
        L4e:
            int r2 = r2 + 1
            goto L3b
        L51:
            boolean r5 = r4.m561()
            if (r5 != 0) goto L58
        L57:
            return
        L58:
            xhss.ᲁᲀᛳ r5 = new xhss.ᲁᲀᛳ
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r7}
            java.lang.String r6 = "Filter: %s can not be applied to primitives. Current context is: %s"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final boolean m132(java.lang.Object r2, java.lang.Object r3, xhss.C0844 r4, xhss.C0530 r5) {
            r1 = this;
            xhss.ᲈᲀᲇᛵ r0 = new xhss.ᲈᲀᲇᛵ
            java.util.HashMap r5 = r5.f1944
            r0.<init>(r2, r3, r4, r5)
            java.util.List r1 = r1.f205
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            xhss.ᛸᛷᲁᛵ r2 = (xhss.InterfaceC0786) r2
            r3 = 0
            boolean r2 = r2.mo223(r0)     // Catch: xhss.C0978 -> L20
            if (r2 != 0) goto Ld
        L20:
            return r3
        L21:
            r1 = 1
            return r1
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final boolean mo133() {
            r0 = this;
            r0 = 0
            return r0
    }
}
