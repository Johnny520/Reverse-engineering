package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0861 extends xhss.AbstractC0052 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.InterfaceC0869 f2781 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0417 f2782;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final boolean f2783;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean f2784;

    static {
            java.lang.Class<xhss.ᲀᛴᲇ> r0 = xhss.C0861.class
            xhss.ᲀᛶᛶᲀ r0 = xhss.AbstractC0993.m1628(r0)
            xhss.C0861.f2781 = r0
            return
    }

    public C0861(java.lang.CharSequence r3, boolean r4) {
            r2 = this;
            java.lang.String r3 = r3.toString()
            r0 = 0
            xhss.ᛸᛷᲁᛵ[] r1 = new xhss.InterfaceC0786[r0]
            xhss.ᛴᲇᲀᛴ r3 = xhss.C0230.m522(r3, r1)
            r2.<init>(r3, r0, r4)
            return
    }

    public C0861(xhss.C0417 r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f2782 = r1
            r0.f2783 = r2
            r0.f2784 = r3
            xhss.ᲀᛶᛶᲀ r0 = xhss.C0861.f2781
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.mo386(r1, r2)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.f2783
            xhss.ᛴᲇᲀᛴ r1 = r3.f2782
            if (r0 == 0) goto L20
            boolean r3 = r3.f2784
            if (r3 != 0) goto L20
            xhss.ᲀᛷᲈᛳ r3 = r1.f1479
            java.lang.String r3 = r3.toString()
            r0 = 2
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            java.lang.String r1 = "!"
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = xhss.AbstractC0473.m860(r0)
            return r3
        L20:
            xhss.ᲀᛷᲈᛳ r3 = r1.f1479
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final java.lang.Class mo167(xhss.C1180 r1) {
            r0 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            return r0
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final xhss.C0861 mo170() {
            r0 = this;
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final xhss.AbstractC0052 m1436(xhss.C1180 r5) {
            r4 = this;
            xhss.ᲀᛲᲇ r0 = r5.f3803
            java.lang.String r1 = "Could not convert "
            boolean r2 = r4.f2783
            r3 = 0
            xhss.ᛴᲇᲀᛴ r4 = r4.f2782
            if (r2 == 0) goto L41
            xhss.ᲇᛸᛶ r1 = xhss.C0844.m1429()     // Catch: xhss.C0806 -> L3e
            xhss.ᲇᛵᛲᲁ r0 = r0.f2745     // Catch: xhss.C0806 -> L3e
            r1.f3444 = r0     // Catch: xhss.C0806 -> L3e
            xhss.ᛳᛳᛱᛳ r0 = xhss.EnumC0250.f933     // Catch: xhss.C0806 -> L3e
            xhss.ᛳᛳᛱᛳ[] r0 = new xhss.EnumC0250[]{r0}     // Catch: xhss.C0806 -> L3e
            java.lang.Object r2 = r1.f3445     // Catch: xhss.C0806 -> L3e
            java.util.EnumSet r2 = (java.util.EnumSet) r2     // Catch: xhss.C0806 -> L3e
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: xhss.C0806 -> L3e
            r2.addAll(r0)     // Catch: xhss.C0806 -> L3e
            xhss.ᲀᛲᲇ r0 = r1.m1729()     // Catch: xhss.C0806 -> L3e
            java.lang.Object r1 = r5.f3804     // Catch: xhss.C0806 -> L3e
            java.lang.Object r5 = r5.f3802     // Catch: xhss.C0806 -> L3e
            xhss.ᛵᲈᛷ r4 = r4.m810(r1, r5, r0)     // Catch: xhss.C0806 -> L3e
            java.lang.Object r4 = r4.m943(r3)     // Catch: xhss.C0806 -> L3e
            java.lang.Object r5 = xhss.C1037.f3347     // Catch: xhss.C0806 -> L3e
            if (r4 != r5) goto L3b
            xhss.ᲁᛳᛲᛸ r4 = xhss.InterfaceC0169.f680     // Catch: xhss.C0806 -> L3e
            return r4
        L3b:
            xhss.ᲁᛳᛲᛸ r4 = xhss.InterfaceC0169.f679     // Catch: xhss.C0806 -> L3e
            return r4
        L3e:
            xhss.ᲁᛳᛲᛸ r4 = xhss.InterfaceC0169.f680
            return r4
        L41:
            java.lang.Object r4 = r5.m1891(r4)     // Catch: xhss.C0806 -> Le8
            xhss.ᲇᛵᛲᲁ r5 = r0.f2745     // Catch: xhss.C0806 -> Le8
            r5.getClass()     // Catch: xhss.C0806 -> Le8
            boolean r5 = r4 instanceof java.lang.Number     // Catch: xhss.C0806 -> Le8
            if (r5 == 0) goto L58
            java.lang.String r4 = r4.toString()     // Catch: xhss.C0806 -> Le8
            xhss.ᛸᛷᲈᛶ r5 = new xhss.ᛸᛷᲈᛶ     // Catch: xhss.C0806 -> Le8
            r5.<init>(r4)     // Catch: xhss.C0806 -> Le8
            return r5
        L58:
            boolean r5 = r4 instanceof java.lang.String     // Catch: xhss.C0806 -> Le8
            if (r5 == 0) goto L66
            java.lang.String r4 = r4.toString()     // Catch: xhss.C0806 -> Le8
            xhss.ᲈᲇᛱᛶ r5 = new xhss.ᲈᲇᛱᛶ     // Catch: xhss.C0806 -> Le8
            r5.<init>(r4, r3)     // Catch: xhss.C0806 -> Le8
            return r5
        L66:
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: xhss.C0806 -> Le8
            if (r5 == 0) goto L7e
            java.lang.String r4 = r4.toString()     // Catch: xhss.C0806 -> Le8
            java.lang.String r4 = r4.toString()     // Catch: xhss.C0806 -> Le8
            boolean r4 = java.lang.Boolean.parseBoolean(r4)     // Catch: xhss.C0806 -> Le8
            if (r4 == 0) goto L7b
            xhss.ᲁᛳᛲᛸ r4 = xhss.InterfaceC0169.f679     // Catch: xhss.C0806 -> Le8
            return r4
        L7b:
            xhss.ᲁᛳᛲᛸ r4 = xhss.InterfaceC0169.f680     // Catch: xhss.C0806 -> Le8
            return r4
        L7e:
            boolean r5 = r4 instanceof java.time.OffsetDateTime     // Catch: xhss.C0806 -> Le8
            if (r5 == 0) goto L8c
            java.lang.String r4 = r4.toString()     // Catch: xhss.C0806 -> Le8
            xhss.ᛶᛳᛳᛶ r5 = new xhss.ᛶᛳᛳᛶ     // Catch: xhss.C0806 -> Le8
            r5.<init>(r4)     // Catch: xhss.C0806 -> Le8
            return r5
        L8c:
            if (r4 != 0) goto L91
            xhss.ᲈᛷᛸᲇ r4 = xhss.InterfaceC0169.f681     // Catch: xhss.C0806 -> Le8
            return r4
        L91:
            xhss.ᲇᛵᛲᲁ r5 = r0.f2745     // Catch: xhss.C0806 -> Le8
            xhss.ᛵᛴᛷᛵ r2 = r0.f2743     // Catch: xhss.C0806 -> Le8
            r5.getClass()     // Catch: xhss.C0806 -> Le8
            boolean r5 = r4 instanceof java.util.List     // Catch: xhss.C0806 -> Le8
            if (r5 == 0) goto La8
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Object r4 = r2.m850(r4, r5, r0)     // Catch: xhss.C0806 -> Le8
            xhss.ᛳᛲᲀᛷ r5 = new xhss.ᛳᛲᲀᛷ     // Catch: xhss.C0806 -> Le8
            r5.<init>(r4)     // Catch: xhss.C0806 -> Le8
            return r5
        La8:
            xhss.ᲇᛵᛲᲁ r5 = r0.f2745     // Catch: xhss.C0806 -> Le8
            r5.getClass()     // Catch: xhss.C0806 -> Le8
            boolean r5 = r4 instanceof java.util.Map     // Catch: xhss.C0806 -> Le8
            if (r5 == 0) goto Lbd
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            java.lang.Object r4 = r2.m850(r4, r5, r0)     // Catch: xhss.C0806 -> Le8
            xhss.ᛳᛲᲀᛷ r5 = new xhss.ᛳᛲᲀᛷ     // Catch: xhss.C0806 -> Le8
            r5.<init>(r4)     // Catch: xhss.C0806 -> Le8
            return r5
        Lbd:
            xhss.ᛵᛲᛲᲇ r5 = new xhss.ᛵᛲᛲᲇ     // Catch: xhss.C0806 -> Le8
            java.lang.Class r0 = r4.getClass()     // Catch: xhss.C0806 -> Le8
            java.lang.String r0 = r0.toString()     // Catch: xhss.C0806 -> Le8
            java.lang.String r4 = r4.toString()     // Catch: xhss.C0806 -> Le8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: xhss.C0806 -> Le8
            r2.<init>(r1)     // Catch: xhss.C0806 -> Le8
            r2.append(r0)     // Catch: xhss.C0806 -> Le8
            java.lang.String r0 = ":"
            r2.append(r0)     // Catch: xhss.C0806 -> Le8
            r2.append(r4)     // Catch: xhss.C0806 -> Le8
            java.lang.String r4 = " to a ValueNode"
            r2.append(r4)     // Catch: xhss.C0806 -> Le8
            java.lang.String r4 = r2.toString()     // Catch: xhss.C0806 -> Le8
            r5.<init>(r4)     // Catch: xhss.C0806 -> Le8
            throw r5     // Catch: xhss.C0806 -> Le8
        Le8:
            xhss.ᲈᲀᛶ r4 = xhss.InterfaceC0169.f682
            return r4
    }
}
