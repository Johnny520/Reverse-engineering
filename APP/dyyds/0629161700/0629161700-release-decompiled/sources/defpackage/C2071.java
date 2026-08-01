package defpackage;

/* JADX INFO: renamed from: ᲇᛶᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2071 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0150 f8898 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C2328 f8899;

    static {
            java.lang.Class<ᲇᛶᲀᛲ> r0 = defpackage.C2071.class
            ᛱᛸᲀᛱ r0 = defpackage.AbstractC1011.m1965(r0)
            defpackage.C2071.f8898 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static boolean m3486(char r1) {
            r0 = 60
            if (r1 == r0) goto L17
            r0 = 62
            if (r1 == r0) goto L17
            r0 = 61
            if (r1 == r0) goto L17
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L17
            r0 = 33
            if (r1 != r0) goto L15
            goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C0217 m3487() {
            r11 = this;
            ᲈᲁ r11 = r11.f8899
            int r0 = r11.f10046
            java.lang.Object r1 = r11.f10043
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r0 = r11.m3803(r0)
            r2 = 32
            r3 = -1
            if (r0 != r3) goto L13
            r0 = r2
            goto L17
        L13:
            char r0 = r1.charAt(r0)
        L17:
            int r4 = r11.f10046
            r5 = 1
            r11.m3814(r5)
        L1d:
            int r6 = r11.f10046
            boolean r6 = r11.m3805(r6)
            r7 = 0
            if (r6 == 0) goto La4
            char r6 = r11.m3809()
            r8 = 91
            if (r6 != r8) goto L44
            int r6 = r11.f10046
            r9 = 93
            int r6 = r11.m3816(r6, r8, r9, r7)
            if (r6 == r3) goto L3d
            int r6 = r6 + 1
            r11.f10046 = r6
            goto L44
        L3d:
            java.lang.String r0 = "Square brackets does not match in filter "
            defpackage.C2264.m3675(r11, r0)
            r11 = 0
            return r11
        L44:
            char r6 = r11.m3809()
            r8 = 41
            if (r6 != r8) goto L78
            char r6 = r11.m3809()
            if (r6 == r8) goto L53
            goto L78
        L53:
            int r6 = r11.f10046
            int r6 = r11.m3803(r6)
            if (r6 == r3) goto L78
            char r9 = r1.charAt(r6)
            r10 = 40
            if (r9 == r10) goto L64
            goto L78
        L64:
            int r6 = r6 + (-1)
            boolean r9 = r11.m3805(r6)
            if (r9 == 0) goto L78
            if (r6 <= r4) goto L78
            char r9 = r1.charAt(r6)
            r10 = 46
            if (r9 != r10) goto L64
            r6 = r5
            goto L79
        L78:
            r6 = r7
        L79:
            char r9 = r11.m3809()
            if (r9 != r8) goto L83
            if (r6 != 0) goto L83
            r6 = r5
            goto L84
        L83:
            r6 = r7
        L84:
            int r8 = r11.f10046
            boolean r8 = r11.m3805(r8)
            if (r8 == 0) goto La4
            char r8 = r11.m3809()
            boolean r8 = m3486(r8)
            if (r8 != 0) goto La4
            char r8 = r11.m3809()
            if (r8 == r2) goto La4
            if (r6 == 0) goto L9f
            goto La4
        L9f:
            r11.m3814(r5)
            goto L1d
        La4:
            r2 = 33
            if (r0 == r2) goto La9
            goto Laa
        La9:
            r5 = r7
        Laa:
            int r11 = r11.f10046
            java.lang.CharSequence r11 = r1.subSequence(r4, r11)
            ᛱᲈᛵᛶ r0 = new ᛱᲈᛵᛶ
            r0.<init>(r11, r5)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.AbstractC1709 m3488() {
            r10 = this;
            ᲈᲁ r0 = r10.f8899
            r0.m3815()
            char r1 = r0.m3809()
            r2 = 1
            r3 = 64
            r4 = 36
            r5 = 33
            if (r1 == r5) goto L122
            if (r1 == r4) goto L11d
            if (r1 == r3) goto L118
            r0.m3815()
            java.lang.Object r1 = r0.f10043
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            char r3 = r0.m3809()
            r4 = 34
            if (r3 == r4) goto L113
            r4 = 39
            if (r3 == r4) goto L10e
            r4 = 45
            if (r3 == r4) goto L109
            ᛱᛸᲀᛱ r4 = defpackage.C2071.f8898
            r5 = 47
            if (r3 == r5) goto Lad
            r2 = 91
            if (r3 == r2) goto La8
            r2 = 102(0x66, float:1.43E-43)
            if (r3 == r2) goto La3
            r2 = 110(0x6e, float:1.54E-43)
            if (r3 == r2) goto L56
            r0 = 116(0x74, float:1.63E-43)
            if (r3 == r0) goto L51
            r0 = 123(0x7b, float:1.72E-43)
            if (r3 == r0) goto L4c
            ᲇᲇᲈᲀ r10 = r10.m3496()
            return r10
        L4c:
            ᛱᛳᲇᛱ r10 = r10.m3492()
            return r10
        L51:
            ᲈᛸᛶᛶ r10 = r10.m3494()
            return r10
        L56:
            int r10 = r0.f10046
            char r3 = r0.m3809()
            if (r3 != r2) goto L9b
            int r2 = r0.f10046
            int r2 = r2 + 3
            boolean r2 = r0.m3805(r2)
            if (r2 == 0) goto L9b
            int r2 = r0.f10046
            int r3 = r2 + 4
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r2 = "null"
            java.lang.String r3 = r1.toString()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L9b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r2 = r0.f10046
            int r2 = r2 + 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r2, r1}
            java.lang.String r2 = "NullLiteral from {} to {} -> [{}]"
            r4.mo684(r2, r10)
            int r10 = r1.length()
            r0.m3814(r10)
            ᲁᛵᛸᲇ r10 = defpackage.InterfaceC1196.f5400
            return r10
        L9b:
            ᛷᛴᛴᛸ r10 = new ᛷᛴᛴᛸ
            java.lang.String r0 = "Expected <null> value"
            r10.<init>(r0)
            throw r10
        La3:
            ᲈᛸᛶᛶ r10 = r10.m3494()
            return r10
        La8:
            ᛱᛳᲇᛱ r10 = r10.m3492()
            return r10
        Lad:
            int r10 = r0.f10046
            int r3 = r0.m3802(r5, r10)
            r5 = -1
            if (r3 == r5) goto L102
            int r5 = r3 + 1
            boolean r6 = r0.m3805(r5)
            if (r6 == 0) goto Le2
            r6 = r5
        Lbf:
            boolean r7 = r0.m3805(r6)
            if (r7 == 0) goto Ld7
            char r7 = r1.charAt(r6)
            char[] r8 = new char[r2]
            r9 = 0
            r8[r9] = r7
            int r7 = defpackage.AbstractC1124.m2148(r8)
            if (r7 <= 0) goto Ld7
            int r6 = r6 + 1
            goto Lbf
        Ld7:
            if (r6 <= r3) goto Le2
            java.lang.CharSequence r5 = r1.subSequence(r5, r6)
            int r5 = r5.length()
            int r3 = r3 + r5
        Le2:
            int r3 = r3 + r2
            r0.f10046 = r3
            java.lang.CharSequence r1 = r1.subSequence(r10, r3)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r0 = r0.f10046
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r0, r1}
            java.lang.String r0 = "PatternNode from {} to {} -> [{}]"
            r4.mo684(r0, r10)
            ᛴᛷᲈᛱ r10 = new ᛴᛷᲈᛱ
            r10.<init>(r1)
            return r10
        L102:
            java.lang.String r10 = "Pattern not closed. Expected / in "
            defpackage.C2264.m3675(r0, r10)
            r10 = 0
            return r10
        L109:
            ᲇᲇᲈᲀ r10 = r10.m3496()
            return r10
        L10e:
            ᲇᛶᲀᲇ r10 = r10.m3493(r4)
            return r10
        L113:
            ᲇᛶᲀᲇ r10 = r10.m3493(r4)
            return r10
        L118:
            ᛱᲈᛵᛶ r10 = r10.m3487()
            return r10
        L11d:
            ᛱᲈᛵᛶ r10 = r10.m3487()
            return r10
        L122:
            r0.m3814(r2)
            r0.m3815()
            char r0 = r0.m3809()
            if (r0 == r4) goto L149
            if (r0 != r3) goto L135
            ᛱᲈᛵᛶ r10 = r10.m3487()
            return r10
        L135:
            ᛷᛴᛴᛸ r10 = new ᛷᛴᛴᛸ
            java.lang.Character r0 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Unexpected character: %c"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r10.<init>(r0)
            throw r10
        L149:
            ᛱᲈᛵᛶ r10 = r10.m3487()
            return r10
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.EnumC0629 m3489() {
            r6 = this;
            ᲈᲁ r6 = r6.f8899
            r6.m3815()
            int r0 = r6.f10046
            char r1 = r6.m3809()
            boolean r1 = m3486(r1)
            r2 = 1
            if (r1 == 0) goto L28
        L12:
            int r1 = r6.f10046
            boolean r1 = r6.m3805(r1)
            if (r1 == 0) goto L3c
            char r1 = r6.m3809()
            boolean r1 = m3486(r1)
            if (r1 == 0) goto L3c
            r6.m3814(r2)
            goto L12
        L28:
            int r1 = r6.f10046
            boolean r1 = r6.m3805(r1)
            if (r1 == 0) goto L3c
            char r1 = r6.m3809()
            r3 = 32
            if (r1 == r3) goto L3c
            r6.m3814(r2)
            goto L28
        L3c:
            int r1 = r6.f10046
            java.lang.Object r3 = r6.f10043
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r1 = r3.subSequence(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r6 = r6.f10046
            int r6 = r6 - r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6, r1}
            ᛱᛸᲀᛱ r0 = defpackage.C2071.f8898
            java.lang.String r2 = "Operator from {} to {} -> [{}]"
            r0.mo684(r2, r6)
            java.lang.String r6 = r1.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r6.toUpperCase(r0)
            ᛴᛲᛸᛲ[] r1 = defpackage.EnumC0629.values()
            int r2 = r1.length
            r3 = 0
        L6c:
            if (r3 >= r2) goto L7c
            r4 = r1[r3]
            java.lang.String r5 = r4.f3124
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L79
            return r4
        L79:
            int r3 = r3 + 1
            goto L6c
        L7c:
            ᛷᛴᛴᛸ r0 = new ᛷᛴᛴᛸ
            java.lang.String r1 = "Filter operator "
            java.lang.String r2 = " is not supported!"
            java.lang.String r6 = defpackage.AbstractC0225.m817(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.AbstractC2000 m3490() {
            r5 = this;
            ᲈᲁ r0 = r5.f8899
            r0.m3815()
            int r1 = r0.f10046
            r0.m3815()
            r2 = 33
            boolean r3 = r0.m3813(r2)
            if (r3 == 0) goto L30
            r0.m3804(r2)
            r0.m3815()
            char r2 = r0.m3809()
            r3 = 36
            if (r2 == r3) goto L2e
            r3 = 64
            if (r2 == r3) goto L2e
            ᲇᛲᛶ r5 = r5.m3490()
            ᛲᛱᛳᛲ r0 = new ᛲᛱᛳᛲ
            r0.<init>(r5)
            return r0
        L2e:
            r0.f10046 = r1
        L30:
            r0.m3815()
            r1 = 40
            boolean r2 = r0.m3813(r1)
            if (r2 == 0) goto L48
            r0.m3804(r1)
            ᲇᛲᛶ r5 = r5.m3495()
            r1 = 41
            r0.m3804(r1)
            return r5
        L48:
            ᲀᛷᛶ r1 = r5.m3488()
            int r2 = r0.f10046
            ᛴᛲᛸᛲ r3 = r5.m3489()     // Catch: defpackage.C1255 -> L5c
            ᲀᛷᛶ r5 = r5.m3488()     // Catch: defpackage.C1255 -> L5c
            ᛷᛶᛵᲁ r4 = new ᛷᛶᛵᲁ     // Catch: defpackage.C1255 -> L5c
            r4.<init>(r1, r3, r5)     // Catch: defpackage.C1255 -> L5c
            return r4
        L5c:
            r0.f10046 = r2
            ᛱᲈᛵᛶ r5 = r1.mo792()
            boolean r0 = r5.f1334
            ᛱᲈᛵᛶ r1 = new ᛱᲈᛵᛶ
            ᛶᛱᛳᲁ r5 = r5.f1336
            r2 = 1
            r1.<init>(r5, r2, r0)
            if (r0 == 0) goto L71
            ᲈᛸᛶᛶ r5 = defpackage.InterfaceC1196.f5401
            goto L73
        L71:
            ᲈᛸᛶᛶ r5 = defpackage.InterfaceC1196.f5399
        L73:
            ᛷᛶᛵᲁ r0 = new ᛷᛶᛵᲁ
            ᛴᛲᛸᛲ r2 = defpackage.EnumC0629.f3119
            r0.<init>(r1, r2, r5)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.AbstractC2000 m3491() {
            r4 = this;
            ᲈᲁ r0 = r4.f8899
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ᲇᛲᛶ r2 = r4.m3490()
            r1.add(r2)
        Le:
            int r2 = r0.f10046
            java.lang.String r3 = "&&"
            boolean r3 = r0.m3807(r3)
            if (r3 == 0) goto L20
            ᲇᛲᛶ r2 = r4.m3490()
            r1.add(r2)
            goto Le
        L20:
            r0.f10046 = r2
            int r4 = r1.size()
            r0 = 1
            if (r0 != r4) goto L31
            r4 = 0
            java.lang.Object r4 = r1.get(r4)
            ᲇᛲᛶ r4 = (defpackage.AbstractC2000) r4
            return r4
        L31:
            ᛲᛱᛳᛲ r4 = new ᛲᛱᛳᛲ
            r4.<init>(r0, r1)
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0063 m3492() {
            r5 = this;
            ᲈᲁ r5 = r5.f8899
            int r0 = r5.f10046
            char r1 = r5.m3809()
            r2 = 91
            if (r1 != r2) goto Lf
            r2 = 93
            goto L11
        Lf:
            r2 = 125(0x7d, float:1.75E-43)
        L11:
            int r3 = r5.f10046
            r4 = 0
            int r1 = r5.m3816(r3, r1, r2, r4)
            r2 = -1
            if (r1 == r2) goto L42
            int r1 = r1 + 1
            r5.f10046 = r1
            java.lang.Object r2 = r5.f10043
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r1 = r2.subSequence(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = r5.f10046
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5, r1}
            ᛱᛸᲀᛱ r0 = defpackage.C2071.f8898
            java.lang.String r2 = "JsonLiteral from {} to {} -> [{}]"
            r0.mo684(r2, r5)
            ᛱᛳᲇᛱ r5 = new ᛱᛳᲇᛱ
            r5.<init>(r1)
            return r5
        L42:
            java.lang.String r0 = "String not closed. Expected ' in "
            defpackage.C2264.m3675(r5, r0)
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.C2074 m3493(char r4) {
            r3 = this;
            ᲈᲁ r3 = r3.f8899
            int r0 = r3.f10046
            int r1 = r3.m3802(r4, r0)
            r2 = -1
            if (r1 == r2) goto L32
            r4 = 1
            int r1 = r1 + r4
            r3.f10046 = r1
            java.lang.Object r2 = r3.f10043
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r1 = r2.subSequence(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r3.f10046
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3, r1}
            ᛱᛸᲀᛱ r0 = defpackage.C2071.f8898
            java.lang.String r2 = "StringLiteral from {} to {} -> [{}]"
            r0.mo684(r2, r3)
            ᲇᛶᲀᲇ r3 = new ᲇᛶᲀᲇ
            r3.<init>(r1, r4)
            return r3
        L32:
            ᛷᛴᛴᛸ r0 = new ᛷᛴᛴᛸ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "String literal does not have matching quotes. Expected "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " in "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2308 m3494() {
            r5 = this;
            ᲈᲁ r5 = r5.f8899
            int r0 = r5.f10046
            char r1 = r5.m3809()
            int r2 = r5.f10046
            r3 = 116(0x74, float:1.63E-43)
            if (r1 != r3) goto L11
            int r2 = r2 + 3
            goto L13
        L11:
            int r2 = r2 + 4
        L13:
            boolean r1 = r5.m3805(r2)
            java.lang.String r3 = "Expected boolean literal"
            if (r1 == 0) goto L66
            int r1 = r2 + 1
            java.lang.Object r4 = r5.f10043
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r1 = r4.subSequence(r0, r1)
            java.lang.String r4 = "true"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L3c
            java.lang.String r4 = "false"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L36
            goto L3c
        L36:
            ᛷᛴᛴᛸ r5 = new ᛷᛴᛴᛸ
            r5.<init>(r3)
            throw r5
        L3c:
            int r3 = r1.length()
            r5.m3814(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r0, r1}
            ᛱᛸᲀᛱ r0 = defpackage.C2071.f8898
            java.lang.String r2 = "BooleanLiteral from {} to {} -> [{}]"
            r0.mo684(r2, r5)
            java.lang.String r5 = r1.toString()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            if (r5 == 0) goto L63
            ᲈᛸᛶᛶ r5 = defpackage.InterfaceC1196.f5401
            return r5
        L63:
            ᲈᛸᛶᛶ r5 = defpackage.InterfaceC1196.f5399
            return r5
        L66:
            ᛷᛴᛴᛸ r5 = new ᛷᛴᛴᛸ
            r5.<init>(r3)
            throw r5
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.AbstractC2000 m3495() {
            r4 = this;
            ᲈᲁ r0 = r4.f8899
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ᲇᛲᛶ r2 = r4.m3491()
            r1.add(r2)
        Le:
            int r2 = r0.f10046
            java.lang.String r3 = "||"
            boolean r3 = r0.m3807(r3)
            if (r3 == 0) goto L20
            ᲇᛲᛶ r2 = r4.m3491()
            r1.add(r2)
            goto Le
        L20:
            r0.f10046 = r2
            r4 = 1
            int r0 = r1.size()
            if (r4 != r0) goto L31
            r4 = 0
            java.lang.Object r4 = r1.get(r4)
            ᲇᛲᛶ r4 = (defpackage.AbstractC2000) r4
            return r4
        L31:
            ᛲᛱᛳᛲ r4 = new ᛲᛱᛳᛲ
            r0 = 3
            r4.<init>(r0, r1)
            return r4
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C2156 m3496() {
            r4 = this;
            ᲈᲁ r4 = r4.f8899
            int r0 = r4.f10046
            java.lang.Object r1 = r4.f10043
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L8:
            int r2 = r4.f10046
            boolean r2 = r4.m3805(r2)
            if (r2 == 0) goto L31
            int r2 = r4.f10046
            char r2 = r1.charAt(r2)
            boolean r3 = java.lang.Character.isDigit(r2)
            if (r3 != 0) goto L2c
            r3 = 45
            if (r2 == r3) goto L2c
            r3 = 46
            if (r2 == r3) goto L2c
            r3 = 69
            if (r2 == r3) goto L2c
            r3 = 101(0x65, float:1.42E-43)
            if (r2 != r3) goto L31
        L2c:
            r2 = 1
            r4.m3814(r2)
            goto L8
        L31:
            int r2 = r4.f10046
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = r4.f10046
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4, r1}
            ᛱᛸᲀᛱ r0 = defpackage.C2071.f8898
            java.lang.String r2 = "NumberLiteral from {} to {} -> [{}]"
            r0.mo684(r2, r4)
            ᲇᲇᲈᲀ r4 = new ᲇᲇᲈᲀ
            r4.<init>(r1)
            return r4
    }
}
