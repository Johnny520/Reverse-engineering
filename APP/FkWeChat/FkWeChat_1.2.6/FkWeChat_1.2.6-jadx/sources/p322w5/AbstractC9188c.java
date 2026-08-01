package p322w5;

import com.alibaba.fastjson2.JSONB;
import java.nio.ByteBuffer;
import p376zd.C9987e;

/* JADX INFO: renamed from: w5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9188c {

    /* JADX INFO: renamed from: a */
    public static AbstractC9188c f31409a;

    /* JADX INFO: renamed from: w5.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m35798a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
            if (m35803f(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || m35803f(b12) || m35803f(b13)) {
                C9987e.m38645a("Invalid UTF-8");
                return;
            }
            int iM35808k = ((b10 & 7) << 18) | (m35808k(b11) << 12) | (m35808k(b12) << 6) | m35808k(b13);
            cArr[i10] = m35802e(iM35808k);
            cArr[i10 + 1] = m35807j(iM35808k);
        }

        /* JADX INFO: renamed from: b */
        public static void m35799b(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        /* JADX INFO: renamed from: c */
        public static void m35800c(byte b10, byte b11, byte b12, char[] cArr, int i10) {
            if (m35803f(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m35803f(b12)))) {
                C9987e.m38645a("Invalid UTF-8");
            } else {
                cArr[i10] = (char) (((b10 & 15) << 12) | (m35808k(b11) << 6) | m35808k(b12));
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m35801d(byte b10, byte b11, char[] cArr, int i10) {
            if (b10 < -62) {
                C9987e.m38645a("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            } else if (m35803f(b11)) {
                C9987e.m38645a("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            } else {
                cArr[i10] = (char) (((b10 & 31) << 6) | m35808k(b11));
            }
        }

        /* JADX INFO: renamed from: e */
        public static char m35802e(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        /* JADX INFO: renamed from: f */
        public static boolean m35803f(byte b10) {
            return b10 > -65;
        }

        /* JADX INFO: renamed from: g */
        public static boolean m35804g(byte b10) {
            return b10 >= 0;
        }

        /* JADX INFO: renamed from: h */
        public static boolean m35805h(byte b10) {
            return b10 < -16;
        }

        /* JADX INFO: renamed from: i */
        public static boolean m35806i(byte b10) {
            return b10 < -32;
        }

        /* JADX INFO: renamed from: j */
        public static char m35807j(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        /* JADX INFO: renamed from: k */
        public static int m35808k(byte b10) {
            return b10 & JSONB.Constants.BC_INT32_BYTE_MAX;
        }
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC9188c m35794d() {
        if (f31409a == null) {
            f31409a = new C9189d();
        }
        return f31409a;
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo35795a(ByteBuffer byteBuffer, int i10, int i11);

    /* JADX INFO: renamed from: b */
    public abstract void mo35796b(CharSequence charSequence, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: c */
    public abstract int mo35797c(CharSequence charSequence);
}
