package yyds;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yyds.ᲈᲇᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2776 implements InterfaceC0828 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f13528;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1979 f13529;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1507 f13530 = new C1507();

    public C2776(InterfaceC1979 interfaceC1979) {
        this.f13529 = interfaceC1979;
    }

    @Override // yyds.InterfaceC1979, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC1979 interfaceC1979 = this.f13529;
        if (this.f13528) {
            return;
        }
        try {
            C1507 c1507 = this.f13530;
            long j = c1507.f7087;
            if (j > 0) {
                interfaceC1979.mo576(j, c1507);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC1979.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f13528 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // yyds.InterfaceC1979, java.io.Flushable
    public final void flush() {
        if (this.f13528) {
            C0188.m800("closed");
            return;
        }
        C1507 c1507 = this.f13530;
        long j = c1507.f7087;
        InterfaceC1979 interfaceC1979 = this.f13529;
        if (j > 0) {
            interfaceC1979.mo576(j, c1507);
        }
        interfaceC1979.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13528;
    }

    public final String toString() {
        return "buffer(" + this.f13529 + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f13528) {
            C0188.m800("closed");
            return 0;
        }
        int iWrite = this.f13530.write(byteBuffer);
        m4891();
        return iWrite;
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo576(long j, C1507 c1507) {
        if (this.f13528) {
            C0188.m800("closed");
        } else {
            this.f13530.mo576(j, c1507);
            m4891();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0828 m4891() {
        if (this.f13528) {
            C0188.m800("closed");
            return null;
        }
        C1507 c1507 = this.f13530;
        long j = c1507.f7087;
        if (j == 0) {
            j = 0;
        } else {
            C0502 c0502 = c1507.f7086.f2445;
            int i = c0502.f2446;
            if (i < 8192 && c0502.f2442) {
                j -= (long) (i - c0502.f2444);
            }
        }
        if (j > 0) {
            this.f13529.mo576(j, c1507);
        }
        return this;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0828 m4892(String str) {
        if (this.f13528) {
            C0188.m800("closed");
            return null;
        }
        this.f13530.m3019(str);
        m4891();
        return this;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC0828 m4893(int i) {
        if (this.f13528) {
            C0188.m800("closed");
            return null;
        }
        this.f13530.m3036(i);
        m4891();
        return this;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0828 m4894(int i) {
        if (this.f13528) {
            C0188.m800("closed");
            return null;
        }
        this.f13530.m3029(i);
        m4891();
        return this;
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo577() {
        return this.f13529.mo577();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final InterfaceC0828 m4895(C2534 c2534) {
        if (this.f13528) {
            C0188.m800("closed");
            return null;
        }
        this.f13530.m3016(c2534);
        m4891();
        return this;
    }
}
