package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yh0 implements yg0 {
    public final x52 h;
    public final iy2 i;
    public long j;
    public final CopyOnWriteArrayList k;
    public final LinkedBlockingDeque l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yh0(x52 x52Var, iy2 iy2Var) {
        iy2Var.getClass();
        this.h = x52Var;
        this.i = iy2Var;
        this.j = Long.MIN_VALUE;
        this.k = new CopyOnWriteArrayList();
        this.l = new LinkedBlockingDeque();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.k;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            jb2 jb2Var = (jb2) it.next();
            jb2Var.cancel();
            jb2 jb2VarA = jb2Var.a();
            if (jb2VarA != null) {
                this.h.p.addLast(jb2VarA);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ib2 b() {
        jb2 vh0Var;
        x52 x52Var = this.h;
        if (x52Var.a(null)) {
            try {
                vh0Var = x52Var.b();
            } catch (Throwable th) {
                vh0Var = new vh0(th);
            }
            if (vh0Var.e()) {
                return new ib2(vh0Var, (Throwable) null, 6);
            }
            if (vh0Var instanceof vh0) {
                return ((vh0) vh0Var).a;
            }
            this.k.add(vh0Var);
            this.i.d().c(new xh0(wg3.b + " connect " + x52Var.i.i.g(), vh0Var, this), 0L);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yg0
    public final t52 e() throws IOException {
        ib2 ib2VarB;
        long j;
        ib2 ib2Var;
        IOException iOException = null;
        while (true) {
            try {
                if (this.k.isEmpty() && !this.h.a(null)) {
                    a();
                    iOException.getClass();
                    throw iOException;
                }
                if (this.h.k.x) {
                    throw new IOException("Canceled");
                }
                hh1 hh1Var = this.i.a;
                long jNanoTime = System.nanoTime();
                long j2 = this.j - jNanoTime;
                if (this.k.isEmpty() || j2 <= 0) {
                    ib2VarB = b();
                    j = 250000000;
                    this.j = jNanoTime + 250000000;
                } else {
                    j = j2;
                    ib2VarB = null;
                }
                if (ib2VarB == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.k;
                    if (copyOnWriteArrayList.isEmpty() || (ib2Var = (ib2) this.l.poll(j, timeUnit)) == null) {
                        ib2VarB = null;
                    } else {
                        copyOnWriteArrayList.remove(ib2Var.a);
                        ib2VarB = ib2Var;
                    }
                    if (ib2VarB == null) {
                    }
                }
                boolean z = false;
                if (ib2VarB.b == null && ib2VarB.c == null) {
                    a();
                    if (!ib2VarB.a.e()) {
                        ib2VarB = ib2VarB.a.c();
                    }
                    if (ib2VarB.b == null && ib2VarB.c == null) {
                        z = true;
                    }
                    if (z) {
                        return ib2VarB.a.d();
                    }
                }
                Throwable th = ib2VarB.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        fg1.m(iOException, th);
                    }
                }
                jb2 jb2Var = ib2VarB.b;
                if (jb2Var != null) {
                    this.h.p.addFirst(jb2Var);
                }
            } finally {
                a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yg0
    public final x52 i() {
        return this.h;
    }
}
