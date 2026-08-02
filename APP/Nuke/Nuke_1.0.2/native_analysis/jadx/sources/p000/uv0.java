package p000;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uv0 implements fr2 {

    /* JADX INFO: renamed from: h */
    public final boolean f11510h;

    /* JADX INFO: renamed from: i */
    public final C0209fn f11511i = new C0209fn();

    /* JADX INFO: renamed from: j */
    public boolean f11512j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xv0 f11513k;

    public uv0(xv0 xv0Var, boolean z) {
        this.f11513k = xv0Var;
        this.f11510h = z;
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: a */
    public final o23 mo1174a() {
        return this.f11513k.f13191r;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: b */
    public final void m5586b(boolean z) {
        long jMin;
        boolean z2;
        xv0 xv0Var = this.f11513k;
        synchronized (xv0Var) {
            xv0Var.f13191r.m5886h();
            while (xv0Var.f13184k >= xv0Var.f13185l && !this.f11510h && !this.f11512j && xv0Var.m6187f() == null) {
                try {
                    try {
                        xv0Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    xv0Var.f13191r.m6004l();
                    throw th;
                }
            }
            xv0Var.f13191r.m6004l();
            xv0Var.m6183b();
            jMin = Math.min(xv0Var.f13185l - xv0Var.f13184k, this.f11511i.f3068i);
            xv0Var.f13184k += jMin;
            z2 = z && jMin == this.f11511i.f3068i;
        }
        this.f11513k.f13191r.m5886h();
        try {
            xv0 xv0Var2 = this.f11513k;
            xv0Var2.f13182i.m4286j(xv0Var2.f13181h, z2, this.f11511i, jMin);
        } finally {
            this.f11513k.f13191r.m6004l();
        }
    }

    @Override // p000.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xv0 xv0Var = this.f11513k;
        TimeZone timeZone = wg3.f12507a;
        synchronized (xv0Var) {
            if (this.f11512j) {
                return;
            }
            boolean z = xv0Var.m6187f() == null;
            xv0 xv0Var2 = this.f11513k;
            if (!xv0Var2.f13189p.f11510h) {
                if (this.f11511i.f3068i > 0) {
                    while (this.f11511i.f3068i > 0) {
                        m5586b(true);
                    }
                } else if (z) {
                    xv0Var2.f13182i.m4286j(xv0Var2.f13181h, true, null, 0L);
                }
            }
            xv0 xv0Var3 = this.f11513k;
            synchronized (xv0Var3) {
                this.f11512j = true;
                xv0Var3.notifyAll();
            }
            this.f11513k.f13182i.flush();
            this.f11513k.m6182a();
        }
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: d */
    public final void mo1175d(C0209fn c0209fn, long j) {
        TimeZone timeZone = wg3.f12507a;
        C0209fn c0209fn2 = this.f11511i;
        c0209fn2.mo1175d(c0209fn, j);
        while (c0209fn2.f3068i >= 16384) {
            m5586b(false);
        }
    }

    @Override // p000.fr2, java.io.Flushable
    public final void flush() {
        xv0 xv0Var = this.f11513k;
        TimeZone timeZone = wg3.f12507a;
        synchronized (xv0Var) {
            xv0Var.m6183b();
        }
        while (this.f11511i.f3068i > 0) {
            m5586b(false);
            this.f11513k.f13182i.flush();
        }
    }
}
