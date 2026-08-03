package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000.AbstractC0213Ey;
import p000.AbstractC2374ph;

/* JADX INFO: renamed from: io.sentry.cache.tape.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1849h implements Closeable, Iterable {

    /* JADX INFO: renamed from: k */
    public static final byte[] f6658k = new byte[4096];

    /* JADX INFO: renamed from: a */
    public RandomAccessFile f6659a;

    /* JADX INFO: renamed from: b */
    public final File f6660b;

    /* JADX INFO: renamed from: c */
    public long f6661c;

    /* JADX INFO: renamed from: d */
    public int f6662d;

    /* JADX INFO: renamed from: e */
    public C1847f f6663e;

    /* JADX INFO: renamed from: f */
    public C1847f f6664f;

    /* JADX INFO: renamed from: g */
    public final byte[] f6665g = new byte[32];

    /* JADX INFO: renamed from: h */
    public int f6666h = 0;

    /* JADX INFO: renamed from: i */
    public final int f6667i;

    /* JADX INFO: renamed from: j */
    public boolean f6668j;

    public C1849h(File file, RandomAccessFile randomAccessFile, int i) throws IOException {
        this.f6660b = file;
        this.f6659a = randomAccessFile;
        this.f6667i = i;
        m4024s();
    }

    /* JADX INFO: renamed from: A */
    public static void m4018A(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* JADX INFO: renamed from: B */
    public static void m4019B(int i, long j, byte[] bArr) {
        bArr[i] = (byte) (j >> 56);
        bArr[i + 1] = (byte) (j >> 48);
        bArr[i + 2] = (byte) (j >> 40);
        bArr[i + 3] = (byte) (j >> 32);
        bArr[i + 4] = (byte) (j >> 24);
        bArr[i + 5] = (byte) (j >> 16);
        bArr[i + 6] = (byte) (j >> 8);
        bArr[i + 7] = (byte) j;
    }

    /* JADX INFO: renamed from: q */
    public static RandomAccessFile m4020q(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        return new RandomAccessFile(file, "rwd");
    }

    /* JADX INFO: renamed from: t */
    public static int m4021t(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: u */
    public static long m4022u(int i, byte[] bArr) {
        return ((((long) bArr[i]) & 255) << 56) + ((((long) bArr[i + 1]) & 255) << 48) + ((((long) bArr[i + 2]) & 255) << 40) + ((((long) bArr[i + 3]) & 255) << 32) + ((((long) bArr[i + 4]) & 255) << 24) + ((((long) bArr[i + 5]) & 255) << 16) + ((((long) bArr[i + 6]) & 255) << 8) + (((long) bArr[i + 7]) & 255);
    }

    public final void clear() throws IOException {
        if (this.f6668j) {
            throw new IllegalStateException("closed");
        }
        m4029z(4096L, 0, 0L, 0L);
        this.f6659a.seek(32L);
        this.f6659a.write(f6658k, 0, 4064);
        this.f6662d = 0;
        C1847f c1847f = C1847f.f6651c;
        this.f6663e = c1847f;
        this.f6664f = c1847f;
        if (this.f6661c > 4096) {
            this.f6659a.setLength(4096L);
            this.f6659a.getChannel().force(true);
        }
        this.f6661c = 4096L;
        this.f6666h++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6668j = true;
        this.f6659a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1848g(this);
    }

    /* JADX INFO: renamed from: r */
    public final C1847f m4023r(long j) {
        if (j != 0) {
            byte[] bArr = this.f6665g;
            if (m4026w(4, j, bArr)) {
                return new C1847f(m4021t(0, bArr), j);
            }
        }
        return C1847f.f6651c;
    }

    public final void remove(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2374ph.m4813j(i, "Cannot remove negative (", ") number of elements."));
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f6662d;
        if (i == i2) {
            clear();
            return;
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC0213Ey.m409g(AbstractC2374ph.m4816m(i, "Cannot remove more elements (", ") than present in queue ("), this.f6662d, ")."));
        }
        C1847f c1847f = this.f6663e;
        long j = c1847f.f6652a;
        int iM4021t = c1847f.f6653b;
        long jM4028y = j;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            j2 += (long) (iM4021t + 4);
            jM4028y = m4028y(jM4028y + 4 + ((long) iM4021t));
            byte[] bArr = this.f6665g;
            if (!m4026w(4, jM4028y, bArr)) {
                return;
            }
            iM4021t = m4021t(0, bArr);
        }
        m4029z(this.f6661c, this.f6662d - i, jM4028y, this.f6664f.f6652a);
        this.f6662d -= i;
        this.f6666h++;
        this.f6663e = new C1847f(iM4021t, jM4028y);
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, 4096);
            m4027x(iMin, j, f6658k);
            long j3 = iMin;
            j2 -= j3;
            j += j3;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4024s() throws IOException {
        this.f6659a.seek(0L);
        RandomAccessFile randomAccessFile = this.f6659a;
        byte[] bArr = this.f6665g;
        randomAccessFile.readFully(bArr);
        this.f6661c = m4022u(4, bArr);
        this.f6662d = m4021t(12, bArr);
        long jM4022u = m4022u(16, bArr);
        long jM4022u2 = m4022u(24, bArr);
        if (this.f6661c > this.f6659a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f6661c + ", Actual length: " + this.f6659a.length());
        }
        if (this.f6661c > 32) {
            this.f6663e = m4023r(jM4022u);
            this.f6664f = m4023r(jM4022u2);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.f6661c + ") is invalid.");
        }
    }

    public final String toString() {
        return "QueueFile{file=" + this.f6660b + ", zero=true, length=" + this.f6661c + ", size=" + this.f6662d + ", first=" + this.f6663e + ", last=" + this.f6664f + '}';
    }

    /* JADX INFO: renamed from: v */
    public final void m4025v() {
        this.f6659a.close();
        File file = this.f6660b;
        file.delete();
        this.f6659a = m4020q(file);
        m4024s();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4026w(int i, long j, byte[] bArr) throws IOException {
        try {
            long jM4028y = m4028y(j);
            long j2 = ((long) i) + jM4028y;
            long j3 = this.f6661c;
            if (j2 <= j3) {
                this.f6659a.seek(jM4028y);
                this.f6659a.readFully(bArr, 0, i);
                return true;
            }
            int i2 = (int) (j3 - jM4028y);
            this.f6659a.seek(jM4028y);
            this.f6659a.readFully(bArr, 0, i2);
            this.f6659a.seek(32L);
            this.f6659a.readFully(bArr, i2, i - i2);
            return true;
        } catch (EOFException unused) {
            m4025v();
            return false;
        } catch (IOException e) {
            throw e;
        } catch (Throwable unused2) {
            m4025v();
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m4027x(int i, long j, byte[] bArr) throws IOException {
        long jM4028y = m4028y(j);
        long j2 = ((long) i) + jM4028y;
        long j3 = this.f6661c;
        if (j2 <= j3) {
            this.f6659a.seek(jM4028y);
            this.f6659a.write(bArr, 0, i);
            return;
        }
        int i2 = (int) (j3 - jM4028y);
        this.f6659a.seek(jM4028y);
        this.f6659a.write(bArr, 0, i2);
        this.f6659a.seek(32L);
        this.f6659a.write(bArr, i2, i - i2);
    }

    /* JADX INFO: renamed from: y */
    public final long m4028y(long j) {
        long j2 = this.f6661c;
        return j < j2 ? j : (j + 32) - j2;
    }

    /* JADX INFO: renamed from: z */
    public final void m4029z(long j, int i, long j2, long j3) throws IOException {
        this.f6659a.seek(0L);
        byte[] bArr = this.f6665g;
        m4018A(bArr, 0, -2147483647);
        m4019B(4, j, bArr);
        m4018A(bArr, 12, i);
        m4019B(16, j2, bArr);
        m4019B(24, j3, bArr);
        this.f6659a.write(bArr, 0, 32);
    }
}
