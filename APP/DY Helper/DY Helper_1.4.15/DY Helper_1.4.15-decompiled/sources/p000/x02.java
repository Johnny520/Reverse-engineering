package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class x02 extends p000.w02 {
    /* JADX INFO: renamed from: Ι */
    public static boolean m6479(java.lang.String r7, java.lang.String r8, boolean r9) {
            r7.getClass()
            if (r9 != 0) goto La
            boolean r7 = r7.endsWith(r8)
            return r7
        La:
            int r9 = r7.length()
            int r0 = r8.length()
            int r3 = r9 - r0
            int r6 = r8.length()
            r2 = 1
            r5 = 0
            r1 = r7
            r4 = r8
            boolean r7 = r1.regionMatches(r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: Κ */
    public static boolean m6480(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    /* JADX INFO: renamed from: Λ */
    public static boolean m6481(java.lang.String r6, int r7, java.lang.String r8, int r9, int r10, boolean r11) {
            r6.getClass()
            r8.getClass()
            if (r11 != 0) goto Ld
            boolean r6 = r6.regionMatches(r7, r8, r9, r10)
            return r6
        Ld:
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1 = r11
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: Μ */
    public static java.lang.String m6482(java.lang.String r0, char r1, char r2) {
            r0.getClass()
            java.lang.String r0 = r0.replace(r1, r2)
            r0.getClass()
            return r0
    }

    /* JADX INFO: renamed from: Ν */
    public static java.lang.String m6483(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r0 = 0
            int r1 = p000.q02.m4666(r7, r8, r0, r0)
            if (r1 >= 0) goto L11
            return r7
        L11:
            int r2 = r8.length()
            r3 = 1
            if (r2 >= r3) goto L19
            goto L1a
        L19:
            r3 = r2
        L1a:
            int r4 = r7.length()
            int r4 = r4 - r2
            int r5 = r9.length()
            int r5 = r5 + r4
            if (r5 < 0) goto L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r5 = r0
        L2c:
            r4.append(r7, r5, r1)
            r4.append(r9)
            int r5 = r1 + r2
            int r6 = r7.length()
            if (r1 >= r6) goto L41
            int r1 = r1 + r3
            int r1 = p000.q02.m4666(r7, r8, r1, r0)
            if (r1 > 0) goto L2c
        L41:
            int r8 = r7.length()
            r4.append(r7, r5, r8)
            java.lang.String r7 = r4.toString()
            return r7
        L4d:
            java.lang.OutOfMemoryError r7 = new java.lang.OutOfMemoryError
            r7.<init>()
            throw r7
    }

    /* JADX INFO: renamed from: Ξ */
    public static boolean m6484(java.lang.String r6, java.lang.String r7, int r8, boolean r9) {
            r6.getClass()
            if (r9 != 0) goto La
            boolean r6 = r6.startsWith(r7, r8)
            return r6
        La:
            r3 = 0
            int r4 = r7.length()
            r0 = r6
            r2 = r7
            r1 = r8
            r5 = r9
            boolean r6 = m6481(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: Ο */
    public static boolean m6485(java.lang.String r6, java.lang.String r7, boolean r8) {
            r6.getClass()
            r7.getClass()
            if (r8 != 0) goto Ld
            boolean r6 = r6.startsWith(r7)
            return r6
        Ld:
            r3 = 0
            int r4 = r7.length()
            r1 = 0
            r0 = r6
            r2 = r7
            r5 = r8
            boolean r6 = m6481(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: Π */
    public static java.lang.Integer m6486(java.lang.String r1) {
            r1.getClass()
            r0 = 10
            java.lang.Integer r1 = m6487(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: Ρ */
    public static java.lang.Integer m6487(java.lang.String r9, int r10) {
            r9.getClass()
            p000.jx0.m3045(r10)
            int r0 = r9.length()
            if (r0 != 0) goto Ld
            goto L51
        Ld:
            r1 = 0
            char r2 = r9.charAt(r1)
            r3 = 48
            int r3 = p000.ln0.m3632(r2, r3)
            r4 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r3 >= 0) goto L30
            r3 = 1
            if (r0 != r3) goto L21
            goto L51
        L21:
            r5 = 43
            if (r2 == r5) goto L2e
            r4 = 45
            if (r2 == r4) goto L2a
            goto L51
        L2a:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r3
            goto L32
        L2e:
            r2 = r1
            goto L32
        L30:
            r2 = r1
            r3 = r2
        L32:
            r5 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r6 = r5
        L36:
            if (r3 >= r0) goto L57
            char r7 = r9.charAt(r3)
            int r7 = java.lang.Character.digit(r7, r10)
            if (r7 >= 0) goto L43
            goto L51
        L43:
            if (r1 >= r6) goto L4c
            if (r6 != r5) goto L51
            int r6 = r4 / r10
            if (r1 >= r6) goto L4c
            goto L51
        L4c:
            int r1 = r1 * r10
            int r8 = r4 + r7
            if (r1 >= r8) goto L53
        L51:
            r9 = 0
            return r9
        L53:
            int r1 = r1 - r7
            int r3 = r3 + 1
            goto L36
        L57:
            if (r2 == 0) goto L5e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            return r9
        L5e:
            int r9 = -r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            return r9
    }

    /* JADX INFO: renamed from: Σ */
    public static java.lang.Long m6488(java.lang.String r1) {
            r1.getClass()
            r0 = 10
            java.lang.Long r1 = m6489(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: Τ */
    public static java.lang.Long m6489(java.lang.String r19, int r20) {
            r0 = r19
            r1 = r20
            r0.getClass()
            p000.jx0.m3045(r1)
            int r2 = r0.length()
            if (r2 != 0) goto L11
            goto L69
        L11:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            int r5 = p000.ln0.m3632(r4, r5)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 >= 0) goto L3a
            r5 = 1
            if (r2 != r5) goto L27
            goto L69
        L27:
            r8 = 43
            if (r4 == r8) goto L34
            r3 = 45
            if (r4 == r3) goto L30
            goto L69
        L30:
            r6 = -9223372036854775808
            r3 = r5
            goto L3b
        L34:
            r18 = r5
            r5 = r3
            r3 = r18
            goto L3b
        L3a:
            r5 = r3
        L3b:
            r8 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r8
        L43:
            if (r3 >= r2) goto L6f
            char r4 = r0.charAt(r3)
            int r4 = java.lang.Character.digit(r4, r1)
            if (r4 >= 0) goto L50
            goto L69
        L50:
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 != 0) goto L69
            long r12 = (long) r1
            long r12 = r6 / r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L60
            goto L69
        L60:
            long r14 = (long) r1
            long r10 = r10 * r14
            long r14 = (long) r4
            long r16 = r6 + r14
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 >= 0) goto L6b
        L69:
            r0 = 0
            return r0
        L6b:
            long r10 = r10 - r14
            int r3 = r3 + 1
            goto L43
        L6f:
            if (r5 == 0) goto L76
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            return r0
        L76:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }
}
