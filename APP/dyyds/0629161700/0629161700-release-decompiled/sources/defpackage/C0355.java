package defpackage;

/* JADX INFO: renamed from: ᛲᲀᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0355 implements defpackage.InterfaceC2139 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.Map f1847 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class f1848;

    static {
            java.lang.Class<ᲀᛳᲇᛷ> r22 = defpackage.InterfaceC1651.class
            java.lang.Class<ᛵᛵᛱᛲ> r23 = defpackage.InterfaceC0883.class
            java.lang.Class<ᲀᲈᛵᲇ> r1 = defpackage.InterfaceC1781.class
            java.lang.Class<ᛳᲈᲇᛳ> r2 = defpackage.InterfaceC0598.class
            java.lang.Class<ᲇᛷᛳᲀ> r3 = defpackage.InterfaceC2087.class
            java.lang.Class<ᛷᛶᛲ> r4 = defpackage.InterfaceC1286.class
            java.lang.Class<ᛱᲁᲇᛶ> r5 = defpackage.InterfaceC0190.class
            java.lang.Class<ᲀᲇᲈᲈ> r6 = defpackage.InterfaceC1778.class
            java.lang.Class<ᲈᛶᲀᲇ> r7 = defpackage.InterfaceC2270.class
            java.lang.Class<ᲁᲈᛶᲈ> r8 = defpackage.InterfaceC1967.class
            java.lang.Class<ᲀᛵᲀᛵ> r9 = defpackage.InterfaceC1678.class
            java.lang.Class<ᛲᲀᲇᲇ> r10 = defpackage.InterfaceC0354.class
            java.lang.Class<ᲁᛲᛸᲁ> r11 = defpackage.InterfaceC1817.class
            java.lang.Class<ᛱᛵᛶ> r12 = defpackage.InterfaceC0090.class
            java.lang.Class<ᛳᲀᛲᛵ> r13 = defpackage.InterfaceC0540.class
            java.lang.Class<ᛱᛴᛳᛲ> r14 = defpackage.InterfaceC0071.class
            java.lang.Class<ᛸᲇᲁᛴ> r15 = defpackage.InterfaceC1589.class
            java.lang.Class<ᛸᛲᲈᲁ> r16 = defpackage.InterfaceC1447.class
            java.lang.Class<ᲈᛵᛷᛴ> r17 = defpackage.InterfaceC2244.class
            java.lang.Class<ᛵᛴᛳᲀ> r18 = defpackage.InterfaceC0864.class
            java.lang.Class<ᛲᛴᛴᛲ> r19 = defpackage.InterfaceC0280.class
            java.lang.Class<ᛱᛷᲀᲀ> r20 = defpackage.InterfaceC0133.class
            java.lang.Class<ᲈᛲᲁᛶ> r21 = defpackage.InterfaceC2196.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.List r0 = defpackage.AbstractC0425.m1186(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.AbstractC0575.m1369(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L44:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L62
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r3, r2)
            r1.add(r5)
            r2 = r4
            goto L44
        L62:
            defpackage.AbstractC0425.m1196()
            r0 = 0
            throw r0
        L67:
            java.util.Map r0 = defpackage.AbstractC1893.m3324(r1)
            defpackage.C0355.f1847 = r0
            return
    }

    public C0355(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.f1848 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C0355
            if (r0 == 0) goto L16
            java.lang.Class r1 = defpackage.AbstractC1533.m2777(r1)
            ᛲᲀᲈᛳ r2 = (defpackage.C0355) r2
            java.lang.Class r2 = defpackage.AbstractC1533.m2777(r2)
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
            java.lang.Class r0 = defpackage.AbstractC1533.m2777(r0)
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r1.f1848
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean m1083(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = defpackage.C0355.f1847
            java.lang.Class r1 = r1.f1848
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L15
            int r1 = r0.intValue()
            boolean r1 = defpackage.AbstractC1171.m2272(r1, r2)
            return r1
        L15:
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L23
            ᛲᲀᲈᛳ r1 = defpackage.AbstractC1168.m2249(r1)
            java.lang.Class r1 = defpackage.AbstractC1533.m2777(r1)
        L23:
            boolean r1 = r1.isInstance(r2)
            return r1
    }

    @Override // defpackage.InterfaceC2139
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class mo1084() {
            r0 = this;
            java.lang.Class r0 = r0.f1848
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String m1085() {
            r2 = this;
            java.lang.Class r2 = r2.f1848
            boolean r0 = r2.isAnonymousClass()
            r1 = 0
            if (r0 == 0) goto La
            goto L10
        La:
            boolean r0 = r2.isLocalClass()
            if (r0 == 0) goto L11
        L10:
            return r1
        L11:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L37
            java.lang.Class r2 = r2.getComponentType()
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L31
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = defpackage.C1825.m3222(r2)
            if (r2 == 0) goto L31
            java.lang.String r0 = "Array"
            java.lang.String r1 = r2.concat(r0)
        L31:
            if (r1 != 0) goto L36
            java.lang.String r2 = "kotlin.Array"
            return r2
        L36:
            return r1
        L37:
            java.lang.String r0 = r2.getName()
            java.lang.String r0 = defpackage.C1825.m3222(r0)
            if (r0 != 0) goto L46
            java.lang.String r2 = r2.getCanonicalName()
            return r2
        L46:
            return r0
    }
}
