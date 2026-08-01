package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ta */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0471ta {

    /* JADX INFO: renamed from: a */
    public final int f905a;

    /* JADX INFO: renamed from: b */
    public final FileOutputStream f906b;

    /* JADX INFO: renamed from: c */
    public final long f907c;

    /* JADX INFO: renamed from: d */
    public final String f908d;

    /* JADX INFO: renamed from: g */
    public int f911g;

    /* JADX INFO: renamed from: h */
    public int f912h;

    /* JADX INFO: renamed from: j */
    public int f914j;

    /* JADX INFO: renamed from: k */
    public long f915k;

    /* JADX INFO: renamed from: l */
    public long f916l;

    /* JADX INFO: renamed from: m */
    public long f917m;

    /* JADX INFO: renamed from: n */
    public int f918n;

    /* JADX INFO: renamed from: o */
    public boolean f919o;

    /* JADX INFO: renamed from: q */
    public long f921q;

    /* JADX INFO: renamed from: r */
    public int f922r;

    /* JADX INFO: renamed from: s */
    public int f923s;

    /* JADX INFO: renamed from: t */
    public double f924t;

    /* JADX INFO: renamed from: u */
    public short f925u;

    /* JADX INFO: renamed from: v */
    public short f926v;

    /* JADX INFO: renamed from: e */
    public final byte[] f909e = new byte[8192];

    /* JADX INFO: renamed from: f */
    public final byte[] f910f = new byte[32];

    /* JADX INFO: renamed from: i */
    public int f913i = 2;

    /* JADX INFO: renamed from: p */
    public final short[] f920p = new short[128];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0471ta(int i, FileOutputStream fileOutputStream, long j) {
        this.f905a = i <= 0 ? 8000 : i;
        this.f906b = fileOutputStream;
        this.f907c = j <= 0 ? Long.MAX_VALUE : j;
        this.f908d = "not enough storage for decoded audio";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1029a(ByteBuffer byteBuffer, int i, int i2, int i3) throws IOException {
        int iRound;
        double d = 0.0d;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            if (i3 == 4) {
                float fIntBitsToFloat = Float.intBitsToFloat((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24));
                if (Float.isNaN(fIntBitsToFloat) || Float.isInfinite(fIntBitsToFloat)) {
                    fIntBitsToFloat = 0.0f;
                }
                if (fIntBitsToFloat > 1.0f) {
                    fIntBitsToFloat = 1.0f;
                }
                if (fIntBitsToFloat < -1.0f) {
                    fIntBitsToFloat = -1.0f;
                }
                iRound = Math.round(fIntBitsToFloat * 32767.0f);
            } else if (i2 == 1) {
                iRound = ((byteBuffer.get() & 255) - 128) << 8;
            } else if (i2 == 2) {
                iRound = (short) ((byteBuffer.get() & 255) | (byteBuffer.get() << 8));
            } else if (i2 == 3) {
                int i6 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() << 16);
                if ((8388608 & i6) != 0) {
                    i6 |= -16777216;
                }
                iRound = i6 >> 8;
            } else {
                iRound = ((((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8)) | ((byteBuffer.get() & 255) << 16)) | (byteBuffer.get() << 24)) >> 16;
            }
            if (i3 == 4) {
                d = (((double) iRound) / 32767.0d) + d;
            } else {
                i4 += iRound;
            }
        }
        int iRound2 = i3 == 4 ? (int) Math.round((d / ((double) i)) * 32767.0d) : i4 / i;
        if (iRound2 > 32767) {
            iRound2 = 32767;
        } else if (iRound2 < -32768) {
            iRound2 = -32768;
        }
        int i7 = iRound2 <= 32767 ? iRound2 < -32768 ? -32768 : iRound2 : 32767;
        int i8 = this.f911g;
        long j = this.f915k;
        if (i8 == this.f905a) {
            this.f915k = j + 1;
            m1032d(i7);
            return;
        }
        if (j == 0) {
            this.f925u = (short) i7;
        }
        short s = (short) i7;
        this.f926v = s;
        int i9 = this.f923s;
        short[] sArr = this.f920p;
        if (i9 == sArr.length) {
            m1030b(this.f921q + 1);
            if (this.f923s == sArr.length) {
                C0479u2.m1038c("audio resampler buffer overflow");
                return;
            }
        }
        int i10 = this.f922r;
        int i11 = this.f923s;
        sArr[(i10 + i11) % sArr.length] = s;
        this.f923s = i11 + 1;
        this.f915k++;
        while (((long) Math.floor(this.f924t)) + 16 < this.f915k) {
            m1031c(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1030b(long j) {
        while (true) {
            int i = this.f923s;
            if (i <= 0) {
                return;
            }
            long j2 = this.f921q;
            if (j2 >= j) {
                return;
            }
            this.f922r = (this.f922r + 1) % this.f920p.length;
            this.f921q = j2 + 1;
            this.f923s = i - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1031c(boolean z) throws IOException {
        double d = this.f905a;
        double dMin = Math.min(1.0d, d / ((double) this.f911g)) * 0.98d;
        long jFloor = (long) Math.floor(this.f924t);
        int i = -16;
        double d2 = 0.0d;
        double dM1034f = 0.0d;
        while (i <= 16) {
            long j = ((long) i) + jFloor;
            double d3 = d;
            double d4 = j - this.f924t;
            double dAbs = Math.abs(d4) / 16.0d;
            if (dAbs <= 1.0d) {
                double d5 = 3.141592653589793d * dMin * d4;
                double dSin = (Math.abs(d5) < 1.0E-12d ? 1.0d : Math.sin(d5) / d5) * dMin * ((Math.cos(dAbs * 6.283185307179586d) * 0.08d) + (Math.cos(dAbs * 3.141592653589793d) * 0.5d) + 0.42d);
                dM1034f += ((double) m1034f(j, z)) * dSin;
                d2 += dSin;
            }
            i++;
            d = d3;
        }
        double d6 = d;
        m1032d(d2 == 0.0d ? m1034f(jFloor, z) : (int) Math.round(dM1034f / d2));
        double d7 = (((double) this.f911g) / d6) + this.f924t;
        this.f924t = d7;
        m1030b(((long) Math.floor(d7)) - 17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013 A[PHI: r0
  0x0013: PHI (r0v10 int) = (r0v4 int), (r0v5 int) binds: [B:5:0x0011, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1032d(int i) throws IOException {
        long j = this.f917m;
        int i2 = this.f918n;
        if (j + ((long) i2) + 2 > this.f907c) {
            C0479u2.m1038c(this.f908d);
            return;
        }
        int i3 = 32767;
        if (i > 32767) {
            i = i3;
        } else {
            i3 = -32768;
            if (i < -32768) {
            }
        }
        int i4 = i2 + 1;
        this.f918n = i4;
        byte[] bArr = this.f909e;
        bArr[i2] = (byte) (i & 255);
        int i5 = i2 + 2;
        this.f918n = i5;
        bArr[i4] = (byte) ((i >> 8) & 255);
        this.f916l++;
        if (i5 != bArr.length || i5 <= 0) {
            return;
        }
        this.f906b.write(bArr, 0, i5);
        this.f917m += (long) this.f918n;
        this.f918n = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1033e() throws IOException {
        int i;
        if (this.f919o) {
            return;
        }
        this.f919o = true;
        if (this.f914j != 0) {
            C0479u2.m1038c("audio decode incomplete pcm frame");
            return;
        }
        int i2 = this.f911g;
        if (i2 > 0) {
            long j = this.f915k;
            if (j > 0 && i2 != (i = this.f905a)) {
                long jMax = Math.max(1L, Math.round((j * ((double) i)) / ((double) i2)));
                while (this.f916l < jMax) {
                    m1031c(true);
                }
            }
        }
        int i3 = this.f918n;
        if (i3 <= 0) {
            return;
        }
        this.f906b.write(this.f909e, 0, i3);
        this.f917m += (long) this.f918n;
        this.f918n = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m1034f(long j, boolean z) throws IOException {
        if (j < 0) {
            return this.f925u;
        }
        if (j >= this.f915k) {
            if (z) {
                return this.f926v;
            }
            C0479u2.m1038c("audio resampler read ahead");
            return 0;
        }
        long j2 = j - this.f921q;
        if (j2 < 0 || j2 >= this.f923s) {
            C0479u2.m1038c("audio resampler state invalid");
            return 0;
        }
        int i = this.f922r + ((int) j2);
        short[] sArr = this.f920p;
        return sArr[i % sArr.length];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0014  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1035g(ByteBuffer byteBuffer, int i, int i2, int i3) throws IOException {
        if (this.f919o) {
            return;
        }
        if (i <= 0) {
            i = this.f905a;
        }
        int i4 = 1;
        if (i2 <= 0) {
            i2 = 1;
        }
        if (i2 > 8) {
            C0479u2.m1038c("audio decode channel count unsupported");
            return;
        }
        if (i3 != 4) {
            if (i3 != 3) {
                i4 = 2;
                if (i3 != 2) {
                    i4 = i3 == 21 ? 3 : i3 == 22 ? 4 : 0;
                }
            }
        }
        if (i4 <= 0) {
            C0479u2.m1038c("audio decode pcm encoding unsupported");
            return;
        }
        int i5 = this.f911g;
        if (i5 <= 0) {
            this.f911g = i;
            this.f912h = i2;
            this.f913i = i3;
        } else if (i != i5 || i2 != this.f912h || i3 != this.f913i) {
            if (this.f915k > 0 || this.f914j != 0) {
                C0479u2.m1038c("audio decode format changed");
                return;
            } else {
                this.f911g = i;
                this.f912h = i2;
                this.f913i = i3;
            }
        }
        int i6 = i2 * i4;
        while (byteBuffer.hasRemaining()) {
            if (this.f914j != 0 || byteBuffer.remaining() < i6) {
                int iMin = Math.min(i6 - this.f914j, byteBuffer.remaining());
                int i7 = this.f914j;
                byte[] bArr = this.f910f;
                byteBuffer.get(bArr, i7, iMin);
                int i8 = this.f914j + iMin;
                this.f914j = i8;
                if (i8 == i6) {
                    m1029a(ByteBuffer.wrap(bArr, 0, i6), i2, i4, i3);
                    this.f914j = 0;
                }
            } else {
                m1029a(byteBuffer, i2, i4, i3);
            }
        }
    }
}
