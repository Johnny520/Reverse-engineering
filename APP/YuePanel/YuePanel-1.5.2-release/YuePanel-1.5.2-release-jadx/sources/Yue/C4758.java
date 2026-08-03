package Yue;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4758 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1102 = "ExifInterfaceUtils";

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۧ$ۥ */
    @InterfaceC7113(21)
    public static class C0483 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m1677(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static FileDescriptor m1678(FileDescriptor fileDescriptor) throws ErrnoException {
            return Os.dup(fileDescriptor);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static long m14426(FileDescriptor fileDescriptor, long j, int i) throws ErrnoException {
            return Os.lseek(fileDescriptor, j, i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۧ$ۥ۟ */
    @InterfaceC7113(23)
    public static class C0484 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m1679(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static String m1675(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1676(FileDescriptor fileDescriptor) {
        try {
            C0483.m1677(fileDescriptor);
        } catch (Exception unused) {
            Log.e(f1102, "Error closing fd.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m14420(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static long[] m14421(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m14422(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return i;
            }
            i += i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m14423(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static long m14424(String str) {
        try {
            int iMin = Math.min(str.length(), 3);
            long j = Long.parseLong(str.substring(0, iMin));
            while (iMin < 3) {
                j *= 10;
                iMin++;
            }
            return j;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m14425(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
