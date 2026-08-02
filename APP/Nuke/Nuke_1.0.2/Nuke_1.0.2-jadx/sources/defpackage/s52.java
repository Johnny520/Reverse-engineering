package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s52 implements Cloneable {
    public final et1 h;
    public final k82 i;
    public final ud0 j;
    public volatile kg0 k;
    public final r52 l;
    public final AtomicBoolean m;
    public Object n;
    public yg0 o;
    public t52 p;
    public boolean q;
    public f90 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public volatile boolean x;
    public volatile f90 y;
    public final CopyOnWriteArrayList z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AtomicReferenceFieldUpdater.newUpdater(s52.class, kg0.class, "k");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s52(et1 et1Var, k82 k82Var) {
        et1Var.getClass();
        this.h = et1Var;
        this.i = k82Var;
        this.j = (ud0) et1Var.E.i;
        et1Var.d.getClass();
        this.k = kg0.a;
        r52 r52Var = new r52(this);
        r52Var.g(et1Var.w);
        this.l = r52Var;
        this.m = new AtomicBoolean();
        this.w = true;
        this.z = new CopyOnWriteArrayList();
        new AtomicReference(k82Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String a(s52 s52Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(s52Var.x ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(s52Var.i.a.g());
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void cancel() {
        if (this.x) {
            return;
        }
        this.x = true;
        f90 f90Var = this.y;
        if (f90Var != null) {
            ((xg0) f90Var.d).cancel();
        }
        Iterator it = this.z.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((jb2) it.next()).cancel();
        }
        this.k.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        return new s52(this.h, this.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(t52 t52Var) {
        t52Var.getClass();
        TimeZone timeZone = wg3.a;
        if (this.p != null) {
            s.l("Check failed.");
        } else {
            this.p = t52Var;
            t52Var.p.add(new q52(this, this.n));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException f(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM;
        TimeZone timeZone = wg3.a;
        t52 t52Var = this.p;
        if (t52Var != null) {
            synchronized (t52Var) {
                socketM = m();
            }
            if (this.p == null) {
                if (socketM != null) {
                    wg3.c(socketM);
                }
                this.k.getClass();
            } else if (socketM != null) {
                s.l("Check failed.");
                return null;
            }
        }
        if (!this.q && this.l.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        kg0 kg0Var = this.k;
        if (iOException == null) {
            kg0Var.getClass();
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        kg0Var.getClass();
        return interruptedIOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(dp dpVar) {
        if (!this.m.compareAndSet(false, true)) {
            s.l("Already Executed");
            return;
        }
        zz1 zz1Var = zz1.a;
        this.n = zz1.a.e();
        this.k.getClass();
        kj1 kj1Var = this.h.a;
        p52 p52Var = new p52(this, dpVar);
        kj1Var.getClass();
        kj1.H(kj1Var, p52Var, null, null, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r92 h() {
        if (!this.m.compareAndSet(false, true)) {
            s.l("Already Executed");
            return null;
        }
        this.l.h();
        zz1 zz1Var = zz1.a;
        this.n = zz1.a.e();
        this.k.getClass();
        try {
            kj1 kj1Var = this.h.a;
            synchronized (kj1Var) {
                ((ArrayDeque) kj1Var.l).add(this);
            }
            return j();
        } finally {
            kj1 kj1Var2 = this.h.a;
            kj1Var2.getClass();
            kj1.H(kj1Var2, null, this, null, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(boolean z) {
        f90 f90Var;
        synchronized (this) {
            if (!this.w) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (f90Var = this.y) != null) {
            ((xg0) f90Var.d).cancel();
            ((s52) f90Var.b).k(f90Var, true, true, true, true, null);
        }
        this.r = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r92 j() {
        ArrayList arrayList = new ArrayList();
        iu.g0(this.h.b, arrayList);
        arrayList.add(new zo(4));
        arrayList.add(new zo(2));
        arrayList.add(new zo(3));
        arrayList.add(zo.c);
        iu.g0(this.h.c, arrayList);
        arrayList.add(zo.b);
        k82 k82Var = this.i;
        et1 et1Var = this.h;
        et1Var.getClass();
        v52 v52Var = new v52(this, arrayList, 0, null, k82Var, et1Var.x, et1Var.y, et1Var.z, et1Var.g, et1Var.u, et1Var.E, et1Var.j, et1Var.k, et1Var.t, et1Var.l, et1Var.n, et1Var.m, et1Var.e, et1Var.o, et1Var.p, et1Var.q, et1Var.v);
        boolean z = false;
        try {
            try {
                r92 r92VarB = v52Var.b(this.i);
                if (this.x) {
                    ug3.b(r92VarB);
                    throw new IOException("Canceled");
                }
                l(null);
                return r92VarB;
            } catch (IOException e) {
                z = true;
                IOException iOExceptionL = l(e);
                iOExceptionL.getClass();
                throw iOExceptionL;
            }
        } catch (Throwable th) {
            if (!z) {
            }
            throw th;
        }
        if (!z) {
            l(null);
        }
        throw th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException k(f90 f90Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        f90Var.getClass();
        if (f90Var.equals(this.y)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.s) {
                            if ((z2 || !this.t) && ((!z4 || !this.u) && (!z3 || !this.v))) {
                            }
                        }
                        if (z) {
                            this.s = false;
                        }
                        if (z2) {
                            this.t = false;
                        }
                        if (z4) {
                            this.u = false;
                        }
                        if (z3) {
                            this.v = false;
                        }
                        boolean z7 = (this.s || this.t || this.u || this.v) ? false : true;
                        if (z7) {
                            if (!this.w) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = z2 ? false : false;
                }
            }
            if (z5) {
                this.y = null;
                t52 t52Var = this.p;
                if (t52Var != null) {
                    synchronized (t52Var) {
                        t52Var.m++;
                    }
                }
            }
            if (z6) {
                return f(iOException);
            }
        }
        return iOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException l(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.w) {
                this.w = false;
                if (!this.s && !this.t && !this.u) {
                    if (!this.v) {
                        z = true;
                    }
                }
            }
        }
        return z ? f(iOException) : iOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Socket m() {
        t52 t52Var = this.p;
        t52Var.getClass();
        TimeZone timeZone = wg3.a;
        ArrayList arrayList = t52Var.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (t11.l(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            s.l("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.p = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        t52Var.q = System.nanoTime();
        ud0 ud0Var = this.j;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ud0Var.d;
        TimeZone timeZone2 = wg3.a;
        if (!t52Var.j) {
            ((hy2) ud0Var.b).c((u52) ud0Var.c, 0L);
            return null;
        }
        t52Var.j = true;
        concurrentLinkedQueue.remove(t52Var);
        if (concurrentLinkedQueue.isEmpty()) {
            hy2 hy2Var = (hy2) ud0Var.b;
            synchronized (hy2Var.a) {
                if (hy2Var.a()) {
                    hy2Var.a.c(hy2Var);
                }
            }
        }
        return t52Var.e;
    }
}
