package Yue;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,163:1\n86#2:164\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n58#1:164\n*E\n"})
public final class C4363 implements InterfaceC7472 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3603 f8930;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Deflater f8931;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f8932;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4363(@InterfaceC6399 InterfaceC3603 interfaceC3603, @InterfaceC6399 Deflater deflater) {
        C5499.m17103(interfaceC3603, "sink");
        C5499.m17103(deflater, "deflater");
        this.f8930 = interfaceC3603;
        this.f8931 = deflater;
    }

    @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f8932) {
            return;
        }
        try {
            m12616();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f8931.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f8930.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f8932 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // Yue.InterfaceC7472, java.io.Flushable
    public void flush() throws IOException {
        m1319(true);
        this.f8930.flush();
    }

    @InterfaceC6399
    public String toString() {
        return "DeflaterSink(" + this.f8930 + ')';
    }

    @Override // Yue.InterfaceC7472
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo516() {
        return this.f8930.mo516();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1319(boolean z) throws IOException {
        C7275 c7275M9687;
        int iDeflate;
        C3600 c3600Mo9605 = this.f8930.mo9605();
        while (true) {
            c7275M9687 = c3600Mo9605.m9687(1);
            if (z) {
                try {
                    Deflater deflater = this.f8931;
                    byte[] bArr = c7275M9687.f2778;
                    int i = c7275M9687.f21950;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                Deflater deflater2 = this.f8931;
                byte[] bArr2 = c7275M9687.f2778;
                int i2 = c7275M9687.f21950;
                iDeflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                c7275M9687.f21950 += iDeflate;
                c3600Mo9605.m9680(c3600Mo9605.m9684() + ((long) iDeflate));
                this.f8930.mo9632();
            } else if (this.f8931.needsInput()) {
                break;
            }
        }
        if (c7275M9687.f2779 == c7275M9687.f21950) {
            c3600Mo9605.f6209 = c7275M9687.m3540();
            C7278.m22744(c7275M9687);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m12616() throws IOException {
        this.f8931.finish();
        m1319(false);
    }

    @Override // Yue.InterfaceC7472
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "source");
        C2963.m5677(c3600.m9684(), 0L, j);
        while (j > 0) {
            C7275 c7275 = c3600.f6209;
            C5499.m17100(c7275);
            int iMin = (int) Math.min(j, c7275.f21950 - c7275.f2779);
            this.f8931.setInput(c7275.f2778, c7275.f2779, iMin);
            m1319(false);
            long j2 = iMin;
            c3600.m9680(c3600.m9684() - j2);
            int i = c7275.f2779 + iMin;
            c7275.f2779 = i;
            if (i == c7275.f21950) {
                c3600.f6209 = c7275.m3540();
                C7278.m22744(c7275);
            }
            j -= j2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4363(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 Deflater deflater) {
        this(C6542.m20830(interfaceC7472), deflater);
        C5499.m17103(interfaceC7472, "sink");
        C5499.m17103(deflater, "deflater");
    }
}
