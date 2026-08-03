package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2430 {

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean f8100 = false;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.nio.ByteBuffer f8101;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f8102;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f8103;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int[] f8104;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f8105;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f8106;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f8107;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f8108;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int[] f8109;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f8110;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f8111;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f8112;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Yue.C2430.AbstractC2432 f8113;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Yue.AbstractC6640 f8114;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ$ۥ, reason: contains not printable characters */
    public static class C2431 extends java.io.InputStream {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.nio.ByteBuffer f8115;

        public C2431(java.nio.ByteBuffer r1) {
                r0 = this;
                r0.<init>()
                r0.f8115 = r1
                return
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.f8115     // Catch: java.nio.BufferUnderflowException -> L9
                byte r0 = r0.get()     // Catch: java.nio.BufferUnderflowException -> L9
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
            L9:
                r0 = -1
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ$ۥ۟, reason: contains not printable characters */
    public static abstract class AbstractC2432 {
        public AbstractC2432() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public abstract java.nio.ByteBuffer mo11265(int r1);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m11266(java.nio.ByteBuffer r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C2433 extends Yue.C2430.AbstractC2432 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final Yue.C2430.C2433 f8116 = null;

        static {
                Yue.ۥ۠ۢۢ$ۥ۟۟ r0 = new Yue.ۥ۠ۢۢ$ۥ۟۟
                r0.<init>()
                Yue.C2430.C2433.f8116 = r0
                return
        }

        public C2433() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C2430.AbstractC2432
        /* JADX INFO: renamed from: ۥ */
        public java.nio.ByteBuffer mo11265(int r2) {
                r1 = this;
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
                java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r0)
                return r2
        }
    }

    static {
            return
    }

    public C2430() {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0)
            return
    }

    public C2430(int r4) {
            r3 = this;
            Yue.ۥ۠ۢۢ$ۥ۟۟ r0 = Yue.C2430.C2433.f8116
            r1 = 0
            Yue.ۥۣۢۤ۠ r2 = Yue.AbstractC6640.m25509()
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public C2430(int r3, Yue.C2430.AbstractC2432 r4) {
            r2 = this;
            r0 = 0
            Yue.ۥۣۢۤ۠ r1 = Yue.AbstractC6640.m25509()
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public C2430(int r4, Yue.C2430.AbstractC2432 r5, java.nio.ByteBuffer r6, Yue.AbstractC6640 r7) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.f8103 = r0
            r1 = 0
            r3.f8104 = r1
            r1 = 0
            r3.f8105 = r1
            r3.f8106 = r1
            r3.f8107 = r1
            r2 = 16
            int[] r2 = new int[r2]
            r3.f8109 = r2
            r3.f8110 = r1
            r3.f8111 = r1
            r3.f8112 = r1
            if (r4 > 0) goto L1f
            r4 = r0
        L1f:
            r3.f8113 = r5
            if (r6 == 0) goto L30
            r3.f8101 = r6
            r6.clear()
            java.nio.ByteBuffer r4 = r3.f8101
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4.order(r5)
            goto L36
        L30:
            java.nio.ByteBuffer r4 = r5.mo11265(r4)
            r3.f8101 = r4
        L36:
            r3.f8114 = r7
            java.nio.ByteBuffer r4 = r3.f8101
            int r4 = r4.capacity()
            r3.f8102 = r4
            return
    }

    public C2430(java.nio.ByteBuffer r2) {
            r1 = this;
            Yue.ۥ۠ۢۢ$ۥ۟۟ r0 = new Yue.ۥ۠ۢۢ$ۥ۟۟
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public C2430(java.nio.ByteBuffer r3, Yue.C2430.AbstractC2432 r4) {
            r2 = this;
            int r0 = r3.capacity()
            Yue.ۥۣۢۤ۠ r1 = Yue.AbstractC6640.m25509()
            r2.<init>(r0, r4, r3, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static java.nio.ByteBuffer m11205(java.nio.ByteBuffer r3, Yue.C2430.AbstractC2432 r4) {
            int r0 = r3.capacity()
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1 = r1 & r0
            if (r1 != 0) goto L27
            if (r0 != 0) goto Ld
            r1 = 1
            goto Lf
        Ld:
            int r1 = r0 << 1
        Lf:
            r2 = 0
            r3.position(r2)
            java.nio.ByteBuffer r4 = r4.mo11265(r1)
            java.nio.Buffer r1 = r4.clear()
            int r1 = r1.capacity()
            int r1 = r1 - r0
            r4.position(r1)
            r4.put(r3)
            return r4
        L27:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "FlatBuffers: cannot grow buffer beyond 2 gigabytes."
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static boolean m11206(Yue.C6094 r0, int r1) {
            int r0 = r0.m22865(r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m11207(int r2) {
            r1 = this;
            int r0 = r1.m11248()
            if (r2 != r0) goto L7
            return
        L7:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: struct must be serialized inline."
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m11208(int r2, boolean r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.f8112
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.m11209(r3)
            r1.m11262(r2)
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m11209(boolean r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.m11250(r0, r1)
            r2.m11251(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m11210(byte r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.m11250(r0, r1)
            r2.m11252(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m11211(int r2, byte r3, int r4) {
            r1 = this;
            boolean r0 = r1.f8112
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.m11210(r3)
            r1.m11262(r2)
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m11212(double r3) {
            r2 = this;
            r0 = 8
            r1 = 0
            r2.m11250(r0, r1)
            r2.m11253(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m11213(int r2, double r3, double r5) {
            r1 = this;
            boolean r0 = r1.f8112
            if (r0 != 0) goto L8
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto Le
        L8:
            r1.m11212(r3)
            r1.m11262(r2)
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m11214(float r3) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.m11250(r0, r1)
            r2.m11254(r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m11215(int r3, float r4, double r5) {
            r2 = this;
            boolean r0 = r2.f8112
            if (r0 != 0) goto L9
            double r0 = (double) r4
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 == 0) goto Lf
        L9:
            r2.m11214(r4)
            r2.m11262(r3)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m11216(int r3) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.m11250(r0, r1)
            r2.m11255(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m11217(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.f8112
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.m11216(r3)
            r1.m11262(r2)
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m11218(int r2, long r3, long r5) {
            r1 = this;
            boolean r0 = r1.f8112
            if (r0 != 0) goto L8
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto Le
        L8:
            r1.m11219(r3)
            r1.m11262(r2)
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m11219(long r3) {
            r2 = this;
            r0 = 8
            r1 = 0
            r2.m11250(r0, r1)
            r2.m11256(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m11220(int r3) {
            r2 = this;
            r0 = 0
            r1 = 4
            r2.m11250(r1, r0)
            int r0 = r2.m11248()
            int r0 = r0 - r3
            int r0 = r0 + r1
            r2.m11255(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m11221(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.f8112
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.m11220(r3)
            r1.m11262(r2)
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m11222(int r2, short r3, int r4) {
            r1 = this;
            boolean r0 = r1.f8112
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.m11223(r3)
            r1.m11262(r2)
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m11223(short r3) {
            r2 = this;
            r0 = 2
            r1 = 0
            r2.m11250(r0, r1)
            r2.m11257(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m11224(int r1, int r2, int r3) {
            r0 = this;
            if (r2 == r3) goto L8
            r0.m11207(r2)
            r0.m11262(r1)
        L8:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m11225() {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.f8101
            int r0 = r0.capacity()
            r3.f8102 = r0
            java.nio.ByteBuffer r0 = r3.f8101
            r0.clear()
            r0 = 1
            r3.f8103 = r0
        L10:
            int r0 = r3.f8105
            r1 = 0
            if (r0 <= 0) goto L1e
            int[] r2 = r3.f8104
            int r0 = r0 + (-1)
            r3.f8105 = r0
            r2[r0] = r1
            goto L10
        L1e:
            r3.f8105 = r1
            r3.f8106 = r1
            r3.f8107 = r1
            r3.f8108 = r1
            r3.f8110 = r1
            r3.f8111 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int m11226(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            r1 = 1
            r3.m11264(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.f8101
            int r2 = r3.f8102
            int r2 = r2 - r0
            r3.f8102 = r2
            r1.position(r2)
            java.nio.ByteBuffer r0 = r3.f8101
            r0.put(r4)
            int r4 = r3.m11237()
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m11227(byte[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 1
            r3.m11264(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.f8101
            int r2 = r3.f8102
            int r2 = r2 - r0
            r3.f8102 = r2
            r1.position(r2)
            java.nio.ByteBuffer r0 = r3.f8101
            r0.put(r4)
            int r4 = r3.m11237()
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int m11228(byte[] r3, int r4, int r5) {
            r2 = this;
            r0 = 1
            r2.m11264(r0, r5, r0)
            java.nio.ByteBuffer r0 = r2.f8101
            int r1 = r2.f8102
            int r1 = r1 - r5
            r2.f8102 = r1
            r0.position(r1)
            java.nio.ByteBuffer r0 = r2.f8101
            r0.put(r3, r4, r5)
            int r3 = r2.m11237()
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public <T extends Yue.C6094> int m11229(T r2, int[] r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f8101
            r2.m22876(r3, r0)
            int r2 = r1.m11233(r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int m11230(java.lang.CharSequence r4) {
            r3 = this;
            Yue.ۥۣۢۤ۠ r0 = r3.f8114
            int r0 = r0.mo25513(r4)
            r1 = 0
            r3.m11210(r1)
            r1 = 1
            r3.m11264(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.f8101
            int r2 = r3.f8102
            int r2 = r2 - r0
            r3.f8102 = r2
            r1.position(r2)
            Yue.ۥۣۢۤ۠ r0 = r3.f8114
            java.nio.ByteBuffer r1 = r3.f8101
            r0.mo25512(r4, r1)
            int r4 = r3.m11237()
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int m11231(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            r1 = 0
            r3.m11210(r1)
            r1 = 1
            r3.m11264(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.f8101
            int r2 = r3.f8102
            int r2 = r2 - r0
            r3.f8102 = r2
            r1.position(r2)
            java.nio.ByteBuffer r0 = r3.f8101
            r0.put(r4)
            int r4 = r3.m11237()
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.nio.ByteBuffer m11232(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r2 * r3
            r1.m11264(r2, r3, r4)
            java.nio.ByteBuffer r2 = r1.f8101
            int r3 = r1.f8102
            int r3 = r3 - r0
            r1.f8102 = r3
            r2.position(r3)
            java.nio.ByteBuffer r2 = r1.f8101
            java.nio.ByteBuffer r2 = r2.slice()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            r2.limit(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int m11233(int[] r3) {
            r2 = this;
            r2.m11247()
            int r0 = r3.length
            r1 = 4
            r2.m11264(r1, r0, r1)
            int r0 = r3.length
            int r0 = r0 + (-1)
        Lb:
            if (r0 < 0) goto L15
            r1 = r3[r0]
            r2.m11220(r1)
            int r0 = r0 + (-1)
            goto Lb
        L15:
            int r3 = r2.m11237()
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public java.nio.ByteBuffer m11234() {
            r1 = this;
            r1.m11244()
            java.nio.ByteBuffer r0 = r1.f8101
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final int m11235() {
            r1 = this;
            r1.m11244()
            int r0 = r1.f8102
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int m11236() {
            r11 = this;
            int[] r0 = r11.f8104
            if (r0 == 0) goto Lc5
            boolean r0 = r11.f8106
            if (r0 == 0) goto Lc5
            r0 = 0
            r11.m11216(r0)
            int r1 = r11.m11248()
            int r2 = r11.f8105
            int r2 = r2 + (-1)
        L14:
            if (r2 < 0) goto L1f
            int[] r3 = r11.f8104
            r3 = r3[r2]
            if (r3 != 0) goto L1f
            int r2 = r2 + (-1)
            goto L14
        L1f:
            r3 = r2
        L20:
            if (r3 < 0) goto L33
            int[] r4 = r11.f8104
            r4 = r4[r3]
            if (r4 == 0) goto L2b
            int r4 = r1 - r4
            goto L2c
        L2b:
            r4 = r0
        L2c:
            short r4 = (short) r4
            r11.m11223(r4)
            int r3 = r3 + (-1)
            goto L20
        L33:
            int r3 = r11.f8108
            int r3 = r1 - r3
            short r3 = (short) r3
            r11.m11223(r3)
            int r2 = r2 + 3
            r3 = 2
            int r2 = r2 * r3
            short r2 = (short) r2
            r11.m11223(r2)
            r2 = r0
        L44:
            int r4 = r11.f8110
            if (r2 >= r4) goto L84
            java.nio.ByteBuffer r4 = r11.f8101
            int r4 = r4.capacity()
            int[] r5 = r11.f8109
            r5 = r5[r2]
            int r4 = r4 - r5
            int r5 = r11.f8102
            java.nio.ByteBuffer r6 = r11.f8101
            short r6 = r6.getShort(r4)
            java.nio.ByteBuffer r7 = r11.f8101
            short r7 = r7.getShort(r5)
            if (r6 != r7) goto L81
            r7 = r3
        L64:
            if (r7 >= r6) goto L7c
            java.nio.ByteBuffer r8 = r11.f8101
            int r9 = r4 + r7
            short r8 = r8.getShort(r9)
            java.nio.ByteBuffer r9 = r11.f8101
            int r10 = r5 + r7
            short r9 = r9.getShort(r10)
            if (r8 == r9) goto L79
            goto L81
        L79:
            int r7 = r7 + 2
            goto L64
        L7c:
            int[] r4 = r11.f8109
            r2 = r4[r2]
            goto L85
        L81:
            int r2 = r2 + 1
            goto L44
        L84:
            r2 = r0
        L85:
            if (r2 == 0) goto L97
            java.nio.ByteBuffer r3 = r11.f8101
            int r3 = r3.capacity()
            int r3 = r3 - r1
            r11.f8102 = r3
            java.nio.ByteBuffer r4 = r11.f8101
            int r2 = r2 - r1
            r4.putInt(r3, r2)
            goto Lc2
        L97:
            int r2 = r11.f8110
            int[] r4 = r11.f8109
            int r5 = r4.length
            if (r2 != r5) goto La5
            int r2 = r2 * r3
            int[] r2 = java.util.Arrays.copyOf(r4, r2)
            r11.f8109 = r2
        La5:
            int[] r2 = r11.f8109
            int r3 = r11.f8110
            int r4 = r3 + 1
            r11.f8110 = r4
            int r4 = r11.m11248()
            r2[r3] = r4
            java.nio.ByteBuffer r2 = r11.f8101
            int r3 = r2.capacity()
            int r3 = r3 - r1
            int r4 = r11.m11248()
            int r4 = r4 - r1
            r2.putInt(r3, r4)
        Lc2:
            r11.f8106 = r0
            return r1
        Lc5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: endTable called without startTable"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m11237() {
            r2 = this;
            boolean r0 = r2.f8106
            if (r0 == 0) goto L11
            r0 = 0
            r2.f8106 = r0
            int r0 = r2.f8111
            r2.m11255(r0)
            int r0 = r2.m11248()
            return r0
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: endVector called without startVector"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m11238(int r2) {
            r1 = this;
            r0 = 0
            r1.m11241(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m11239(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.m11240(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m11240(int r4, java.lang.String r5, boolean r6) {
            r3 = this;
            int r0 = r3.f8103
            r1 = 4
            if (r6 == 0) goto L7
            r2 = r1
            goto L8
        L7:
            r2 = 0
        L8:
            int r2 = r2 + 8
            r3.m11250(r0, r2)
            int r0 = r5.length()
            if (r0 != r1) goto L25
            r0 = 3
        L14:
            if (r0 < 0) goto L21
            char r1 = r5.charAt(r0)
            byte r1 = (byte) r1
            r3.m11210(r1)
            int r0 = r0 + (-1)
            goto L14
        L21:
            r3.m11241(r4, r6)
            return
        L25:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "FlatBuffers: file identifier must be length 4"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m11241(int r4, boolean r5) {
            r3 = this;
            int r0 = r3.f8103
            r1 = 4
            if (r5 == 0) goto L7
            r2 = r1
            goto L8
        L7:
            r2 = 0
        L8:
            int r2 = r2 + r1
            r3.m11250(r0, r2)
            r3.m11220(r4)
            if (r5 == 0) goto L1d
            java.nio.ByteBuffer r4 = r3.f8101
            int r4 = r4.capacity()
            int r5 = r3.f8102
            int r4 = r4 - r5
            r3.m11216(r4)
        L1d:
            java.nio.ByteBuffer r4 = r3.f8101
            int r5 = r3.f8102
            r4.position(r5)
            r4 = 1
            r3.f8107 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m11242(int r2) {
            r1 = this;
            r0 = 1
            r1.m11241(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void m11243(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.m11240(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m11244() {
            r2 = this;
            boolean r0 = r2.f8107
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public Yue.C2430 m11245(boolean r1) {
            r0 = this;
            r0.f8112 = r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public Yue.C2430 m11246(java.nio.ByteBuffer r1, Yue.C2430.AbstractC2432 r2) {
            r0 = this;
            r0.f8113 = r2
            r0.f8101 = r1
            r1.clear()
            java.nio.ByteBuffer r1 = r0.f8101
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            r1 = 1
            r0.f8103 = r1
            java.nio.ByteBuffer r1 = r0.f8101
            int r1 = r1.capacity()
            r0.f8102 = r1
            r1 = 0
            r0.f8105 = r1
            r0.f8106 = r1
            r0.f8107 = r1
            r0.f8108 = r1
            r0.f8110 = r1
            r0.f8111 = r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m11247() {
            r2 = this;
            boolean r0 = r2.f8106
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: object serialization must not be nested."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public int m11248() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f8101
            int r0 = r0.capacity()
            int r1 = r2.f8102
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m11249(int r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            if (r1 >= r5) goto L12
            java.nio.ByteBuffer r2 = r4.f8101
            int r3 = r4.f8102
            int r3 = r3 + (-1)
            r4.f8102 = r3
            r2.put(r3, r0)
            int r1 = r1 + 1
            goto L2
        L12:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m11250(int r5, int r6) {
            r4 = this;
            int r0 = r4.f8103
            if (r5 <= r0) goto L6
            r4.f8103 = r5
        L6:
            java.nio.ByteBuffer r0 = r4.f8101
            int r0 = r0.capacity()
            int r1 = r4.f8102
            int r0 = r0 - r1
            int r0 = r0 + r6
            int r0 = ~r0
            int r0 = r0 + 1
            int r1 = r5 + (-1)
            r0 = r0 & r1
        L16:
            int r1 = r4.f8102
            int r2 = r0 + r5
            int r2 = r2 + r6
            if (r1 >= r2) goto L41
            java.nio.ByteBuffer r1 = r4.f8101
            int r1 = r1.capacity()
            java.nio.ByteBuffer r2 = r4.f8101
            Yue.ۥ۠ۢۢ$ۥ۟ r3 = r4.f8113
            java.nio.ByteBuffer r3 = m11205(r2, r3)
            r4.f8101 = r3
            if (r2 == r3) goto L34
            Yue.ۥ۠ۢۢ$ۥ۟ r3 = r4.f8113
            r3.m11266(r2)
        L34:
            int r2 = r4.f8102
            java.nio.ByteBuffer r3 = r4.f8101
            int r3 = r3.capacity()
            int r3 = r3 - r1
            int r2 = r2 + r3
            r4.f8102 = r2
            goto L16
        L41:
            r4.m11249(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m11251(boolean r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f8101
            int r1 = r2.f8102
            int r1 = r1 + (-1)
            r2.f8102 = r1
            byte r3 = (byte) r3
            r0.put(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m11252(byte r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f8101
            int r1 = r2.f8102
            int r1 = r1 + (-1)
            r2.f8102 = r1
            r0.put(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m11253(double r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f8101
            int r1 = r2.f8102
            int r1 = r1 + (-8)
            r2.f8102 = r1
            r0.putDouble(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m11254(float r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f8101
            int r1 = r2.f8102
            int r1 = r1 + (-4)
            r2.f8102 = r1
            r0.putFloat(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m11255(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f8101
            int r1 = r2.f8102
            int r1 = r1 + (-4)
            r2.f8102 = r1
            r0.putInt(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m11256(long r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f8101
            int r1 = r2.f8102
            int r1 = r1 + (-8)
            r2.f8102 = r1
            r0.putLong(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m11257(short r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f8101
            int r1 = r2.f8102
            int r1 = r1 + (-2)
            r2.f8102 = r1
            r0.putShort(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m11258(int r3, int r4) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f8101
            int r0 = r0.capacity()
            int r0 = r0 - r3
            java.nio.ByteBuffer r3 = r2.f8101
            int r3 = r3.getInt(r0)
            int r0 = r0 - r3
            java.nio.ByteBuffer r3 = r2.f8101
            int r0 = r0 + r4
            short r3 = r3.getShort(r0)
            if (r3 == 0) goto L18
            return
        L18:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FlatBuffers: field "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " must be set"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public byte[] m11259() {
            r3 = this;
            int r0 = r3.f8102
            java.nio.ByteBuffer r1 = r3.f8101
            int r1 = r1.capacity()
            int r2 = r3.f8102
            int r1 = r1 - r2
            byte[] r0 = r3.m11260(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public byte[] m11260(int r2, int r3) {
            r1 = this;
            r1.m11244()
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r0 = r1.f8101
            r0.position(r2)
            java.nio.ByteBuffer r2 = r1.f8101
            r2.get(r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public java.io.InputStream m11261() {
            r2 = this;
            r2.m11244()
            java.nio.ByteBuffer r0 = r2.f8101
            java.nio.ByteBuffer r0 = r0.duplicate()
            int r1 = r2.f8102
            r0.position(r1)
            java.nio.ByteBuffer r1 = r2.f8101
            int r1 = r1.capacity()
            r0.limit(r1)
            Yue.ۥ۠ۢۢ$ۥ r1 = new Yue.ۥ۠ۢۢ$ۥ
            r1.<init>(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m11262(int r3) {
            r2 = this;
            int[] r0 = r2.f8104
            int r1 = r2.m11248()
            r0[r3] = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public void m11263(int r3) {
            r2 = this;
            r2.m11247()
            int[] r0 = r2.f8104
            if (r0 == 0) goto La
            int r0 = r0.length
            if (r0 >= r3) goto Le
        La:
            int[] r0 = new int[r3]
            r2.f8104 = r0
        Le:
            r2.f8105 = r3
            int[] r0 = r2.f8104
            r1 = 0
            java.util.Arrays.fill(r0, r1, r3, r1)
            r3 = 1
            r2.f8106 = r3
            int r3 = r2.m11248()
            r2.f8108 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public void m11264(int r1, int r2, int r3) {
            r0 = this;
            r0.m11247()
            r0.f8111 = r2
            int r1 = r1 * r2
            r2 = 4
            r0.m11250(r2, r1)
            r0.m11250(r3, r1)
            r1 = 1
            r0.f8106 = r1
            return
    }
}
