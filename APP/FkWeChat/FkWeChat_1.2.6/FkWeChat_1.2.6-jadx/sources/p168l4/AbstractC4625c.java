package p168l4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p376zd.C10023w;

/* JADX INFO: renamed from: l4.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4625c {
    /* JADX INFO: renamed from: a */
    public static int m18565a(int i10) {
        return ((i10 + 7) & (-8)) / 8;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m18566b(byte[] bArr) {
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

    /* JADX INFO: renamed from: c */
    public static RuntimeException m18567c(String str) {
        return new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m18568d(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw m18567c("Not enough bytes to read: " + i10);
            }
            i11 += i12;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m18569e(InputStream inputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = inputStream.read(bArr2);
                if (i13 < 0) {
                    throw m18567c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw m18567c(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw m18567c("Inflater did not finish");
            }
            throw m18567c("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m18570f(InputStream inputStream, int i10) {
        return new String(m18568d(inputStream, i10), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: g */
    public static long m18571g(InputStream inputStream, int i10) throws IOException {
        byte[] bArrM18568d = m18568d(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrM18568d[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    /* JADX INFO: renamed from: h */
    public static int m18572h(InputStream inputStream) {
        return (int) m18571g(inputStream, 2);
    }

    /* JADX INFO: renamed from: i */
    public static long m18573i(InputStream inputStream) {
        return m18571g(inputStream, 4);
    }

    /* JADX INFO: renamed from: j */
    public static int m18574j(InputStream inputStream) {
        return (int) m18571g(inputStream, 1);
    }

    /* JADX INFO: renamed from: k */
    public static int m18575k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: renamed from: l */
    public static void m18576l(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            C10023w.m38841a("Unable to acquire a lock on the underlying file channel.");
            return;
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m18577m(OutputStream outputStream, byte[] bArr) throws IOException {
        m18581q(outputStream, bArr.length);
        byte[] bArrM18566b = m18566b(bArr);
        m18581q(outputStream, bArrM18566b.length);
        outputStream.write(bArrM18566b);
    }

    /* JADX INFO: renamed from: n */
    public static void m18578n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: o */
    public static void m18579o(OutputStream outputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: p */
    public static void m18580p(OutputStream outputStream, int i10) throws IOException {
        m18579o(outputStream, i10, 2);
    }

    /* JADX INFO: renamed from: q */
    public static void m18581q(OutputStream outputStream, long j10) throws IOException {
        m18579o(outputStream, j10, 4);
    }

    /* JADX INFO: renamed from: r */
    public static void m18582r(OutputStream outputStream, int i10) throws IOException {
        m18579o(outputStream, i10, 1);
    }
}
