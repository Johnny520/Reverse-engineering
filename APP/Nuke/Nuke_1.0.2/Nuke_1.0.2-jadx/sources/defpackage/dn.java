package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dn extends InputStream {
    public final /* synthetic */ int h;
    public final /* synthetic */ on i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ dn(on onVar, int i) {
        this.h = i;
        this.i = onVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.h;
        on onVar = this.i;
        switch (i) {
            case 0:
                return (int) Math.min(((fn) onVar).i, 2147483647L);
            default:
                o52 o52Var = (o52) onVar;
                if (!o52Var.j) {
                    return (int) Math.min(o52Var.i.i, 2147483647L);
                }
                c80.v("closed");
                return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.h) {
            case 0:
                break;
            default:
                ((o52) this.i).close();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.h;
        on onVar = this.i;
        switch (i) {
            case 0:
                fn fnVar = (fn) onVar;
                if (fnVar.i > 0) {
                    return fnVar.readByte() & 255;
                }
                return -1;
            default:
                o52 o52Var = (o52) onVar;
                fn fnVar2 = o52Var.i;
                if (o52Var.j) {
                    c80.v("closed");
                    return 0;
                }
                if (fnVar2.i == 0 && o52Var.h.n(fnVar2, 8192L) == -1) {
                    return -1;
                }
                return fnVar2.readByte() & 255;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.h;
        on onVar = this.i;
        switch (i) {
            case 0:
                return ((fn) onVar) + ".inputStream()";
            default:
                return ((o52) onVar) + ".inputStream()";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.h) {
            case 1:
                outputStream.getClass();
                o52 o52Var = (o52) this.i;
                fn fnVar = o52Var.i;
                if (o52Var.j) {
                    c80.v("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (fnVar.i == 0 && o52Var.h.n(fnVar, 8192L) == -1) {
                        return j;
                    }
                    long j2 = fnVar.i;
                    j += j2;
                    qp0.m(j2, 0L, j2);
                    mm2 mm2Var = fnVar.h;
                    while (j2 > 0) {
                        mm2Var.getClass();
                        int iMin = (int) Math.min(j2, mm2Var.c - mm2Var.b);
                        outputStream.write(mm2Var.a, mm2Var.b, iMin);
                        int i = mm2Var.b + iMin;
                        mm2Var.b = i;
                        long j3 = iMin;
                        fnVar.i -= j3;
                        j2 -= j3;
                        if (i == mm2Var.c) {
                            mm2 mm2VarA = mm2Var.a();
                            fnVar.h = mm2VarA;
                            pm2.a(mm2Var);
                            mm2Var = mm2VarA;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    private final void b() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.h;
        on onVar = this.i;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((fn) onVar).read(bArr, i, i2);
            default:
                o52 o52Var = (o52) onVar;
                fn fnVar = o52Var.i;
                if (!o52Var.j) {
                    qp0.m(bArr.length, i, i2);
                    if (fnVar.i == 0 && o52Var.h.n(fnVar, 8192L) == -1) {
                        return -1;
                    }
                    return fnVar.read(bArr, i, i2);
                }
                c80.v("closed");
                return 0;
        }
    }
}
