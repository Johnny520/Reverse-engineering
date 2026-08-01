package p309v5;

import bsh.C1259t2;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import p376zd.C9987e;

/* JADX INFO: renamed from: v5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8822d {

    /* JADX INFO: renamed from: a */
    public final byte[] f29337a;

    /* JADX INFO: renamed from: b */
    public final int f29338b;

    /* JADX INFO: renamed from: c */
    public final int f29339c;

    /* JADX INFO: renamed from: v5.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends DataInputStream {

        /* JADX INFO: renamed from: q */
        public final b f29340q;

        public a(b bVar) {
            super(bVar);
            this.f29340q = bVar;
        }
    }

    public C8822d(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            C1259t2.m5095a("bytes == null");
            throw null;
        }
        if (i10 < 0) {
            C9987e.m38645a("start < 0");
            throw null;
        }
        if (i11 < i10) {
            C9987e.m38645a("end < start");
            throw null;
        }
        if (i11 > bArr.length) {
            C9987e.m38645a("end > bytes.length");
            throw null;
        }
        this.f29337a = bArr;
        this.f29338b = i10;
        this.f29339c = i11 - i10;
    }

    /* JADX INFO: renamed from: e */
    public final void m33849e(int i10, int i11) {
        if (i10 < 0 || i11 < i10 || i11 > this.f29339c) {
            throw new IllegalArgumentException("bad range: " + i10 + ".." + i11 + "; actual size " + this.f29339c);
        }
    }

    /* JADX INFO: renamed from: f */
    public int m33850f(int i10) {
        m33849e(i10, i10 + 1);
        return m33851g(i10);
    }

    /* JADX INFO: renamed from: g */
    public final int m33851g(int i10) {
        return this.f29337a[this.f29338b + i10];
    }

    /* JADX INFO: renamed from: h */
    public void m33852h(byte[] bArr, int i10) {
        int length = bArr.length - i10;
        int i11 = this.f29339c;
        if (length < i11) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(this.f29337a, this.f29338b, bArr, i10, i11);
    }

    /* JADX INFO: renamed from: i */
    public int m33853i(int i10) {
        m33849e(i10, i10 + 4);
        return m33857m(i10 + 3) | (m33851g(i10) << 24) | (m33857m(i10 + 1) << 16) | (m33857m(i10 + 2) << 8);
    }

    /* JADX INFO: renamed from: j */
    public long m33854j(int i10) {
        m33849e(i10, i10 + 8);
        int iM33851g = (m33851g(i10) << 24) | (m33857m(i10 + 1) << 16) | (m33857m(i10 + 2) << 8) | m33857m(i10 + 3);
        return (((long) (m33857m(i10 + 7) | (m33851g(i10 + 4) << 24) | (m33857m(i10 + 5) << 16) | (m33857m(i10 + 6) << 8))) & 4294967295L) | (((long) iM33851g) << 32);
    }

    /* JADX INFO: renamed from: k */
    public int m33855k(int i10) {
        m33849e(i10, i10 + 2);
        return m33857m(i10 + 1) | (m33851g(i10) << 8);
    }

    /* JADX INFO: renamed from: l */
    public int m33856l(int i10) {
        m33849e(i10, i10 + 1);
        return m33857m(i10);
    }

    /* JADX INFO: renamed from: m */
    public final int m33857m(int i10) {
        return this.f29337a[this.f29338b + i10] & 255;
    }

    /* JADX INFO: renamed from: n */
    public int m33858n(int i10) {
        m33849e(i10, i10 + 2);
        return m33857m(i10 + 1) | (m33857m(i10) << 8);
    }

    /* JADX INFO: renamed from: o */
    public a m33859o() {
        return new a(m33860p());
    }

    /* JADX INFO: renamed from: p */
    public b m33860p() {
        return new b();
    }

    /* JADX INFO: renamed from: q */
    public int m33861q() {
        return this.f29339c;
    }

    /* JADX INFO: renamed from: r */
    public C8822d m33862r(int i10, int i11) {
        m33849e(i10, i11);
        return new C8822d(Arrays.copyOfRange(this.f29337a, i10, i11));
    }

    /* JADX INFO: renamed from: v5.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b extends InputStream {

        /* JADX INFO: renamed from: q */
        public int f29341q = 0;

        /* JADX INFO: renamed from: r */
        public int f29342r = 0;

        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return C8822d.this.f29339c - this.f29341q;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f29342r = this.f29341q;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            int i12 = C8822d.this.f29339c - this.f29341q;
            if (i11 > i12) {
                i11 = i12;
            }
            System.arraycopy(C8822d.this.f29337a, this.f29341q + C8822d.this.f29338b, bArr, i10, i11);
            this.f29341q += i11;
            return i11;
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f29341q = this.f29342r;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f29341q >= C8822d.this.f29339c) {
                return -1;
            }
            int iM33857m = C8822d.this.m33857m(this.f29341q);
            this.f29341q++;
            return iM33857m;
        }
    }

    public C8822d(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
