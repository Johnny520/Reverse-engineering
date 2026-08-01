package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p222.C7980;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3530 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11171;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3530(C7980 c7980) {
        super(c7980);
        this.f11171 = 2;
        this.f11170 = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f11171) {
            case 0:
                return Math.min(super.available(), this.f11170);
            case 1:
                return Math.min(super.available(), this.f11170);
            default:
                int i = this.f11170;
                return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f11171) {
            case 2:
                synchronized (this) {
                    super.mark(i);
                    this.f11170 = i;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f11171) {
            case 0:
                int i3 = this.f11170;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f11170 -= i4;
                }
                return i4;
            case 1:
                int i5 = this.f11170;
                if (i5 <= 0) {
                    return -1;
                }
                int i6 = super.read(bArr, i, Math.min(i2, i5));
                if (i6 >= 0) {
                    this.f11170 -= i6;
                }
                return i6;
            default:
                int iM7772 = (int) m7772(i2);
                if (iM7772 == -1) {
                    return -1;
                }
                int i7 = super.read(bArr, i, iM7772);
                m7771(i7);
                return i7;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f11171) {
            case 2:
                synchronized (this) {
                    super.reset();
                    this.f11170 = Integer.MIN_VALUE;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        switch (this.f11171) {
            case 0:
                int iSkip = (int) super.skip(Math.min(j, this.f11170));
                if (iSkip >= 0) {
                    this.f11170 -= iSkip;
                }
                return iSkip;
            case 1:
                long jSkip = super.skip(Math.min(j, this.f11170));
                if (jSkip >= 0) {
                    this.f11170 = (int) (((long) this.f11170) - jSkip);
                }
                return jSkip;
            default:
                long jM7772 = m7772(j);
                if (jM7772 == -1) {
                    return 0L;
                }
                long jSkip2 = super.skip(jM7772);
                m7771(jSkip2);
                return jSkip2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m7771(long j) {
        int i = this.f11170;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f11170 = (int) (((long) i) - j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long m7772(long j) {
        int i = this.f11170;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3530(InputStream inputStream, int i, int i2) {
        super(inputStream);
        this.f11171 = i2;
        this.f11170 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f11171) {
            case 0:
                if (this.f11170 <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f11170--;
                }
                return i;
            case 1:
                if (this.f11170 <= 0) {
                    return -1;
                }
                int i2 = super.read();
                if (i2 >= 0) {
                    this.f11170--;
                }
                return i2;
            default:
                if (m7772(1L) == -1) {
                    return -1;
                }
                int i3 = super.read();
                m7771(1L);
                return i3;
        }
    }
}
