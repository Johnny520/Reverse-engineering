package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: dn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0136dn extends InputStream {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2120h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC0549on f2121i;

    public /* synthetic */ C0136dn(InterfaceC0549on interfaceC0549on, int i) {
        this.f2120h = i;
        this.f2121i = interfaceC0549on;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.f2120h;
        InterfaceC0549on interfaceC0549on = this.f2121i;
        switch (i) {
            case 0:
                return (int) Math.min(((C0209fn) interfaceC0549on).f3068i, 2147483647L);
            default:
                o52 o52Var = (o52) interfaceC0549on;
                if (!o52Var.f7531j) {
                    return (int) Math.min(o52Var.f7530i.f3068i, 2147483647L);
                }
                c80.m678v("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2120h) {
            case 0:
                break;
            default:
                ((o52) this.f2121i).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f2120h;
        InterfaceC0549on interfaceC0549on = this.f2121i;
        switch (i) {
            case 0:
                C0209fn c0209fn = (C0209fn) interfaceC0549on;
                if (c0209fn.f3068i > 0) {
                    return c0209fn.readByte() & 255;
                }
                return -1;
            default:
                o52 o52Var = (o52) interfaceC0549on;
                C0209fn c0209fn2 = o52Var.f7530i;
                if (o52Var.f7531j) {
                    c80.m678v("closed");
                    return 0;
                }
                if (c0209fn2.f3068i == 0 && o52Var.f7529h.mo891n(c0209fn2, 8192L) == -1) {
                    return -1;
                }
                return c0209fn2.readByte() & 255;
        }
    }

    public final String toString() {
        int i = this.f2120h;
        InterfaceC0549on interfaceC0549on = this.f2121i;
        switch (i) {
            case 0:
                return ((C0209fn) interfaceC0549on) + ".inputStream()";
            default:
                return ((o52) interfaceC0549on) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f2120h) {
            case 1:
                outputStream.getClass();
                o52 o52Var = (o52) this.f2121i;
                C0209fn c0209fn = o52Var.f7530i;
                if (o52Var.f7531j) {
                    c80.m678v("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (c0209fn.f3068i == 0 && o52Var.f7529h.mo891n(c0209fn, 8192L) == -1) {
                        return j;
                    }
                    long j2 = c0209fn.f3068i;
                    j += j2;
                    qp0.m4258m(j2, 0L, j2);
                    mm2 mm2Var = c0209fn.f3067h;
                    while (j2 > 0) {
                        mm2Var.getClass();
                        int iMin = (int) Math.min(j2, mm2Var.f6723c - mm2Var.f6722b);
                        outputStream.write(mm2Var.f6721a, mm2Var.f6722b, iMin);
                        int i = mm2Var.f6722b + iMin;
                        mm2Var.f6722b = i;
                        long j3 = iMin;
                        c0209fn.f3068i -= j3;
                        j2 -= j3;
                        if (i == mm2Var.f6723c) {
                            mm2 mm2VarM3133a = mm2Var.m3133a();
                            c0209fn.f3067h = mm2VarM3133a;
                            pm2.m3883a(mm2Var);
                            mm2Var = mm2VarM3133a;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m1061b() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f2120h;
        InterfaceC0549on interfaceC0549on = this.f2121i;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((C0209fn) interfaceC0549on).read(bArr, i, i2);
            default:
                o52 o52Var = (o52) interfaceC0549on;
                C0209fn c0209fn = o52Var.f7530i;
                if (!o52Var.f7531j) {
                    qp0.m4258m(bArr.length, i, i2);
                    if (c0209fn.f3068i == 0 && o52Var.f7529h.mo891n(c0209fn, 8192L) == -1) {
                        return -1;
                    }
                    return c0209fn.read(bArr, i, i2);
                }
                c80.m678v("closed");
                return 0;
        }
    }
}
