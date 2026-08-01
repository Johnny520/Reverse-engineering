package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛳᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0639 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f2192;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f2193;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2194;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object f2195;

    public C0639() {
            r1 = this;
            r0 = 1
            r1.f2194 = r0
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            xhss.ᛷᛳᛷᛳ[] r0 = new xhss.C0639[r0]
            r1.f2195 = r0
            r0 = 0
            r1.f2192 = r0
            r1.f2193 = r0
            return
    }

    public C0639(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f2194 = r0
            r1.<init>()
            r0 = 0
            r1.f2195 = r0
            r1.f2192 = r2
            r2 = r3 & 7
            if (r2 != 0) goto L11
            r2 = 8
        L11:
            r1.f2193 = r2
            return
    }

    public C0639(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.f2194 = r0
            r1.<init>()
            r1.f2195 = r2
            r1.f2192 = r0
            int r2 = r2.length()
            int r2 = r2 + (-1)
            r1.f2193 = r2
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f2194
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Object r1 = r1.f2195
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public boolean m1108(char r2) {
            r1 = this;
            java.lang.Object r0 = r1.f2195
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r1.f2192
            char r1 = r0.charAt(r1)
            if (r1 != r2) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean m1109() {
            r1 = this;
            int r0 = r1.f2192
            int r1 = r1.f2193
            if (r0 < r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public void m1110(char r2) {
            r1 = this;
            r1.m1111()
            char r0 = r1.m1113()
            if (r0 != r2) goto Le
            r2 = 1
            r1.m1122(r2)
            return
        Le:
            xhss.ᲁᲀᛳ r1 = new xhss.ᲁᲀᛳ
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = "Expected character: %c"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public void m1111() {
            r2 = this;
        L0:
            int r0 = r2.f2192
            boolean r0 = r2.m1112(r0)
            if (r0 == 0) goto L1b
            int r0 = r2.f2192
            int r1 = r2.f2193
            if (r0 >= r1) goto L1b
            char r0 = r2.m1113()
            r1 = 32
            if (r0 != r1) goto L1b
            r0 = 1
            r2.m1122(r0)
            goto L0
        L1b:
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public boolean m1112(int r1) {
            r0 = this;
            if (r1 < 0) goto L8
            int r0 = r0.f2193
            if (r1 > r0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public char m1113() {
            r1 = this;
            java.lang.Object r0 = r1.f2195
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r1.f2192
            char r1 = r0.charAt(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public int m1114(int r7, char r8) {
            r6 = this;
            java.lang.Object r0 = r6.f2195
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            int r7 = r7 + r1
            r2 = 0
            r3 = r2
        L8:
            boolean r4 = r6.m1119(r7)
            if (r4 != 0) goto L26
            if (r3 == 0) goto L12
            r3 = r2
            goto L23
        L12:
            r4 = 92
            char r5 = r0.charAt(r7)
            if (r4 != r5) goto L1c
            r3 = r1
            goto L23
        L1c:
            char r4 = r0.charAt(r7)
            if (r8 != r4) goto L23
            return r7
        L23:
            int r7 = r7 + 1
            goto L8
        L26:
            r6 = -1
            return r6
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public int m1115(int r3) {
            r2 = this;
            int r3 = r3 + (-1)
        L2:
            boolean r0 = r2.m1119(r3)
            if (r0 != 0) goto L17
            java.lang.Object r0 = r2.f2195
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char r0 = r0.charAt(r3)
            r1 = 32
            if (r0 != r1) goto L17
            int r3 = r3 + (-1)
            goto L2
        L17:
            boolean r2 = r2.m1119(r3)
            if (r2 != 0) goto L1e
            return r3
        L1e:
            r2 = -1
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int m1116(int r4, char r5) {
            r3 = this;
            java.lang.Object r0 = r3.f2195
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L4:
            int r4 = r4 + 1
            boolean r1 = r3.m1119(r4)
            if (r1 != 0) goto L15
            char r1 = r0.charAt(r4)
            r2 = 32
            if (r1 != r2) goto L15
            goto L4
        L15:
            char r3 = r0.charAt(r4)
            if (r3 != r5) goto L1c
            return r4
        L1c:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public void m1117() {
            r2 = this;
            r2.m1111()
        L3:
            int r0 = r2.f2192
            boolean r0 = r2.m1112(r0)
            if (r0 == 0) goto L20
            int r0 = r2.f2192
            int r1 = r2.f2193
            if (r0 >= r1) goto L20
            r0 = 32
            boolean r0 = r2.m1124(r0)
            if (r0 == 0) goto L20
            int r0 = r2.f2193
            int r0 = r0 + (-1)
            r2.f2193 = r0
            goto L3
        L20:
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public char m1118(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f2195
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L4:
            int r4 = r4 + 1
            boolean r1 = r3.m1119(r4)
            r2 = 32
            if (r1 != 0) goto L15
            char r1 = r0.charAt(r4)
            if (r1 != r2) goto L15
            goto L4
        L15:
            boolean r3 = r3.m1119(r4)
            if (r3 != 0) goto L20
            char r3 = r0.charAt(r4)
            return r3
        L20:
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public boolean m1119(int r1) {
            r0 = this;
            boolean r0 = r0.m1112(r1)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public int m1120(int r6, char r7, char r8, boolean r9) {
            r5 = this;
            java.lang.Object r0 = r5.f2195
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char r1 = r0.charAt(r6)
            if (r1 != r7) goto L74
            r1 = 1
            int r6 = r6 + r1
        Lc:
            boolean r2 = r5.m1112(r6)
            r3 = -1
            if (r2 == 0) goto L73
            char r2 = r0.charAt(r6)
            r4 = 39
            if (r2 == r4) goto L1f
            r4 = 34
            if (r2 != r4) goto L27
        L1f:
            int r6 = r5.m1114(r6, r2)
            if (r6 == r3) goto L57
            int r6 = r6 + 1
        L27:
            if (r9 == 0) goto L41
            char r2 = r0.charAt(r6)
            r4 = 47
            if (r2 != r4) goto L41
            int r6 = r5.m1114(r6, r4)
            if (r6 == r3) goto L3a
            int r6 = r6 + 1
            goto L41
        L3a:
            java.lang.String r5 = "Could not find matching close for / when parsing regex in : "
            xhss.C0532.m961(r0, r5)
            r5 = 0
            return r5
        L41:
            char r2 = r0.charAt(r6)
            if (r2 != r7) goto L49
            int r1 = r1 + 1
        L49:
            char r2 = r0.charAt(r6)
            if (r2 != r8) goto L54
            int r1 = r1 + (-1)
            if (r1 != 0) goto L54
            return r6
        L54:
            int r6 = r6 + 1
            goto Lc
        L57:
            xhss.ᲁᲀᛳ r5 = new xhss.ᲁᲀᛳ
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Could not find matching close quote for "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " when parsing : "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L73:
            return r3
        L74:
            xhss.ᲁᲀᛳ r5 = new xhss.ᲁᲀᛳ
            char r6 = r0.charAt(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Expected "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = " but found "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean m1121(java.lang.String r5) {
            r4 = this;
            r4.m1111()
            int r0 = r4.f2192
            int r1 = r5.length()
            int r1 = r1 + r0
            r0 = 1
            int r1 = r1 - r0
            boolean r1 = r4.m1112(r1)
            if (r1 != 0) goto L13
            goto L28
        L13:
            int r1 = r4.f2192
            int r2 = r5.length()
            int r2 = r2 + r1
            java.lang.Object r3 = r4.f2195
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r1 = r3.subSequence(r1, r2)
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L2a
        L28:
            r4 = 0
            return r4
        L2a:
            int r5 = r5.length()
            r4.m1122(r5)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public void m1122(int r2) {
            r1 = this;
            int r0 = r1.f2192
            int r0 = r0 + r2
            r1.f2192 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public boolean m1123(int r5, char r6) {
            r4 = this;
            java.lang.Object r0 = r4.f2195
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            int r5 = r5 + r1
        L6:
            boolean r2 = r4.m1119(r5)
            if (r2 != 0) goto L17
            char r2 = r0.charAt(r5)
            r3 = 32
            if (r2 != r3) goto L17
            int r5 = r5 + 1
            goto L6
        L17:
            boolean r4 = r4.m1119(r5)
            if (r4 != 0) goto L24
            char r4 = r0.charAt(r5)
            if (r4 != r6) goto L24
            return r1
        L24:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public boolean m1124(char r2) {
            r1 = this;
            java.lang.Object r0 = r1.f2195
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r1.f2193
            char r1 = r0.charAt(r1)
            if (r1 != r2) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }
}
