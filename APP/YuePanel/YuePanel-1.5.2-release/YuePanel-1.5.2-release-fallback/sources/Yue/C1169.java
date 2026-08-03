package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1169 extends Yue.AbstractC1617 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f3633 = 1000;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f3634 = 1001;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f3635 = 1002;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f3636 = 1003;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f3637 = 1005;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f3638 = 1006;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f3639 = 1007;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f3640 = 1008;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f3641 = 1009;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f3642 = 1010;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f3643 = 1011;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f3644 = 1012;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f3645 = 1013;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f3646 = 1014;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f3647 = 1015;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f3648 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f3649 = -2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f3650 = -3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f3651;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.lang.String f3652;

    public C1169() {
            r1 = this;
            Yue.ۥۣۣۡۢ r0 = Yue.EnumC4633.f14780
            r1.<init>(r0)
            java.lang.String r0 = ""
            r1.m6108(r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.m6107(r0)
            return
    }

    @Override // Yue.AbstractC2814
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L32
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L32
        L12:
            boolean r2 = super.equals(r5)
            if (r2 != 0) goto L19
            return r1
        L19:
            Yue.ۥ۟ۤۨۥ r5 = (Yue.C1169) r5
            int r2 = r4.f3651
            int r3 = r5.f3651
            if (r2 == r3) goto L22
            return r1
        L22:
            java.lang.String r2 = r4.f3652
            java.lang.String r5 = r5.f3652
            if (r2 == 0) goto L2d
            boolean r0 = r2.equals(r5)
            goto L31
        L2d:
            if (r5 != 0) goto L30
            goto L31
        L30:
            r0 = r1
        L31:
            return r0
        L32:
            return r1
    }

    @Override // Yue.AbstractC2814
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f3651
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f3652
            if (r1 == 0) goto L14
            int r1 = r1.hashCode()
            goto L15
        L14:
            r1 = 0
        L15:
            int r0 = r0 + r1
            return r0
    }

    @Override // Yue.AbstractC2814
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "code: "
            r0.append(r1)
            int r1 = r2.f3651
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC2814, Yue.InterfaceC2813
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.nio.ByteBuffer mo6102() {
            r2 = this;
            int r0 = r2.f3651
            r1 = 1005(0x3ed, float:1.408E-42)
            if (r0 != r1) goto Lb
            java.nio.ByteBuffer r0 = Yue.C0873.m5005()
            return r0
        Lb:
            java.nio.ByteBuffer r0 = super.mo6102()
            return r0
    }

    @Override // Yue.AbstractC1617, Yue.AbstractC2814
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo6103() throws Yue.C3342 {
            r5 = this;
            super.mo6103()
            int r0 = r5.f3651
            r1 = 1007(0x3ef, float:1.411E-42)
            if (r0 != r1) goto L1a
            java.lang.String r0 = r5.f3652
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            goto L1a
        L12:
            Yue.ۥ۠ۥۧۤ r0 = new Yue.ۥ۠ۥۧۤ
            java.lang.String r2 = "Received text is no valid utf8 string!"
            r0.<init>(r1, r2)
            throw r0
        L1a:
            int r0 = r5.f3651
            r1 = 1002(0x3ea, float:1.404E-42)
            r2 = 1005(0x3ed, float:1.408E-42)
            if (r0 != r2) goto L33
            java.lang.String r0 = r5.f3652
            int r0 = r0.length()
            if (r0 > 0) goto L2b
            goto L33
        L2b:
            Yue.ۥ۠ۥۧۤ r0 = new Yue.ۥ۠ۥۧۤ
            java.lang.String r2 = "A close frame must have a closecode if it has a reason"
            r0.<init>(r1, r2)
            throw r0
        L33:
            int r0 = r5.f3651
            r3 = 1015(0x3f7, float:1.422E-42)
            if (r0 <= r3) goto L46
            r4 = 3000(0xbb8, float:4.204E-42)
            if (r0 < r4) goto L3e
            goto L46
        L3e:
            Yue.ۥ۠ۥۧۤ r0 = new Yue.ۥ۠ۥۧۤ
            java.lang.String r2 = "Trying to send an illegal close code!"
            r0.<init>(r1, r2)
            throw r0
        L46:
            r1 = 1006(0x3ee, float:1.41E-42)
            if (r0 == r1) goto L5b
            if (r0 == r3) goto L5b
            if (r0 == r2) goto L5b
            r1 = 4999(0x1387, float:7.005E-42)
            if (r0 > r1) goto L5b
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto L5b
            r1 = 1004(0x3ec, float:1.407E-42)
            if (r0 == r1) goto L5b
            return
        L5b:
            Yue.ۥ۠ۥۧۦ r0 = new Yue.ۥ۠ۥۧۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "closecode must not be sent over the wire: "
            r1.append(r2)
            int r2 = r5.f3651
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.AbstractC2814
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void mo6104(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 1005(0x3ed, float:1.408E-42)
            r2.f3651 = r0
            java.lang.String r0 = ""
            r2.f3652 = r0
            r3.mark()
            int r0 = r3.remaining()
            if (r0 != 0) goto L16
            r3 = 1000(0x3e8, float:1.401E-42)
            r2.f3651 = r3
            goto L54
        L16:
            int r0 = r3.remaining()
            r1 = 1
            if (r0 != r1) goto L22
            r3 = 1002(0x3ea, float:1.404E-42)
            r2.f3651 = r3
            goto L54
        L22:
            int r0 = r3.remaining()
            r1 = 2
            if (r0 < r1) goto L42
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r0.position(r1)
            short r1 = r3.getShort()
            r0.putShort(r1)
            r1 = 0
            r0.position(r1)
            int r0 = r0.getInt()
            r2.f3651 = r0
        L42:
            r3.reset()
            int r0 = r3.position()     // Catch: Yue.C3342 -> L4d
            r2.m6110(r3, r0)     // Catch: Yue.C3342 -> L4d
            goto L54
        L4d:
            r3 = 1007(0x3ef, float:1.411E-42)
            r2.f3651 = r3
            r3 = 0
            r2.f3652 = r3
        L54:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m6105() {
            r1 = this;
            int r0 = r1.f3651
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public java.lang.String m6106() {
            r1 = this;
            java.lang.String r0 = r1.f3652
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m6107(int r2) {
            r1 = this;
            r1.f3651 = r2
            r0 = 1015(0x3f7, float:1.422E-42)
            if (r2 != r0) goto Le
            r2 = 1005(0x3ed, float:1.408E-42)
            r1.f3651 = r2
            java.lang.String r2 = ""
            r1.f3652 = r2
        Le:
            r1.m6109()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m6108(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.f3652 = r1
            r0.m6109()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m6109() {
            r4 = this;
            java.lang.String r0 = r4.f3652
            byte[] r0 = Yue.C1098.m5889(r0)
            r1 = 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            int r2 = r4.f3651
            r1.putInt(r2)
            r2 = 2
            r1.position(r2)
            int r3 = r0.length
            int r3 = r3 + r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)
            r2.put(r1)
            r2.put(r0)
            r2.rewind()
            super.mo6104(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m6110(java.nio.ByteBuffer r3, int r4) throws Yue.C3342 {
            r2 = this;
            int r0 = r3.position()     // Catch: java.lang.Throwable -> L13 java.lang.IllegalArgumentException -> L15
            int r0 = r0 + 2
            r3.position(r0)     // Catch: java.lang.Throwable -> L13 java.lang.IllegalArgumentException -> L15
            java.lang.String r0 = Yue.C1098.m5887(r3)     // Catch: java.lang.Throwable -> L13 java.lang.IllegalArgumentException -> L15
            r2.f3652 = r0     // Catch: java.lang.Throwable -> L13 java.lang.IllegalArgumentException -> L15
            r3.position(r4)
            return
        L13:
            r0 = move-exception
            goto L1d
        L15:
            Yue.ۥ۠ۥۧۤ r0 = new Yue.ۥ۠ۥۧۤ     // Catch: java.lang.Throwable -> L13
            r1 = 1007(0x3ef, float:1.411E-42)
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            throw r0     // Catch: java.lang.Throwable -> L13
        L1d:
            r3.position(r4)
            throw r0
    }
}
