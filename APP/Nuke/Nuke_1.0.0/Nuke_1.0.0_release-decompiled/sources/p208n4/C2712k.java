package p208n4;

import com.bumptech.glide.AbstractC1926h;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1976d;

/* JADX INFO: renamed from: n4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2712k implements InterfaceC2722u {

    /* JADX INFO: renamed from: d */
    public byte f8636d;

    /* JADX INFO: renamed from: e */
    public final C2716o f8637e;

    /* JADX INFO: renamed from: f */
    public final Inflater f8638f;

    /* JADX INFO: renamed from: g */
    public final C2713l f8639g;

    /* JADX INFO: renamed from: h */
    public final CRC32 f8640h;

    public C2712k(InterfaceC2708g interfaceC2708g) {
        AbstractC1665j.m2985e(interfaceC2708g, "source");
        C2716o c2716o = new C2716o(interfaceC2708g);
        this.f8637e = c2716o;
        Inflater inflater = new Inflater(true);
        this.f8638f = inflater;
        this.f8639g = new C2713l(c2716o, inflater);
        this.f8640h = new CRC32();
    }

    /* JADX INFO: renamed from: b */
    public static void m4750b(int i5, int i6, String str) throws IOException {
        if (i6 == i5) {
            return;
        }
        throw new IOException(str + ": actual 0x" + AbstractC1976d.m3640h0(AbstractC1926h.m3553F(i6), 8) + " != expected 0x" + AbstractC1976d.m3640h0(AbstractC1926h.m3553F(i5), 8));
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3157a() {
        return this.f8637e.f8650d.mo3157a();
    }

    /* JADX INFO: renamed from: c */
    public final void m4751c(C2706e c2706e, long j5, long j6) {
        C2717p c2717p = c2706e.f8628d;
        AbstractC1665j.m2982b(c2717p);
        while (true) {
            int i5 = c2717p.f8655c;
            int i6 = c2717p.f8654b;
            if (j5 < i5 - i6) {
                break;
            }
            j5 -= (long) (i5 - i6);
            c2717p = c2717p.f8658f;
            AbstractC1665j.m2982b(c2717p);
        }
        while (j6 > 0) {
            int i7 = (int) (((long) c2717p.f8654b) + j5);
            int iMin = (int) Math.min(c2717p.f8655c - i7, j6);
            this.f8640h.update(c2717p.f8653a, i7, iMin);
            j6 -= (long) iMin;
            c2717p = c2717p.f8658f;
            AbstractC1665j.m2982b(c2717p);
            j5 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8639g.close();
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) throws IOException {
        long j6;
        C2712k c2712k = this;
        AbstractC1665j.m2985e(c2706e, "sink");
        byte b2 = c2712k.f8636d;
        CRC32 crc32 = c2712k.f8640h;
        C2716o c2716o = c2712k.f8637e;
        if (b2 == 0) {
            c2716o.mo4727u(10L);
            C2706e c2706e2 = c2716o.f8651e;
            byte bM4721n = c2706e2.m4721n(3L);
            boolean z5 = ((bM4721n >> 1) & 1) == 1;
            if (z5) {
                c2712k.m4751c(c2706e2, 0L, 10L);
            }
            m4750b(8075, c2716o.readShort(), "ID1ID2");
            c2716o.skip(8L);
            if (((bM4721n >> 2) & 1) == 1) {
                c2716o.mo4727u(2L);
                if (z5) {
                    m4751c(c2706e2, 0L, 2L);
                }
                short s5 = c2706e2.readShort();
                long j7 = ((short) (((s5 & 255) << 8) | ((s5 & 65280) >>> 8))) & 65535;
                c2716o.mo4727u(j7);
                if (z5) {
                    m4751c(c2706e2, 0L, j7);
                }
                c2716o.skip(j7);
            }
            if (((bM4721n >> 3) & 1) == 1) {
                long jM4754c = c2716o.m4754c((byte) 0, 0L, Long.MAX_VALUE);
                if (jM4754c == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    j6 = 2;
                    m4751c(c2706e2, 0L, jM4754c + 1);
                } else {
                    j6 = 2;
                }
                c2716o.skip(jM4754c + 1);
            } else {
                j6 = 2;
            }
            if (((bM4721n >> 4) & 1) == 1) {
                long j8 = j6;
                long jM4754c2 = c2716o.m4754c((byte) 0, 0L, Long.MAX_VALUE);
                if (jM4754c2 == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    j6 = j8;
                    c2712k = this;
                    c2712k.m4751c(c2706e2, 0L, jM4754c2 + 1);
                } else {
                    c2712k = this;
                    j6 = j8;
                }
                c2716o.skip(jM4754c2 + 1);
            } else {
                c2712k = this;
            }
            if (z5) {
                c2716o.mo4727u(j6);
                short s6 = c2706e2.readShort();
                m4750b((short) (((s6 & 255) << 8) | ((s6 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c2712k.f8636d = (byte) 1;
        }
        if (c2712k.f8636d == 1) {
            long j9 = c2706e.f8629e;
            long jMo554y = c2712k.f8639g.mo554y(c2706e, 8192L);
            if (jMo554y != -1) {
                c2712k.m4751c(c2706e, j9, jMo554y);
                return jMo554y;
            }
            c2712k.f8636d = (byte) 2;
        }
        if (c2712k.f8636d == 2) {
            m4750b(c2716o.m4755d(), (int) crc32.getValue(), "CRC");
            m4750b(c2716o.m4755d(), (int) c2712k.f8638f.getBytesWritten(), "ISIZE");
            c2712k.f8636d = (byte) 3;
            if (!c2716o.m4753b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
