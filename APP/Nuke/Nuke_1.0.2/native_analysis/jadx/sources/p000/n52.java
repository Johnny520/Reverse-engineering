package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n52 implements InterfaceC0504nn {

    /* JADX INFO: renamed from: h */
    public final fr2 f7010h;

    /* JADX INFO: renamed from: i */
    public final C0209fn f7011i;

    /* JADX INFO: renamed from: j */
    public boolean f7012j;

    public n52(fr2 fr2Var) {
        fr2Var.getClass();
        this.f7010h = fr2Var;
        this.f7011i = new C0209fn();
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: a */
    public final o23 mo1174a() {
        return this.f7010h.mo1174a();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0504nn m3250b() {
        if (this.f7012j) {
            C0676s.m4653l("closed");
            return null;
        }
        C0209fn c0209fn = this.f7011i;
        long jM1680h = c0209fn.m1680h();
        if (jM1680h > 0) {
            this.f7010h.mo1175d(c0209fn, jM1680h);
        }
        return this;
    }

    @Override // p000.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fr2 fr2Var = this.f7010h;
        if (this.f7012j) {
            return;
        }
        try {
            C0209fn c0209fn = this.f7011i;
            long j = c0209fn.f3068i;
            if (j > 0) {
                fr2Var.mo1175d(c0209fn, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            fr2Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f7012j = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: d */
    public final void mo1175d(C0209fn c0209fn, long j) {
        c0209fn.getClass();
        if (this.f7012j) {
            C0676s.m4653l("closed");
        } else {
            this.f7011i.mo1175d(c0209fn, j);
            m3250b();
        }
    }

    @Override // p000.InterfaceC0504nn, p000.fr2, java.io.Flushable
    public final void flush() {
        if (this.f7012j) {
            C0676s.m4653l("closed");
            return;
        }
        C0209fn c0209fn = this.f7011i;
        long j = c0209fn.f3068i;
        fr2 fr2Var = this.f7010h;
        if (j > 0) {
            fr2Var.mo1175d(c0209fn, j);
        }
        fr2Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7012j;
    }

    @Override // p000.InterfaceC0504nn
    /* JADX INFO: renamed from: l */
    public final C0209fn mo1684l() {
        return this.f7011i;
    }

    public final String toString() {
        return "buffer(" + this.f7010h + ')';
    }

    @Override // p000.InterfaceC0504nn
    /* JADX INFO: renamed from: w */
    public final InterfaceC0504nn mo1694w(int i, byte[] bArr) {
        if (this.f7012j) {
            C0676s.m4653l("closed");
            return null;
        }
        this.f7011i.write(bArr, 0, i);
        m3250b();
        return this;
    }

    @Override // p000.InterfaceC0504nn
    public final InterfaceC0504nn write(byte[] bArr) {
        bArr.getClass();
        if (this.f7012j) {
            C0676s.m4653l("closed");
            return null;
        }
        this.f7011i.write(bArr, 0, bArr.length);
        m3250b();
        return this;
    }

    @Override // p000.InterfaceC0504nn
    public final InterfaceC0504nn writeByte(int i) {
        if (this.f7012j) {
            C0676s.m4653l("closed");
            return null;
        }
        this.f7011i.m1670E(i);
        m3250b();
        return this;
    }

    @Override // p000.InterfaceC0504nn
    public final InterfaceC0504nn writeInt(int i) {
        if (this.f7012j) {
            C0676s.m4653l("closed");
            return null;
        }
        this.f7011i.m1673H(i);
        m3250b();
        return this;
    }

    @Override // p000.InterfaceC0504nn
    public final InterfaceC0504nn writeShort(int i) {
        if (this.f7012j) {
            C0676s.m4653l("closed");
            return null;
        }
        this.f7011i.m1674I(i);
        m3250b();
        return this;
    }

    @Override // p000.InterfaceC0504nn
    /* JADX INFO: renamed from: y */
    public final InterfaceC0504nn mo1696y(String str) {
        str.getClass();
        if (this.f7012j) {
            C0676s.m4653l("closed");
            return null;
        }
        this.f7011i.m1675J(str);
        m3250b();
        return this;
    }

    @Override // p000.InterfaceC0504nn
    /* JADX INFO: renamed from: z */
    public final InterfaceC0504nn mo1697z(C0505no c0505no) {
        c0505no.getClass();
        if (this.f7012j) {
            C0676s.m4653l("closed");
            return null;
        }
        this.f7011i.m1667B(c0505no);
        m3250b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.f7012j) {
            int iWrite = this.f7011i.write(byteBuffer);
            m3250b();
            return iWrite;
        }
        C0676s.m4653l("closed");
        return 0;
    }
}
