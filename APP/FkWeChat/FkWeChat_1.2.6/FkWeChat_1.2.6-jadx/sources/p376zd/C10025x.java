package p376zd;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: zd.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10025x implements InterfaceC10024w0 {

    /* JADX INFO: renamed from: q */
    public byte f33636q;

    /* JADX INFO: renamed from: r */
    public final C10008o0 f33637r;

    /* JADX INFO: renamed from: s */
    public final Inflater f33638s;

    /* JADX INFO: renamed from: t */
    public final C10029z f33639t;

    /* JADX INFO: renamed from: u */
    public final CRC32 f33640u;

    public C10025x(InterfaceC10024w0 interfaceC10024w0) {
        interfaceC10024w0.getClass();
        C10008o0 c10008o0 = new C10008o0(interfaceC10024w0);
        this.f33637r = c10008o0;
        Inflater inflater = new Inflater(true);
        this.f33638s = inflater;
        this.f33639t = new C10029z((InterfaceC9999k) c10008o0, inflater);
        this.f33640u = new CRC32();
    }

    /* JADX INFO: renamed from: c */
    public final void m38842c(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + AbstractC8621f0.m33094A0(AbstractC9978b.m38625l(i11), 8, '0') + " != expected 0x" + AbstractC8621f0.m33094A0(AbstractC9978b.m38625l(i10), 8, '0'));
    }

    @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33639t.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m38843d() throws IOException {
        this.f33637r.mo38721o(10L);
        byte bM38716l = this.f33637r.f33603r.m38716l(3L);
        boolean z10 = ((bM38716l >> 1) & 1) == 1;
        if (z10) {
            m38845f(this.f33637r.f33603r, 0L, 10L);
        }
        m38842c("ID1ID2", 8075, this.f33637r.readShort());
        this.f33637r.skip(8L);
        if (((bM38716l >> 2) & 1) == 1) {
            this.f33637r.mo38721o(2L);
            if (z10) {
                m38845f(this.f33637r.f33603r, 0L, 2L);
            }
            long jMo38735x0 = this.f33637r.f33603r.mo38735x0() & 65535;
            this.f33637r.mo38721o(jMo38735x0);
            if (z10) {
                m38845f(this.f33637r.f33603r, 0L, jMo38735x0);
            }
            this.f33637r.skip(jMo38735x0);
        }
        if (((bM38716l >> 3) & 1) == 1) {
            long jM38812c = this.f33637r.m38812c((byte) 0);
            if (jM38812c == -1) {
                throw new EOFException();
            }
            if (z10) {
                m38845f(this.f33637r.f33603r, 0L, jM38812c + 1);
            }
            this.f33637r.skip(jM38812c + 1);
        }
        if (((bM38716l >> 4) & 1) == 1) {
            long jM38812c2 = this.f33637r.m38812c((byte) 0);
            if (jM38812c2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                m38845f(this.f33637r.f33603r, 0L, jM38812c2 + 1);
            }
            this.f33637r.skip(jM38812c2 + 1);
        }
        if (z10) {
            m38842c("FHCRC", this.f33637r.mo38735x0(), (short) this.f33640u.getValue());
            this.f33640u.reset();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m38844e() throws IOException {
        m38842c("CRC", this.f33637r.mo38730u0(), (int) this.f33640u.getValue());
        m38842c("ISIZE", this.f33637r.mo38730u0(), (int) this.f33638s.getBytesWritten());
    }

    /* JADX INFO: renamed from: f */
    public final void m38845f(C9995i c9995i, long j10, long j11) {
        C10012q0 c10012q0 = c9995i.f33561q;
        c10012q0.getClass();
        while (true) {
            int i10 = c10012q0.f33618c;
            int i11 = c10012q0.f33617b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            c10012q0 = c10012q0.f33621f;
            c10012q0.getClass();
        }
        while (j11 > 0) {
            int i12 = (int) (((long) c10012q0.f33617b) + j10);
            int iMin = (int) Math.min(c10012q0.f33618c - i12, j11);
            this.f33640u.update(c10012q0.f33616a, i12, iMin);
            j11 -= (long) iMin;
            c10012q0 = c10012q0.f33621f;
            c10012q0.getClass();
            j10 = 0;
        }
    }

    @Override // p376zd.InterfaceC10024w0
    public long read(C9995i c9995i, long j10) throws IOException {
        C10025x c10025x;
        c9995i.getClass();
        if (j10 < 0) {
            C9991g.m38662a("byteCount < 0: ", j10);
            return 0L;
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f33636q == 0) {
            m38843d();
            this.f33636q = (byte) 1;
        }
        if (this.f33636q == 1) {
            long size = c9995i.size();
            long j11 = this.f33639t.read(c9995i, j10);
            if (j11 != -1) {
                m38845f(c9995i, size, j11);
                return j11;
            }
            c10025x = this;
            c10025x.f33636q = (byte) 2;
        } else {
            c10025x = this;
        }
        if (c10025x.f33636q == 2) {
            m38844e();
            c10025x.f33636q = (byte) 3;
            if (!c10025x.f33637r.mo38707g()) {
                C10023w.m38841a("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // p376zd.InterfaceC10024w0
    public C10026x0 timeout() {
        return this.f33637r.timeout();
    }
}
