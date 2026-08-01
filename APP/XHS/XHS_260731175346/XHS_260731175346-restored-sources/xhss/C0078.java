package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0078 implements xhss.InterfaceC0162 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Class f420;

    static {
            java.lang.Class<xhss.ᛷᲁᛴᛵ> r22 = xhss.InterfaceC0704.class
            java.lang.Class<xhss.ᛳᛳᛵᲈ> r23 = xhss.InterfaceC0254.class
            java.lang.Class<xhss.ᛱᛳᲇᛶ> r1 = xhss.InterfaceC0030.class
            java.lang.Class<xhss.ᛷᛴᛲᛲ> r2 = xhss.InterfaceC0645.class
            java.lang.Class<xhss.ᛵᲇᛱᛴ> r3 = xhss.InterfaceC0517.class
            java.lang.Class<xhss.ᛸᛵᛵᲈ> r4 = xhss.InterfaceC0765.class
            java.lang.Class<xhss.ᛵᛳᛵᛱ> r5 = xhss.InterfaceC0454.class
            java.lang.Class<xhss.ᲈᛴᲁᛵ> r6 = xhss.InterfaceC1137.class
            java.lang.Class<xhss.ᛷᛶᛵᛸ> r7 = xhss.InterfaceC0664.class
            java.lang.Class<xhss.ᲇᛱᛳᛳ> r8 = xhss.InterfaceC1003.class
            java.lang.Class<xhss.ᲇᛸᲀᲇ> r9 = xhss.InterfaceC1073.class
            java.lang.Class<xhss.ᛶᲇᲈᛱ> r10 = xhss.InterfaceC0606.class
            java.lang.Class<xhss.ᛱᲈᛷᛸ> r11 = xhss.InterfaceC0115.class
            java.lang.Class<xhss.ᛳᛱᛳᛳ> r12 = xhss.InterfaceC0232.class
            java.lang.Class<xhss.ᛵᛸᲈᛷ> r13 = xhss.InterfaceC0510.class
            java.lang.Class<xhss.ᛳᛵᲇᛸ> r14 = xhss.InterfaceC0279.class
            java.lang.Class<xhss.ᛳᛵᛵᲁ> r15 = xhss.InterfaceC0272.class
            java.lang.Class<xhss.ᛸᲁᛷᛳ> r16 = xhss.InterfaceC0809.class
            java.lang.Class<xhss.ᲀᲁᛷᛴ> r17 = xhss.InterfaceC0906.class
            java.lang.Class<xhss.ᲇᛳᛳᲈ> r18 = xhss.InterfaceC1018.class
            java.lang.Class<xhss.ᲈᲇᛸᛵ> r19 = xhss.InterfaceC1196.class
            java.lang.Class<xhss.ᛵᛱᛷ> r20 = xhss.InterfaceC0438.class
            java.lang.Class<xhss.ᛴᲁᛵᛵ> r21 = xhss.InterfaceC0408.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.List r0 = xhss.AbstractC0086.m245(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = xhss.AbstractC0249.m554(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L45:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r0.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L63
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            xhss.ᲀᛴᛳᛸ r6 = new xhss.ᲀᛴᛳᛸ
            r6.<init>(r4, r3)
            r1.add(r6)
            r3 = r5
            goto L45
        L63:
            xhss.AbstractC0086.m244()
            r0 = 0
            throw r0
        L68:
            int r0 = r1.size()
            if (r0 == 0) goto La3
            r3 = 1
            if (r0 == r3) goto L96
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r2 = r1.size()
            int r2 = xhss.AbstractC0955.m1564(r2)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L82:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r1.next()
            xhss.ᲀᛴᛳᛸ r2 = (xhss.C0857) r2
            java.lang.Object r3 = r2.f2767
            java.lang.Object r2 = r2.f2768
            r0.put(r3, r2)
            goto L82
        L96:
            java.lang.Object r0 = r1.get(r2)
            xhss.ᲀᛴᛳᛸ r0 = (xhss.C0857) r0
            java.lang.Object r1 = r0.f2767
            java.lang.Object r0 = r0.f2768
            java.util.Collections.singletonMap(r1, r0)
        La3:
            return
    }

    public C0078(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.f420 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C0078
            if (r0 == 0) goto L16
            java.lang.Class r1 = xhss.C0614.m1069(r1)
            xhss.ᛱᛸᛷᛸ r2 = (xhss.C0078) r2
            java.lang.Class r2 = xhss.C0614.m1069(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Class r0 = xhss.C0614.m1069(r0)
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r1.f420
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // xhss.InterfaceC0162
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Class mo236() {
            r0 = this;
            java.lang.Class r0 = r0.f420
            return r0
    }
}
