package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ez0 implements ht2 {

    /* JADX INFO: renamed from: h */
    public final o52 f2690h;

    /* JADX INFO: renamed from: i */
    public final Inflater f2691i;

    /* JADX INFO: renamed from: j */
    public int f2692j;

    /* JADX INFO: renamed from: k */
    public boolean f2693k;

    public ez0(o52 o52Var, Inflater inflater) {
        this.f2690h = o52Var;
        this.f2691i = inflater;
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: a */
    public final o23 mo889a() {
        return this.f2690h.f7529h.mo889a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2693k) {
            return;
        }
        this.f2691i.end();
        this.f2693k = true;
        this.f2690h.close();
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) throws IOException {
        long j2;
        Inflater inflater = this.f2691i;
        c0209fn.getClass();
        while (!this.f2693k) {
            try {
                mm2 mm2VarM1666A = c0209fn.m1666A(1);
                int iMin = (int) Math.min(8192L, 8192 - mm2VarM1666A.f6723c);
                boolean zNeedsInput = inflater.needsInput();
                o52 o52Var = this.f2690h;
                if (zNeedsInput && !o52Var.m3509b()) {
                    mm2 mm2Var = o52Var.f7530i.f3067h;
                    mm2Var.getClass();
                    int i = mm2Var.f6723c;
                    int i2 = mm2Var.f6722b;
                    int i3 = i - i2;
                    this.f2692j = i3;
                    inflater.setInput(mm2Var.f6721a, i2, i3);
                }
                int iInflate = inflater.inflate(mm2VarM1666A.f6721a, mm2VarM1666A.f6723c, iMin);
                int i4 = this.f2692j;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f2692j -= remaining;
                    o52Var.skip(remaining);
                }
                if (iInflate > 0) {
                    mm2VarM1666A.f6723c += iInflate;
                    j2 = iInflate;
                    c0209fn.f3068i += j2;
                } else {
                    if (mm2VarM1666A.f6722b == mm2VarM1666A.f6723c) {
                        c0209fn.f3067h = mm2VarM1666A.m3133a();
                        pm2.m3883a(mm2VarM1666A);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (o52Var.m3509b()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        C0676s.m4653l("closed");
        return 0L;
    }
}
