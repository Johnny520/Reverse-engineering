package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vv0 implements ht2 {

    /* JADX INFO: renamed from: h */
    public final long f12182h;

    /* JADX INFO: renamed from: i */
    public boolean f12183i;

    /* JADX INFO: renamed from: j */
    public final C0209fn f12184j = new C0209fn();

    /* JADX INFO: renamed from: k */
    public final C0209fn f12185k = new C0209fn();

    /* JADX INFO: renamed from: l */
    public boolean f12186l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ xv0 f12187m;

    public vv0(xv0 xv0Var, long j, boolean z) {
        this.f12187m = xv0Var;
        this.f12182h = j;
        this.f12183i = z;
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: a */
    public final o23 mo889a() {
        return this.f12187m.f13190q;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        xv0 xv0Var = this.f12187m;
        synchronized (xv0Var) {
            this.f12186l = true;
            C0209fn c0209fn = this.f12185k;
            j = c0209fn.f3068i;
            c0209fn.m1679g();
            xv0Var.notifyAll();
        }
        if (j > 0) {
            xv0 xv0Var2 = this.f12187m;
            TimeZone timeZone = wg3.f12507a;
            xv0Var2.f13182i.m4285h(j);
        }
        this.f12187m.m6182a();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[Catch: all -> 0x0025, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0008, B:7:0x0015, B:13:0x001f, B:47:0x00bc, B:61:0x00e2, B:62:0x00e7, B:17:0x0028, B:19:0x002e, B:21:0x0032, B:23:0x0036, B:27:0x0047, B:29:0x004b, B:31:0x0055, B:33:0x0072, B:35:0x0083, B:38:0x009a, B:41:0x00a4, B:43:0x00aa, B:44:0x00b6, B:58:0x00d8, B:59:0x00df), top: B:66:0x0008, inners: #0 }] */
    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo891n(C0209fn c0209fn, long j) throws Throwable {
        boolean z;
        Throwable av2Var;
        long j2;
        long jMo891n;
        c0209fn.getClass();
        do {
            xv0 xv0Var = this.f12187m;
            synchronized (xv0Var) {
                xv0Var.f13182i.getClass();
                uv0 uv0Var = xv0Var.f13189p;
                z = true;
                boolean z2 = uv0Var.f11512j || uv0Var.f11510h;
                if (z2) {
                    xv0Var.f13190q.m5886h();
                }
                try {
                    if (xv0Var.m6187f() == null || this.f12183i) {
                        av2Var = null;
                    } else {
                        av2Var = xv0Var.f13193t;
                        if (av2Var == null) {
                            cg0 cg0VarM6187f = xv0Var.m6187f();
                            cg0VarM6187f.getClass();
                            av2Var = new av2(cg0VarM6187f);
                        }
                    }
                    if (this.f12186l) {
                        throw new IOException("stream closed");
                    }
                    C0209fn c0209fn2 = this.f12185k;
                    long j3 = c0209fn2.f3068i;
                    if (j3 > 0) {
                        jMo891n = c0209fn2.mo891n(c0209fn, Math.min(8192L, j3));
                        sd3.m4810b(xv0Var.f13183j, jMo891n, 0L, 2);
                        long jM4811a = xv0Var.f13183j.m4811a();
                        if (av2Var == null) {
                            j2 = -1;
                            if (jM4811a >= xv0Var.f13182i.f9202x.m6170a() / 2) {
                                xv0Var.f13182i.m4288o(jM4811a, xv0Var.f13181h);
                                sd3.m4810b(xv0Var.f13183j, 0L, jM4811a, 1);
                            }
                        } else {
                            j2 = -1;
                        }
                    } else {
                        j2 = -1;
                        if (this.f12183i || av2Var != null) {
                            jMo891n = -1;
                        } else {
                            try {
                                xv0Var.wait();
                                jMo891n = -1;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    z = false;
                } finally {
                    if (z2) {
                        xv0Var.f13190q.m6004l();
                    }
                }
            }
            this.f12187m.f13182i.f9201w.getClass();
        } while (z);
        if (jMo891n != j2) {
            return jMo891n;
        }
        if (av2Var == null) {
            return j2;
        }
        throw av2Var;
    }
}
