package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yh0 implements yg0 {

    /* JADX INFO: renamed from: h */
    public final x52 f13456h;

    /* JADX INFO: renamed from: i */
    public final iy2 f13457i;

    /* JADX INFO: renamed from: j */
    public long f13458j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f13459k;

    /* JADX INFO: renamed from: l */
    public final LinkedBlockingDeque f13460l;

    public yh0(x52 x52Var, iy2 iy2Var) {
        iy2Var.getClass();
        this.f13456h = x52Var;
        this.f13457i = iy2Var;
        this.f13458j = Long.MIN_VALUE;
        this.f13459k = new CopyOnWriteArrayList();
        this.f13460l = new LinkedBlockingDeque();
    }

    /* JADX INFO: renamed from: a */
    public final void m6278a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13459k;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            jb2 jb2Var = (jb2) it.next();
            jb2Var.cancel();
            jb2 jb2VarMo979a = jb2Var.mo979a();
            if (jb2VarMo979a != null) {
                this.f13456h.f12834p.addLast(jb2VarMo979a);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX INFO: renamed from: b */
    public final ib2 m6279b() {
        jb2 vh0Var;
        x52 x52Var = this.f13456h;
        if (x52Var.m6036a(null)) {
            try {
                vh0Var = x52Var.m6037b();
            } catch (Throwable th) {
                vh0Var = new vh0(th);
            }
            if (vh0Var.mo982e()) {
                return new ib2(vh0Var, (Throwable) null, 6);
            }
            if (vh0Var instanceof vh0) {
                return ((vh0) vh0Var).f11964a;
            }
            this.f13459k.add(vh0Var);
            this.f13457i.m2421d().m2236c(new xh0(wg3.f12508b + " connect " + x52Var.f12827i.f8739i.m6361g(), vh0Var, this), 0L);
        }
        return null;
    }

    @Override // p000.yg0
    /* JADX INFO: renamed from: e */
    public final t52 mo2186e() throws IOException {
        ib2 ib2VarM6279b;
        long j;
        ib2 ib2Var;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f13459k.isEmpty() && !this.f13456h.m6036a(null)) {
                    m6278a();
                    iOException.getClass();
                    throw iOException;
                }
                if (this.f13456h.f12829k.f9929x) {
                    throw new IOException("Canceled");
                }
                hh1 hh1Var = this.f13457i.f4835a;
                long jNanoTime = System.nanoTime();
                long j2 = this.f13458j - jNanoTime;
                if (this.f13459k.isEmpty() || j2 <= 0) {
                    ib2VarM6279b = m6279b();
                    j = 250000000;
                    this.f13458j = jNanoTime + 250000000;
                } else {
                    j = j2;
                    ib2VarM6279b = null;
                }
                if (ib2VarM6279b == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f13459k;
                    if (copyOnWriteArrayList.isEmpty() || (ib2Var = (ib2) this.f13460l.poll(j, timeUnit)) == null) {
                        ib2VarM6279b = null;
                    } else {
                        copyOnWriteArrayList.remove(ib2Var.f4522a);
                        ib2VarM6279b = ib2Var;
                    }
                    if (ib2VarM6279b == null) {
                    }
                }
                boolean z = false;
                if (ib2VarM6279b.f4523b == null && ib2VarM6279b.f4524c == null) {
                    m6278a();
                    if (!ib2VarM6279b.f4522a.mo982e()) {
                        ib2VarM6279b = ib2VarM6279b.f4522a.mo980c();
                    }
                    if (ib2VarM6279b.f4523b == null && ib2VarM6279b.f4524c == null) {
                        z = true;
                    }
                    if (z) {
                        return ib2VarM6279b.f4522a.mo981d();
                    }
                }
                Throwable th = ib2VarM6279b.f4524c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        fg1.m1638m(iOException, th);
                    }
                }
                jb2 jb2Var = ib2VarM6279b.f4523b;
                if (jb2Var != null) {
                    this.f13456h.f12834p.addFirst(jb2Var);
                }
            } finally {
                m6278a();
            }
        }
    }

    @Override // p000.yg0
    /* JADX INFO: renamed from: i */
    public final x52 mo2187i() {
        return this.f13456h;
    }
}
