package p248qf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import nf.InterfaceC2999a;
import p120i3.AbstractC1956a;
import p332wb.AbstractC4855en;
import pf.C3412a;
import pf.C3413b;

/* JADX INFO: renamed from: qf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3544a implements InterfaceC2999a {

    /* JADX INFO: renamed from: a */
    public final C3545b f11529a;

    /* JADX INFO: renamed from: b */
    public final String f11530b;

    /* JADX INFO: renamed from: c */
    public final int f11531c;

    /* JADX INFO: renamed from: d */
    public final int f11532d;

    /* JADX INFO: renamed from: e */
    public final int f11533e;

    /* JADX INFO: renamed from: f */
    public final long f11534f;

    /* JADX INFO: renamed from: g */
    public final long f11535g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3544a(C3545b c3545b, String str, int i9, int i10, int i11, long j3, long j4) {
        this.f11529a = c3545b;
        this.f11530b = str;
        this.f11532d = i9;
        this.f11533e = i10;
        this.f11531c = i11;
        this.f11534f = j3;
        this.f11535g = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    /* JADX INFO: renamed from: a */
    public final boolean mo6397a() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    /* JADX INFO: renamed from: b */
    public final InputStream mo6398b() {
        InputStream inflaterInputStream;
        C3545b c3545b = this.f11529a;
        synchronized (c3545b) {
            try {
                if (c3545b.f11541k) {
                    C3545b.m7459l(this);
                }
                int i9 = this.f11531c;
                ByteBuffer byteBuffer = c3545b.f11545o;
                int i10 = this.f11533e;
                if (i9 == 8) {
                    try {
                        int i11 = (int) this.f11534f;
                        ByteBuffer byteBufferSlice = byteBuffer.slice();
                        inflaterInputStream = new InflaterInputStream(new C3412a(byteBufferSlice), new Inflater(true), 4096);
                    } catch (Exception e6) {
                        c3545b.m7460a(this, e6);
                        return c3545b.m7467k(this).mo6398b();
                    }
                } else {
                    int i12 = (int) this.f11535g;
                    ByteBuffer byteBufferSlice2 = byteBuffer.slice();
                    inflaterInputStream = new C3412a(byteBufferSlice2);
                }
                if (!c3545b.f11542l) {
                    return inflaterInputStream;
                }
                return new C3413b(inflaterInputStream, this.f11535g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    /* JADX INFO: renamed from: c */
    public final long mo6399c() {
        return this.f11535g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    /* JADX INFO: renamed from: d */
    public final long mo6400d() {
        return this.f11534f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    public final byte[] getBytes() {
        C3545b c3545b = this.f11529a;
        synchronized (c3545b) {
            try {
                if (c3545b.f11541k) {
                    C3545b.m7459l(this);
                }
                int i9 = this.f11531c;
                ByteBuffer byteBuffer = c3545b.f11545o;
                if (i9 == 8) {
                    try {
                        return AbstractC1956a.m4841a(byteBuffer, this);
                    } catch (Exception e6) {
                        c3545b.m7460a(this, e6);
                        return c3545b.m7467k(this).getBytes();
                    }
                }
                int i10 = this.f11533e;
                byte[] bArr = new byte[(int) this.f11535g];
                byteBuffer.get(bArr);
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    public final String getName() {
        return this.f11530b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC2999a
    public final boolean isDirectory() {
        return this.f11530b.endsWith("/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC4855en.m9264h(this.f11529a.f11537g.getName(), ":", this.f11530b);
    }
}
