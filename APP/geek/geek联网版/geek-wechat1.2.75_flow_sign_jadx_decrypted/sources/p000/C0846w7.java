package p000;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: w7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0846w7 {

    /* JADX INFO: renamed from: b */
    public static final String f5067b;

    /* JADX INFO: renamed from: c */
    public static final String f5068c;

    /* JADX INFO: renamed from: d */
    public static final C0846w7 f5069d;

    /* JADX INFO: renamed from: e */
    public static final C0846w7 f5070e;

    /* JADX INFO: renamed from: a */
    public final boolean f5071a;

    static {
        C0059b8 c0059b8 = h60.f2119c;
        f5067b = Character.toString((char) 8206);
        f5068c = Character.toString((char) 8207);
        f5069d = new C0846w7(false);
        f5070e = new C0846w7(true);
    }

    public C0846w7(boolean z) {
        C0059b8 c0059b8 = h60.f2117a;
        this.f5071a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0.f4911c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        switch(r0.m2545a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2599a(java.lang.CharSequence r9) {
        /*
            v7 r0 = new v7
            r0.<init>(r9)
            r9 = 0
            r0.f4911c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f4911c
            int r5 = r0.f4910b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f4909a
            char r4 = r5.charAt(r4)
            r0.f4912d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f4911c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f4911c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f4911c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f4911c
            int r4 = r4 + r7
            r0.f4911c = r4
            char r4 = r0.f4912d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = p000.C0808v7.f4908e
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
            int r2 = r0.f4911c
            if (r2 <= 0) goto L8c
            byte r2 = r0.m2545a()
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
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0846w7.m2599a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        return 1;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2600b(java.lang.CharSequence r6) {
        /*
            v7 r0 = new v7
            r0.<init>(r6)
            int r6 = r0.f4910b
            r0.f4911c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f4911c
            if (r3 <= 0) goto L3f
            byte r3 = r0.m2545a()
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
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0846w7.m2600b(java.lang.CharSequence):int");
    }

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder m2601c(CharSequence charSequence) {
        C0059b8 c0059b8 = h60.f2119c;
        if (charSequence == null) {
            return null;
        }
        boolean zM494b = c0059b8.m494b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM494b2 = (zM494b ? h60.f2118b : h60.f2117a).m494b(charSequence, charSequence.length());
        String str = "";
        String str2 = f5068c;
        String str3 = f5067b;
        boolean z = this.f5071a;
        spannableStringBuilder.append((CharSequence) ((z || !(zM494b2 || m2599a(charSequence) == 1)) ? (!z || (zM494b2 && m2599a(charSequence) != -1)) ? "" : str2 : str3));
        if (zM494b != z) {
            spannableStringBuilder.append(zM494b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM494b3 = (zM494b ? h60.f2118b : h60.f2117a).m494b(charSequence, charSequence.length());
        if (!z && (zM494b3 || m2600b(charSequence) == 1)) {
            str = str3;
        } else if (z && (!zM494b3 || m2600b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
