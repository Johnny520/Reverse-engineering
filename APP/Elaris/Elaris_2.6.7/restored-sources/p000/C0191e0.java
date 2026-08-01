package p000;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: e0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0191e0 {

    /* JADX INFO: renamed from: b */
    public long f212b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public long f213c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: a */
    public final C0461t0 f211a = new C0461t0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m340a(File file, byte[] bArr) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            C0479u2.m1037b("status directory unavailable");
            return false;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            try {
                FileLock fileLockLock = channel.lock();
                try {
                    boolean z = channel.size() + ((long) bArr.length) > 1048576;
                    if (z) {
                        channel.truncate(0L);
                    }
                    channel.position(channel.size());
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    while (byteBufferWrap.hasRemaining()) {
                        channel.write(byteBufferWrap);
                    }
                    channel.force(false);
                    if (fileLockLock != null) {
                        fileLockLock.close();
                    }
                    channel.close();
                    randomAccessFile.close();
                    return z;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static long m341b(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: c */
    public final void m342c(long j, File file) {
        C0461t0 c0461t0 = this.f211a;
        if (file == null || !file.isFile()) {
            if (this.f213c != 0) {
                ((ConcurrentHashMap) c0461t0.f873c).clear();
            }
            this.f212b = 0L;
            this.f213c = 0L;
            return;
        }
        long jLastModified = file.lastModified();
        long length = file.length();
        if (jLastModified == this.f212b && length == this.f213c) {
            return;
        }
        ((ConcurrentHashMap) c0461t0.f873c).clear();
        C0461t0 c0461t02 = this.f211a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split("\t", -1);
                    if (strArrSplit.length >= 6 && strArrSplit.length <= 8) {
                        long jM341b = m341b(strArrSplit[0]);
                        if (jM341b > 0 && j >= jM341b && j - jM341b <= 31536000000L) {
                            String str = strArrSplit.length >= 7 ? strArrSplit[6] : "";
                            int iM1071x = strArrSplit.length == 8 ? AbstractC0486u9.m1071x((int) m341b(strArrSplit[7])) : 1;
                            c0461t02.m999e((int) m341b(strArrSplit[1]), strArrSplit[2], m341b(strArrSplit[3]), m341b(strArrSplit[4]), m341b(strArrSplit[5]), str, iM1071x == 0 ? 1 : iM1071x, jM341b);
                        }
                    }
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable unused) {
        }
        this.f212b = jLastModified;
        this.f213c = length;
    }
}
