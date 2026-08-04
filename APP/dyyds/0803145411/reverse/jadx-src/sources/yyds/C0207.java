package yyds;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import yyds.C0137;

/* JADX INFO: renamed from: yyds.ᛱᲀᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0207 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    private static final int f1187 = 1;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    private static final int f1188 = 2097152;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    private static final int f1189 = 2;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    private static final int f1190 = 4096;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    private static final int f1191 = 16;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    private static final AtomicLong f1192;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0207 f1193;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    private static final byte[] f1194;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    private static final int f1195 = 1;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    private static final int f1196 = 6;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private static final int f1197 = 68;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    private static final byte[] f1198;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    private static final int f1199 = 0;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    private static final int f1200 = 16;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    private static final byte[] f1201;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    private static final SecureRandom f1202;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    private static final int f1203 = 2;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    private static final int f1204 = 1;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    private static final long f1205 = 120000;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    private static final int f1206 = 8;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private static final int f1207 = 8;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    private static final int f1208 = 2;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    private static final int f1209 = 12;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private static final int f1210 = 12;

    /* JADX INFO: renamed from: yyds.ᛱᲀᲀᛸ$ᛲᲈᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C0208 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final byte[] f1211;

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        private final byte[] f1212;

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        private final AtomicBoolean f1213;

        public C0208(byte[] bArr, byte[] bArr2) {
            AbstractC2328.m4341(-580395683447662L);
            AbstractC2328.m4341(-580438633120622L);
            this.f1211 = bArr;
            this.f1212 = bArr2;
            this.f1213 = new AtomicBoolean(false);
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        public final void m861() {
            if (!this.f1213.compareAndSet(false, true)) {
                throw C0207.f1193.m853();
            }
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final byte[] m862() {
            return this.f1212;
        }

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        public final byte[] m863() {
            return this.f1211;
        }
    }

    /* JADX INFO: renamed from: yyds.ᛱᲀᲀᛸ$ᛵᛸᛸᛷ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C0209 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final byte[] f1214;

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        private int f1215;

        public C0209(byte[] bArr) {
            AbstractC2328.m4341(-565097009939310L);
            this.f1214 = bArr;
        }

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        private final int m864() {
            return m866() | (m866() << 24) | (m866() << 16) | (m866() << 8);
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        public final void m865() {
            if (this.f1215 != this.f1214.length) {
                throw C0207.f1193.m853();
            }
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final int m866() {
            int i = this.f1215;
            byte[] bArr = this.f1214;
            if (i >= bArr.length) {
                throw C0207.f1193.m853();
            }
            this.f1215 = i + 1;
            return bArr[i] & 255;
        }

        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        public final String m867() {
            int iM864 = m864();
            if (iM864 >= 0 && iM864 <= C0207.f1188) {
                byte[] bArr = this.f1214;
                int length = bArr.length;
                int i = this.f1215;
                if (iM864 <= length - i) {
                    byte[] bArrM3946 = AbstractC2070.m3946(bArr, i, i + iM864);
                    this.f1215 += iM864;
                    try {
                        CharsetDecoder charsetDecoderNewDecoder = AbstractC0347.f1806.newDecoder();
                        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                        return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArrM3946)).toString();
                    } catch (Exception unused) {
                        throw C0207.f1193.m853();
                    }
                }
            }
            throw C0207.f1193.m853();
        }
    }

    static {
        C0207 c0207 = new C0207();
        f1193 = c0207;
        byte[] bytes = AbstractC2328.m4341(-589763007120238L).getBytes(AbstractC0347.f1811);
        AbstractC2328.m4341(-589784481956718L);
        f1194 = bytes;
        f1202 = new SecureRandom();
        f1201 = c0207.m855(8);
        f1198 = c0207.m855(4);
        f1192 = new AtomicLong(1L);
    }

    private C0207() {
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    private final byte[] m848(int i, long j) {
        byte[] bArrArray = ByteBuffer.allocate(12).order(ByteOrder.BIG_ENDIAN).putInt(i).putLong(j).array();
        AbstractC2328.m4341(-589548258755438L);
        return bArrArray;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    private final void m849(DataOutputStream dataOutputStream, byte[] bArr) throws IOException {
        dataOutputStream.writeByte(f1196);
        dataOutputStream.writeInt(bArr.length);
        dataOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    private final void m850(byte[] bArr, int i, long j) {
        ByteBuffer.wrap(bArr, i, 8).order(ByteOrder.BIG_ENDIAN).putLong(j);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    private final byte[] m852(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 84 || bArr.length > 2097236) {
            throw m853();
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, f1199, f1197).order(ByteOrder.BIG_ENDIAN);
        byte[] bArr3 = new byte[4];
        byteBufferOrder.get(bArr3);
        int i = byteBufferOrder.get() & 255;
        int i2 = byteBufferOrder.get() & 255;
        int i3 = byteBufferOrder.getShort() & 65535;
        byte[] bArr4 = new byte[8];
        byteBufferOrder.get(bArr4);
        int i4 = byteBufferOrder.getInt();
        long j = byteBufferOrder.getLong();
        byte[] bArr5 = new byte[16];
        byteBufferOrder.get(bArr5);
        long j2 = byteBufferOrder.getLong();
        byte[] bArr6 = new byte[12];
        byteBufferOrder.get(bArr6);
        int i5 = byteBufferOrder.getInt();
        byte[] bArrM811 = C0190.f1115.m811();
        C0137.C0138 c0138M618 = C0137.f842.m618();
        if (!MessageDigest.isEqual(bArr3, f1194) || i != 2 || i2 != 2 || i3 != f1197 || !MessageDigest.isEqual(bArr4, bArrM811) || i4 <= 0 || j <= 0 || i4 != c0138M618.m620() || j != c0138M618.m624() || !MessageDigest.isEqual(bArr5, bArr2) || i5 < 16 || i5 > 2097168 || bArr.length != ((long) i5) + 68) {
            throw m853();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j2 < 0 || j2 < jCurrentTimeMillis - f1205 || j2 > jCurrentTimeMillis + f1205) {
            throw m853();
        }
        try {
            Cipher cipherM856 = m856(2, bArr5, bArr6, 2, m848(i4, j));
            cipherM856.updateAAD(bArr, f1199, f1197);
            return cipherM856.doFinal(bArr, f1197, i5);
        } catch (RuntimeException unused) {
            throw m853();
        } catch (GeneralSecurityException unused2) {
            throw m853();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final SecurityException m853() {
        return new SecurityException(AbstractC2328.m4341(-589595503395694L));
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    private final byte[] m854(byte[] bArr, byte[] bArr2, long j, byte[] bArr3) {
        int iAddExact = Math.addExact(bArr3.length, 16);
        byte[] bArrM811 = C0190.f1115.m811();
        C0137.C0138 c0138M618 = C0137.f842.m618();
        byte[] bArrM848 = m848(c0138M618.m620(), c0138M618.m624());
        byte[] bArrArray = ByteBuffer.allocate(f1197).order(ByteOrder.BIG_ENDIAN).put(f1194).put((byte) 2).put((byte) 1).putShort((short) 68).put(bArrM811).putInt(c0138M618.m620()).putLong(c0138M618.m624()).put(bArr).putLong(j).put(bArr2).putInt(iAddExact).array();
        try {
            Cipher cipherM856 = m856(1, bArr, bArr2, 1, bArrM848);
            cipherM856.updateAAD(bArrArray);
            byte[] bArrDoFinal = cipherM856.doFinal(bArr3);
            if (bArrDoFinal.length != iAddExact) {
                C0188.m800(AbstractC2328.m4341(-589221841240942L));
                return null;
            }
            int length = bArrArray.length;
            int length2 = bArrDoFinal.length;
            byte[] bArrCopyOf = Arrays.copyOf(bArrArray, length + length2);
            System.arraycopy(bArrDoFinal, f1199, bArrCopyOf, length, length2);
            return bArrCopyOf;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(AbstractC2328.m4341(-589054337516398L), e);
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    private final byte[] m855(int i) {
        byte[] bArr = new byte[i];
        f1202.nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private final Cipher m856(int i, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3) {
        byte[] bArrM810 = C0190.f1115.m810(i2, bArr, bArr3);
        try {
            Cipher cipher = Cipher.getInstance(AbstractC2328.m4341(-589281970783086L));
            cipher.init(i, new SecretKeySpec(bArrM810, AbstractC2328.m4341(-589359280194414L)), new GCMParameterSpec(128, bArr2));
            return cipher;
        } finally {
            AbstractC2070.m3936(bArrM810, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    private final long m857() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = f1192;
            j = atomicLong.get();
            if (j <= 0 || j == Long.MAX_VALUE) {
                C0188.m800(AbstractC2328.m4341(-589376460063598L));
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j, 1 + j));
        return j;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0208 m858(String str) throws IOException {
        AbstractC2328.m4341(-588371437716334L);
        Charset charset = AbstractC0347.f1806;
        byte[] bytes = str.getBytes(charset);
        AbstractC2328.m4341(-588405797454702L);
        if (bytes.length == 0 || bytes.length > f1190) {
            C0188.m806(AbstractC2328.m4341(-588465926996846L));
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeByte(1);
            C0207 c0207 = f1193;
            byte[] bytes2 = AbstractC2328.m4341(-588616250852206L).getBytes(charset);
            AbstractC2328.m4341(-588642020655982L);
            c0207.m849(dataOutputStream, bytes2);
            dataOutputStream.writeByte(8);
            dataOutputStream.writeInt(1);
            c0207.m849(dataOutputStream, bytes);
            dataOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray.length > f1188) {
                C0188.m806(AbstractC2328.m4341(-588702150198126L));
                return null;
            }
            long jM857 = m857();
            byte[] bArr = new byte[16];
            AbstractC2070.m3933(f1201, bArr, f1199, f1199, f1199, 14);
            c0207.m850(bArr, 8, jM857);
            byte[] bArr2 = new byte[12];
            AbstractC2070.m3933(f1198, bArr2, f1199, f1199, f1199, 14);
            c0207.m850(bArr2, 4, jM857);
            return new C0208(bArr, m854(bArr, bArr2, System.currentTimeMillis(), byteArray));
        } finally {
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m859(String str, InterfaceC1549 interfaceC1549) {
        AbstractC2328.m4341(-588302718239598L);
        AbstractC2328.m4341(-588337077977966L);
        C0208 c0208M858 = m858(str);
        m860(c0208M858, (byte[]) interfaceC1549.mo371(c0208M858.m862()));
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m860(C0208 c0208, byte[] bArr) {
        String strM867;
        AbstractC2328.m4341(-588852474053486L);
        AbstractC2328.m4341(-588886833791854L);
        c0208.m861();
        C0209 c0209 = new C0209(m852(bArr, c0208.m863()));
        boolean z = true;
        if (c0209.m866() != 1 || c0209.m866() != 2) {
            throw m853();
        }
        int iM866 = c0209.m866();
        if (iM866 == 0) {
            z = false;
        } else if (iM866 != 1) {
            throw m853();
        }
        int iM8662 = c0209.m866();
        if (iM8662 == 0) {
            strM867 = null;
        } else {
            if (iM8662 != f1196) {
                throw m853();
            }
            strM867 = c0209.m867();
        }
        c0209.m865();
        if (z) {
            if (strM867 != null) {
                throw m853();
            }
        } else {
            String strM4341 = strM867 != null ? strM867 : null;
            if (strM4341 == null) {
                strM4341 = AbstractC2328.m4341(-588925488497518L);
            }
            AbstractC2328.m4341(-535178267755374L);
            throw new C1738(strM4341);
        }
    }
}
