package p047d7;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import okhttp3.HttpUrl;
import p005a5.C0016a;
import p034c7.EnumC0411g;
import p136j8.C2104o;
import p152k7.AbstractC2331a;
import p222p.AbstractC3199a;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: d7.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0724g extends AbstractC0737t {

    /* JADX INFO: renamed from: o */
    public final int f2159o;

    /* JADX INFO: renamed from: p */
    public final int f2160p;

    /* JADX INFO: renamed from: q */
    public final C0016a f2161q;

    /* JADX INFO: renamed from: r */
    public String f2162r;

    /* JADX INFO: renamed from: s */
    public long f2163s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0724g(int i9, EnumC0411g enumC0411g, int i10) {
        super(i9, enumC0411g);
        this.f2159o = i9;
        this.f2160p = i10;
        C0016a c0016a = new C0016a(i10, 1, this);
        this.f2161q = c0016a;
        C0016a.m198b(c0016a);
        m1930Q(i10 + 4, 35719201L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static boolean m1903i0(long j3) {
        return j3 == 4294967295L || (j3 & (-4294967296L)) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0737t
    /* JADX INFO: renamed from: V */
    public final int mo1904V(InputStream inputStream) throws IOException {
        int iM1909b0 = m1909b0();
        int i9 = this.f2160p;
        int i10 = this.f2159o;
        int i11 = 0;
        if (iM1909b0 == 0) {
            this.f2162r = HttpUrl.FRAGMENT_ENCODE_SET;
            iM1909b0 = 0;
        } else {
            m7715M(mo1897W() + m1907Z() + i10 + iM1909b0, false);
            m1931R(i9 + 20, iM1909b0);
            int i12 = inputStream.read(this.f12076k, i10, iM1909b0);
            if (i12 != iM1909b0) {
                C2104o.m5299y(AbstractC3199a.m6837j(i12, "Stream ended before reading file name: read=", ", name length=", iM1909b0));
                return 0;
            }
            this.f2162r = null;
        }
        int iM1907Z = m1907Z();
        if (iM1907Z != 0) {
            m7715M(mo1897W() + m1909b0() + i10 + iM1907Z, false);
            m1931R(i9 + 22, iM1907Z);
            int i13 = inputStream.read(this.f12076k, m1909b0() + i10, iM1907Z);
            if (i13 != iM1907Z) {
                C2104o.m5299y(AbstractC3199a.m6837j(i13, "Stream ended before reading extra bytes: read=", ", extra length=", iM1907Z));
                return 0;
            }
            i11 = iM1907Z;
        }
        int iMo1901k0 = mo1901k0(inputStream) + iM1909b0 + i11;
        this.f2162r = null;
        return iMo1901k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public int mo1897W() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public long mo1905X() {
        return m1927N(m1911d0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public long mo1906Y() {
        return m1927N(this.f2160p + 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final int m1907Z() {
        return m1928O(this.f2160p + 22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final String m1908a0() {
        String str;
        if (this.f2162r == null) {
            int iM1909b0 = m1909b0();
            byte[] bArr = this.f12076k;
            int length = bArr.length;
            int i9 = this.f2159o;
            int i10 = length - i9;
            if (i10 <= 0) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                if (iM1909b0 > i10) {
                    iM1909b0 = i10;
                }
                str = new String(bArr, i9, iM1909b0, StandardCharsets.UTF_8);
            }
            this.f2162r = str;
        }
        return this.f2162r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final int m1909b0() {
        return m1928O(this.f2160p + 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final int m1910c0() {
        return m1928O(this.f2160p + 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final int m1911d0() {
        return this.f2160p + 12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public long mo1912e0() {
        return m1927N(this.f2160p + 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public int mo1898f0() {
        return 20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final boolean m1913g0() {
        return mo1899h0() && m1907Z() >= mo1898f0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public boolean mo1899h0() {
        if (AbstractC2331a.m5539s(this.f12076k, m1911d0()) == -1) {
            return true;
        }
        return AbstractC2331a.m5539s(this.f12076k, m1911d0()) == -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public void mo1900j0() {
        String str = this.f2162r;
        if (str != null) {
            m1915m0(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public int mo1901k0(InputStream inputStream) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public void mo1914l0(long j3) {
        m1930Q(this.f2160p + 8, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final void m1915m0(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        C0016a.m198b(this.f2161q);
        int length = bytes.length;
        int i9 = this.f2159o;
        m7715M(mo1897W() + m1907Z() + i9 + length, false);
        m1931R(this.f2160p + 20, length);
        if (length == 0) {
            this.f2162r = str;
        } else {
            System.arraycopy(bytes, 0, this.f12076k, i9, length);
            this.f2162r = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        if (mo5551p() < this.f2191n) {
            return "Invalid";
        }
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f2163s);
        sb2.append("] ");
        String strM1908a0 = m1908a0();
        if (strM1908a0.length() > 0) {
            sb2.append("name=");
            sb2.append(strM1908a0);
            sb2.append(", ");
        }
        sb2.append("SIG=");
        sb2.append(m1932T());
        sb2.append(", versionMadeBy=");
        sb2.append(AbstractC5999a.m10752o((short) m1928O(4)));
        sb2.append(", platform=");
        sb2.append(AbstractC5999a.m10751n((byte) (this.f12076k[5] & 255)));
        sb2.append(", GP={");
        sb2.append(this.f2161q);
        sb2.append("}, method=");
        sb2.append(m1910c0());
        sb2.append(", date=");
        sb2.append(AbstractC5999a.m10749l(1, m1927N(this.f2160p + 4)));
        sb2.append(", crc=");
        sb2.append(AbstractC5999a.m10749l(8, mo1906Y()));
        sb2.append(", cSize=");
        sb2.append(mo1905X());
        sb2.append(", size=");
        sb2.append(mo1912e0());
        sb2.append(", fileNameLength=");
        sb2.append(m1909b0());
        sb2.append(", extraLength=");
        sb2.append(m1907Z());
        return sb2.toString();
    }
}
