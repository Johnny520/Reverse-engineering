package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m7 {
    public static final java.lang.String b = null;
    public static final java.lang.String c = null;
    public static final defpackage.m7 d = null;
    public static final defpackage.m7 e = null;
    public final boolean a;

    static {
            r7 r0 = defpackage.b60.c
            r0 = 8206(0x200e, float:1.1499E-41)
            java.lang.String r0 = java.lang.Character.toString(r0)
            defpackage.m7.b = r0
            r0 = 8207(0x200f, float:1.15E-41)
            java.lang.String r0 = java.lang.Character.toString(r0)
            defpackage.m7.c = r0
            m7 r0 = new m7
            r1 = 0
            r0.<init>(r1)
            defpackage.m7.d = r0
            m7 r0 = new m7
            r1 = 1
            r0.<init>(r1)
            defpackage.m7.e = r0
            return
    }

    public m7(boolean r2) {
            r1 = this;
            r7 r0 = defpackage.b60.a
            r1.<init>()
            r1.a = r2
            return
    }

    public static int a(java.lang.CharSequence r9) {
            l7 r0 = new l7
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.c
            int r5 = r0.b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.c
            int r4 = r4 + r7
            r0.c = r4
            char r4 = r0.d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = defpackage.l7.e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L85
        L69:
            if (r3 != 0) goto L6c
            goto L8b
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8c
        L71:
            if (r2 == 0) goto L74
            return r2
        L74:
            int r2 = r0.c
            if (r2 <= 0) goto L8c
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L89;
                case 15: goto L89;
                case 16: goto L83;
                case 17: goto L83;
                case 18: goto L80;
                default: goto L7f;
            }
        L7f:
            goto L74
        L80:
            int r3 = r3 + 1
            goto L74
        L83:
            if (r1 != r3) goto L86
        L85:
            return r7
        L86:
            int r3 = r3 + (-1)
            goto L74
        L89:
            if (r1 != r3) goto L86
        L8b:
            return r6
        L8c:
            return r9
    }

    public static int b(java.lang.CharSequence r6) {
            l7 r0 = new l7
            r0.<init>(r6)
            int r6 = r0.b
            r0.c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.c
            if (r3 <= 0) goto L3f
            byte r3 = r0.a()
            if (r3 == 0) goto L38
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2f;
                case 15: goto L2f;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r2 != 0) goto Lc
            goto L3e
        L26:
            int r1 = r1 + 1
            goto Lc
        L29:
            if (r2 != r1) goto L2c
            goto L34
        L2c:
            int r1 = r1 + (-1)
            goto Lc
        L2f:
            if (r2 != r1) goto L2c
            goto L3a
        L32:
            if (r1 != 0) goto L35
        L34:
            return r4
        L35:
            if (r2 != 0) goto Lc
            goto L3e
        L38:
            if (r1 != 0) goto L3c
        L3a:
            r6 = -1
            return r6
        L3c:
            if (r2 != 0) goto Lc
        L3e:
            goto Lb
        L3f:
            return r6
    }

    public final android.text.SpannableStringBuilder c(java.lang.CharSequence r11) {
            r10 = this;
            r7 r0 = defpackage.b60.c
            if (r11 != 0) goto L6
            r11 = 0
            return r11
        L6:
            int r1 = r11.length()
            boolean r0 = r0.b(r11, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            if (r0 == 0) goto L18
            r7 r2 = defpackage.b60.b
            goto L1a
        L18:
            r7 r2 = defpackage.b60.a
        L1a:
            int r3 = r11.length()
            boolean r2 = r2.b(r11, r3)
            java.lang.String r3 = ""
            java.lang.String r4 = defpackage.m7.c
            r5 = -1
            java.lang.String r6 = defpackage.m7.b
            r7 = 1
            boolean r8 = r10.a
            if (r8 != 0) goto L38
            if (r2 != 0) goto L36
            int r9 = a(r11)
            if (r9 != r7) goto L38
        L36:
            r2 = r6
            goto L45
        L38:
            if (r8 == 0) goto L44
            if (r2 == 0) goto L42
            int r2 = a(r11)
            if (r2 != r5) goto L44
        L42:
            r2 = r4
            goto L45
        L44:
            r2 = r3
        L45:
            r1.append(r2)
            if (r0 == r8) goto L5d
            if (r0 == 0) goto L4f
            r2 = 8235(0x202b, float:1.154E-41)
            goto L51
        L4f:
            r2 = 8234(0x202a, float:1.1538E-41)
        L51:
            r1.append(r2)
            r1.append(r11)
            r2 = 8236(0x202c, float:1.1541E-41)
            r1.append(r2)
            goto L60
        L5d:
            r1.append(r11)
        L60:
            if (r0 == 0) goto L65
            r7 r0 = defpackage.b60.b
            goto L67
        L65:
            r7 r0 = defpackage.b60.a
        L67:
            int r2 = r11.length()
            boolean r0 = r0.b(r11, r2)
            if (r8 != 0) goto L7b
            if (r0 != 0) goto L79
            int r2 = b(r11)
            if (r2 != r7) goto L7b
        L79:
            r3 = r6
            goto L86
        L7b:
            if (r8 == 0) goto L86
            if (r0 == 0) goto L85
            int r11 = b(r11)
            if (r11 != r5) goto L86
        L85:
            r3 = r4
        L86:
            r1.append(r3)
            return r1
    }
}
