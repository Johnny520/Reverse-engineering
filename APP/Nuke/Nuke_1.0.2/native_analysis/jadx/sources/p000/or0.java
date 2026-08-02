package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class or0 implements ht2 {

    /* JADX INFO: renamed from: h */
    public byte f7802h;

    /* JADX INFO: renamed from: i */
    public final o52 f7803i;

    /* JADX INFO: renamed from: j */
    public final Inflater f7804j;

    /* JADX INFO: renamed from: k */
    public final ez0 f7805k;

    /* JADX INFO: renamed from: l */
    public final CRC32 f7806l;

    public or0(InterfaceC0549on interfaceC0549on) {
        interfaceC0549on.getClass();
        o52 o52Var = new o52(interfaceC0549on);
        this.f7803i = o52Var;
        Inflater inflater = new Inflater(true);
        this.f7804j = inflater;
        this.f7805k = new ez0(o52Var, inflater);
        this.f7806l = new CRC32();
    }

    /* JADX INFO: renamed from: b */
    public static void m3611b(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + pv2.m4010w0(qp0.m4239U(i2), 8) + " != expected 0x" + pv2.m4010w0(qp0.m4239U(i), 8));
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: a */
    public final o23 mo889a() {
        return this.f7803i.f7529h.mo889a();
    }

    /* JADX INFO: renamed from: c */
    public final void m3612c(C0209fn c0209fn, long j, long j2) {
        mm2 mm2Var = c0209fn.f3067h;
        mm2Var.getClass();
        while (true) {
            int i = mm2Var.f6723c;
            int i2 = mm2Var.f6722b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            mm2Var = mm2Var.f6726f;
            mm2Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) mm2Var.f6722b) + j);
            int iMin = (int) Math.min(mm2Var.f6723c - i3, j2);
            this.f7806l.update(mm2Var.f6721a, i3, iMin);
            j2 -= (long) iMin;
            mm2Var = mm2Var.f6726f;
            mm2Var.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7805k.close();
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) throws IOException {
        long j2;
        or0 or0Var = this;
        c0209fn.getClass();
        byte b = or0Var.f7802h;
        CRC32 crc32 = or0Var.f7806l;
        o52 o52Var = or0Var.f7803i;
        if (b == 0) {
            o52Var.mo1695x(10L);
            C0209fn c0209fn2 = o52Var.f7530i;
            byte bM1686o = c0209fn2.m1686o(3L);
            boolean z = ((bM1686o >> 1) & 1) == 1;
            if (z) {
                or0Var.m3612c(c0209fn2, 0L, 10L);
            }
            m3611b("ID1ID2", 8075, o52Var.readShort());
            o52Var.skip(8L);
            if (((bM1686o >> 2) & 1) == 1) {
                o52Var.mo1695x(2L);
                if (z) {
                    m3612c(c0209fn2, 0L, 2L);
                }
                short s = c0209fn2.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                o52Var.mo1695x(j3);
                if (z) {
                    m3612c(c0209fn2, 0L, j3);
                }
                o52Var.skip(j3);
            }
            if (((bM1686o >> 3) & 1) == 1) {
                long jM3510c = o52Var.m3510c((byte) 0, 0L, Long.MAX_VALUE);
                if (jM3510c == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    m3612c(c0209fn2, 0L, jM3510c + 1);
                } else {
                    j2 = 2;
                }
                o52Var.skip(jM3510c + 1);
            } else {
                j2 = 2;
            }
            if (((bM1686o >> 4) & 1) == 1) {
                long j4 = j2;
                long jM3510c2 = o52Var.m3510c((byte) 0, 0L, Long.MAX_VALUE);
                if (jM3510c2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    or0Var = this;
                    or0Var.m3612c(c0209fn2, 0L, jM3510c2 + 1);
                } else {
                    or0Var = this;
                    j2 = j4;
                }
                o52Var.skip(jM3510c2 + 1);
            } else {
                or0Var = this;
            }
            if (z) {
                o52Var.mo1695x(j2);
                short s2 = c0209fn2.readShort();
                m3611b("FHCRC", (short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            or0Var.f7802h = (byte) 1;
        }
        if (or0Var.f7802h == 1) {
            long j5 = c0209fn.f3068i;
            long jMo891n = or0Var.f7805k.mo891n(c0209fn, 8192L);
            if (jMo891n != -1) {
                or0Var.m3612c(c0209fn, j5, jMo891n);
                return jMo891n;
            }
            or0Var.f7802h = (byte) 2;
        }
        if (or0Var.f7802h == 2) {
            m3611b("CRC", o52Var.m3511e(), (int) crc32.getValue());
            m3611b("ISIZE", o52Var.m3511e(), (int) or0Var.f7804j.getBytesWritten());
            or0Var.f7802h = (byte) 3;
            if (!o52Var.m3509b()) {
                c80.m678v("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }
}
