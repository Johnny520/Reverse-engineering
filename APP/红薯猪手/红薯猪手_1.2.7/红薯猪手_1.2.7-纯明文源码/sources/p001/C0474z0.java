package p001;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۟.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0474z0 {

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final HashMap f1892 = new HashMap();

    /* JADX INFO: renamed from: ۥ */
    public final File f1219;

    /* JADX INFO: renamed from: ۥ۟ */
    public final Lock f1220;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean f1893;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public FileChannel f1894;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0474z0(String str, File file, boolean z) {
        Lock reentrantLock;
        File file2 = new File(file, str + ".lck");
        this.f1219 = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap map = f1892;
        synchronized (map) {
            reentrantLock = (Lock) map.get(absolutePath);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(absolutePath, reentrantLock);
            }
        }
        this.f1220 = reentrantLock;
        this.f1893 = z;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m973() {
        FileChannel fileChannel = this.f1894;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f1220.unlock();
    }
}
