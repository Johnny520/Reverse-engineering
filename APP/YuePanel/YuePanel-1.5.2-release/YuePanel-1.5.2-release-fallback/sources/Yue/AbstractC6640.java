package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6640 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.AbstractC6640 f23185;

    /* JADX INFO: renamed from: Yue.ۥۣۢۤ۠$ۥ, reason: contains not printable characters */
    public static class C6641 {
        public C6641() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m25514(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) throws java.lang.IllegalArgumentException {
                boolean r0 = m25519(r3)
                if (r0 != 0) goto L41
                int r0 = r2 << 28
                int r1 = r3 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L41
                boolean r0 = m25519(r4)
                if (r0 != 0) goto L41
                boolean r0 = m25519(r5)
                if (r0 != 0) goto L41
                r2 = r2 & 7
                int r2 = r2 << 18
                int r3 = m25524(r3)
                int r3 = r3 << 12
                r2 = r2 | r3
                int r3 = m25524(r4)
                int r3 = r3 << 6
                r2 = r2 | r3
                int r3 = m25524(r5)
                r2 = r2 | r3
                char r3 = m25518(r2)
                r6[r7] = r3
                int r7 = r7 + 1
                char r2 = m25523(r2)
                r6[r7] = r2
                return
            L41:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Invalid UTF-8"
                r2.<init>(r3)
                throw r2
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m25515(byte r0, char[] r1, int r2) {
                char r0 = (char) r0
                r1[r2] = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m25516(byte r2, byte r3, byte r4, char[] r5, int r6) throws java.lang.IllegalArgumentException {
                boolean r0 = m25519(r3)
                if (r0 != 0) goto L2e
                r0 = -32
                r1 = -96
                if (r2 != r0) goto Le
                if (r3 < r1) goto L2e
            Le:
                r0 = -19
                if (r2 != r0) goto L14
                if (r3 >= r1) goto L2e
            L14:
                boolean r0 = m25519(r4)
                if (r0 != 0) goto L2e
                r2 = r2 & 15
                int r2 = r2 << 12
                int r3 = m25524(r3)
                int r3 = r3 << 6
                r2 = r2 | r3
                int r3 = m25524(r4)
                r2 = r2 | r3
                char r2 = (char) r2
                r5[r6] = r2
                return
            L2e:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Invalid UTF-8"
                r2.<init>(r3)
                throw r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m25517(byte r1, byte r2, char[] r3, int r4) throws java.lang.IllegalArgumentException {
                r0 = -62
                if (r1 < r0) goto L1f
                boolean r0 = m25519(r2)
                if (r0 != 0) goto L17
                r1 = r1 & 31
                int r1 = r1 << 6
                int r2 = m25524(r2)
                r1 = r1 | r2
                char r1 = (char) r1
                r3[r4] = r1
                return
            L17:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"
                r1.<init>(r2)
                throw r1
            L1f:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid UTF-8: Illegal leading byte in 2 bytes utf"
                r1.<init>(r2)
                throw r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static char m25518(int r1) {
                int r1 = r1 >>> 10
                r0 = 55232(0xd7c0, float:7.7397E-41)
                int r1 = r1 + r0
                char r1 = (char) r1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m25519(byte r1) {
                r0 = -65
                if (r1 <= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static boolean m25520(byte r0) {
                if (r0 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static boolean m25521(byte r1) {
                r0 = -16
                if (r1 >= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static boolean m25522(byte r1) {
                r0 = -32
                if (r1 >= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static char m25523(int r1) {
                r1 = r1 & 1023(0x3ff, float:1.434E-42)
                r0 = 56320(0xdc00, float:7.8921E-41)
                int r1 = r1 + r0
                char r1 = (char) r1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static int m25524(byte r0) {
                r0 = r0 & 63
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۤ۠$ۥ۟, reason: contains not printable characters */
    public static class C6642 extends java.lang.IllegalArgumentException {
        public C6642(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " of "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    public AbstractC6640() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.AbstractC6640 m25509() {
            Yue.ۥۣۢۤ۠ r0 = Yue.AbstractC6640.f23185
            if (r0 != 0) goto Lb
            Yue.ۥۣۢۤۦ r0 = new Yue.ۥۣۢۤۦ
            r0.<init>()
            Yue.AbstractC6640.f23185 = r0
        Lb:
            Yue.ۥۣۢۤ۠ r0 = Yue.AbstractC6640.f23185
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m25510(Yue.AbstractC6640 r0) {
            Yue.AbstractC6640.f23185 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract java.lang.String mo25511(java.nio.ByteBuffer r1, int r2, int r3);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract void mo25512(java.lang.CharSequence r1, java.nio.ByteBuffer r2);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract int mo25513(java.lang.CharSequence r1);
}
