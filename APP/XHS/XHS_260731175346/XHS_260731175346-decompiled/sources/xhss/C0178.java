package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛶᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0178 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.InterfaceC0869 f702 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0639 f703;

    static {
            java.lang.Class<xhss.ᛲᛶᲀᲇ> r0 = xhss.C0178.class
            xhss.ᲀᛶᛶᲀ r0 = xhss.AbstractC0993.m1628(r0)
            xhss.C0178.f702 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static boolean m427(char r1) {
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

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0933 m428() {
            r5 = this;
            xhss.ᛷᛳᛷᛳ r5 = r5.f703
            int r0 = r5.f2192
            char r1 = r5.m1113()
            int r2 = r5.f2192
            r3 = 116(0x74, float:1.63E-43)
            if (r1 != r3) goto L11
            int r2 = r2 + 3
            goto L13
        L11:
            int r2 = r2 + 4
        L13:
            boolean r1 = r5.m1112(r2)
            java.lang.String r3 = "Expected boolean literal"
            if (r1 == 0) goto L66
            int r1 = r2 + 1
            java.lang.Object r4 = r5.f2195
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
            xhss.ᲁᲀᛳ r5 = new xhss.ᲁᲀᛳ
            r5.<init>(r3)
            throw r5
        L3c:
            int r3 = r1.length()
            r5.m1122(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r0, r1}
            xhss.ᲀᛶᛶᲀ r0 = xhss.C0178.f702
            java.lang.String r2 = "BooleanLiteral from {} to {} -> [{}]"
            r0.mo384(r2, r5)
            java.lang.String r5 = r1.toString()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            if (r5 == 0) goto L63
            xhss.ᲁᛳᛲᛸ r5 = xhss.InterfaceC0169.f679
            return r5
        L63:
            xhss.ᲁᛳᛲᛸ r5 = xhss.InterfaceC0169.f680
            return r5
        L66:
            xhss.ᲁᲀᛳ r5 = new xhss.ᲁᲀᛳ
            r5.<init>(r3)
            throw r5
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0245 m429() {
            r5 = this;
            xhss.ᛷᛳᛷᛳ r5 = r5.f703
            int r0 = r5.f2192
            char r1 = r5.m1113()
            r2 = 91
            if (r1 != r2) goto Lf
            r2 = 93
            goto L11
        Lf:
            r2 = 125(0x7d, float:1.75E-43)
        L11:
            int r3 = r5.f2192
            r4 = 0
            int r1 = r5.m1120(r3, r1, r2, r4)
            r2 = -1
            if (r1 == r2) goto L42
            int r1 = r1 + 1
            r5.f2192 = r1
            java.lang.Object r2 = r5.f2195
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r1 = r2.subSequence(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = r5.f2192
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5, r1}
            xhss.ᲀᛶᛶᲀ r0 = xhss.C0178.f702
            java.lang.String r2 = "JsonLiteral from {} to {} -> [{}]"
            r0.mo384(r2, r5)
            xhss.ᛳᛲᲀᛷ r5 = new xhss.ᛳᛲᲀᛷ
            r5.<init>(r1)
            return r5
        L42:
            java.lang.String r0 = "String not closed. Expected ' in "
            xhss.C0532.m961(r5, r0)
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.AbstractC0660 m430() {
            r5 = this;
            xhss.ᛷᛳᛷᛳ r0 = r5.f703
            r0.m1111()
            int r1 = r0.f2192
            r0.m1111()
            r2 = 33
            boolean r3 = r0.m1108(r2)
            if (r3 == 0) goto L30
            r0.m1110(r2)
            r0.m1111()
            char r2 = r0.m1113()
            r3 = 36
            if (r2 == r3) goto L2e
            r3 = 64
            if (r2 == r3) goto L2e
            xhss.ᛷᛵᲁᲁ r5 = r5.m430()
            xhss.ᲇᲇᛲᲁ r0 = new xhss.ᲇᲇᛲᲁ
            r0.<init>(r5)
            return r0
        L2e:
            r0.f2192 = r1
        L30:
            r0.m1111()
            r1 = 40
            boolean r2 = r0.m1108(r1)
            if (r2 == 0) goto L48
            r0.m1110(r1)
            xhss.ᛷᛵᲁᲁ r5 = r5.m436()
            r1 = 41
            r0.m1110(r1)
            return r5
        L48:
            xhss.ᛱᛶᛶᛱ r1 = r5.m437()
            int r2 = r0.f2192
            xhss.ᲈᲈᛳᛳ r3 = r5.m431()     // Catch: xhss.C0978 -> L5c
            xhss.ᛱᛶᛶᛱ r5 = r5.m437()     // Catch: xhss.C0978 -> L5c
            xhss.ᲇᛳᛸᛱ r4 = new xhss.ᲇᛳᛸᛱ     // Catch: xhss.C0978 -> L5c
            r4.<init>(r1, r3, r5)     // Catch: xhss.C0978 -> L5c
            return r4
        L5c:
            r0.f2192 = r2
            xhss.ᲀᛴᲇ r5 = r1.mo170()
            boolean r0 = r5.f2784
            xhss.ᲀᛴᲇ r1 = new xhss.ᲀᛴᲇ
            xhss.ᛴᲇᲀᛴ r5 = r5.f2782
            r2 = 1
            r1.<init>(r5, r2, r0)
            if (r0 == 0) goto L71
            xhss.ᲁᛳᛲᛸ r5 = xhss.InterfaceC0169.f679
            goto L73
        L71:
            xhss.ᲁᛳᛲᛸ r5 = xhss.InterfaceC0169.f680
        L73:
            xhss.ᲇᛳᛸᛱ r0 = new xhss.ᲇᛳᛸᛱ
            xhss.ᲈᲈᛳᛳ r2 = xhss.EnumC1203.f3902
            r0.<init>(r1, r2, r5)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.EnumC1203 m431() {
            r6 = this;
            xhss.ᛷᛳᛷᛳ r6 = r6.f703
            r6.m1111()
            int r0 = r6.f2192
            char r1 = r6.m1113()
            boolean r1 = m427(r1)
            r2 = 1
            if (r1 == 0) goto L28
        L12:
            int r1 = r6.f2192
            boolean r1 = r6.m1112(r1)
            if (r1 == 0) goto L3c
            char r1 = r6.m1113()
            boolean r1 = m427(r1)
            if (r1 == 0) goto L3c
            r6.m1122(r2)
            goto L12
        L28:
            int r1 = r6.f2192
            boolean r1 = r6.m1112(r1)
            if (r1 == 0) goto L3c
            char r1 = r6.m1113()
            r3 = 32
            if (r1 == r3) goto L3c
            r6.m1122(r2)
            goto L28
        L3c:
            int r1 = r6.f2192
            java.lang.Object r3 = r6.f2195
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r1 = r3.subSequence(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r6 = r6.f2192
            int r6 = r6 - r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6, r1}
            xhss.ᲀᛶᛶᲀ r0 = xhss.C0178.f702
            java.lang.String r2 = "Operator from {} to {} -> [{}]"
            r0.mo384(r2, r6)
            java.lang.String r6 = r1.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r6.toUpperCase(r0)
            xhss.ᲈᲈᛳᛳ[] r1 = xhss.EnumC1203.values()
            int r2 = r1.length
            r3 = 0
        L6c:
            if (r3 >= r2) goto L7c
            r4 = r1[r3]
            java.lang.String r5 = r4.f3914
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L79
            return r4
        L79:
            int r3 = r3 + 1
            goto L6c
        L7c:
            xhss.ᲁᲀᛳ r0 = new xhss.ᲁᲀᛳ
            java.lang.String r1 = "Filter operator "
            java.lang.String r2 = " is not supported!"
            java.lang.String r6 = xhss.AbstractC0390.m781(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.C0861 m432() {
            r11 = this;
            xhss.ᛷᛳᛷᛳ r11 = r11.f703
            int r0 = r11.f2192
            java.lang.Object r1 = r11.f2195
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r0 = r11.m1115(r0)
            r2 = 32
            r3 = -1
            if (r0 != r3) goto L13
            r0 = r2
            goto L17
        L13:
            char r0 = r1.charAt(r0)
        L17:
            int r4 = r11.f2192
            r5 = 1
            r11.m1122(r5)
        L1d:
            int r6 = r11.f2192
            boolean r6 = r11.m1112(r6)
            r7 = 0
            if (r6 == 0) goto La4
            char r6 = r11.m1113()
            r8 = 91
            if (r6 != r8) goto L44
            int r6 = r11.f2192
            r9 = 93
            int r6 = r11.m1120(r6, r8, r9, r7)
            if (r6 == r3) goto L3d
            int r6 = r6 + 1
            r11.f2192 = r6
            goto L44
        L3d:
            java.lang.String r0 = "Square brackets does not match in filter "
            xhss.C0532.m961(r11, r0)
            r11 = 0
            return r11
        L44:
            char r6 = r11.m1113()
            r8 = 41
            if (r6 != r8) goto L78
            char r6 = r11.m1113()
            if (r6 == r8) goto L53
            goto L78
        L53:
            int r6 = r11.f2192
            int r6 = r11.m1115(r6)
            if (r6 == r3) goto L78
            char r9 = r1.charAt(r6)
            r10 = 40
            if (r9 == r10) goto L64
            goto L78
        L64:
            int r6 = r6 + (-1)
            boolean r9 = r11.m1112(r6)
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
            char r9 = r11.m1113()
            if (r9 != r8) goto L83
            if (r6 != 0) goto L83
            r6 = r5
            goto L84
        L83:
            r6 = r7
        L84:
            int r8 = r11.f2192
            boolean r8 = r11.m1112(r8)
            if (r8 == 0) goto La4
            char r8 = r11.m1113()
            boolean r8 = m427(r8)
            if (r8 != 0) goto La4
            char r8 = r11.m1113()
            if (r8 == r2) goto La4
            if (r6 == 0) goto L9f
            goto La4
        L9f:
            r11.m1122(r5)
            goto L1d
        La4:
            r2 = 33
            if (r0 == r2) goto La9
            goto Laa
        La9:
            r5 = r7
        Laa:
            int r11 = r11.f2192
            java.lang.CharSequence r11 = r1.subSequence(r4, r11)
            xhss.ᲀᛴᲇ r0 = new xhss.ᲀᛴᲇ
            r0.<init>(r11, r5)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.C1192 m433(char r4) {
            r3 = this;
            xhss.ᛷᛳᛷᛳ r3 = r3.f703
            int r0 = r3.f2192
            int r1 = r3.m1114(r0, r4)
            r2 = -1
            if (r1 == r2) goto L32
            r4 = 1
            int r1 = r1 + r4
            r3.f2192 = r1
            java.lang.Object r2 = r3.f2195
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r1 = r2.subSequence(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r3.f2192
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3, r1}
            xhss.ᲀᛶᛶᲀ r0 = xhss.C0178.f702
            java.lang.String r2 = "StringLiteral from {} to {} -> [{}]"
            r0.mo384(r2, r3)
            xhss.ᲈᲇᛱᛶ r3 = new xhss.ᲈᲇᛱᛶ
            r3.<init>(r1, r4)
            return r3
        L32:
            xhss.ᲁᲀᛳ r0 = new xhss.ᲁᲀᛳ
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

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C0787 m434() {
            r4 = this;
            xhss.ᛷᛳᛷᛳ r4 = r4.f703
            int r0 = r4.f2192
            java.lang.Object r1 = r4.f2195
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L8:
            int r2 = r4.f2192
            boolean r2 = r4.m1112(r2)
            if (r2 == 0) goto L31
            int r2 = r4.f2192
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
            r4.m1122(r2)
            goto L8
        L31:
            int r2 = r4.f2192
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = r4.f2192
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4, r1}
            xhss.ᲀᛶᛶᲀ r0 = xhss.C0178.f702
            java.lang.String r2 = "NumberLiteral from {} to {} -> [{}]"
            r0.mo384(r2, r4)
            xhss.ᛸᛷᲈᛶ r4 = new xhss.ᛸᛷᲈᛶ
            r4.<init>(r1)
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.AbstractC0660 m435() {
            r4 = this;
            xhss.ᛷᛳᛷᛳ r0 = r4.f703
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            xhss.ᛷᛵᲁᲁ r2 = r4.m430()
            r1.add(r2)
        Le:
            int r2 = r0.f2192
            java.lang.String r3 = "&&"
            boolean r3 = r0.m1121(r3)
            if (r3 == 0) goto L20
            xhss.ᛷᛵᲁᲁ r2 = r4.m430()
            r1.add(r2)
            goto Le
        L20:
            r0.f2192 = r2
            int r4 = r1.size()
            r0 = 1
            if (r0 != r4) goto L31
            r4 = 0
            java.lang.Object r4 = r1.get(r4)
            xhss.ᛷᛵᲁᲁ r4 = (xhss.AbstractC0660) r4
            return r4
        L31:
            xhss.ᲇᲇᛲᲁ r4 = new xhss.ᲇᲇᛲᲁ
            r4.<init>(r0, r1)
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.AbstractC0660 m436() {
            r4 = this;
            xhss.ᛷᛳᛷᛳ r0 = r4.f703
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            xhss.ᛷᛵᲁᲁ r2 = r4.m435()
            r1.add(r2)
        Le:
            int r2 = r0.f2192
            java.lang.String r3 = "||"
            boolean r3 = r0.m1121(r3)
            if (r3 == 0) goto L20
            xhss.ᛷᛵᲁᲁ r2 = r4.m435()
            r1.add(r2)
            goto Le
        L20:
            r0.f2192 = r2
            r4 = 1
            int r0 = r1.size()
            if (r4 != r0) goto L31
            r4 = 0
            java.lang.Object r4 = r1.get(r4)
            xhss.ᛷᛵᲁᲁ r4 = (xhss.AbstractC0660) r4
            return r4
        L31:
            xhss.ᲇᲇᛲᲁ r4 = new xhss.ᲇᲇᛲᲁ
            r0 = 3
            r4.<init>(r0, r1)
            return r4
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final xhss.AbstractC0052 m437() {
            r10 = this;
            xhss.ᛷᛳᛷᛳ r0 = r10.f703
            r0.m1111()
            char r1 = r0.m1113()
            r2 = 1
            r3 = 64
            r4 = 36
            r5 = 33
            if (r1 == r5) goto L122
            if (r1 == r4) goto L11d
            if (r1 == r3) goto L118
            r0.m1111()
            java.lang.Object r1 = r0.f2195
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            char r3 = r0.m1113()
            r4 = 34
            if (r3 == r4) goto L113
            r4 = 39
            if (r3 == r4) goto L10e
            r4 = 45
            if (r3 == r4) goto L109
            xhss.ᲀᛶᛶᲀ r4 = xhss.C0178.f702
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
            xhss.ᛸᛷᲈᛶ r10 = r10.m434()
            return r10
        L4c:
            xhss.ᛳᛲᲀᛷ r10 = r10.m429()
            return r10
        L51:
            xhss.ᲁᛳᛲᛸ r10 = r10.m428()
            return r10
        L56:
            int r10 = r0.f2192
            char r3 = r0.m1113()
            if (r3 != r2) goto L9b
            int r2 = r0.f2192
            int r2 = r2 + 3
            boolean r2 = r0.m1112(r2)
            if (r2 == 0) goto L9b
            int r2 = r0.f2192
            int r3 = r2 + 4
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r2 = "null"
            java.lang.String r3 = r1.toString()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L9b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r2 = r0.f2192
            int r2 = r2 + 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r2, r1}
            java.lang.String r2 = "NullLiteral from {} to {} -> [{}]"
            r4.mo384(r2, r10)
            int r10 = r1.length()
            r0.m1122(r10)
            xhss.ᲈᛷᛸᲇ r10 = xhss.InterfaceC0169.f681
            return r10
        L9b:
            xhss.ᲁᲀᛳ r10 = new xhss.ᲁᲀᛳ
            java.lang.String r0 = "Expected <null> value"
            r10.<init>(r0)
            throw r10
        La3:
            xhss.ᲁᛳᛲᛸ r10 = r10.m428()
            return r10
        La8:
            xhss.ᛳᛲᲀᛷ r10 = r10.m429()
            return r10
        Lad:
            int r10 = r0.f2192
            int r3 = r0.m1114(r10, r5)
            r5 = -1
            if (r3 == r5) goto L102
            int r5 = r3 + 1
            boolean r6 = r0.m1112(r5)
            if (r6 == 0) goto Le2
            r6 = r5
        Lbf:
            boolean r7 = r0.m1112(r6)
            if (r7 == 0) goto Ld7
            char r7 = r1.charAt(r6)
            char[] r8 = new char[r2]
            r9 = 0
            r8[r9] = r7
            int r7 = xhss.AbstractC0390.m771(r8)
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
            r0.f2192 = r3
            java.lang.CharSequence r1 = r1.subSequence(r10, r3)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r0 = r0.f2192
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r0, r1}
            java.lang.String r0 = "PatternNode from {} to {} -> [{}]"
            r4.mo384(r0, r10)
            xhss.ᛱᲀᛴᛴ r10 = new xhss.ᛱᲀᛴᛴ
            r10.<init>(r1)
            return r10
        L102:
            java.lang.String r10 = "Pattern not closed. Expected / in "
            xhss.C0532.m961(r0, r10)
            r10 = 0
            return r10
        L109:
            xhss.ᛸᛷᲈᛶ r10 = r10.m434()
            return r10
        L10e:
            xhss.ᲈᲇᛱᛶ r10 = r10.m433(r4)
            return r10
        L113:
            xhss.ᲈᲇᛱᛶ r10 = r10.m433(r4)
            return r10
        L118:
            xhss.ᲀᛴᲇ r10 = r10.m432()
            return r10
        L11d:
            xhss.ᲀᛴᲇ r10 = r10.m432()
            return r10
        L122:
            r0.m1122(r2)
            r0.m1111()
            char r0 = r0.m1113()
            if (r0 == r4) goto L149
            if (r0 != r3) goto L135
            xhss.ᲀᛴᲇ r10 = r10.m432()
            return r10
        L135:
            xhss.ᲁᲀᛳ r10 = new xhss.ᲁᲀᛳ
            java.lang.Character r0 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Unexpected character: %c"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r10.<init>(r0)
            throw r10
        L149:
            xhss.ᲀᛴᲇ r10 = r10.m432()
            return r10
    }
}
