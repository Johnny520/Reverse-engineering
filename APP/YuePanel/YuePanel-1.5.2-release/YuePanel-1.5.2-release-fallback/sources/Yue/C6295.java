package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6295 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final char f22395 = '\\';

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String[] f22396 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String[] f22397 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String f22398;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f22399;

    static {
            java.lang.String r0 = "*|"
            java.lang.String r1 = "|"
            java.lang.String r2 = "_"
            java.lang.String r3 = "-"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            Yue.C6295.f22396 = r0
            java.lang.String[] r0 = new java.lang.String[]{r3, r2}
            Yue.C6295.f22397 = r0
            return
    }

    public C6295(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f22399 = r0
            Yue.C6657.m25635(r2)
            r1.f22398 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static java.lang.String m23455(java.lang.String r2) {
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            Yue.ۥۢۡۧۢ r1 = new Yue.ۥۢۡۧۢ
            r1.<init>(r2)
        L9:
            boolean r2 = r1.m23472()
            if (r2 != 0) goto L2c
            java.lang.String[] r2 = Yue.C6295.f22396
            boolean r2 = r1.m23477(r2)
            if (r2 == 0) goto L1f
            char r2 = r1.m23462()
            r0.append(r2)
            goto L9
        L1f:
            r2 = 92
            r0.append(r2)
            char r2 = r1.m23462()
            r0.append(r2)
            goto L9
        L2c:
            java.lang.String r2 = Yue.C5973.m22128(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static java.lang.String m23456(java.lang.String r7) {
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            char[] r7 = r7.toCharArray()
            int r1 = r7.length
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            if (r3 >= r1) goto L22
            char r5 = r7[r3]
            r6 = 92
            if (r5 != r6) goto L1b
            if (r4 != r6) goto L1e
            r0.append(r5)
            r4 = r2
            goto L1f
        L1b:
            r0.append(r5)
        L1e:
            r4 = r5
        L1f:
            int r3 = r3 + 1
            goto Lc
        L22:
            java.lang.String r7 = Yue.C5973.m22128(r0)
            return r7
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.f22398
            int r1 = r2.f22399
            java.lang.String r0 = r0.substring(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m23457(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r2.f22398
            int r1 = r2.f22399
            java.lang.String r3 = r3.substring(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.f22398 = r3
            r3 = 0
            r2.f22399 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m23458() {
            r1 = this;
            boolean r0 = r1.m23472()
            if (r0 != 0) goto Lc
            int r0 = r1.f22399
            int r0 = r0 + 1
            r1.f22399 = r0
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m23459(char r12, char r13) {
            r11 = this;
            r0 = -1
            r1 = 0
            r5 = r0
            r6 = r5
            r2 = r1
            r3 = r2
            r4 = r3
            r7 = r4
            r8 = r7
        L9:
            boolean r9 = r11.m23472()
            if (r9 == 0) goto L10
            goto L55
        L10:
            char r9 = r11.m23462()
            r10 = 92
            if (r2 == r10) goto L42
            r10 = 39
            if (r9 != r10) goto L23
            if (r9 == r12) goto L23
            if (r3 != 0) goto L23
            r4 = r4 ^ 1
            goto L2d
        L23:
            r10 = 34
            if (r9 != r10) goto L2d
            if (r9 == r12) goto L2d
            if (r4 != 0) goto L2d
            r3 = r3 ^ 1
        L2d:
            if (r4 != 0) goto L53
            if (r3 != 0) goto L53
            if (r8 == 0) goto L34
            goto L53
        L34:
            if (r9 != r12) goto L3d
            int r7 = r7 + 1
            if (r5 != r0) goto L4d
            int r5 = r11.f22399
            goto L4d
        L3d:
            if (r9 != r13) goto L4d
            int r7 = r7 + (-1)
            goto L4d
        L42:
            r10 = 81
            if (r9 != r10) goto L48
            r8 = 1
            goto L4d
        L48:
            r10 = 69
            if (r9 != r10) goto L4d
            r8 = r1
        L4d:
            if (r7 <= 0) goto L53
            if (r2 == 0) goto L53
            int r6 = r11.f22399
        L53:
            if (r7 > 0) goto L7c
        L55:
            if (r6 < 0) goto L5e
            java.lang.String r12 = r11.f22398
            java.lang.String r12 = r12.substring(r5, r6)
            goto L60
        L5e:
            java.lang.String r12 = ""
        L60:
            if (r7 <= 0) goto L7b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Did not find balanced marker at '"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = "'"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            Yue.C6657.m25624(r13)
        L7b:
            return r12
        L7c:
            r2 = r9
            goto L9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m23460(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.m23467(r2)
            r1.m23473(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String m23461(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.m23469(r2)
            r1.m23473(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public char m23462() {
            r3 = this;
            java.lang.String r0 = r3.f22398
            int r1 = r3.f22399
            int r2 = r1 + 1
            r3.f22399 = r2
            char r0 = r0.charAt(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m23463(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.m23474(r2)
            if (r0 == 0) goto L1e
            int r2 = r2.length()
            int r0 = r1.m23481()
            if (r2 > r0) goto L16
            int r0 = r1.f22399
            int r0 = r0 + r2
            r1.f22399 = r0
            return
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Queue not long enough to consume sequence"
            r2.<init>(r0)
            throw r2
        L1e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Queue did not match expected sequence"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.String m23464() {
            r1 = this;
            java.lang.String[] r0 = Yue.C6295.f22397
            java.lang.String r0 = r1.m23466(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.lang.String m23465() {
            r1 = this;
            java.lang.String[] r0 = Yue.C6295.f22396
            java.lang.String r0 = r1.m23466(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.lang.String m23466(java.lang.String... r6) {
            r5 = this;
            int r0 = r5.f22399
            r1 = 0
        L3:
            boolean r2 = r5.m23472()
            if (r2 != 0) goto L30
            java.lang.String r2 = r5.f22398
            int r3 = r5.f22399
            char r2 = r2.charAt(r3)
            r3 = 92
            r4 = 1
            if (r2 != r3) goto L24
            int r2 = r5.m23481()
            if (r2 <= r4) goto L24
            int r1 = r5.f22399
            int r1 = r1 + 2
            r5.f22399 = r1
            r1 = r4
            goto L3
        L24:
            boolean r2 = r5.m23477(r6)
            if (r2 == 0) goto L30
            int r2 = r5.f22399
            int r2 = r2 + r4
            r5.f22399 = r2
            goto L3
        L30:
            java.lang.String r6 = r5.f22398
            int r2 = r5.f22399
            java.lang.String r6 = r6.substring(r0, r2)
            if (r1 == 0) goto L3e
            java.lang.String r6 = m23456(r6)
        L3e:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.lang.String m23467(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.f22398
            int r1 = r2.f22399
            int r3 = r0.indexOf(r3, r1)
            r0 = -1
            if (r3 == r0) goto L1d
            java.lang.String r0 = r2.f22398
            int r1 = r2.f22399
            java.lang.String r3 = r0.substring(r1, r3)
            int r0 = r2.f22399
            int r1 = r3.length()
            int r0 = r0 + r1
            r2.f22399 = r0
            return r3
        L1d:
            java.lang.String r3 = r2.m23480()
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.lang.String m23468(java.lang.String... r3) {
            r2 = this;
            int r0 = r2.f22399
        L2:
            boolean r1 = r2.m23472()
            if (r1 != 0) goto L15
            boolean r1 = r2.m23476(r3)
            if (r1 != 0) goto L15
            int r1 = r2.f22399
            int r1 = r1 + 1
            r2.f22399 = r1
            goto L2
        L15:
            java.lang.String r3 = r2.f22398
            int r1 = r2.f22399
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.lang.String m23469(java.lang.String r7) {
            r6 = this;
            int r0 = r6.f22399
            r1 = 0
            r2 = 1
            java.lang.String r1 = r7.substring(r1, r2)
            java.lang.String r3 = r1.toLowerCase()
            java.lang.String r4 = r1.toUpperCase()
            boolean r3 = r3.equals(r4)
        L14:
            boolean r4 = r6.m23472()
            if (r4 != 0) goto L4a
            boolean r4 = r6.m23474(r7)
            if (r4 == 0) goto L21
            goto L4a
        L21:
            if (r3 == 0) goto L44
            java.lang.String r4 = r6.f22398
            int r5 = r6.f22399
            int r4 = r4.indexOf(r1, r5)
            int r5 = r6.f22399
            int r4 = r4 - r5
            if (r4 != 0) goto L35
            int r5 = r5 + 1
            r6.f22399 = r5
            goto L14
        L35:
            if (r4 >= 0) goto L40
            java.lang.String r4 = r6.f22398
            int r4 = r4.length()
            r6.f22399 = r4
            goto L14
        L40:
            int r5 = r5 + r4
            r6.f22399 = r5
            goto L14
        L44:
            int r4 = r6.f22399
            int r4 = r4 + r2
            r6.f22399 = r4
            goto L14
        L4a:
            java.lang.String r7 = r6.f22398
            int r1 = r6.f22399
            java.lang.String r7 = r7.substring(r0, r1)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m23470() {
            r2 = this;
            r0 = 0
        L1:
            boolean r1 = r2.m23478()
            if (r1 == 0) goto Lf
            int r0 = r2.f22399
            r1 = 1
            int r0 = r0 + r1
            r2.f22399 = r0
            r0 = r1
            goto L1
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public java.lang.String m23471() {
            r3 = this;
            int r0 = r3.f22399
        L2:
            boolean r1 = r3.m23479()
            if (r1 == 0) goto Lf
            int r1 = r3.f22399
            int r1 = r1 + 1
            r3.f22399 = r1
            goto L2
        Lf:
            java.lang.String r1 = r3.f22398
            int r2 = r3.f22399
            java.lang.String r0 = r1.substring(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m23472() {
            r1 = this;
            int r0 = r1.m23481()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m23473(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.m23474(r2)
            if (r0 == 0) goto L11
            int r0 = r1.f22399
            int r2 = r2.length()
            int r0 = r0 + r2
            r1.f22399 = r0
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m23474(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = r6.f22398
            int r2 = r6.f22399
            int r5 = r7.length()
            r1 = 1
            r4 = 0
            r3 = r7
            boolean r7 = r0.regionMatches(r1, r2, r3, r4, r5)
            return r7
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean m23475(char... r7) {
            r6 = this;
            boolean r0 = r6.m23472()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r7.length
            r2 = r1
        La:
            if (r2 >= r0) goto L1d
            char r3 = r7[r2]
            java.lang.String r4 = r6.f22398
            int r5 = r6.f22399
            char r4 = r4.charAt(r5)
            if (r4 != r3) goto L1a
            r7 = 1
            return r7
        L1a:
            int r2 = r2 + 1
            goto La
        L1d:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m23476(java.lang.String... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L12
            r3 = r5[r2]
            boolean r3 = r4.m23474(r3)
            if (r3 == 0) goto Lf
            r5 = 1
            return r5
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m23477(java.lang.String... r2) {
            r1 = this;
            boolean r0 = r1.m23479()
            if (r0 != 0) goto Lf
            boolean r2 = r1.m23476(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m23478() {
            r2 = this;
            boolean r0 = r2.m23472()
            if (r0 != 0) goto L16
            java.lang.String r0 = r2.f22398
            int r1 = r2.f22399
            char r0 = r0.charAt(r1)
            boolean r0 = Yue.C5973.m22121(r0)
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m23479() {
            r2 = this;
            boolean r0 = r2.m23472()
            if (r0 != 0) goto L16
            java.lang.String r0 = r2.f22398
            int r1 = r2.f22399
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isLetterOrDigit(r0)
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.lang.String m23480() {
            r2 = this;
            java.lang.String r0 = r2.f22398
            int r1 = r2.f22399
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = r2.f22398
            int r1 = r1.length()
            r2.f22399 = r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int m23481() {
            r2 = this;
            java.lang.String r0 = r2.f22398
            int r0 = r0.length()
            int r1 = r2.f22399
            int r0 = r0 - r1
            return r0
    }
}
