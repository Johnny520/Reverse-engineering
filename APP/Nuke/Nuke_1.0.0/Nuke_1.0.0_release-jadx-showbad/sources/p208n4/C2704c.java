package p208n4;

import com.bumptech.glide.AbstractC1926h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import me.dartcv.nuke.BuildConfig;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2704c extends InputStream {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8625d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2708g f8626e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2704c(InterfaceC2708g interfaceC2708g, int i5) {
        this.f8625d = i5;
        this.f8626e = interfaceC2708g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f8625d) {
            case 0:
                jMin = Math.min(((C2706e) this.f8626e).f8629e, Integer.MAX_VALUE);
                break;
            default:
                C2716o c2716o = (C2716o) this.f8626e;
                if (c2716o.f8652f) {
                    throw new IOException("closed");
                }
                jMin = Math.min(c2716o.f8651e.f8629e, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f8625d) {
            case 0:
                break;
            default:
                ((C2716o) this.f8626e).close();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f8625d) {
            case 0:
                C2706e c2706e = (C2706e) this.f8626e;
                if (c2706e.f8629e > 0) {
                    return c2706e.readByte() & 255;
                }
                return -1;
            default:
                C2716o c2716o = (C2716o) this.f8626e;
                C2706e c2706e2 = c2716o.f8651e;
                if (c2716o.f8652f) {
                    throw new IOException("closed");
                }
                if (c2706e2.f8629e == 0 && c2716o.f8650d.mo554y(c2706e2, 8192L) == -1) {
                    return -1;
                }
                return c2706e2.readByte() & 255;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f8625d) {
            case 0:
                return ((C2706e) this.f8626e) + ".inputStream()";
            default:
                return ((C2716o) this.f8626e) + ".inputStream()";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f8625d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1665j.m2985e(outputStream, "out");
                C2716o c2716o = (C2716o) this.f8626e;
                C2706e c2706e = c2716o.f8651e;
                if (c2716o.f8652f) {
                    throw new IOException("closed");
                }
                long j5 = 0;
                long j6 = 0;
                while (true) {
                    if (c2706e.f8629e == j5 && c2716o.f8650d.mo554y(c2706e, 8192L) == -1) {
                        return j6;
                    }
                    long j7 = c2706e.f8629e;
                    j6 += j7;
                    AbstractC1926h.m3564g(j7, 0L, j7);
                    C2717p c2717p = c2706e.f8628d;
                    while (j7 > j5) {
                        AbstractC1665j.m2982b(c2717p);
                        int iMin = (int) Math.min(j7, c2717p.f8655c - c2717p.f8654b);
                        outputStream.write(c2717p.f8653a, c2717p.f8654b, iMin);
                        int i5 = c2717p.f8654b + iMin;
                        c2717p.f8654b = i5;
                        long j8 = iMin;
                        c2706e.f8629e -= j8;
                        j7 -= j8;
                        if (i5 == c2717p.f8655c) {
                            C2717p c2717pM4757a = c2717p.m4757a();
                            c2706e.f8628d = c2717pM4757a;
                            AbstractC2718q.m4761a(c2717p);
                            c2717p = c2717pM4757a;
                        }
                        j5 = 0;
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) throws IOException {
        switch (this.f8625d) {
            case 0:
                AbstractC1665j.m2985e(bArr, "sink");
                return ((C2706e) this.f8626e).read(bArr, i5, i6);
            default:
                AbstractC1665j.m2985e(bArr, "data");
                C2716o c2716o = (C2716o) this.f8626e;
                C2706e c2706e = c2716o.f8651e;
                if (!c2716o.f8652f) {
                    AbstractC1926h.m3564g(bArr.length, i5, i6);
                    if (c2706e.f8629e == 0 && c2716o.f8650d.mo554y(c2706e, 8192L) == -1) {
                        return -1;
                    }
                    return c2706e.read(bArr, i5, i6);
                }
                throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m4698b() {
    }
}
