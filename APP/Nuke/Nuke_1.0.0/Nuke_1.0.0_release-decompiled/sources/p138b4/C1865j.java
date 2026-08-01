package p138b4;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p123Y3.AbstractC1776g;
import p133a4.C1808d;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: b4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1865j implements InterfaceC1862g {

    /* JADX INFO: renamed from: d */
    public final C1872q f6315d;

    /* JADX INFO: renamed from: e */
    public final C1808d f6316e;

    /* JADX INFO: renamed from: f */
    public final long f6317f;

    /* JADX INFO: renamed from: g */
    public long f6318g;

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArrayList f6319h;

    /* JADX INFO: renamed from: i */
    public final LinkedBlockingDeque f6320i;

    public C1865j(C1872q c1872q, C1808d c1808d) {
        AbstractC1665j.m2985e(c1808d, "taskRunner");
        this.f6315d = c1872q;
        this.f6316e = c1808d;
        this.f6317f = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f6318g = Long.MIN_VALUE;
        this.f6319h = new CopyOnWriteArrayList();
        this.f6320i = new LinkedBlockingDeque();
    }

    /* JADX INFO: renamed from: a */
    public final void m3345a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6319h;
        Iterator it = copyOnWriteArrayList.iterator();
        AbstractC1665j.m2984d(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC1875t interfaceC1875t = (InterfaceC1875t) it.next();
            interfaceC1875t.cancel();
            InterfaceC1875t interfaceC1875tMo3326a = interfaceC1875t.mo3326a();
            if (interfaceC1875tMo3326a != null) {
                this.f6315d.f6380p.addLast(interfaceC1875tMo3326a);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX INFO: renamed from: b */
    public final C1874s m3346b() {
        InterfaceC1875t c1863h;
        C1872q c1872q = this.f6315d;
        if (c1872q.m3364a(null)) {
            try {
                c1863h = c1872q.m3365b();
            } catch (Throwable th) {
                c1863h = new C1863h(th);
            }
            if (c1863h.mo3330e()) {
                return new C1874s(c1863h, (Throwable) null, 6);
            }
            if (c1863h instanceof C1863h) {
                return ((C1863h) c1863h).f6312a;
            }
            this.f6319h.add(c1863h);
            this.f6316e.m3283d().m3277c(new C1864i(AbstractC1776g.f6077b + " connect " + c1872q.f6373i.f5782h.m3052g(), c1863h, this), 0L);
        }
        return null;
    }

    @Override // p138b4.InterfaceC1862g
    /* JADX INFO: renamed from: c */
    public final C1870o mo3117c() throws IOException {
        C1874s c1874sM3346b;
        long j5;
        C1874s c1874s;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f6319h.isEmpty() && !this.f6315d.m3364a(null)) {
                    m3345a();
                    AbstractC1665j.m2982b(iOException);
                    throw iOException;
                }
                if (this.f6315d.f6375k.f6342t) {
                    throw new IOException("Canceled");
                }
                C1753n c1753n = this.f6316e.f6162a;
                long jNanoTime = System.nanoTime();
                long j6 = this.f6318g - jNanoTime;
                if (this.f6319h.isEmpty() || j6 <= 0) {
                    c1874sM3346b = m3346b();
                    j5 = this.f6317f;
                    this.f6318g = jNanoTime + j5;
                } else {
                    j5 = j6;
                    c1874sM3346b = null;
                }
                if (c1874sM3346b == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f6319h;
                    if (copyOnWriteArrayList.isEmpty() || (c1874s = (C1874s) this.f6320i.poll(j5, timeUnit)) == null) {
                        c1874sM3346b = null;
                    } else {
                        copyOnWriteArrayList.remove(c1874s.f6382a);
                        c1874sM3346b = c1874s;
                    }
                    if (c1874sM3346b == null) {
                    }
                }
                boolean z5 = false;
                if (c1874sM3346b.f6383b == null && c1874sM3346b.f6384c == null) {
                    m3345a();
                    if (!c1874sM3346b.f6382a.mo3330e()) {
                        c1874sM3346b = c1874sM3346b.f6382a.mo3328c();
                    }
                    if (c1874sM3346b.f6383b == null && c1874sM3346b.f6384c == null) {
                        z5 = true;
                    }
                    if (z5) {
                        return c1874sM3346b.f6382a.mo3329d();
                    }
                }
                Throwable th = c1874sM3346b.f6384c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        AbstractC2352g.m4193f(iOException, th);
                    }
                }
                InterfaceC1875t interfaceC1875t = c1874sM3346b.f6383b;
                if (interfaceC1875t != null) {
                    this.f6315d.f6380p.addFirst(interfaceC1875t);
                }
            } finally {
                m3345a();
            }
        }
    }

    @Override // p138b4.InterfaceC1862g
    /* JADX INFO: renamed from: h */
    public final C1872q mo3118h() {
        return this.f6315d;
    }
}
