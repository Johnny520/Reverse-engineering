package yyds;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: yyds.ᛱᛸᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0190 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    private static final int f1114 = 12;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0190 f1115 = new C0190();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private static final int f1116 = 1;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private static final int f1117 = 2;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private static final int f1118 = 16;

    private C0190() {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final byte[] m808(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(AbstractC2328.m4341(-536784585524078L));
        mac.init(new SecretKeySpec(bArr, AbstractC2328.m4341(-536831830164334L)));
        byte[] bArrDoFinal = mac.doFinal(bArr2);
        AbstractC2328.m4341(-536879074804590L);
        return bArrDoFinal;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private final byte[] m809() {
        return new byte[]{-3, -14, 19, 23, 45, -28, -24, -84, 85, -71, -113, -15, -117, 69, 3, -3};
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final byte[] m810(int i, byte[] bArr, byte[] bArr2) {
        String strM4341;
        AbstractC2328.m4341(-536002901476206L);
        AbstractC2328.m4341(-536045851149166L);
        if (bArr.length != f1118) {
            C0188.m806(AbstractC2328.m4341(-536110275658606L));
            return null;
        }
        if (bArr2.length != f1114) {
            C0188.m806(AbstractC2328.m4341(-536221944808302L));
            return null;
        }
        byte[] bArr3 = {-30, 78, 84, 79, 95, -66, 36, -65, 101, 37, -115, 81, 125, 14, 57, -120, -1, -107, 77, 72, 52, 79, 118, -116, -18, -126, 23, -33, 105, -76, 89, 97};
        byte[] bArr4 = {-29, 82, -113, 40, -13, 98, -43, 115, -2, -76, 78, -61, -118, -76, -33, -1, 2, -94, -57, 41, 0, -92, 106, 94, -128, 34, -102, 4, 55, -113, 32, -79};
        byte[] bArr5 = new byte[32];
        for (int i2 = 0; i2 < 32; i2 += f1116) {
            bArr5[i2] = (byte) (bArr3[i2] ^ bArr4[i2]);
        }
        Arrays.fill(bArr3, 0, 32, (byte) 0);
        Arrays.fill(bArr4, 0, 32, (byte) 0);
        if (i == f1116) {
            strM4341 = AbstractC2328.m4341(-536355088794478L);
        } else {
            if (i != f1117) {
                Arrays.fill(bArr5, 0, 32, (byte) 0);
                C0188.m798(AbstractC2328.m4341(-536574132126574L));
                return null;
            }
            strM4341 = AbstractC2328.m4341(-536462462976878L);
        }
        byte[] bytes = strM4341.getBytes(AbstractC0347.f1811);
        AbstractC2328.m4341(-536724455981934L);
        byte[] bArrM811 = m811();
        int length = bytes.length + bArrM811.length + bArr2.length + bArr.length;
        byte[] bArr6 = new byte[length];
        AbstractC2070.m3933(bytes, bArr6, 0, 0, 0, f1114);
        int length2 = bytes.length;
        AbstractC2070.m3933(bArrM811, bArr6, length2, 0, 0, f1114);
        int length3 = length2 + bArrM811.length;
        AbstractC2070.m3933(bArr2, bArr6, length3, 0, 0, f1114);
        AbstractC2070.m3933(bArr, bArr6, length3 + bArr2.length, 0, 0, f1114);
        byte[] bArrM809 = m809();
        try {
            byte[] bArrM808 = m808(bArrM809, bArr5);
            Arrays.fill(bArr5, 0, 32, (byte) 0);
            AbstractC2070.m3936(bArrM809, (byte) 0);
            byte[] bArrCopyOf = Arrays.copyOf(bArr6, length + f1116);
            bArrCopyOf[length] = 1;
            try {
                return m808(bArrM808, bArrCopyOf);
            } finally {
                AbstractC2070.m3936(bArrM808, (byte) 0);
                Arrays.fill(bArrCopyOf, 0, bArrCopyOf.length, (byte) 0);
                Arrays.fill(bArr6, 0, length, (byte) 0);
                Arrays.fill(bytes, 0, bytes.length, (byte) 0);
                Arrays.fill(bArrM811, 0, bArrM811.length, (byte) 0);
            }
        } catch (Throwable th) {
            Arrays.fill(bArr5, 0, 32, (byte) 0);
            AbstractC2070.m3936(bArrM809, (byte) 0);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final byte[] m811() {
        byte[] bArrCopyOf = Arrays.copyOf(m809(), 8);
        AbstractC2328.m4341(-535951361868654L);
        return bArrCopyOf;
    }
}
