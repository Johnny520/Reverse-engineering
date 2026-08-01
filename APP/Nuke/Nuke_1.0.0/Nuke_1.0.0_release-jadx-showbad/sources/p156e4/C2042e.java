package p156e4;

import java.io.IOException;
import java.util.ArrayList;
import p061L2.AbstractC0972l;
import p095T.C1352b0;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p179i4.AbstractC2352g;
import p208n4.C2706e;
import p208n4.C2709h;
import p208n4.C2716o;

/* JADX INFO: renamed from: e4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2042e {

    /* JADX INFO: renamed from: c */
    public long f6804c;

    /* JADX INFO: renamed from: d */
    public final C2716o f6805d;

    /* JADX INFO: renamed from: g */
    public int f6808g;

    /* JADX INFO: renamed from: h */
    public int f6809h;

    /* JADX INFO: renamed from: a */
    public int f6802a = 4096;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6803b = new ArrayList();

    /* JADX INFO: renamed from: e */
    public C2041d[] f6806e = new C2041d[8];

    /* JADX INFO: renamed from: f */
    public int f6807f = 7;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2042e(C2057t c2057t) {
        this.f6805d = AbstractC2352g.m4199l(c2057t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3737a(C2041d c2041d) {
        this.f6803b.add(c2041d);
        long jMo4732a = this.f6804c + ((long) (c2041d.f6800b.mo4732a() + c2041d.f6799a.mo4732a()));
        this.f6804c = jMo4732a;
        if (jMo4732a > 262144) {
            throw new IOException("header byte count limit of 262144 exceeded");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x0008 */
    /* JADX INFO: renamed from: b */
    public final int m3738b(int i5) {
        int i6;
        int i7 = 0;
        if (i5 > 0) {
            int length = this.f6806e.length;
            while (true) {
                length--;
                i6 = this.f6807f;
                if (length < i6 || i5 <= 0) {
                    break;
                }
                C2041d c2041d = this.f6806e[length];
                AbstractC1665j.m2982b(c2041d);
                int i8 = c2041d.f6801c;
                i5 -= i8;
                this.f6809h -= i8;
                this.f6808g--;
                i7++;
            }
            C2041d[] c2041dArr = this.f6806e;
            System.arraycopy(c2041dArr, i6 + 1, c2041dArr, i6 + 1 + i7, this.f6808g);
            this.f6807f += i7;
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C2709h m3739c(int i5) throws IOException {
        if (i5 >= 0) {
            C2041d[] c2041dArr = AbstractC2044g.f6818a;
            if (i5 <= c2041dArr.length - 1) {
                return c2041dArr[i5].f6799a;
            }
        }
        int length = this.f6807f + 1 + (i5 - AbstractC2044g.f6818a.length);
        if (length >= 0) {
            C2041d[] c2041dArr2 = this.f6806e;
            if (length < c2041dArr2.length) {
                C2041d c2041d = c2041dArr2[length];
                AbstractC1665j.m2982b(c2041d);
                return c2041d.f6799a;
            }
        }
        throw new IOException("Header index too large " + (i5 + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3740d(C2041d c2041d) {
        m3737a(c2041d);
        int i5 = c2041d.f6801c;
        int i6 = this.f6802a;
        if (i5 > i6) {
            C2041d[] c2041dArr = this.f6806e;
            AbstractC0972l.m1998V(c2041dArr, 0, c2041dArr.length);
            this.f6807f = this.f6806e.length - 1;
            this.f6808g = 0;
            this.f6809h = 0;
            return;
        }
        m3738b((this.f6809h + i5) - i6);
        int i7 = this.f6808g + 1;
        C2041d[] c2041dArr2 = this.f6806e;
        if (i7 > c2041dArr2.length) {
            C2041d[] c2041dArr3 = new C2041d[c2041dArr2.length * 2];
            System.arraycopy(c2041dArr2, 0, c2041dArr3, c2041dArr2.length, c2041dArr2.length);
            this.f6807f = this.f6806e.length - 1;
            this.f6806e = c2041dArr3;
        }
        int i8 = this.f6807f;
        this.f6807f = i8 - 1;
        this.f6806e[i8] = c2041d;
        this.f6808g++;
        this.f6809h += i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C2709h m3741e() {
        C2716o c2716o = this.f6805d;
        byte b2 = c2716o.readByte();
        byte[] bArr = AbstractC1774e.f6072a;
        int i5 = b2 & 255;
        int i6 = 0;
        boolean z5 = (b2 & 128) == 128;
        long jM3742f = m3742f(i5, 127);
        if (this.f6804c + jM3742f > 262144) {
            throw new IOException("header byte count limit of 262144 exceeded");
        }
        if (!z5) {
            return c2716o.mo4714g(jM3742f);
        }
        C2706e c2706e = new C2706e();
        int[] iArr = AbstractC2034A.f6776a;
        AbstractC1665j.m2985e(c2716o, "source");
        C1352b0 c1352b0 = AbstractC2034A.f6778c;
        C1352b0 c1352b02 = c1352b0;
        int i7 = 0;
        for (long j5 = 0; j5 < jM3742f; j5++) {
            byte b5 = c2716o.readByte();
            byte[] bArr2 = AbstractC1774e.f6072a;
            i6 = (i6 << 8) | (b5 & 255);
            i7 += 8;
            while (i7 >= 8) {
                C1352b0[] c1352b0Arr = (C1352b0[]) c1352b02.f4788f;
                AbstractC1665j.m2982b(c1352b0Arr);
                c1352b02 = c1352b0Arr[(i6 >>> (i7 - 8)) & 255];
                AbstractC1665j.m2982b(c1352b02);
                if (((C1352b0[]) c1352b02.f4788f) == null) {
                    c2706e.m4705G(c1352b02.f4786d);
                    i7 -= c1352b02.f4787e;
                    c1352b02 = c1352b0;
                } else {
                    i7 -= 8;
                }
            }
        }
        while (i7 > 0) {
            C1352b0[] c1352b0Arr2 = (C1352b0[]) c1352b02.f4788f;
            AbstractC1665j.m2982b(c1352b0Arr2);
            C1352b0 c1352b03 = c1352b0Arr2[(i6 << (8 - i7)) & 255];
            AbstractC1665j.m2982b(c1352b03);
            int i8 = c1352b03.f4787e;
            if (((C1352b0[]) c1352b03.f4788f) != null || i8 > i7) {
                break;
            }
            c2706e.m4705G(c1352b03.f4786d);
            i7 -= i8;
            c1352b02 = c1352b0;
        }
        return c2706e.mo4714g(c2706e.f8629e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m3742f(int i5, int i6) {
        int i7 = i5 & i6;
        if (i7 < i6) {
            return i7;
        }
        long j5 = i6;
        int i8 = 0;
        int i9 = 0;
        while (i8 != 5) {
            byte b2 = this.f6805d.readByte();
            byte[] bArr = AbstractC1774e.f6072a;
            i8++;
            long j6 = ((long) (b2 & 127)) << i9;
            if (j6 > 2147483647L - j5) {
                throw new IOException("HPACK integer overflow");
            }
            j5 += j6;
            if ((b2 & 128) == 0) {
                return (int) j5;
            }
            i9 += 7;
        }
        throw new IOException("HPACK integer overflow");
    }
}
