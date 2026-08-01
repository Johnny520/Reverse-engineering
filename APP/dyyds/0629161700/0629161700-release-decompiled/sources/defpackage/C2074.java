package defpackage;

/* JADX INFO: renamed from: ᲇᛶᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2074 extends defpackage.AbstractC1709 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean f8903;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f8904;

    public C2074(java.lang.CharSequence r5, boolean r6) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f8903 = r0
            if (r6 == 0) goto L48
            int r6 = r5.length()
            if (r6 <= r0) goto L48
            r6 = 0
            char r1 = r5.charAt(r6)
            int r2 = r5.length()
            int r2 = r2 - r0
            char r2 = r5.charAt(r2)
            r3 = 39
            if (r1 != r3) goto L2c
            if (r2 != r3) goto L2c
            int r6 = r5.length()
            int r6 = r6 - r0
            java.lang.CharSequence r5 = r5.subSequence(r0, r6)
            goto L3d
        L2c:
            r3 = 34
            if (r1 != r3) goto L3d
            if (r2 != r3) goto L3d
            int r1 = r5.length()
            int r1 = r1 - r0
            java.lang.CharSequence r5 = r5.subSequence(r0, r1)
            r4.f8903 = r6
        L3d:
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = defpackage.AbstractC1849.m3242(r5)
            r4.f8904 = r5
            return
        L48:
            java.lang.String r5 = r5.toString()
            r4.f8904 = r5
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.C2074
            r2 = 0
            if (r1 != 0) goto Le
            boolean r1 = r4 instanceof defpackage.C2156
            if (r1 != 0) goto Le
            return r2
        Le:
            ᲀᛷᛶ r4 = (defpackage.AbstractC1709) r4
            ᲇᛶᲀᲇ r4 = r4.mo3099()
            java.lang.String r3 = r3.f8904
            if (r3 == 0) goto L21
            java.lang.String r4 = r4.f8904
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L25
            goto L26
        L21:
            java.lang.String r3 = r4.f8904
            if (r3 != 0) goto L26
        L25:
            return r0
        L26:
            return r2
    }

    public final java.lang.String toString() {
            r8 = this;
            boolean r0 = r8.f8903
            if (r0 == 0) goto L7
            java.lang.String r0 = "'"
            goto L9
        L7:
            java.lang.String r0 = "\""
        L9:
            java.lang.String r8 = r8.f8904
            if (r8 != 0) goto L10
            r8 = 0
            goto L121
        L10:
            int r1 = r8.length()
            java.io.StringWriter r2 = new java.io.StringWriter
            int r3 = r1 * 2
            r2.<init>(r3)
            r3 = 0
        L1c:
            if (r3 >= r1) goto L11d
            char r4 = r8.charAt(r3)
            r5 = 4095(0xfff, float:5.738E-42)
            if (r4 <= r5) goto L41
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r4 = r4.toUpperCase()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "\\u"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r2.write(r4)
            goto L119
        L41:
            r5 = 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L60
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r4 = r4.toUpperCase()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "\\u0"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r2.write(r4)
            goto L119
        L60:
            r5 = 127(0x7f, float:1.78E-43)
            java.lang.String r6 = "\\u00"
            if (r4 <= r5) goto L7f
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r4 = r4.toUpperCase()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r2.write(r4)
            goto L119
        L7f:
            r5 = 32
            r7 = 92
            if (r4 >= r5) goto Lec
            switch(r4) {
                case 8: goto Le3;
                case 9: goto Lda;
                case 10: goto Ld1;
                case 11: goto L88;
                case 12: goto Lc8;
                case 13: goto Lbf;
                default: goto L88;
            }
        L88:
            r5 = 15
            if (r4 <= r5) goto La5
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r4 = r4.toUpperCase()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r2.write(r4)
            goto L119
        La5:
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r4 = r4.toUpperCase()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "\\u000"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r2.write(r4)
            goto L119
        Lbf:
            r2.write(r7)
            r4 = 114(0x72, float:1.6E-43)
            r2.write(r4)
            goto L119
        Lc8:
            r2.write(r7)
            r4 = 102(0x66, float:1.43E-43)
            r2.write(r4)
            goto L119
        Ld1:
            r2.write(r7)
            r4 = 110(0x6e, float:1.54E-43)
            r2.write(r4)
            goto L119
        Lda:
            r2.write(r7)
            r4 = 116(0x74, float:1.63E-43)
            r2.write(r4)
            goto L119
        Le3:
            r2.write(r7)
            r4 = 98
            r2.write(r4)
            goto L119
        Lec:
            r5 = 34
            if (r4 == r5) goto L113
            r5 = 39
            if (r4 == r5) goto L10c
            r5 = 47
            if (r4 == r5) goto L105
            if (r4 == r7) goto Lfe
            r2.write(r4)
            goto L119
        Lfe:
            r2.write(r7)
            r2.write(r7)
            goto L119
        L105:
            r2.write(r7)
            r2.write(r5)
            goto L119
        L10c:
            r2.write(r7)
            r2.write(r5)
            goto L119
        L113:
            r2.write(r7)
            r2.write(r5)
        L119:
            int r3 = r3 + 1
            goto L1c
        L11d:
            java.lang.String r8 = r2.toString()
        L121:
            java.lang.String r8 = defpackage.AbstractC0225.m817(r0, r8, r0)
            return r8
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final defpackage.C2074 mo3099() {
            r0 = this;
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C2156 mo3101() {
            r1 = this;
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> Ld
            java.lang.String r1 = r1.f8904     // Catch: java.lang.NumberFormatException -> Ld
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> Ld
            ᲇᲇᲈᲀ r1 = new ᲇᲇᲈᲀ
            r1.<init>(r0)
            return r1
        Ld:
            ᲇᲇᲈᲀ r1 = defpackage.C2156.f9174
            return r1
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.Class mo483(defpackage.C1412 r1) {
            r0 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            return r0
    }
}
