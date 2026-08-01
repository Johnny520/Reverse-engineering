package defpackage;

/* JADX INFO: renamed from: ᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2328 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f10043;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f10044;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f10045;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f10046;

    public C2328() {
            r1 = this;
            r0 = 2
            r1.f10045 = r0
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            ᲈᲁ[] r0 = new defpackage.C2328[r0]
            r1.f10043 = r0
            r0 = 0
            r1.f10046 = r0
            r1.f10044 = r0
            return
    }

    public C2328(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.f10045 = r0
            r1.<init>()
            r0 = 0
            r1.f10043 = r0
            r1.f10046 = r2
            r2 = r3 & 7
            if (r2 != 0) goto L11
            r2 = 8
        L11:
            r1.f10044 = r2
            return
    }

    public C2328(java.lang.String r3) {
            r2 = this;
            r0 = 1
            r2.f10045 = r0
            r2.<init>()
            r2.f10043 = r3
            r1 = 0
            r2.f10046 = r1
            int r3 = r3.length()
            int r3 = r3 - r0
            r2.f10044 = r3
            return
    }

    public C2328(byte[] r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f10045 = r0
            r1.<init>()
            r1.f10043 = r2
            r1.f10046 = r3
            r1.f10044 = r4
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f10045
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Object r1 = r1.f10043
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int m3800(char r4, int r5) {
            r3 = this;
            java.lang.Object r0 = r3.f10043
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L4:
            int r5 = r5 + 1
            boolean r1 = r3.m3810(r5)
            if (r1 != 0) goto L15
            char r1 = r0.charAt(r5)
            r2 = 32
            if (r1 != r2) goto L15
            goto L4
        L15:
            char r3 = r0.charAt(r5)
            if (r3 != r4) goto L1c
            return r5
        L1c:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean m3801(char r2) {
            r1 = this;
            java.lang.Object r0 = r1.f10043
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r1.f10044
            char r1 = r0.charAt(r1)
            if (r1 != r2) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int m3802(char r7, int r8) {
            r6 = this;
            java.lang.Object r0 = r6.f10043
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            int r8 = r8 + r1
            r2 = 0
            r3 = r2
        L8:
            boolean r4 = r6.m3810(r8)
            if (r4 != 0) goto L26
            if (r3 == 0) goto L12
            r3 = r2
            goto L23
        L12:
            r4 = 92
            char r5 = r0.charAt(r8)
            if (r4 != r5) goto L1c
            r3 = r1
            goto L23
        L1c:
            char r4 = r0.charAt(r8)
            if (r7 != r4) goto L23
            return r8
        L23:
            int r8 = r8 + 1
            goto L8
        L26:
            r6 = -1
            return r6
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int m3803(int r3) {
            r2 = this;
            int r3 = r3 + (-1)
        L2:
            boolean r0 = r2.m3810(r3)
            if (r0 != 0) goto L17
            java.lang.Object r0 = r2.f10043
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char r0 = r0.charAt(r3)
            r1 = 32
            if (r0 != r1) goto L17
            int r3 = r3 + (-1)
            goto L2
        L17:
            boolean r2 = r2.m3810(r3)
            if (r2 != 0) goto L1e
            return r3
        L1e:
            r2 = -1
            return r2
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public void m3804(char r2) {
            r1 = this;
            r1.m3815()
            char r0 = r1.m3809()
            if (r0 != r2) goto Le
            r2 = 1
            r1.m3814(r2)
            return
        Le:
            ᛷᛴᛴᛸ r1 = new ᛷᛴᛴᛸ
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = "Expected character: %c"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean m3805(int r1) {
            r0 = this;
            if (r1 < 0) goto L8
            int r0 = r0.f10044
            if (r1 > r0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public char m3806(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f10043
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L4:
            int r4 = r4 + 1
            boolean r1 = r3.m3810(r4)
            r2 = 32
            if (r1 != 0) goto L15
            char r1 = r0.charAt(r4)
            if (r1 != r2) goto L15
            goto L4
        L15:
            boolean r3 = r3.m3810(r4)
            if (r3 != 0) goto L20
            char r3 = r0.charAt(r4)
            return r3
        L20:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean m3807(java.lang.String r5) {
            r4 = this;
            r4.m3815()
            int r0 = r4.f10046
            int r1 = r5.length()
            int r1 = r1 + r0
            r0 = 1
            int r1 = r1 - r0
            boolean r1 = r4.m3805(r1)
            if (r1 != 0) goto L13
            goto L28
        L13:
            int r1 = r4.f10046
            int r2 = r5.length()
            int r2 = r2 + r1
            java.lang.Object r3 = r4.f10043
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r1 = r3.subSequence(r1, r2)
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L2a
        L28:
            r4 = 0
            return r4
        L2a:
            int r5 = r5.length()
            r4.m3814(r5)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean m3808() {
            r1 = this;
            int r0 = r1.f10046
            int r1 = r1.f10044
            if (r0 < r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public char m3809() {
            r1 = this;
            java.lang.Object r0 = r1.f10043
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r1.f10046
            char r1 = r0.charAt(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean m3810(int r1) {
            r0 = this;
            boolean r0 = r0.m3805(r1)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public boolean m3811(char r5, int r6) {
            r4 = this;
            java.lang.Object r0 = r4.f10043
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            int r6 = r6 + r1
        L6:
            boolean r2 = r4.m3810(r6)
            if (r2 != 0) goto L17
            char r2 = r0.charAt(r6)
            r3 = 32
            if (r2 != r3) goto L17
            int r6 = r6 + 1
            goto L6
        L17:
            boolean r4 = r4.m3810(r6)
            if (r4 != 0) goto L24
            char r4 = r0.charAt(r6)
            if (r4 != r5) goto L24
            return r1
        L24:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public void m3812() {
            r2 = this;
            r2.m3815()
        L3:
            int r0 = r2.f10046
            boolean r0 = r2.m3805(r0)
            if (r0 == 0) goto L20
            int r0 = r2.f10046
            int r1 = r2.f10044
            if (r0 >= r1) goto L20
            r0 = 32
            boolean r0 = r2.m3801(r0)
            if (r0 == 0) goto L20
            int r0 = r2.f10044
            int r0 = r0 + (-1)
            r2.f10044 = r0
            goto L3
        L20:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public boolean m3813(char r2) {
            r1 = this;
            java.lang.Object r0 = r1.f10043
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r1.f10046
            char r1 = r0.charAt(r1)
            if (r1 != r2) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public void m3814(int r2) {
            r1 = this;
            int r0 = r1.f10046
            int r0 = r0 + r2
            r1.f10046 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public void m3815() {
            r2 = this;
        L0:
            int r0 = r2.f10046
            boolean r0 = r2.m3805(r0)
            if (r0 == 0) goto L1b
            int r0 = r2.f10046
            int r1 = r2.f10044
            if (r0 >= r1) goto L1b
            char r0 = r2.m3809()
            r1 = 32
            if (r0 != r1) goto L1b
            r0 = 1
            r2.m3814(r0)
            goto L0
        L1b:
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int m3816(int r6, char r7, char r8, boolean r9) {
            r5 = this;
            java.lang.Object r0 = r5.f10043
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char r1 = r0.charAt(r6)
            if (r1 != r7) goto L74
            r1 = 1
            int r6 = r6 + r1
        Lc:
            boolean r2 = r5.m3805(r6)
            r3 = -1
            if (r2 == 0) goto L73
            char r2 = r0.charAt(r6)
            r4 = 39
            if (r2 == r4) goto L1f
            r4 = 34
            if (r2 != r4) goto L27
        L1f:
            int r6 = r5.m3802(r2, r6)
            if (r6 == r3) goto L57
            int r6 = r6 + 1
        L27:
            if (r9 == 0) goto L41
            char r2 = r0.charAt(r6)
            r4 = 47
            if (r2 != r4) goto L41
            int r6 = r5.m3802(r4, r6)
            if (r6 == r3) goto L3a
            int r6 = r6 + 1
            goto L41
        L3a:
            java.lang.String r5 = "Could not find matching close for / when parsing regex in : "
            defpackage.C2264.m3675(r0, r5)
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
            ᛷᛴᛴᛸ r5 = new ᛷᛴᛴᛸ
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
            ᛷᛴᛴᛸ r5 = new ᛷᛴᛴᛸ
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
}
