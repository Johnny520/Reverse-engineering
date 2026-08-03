package Yue;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Yue.ۥۣۢۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8148 {

    /* JADX INFO: renamed from: ۥ */
    public static AbstractC8148 f3254;

    /* JADX INFO: renamed from: Yue.ۥۣۢۤ۠$ۥ */
    public static class C1441 {
        /* JADX INFO: renamed from: ۥ */
        public static void m4177(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws IllegalArgumentException {
            if (m26803(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m26803(b3) || m26803(b4)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int iM26808 = ((b & 7) << 18) | (m26808(b2) << 12) | (m26808(b3) << 6) | m26808(b4);
            cArr[i] = m26802(iM26808);
            cArr[i + 1] = m26807(iM26808);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m4178(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m26800(byte b, byte b2, byte b3, char[] cArr, int i) throws IllegalArgumentException {
            if (m26803(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m26803(b3)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b & 15) << 12) | (m26808(b2) << 6) | m26808(b3));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m26801(byte b, byte b2, char[] cArr, int i) throws IllegalArgumentException {
            if (b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (m26803(b2)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b & 31) << 6) | m26808(b2));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static char m26802(int i) {
            return (char) ((i >>> 10) + C8149.f24170);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m26803(byte b) {
            return b > -65;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static boolean m26804(byte b) {
            return b >= 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static boolean m26805(byte b) {
            return b < -16;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static boolean m26806(byte b) {
            return b < -32;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static char m26807(int i) {
            return (char) ((i & 1023) + C8149.f24171);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static int m26808(byte b) {
            return b & C8149.f3255;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۤ۠$ۥ۟ */
    public static class C1442 extends IllegalArgumentException {
        public C1442(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static AbstractC8148 m26797() {
        if (f3254 == null) {
            f3254 = new C8154();
        }
        return f3254;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m26798(AbstractC8148 abstractC8148) {
        f3254 = abstractC8148;
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract String mo4175(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract void mo4176(CharSequence charSequence, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract int mo26799(CharSequence charSequence);
}
