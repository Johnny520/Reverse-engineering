package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class or0 implements ht2 {
    public byte h;
    public final o52 i;
    public final Inflater j;
    public final ez0 k;
    public final CRC32 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public or0(on onVar) {
        onVar.getClass();
        o52 o52Var = new o52(onVar);
        this.i = o52Var;
        Inflater inflater = new Inflater(true);
        this.j = inflater;
        this.k = new ez0(o52Var, inflater);
        this.l = new CRC32();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + pv2.w0(qp0.U(i2), 8) + " != expected 0x" + pv2.w0(qp0.U(i), 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final o23 a() {
        return this.i.h.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(fn fnVar, long j, long j2) {
        mm2 mm2Var = fnVar.h;
        mm2Var.getClass();
        while (true) {
            int i = mm2Var.c;
            int i2 = mm2Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            mm2Var = mm2Var.f;
            mm2Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) mm2Var.b) + j);
            int iMin = (int) Math.min(mm2Var.c - i3, j2);
            this.l.update(mm2Var.a, i3, iMin);
            j2 -= (long) iMin;
            mm2Var = mm2Var.f;
            mm2Var.getClass();
            j = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.k.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final long n(fn fnVar, long j) throws IOException {
        long j2;
        or0 or0Var = this;
        fnVar.getClass();
        byte b = or0Var.h;
        CRC32 crc32 = or0Var.l;
        o52 o52Var = or0Var.i;
        if (b == 0) {
            o52Var.x(10L);
            fn fnVar2 = o52Var.i;
            byte bO = fnVar2.o(3L);
            boolean z = ((bO >> 1) & 1) == 1;
            if (z) {
                or0Var.c(fnVar2, 0L, 10L);
            }
            b("ID1ID2", 8075, o52Var.readShort());
            o52Var.skip(8L);
            if (((bO >> 2) & 1) == 1) {
                o52Var.x(2L);
                if (z) {
                    c(fnVar2, 0L, 2L);
                }
                short s = fnVar2.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                o52Var.x(j3);
                if (z) {
                    c(fnVar2, 0L, j3);
                }
                o52Var.skip(j3);
            }
            if (((bO >> 3) & 1) == 1) {
                long jC = o52Var.c((byte) 0, 0L, Long.MAX_VALUE);
                if (jC == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    c(fnVar2, 0L, jC + 1);
                } else {
                    j2 = 2;
                }
                o52Var.skip(jC + 1);
            } else {
                j2 = 2;
            }
            if (((bO >> 4) & 1) == 1) {
                long j4 = j2;
                long jC2 = o52Var.c((byte) 0, 0L, Long.MAX_VALUE);
                if (jC2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    or0Var = this;
                    or0Var.c(fnVar2, 0L, jC2 + 1);
                } else {
                    or0Var = this;
                    j2 = j4;
                }
                o52Var.skip(jC2 + 1);
            } else {
                or0Var = this;
            }
            if (z) {
                o52Var.x(j2);
                short s2 = fnVar2.readShort();
                b("FHCRC", (short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            or0Var.h = (byte) 1;
        }
        if (or0Var.h == 1) {
            long j5 = fnVar.i;
            long jN = or0Var.k.n(fnVar, 8192L);
            if (jN != -1) {
                or0Var.c(fnVar, j5, jN);
                return jN;
            }
            or0Var.h = (byte) 2;
        }
        if (or0Var.h == 2) {
            b("CRC", o52Var.e(), (int) crc32.getValue());
            b("ISIZE", o52Var.e(), (int) or0Var.j.getBytesWritten());
            or0Var.h = (byte) 3;
            if (!o52Var.b()) {
                c80.v("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }
}
