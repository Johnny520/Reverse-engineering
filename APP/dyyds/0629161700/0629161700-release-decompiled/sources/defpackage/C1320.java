package defpackage;

/* JADX INFO: renamed from: ᛷᛷᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1320 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final java.lang.String f5831 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String f5832;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f5833;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f5834;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0695[] f5835;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2067 f5836;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.String f5837;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.HashMap f5838;

    static {
            java.lang.Class<ᲀᛴᲀᛵ> r0 = defpackage.AbstractC1665.class
            java.lang.String r0 = defpackage.C2118.m3540(r0)
            defpackage.C1320.f5831 = r0
            return
    }

    public C1320(java.lang.Class r2, defpackage.C0695[] r3, defpackage.C2067 r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f5838 = r0
            r1.f5835 = r3
            r1.f5836 = r4
            java.lang.String r2 = r2.getName()
            r1.f5834 = r2
            java.lang.String r3 = "java."
            boolean r3 = r2.startsWith(r3)
            java.lang.String r4 = "AccAccess"
            if (r3 == 0) goto L27
            java.lang.String r3 = "net.minidev.asm."
            java.lang.String r3 = defpackage.AbstractC0225.m817(r3, r2, r4)
            r1.f5833 = r3
            goto L2d
        L27:
            java.lang.String r3 = r2.concat(r4)
            r1.f5833 = r3
        L2d:
            r4 = 46
            r0 = 47
            java.lang.String r3 = r3.replace(r4, r0)
            r1.f5832 = r3
            java.lang.String r2 = r2.replace(r4, r0)
            r1.f5837 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m2446(defpackage.C1621 r5, int r6, defpackage.C1063 r7) {
            r0 = 21
            r1 = 2
            r5.m2925(r0, r1)
            if (r6 != 0) goto Le
            r6 = 154(0x9a, float:2.16E-43)
            r5.m2918(r6, r7)
            return
        Le:
            r0 = 1
            r2 = 4
            r3 = 160(0xa0, float:2.24E-43)
            if (r6 != r0) goto L1b
            r5.m2923(r2)
            r5.m2918(r3, r7)
            return
        L1b:
            r0 = 5
            if (r6 != r1) goto L25
            r5.m2923(r0)
            r5.m2918(r3, r7)
            return
        L25:
            r1 = 3
            r4 = 6
            if (r6 != r1) goto L30
            r5.m2923(r4)
            r5.m2918(r3, r7)
            return
        L30:
            if (r6 != r2) goto L3a
            r6 = 7
            r5.m2923(r6)
            r5.m2918(r3, r7)
            return
        L3a:
            if (r6 != r0) goto L45
            r6 = 8
            r5.m2923(r6)
            r5.m2918(r3, r7)
            return
        L45:
            if (r6 < r4) goto L50
            r0 = 16
            r5.m2911(r0, r6)
            r5.m2918(r3, r7)
            return
        L50:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "non supported negative values"
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m2447(defpackage.C1621 r11) {
            r10 = this;
            java.lang.Class<java.lang.NoSuchFieldException> r0 = java.lang.NoSuchFieldException.class
            java.lang.String r3 = defpackage.C2118.m3540(r0)
            r0 = 187(0xbb, float:2.62E-43)
            r11.m2920(r0, r3)
            r0 = 89
            r11.m2923(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "mapping "
            r0.<init>(r1)
            java.lang.String r10 = r10.f5834
            r0.append(r10)
            java.lang.String r10 = " failed to map field:"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.m2915(r10)
            r10 = 25
            r0 = 2
            r11.m2925(r10, r0)
            java.lang.String r8 = "(Ljava/lang/String;)Ljava/lang/String;"
            r9 = 0
            r5 = 182(0xb6, float:2.55E-43)
            java.lang.String r6 = "java/lang/String"
            java.lang.String r7 = "concat"
            r4 = r11
            r4.m2916(r5, r6, r7, r8, r9)
            r1 = r4
            java.lang.String r5 = "(Ljava/lang/String;)V"
            r6 = 0
            r2 = 183(0xb7, float:2.56E-43)
            java.lang.String r4 = "<init>"
            r1.m2916(r2, r3, r4, r5, r6)
            r10 = 191(0xbf, float:2.68E-43)
            r1.m2923(r10)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m2448(defpackage.C1621 r8) {
            r7 = this;
            java.lang.Class<java.lang.NoSuchFieldException> r1 = java.lang.NoSuchFieldException.class
            java.lang.String r6 = defpackage.C2118.m3540(r1)
            r1 = 187(0xbb, float:2.62E-43)
            r8.m2920(r1, r6)
            r1 = 89
            r8.m2923(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mapping "
            r1.<init>(r2)
            java.lang.String r2 = r7.f5834
            r1.append(r2)
            java.lang.String r2 = " failed to map field:"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8.m2915(r1)
            r1 = 21
            r2 = 2
            r8.m2925(r1, r2)
            java.lang.String r4 = "(I)Ljava/lang/String;"
            r5 = 0
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "java/lang/Integer"
            java.lang.String r3 = "toString"
            r0 = r8
            r0.m2916(r1, r2, r3, r4, r5)
            java.lang.String r4 = "(Ljava/lang/String;)Ljava/lang/String;"
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = "java/lang/String"
            java.lang.String r3 = "concat"
            r0.m2916(r1, r2, r3, r4, r5)
            java.lang.String r4 = "(Ljava/lang/String;)V"
            r1 = 183(0xb7, float:2.56E-43)
            java.lang.String r3 = "<init>"
            r2 = r6
            r0.m2916(r1, r2, r3, r4, r5)
            r1 = 191(0xbf, float:2.68E-43)
            r8.m2923(r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m2449(defpackage.C1621 r19, defpackage.C0695 r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r7 = r20
            r8 = 25
            r9 = 1
            r1.m2925(r8, r9)
            r10 = 192(0xc0, float:2.69E-43)
            java.lang.String r11 = r0.f5837
            r1.m2920(r10, r11)
            r12 = 3
            r1.m2925(r8, r12)
            java.lang.Class r2 = r7.f3339
            java.lang.reflect.Method r13 = r7.f3342
            ᲇᲀᛴᲁ r14 = defpackage.C2118.m3545(r2)
            java.lang.Class r2 = r7.f3339
            java.lang.String r15 = defpackage.C2118.m3540(r2)
            java.util.HashMap r3 = r0.f5838
            java.lang.Object r3 = r3.get(r2)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L48
            java.lang.Class r2 = r3.getDeclaringClass()
            java.lang.String r2 = defpackage.C2118.m3540(r2)
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = defpackage.C2118.m3544(r3)
            r3 = r2
            r2 = 184(0xb8, float:2.58E-43)
            r6 = 0
            r1.m2916(r2, r3, r4, r5, r6)
            goto Le8
        L48:
            boolean r3 = r2.isEnum()
            r4 = 58
            r5 = 198(0xc6, float:2.77E-43)
            if (r3 == 0) goto La3
            ᛶᛴᲀᲇ r2 = new ᛶᛴᲀᲇ
            r2.<init>()
            r1.m2918(r5, r2)
            r1.m2925(r8, r12)
            java.lang.String r5 = "()Ljava/lang/String;"
            r6 = 0
            r3 = r2
            r2 = 182(0xb6, float:2.55E-43)
            r16 = r3
            java.lang.String r3 = "java/lang/Object"
            r17 = r4
            java.lang.String r4 = "toString"
            r10 = r16
            r8 = r17
            r1.m2916(r2, r3, r4, r5, r6)
            java.lang.String r1 = "(Ljava/lang/String;)L"
            java.lang.String r2 = ";"
            java.lang.String r5 = defpackage.AbstractC0225.m817(r1, r15, r2)
            r2 = 184(0xb8, float:2.58E-43)
            java.lang.String r4 = "valueOf"
            r1 = r19
            r3 = r15
            r1.m2916(r2, r3, r4, r5, r6)
            r1.m2925(r8, r12)
            r1.m2924(r10)
            r4 = 0
            r6 = 0
            r2 = 3
            r3 = 0
            r5 = 0
            r1.m2929(r2, r3, r4, r5, r6)
            r3 = 25
            r1.m2925(r3, r9)
            r2 = 192(0xc0, float:2.69E-43)
            r1.m2920(r2, r11)
            r1.m2925(r3, r12)
            r1.m2920(r2, r15)
            goto Le8
        La3:
            r3 = r8
            r8 = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto Le3
            ᛶᛴᲀᲇ r10 = new ᛶᛴᲀᲇ
            r10.<init>()
            r1.m2918(r5, r10)
            r1.m2925(r3, r12)
            java.lang.String r5 = "()Ljava/lang/String;"
            r6 = 0
            r2 = 182(0xb6, float:2.55E-43)
            java.lang.String r3 = "java/lang/Object"
            java.lang.String r4 = "toString"
            r1.m2916(r2, r3, r4, r5, r6)
            r1.m2925(r8, r12)
            r1.m2924(r10)
            r4 = 0
            r6 = 0
            r2 = 3
            r3 = 0
            r5 = 0
            r1.m2929(r2, r3, r4, r5, r6)
            r3 = 25
            r1.m2925(r3, r9)
            r2 = 192(0xc0, float:2.69E-43)
            r1.m2920(r2, r11)
            r1.m2925(r3, r12)
            r1.m2920(r2, r15)
            goto Le8
        Le3:
            r2 = 192(0xc0, float:2.69E-43)
            r1.m2920(r2, r15)
        Le8:
            if (r13 != 0) goto Lef
            java.lang.reflect.Method r2 = r7.f3340
            if (r2 != 0) goto Lef
            goto Lf1
        Lef:
            if (r13 != 0) goto Lfd
        Lf1:
            java.lang.String r0 = r7.f3338
            java.lang.String r2 = r14.m3546()
            r3 = 181(0xb5, float:2.54E-43)
            r1.m2917(r3, r11, r0, r2)
            goto L110
        Lfd:
            java.lang.String r4 = defpackage.C2118.m3544(r13)
            java.lang.String r3 = r13.getName()
            r5 = 0
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = r0.f5837
            r0 = r19
            r0.m2916(r1, r2, r3, r4, r5)
            r1 = r0
        L110:
            r0 = 177(0xb1, float:2.48E-43)
            r1.m2923(r0)
            return
    }
}
