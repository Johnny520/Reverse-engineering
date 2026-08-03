package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1092 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final char f3235 = 65535;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f3236 = 12;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f3237 = 32768;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f3238 = 24576;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f3239 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f3240 = 512;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public char[] f3241;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.io.Reader f3242;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f3243;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f3244;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f3245;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f3246;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f3247;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.String[] f3248;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<java.lang.Integer> f3249;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f3250;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f3251;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.lang.String f3252;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f3253;

    public C1092(java.io.Reader r2) {
            r1 = this;
            r0 = 32768(0x8000, float:4.5918E-41)
            r1.<init>(r2, r0)
            return
    }

    public C1092(java.io.Reader r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f3247 = r0
            r0 = 512(0x200, float:7.17E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.f3248 = r0
            r0 = 0
            r1.f3249 = r0
            r0 = 1
            r1.f3250 = r0
            Yue.C6657.m25635(r2)
            boolean r0 = r2.markSupported()
            Yue.C6657.m25628(r0)
            r1.f3242 = r2
            r2 = 32768(0x8000, float:4.5918E-41)
            int r2 = java.lang.Math.min(r3, r2)
            char[] r2 = new char[r2]
            r1.f3241 = r2
            r1.m5785()
            return
    }

    public C1092(java.lang.String r2) {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            int r2 = r2.length()
            r1.<init>(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String m5782(char[] r3, java.lang.String[] r4, int r5, int r6) {
            r0 = 12
            if (r6 <= r0) goto La
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3, r5, r6)
            return r4
        La:
            r0 = 1
            if (r6 >= r0) goto L10
            java.lang.String r3 = ""
            return r3
        L10:
            r0 = 0
            r1 = r0
        L12:
            if (r0 >= r6) goto L1e
            int r1 = r1 * 31
            int r2 = r5 + r0
            char r2 = r3[r2]
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L12
        L1e:
            r0 = r1 & 511(0x1ff, float:7.16E-43)
            r1 = r4[r0]
            if (r1 == 0) goto L2b
            boolean r2 = m5783(r3, r5, r6, r1)
            if (r2 == 0) goto L2b
            return r1
        L2b:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r5, r6)
            r4[r0] = r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static boolean m5783(char[] r4, int r5, int r6, java.lang.String r7) {
            int r0 = r7.length()
            r1 = 0
            if (r6 != r0) goto L1f
            r0 = r1
        L8:
            int r2 = r6 + (-1)
            if (r6 == 0) goto L1d
            int r6 = r5 + 1
            char r5 = r4[r5]
            int r3 = r0 + 1
            char r0 = r7.charAt(r0)
            if (r5 == r0) goto L19
            return r1
        L19:
            r5 = r6
            r6 = r2
            r0 = r3
            goto L8
        L1d:
            r4 = 1
            return r4
        L1f:
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f3243
            int r1 = r4.f3245
            int r2 = r0 - r1
            if (r2 >= 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            java.lang.String r2 = new java.lang.String
            char[] r3 = r4.f3241
            int r0 = r0 - r1
            r2.<init>(r3, r1, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m5784() {
            r1 = this;
            int r0 = r1.f3245
            int r0 = r0 + 1
            r1.f3245 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m5785() {
            r14 = this;
            boolean r0 = r14.f3251
            if (r0 != 0) goto L77
            int r0 = r14.f3245
            int r1 = r14.f3244
            if (r0 >= r1) goto Lc
            goto L77
        Lc:
            int r1 = r14.f3247
            r2 = -1
            r3 = 0
            if (r1 == r2) goto L17
            int r0 = r0 - r1
            r13 = r1
            r1 = r0
            r0 = r13
            goto L18
        L17:
            r1 = r3
        L18:
            java.io.Reader r4 = r14.f3242     // Catch: java.io.IOException -> L3c
            long r5 = (long) r0     // Catch: java.io.IOException -> L3c
            long r7 = r4.skip(r5)     // Catch: java.io.IOException -> L3c
            java.io.Reader r4 = r14.f3242     // Catch: java.io.IOException -> L3c
            r9 = 32768(0x8000, float:4.5918E-41)
            r4.mark(r9)     // Catch: java.io.IOException -> L3c
            r4 = r3
        L28:
            r9 = 1024(0x400, float:1.435E-42)
            r10 = 1
            if (r4 > r9) goto L43
            java.io.Reader r9 = r14.f3242     // Catch: java.io.IOException -> L3c
            char[] r11 = r14.f3241     // Catch: java.io.IOException -> L3c
            int r12 = r11.length     // Catch: java.io.IOException -> L3c
            int r12 = r12 - r4
            int r9 = r9.read(r11, r4, r12)     // Catch: java.io.IOException -> L3c
            if (r9 != r2) goto L3e
            r14.f3251 = r10     // Catch: java.io.IOException -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L71
        L3e:
            if (r9 > 0) goto L41
            goto L43
        L41:
            int r4 = r4 + r9
            goto L28
        L43:
            java.io.Reader r9 = r14.f3242     // Catch: java.io.IOException -> L3c
            r9.reset()     // Catch: java.io.IOException -> L3c
            if (r4 <= 0) goto L6a
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L4f
            goto L50
        L4f:
            r10 = r3
        L50:
            Yue.C6657.m25628(r10)     // Catch: java.io.IOException -> L3c
            r14.f3243 = r4     // Catch: java.io.IOException -> L3c
            int r5 = r14.f3246     // Catch: java.io.IOException -> L3c
            int r5 = r5 + r0
            r14.f3246 = r5     // Catch: java.io.IOException -> L3c
            r14.f3245 = r1     // Catch: java.io.IOException -> L3c
            int r0 = r14.f3247     // Catch: java.io.IOException -> L3c
            if (r0 == r2) goto L62
            r14.f3247 = r3     // Catch: java.io.IOException -> L3c
        L62:
            r0 = 24576(0x6000, float:3.4438E-41)
            int r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L3c
            r14.f3244 = r0     // Catch: java.io.IOException -> L3c
        L6a:
            r14.m5829()
            r0 = 0
            r14.f3252 = r0
            return
        L71:
            Yue.ۥۣۢ۟ۦ r1 = new Yue.ۥۣۢ۟ۦ
            r1.<init>(r0)
            throw r1
        L77:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m5786() {
            r2 = this;
            java.io.Reader r0 = r2.f3242
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r0.close()     // Catch: java.io.IOException -> L9 java.lang.Throwable -> L10
        L9:
            r2.f3242 = r1
            r2.f3241 = r1
            r2.f3248 = r1
            goto L18
        L10:
            r0 = move-exception
            r2.f3242 = r1
            r2.f3241 = r1
            r2.f3248 = r1
            throw r0
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m5787() {
            r1 = this;
            int r0 = r1.m5824()
            int r0 = r1.m5788(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m5788(int r3) {
            r2 = this;
            boolean r0 = r2.m5807()
            if (r0 != 0) goto L9
            int r3 = r3 + 1
            return r3
        L9:
            int r0 = r2.m5808(r3)
            r1 = -1
            if (r0 != r1) goto L13
            int r3 = r3 + 1
            return r3
        L13:
            java.util.ArrayList<java.lang.Integer> r1 = r2.f3249
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r3 = r3 - r0
            int r3 = r3 + 1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public char m5789() {
            r2 = this;
            r2.m5785()
            boolean r0 = r2.m5806()
            if (r0 == 0) goto Ld
            r0 = 65535(0xffff, float:9.1834E-41)
            goto L13
        Ld:
            char[] r0 = r2.f3241
            int r1 = r2.f3245
            char r0 = r0[r1]
        L13:
            int r1 = r2.f3245
            int r1 = r1 + 1
            r2.f3245 = r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.String m5790(boolean r7) {
            r6 = this;
            int r0 = r6.f3245
            int r1 = r6.f3243
            char[] r2 = r6.f3241
            r3 = r0
        L7:
            if (r3 >= r1) goto L23
            char r4 = r2[r3]
            if (r4 == 0) goto L23
            r5 = 34
            if (r4 == r5) goto L1d
            r5 = 38
            if (r4 == r5) goto L23
            r5 = 39
            if (r4 == r5) goto L1a
            goto L20
        L1a:
            if (r7 == 0) goto L20
            goto L23
        L1d:
            if (r7 != 0) goto L20
            goto L23
        L20:
            int r3 = r3 + 1
            goto L7
        L23:
            r6.f3245 = r3
            if (r3 <= r0) goto L31
            char[] r7 = r6.f3241
            java.lang.String[] r1 = r6.f3248
            int r3 = r3 - r0
            java.lang.String r7 = m5782(r7, r1, r0, r3)
            goto L33
        L31:
            java.lang.String r7 = ""
        L33:
            return r7
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.lang.String m5791() {
            r6 = this;
            int r0 = r6.f3245
            int r1 = r6.f3243
            char[] r2 = r6.f3241
            r3 = r0
        L7:
            if (r3 >= r1) goto L18
            char r4 = r2[r3]
            if (r4 == 0) goto L18
            r5 = 38
            if (r4 == r5) goto L18
            r5 = 60
            if (r4 == r5) goto L18
            int r3 = r3 + 1
            goto L7
        L18:
            r6.f3245 = r3
            if (r3 <= r0) goto L26
            char[] r1 = r6.f3241
            java.lang.String[] r2 = r6.f3248
            int r3 = r3 - r0
            java.lang.String r0 = m5782(r1, r2, r0, r3)
            goto L28
        L26:
            java.lang.String r0 = ""
        L28:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public java.lang.String m5792() {
            r4 = this;
            r4.m5785()
            int r0 = r4.f3245
        L5:
            int r1 = r4.f3245
            int r2 = r4.f3243
            if (r1 >= r2) goto L1c
            char[] r2 = r4.f3241
            char r2 = r2[r1]
            r3 = 48
            if (r2 < r3) goto L1c
            r3 = 57
            if (r2 > r3) goto L1c
            int r1 = r1 + 1
            r4.f3245 = r1
            goto L5
        L1c:
            char[] r2 = r4.f3241
            java.lang.String[] r3 = r4.f3248
            int r1 = r1 - r0
            java.lang.String r0 = m5782(r2, r3, r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.lang.String m5793() {
            r4 = this;
            r4.m5785()
            int r0 = r4.f3245
        L5:
            int r1 = r4.f3245
            int r2 = r4.f3243
            if (r1 >= r2) goto L2c
            char[] r2 = r4.f3241
            char r2 = r2[r1]
            r3 = 48
            if (r2 < r3) goto L17
            r3 = 57
            if (r2 <= r3) goto L27
        L17:
            r3 = 65
            if (r2 < r3) goto L1f
            r3 = 70
            if (r2 <= r3) goto L27
        L1f:
            r3 = 97
            if (r2 < r3) goto L2c
            r3 = 102(0x66, float:1.43E-43)
            if (r2 > r3) goto L2c
        L27:
            int r1 = r1 + 1
            r4.f3245 = r1
            goto L5
        L2c:
            char[] r2 = r4.f3241
            java.lang.String[] r3 = r4.f3248
            int r1 = r1 - r0
            java.lang.String r0 = m5782(r2, r3, r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.lang.String m5794() {
            r4 = this;
            r4.m5785()
            int r0 = r4.f3245
        L5:
            int r1 = r4.f3245
            int r2 = r4.f3243
            if (r1 >= r2) goto L2c
            char[] r2 = r4.f3241
            char r1 = r2[r1]
            r2 = 65
            if (r1 < r2) goto L17
            r2 = 90
            if (r1 <= r2) goto L25
        L17:
            r2 = 97
            if (r1 < r2) goto L1f
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 <= r2) goto L25
        L1f:
            boolean r1 = java.lang.Character.isLetter(r1)
            if (r1 == 0) goto L2c
        L25:
            int r1 = r4.f3245
            int r1 = r1 + 1
            r4.f3245 = r1
            goto L5
        L2c:
            char[] r1 = r4.f3241
            java.lang.String[] r2 = r4.f3248
            int r3 = r4.f3245
            int r3 = r3 - r0
            java.lang.String r0 = m5782(r1, r2, r0, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.lang.String m5795() {
            r4 = this;
            r4.m5785()
            int r0 = r4.f3245
        L5:
            int r1 = r4.f3245
            int r2 = r4.f3243
            if (r1 >= r2) goto L2c
            char[] r2 = r4.f3241
            char r1 = r2[r1]
            r2 = 65
            if (r1 < r2) goto L17
            r2 = 90
            if (r1 <= r2) goto L25
        L17:
            r2 = 97
            if (r1 < r2) goto L1f
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 <= r2) goto L25
        L1f:
            boolean r1 = java.lang.Character.isLetter(r1)
            if (r1 == 0) goto L2c
        L25:
            int r1 = r4.f3245
            int r1 = r1 + 1
            r4.f3245 = r1
            goto L5
        L2c:
            boolean r1 = r4.m5806()
            if (r1 != 0) goto L45
            char[] r1 = r4.f3241
            int r2 = r4.f3245
            char r1 = r1[r2]
            r3 = 48
            if (r1 < r3) goto L45
            r3 = 57
            if (r1 > r3) goto L45
            int r2 = r2 + 1
            r4.f3245 = r2
            goto L2c
        L45:
            char[] r1 = r4.f3241
            java.lang.String[] r2 = r4.f3248
            int r3 = r4.f3245
            int r3 = r3 - r0
            java.lang.String r0 = m5782(r1, r2, r0, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public java.lang.String m5796() {
            r6 = this;
            int r0 = r6.f3245
            int r1 = r6.f3243
            char[] r2 = r6.f3241
            r3 = r0
        L7:
            if (r3 >= r1) goto L14
            char r4 = r2[r3]
            if (r4 == 0) goto L14
            r5 = 60
            if (r4 == r5) goto L14
            int r3 = r3 + 1
            goto L7
        L14:
            r6.f3245 = r3
            if (r3 <= r0) goto L22
            char[] r1 = r6.f3241
            java.lang.String[] r2 = r6.f3248
            int r3 = r3 - r0
            java.lang.String r0 = m5782(r1, r2, r0, r3)
            goto L24
        L22:
            java.lang.String r0 = ""
        L24:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public java.lang.String m5797() {
            r6 = this;
            r6.m5785()
            int r0 = r6.f3245
            int r1 = r6.f3243
            char[] r2 = r6.f3241
            r3 = r0
        La:
            if (r3 >= r1) goto L31
            char r4 = r2[r3]
            r5 = 9
            if (r4 == r5) goto L31
            r5 = 10
            if (r4 == r5) goto L31
            r5 = 12
            if (r4 == r5) goto L31
            r5 = 13
            if (r4 == r5) goto L31
            r5 = 32
            if (r4 == r5) goto L31
            r5 = 47
            if (r4 == r5) goto L31
            r5 = 60
            if (r4 == r5) goto L31
            r5 = 62
            if (r4 == r5) goto L31
            int r3 = r3 + 1
            goto La
        L31:
            r6.f3245 = r3
            if (r3 <= r0) goto L3f
            char[] r1 = r6.f3241
            java.lang.String[] r2 = r6.f3248
            int r3 = r3 - r0
            java.lang.String r0 = m5782(r1, r2, r0, r3)
            goto L41
        L3f:
            java.lang.String r0 = ""
        L41:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.lang.String m5798(char r4) {
            r3 = this;
            int r4 = r3.m5822(r4)
            r0 = -1
            if (r4 == r0) goto L17
            char[] r0 = r3.f3241
            java.lang.String[] r1 = r3.f3248
            int r2 = r3.f3245
            java.lang.String r0 = m5782(r0, r1, r2, r4)
            int r1 = r3.f3245
            int r1 = r1 + r4
            r3.f3245 = r1
            return r0
        L17:
            java.lang.String r4 = r3.m5802()
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public java.lang.String m5799(java.lang.String r5) {
            r4 = this;
            int r0 = r4.m5823(r5)
            r1 = -1
            if (r0 == r1) goto L17
            char[] r5 = r4.f3241
            java.lang.String[] r1 = r4.f3248
            int r2 = r4.f3245
            java.lang.String r5 = m5782(r5, r1, r2, r0)
            int r1 = r4.f3245
            int r1 = r1 + r0
            r4.f3245 = r1
            return r5
        L17:
            int r0 = r4.f3243
            int r1 = r4.f3245
            int r0 = r0 - r1
            int r1 = r5.length()
            if (r0 >= r1) goto L27
            java.lang.String r5 = r4.m5802()
            return r5
        L27:
            int r0 = r4.f3243
            int r5 = r5.length()
            int r0 = r0 - r5
            int r0 = r0 + 1
            char[] r5 = r4.f3241
            java.lang.String[] r1 = r4.f3248
            int r2 = r4.f3245
            int r3 = r0 - r2
            java.lang.String r5 = m5782(r5, r1, r2, r3)
            r4.f3245 = r0
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public java.lang.String m5800(char... r9) {
            r8 = this;
            r8.m5785()
            int r0 = r8.f3245
            int r1 = r8.f3243
            char[] r2 = r8.f3241
            int r3 = r9.length
            r4 = r0
        Lb:
            if (r4 >= r1) goto L1d
            r5 = 0
        Le:
            if (r5 >= r3) goto L1a
            char r6 = r2[r4]
            char r7 = r9[r5]
            if (r6 != r7) goto L17
            goto L1d
        L17:
            int r5 = r5 + 1
            goto Le
        L1a:
            int r4 = r4 + 1
            goto Lb
        L1d:
            r8.f3245 = r4
            if (r4 <= r0) goto L2b
            char[] r9 = r8.f3241
            java.lang.String[] r1 = r8.f3248
            int r4 = r4 - r0
            java.lang.String r9 = m5782(r9, r1, r0, r4)
            goto L2d
        L2b:
            java.lang.String r9 = ""
        L2d:
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public java.lang.String m5801(char... r6) {
            r5 = this;
            r5.m5785()
            int r0 = r5.f3245
            int r1 = r5.f3243
            char[] r2 = r5.f3241
            r3 = r0
        La:
            if (r3 >= r1) goto L18
            char r4 = r2[r3]
            int r4 = java.util.Arrays.binarySearch(r6, r4)
            if (r4 < 0) goto L15
            goto L18
        L15:
            int r3 = r3 + 1
            goto La
        L18:
            r5.f3245 = r3
            if (r3 <= r0) goto L26
            char[] r6 = r5.f3241
            java.lang.String[] r1 = r5.f3248
            int r3 = r3 - r0
            java.lang.String r6 = m5782(r6, r1, r0, r3)
            goto L28
        L26:
            java.lang.String r6 = ""
        L28:
            return r6
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.String m5802() {
            r4 = this;
            r4.m5785()
            char[] r0 = r4.f3241
            java.lang.String[] r1 = r4.f3248
            int r2 = r4.f3245
            int r3 = r4.f3243
            int r3 = r3 - r2
            java.lang.String r0 = m5782(r0, r1, r2, r3)
            int r1 = r4.f3243
            r4.f3245 = r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m5803(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = r5.f3252
            boolean r0 = r6.equals(r0)
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 == 0) goto L15
            int r0 = r5.f3253
            if (r0 != r3) goto L10
            return r1
        L10:
            int r4 = r5.f3245
            if (r0 < r4) goto L15
            return r2
        L15:
            r5.f3252 = r6
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r4 = r6.toLowerCase(r0)
            int r4 = r5.m5823(r4)
            if (r4 <= r3) goto L29
            int r6 = r5.f3245
            int r6 = r6 + r4
            r5.f3253 = r6
            return r2
        L29:
            java.lang.String r6 = r6.toUpperCase(r0)
            int r6 = r5.m5823(r6)
            if (r6 <= r3) goto L34
            r1 = r2
        L34:
            if (r1 == 0) goto L3a
            int r0 = r5.f3245
            int r3 = r0 + r6
        L3a:
            r5.f3253 = r3
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public char m5804() {
            r2 = this;
            r2.m5785()
            boolean r0 = r2.m5806()
            if (r0 == 0) goto Ld
            r0 = 65535(0xffff, float:9.1834E-41)
            goto L13
        Ld:
            char[] r0 = r2.f3241
            int r1 = r2.f3245
            char r0 = r0[r1]
        L13:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m5805() {
            r2 = this;
            r2.m5785()
            int r0 = r2.f3245
            int r1 = r2.f3243
            if (r0 < r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean m5806() {
            r2 = this;
            int r0 = r2.f3245
            int r1 = r2.f3243
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean m5807() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.f3249
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int m5808(int r2) {
            r1 = this;
            boolean r0 = r1.m5807()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.ArrayList<java.lang.Integer> r0 = r1.f3249
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = java.util.Collections.binarySearch(r0, r2)
            r0 = -1
            if (r2 >= r0) goto L1b
            int r2 = java.lang.Math.abs(r2)
            int r2 = r2 + (-2)
        L1b:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int m5809() {
            r1 = this;
            int r0 = r1.m5824()
            int r0 = r1.m5810(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int m5810(int r3) {
            r2 = this;
            boolean r0 = r2.m5807()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r3 = r2.m5808(r3)
            r0 = -1
            if (r3 != r0) goto L12
            int r3 = r2.f3250
            return r3
        L12:
            int r0 = r2.f3250
            int r3 = r3 + r0
            int r3 = r3 + r1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m5811() {
            r2 = this;
            int r0 = r2.f3243
            int r1 = r2.f3245
            int r0 = r0 - r1
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 >= r1) goto Lc
            r0 = 0
            r2.f3244 = r0
        Lc:
            r2.m5785()
            int r0 = r2.f3245
            r2.f3247 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean m5812(java.lang.String r2) {
            r1 = this;
            r1.m5785()
            boolean r0 = r1.m5815(r2)
            if (r0 == 0) goto L14
            int r0 = r1.f3245
            int r2 = r2.length()
            int r0 = r0 + r2
            r1.f3245 = r0
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m5813(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.m5820(r2)
            if (r0 == 0) goto L11
            int r0 = r1.f3245
            int r2 = r2.length()
            int r0 = r0 + r2
            r1.f3245 = r0
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean m5814(char r3) {
            r2 = this;
            boolean r0 = r2.m5805()
            if (r0 != 0) goto L10
            char[] r0 = r2.f3241
            int r1 = r2.f3245
            char r0 = r0[r1]
            if (r0 != r3) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean m5815(java.lang.String r7) {
            r6 = this;
            r6.m5785()
            int r0 = r7.length()
            int r1 = r6.f3243
            int r2 = r6.f3245
            int r1 = r1 - r2
            r2 = 0
            if (r0 <= r1) goto L10
            return r2
        L10:
            r1 = r2
        L11:
            if (r1 >= r0) goto L24
            char r3 = r7.charAt(r1)
            char[] r4 = r6.f3241
            int r5 = r6.f3245
            int r5 = r5 + r1
            char r4 = r4[r5]
            if (r3 == r4) goto L21
            return r2
        L21:
            int r1 = r1 + 1
            goto L11
        L24:
            r7 = 1
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean m5816(char... r6) {
            r5 = this;
            boolean r0 = r5.m5805()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r5.m5785()
            char[] r0 = r5.f3241
            int r2 = r5.f3245
            char r0 = r0[r2]
            int r2 = r6.length
            r3 = r1
        L13:
            if (r3 >= r2) goto L1e
            char r4 = r6[r3]
            if (r4 != r0) goto L1b
            r6 = 1
            return r6
        L1b:
            int r3 = r3 + 1
            goto L13
        L1e:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean m5817(char[] r3) {
            r2 = this;
            r2.m5785()
            boolean r0 = r2.m5805()
            if (r0 != 0) goto L17
            char[] r0 = r2.f3241
            int r1 = r2.f3245
            char r0 = r0[r1]
            int r3 = java.util.Arrays.binarySearch(r3, r0)
            if (r3 < 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean m5818() {
            r3 = this;
            boolean r0 = r3.m5805()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            char[] r0 = r3.f3241
            int r2 = r3.f3245
            char r0 = r0[r2]
            r2 = 65
            if (r0 < r2) goto L16
            r2 = 90
            if (r0 <= r2) goto L1e
        L16:
            r2 = 97
            if (r0 < r2) goto L1f
            r2 = 122(0x7a, float:1.71E-43)
            if (r0 > r2) goto L1f
        L1e:
            r1 = 1
        L1f:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean m5819() {
            r3 = this;
            boolean r0 = r3.m5805()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            char[] r0 = r3.f3241
            int r2 = r3.f3245
            char r0 = r0[r2]
            r2 = 48
            if (r0 < r2) goto L17
            r2 = 57
            if (r0 > r2) goto L17
            r1 = 1
        L17:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean m5820(java.lang.String r7) {
            r6 = this;
            r6.m5785()
            int r0 = r7.length()
            int r1 = r6.f3243
            int r2 = r6.f3245
            int r1 = r1 - r2
            r2 = 0
            if (r0 <= r1) goto L10
            return r2
        L10:
            r1 = r2
        L11:
            if (r1 >= r0) goto L2c
            char r3 = r7.charAt(r1)
            char r3 = java.lang.Character.toUpperCase(r3)
            char[] r4 = r6.f3241
            int r5 = r6.f3245
            int r5 = r5 + r1
            char r4 = r4[r5]
            char r4 = java.lang.Character.toUpperCase(r4)
            if (r3 == r4) goto L29
            return r2
        L29:
            int r1 = r1 + 1
            goto L11
        L2c:
            r7 = 1
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean m5821() {
            r3 = this;
            boolean r0 = r3.m5805()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            char[] r0 = r3.f3241
            int r2 = r3.f3245
            char r0 = r0[r2]
            r2 = 65
            if (r0 < r2) goto L16
            r2 = 90
            if (r0 <= r2) goto L24
        L16:
            r2 = 97
            if (r0 < r2) goto L1e
            r2 = 122(0x7a, float:1.71E-43)
            if (r0 <= r2) goto L24
        L1e:
            boolean r0 = java.lang.Character.isLetter(r0)
            if (r0 == 0) goto L25
        L24:
            r1 = 1
        L25:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int m5822(char r3) {
            r2 = this;
            r2.m5785()
            int r0 = r2.f3245
        L5:
            int r1 = r2.f3243
            if (r0 >= r1) goto L16
            char[] r1 = r2.f3241
            char r1 = r1[r0]
            if (r3 != r1) goto L13
            int r3 = r2.f3245
            int r0 = r0 - r3
            return r0
        L13:
            int r0 = r0 + 1
            goto L5
        L16:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int m5823(java.lang.CharSequence r9) {
            r8 = this;
            r8.m5785()
            r0 = 0
            char r0 = r9.charAt(r0)
            int r1 = r8.f3245
        La:
            int r2 = r8.f3243
            if (r1 >= r2) goto L49
            char[] r2 = r8.f3241
            char r2 = r2[r1]
            r3 = 1
            if (r0 == r2) goto L21
        L15:
            int r1 = r1 + r3
            int r2 = r8.f3243
            if (r1 >= r2) goto L21
            char[] r2 = r8.f3241
            char r2 = r2[r1]
            if (r0 == r2) goto L21
            goto L15
        L21:
            int r2 = r1 + 1
            int r4 = r9.length()
            int r4 = r4 + r2
            int r4 = r4 - r3
            int r5 = r8.f3243
            if (r1 >= r5) goto L47
            if (r4 > r5) goto L47
            r5 = r2
        L30:
            if (r5 >= r4) goto L41
            char r6 = r9.charAt(r3)
            char[] r7 = r8.f3241
            char r7 = r7[r5]
            if (r6 != r7) goto L41
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L30
        L41:
            if (r5 != r4) goto L47
            int r9 = r8.f3245
            int r1 = r1 - r9
            return r1
        L47:
            r1 = r2
            goto La
        L49:
            r9 = -1
            return r9
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int m5824() {
            r2 = this;
            int r0 = r2.f3246
            int r1 = r2.f3245
            int r0 = r0 + r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public java.lang.String m5825() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.m5809()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r1 = r2.m5787()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public boolean m5826(int r2, int r3, java.lang.String r4) {
            r1 = this;
            char[] r0 = r1.f3241
            boolean r2 = m5783(r0, r2, r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public boolean m5827() {
            r1 = this;
            boolean r0 = r1.f3251
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m5828() {
            r3 = this;
            int r0 = r3.f3247
            r1 = -1
            if (r0 == r1) goto Lb
            r3.f3245 = r0
            r3.m5832()
            return
        Lb:
            Yue.ۥۣۢ۟ۦ r0 = new Yue.ۥۣۢ۟ۦ
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Mark invalid"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final void m5829() {
            r3 = this;
            boolean r0 = r3.m5807()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.ArrayList<java.lang.Integer> r0 = r3.f3249
            int r0 = r0.size()
            if (r0 <= 0) goto L33
            int r0 = r3.f3246
            int r0 = r3.m5808(r0)
            r1 = -1
            if (r0 != r1) goto L19
            r0 = 0
        L19:
            java.util.ArrayList<java.lang.Integer> r1 = r3.f3249
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
            int r2 = r3.f3250
            int r2 = r2 + r0
            r3.f3250 = r2
            java.util.ArrayList<java.lang.Integer> r0 = r3.f3249
            r0.clear()
            java.util.ArrayList<java.lang.Integer> r0 = r3.f3249
            r0.add(r1)
        L33:
            int r0 = r3.f3245
        L35:
            int r1 = r3.f3243
            if (r0 >= r1) goto L52
            char[] r1 = r3.f3241
            char r1 = r1[r0]
            r2 = 10
            if (r1 != r2) goto L4f
            java.util.ArrayList<java.lang.Integer> r1 = r3.f3249
            int r2 = r3.f3246
            int r2 = r2 + 1
            int r2 = r2 + r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
        L4f:
            int r0 = r0 + 1
            goto L35
        L52:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m5830(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.util.ArrayList<java.lang.Integer> r0 = r1.f3249
            if (r0 != 0) goto L13
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 409(0x199, float:5.73E-43)
            r2.<init>(r0)
            r1.f3249 = r2
            r1.m5829()
            goto L18
        L13:
            if (r2 != 0) goto L18
            r2 = 0
            r1.f3249 = r2
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m5831() {
            r3 = this;
            int r0 = r3.f3245
            r1 = 1
            if (r0 < r1) goto L9
            int r0 = r0 - r1
            r3.f3245 = r0
            return
        L9:
            Yue.ۥۣۢ۟ۦ r0 = new Yue.ۥۣۢ۟ۦ
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "WTF: No buffer left to unconsume."
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m5832() {
            r1 = this;
            r0 = -1
            r1.f3247 = r0
            return
    }
}
