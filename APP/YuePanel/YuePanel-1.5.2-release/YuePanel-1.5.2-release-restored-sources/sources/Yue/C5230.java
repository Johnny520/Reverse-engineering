package Yue;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,220:1\n1#2:221\n62#3:222\n62#3:224\n62#3:226\n62#3:227\n62#3:228\n62#3:230\n62#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n89#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"})
public final class C5230 implements InterfaceC7506 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public byte f12456;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C7023 f12457;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final Inflater f12458;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5432 f12459;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final CRC32 f12460;

    public C5230(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        C5499.m17103(interfaceC7506, "source");
        C7023 c7023 = new C7023(interfaceC7506);
        this.f12457 = c7023;
        Inflater inflater = new Inflater(true);
        this.f12458 = inflater;
        this.f12459 = new C5432((InterfaceC3604) c7023, inflater);
        this.f12460 = new CRC32();
    }

    @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12459.close();
    }

    @Override // Yue.InterfaceC7506
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo518() {
        return this.f12457.mo518();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1994(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        C5499.m17102(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m16028() throws IOException {
        this.f12457.mo9670(10L);
        byte bM9650 = this.f12457.f21166.m9650(3L);
        boolean z = ((bM9650 >> 1) & 1) == 1;
        if (z) {
            m16030(this.f12457.f21166, 0L, 10L);
        }
        m1994("ID1ID2", 8075, this.f12457.readShort());
        this.f12457.skip(8L);
        if (((bM9650 >> 2) & 1) == 1) {
            this.f12457.mo9670(2L);
            if (z) {
                m16030(this.f12457.f21166, 0L, 2L);
            }
            long jMo9666 = this.f12457.f21166.mo9666() & C8080.f23970;
            this.f12457.mo9670(jMo9666);
            if (z) {
                m16030(this.f12457.f21166, 0L, jMo9666);
            }
            this.f12457.skip(jMo9666);
        }
        if (((bM9650 >> 3) & 1) == 1) {
            long jMo9673 = this.f12457.mo9673((byte) 0);
            if (jMo9673 == -1) {
                throw new EOFException();
            }
            if (z) {
                m16030(this.f12457.f21166, 0L, jMo9673 + 1);
            }
            this.f12457.skip(jMo9673 + 1);
        }
        if (((bM9650 >> 4) & 1) == 1) {
            long jMo96732 = this.f12457.mo9673((byte) 0);
            if (jMo96732 == -1) {
                throw new EOFException();
            }
            if (z) {
                m16030(this.f12457.f21166, 0L, jMo96732 + 1);
            }
            this.f12457.skip(jMo96732 + 1);
        }
        if (z) {
            m1994("FHCRC", this.f12457.mo9666(), (short) this.f12460.getValue());
            this.f12460.reset();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m16029() throws IOException {
        m1994("CRC", this.f12457.mo9657(), (int) this.f12460.getValue());
        m1994("ISIZE", this.f12457.mo9657(), (int) this.f12458.getBytesWritten());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m16030(C3600 c3600, long j, long j2) {
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        while (true) {
            int i = c7275.f21950;
            int i2 = c7275.f2779;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c7275.f2779) + j);
            int iMin = (int) Math.min(c7275.f21950 - i3, j2);
            this.f12460.update(c7275.f2778, i3, iMin);
            j2 -= (long) iMin;
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            j = 0;
        }
    }

    @Override // Yue.InterfaceC7506
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f12456 == 0) {
            m16028();
            this.f12456 = (byte) 1;
        }
        if (this.f12456 == 1) {
            long jM9684 = c3600.m9684();
            long jMo9103 = this.f12459.mo9103(c3600, j);
            if (jMo9103 != -1) {
                m16030(c3600, jM9684, jMo9103);
                return jMo9103;
            }
            this.f12456 = (byte) 2;
        }
        if (this.f12456 == 2) {
            m16029();
            this.f12456 = (byte) 3;
            if (!this.f12457.mo9622()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
