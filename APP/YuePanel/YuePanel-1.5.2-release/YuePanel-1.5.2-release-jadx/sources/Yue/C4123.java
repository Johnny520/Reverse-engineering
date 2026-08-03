package Yue;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Yue.ۥ۟ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C4123 extends BufferedInputStream {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f8264;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f8265;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public long f8266;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long f8267;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f8268;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f8269;

    public C4123(InputStream inputStream, int i, int i2) {
        super(inputStream, i);
        this.f8267 = 0L;
        C8159.m26903(i2 >= 0);
        this.f8265 = i2;
        this.f8268 = i2;
        this.f8264 = i2 != 0;
        this.f8266 = System.nanoTime();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C4123 m11756(InputStream inputStream, int i, int i2) {
        return inputStream instanceof C4123 ? (C4123) inputStream : new C4123(inputStream, i, i2);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f8269 || (this.f8264 && this.f8268 <= 0)) {
            return -1;
        }
        if (Thread.currentThread().isInterrupted()) {
            this.f8269 = true;
            return -1;
        }
        if (m1090()) {
            throw new SocketTimeoutException("Read timeout");
        }
        if (this.f8264 && i2 > (i3 = this.f8268)) {
            i2 = i3;
        }
        try {
            int i4 = super.read(bArr, i, i2);
            this.f8268 -= i4;
            return i4;
        } catch (SocketTimeoutException unused) {
            return 0;
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.f8268 = this.f8265 - ((BufferedInputStream) this).markpos;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m1090() {
        return this.f8267 != 0 && System.nanoTime() - this.f8266 > this.f8267;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public ByteBuffer m11757(int i) throws IOException {
        return C4300.m12427(this, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C4123 m11758(long j, long j2) {
        this.f8266 = j;
        this.f8267 = j2 * C4720.f10089;
        return this;
    }
}
