package Yue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(19)
public class C4639 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1027 = 8;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1028 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f9958 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f9959 = 4;

    /* JADX INFO: renamed from: ۥ */
    public static int m1597(int i) {
        return ((i + 7) & (-8)) / 8;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static byte[] m1598(@InterfaceC6391 byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static RuntimeException m13945(@InterfaceC6490 String str) {
        return new IllegalStateException(str);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static byte[] m13946(@InterfaceC6391 InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw m13945("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static byte[] m13947(@InterfaceC6391 InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw m13945("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw m13945(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw m13945("Inflater did not finish");
            }
            throw m13945("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static String m13948(InputStream inputStream, int i) throws IOException {
        return new String(m13946(inputStream, i), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static long m13949(@InterfaceC6391 InputStream inputStream, int i) throws IOException {
        byte[] bArrM13946 = m13946(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM13946[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m13950(@InterfaceC6391 InputStream inputStream) throws IOException {
        return (int) m13949(inputStream, 2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static long m13951(@InterfaceC6391 InputStream inputStream) throws IOException {
        return m13949(inputStream, 4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m13952(@InterfaceC6391 InputStream inputStream) throws IOException {
        return (int) m13949(inputStream, 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m13953(@InterfaceC6391 String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m13954(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m13955(@InterfaceC6391 OutputStream outputStream, byte[] bArr) throws IOException {
        m13959(outputStream, bArr.length);
        byte[] bArrM1598 = m1598(bArr);
        m13959(outputStream, bArrM1598.length);
        outputStream.write(bArrM1598);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m13956(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m13957(@InterfaceC6391 OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m13958(@InterfaceC6391 OutputStream outputStream, int i) throws IOException {
        m13957(outputStream, i, 2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m13959(@InterfaceC6391 OutputStream outputStream, long j) throws IOException {
        m13957(outputStream, j, 4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m13960(@InterfaceC6391 OutputStream outputStream, int i) throws IOException {
        m13957(outputStream, i, 1);
    }
}
