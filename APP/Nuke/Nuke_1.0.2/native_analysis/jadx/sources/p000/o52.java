package p000;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o52 implements InterfaceC0549on {

    /* JADX INFO: renamed from: h */
    public final ht2 f7529h;

    /* JADX INFO: renamed from: i */
    public final C0209fn f7530i;

    /* JADX INFO: renamed from: j */
    public boolean f7531j;

    public o52(ht2 ht2Var) {
        ht2Var.getClass();
        this.f7529h = ht2Var;
        this.f7530i = new C0209fn();
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: C */
    public final InputStream mo1668C() {
        return new C0136dn(this, 1);
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: a */
    public final o23 mo889a() {
        return this.f7529h.mo889a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3509b() {
        if (this.f7531j) {
            C0676s.m4653l("closed");
            return false;
        }
        C0209fn c0209fn = this.f7530i;
        return c0209fn.m1683k() && this.f7529h.mo891n(c0209fn, 8192L) == -1;
    }

    /* JADX INFO: renamed from: c */
    public final long m3510c(byte b, long j, long j2) {
        if (this.f7531j) {
            C0676s.m4653l("closed");
            return 0L;
        }
        if (0 > j2) {
            C0676s.m4647f("fromIndex=0 toIndex=", j2);
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            C0209fn c0209fn = this.f7530i;
            byte b2 = b;
            long j3 = j2;
            long jM1687p = c0209fn.m1687p(b2, jMax, j3);
            if (jM1687p != -1) {
                return jM1687p;
            }
            long j4 = c0209fn.f3068i;
            if (j4 >= j3 || this.f7529h.mo891n(c0209fn, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f7531j) {
            return;
        }
        this.f7531j = true;
        this.f7529h.close();
        this.f7530i.m1679g();
    }

    /* JADX INFO: renamed from: e */
    public final int m3511e() throws EOFException {
        mo1695x(4L);
        int i = this.f7530i.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: f */
    public final C0505no mo1678f(long j) throws EOFException {
        mo1695x(j);
        return this.f7530i.mo1678f(j);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3512g(long j) {
        C0209fn c0209fn;
        if (j < 0) {
            C0676s.m4647f("byteCount < 0: ", j);
            return false;
        }
        if (this.f7531j) {
            C0676s.m4653l("closed");
            return false;
        }
        do {
            c0209fn = this.f7530i;
            if (c0209fn.f3068i >= j) {
                return true;
            }
        } while (this.f7529h.mo891n(c0209fn, 8192L) != -1);
        return false;
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: i */
    public final long mo1681i(C0209fn c0209fn) {
        C0209fn c0209fn2;
        long j = 0;
        while (true) {
            ht2 ht2Var = this.f7529h;
            c0209fn2 = this.f7530i;
            if (ht2Var.mo891n(c0209fn2, 8192L) == -1) {
                break;
            }
            long jM1680h = c0209fn2.m1680h();
            if (jM1680h > 0) {
                j += jM1680h;
                c0209fn.mo1175d(c0209fn2, jM1680h);
            }
        }
        long j2 = c0209fn2.f3068i;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        c0209fn.mo1175d(c0209fn2, j2);
        return j3;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7531j;
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: m */
    public final int mo1685m(nv1 nv1Var) throws EOFException {
        nv1Var.getClass();
        if (this.f7531j) {
            C0676s.m4653l("closed");
            return 0;
        }
        while (true) {
            C0209fn c0209fn = this.f7530i;
            int iM1212b = AbstractC0148e.m1212b(c0209fn, nv1Var, true);
            if (iM1212b != -2) {
                if (iM1212b != -1) {
                    c0209fn.skip(nv1Var.f7344h[iM1212b].mo3322a());
                    return iM1212b;
                }
            } else if (this.f7529h.mo891n(c0209fn, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) {
        c0209fn.getClass();
        if (j < 0) {
            C0676s.m4647f("byteCount < 0: ", j);
            return 0L;
        }
        if (this.f7531j) {
            C0676s.m4653l("closed");
            return 0L;
        }
        C0209fn c0209fn2 = this.f7530i;
        if (c0209fn2.f3068i == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f7529h.mo891n(c0209fn2, 8192L) == -1) {
                return -1L;
            }
        }
        return c0209fn2.mo891n(c0209fn, Math.min(j, c0209fn2.f3068i));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C0209fn c0209fn = this.f7530i;
        if (c0209fn.f3068i == 0 && this.f7529h.mo891n(c0209fn, 8192L) == -1) {
            return -1;
        }
        return c0209fn.read(byteBuffer);
    }

    @Override // p000.InterfaceC0549on
    public final byte readByte() throws EOFException {
        mo1695x(1L);
        return this.f7530i.readByte();
    }

    @Override // p000.InterfaceC0549on
    public final int readInt() throws EOFException {
        mo1695x(4L);
        return this.f7530i.readInt();
    }

    @Override // p000.InterfaceC0549on
    public final short readShort() throws EOFException {
        mo1695x(2L);
        return this.f7530i.readShort();
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: s */
    public final String mo1690s(long j) throws EOFException {
        if (j < 0) {
            C0676s.m4647f("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM3510c = m3510c((byte) 10, 0L, j2);
        C0209fn c0209fn = this.f7530i;
        if (jM3510c != -1) {
            return AbstractC0148e.m1211a(c0209fn, jM3510c);
        }
        if (j2 < Long.MAX_VALUE && m3512g(j2) && c0209fn.m1686o(j2 - 1) == 13 && m3512g(j2 + 1) && c0209fn.m1686o(j2) == 10) {
            return AbstractC0148e.m1211a(c0209fn, j2);
        }
        C0209fn c0209fn2 = new C0209fn();
        c0209fn.m1682j(c0209fn2, 0L, Math.min(32L, c0209fn.f3068i));
        throw new EOFException("\\n not found: limit=" + Math.min(c0209fn.f3068i, j) + " content=" + c0209fn2.mo1678f(c0209fn2.f3068i).mo3323b() + (char) 8230);
    }

    @Override // p000.InterfaceC0549on
    public final void skip(long j) throws EOFException {
        if (this.f7531j) {
            C0676s.m4653l("closed");
            return;
        }
        while (j > 0) {
            C0209fn c0209fn = this.f7530i;
            if (c0209fn.f3068i == 0 && this.f7529h.mo891n(c0209fn, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c0209fn.f3068i);
            c0209fn.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f7529h + ')';
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: x */
    public final void mo1695x(long j) throws EOFException {
        if (!m3512g(j)) {
            throw new EOFException();
        }
    }
}
