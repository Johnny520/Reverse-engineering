package p208n4;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2713l implements InterfaceC2722u {

    /* JADX INFO: renamed from: d */
    public final C2716o f8641d;

    /* JADX INFO: renamed from: e */
    public final Inflater f8642e;

    /* JADX INFO: renamed from: f */
    public int f8643f;

    /* JADX INFO: renamed from: g */
    public boolean f8644g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2713l(C2716o c2716o, Inflater inflater) {
        this.f8641d = c2716o;
        this.f8642e = inflater;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3157a() {
        return this.f8641d.f8650d.mo3157a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8644g) {
            return;
        }
        this.f8642e.end();
        this.f8644g = true;
        this.f8641d.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) throws IOException {
        long j6;
        Inflater inflater = this.f8642e;
        AbstractC1665j.m2985e(c2706e, "sink");
        while (!this.f8644g) {
            try {
                C2717p c2717pM4702D = c2706e.m4702D(1);
                int iMin = (int) Math.min(8192L, 8192 - c2717pM4702D.f8655c);
                boolean zNeedsInput = inflater.needsInput();
                C2716o c2716o = this.f8641d;
                if (zNeedsInput && !c2716o.m4753b()) {
                    C2717p c2717p = c2716o.f8651e.f8628d;
                    AbstractC1665j.m2982b(c2717p);
                    int i5 = c2717p.f8655c;
                    int i6 = c2717p.f8654b;
                    int i7 = i5 - i6;
                    this.f8643f = i7;
                    inflater.setInput(c2717p.f8653a, i6, i7);
                }
                int iInflate = inflater.inflate(c2717pM4702D.f8653a, c2717pM4702D.f8655c, iMin);
                int i8 = this.f8643f;
                if (i8 != 0) {
                    int remaining = i8 - inflater.getRemaining();
                    this.f8643f -= remaining;
                    c2716o.skip(remaining);
                }
                if (iInflate > 0) {
                    c2717pM4702D.f8655c += iInflate;
                    j6 = iInflate;
                    c2706e.f8629e += j6;
                } else {
                    if (c2717pM4702D.f8654b == c2717pM4702D.f8655c) {
                        c2706e.f8628d = c2717pM4702D.m4757a();
                        AbstractC2718q.m4761a(c2717pM4702D);
                    }
                    j6 = 0;
                }
                if (j6 > 0) {
                    return j6;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (c2716o.m4753b()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e5) {
                throw new IOException(e5);
            }
        }
        throw new IllegalStateException("closed");
    }
}
