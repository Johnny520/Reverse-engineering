package p376zd;

import ae.AbstractC0327z;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: zd.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10021v implements InterfaceC10020u0 {

    /* JADX INFO: renamed from: q */
    public final C10006n0 f33631q;

    /* JADX INFO: renamed from: r */
    public final Deflater f33632r;

    /* JADX INFO: renamed from: s */
    public final C10005n f33633s;

    /* JADX INFO: renamed from: t */
    public boolean f33634t;

    /* JADX INFO: renamed from: u */
    public final CRC32 f33635u;

    public C10021v(InterfaceC10020u0 interfaceC10020u0) {
        interfaceC10020u0.getClass();
        C10006n0 c10006n0 = new C10006n0(interfaceC10020u0);
        this.f33631q = c10006n0;
        Deflater deflater = new Deflater(AbstractC0327z.m1002b(), true);
        this.f33632r = deflater;
        this.f33633s = new C10005n((InterfaceC9997j) c10006n0, deflater);
        this.f33635u = new CRC32();
        C9995i c9995i = c10006n0.f33593r;
        c9995i.writeShort(8075);
        c9995i.writeByte(8);
        c9995i.writeByte(0);
        c9995i.writeInt(0);
        c9995i.writeByte(0);
        c9995i.writeByte(0);
    }

    /* JADX INFO: renamed from: c */
    public final void m38839c(C9995i c9995i, long j10) {
        C10012q0 c10012q0 = c9995i.f33561q;
        c10012q0.getClass();
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, c10012q0.f33618c - c10012q0.f33617b);
            this.f33635u.update(c10012q0.f33616a, c10012q0.f33617b, iMin);
            j10 -= (long) iMin;
            c10012q0 = c10012q0.f33621f;
            c10012q0.getClass();
        }
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f33634t) {
            return;
        }
        try {
            this.f33633s.m38804d();
            m38840d();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f33632r.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f33631q.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f33634t = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m38840d() {
        this.f33631q.mo38674E((int) this.f33635u.getValue());
        this.f33631q.mo38674E((int) this.f33632r.getBytesRead());
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Flushable
    public void flush() throws IOException {
        this.f33633s.flush();
    }

    @Override // p376zd.InterfaceC10020u0
    public C10026x0 timeout() {
        return this.f33631q.timeout();
    }

    @Override // p376zd.InterfaceC10020u0
    public void write(C9995i c9995i, long j10) throws IOException {
        c9995i.getClass();
        if (j10 < 0) {
            C9991g.m38662a("byteCount < 0: ", j10);
        } else {
            if (j10 == 0) {
                return;
            }
            m38839c(c9995i, j10);
            this.f33633s.write(c9995i, j10);
        }
    }
}
