package Yue;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4215 extends FilterInputStream {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final BufferedInputStream f8547;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f8548;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f8549;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long f8550;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public long f8551;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f8552;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f8553;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f8554;

    public C4215(BufferedInputStream bufferedInputStream, int i) {
        super(bufferedInputStream);
        this.f8551 = 0L;
        C8159.m26903(i >= 0);
        this.f8547 = bufferedInputStream;
        this.f8548 = i != 0;
        this.f8549 = i;
        this.f8552 = i;
        this.f8553 = -1;
        this.f8550 = System.nanoTime();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static ByteBuffer m12108(InputStream inputStream, int i) throws IOException {
        C8159.m26904(i >= 0, "maxSize must be 0 (unlimited) or larger");
        C8159.m26910(inputStream);
        boolean z = i > 0;
        int i2 = 32768;
        if (z && i < 32768) {
            i2 = i;
        }
        byte[] bArr = new byte[i2];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        while (true) {
            int i3 = inputStream.read(bArr, 0, z ? Math.min(i, i2) : i2);
            if (i3 == -1) {
                break;
            }
            if (z) {
                if (i3 >= i) {
                    byteArrayOutputStream.write(bArr, 0, i);
                    break;
                }
                i -= i3;
            }
            byteArrayOutputStream.write(bArr, 0, i3);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static C4215 m12109(InputStream inputStream, int i, int i2) {
        return inputStream instanceof C4215 ? (C4215) inputStream : inputStream instanceof BufferedInputStream ? new C4215((BufferedInputStream) inputStream, i2) : new C4215(new BufferedInputStream(inputStream, i), i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        super.mark(i);
        this.f8553 = this.f8549 - this.f8552;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f8554 || (this.f8548 && this.f8552 <= 0)) {
            return -1;
        }
        if (Thread.currentThread().isInterrupted()) {
            this.f8554 = true;
            return -1;
        }
        if (m1173()) {
            throw new SocketTimeoutException("Read timeout");
        }
        if (this.f8548 && i2 > (i3 = this.f8552)) {
            i2 = i3;
        }
        try {
            int i4 = super.read(bArr, i, i2);
            this.f8552 -= i4;
            return i4;
        } catch (SocketTimeoutException unused) {
            return 0;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.f8552 = this.f8549 - this.f8553;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m1173() {
        return this.f8551 != 0 && System.nanoTime() - this.f8550 > this.f8551;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public BufferedInputStream m12110() {
        return this.f8547;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C4215 m12111(long j, long j2) {
        this.f8550 = j;
        this.f8551 = j2 * C4720.f10089;
        return this;
    }
}
