package defpackage;

/* JADX INFO: renamed from: ᛲᛳᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0260 implements defpackage.InterfaceC1661 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0633 f1513;

    public C0260(defpackage.C0633 r1) {
            r0 = this;
            r0.<init>()
            r0.f1513 = r1
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            ᛴᛲᲈᲀ r0 = r0.f1513
            r0.close()
            return
    }

    @Override // defpackage.InterfaceC1661
    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC0270 mo892(java.lang.String r14) {
            r13 = this;
            ᛴᛲᲈᲀ r13 = r13.f1513
            boolean r0 = r13.isOpen()
            r1 = 0
            if (r0 == 0) goto L15d
            java.lang.CharSequence r0 = defpackage.AbstractC1347.m2521(r14)
            java.lang.String r0 = r0.toString()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            int r2 = r0.length()
            r3 = 2
            int r2 = r2 - r3
            r4 = 1
            r5 = 4
            r6 = 0
            r7 = -1
            if (r2 >= 0) goto L25
        L23:
            r8 = r7
            goto L73
        L25:
            r8 = r6
        L26:
            if (r8 >= r2) goto L23
            char r9 = r0.charAt(r8)
            r10 = 32
            int r10 = defpackage.AbstractC0498.m1275(r9, r10)
            if (r10 > 0) goto L37
        L34:
            int r8 = r8 + 1
            goto L26
        L37:
            r10 = 45
            if (r9 != r10) goto L4f
            int r9 = r8 + 1
            char r9 = r0.charAt(r9)
            if (r9 == r10) goto L44
            goto L73
        L44:
            int r8 = r8 + 2
            r9 = 10
            int r8 = defpackage.AbstractC1347.m2514(r0, r9, r8, r5)
            if (r8 >= 0) goto L34
            goto L23
        L4f:
            r10 = 47
            if (r9 != r10) goto L73
            int r9 = r8 + 1
            char r11 = r0.charAt(r9)
            r12 = 42
            if (r11 == r12) goto L5e
            goto L73
        L5e:
            int r9 = r9 + r4
            int r9 = defpackage.AbstractC1347.m2514(r0, r12, r9, r5)
            if (r9 >= 0) goto L66
            goto L23
        L66:
            int r8 = r9 + 1
            if (r8 >= r2) goto L70
            char r8 = r0.charAt(r8)
            if (r8 != r10) goto L5e
        L70:
            int r8 = r9 + 2
            goto L26
        L73:
            if (r8 < 0) goto L8b
            int r2 = r0.length()
            if (r8 <= r2) goto L7c
            goto L8b
        L7c:
            int r2 = r8 + 3
            int r9 = r0.length()
            int r2 = java.lang.Math.min(r2, r9)
            java.lang.String r2 = r0.substring(r8, r2)
            goto L8c
        L8b:
            r2 = r1
        L8c:
            if (r2 != 0) goto L94
            ᛷᛱᲁᛷ r0 = new ᛷᛱᲁᛷ
            r0.<init>(r13, r14)
            return r0
        L94:
            int r8 = r2.hashCode()
            switch(r8) {
                case 65636: goto Lc3;
                case 66913: goto Lb8;
                case 68795: goto Laf;
                case 81327: goto L9c;
                default: goto L9b;
            }
        L9b:
            goto Lcb
        L9c:
            java.lang.String r4 = "ROL"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto La5
            goto Lcb
        La5:
            java.lang.String r4 = " TO "
            boolean r4 = defpackage.AbstractC1347.m2500(r0, r4, r6)
            if (r4 == 0) goto Le1
        Lad:
            r3 = r6
            goto Le1
        Laf:
            java.lang.String r3 = "END"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lc1
            goto Lcb
        Lb8:
            java.lang.String r3 = "COM"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lc1
            goto Lcb
        Lc1:
            r3 = r4
            goto Le1
        Lc3:
            java.lang.String r3 = "BEG"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lcc
        Lcb:
            goto Lad
        Lcc:
            java.lang.String r3 = "EXCLUSIVE"
            boolean r3 = defpackage.AbstractC1347.m2500(r0, r3, r6)
            if (r3 == 0) goto Ld6
            r3 = 3
            goto Le1
        Ld6:
            java.lang.String r3 = "IMMEDIATE"
            boolean r3 = defpackage.AbstractC1347.m2500(r0, r3, r6)
            if (r3 == 0) goto Le0
            r3 = r5
            goto Le1
        Le0:
            r3 = 5
        Le1:
            if (r3 == 0) goto Le9
            ᛱᛴᛲᲈ r0 = new ᛱᛴᛲᲈ
            r0.<init>(r13, r14, r3)
            return r0
        Le9:
            java.lang.String r3 = "PRA"
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L118
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r4)
            r4 = 6
            java.lang.String r5 = "journal_mode"
            int r4 = defpackage.AbstractC1347.m2517(r0, r5, r6, r6, r4)
            if (r4 != r7) goto L103
            java.lang.String r0 = ""
            goto L10e
        L103:
            r5 = 12
            int r5 = r5 + r4
            int r4 = r0.length()
            java.lang.String r0 = r0.substring(r5, r4)
        L10e:
            java.lang.String r4 = "="
            boolean r0 = defpackage.AbstractC1347.m2500(r0, r4, r6)
            if (r0 == 0) goto L118
            ᲀᛴᛱᛱ r1 = defpackage.C1654.f7362
        L118:
            if (r1 == 0) goto L125
            ᛷᛱᲁᛷ r0 = new ᛷᛱᲁᛷ
            ᛷᲀᛵ r1 = new ᛷᲀᛵ
            r1.<init>(r13, r14)
            r0.<init>(r13, r14, r1)
            return r0
        L125:
            int r0 = r2.hashCode()
            r1 = 79487(0x1367f, float:1.11385E-40)
            if (r0 == r1) goto L14b
            r1 = 81978(0x1403a, float:1.14876E-40)
            if (r0 == r1) goto L142
            r1 = 85954(0x14fc2, float:1.20447E-40)
            if (r0 == r1) goto L139
            goto L157
        L139:
            java.lang.String r0 = "WIT"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L151
            goto L157
        L142:
            java.lang.String r0 = "SEL"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L151
            goto L157
        L14b:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L157
        L151:
            ᛷᲀᛵ r0 = new ᛷᲀᛵ
            r0.<init>(r13, r14)
            return r0
        L157:
            ᛷᛱᲁᛷ r0 = new ᛷᛱᲁᛷ
            r0.<init>(r13, r14)
            return r0
        L15d:
            r13 = 21
            java.lang.String r14 = "connection is closed"
            defpackage.AbstractC1628.m2954(r13, r14)
            throw r1
    }

    @Override // defpackage.InterfaceC1661
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final boolean mo893() {
            r0 = this;
            ᛴᛲᲈᲀ r0 = r0.f1513
            boolean r0 = r0.m1470()
            return r0
    }
}
