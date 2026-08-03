package Yue;

import com.google.flatbuffers.reflection.BaseType;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3510 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f347 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f348 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f5899 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f5900 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f5901 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f5902 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f5903 = 76;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final byte f5904 = 61;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final byte f5905 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f5906 = "US-ASCII";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final byte f5907 = -5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final byte[] f5908 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, C4750.f10554};

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final byte[] f5909 = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, C8149.f3255, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, BaseType.Union, BaseType.Array, BaseType.Vector64, BaseType.MaxBaseType, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, C4750.f10567, 43, 44, 45, 46, C4750.f10554, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final byte[] f5910 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final byte[] f5911 = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, BaseType.Union, BaseType.Array, BaseType.Vector64, BaseType.MaxBaseType, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, C8149.f3255, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, C4750.f10567, 43, 44, 45, 46, C4750.f10554, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final byte[] f5912 = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final byte[] f5913 = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, BaseType.Union, BaseType.Array, BaseType.Vector64, BaseType.MaxBaseType, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, C4750.f10567, 43, 44, 45, 46, C4750.f10554, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, C8149.f3255, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f5914 = false;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۥ۟$ۥ */
    public static class C0165 extends FilterOutputStream {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f5915;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f5916;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public byte[] f5917;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f5918;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f5919;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f5920;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public byte[] f5921;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public boolean f5922;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public int f5923;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public byte[] f5924;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0165(OutputStream outputStream) {
            this(outputStream, 1);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            m572();
            super.close();
            this.f5917 = null;
            ((FilterOutputStream) this).out = null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            if (this.f5922) {
                ((FilterOutputStream) this).out.write(i);
                return;
            }
            if (!this.f5915) {
                byte b = this.f5924[i & 127];
                if (b <= -5) {
                    if (b != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr = this.f5917;
                int i2 = this.f5916;
                int i3 = i2 + 1;
                this.f5916 = i3;
                bArr[i2] = (byte) i;
                if (i3 >= this.f5918) {
                    ((FilterOutputStream) this).out.write(this.f5921, 0, C3510.m9392(bArr, 0, this.f5921, 0, this.f5923));
                    this.f5916 = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.f5917;
            int i4 = this.f5916;
            int i5 = i4 + 1;
            this.f5916 = i5;
            bArr2[i4] = (byte) i;
            int i6 = this.f5918;
            if (i5 >= i6) {
                ((FilterOutputStream) this).out.write(C3510.m9394(this.f5921, bArr2, i6, this.f5923));
                int i7 = this.f5919 + 4;
                this.f5919 = i7;
                if (this.f5920 && i7 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f5919 = 0;
                }
                this.f5916 = 0;
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m572() throws IOException {
            int i = this.f5916;
            if (i > 0) {
                if (!this.f5915) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(C3510.m9394(this.f5921, this.f5917, i, this.f5923));
                this.f5916 = 0;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0165(OutputStream outputStream, int i) {
            super(outputStream);
            this.f5920 = (i & 8) != 0;
            boolean z = (i & 1) != 0;
            this.f5915 = z;
            int i2 = z ? 3 : 4;
            this.f5918 = i2;
            this.f5917 = new byte[i2];
            this.f5916 = 0;
            this.f5919 = 0;
            this.f5922 = false;
            this.f5921 = new byte[4];
            this.f5923 = i;
            this.f5924 = C3510.m9399(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.f5922) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m9392(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        }
        if (i < 0 || (i4 = i + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i)));
        }
        if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i2)));
        }
        byte[] bArrM9399 = m9399(i3);
        byte b = bArr[i + 2];
        if (b == 61) {
            bArr2[i2] = (byte) ((((bArrM9399[bArr[i + 1]] & 255) << 12) | ((bArrM9399[bArr[i]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b2 = bArr[i4];
        if (b2 == 61) {
            int i6 = ((bArrM9399[bArr[i + 1]] & 255) << 12) | ((bArrM9399[bArr[i]] & 255) << 18) | ((bArrM9399[b] & 255) << 6);
            bArr2[i2] = (byte) (i6 >>> 16);
            bArr2[i2 + 1] = (byte) (i6 >>> 8);
            return 2;
        }
        int i7 = ((bArrM9399[bArr[i + 1]] & 255) << 12) | ((bArrM9399[bArr[i]] & 255) << 18) | ((bArrM9399[b] & 255) << 6) | (bArrM9399[b2] & 255);
        bArr2[i2] = (byte) (i7 >> 16);
        bArr2[i2 + 1] = (byte) (i7 >> 8);
        bArr2[i5] = (byte) i7;
        return 3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static byte[] m9393(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArrM9398 = m9398(i4);
        int i5 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArrM9398[i5 >>> 18];
            bArr2[i3 + 1] = bArrM9398[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArrM9398[i5 >>> 18];
            bArr2[i3 + 1] = bArrM9398[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = bArrM9398[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArrM9398[i5 >>> 18];
        bArr2[i3 + 1] = bArrM9398[(i5 >>> 12) & 63];
        bArr2[i3 + 2] = bArrM9398[(i5 >>> 6) & 63];
        bArr2[i3 + 3] = bArrM9398[i5 & 63];
        return bArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static byte[] m9394(byte[] bArr, byte[] bArr2, int i, int i2) {
        m9393(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static String m9395(byte[] bArr) {
        try {
            return m9396(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static String m9396(byte[] bArr, int i, int i2, int i3) throws Throwable {
        byte[] bArrM9397 = m9397(bArr, i, i2, i3);
        try {
            return new String(bArrM9397, f5906);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrM9397);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m9397(byte[] bArr, int i, int i2, int i3) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        C0165 c0165;
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i2);
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        }
        if ((i3 & 2) == 0) {
            boolean z = (i3 & 8) != 0;
            int i4 = ((i2 / 3) * 4) + (i2 % 3 > 0 ? 4 : 0);
            if (z) {
                i4 += i4 / 76;
            }
            int i5 = i4;
            byte[] bArr2 = new byte[i5];
            int i6 = i2 - 2;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i7 < i6) {
                int i10 = i7;
                m9393(bArr, i7 + i, 3, bArr2, i8, i3);
                int i11 = i9 + 4;
                if (!z || i11 < 76) {
                    i9 = i11;
                } else {
                    bArr2[i8 + 4] = 10;
                    i8++;
                    i9 = 0;
                }
                i7 = i10 + 3;
                i8 += 4;
            }
            int i12 = i7;
            if (i12 < i2) {
                m9393(bArr, i12 + i, i2 - i12, bArr2, i8, i3);
                i8 += 4;
            }
            int i13 = i8;
            if (i13 > i5 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i13];
            System.arraycopy(bArr2, 0, bArr3, 0, i13);
            return bArr3;
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        gZIPOutputStream2 = null;
        gZIPOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c0165 = new C0165(byteArrayOutputStream, i3 | 1);
                try {
                    gZIPOutputStream = new GZIPOutputStream(c0165);
                } catch (IOException e) {
                    e = e;
                    gZIPOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (gZIPOutputStream2 != null) {
                    }
                    if (c0165 != null) {
                    }
                    if (byteArrayOutputStream == null) {
                    }
                }
            } catch (IOException e2) {
                e = e2;
                c0165 = null;
                gZIPOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                c0165 = null;
            }
        } catch (IOException e3) {
            e = e3;
            c0165 = null;
            gZIPOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            c0165 = null;
        }
        try {
            gZIPOutputStream.write(bArr, i, i2);
            gZIPOutputStream.close();
            try {
                gZIPOutputStream.close();
            } catch (Exception unused) {
            }
            try {
                c0165.close();
            } catch (Exception unused2) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (Exception unused3) {
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            e = e4;
            byteArrayOutputStream2 = byteArrayOutputStream;
            try {
                throw e;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = byteArrayOutputStream2;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                if (c0165 != null) {
                    try {
                        c0165.close();
                    } catch (Exception unused5) {
                    }
                }
                if (byteArrayOutputStream == null) {
                    throw th;
                }
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (Exception unused6) {
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
            }
            if (c0165 != null) {
            }
            if (byteArrayOutputStream == null) {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final byte[] m9398(int i) {
        return (i & 16) == 16 ? f5910 : (i & 32) == 32 ? f5912 : f5908;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final byte[] m9399(int i) {
        return (i & 16) == 16 ? f5911 : (i & 32) == 32 ? f5913 : f5909;
    }
}
