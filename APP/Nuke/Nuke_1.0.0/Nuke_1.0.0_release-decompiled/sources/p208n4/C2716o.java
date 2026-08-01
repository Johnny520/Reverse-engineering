package p208n4;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p117X2.AbstractC1665j;
import p215o4.AbstractC2802a;

/* JADX INFO: renamed from: n4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2716o implements InterfaceC2708g {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2722u f8650d;

    /* JADX INFO: renamed from: e */
    public final C2706e f8651e;

    /* JADX INFO: renamed from: f */
    public boolean f8652f;

    public C2716o(InterfaceC2722u interfaceC2722u) {
        AbstractC1665j.m2985e(interfaceC2722u, "source");
        this.f8650d = interfaceC2722u;
        this.f8651e = new C2706e();
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: B */
    public final InputStream mo4700B() {
        return new C2704c(this, 1);
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3157a() {
        return this.f8650d.mo3157a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4753b() {
        if (this.f8652f) {
            throw new IllegalStateException("closed");
        }
        C2706e c2706e = this.f8651e;
        return c2706e.m4720m() && this.f8650d.mo554y(c2706e, 8192L) == -1;
    }

    /* JADX INFO: renamed from: c */
    public final long m4754c(byte b2, long j5, long j6) {
        if (this.f8652f) {
            throw new IllegalStateException("closed");
        }
        if (0 > j6) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j6).toString());
        }
        long jMax = 0;
        while (jMax < j6) {
            C2706e c2706e = this.f8651e;
            byte b5 = b2;
            long j7 = j6;
            long jM4724r = c2706e.m4724r(b5, jMax, j7);
            if (jM4724r != -1) {
                return jM4724r;
            }
            long j8 = c2706e.f8629e;
            if (j8 >= j7 || this.f8650d.mo554y(c2706e, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j8);
            b2 = b5;
            j6 = j7;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f8652f) {
            return;
        }
        this.f8652f = true;
        this.f8650d.close();
        this.f8651e.m4715h();
    }

    /* JADX INFO: renamed from: d */
    public final int m4755d() throws EOFException {
        mo4727u(4L);
        int i5 = this.f8651e.readInt();
        return ((i5 & 255) << 24) | (((-16777216) & i5) >>> 24) | ((16711680 & i5) >>> 8) | ((65280 & i5) << 8);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4756f(long j5) {
        C2706e c2706e;
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        if (this.f8652f) {
            throw new IllegalStateException("closed");
        }
        do {
            c2706e = this.f8651e;
            if (c2706e.f8629e >= j5) {
                return true;
            }
        } while (this.f8650d.mo554y(c2706e, 8192L) != -1);
        return false;
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: g */
    public final C2709h mo4714g(long j5) throws EOFException {
        mo4727u(j5);
        return this.f8651e.mo4714g(j5);
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: i */
    public final int mo4716i(C2714m c2714m) throws EOFException {
        AbstractC1665j.m2985e(c2714m, "options");
        if (this.f8652f) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C2706e c2706e = this.f8651e;
            int iM4987b = AbstractC2802a.m4987b(c2706e, c2714m, true);
            if (iM4987b != -2) {
                if (iM4987b != -1) {
                    c2706e.skip(c2714m.f8645d[iM4987b].mo4732a());
                    return iM4987b;
                }
            } else if (this.f8650d.mo554y(c2706e, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f8652f;
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: o */
    public final String mo4722o(long j5) throws EOFException {
        if (j5 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j5).toString());
        }
        long j6 = j5 == Long.MAX_VALUE ? Long.MAX_VALUE : j5 + 1;
        long jM4754c = m4754c((byte) 10, 0L, j6);
        C2706e c2706e = this.f8651e;
        if (jM4754c != -1) {
            return AbstractC2802a.m4986a(c2706e, jM4754c);
        }
        if (j6 < Long.MAX_VALUE && m4756f(j6) && c2706e.m4721n(j6 - 1) == 13 && m4756f(j6 + 1) && c2706e.m4721n(j6) == 10) {
            return AbstractC2802a.m4986a(c2706e, j6);
        }
        C2706e c2706e2 = new C2706e();
        c2706e.m4719l(c2706e2, 0L, Math.min(32, c2706e.f8629e));
        throw new EOFException("\\n not found: limit=" + Math.min(c2706e.f8629e, j5) + " content=" + c2706e2.mo4714g(c2706e2.f8629e).mo4733b() + (char) 8230);
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: q */
    public final long mo4723q(C2706e c2706e) {
        C2706e c2706e2;
        long j5 = 0;
        while (true) {
            InterfaceC2722u interfaceC2722u = this.f8650d;
            c2706e2 = this.f8651e;
            if (interfaceC2722u.mo554y(c2706e2, 8192L) == -1) {
                break;
            }
            long jM4717j = c2706e2.m4717j();
            if (jM4717j > 0) {
                j5 += jM4717j;
                c2706e.mo3343p(c2706e2, jM4717j);
            }
        }
        long j6 = c2706e2.f8629e;
        if (j6 <= 0) {
            return j5;
        }
        long j7 = j5 + j6;
        c2706e.mo3343p(c2706e2, j6);
        return j7;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1665j.m2985e(byteBuffer, "sink");
        C2706e c2706e = this.f8651e;
        if (c2706e.f8629e == 0 && this.f8650d.mo554y(c2706e, 8192L) == -1) {
            return -1;
        }
        return c2706e.read(byteBuffer);
    }

    @Override // p208n4.InterfaceC2708g
    public final byte readByte() throws EOFException {
        mo4727u(1L);
        return this.f8651e.readByte();
    }

    @Override // p208n4.InterfaceC2708g
    public final int readInt() throws EOFException {
        mo4727u(4L);
        return this.f8651e.readInt();
    }

    @Override // p208n4.InterfaceC2708g
    public final short readShort() throws EOFException {
        mo4727u(2L);
        return this.f8651e.readShort();
    }

    @Override // p208n4.InterfaceC2708g
    public final void skip(long j5) throws EOFException {
        if (this.f8652f) {
            throw new IllegalStateException("closed");
        }
        while (j5 > 0) {
            C2706e c2706e = this.f8651e;
            if (c2706e.f8629e == 0 && this.f8650d.mo554y(c2706e, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j5, c2706e.f8629e);
            c2706e.skip(jMin);
            j5 -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f8650d + ')';
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: u */
    public final void mo4727u(long j5) throws EOFException {
        if (!m4756f(j5)) {
            throw new EOFException();
        }
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) {
        AbstractC1665j.m2985e(c2706e, "sink");
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        if (this.f8652f) {
            throw new IllegalStateException("closed");
        }
        C2706e c2706e2 = this.f8651e;
        if (c2706e2.f8629e == 0) {
            if (j5 == 0) {
                return 0L;
            }
            if (this.f8650d.mo554y(c2706e2, 8192L) == -1) {
                return -1L;
            }
        }
        return c2706e2.mo554y(c2706e, Math.min(j5, c2706e2.f8629e));
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: z */
    public final String mo4731z(Charset charset) {
        AbstractC1665j.m2985e(charset, "charset");
        InterfaceC2722u interfaceC2722u = this.f8650d;
        C2706e c2706e = this.f8651e;
        c2706e.m4704F(interfaceC2722u);
        return c2706e.mo4731z(charset);
    }
}
