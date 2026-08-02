package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ez0 implements ht2 {
    public final o52 h;
    public final Inflater i;
    public int j;
    public boolean k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ez0(o52 o52Var, Inflater inflater) {
        this.h = o52Var;
        this.i = inflater;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final o23 a() {
        return this.h.h.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.i.end();
        this.k = true;
        this.h.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final long n(fn fnVar, long j) throws IOException {
        long j2;
        Inflater inflater = this.i;
        fnVar.getClass();
        while (!this.k) {
            try {
                mm2 mm2VarA = fnVar.A(1);
                int iMin = (int) Math.min(8192L, 8192 - mm2VarA.c);
                boolean zNeedsInput = inflater.needsInput();
                o52 o52Var = this.h;
                if (zNeedsInput && !o52Var.b()) {
                    mm2 mm2Var = o52Var.i.h;
                    mm2Var.getClass();
                    int i = mm2Var.c;
                    int i2 = mm2Var.b;
                    int i3 = i - i2;
                    this.j = i3;
                    inflater.setInput(mm2Var.a, i2, i3);
                }
                int iInflate = inflater.inflate(mm2VarA.a, mm2VarA.c, iMin);
                int i4 = this.j;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.j -= remaining;
                    o52Var.skip(remaining);
                }
                if (iInflate > 0) {
                    mm2VarA.c += iInflate;
                    j2 = iInflate;
                    fnVar.i += j2;
                } else {
                    if (mm2VarA.b == mm2VarA.c) {
                        fnVar.h = mm2VarA.a();
                        pm2.a(mm2VarA);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (o52Var.b()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        s.l("closed");
        return 0L;
    }
}
