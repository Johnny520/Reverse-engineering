package Yue;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,147:1\n1#2:148\n86#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"})
public final class C5432 implements InterfaceC7506 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3604 f13337;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Inflater f13338;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f13339;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f13340;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5432(@InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6399 Inflater inflater) {
        C5499.m17103(interfaceC3604, "source");
        C5499.m17103(inflater, "inflater");
        this.f13337 = interfaceC3604;
        this.f13338 = inflater;
    }

    @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f13340) {
            return;
        }
        this.f13338.end();
        this.f13340 = true;
        this.f13337.close();
    }

    @Override // Yue.InterfaceC7506
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo518() {
        return this.f13337.mo518();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final long m2204(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.f13340)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        try {
            C7275 c7275M9687 = c3600.m9687(1);
            int iMin = (int) Math.min(j, 8192 - c7275M9687.f21950);
            m16919();
            int iInflate = this.f13338.inflate(c7275M9687.f2778, c7275M9687.f21950, iMin);
            m16920();
            if (iInflate > 0) {
                c7275M9687.f21950 += iInflate;
                long j2 = iInflate;
                c3600.m9680(c3600.m9684() + j2);
                return j2;
            }
            if (c7275M9687.f2779 == c7275M9687.f21950) {
                c3600.f6209 = c7275M9687.m3540();
                C7278.m22744(c7275M9687);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m16919() throws IOException {
        if (!this.f13338.needsInput()) {
            return false;
        }
        if (this.f13337.mo9622()) {
            return true;
        }
        C7275 c7275 = this.f13337.mo9605().f6209;
        C5499.m17100(c7275);
        int i = c7275.f21950;
        int i2 = c7275.f2779;
        int i3 = i - i2;
        this.f13339 = i3;
        this.f13338.setInput(c7275.f2778, i2, i3);
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m16920() throws IOException {
        int i = this.f13339;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f13338.getRemaining();
        this.f13339 -= remaining;
        this.f13337.skip(remaining);
    }

    @Override // Yue.InterfaceC7506
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "sink");
        do {
            long jM2204 = m2204(c3600, j);
            if (jM2204 > 0) {
                return jM2204;
            }
            if (this.f13338.finished() || this.f13338.needsDictionary()) {
                return -1L;
            }
        } while (!this.f13337.mo9622());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5432(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 Inflater inflater) {
        this(C6542.m20831(interfaceC7506), inflater);
        C5499.m17103(interfaceC7506, "source");
        C5499.m17103(inflater, "inflater");
    }
}
