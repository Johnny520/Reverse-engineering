package p156e4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1776g;
import p161f4.C2167a;
import p208n4.AbstractC2724w;
import p208n4.C2706e;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: e4.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2060w implements InterfaceC2722u {

    /* JADX INFO: renamed from: d */
    public final long f6890d;

    /* JADX INFO: renamed from: e */
    public boolean f6891e;

    /* JADX INFO: renamed from: f */
    public final C2706e f6892f = new C2706e();

    /* JADX INFO: renamed from: g */
    public final C2706e f6893g = new C2706e();

    /* JADX INFO: renamed from: h */
    public boolean f6894h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2062y f6895i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2060w(C2062y c2062y, long j5, boolean z5) {
        this.f6895i = c2062y;
        this.f6890d = j5;
        this.f6891e = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3157a() {
        return this.f6895i.f6906m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j5;
        C2062y c2062y = this.f6895i;
        synchronized (c2062y) {
            this.f6894h = true;
            C2706e c2706e = this.f6893g;
            j5 = c2706e.f8629e;
            c2706e.m4715h();
            c2062y.notifyAll();
        }
        if (j5 > 0) {
            C2062y c2062y2 = this.f6895i;
            TimeZone timeZone = AbstractC1776g.f6076a;
            c2062y2.f6898e.m3756h(j5);
        }
        this.f6895i.m3769a();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, IGET, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) throws Throwable {
        boolean z5;
        Throwable c2037d;
        long jMo554y;
        AbstractC1665j.m2985e(c2706e, "sink");
        do {
            C2062y c2062y = this.f6895i;
            synchronized (c2062y) {
                c2062y.f6898e.getClass();
                C2059v c2059v = c2062y.f6905l;
                z5 = true;
                boolean z6 = c2059v.f6888f || c2059v.f6886d;
                if (z6) {
                    c2062y.f6906m.m4696h();
                }
                try {
                    if (c2062y.m3774f() == null || this.f6891e) {
                        c2037d = null;
                    } else {
                        c2037d = c2062y.f6909p;
                        if (c2037d == null) {
                            EnumC2039b enumC2039bM3774f = c2062y.m3774f();
                            AbstractC1665j.m2982b(enumC2039bM3774f);
                            c2037d = new C2037D(enumC2039bM3774f);
                        }
                    }
                    if (this.f6894h) {
                        throw new IOException("stream closed");
                    }
                    C2706e c2706e2 = this.f6893g;
                    long j6 = c2706e2.f8629e;
                    if (j6 > 0) {
                        jMo554y = c2706e2.mo554y(c2706e, Math.min(8192L, j6));
                        C2167a.m4004b(c2062y.f6899f, jMo554y, 0L, 2);
                        long jM4005a = c2062y.f6899f.m4005a();
                        if (c2037d == null && jM4005a >= c2062y.f6898e.f6862t.m3734a() / 2) {
                            c2062y.f6898e.m3759m(jM4005a, c2062y.f6897d);
                            C2167a.m4004b(c2062y.f6899f, 0L, jM4005a, 1);
                        }
                        z5 = false;
                    } else {
                        if (this.f6891e || c2037d != null) {
                            z5 = false;
                        } else {
                            try {
                                c2062y.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jMo554y = -1;
                    }
                } finally {
                    if (z6) {
                        c2062y.f6906m.m3768l();
                    }
                }
            }
            this.f6895i.f6898e.f6861s.getClass();
        } while (z5);
        if (jMo554y != -1) {
            return jMo554y;
        }
        if (c2037d == null) {
            return -1L;
        }
        throw c2037d;
    }
}
