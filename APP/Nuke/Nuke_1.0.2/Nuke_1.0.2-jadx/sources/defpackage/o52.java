package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o52 implements on {
    public final ht2 h;
    public final fn i;
    public boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o52(ht2 ht2Var) {
        ht2Var.getClass();
        this.h = ht2Var;
        this.i = new fn();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final InputStream C() {
        return new dn(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final o23 a() {
        return this.h.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        if (this.j) {
            s.l("closed");
            return false;
        }
        fn fnVar = this.i;
        return fnVar.k() && this.h.n(fnVar, 8192L) == -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long c(byte b, long j, long j2) {
        if (this.j) {
            s.l("closed");
            return 0L;
        }
        if (0 > j2) {
            s.f("fromIndex=0 toIndex=", j2);
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            fn fnVar = this.i;
            byte b2 = b;
            long j3 = j2;
            long jP = fnVar.p(b2, jMax, j3);
            if (jP != -1) {
                return jP;
            }
            long j4 = fnVar.i;
            if (j4 >= j3 || this.h.n(fnVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.h.close();
        this.i.g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() throws EOFException {
        x(4L);
        int i = this.i.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final no f(long j) throws EOFException {
        x(j);
        return this.i.f(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(long j) {
        fn fnVar;
        if (j < 0) {
            s.f("byteCount < 0: ", j);
            return false;
        }
        if (this.j) {
            s.l("closed");
            return false;
        }
        do {
            fnVar = this.i;
            if (fnVar.i >= j) {
                return true;
            }
        } while (this.h.n(fnVar, 8192L) != -1);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final long i(fn fnVar) {
        fn fnVar2;
        long j = 0;
        while (true) {
            ht2 ht2Var = this.h;
            fnVar2 = this.i;
            if (ht2Var.n(fnVar2, 8192L) == -1) {
                break;
            }
            long jH = fnVar2.h();
            if (jH > 0) {
                j += jH;
                fnVar.d(fnVar2, jH);
            }
        }
        long j2 = fnVar2.i;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        fnVar.d(fnVar2, j2);
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final int m(nv1 nv1Var) throws EOFException {
        nv1Var.getClass();
        if (this.j) {
            s.l("closed");
            return 0;
        }
        while (true) {
            fn fnVar = this.i;
            int iB = e.b(fnVar, nv1Var, true);
            if (iB != -2) {
                if (iB != -1) {
                    fnVar.skip(nv1Var.h[iB].a());
                    return iB;
                }
            } else if (this.h.n(fnVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final long n(fn fnVar, long j) {
        fnVar.getClass();
        if (j < 0) {
            s.f("byteCount < 0: ", j);
            return 0L;
        }
        if (this.j) {
            s.l("closed");
            return 0L;
        }
        fn fnVar2 = this.i;
        if (fnVar2.i == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.h.n(fnVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return fnVar2.n(fnVar, Math.min(j, fnVar2.i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        fn fnVar = this.i;
        if (fnVar.i == 0 && this.h.n(fnVar, 8192L) == -1) {
            return -1;
        }
        return fnVar.read(byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final byte readByte() throws EOFException {
        x(1L);
        return this.i.readByte();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final int readInt() throws EOFException {
        x(4L);
        return this.i.readInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final short readShort() throws EOFException {
        x(2L);
        return this.i.readShort();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final String s(long j) throws EOFException {
        if (j < 0) {
            s.f("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jC = c((byte) 10, 0L, j2);
        fn fnVar = this.i;
        if (jC != -1) {
            return e.a(fnVar, jC);
        }
        if (j2 < Long.MAX_VALUE && g(j2) && fnVar.o(j2 - 1) == 13 && g(j2 + 1) && fnVar.o(j2) == 10) {
            return e.a(fnVar, j2);
        }
        fn fnVar2 = new fn();
        fnVar.j(fnVar2, 0L, Math.min(32L, fnVar.i));
        throw new EOFException("\\n not found: limit=" + Math.min(fnVar.i, j) + " content=" + fnVar2.f(fnVar2.i).b() + (char) 8230);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final void skip(long j) throws EOFException {
        if (this.j) {
            s.l("closed");
            return;
        }
        while (j > 0) {
            fn fnVar = this.i;
            if (fnVar.i == 0 && this.h.n(fnVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, fnVar.i);
            fnVar.skip(jMin);
            j -= jMin;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "buffer(" + this.h + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final void x(long j) throws EOFException {
        if (!g(j)) {
            throw new EOFException();
        }
    }
}
