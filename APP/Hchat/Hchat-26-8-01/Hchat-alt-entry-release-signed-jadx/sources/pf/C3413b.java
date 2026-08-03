package pf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p136j8.C2104o;

/* JADX INFO: renamed from: pf.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3413b extends FilterInputStream {

    /* JADX INFO: renamed from: g */
    public final long f11031g;

    /* JADX INFO: renamed from: h */
    public long f11032h;

    /* JADX INFO: renamed from: i */
    public long f11033i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3413b(InputStream inputStream, long j3) {
        super(inputStream);
        this.f11031g = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7192a(long j3) {
        long j4 = this.f11032h + j3;
        this.f11032h = j4;
        if (j4 <= this.f11031g) {
            return;
        }
        C2104o.m5276A("Read limit exceeded");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i9) {
        super.mark(i9);
        this.f11033i = this.f11032h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i9 = super.read();
        if (i9 != -1) {
            m7192a(1L);
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
        this.f11032h = this.f11033i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j3) throws IOException {
        long jSkip = super.skip(j3);
        if (jSkip > 0) {
            m7192a(jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        int i11 = super.read(bArr, i9, i10);
        if (i11 > 0) {
            m7192a(i11);
        }
        return i11;
    }
}
