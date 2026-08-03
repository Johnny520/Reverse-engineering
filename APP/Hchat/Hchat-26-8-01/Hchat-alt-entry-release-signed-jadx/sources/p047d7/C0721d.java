package p047d7;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import okhttp3.HttpUrl;
import p034c7.EnumC0411g;
import p136j8.C2104o;
import p152k7.AbstractC2331a;
import p222p.AbstractC3199a;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: d7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0721d extends AbstractC0724g {

    /* JADX INFO: renamed from: t */
    public String f2157t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0721d() {
        super(46, EnumC0411g.CENTRAL_FILE, 8);
        m1931R(40, 33188);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0724g
    /* JADX INFO: renamed from: W */
    public final int mo1897W() {
        return m1928O(32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0724g
    /* JADX INFO: renamed from: f0 */
    public final int mo1898f0() {
        return 12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0724g
    /* JADX INFO: renamed from: h0 */
    public final boolean mo1899h0() {
        return AbstractC2331a.m5539s(this.f12076k, 42) == -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0724g
    /* JADX INFO: renamed from: j0 */
    public final void mo1900j0() {
        String str = this.f2157t;
        if (str != null) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            int iM1909b0 = m1909b0();
            int i9 = this.f2159o;
            m7715M(m1907Z() + iM1909b0 + i9 + length, false);
            m1931R(32, length);
            if (length == 0) {
                this.f2157t = str;
                return;
            }
            System.arraycopy(bytes, 0, this.f12076k, m1907Z() + m1909b0() + i9, length);
            this.f2157t = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0724g
    /* JADX INFO: renamed from: k0 */
    public final int mo1901k0(InputStream inputStream) throws IOException {
        int iM1928O = m1928O(32);
        if (iM1928O == 0) {
            this.f2157t = HttpUrl.FRAGMENT_ENCODE_SET;
            return 0;
        }
        int iM1909b0 = m1909b0();
        int i9 = this.f2159o;
        m7715M(m1907Z() + iM1909b0 + i9 + iM1928O, false);
        m1931R(32, iM1928O);
        int i10 = inputStream.read(this.f12076k, m1907Z() + m1909b0() + i9, iM1928O);
        if (i10 == iM1928O) {
            this.f2157t = null;
            return iM1928O;
        }
        C2104o.m5299y(AbstractC3199a.m6837j(i10, "Stream ended before reading comment: read=", ", name length=", iM1928O));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public final String m1902n0() {
        String str;
        if (this.f2157t == null) {
            int iM1907Z = m1907Z();
            byte[] bArr = this.f12076k;
            int iM1909b0 = m1909b0() + this.f2159o;
            int length = bArr.length - iM1909b0;
            if (length <= 0) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                if (iM1907Z > length) {
                    iM1907Z = length;
                }
                str = new String(bArr, iM1909b0, iM1907Z, StandardCharsets.UTF_8);
            }
            this.f2157t = str;
        }
        return this.f2157t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0724g
    public final String toString() {
        boolean z9;
        long jM1927N;
        if (mo5551p() < this.f2191n) {
            return "Invalid";
        }
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f2163s);
        sb2.append(']');
        String strM1908a0 = m1908a0();
        if (strM1908a0.length() > 0) {
            sb2.append("name=");
            sb2.append(strM1908a0);
            z9 = true;
        } else {
            z9 = false;
        }
        String strM1902n0 = m1902n0();
        if (strM1902n0.length() > 0) {
            if (z9) {
                sb2.append(", ");
            }
            sb2.append("comment=");
            sb2.append(strM1902n0);
            z9 = true;
        }
        if (z9) {
            sb2.append(", ");
        }
        sb2.append("SIG=");
        sb2.append(m1932T());
        sb2.append(", versionMadeBy=");
        sb2.append(AbstractC5999a.m10752o((short) m1928O(4)));
        sb2.append(", versionExtract=");
        sb2.append(AbstractC5999a.m10752o((short) m1928O(6)));
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
        sb2.append(", commentLength=");
        sb2.append(m1928O(32));
        sb2.append(", offset=");
        if (m1913g0()) {
            jM1927N = AbstractC2331a.m5540t(this.f12076k, m1909b0() + this.f2159o + 4);
        } else {
            jM1927N = m1927N(42);
        }
        sb2.append(jM1927N);
        sb2.append(", internalAttr=");
        sb2.append(m1928O(36));
        sb2.append(", externalAttr=");
        sb2.append(AbstractC5999a.m10748k(AbstractC2331a.m5539s(this.f12076k, 38), 8));
        sb2.append(", attrId=");
        sb2.append(m1928O(38));
        sb2.append(", permissions=");
        sb2.append(new C0720c(this));
        return sb2.toString();
    }
}
