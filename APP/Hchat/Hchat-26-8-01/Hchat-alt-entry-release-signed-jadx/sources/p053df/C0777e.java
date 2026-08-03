package p053df;

import bsh.C0353j;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: df.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0777e extends InputStream {

    /* JADX INFO: renamed from: j */
    public static final Charset f2336j = StandardCharsets.UTF_16LE;

    /* JADX INFO: renamed from: k */
    public static final Charset f2337k = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: l */
    public static final byte[] f2338l = new byte[0];

    /* JADX INFO: renamed from: g */
    public final InputStream f2339g;

    /* JADX INFO: renamed from: h */
    public long f2340h = 0;

    /* JADX INFO: renamed from: i */
    public long f2341i = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0777e(InputStream inputStream) {
        this.f2339g = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2003a(int i9, String str) throws IOException {
        int iM2005c = m2005c();
        if (iM2005c == i9) {
            return;
        }
        m2011l(i9, iM2005c, str);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2004b(long j3, String str) throws IOException {
        if (this.f2340h == j3) {
            return;
        }
        C2104o.m5299y(AbstractC0255e.m1033v(str, ", expected offset: 0x", Long.toHexString(j3), ", actual: 0x", Long.toHexString(this.f2340h)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m2005c() throws IOException {
        this.f2340h += 2;
        InputStream inputStream = this.f2339g;
        return ((inputStream.read() & 255) << 8) | (inputStream.read() & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m2006e() throws IOException {
        this.f2340h += 4;
        InputStream inputStream = this.f2339g;
        int i9 = inputStream.read();
        return (inputStream.read() << 24) | ((inputStream.read() & 255) << 16) | ((inputStream.read() & 255) << 8) | (i9 & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m2007g() {
        this.f2340h++;
        return this.f2339g.read();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final byte[] m2008h(int i9) throws IOException {
        if (i9 == 0) {
            return f2338l;
        }
        this.f2340h += (long) i9;
        byte[] bArr = new byte[i9];
        InputStream inputStream = this.f2339g;
        int i10 = inputStream.read(bArr, 0, i9);
        while (i10 < i9) {
            int i11 = inputStream.read(bArr, i10, i9 - i10);
            if (i11 == -1) {
                C2104o.m5299y(AbstractC0921a.m2250m(i9, "No data, can't read ", " bytes"));
                return null;
            }
            i10 += i11;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m2009i(int i9) {
        return new String(m2008h(i9 * 2), f2336j).trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m2010k(long j3, String str) throws IOException {
        long j4 = this.f2340h;
        if (j4 > j3) {
            C2104o.m5299y(AbstractC0255e.m1033v(str, ", expected offset not reachable: 0x", Long.toHexString(j3), ", actual: 0x", Long.toHexString(this.f2340h)));
            return;
        }
        if (j4 < j3) {
            skip(j3 - j4);
        }
        m2004b(j3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m2011l(int i9, int i10, String str) throws IOException {
        String hexString = Integer.toHexString(i9);
        String hexString2 = Integer.toHexString(i10);
        String hexString3 = Long.toHexString(this.f2340h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(", expected: 0x");
        sb2.append(hexString);
        sb2.append(", actual: 0x");
        sb2.append(hexString2);
        throw new IOException(AbstractC0921a.m2255r(sb2, ", offset: 0x", hexString3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void mark(int i9) {
        InputStream inputStream = this.f2339g;
        if (!inputStream.markSupported()) {
            C0353j.m1309g("Mark not supported for input stream ".concat(String.valueOf(inputStream.getClass())));
        } else {
            inputStream.mark(i9);
            this.f2341i = this.f2340h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read() {
        return this.f2339g.read();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.f2339g.reset();
        this.f2340h = this.f2341i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final long skip(long j3) throws IOException {
        this.f2340h += j3;
        InputStream inputStream = this.f2339g;
        long jSkip = inputStream.skip(j3);
        while (jSkip < j3) {
            long jSkip2 = inputStream.skip(j3 - jSkip);
            if (jSkip2 == 0) {
                throw new IOException("No data, can't skip " + j3 + " bytes");
            }
            jSkip += jSkip2;
        }
        return jSkip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC4855en.m9263g("pos: 0x", Long.toHexString(this.f2340h));
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        return this.f2339g.read(bArr, i9, i10);
    }
}
