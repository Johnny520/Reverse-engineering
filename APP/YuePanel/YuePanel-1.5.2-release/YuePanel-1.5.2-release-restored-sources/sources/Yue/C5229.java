package Yue;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"})
public final class C5229 implements InterfaceC7472 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C7022 f12451;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Deflater f12452;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final C4363 f12453;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f12454;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final CRC32 f12455;

    public C5229(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        C5499.m17103(interfaceC7472, "sink");
        C7022 c7022 = new C7022(interfaceC7472);
        this.f12451 = c7022;
        Deflater deflater = new Deflater(-1, true);
        this.f12452 = deflater;
        this.f12453 = new C4363((InterfaceC3603) c7022, deflater);
        this.f12455 = new CRC32();
        C3600 c3600 = c7022.f21162;
        c3600.writeShort(8075);
        c3600.writeByte(8);
        c3600.writeByte(0);
        c3600.writeInt(0);
        c3600.writeByte(0);
        c3600.writeByte(0);
    }

    @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f12454) {
            return;
        }
        try {
            this.f12453.m12616();
            m16027();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f12452.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f12451.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f12454 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // Yue.InterfaceC7472, java.io.Flushable
    public void flush() throws IOException {
        this.f12453.flush();
    }

    @Override // Yue.InterfaceC7472
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo516() {
        return this.f12451.mo516();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "deflater", imports = {}))
    @InterfaceC5572(name = "-deprecated_deflater")
    /* JADX INFO: renamed from: ۥ۟ */
    public final Deflater m1993() {
        return this.f12452;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "deflater")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Deflater m16025() {
        return this.f12452;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m16026(C3600 c3600, long j) {
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        while (j > 0) {
            int iMin = (int) Math.min(j, c7275.f21950 - c7275.f2779);
            this.f12455.update(c7275.f2778, c7275.f2779, iMin);
            j -= (long) iMin;
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m16027() {
        this.f12451.mo9621((int) this.f12455.getValue());
        this.f12451.mo9621((int) this.f12452.getBytesRead());
    }

    @Override // Yue.InterfaceC7472
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "source");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return;
        }
        m16026(c3600, j);
        this.f12453.mo9102(c3600, j);
    }
}
