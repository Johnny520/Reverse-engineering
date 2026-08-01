package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p238.C8810;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4363 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11520;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11521;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4363(C8810 c8810) {
        super(c8810);
        this.f11521 = 2;
        this.f11520 = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f11521) {
            case 0:
                return Math.min(super.available(), this.f11520);
            case 1:
                return Math.min(super.available(), this.f11520);
            default:
                int i = this.f11520;
                return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f11521) {
            case 2:
                synchronized (this) {
                    super.mark(i);
                    this.f11520 = i;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f11521) {
            case 0:
                int i3 = this.f11520;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f11520 -= i4;
                }
                return i4;
            case 1:
                int i5 = this.f11520;
                if (i5 <= 0) {
                    return -1;
                }
                int i6 = super.read(bArr, i, Math.min(i2, i5));
                if (i6 >= 0) {
                    this.f11520 -= i6;
                }
                return i6;
            default:
                int iM8318 = (int) m8318(i2);
                if (iM8318 == -1) {
                    return -1;
                }
                int i7 = super.read(bArr, i, iM8318);
                m8317(i7);
                return i7;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f11521) {
            case 2:
                synchronized (this) {
                    super.reset();
                    this.f11520 = Integer.MIN_VALUE;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        switch (this.f11521) {
            case 0:
                int iSkip = (int) super.skip(Math.min(j, this.f11520));
                if (iSkip >= 0) {
                    this.f11520 -= iSkip;
                }
                return iSkip;
            case 1:
                long jSkip = super.skip(Math.min(j, this.f11520));
                if (jSkip >= 0) {
                    this.f11520 = (int) (((long) this.f11520) - jSkip);
                }
                return jSkip;
            default:
                long jM8318 = m8318(j);
                if (jM8318 == -1) {
                    return 0L;
                }
                long jSkip2 = super.skip(jM8318);
                m8317(jSkip2);
                return jSkip2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m8317(long j) {
        int i = this.f11520;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f11520 = (int) (((long) i) - j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long m8318(long j) {
        int i = this.f11520;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4363(InputStream inputStream, int i, int i2) {
        super(inputStream);
        this.f11521 = i2;
        this.f11520 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f11521) {
            case 0:
                if (this.f11520 <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f11520--;
                }
                return i;
            case 1:
                if (this.f11520 <= 0) {
                    return -1;
                }
                int i2 = super.read();
                if (i2 >= 0) {
                    this.f11520--;
                }
                return i2;
            default:
                if (m8318(1L) == -1) {
                    return -1;
                }
                int i3 = super.read();
                m8317(1L);
                return i3;
        }
    }
}
