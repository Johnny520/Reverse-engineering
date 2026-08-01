package p156e4;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import p123Y3.AbstractC1776g;
import p208n4.AbstractC2724w;
import p208n4.C2706e;
import p208n4.InterfaceC2720s;

/* JADX INFO: renamed from: e4.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2059v implements InterfaceC2720s {

    /* JADX INFO: renamed from: d */
    public final boolean f6886d;

    /* JADX INFO: renamed from: e */
    public final C2706e f6887e = new C2706e();

    /* JADX INFO: renamed from: f */
    public boolean f6888f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2062y f6889g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2059v(C2062y c2062y, boolean z5) {
        this.f6889g = c2062y;
        this.f6886d = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3339a() {
        return this.f6889g.f6907n;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[IGET, INVOKE, IGET, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[IGET, INVOKE, IGET, INVOKE, INVOKE, IGET, IGET, ARITH, IGET, IGET, INVOKE, IGET, ARITH, IPUT] complete}, expected: {[IGET, INVOKE, IGET, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: b */
    public final void m3766b(boolean z5) {
        long jMin;
        boolean z6;
        C2062y c2062y = this.f6889g;
        synchronized (c2062y) {
            c2062y.f6907n.m4696h();
            while (c2062y.f6900g >= c2062y.f6901h && !this.f6886d && !this.f6888f && c2062y.m3774f() == null) {
                try {
                    try {
                        c2062y.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    c2062y.f6907n.m3768l();
                    throw th;
                }
            }
            c2062y.f6907n.m3768l();
            c2062y.m3770b();
            jMin = Math.min(c2062y.f6901h - c2062y.f6900g, this.f6887e.f8629e);
            c2062y.f6900g += jMin;
            z6 = z5 && jMin == this.f6887e.f8629e;
        }
        this.f6889g.f6907n.m4696h();
        try {
            C2062y c2062y2 = this.f6889g;
            c2062y2.f6898e.m3757j(c2062y2.f6897d, z6, this.f6887e, jMin);
        } finally {
            this.f6889g.f6907n.m3768l();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2062y c2062y = this.f6889g;
        TimeZone timeZone = AbstractC1776g.f6076a;
        synchronized (c2062y) {
            if (this.f6888f) {
                return;
            }
            boolean z5 = c2062y.m3774f() == null;
            C2062y c2062y2 = this.f6889g;
            if (!c2062y2.f6905l.f6886d) {
                if (this.f6887e.f8629e > 0) {
                    while (this.f6887e.f8629e > 0) {
                        m3766b(true);
                    }
                } else if (z5) {
                    c2062y2.f6898e.m3757j(c2062y2.f6897d, true, null, 0L);
                }
            }
            C2062y c2062y3 = this.f6889g;
            synchronized (c2062y3) {
                this.f6888f = true;
                c2062y3.notifyAll();
            }
            this.f6889g.f6898e.flush();
            this.f6889g.m3769a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s, java.io.Flushable
    public final void flush() {
        C2062y c2062y = this.f6889g;
        TimeZone timeZone = AbstractC1776g.f6076a;
        synchronized (c2062y) {
            c2062y.m3770b();
        }
        while (this.f6887e.f8629e > 0) {
            m3766b(false);
            this.f6889g.f6898e.flush();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: p */
    public final void mo3343p(C2706e c2706e, long j5) {
        TimeZone timeZone = AbstractC1776g.f6076a;
        C2706e c2706e2 = this.f6887e;
        c2706e2.mo3343p(c2706e, j5);
        while (c2706e2.f8629e >= 16384) {
            m3766b(false);
        }
    }
}
