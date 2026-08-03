package p000a;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a.ag */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0486ag {

    /* JADX INFO: renamed from: a */
    public static C0505bg f1813a;

    /* JADX INFO: renamed from: a.ag$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m1176a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
            if (!m1179d(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m1179d(b3) && !m1179d(b4)) {
                    int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i] = (char) ((i2 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: renamed from: b */
        public static void m1177b(byte b, byte b2, byte b3, char[] cArr, int i) {
            if (m1179d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m1179d(b3)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        /* JADX INFO: renamed from: c */
        public static void m1178c(byte b, byte b2, char[] cArr, int i) {
            if (b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (m1179d(b2)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }

        /* JADX INFO: renamed from: d */
        public static boolean m1179d(byte b) {
            return b > -65;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo1173a(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract void mo1174b(CharSequence charSequence, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: c */
    public abstract int mo1175c(CharSequence charSequence);
}
