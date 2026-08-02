package p000;

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

    /* JADX INFO: renamed from: h */
    public final et1 f9913h;

    /* JADX INFO: renamed from: i */
    public final k82 f9914i;

    /* JADX INFO: renamed from: j */
    public final ud0 f9915j;

    /* JADX INFO: renamed from: k */
    public volatile kg0 f9916k;

    /* JADX INFO: renamed from: l */
    public final r52 f9917l;

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f9918m;

    /* JADX INFO: renamed from: n */
    public Object f9919n;

    /* JADX INFO: renamed from: o */
    public yg0 f9920o;

    /* JADX INFO: renamed from: p */
    public t52 f9921p;

    /* JADX INFO: renamed from: q */
    public boolean f9922q;

    /* JADX INFO: renamed from: r */
    public f90 f9923r;

    /* JADX INFO: renamed from: s */
    public boolean f9924s;

    /* JADX INFO: renamed from: t */
    public boolean f9925t;

    /* JADX INFO: renamed from: u */
    public boolean f9926u;

    /* JADX INFO: renamed from: v */
    public boolean f9927v;

    /* JADX INFO: renamed from: w */
    public boolean f9928w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f9929x;

    /* JADX INFO: renamed from: y */
    public volatile f90 f9930y;

    /* JADX INFO: renamed from: z */
    public final CopyOnWriteArrayList f9931z;

    static {
        AtomicReferenceFieldUpdater.newUpdater(s52.class, kg0.class, "k");
    }

    public s52(et1 et1Var, k82 k82Var) {
        et1Var.getClass();
        this.f9913h = et1Var;
        this.f9914i = k82Var;
        this.f9915j = (ud0) et1Var.f2599E.f6983i;
        et1Var.f2603d.getClass();
        this.f9916k = kg0.f5518a;
        r52 r52Var = new r52(this);
        r52Var.mo3228g(et1Var.f2622w);
        this.f9917l = r52Var;
        this.f9918m = new AtomicBoolean();
        this.f9928w = true;
        this.f9931z = new CopyOnWriteArrayList();
        new AtomicReference(k82Var.f5394e);
    }

    /* JADX INFO: renamed from: a */
    public static final String m4728a(s52 s52Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(s52Var.f9929x ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(s52Var.f9914i.f5390a.m6361g());
        return sb.toString();
    }

    public final void cancel() {
        if (this.f9929x) {
            return;
        }
        this.f9929x = true;
        f90 f90Var = this.f9930y;
        if (f90Var != null) {
            ((xg0) f90Var.f2865d).cancel();
        }
        Iterator it = this.f9931z.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((jb2) it.next()).cancel();
        }
        this.f9916k.getClass();
    }

    public final Object clone() {
        return new s52(this.f9913h, this.f9914i);
    }

    /* JADX INFO: renamed from: d */
    public final void m4729d(t52 t52Var) {
        t52Var.getClass();
        TimeZone timeZone = wg3.f12507a;
        if (this.f9921p != null) {
            C0676s.m4653l("Check failed.");
        } else {
            this.f9921p = t52Var;
            t52Var.f10576p.add(new q52(this, this.f9919n));
        }
    }

    /* JADX INFO: renamed from: f */
    public final IOException m4730f(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM4737m;
        TimeZone timeZone = wg3.f12507a;
        t52 t52Var = this.f9921p;
        if (t52Var != null) {
            synchronized (t52Var) {
                socketM4737m = m4737m();
            }
            if (this.f9921p == null) {
                if (socketM4737m != null) {
                    wg3.m5890c(socketM4737m);
                }
                this.f9916k.getClass();
            } else if (socketM4737m != null) {
                C0676s.m4653l("Check failed.");
                return null;
            }
        }
        if (!this.f9922q && this.f9917l.m5887i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        kg0 kg0Var = this.f9916k;
        if (iOException == null) {
            kg0Var.getClass();
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        kg0Var.getClass();
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: g */
    public final void m4731g(InterfaceC0137dp interfaceC0137dp) {
        if (!this.f9918m.compareAndSet(false, true)) {
            C0676s.m4653l("Already Executed");
            return;
        }
        zz1 zz1Var = zz1.f14161a;
        this.f9919n = zz1.f14161a.mo6222e();
        this.f9916k.getClass();
        kj1 kj1Var = this.f9913h.f2600a;
        p52 p52Var = new p52(this, interfaceC0137dp);
        kj1Var.getClass();
        kj1.m2696H(kj1Var, p52Var, null, null, 6);
    }

    /* JADX INFO: renamed from: h */
    public final r92 m4732h() {
        if (!this.f9918m.compareAndSet(false, true)) {
            C0676s.m4653l("Already Executed");
            return null;
        }
        this.f9917l.m5886h();
        zz1 zz1Var = zz1.f14161a;
        this.f9919n = zz1.f14161a.mo6222e();
        this.f9916k.getClass();
        try {
            kj1 kj1Var = this.f9913h.f2600a;
            synchronized (kj1Var) {
                ((ArrayDeque) kj1Var.f5597l).add(this);
            }
            return m4734j();
        } finally {
            kj1 kj1Var2 = this.f9913h.f2600a;
            kj1Var2.getClass();
            kj1.m2696H(kj1Var2, null, this, null, 5);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4733i(boolean z) {
        f90 f90Var;
        synchronized (this) {
            if (!this.f9928w) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (f90Var = this.f9930y) != null) {
            ((xg0) f90Var.f2865d).cancel();
            ((s52) f90Var.f2863b).m4735k(f90Var, true, true, true, true, null);
        }
        this.f9923r = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r92 m4734j() {
        ArrayList arrayList = new ArrayList();
        AbstractC0325iu.m2393g0(this.f9913h.f2601b, arrayList);
        arrayList.add(new C0969zo(4));
        arrayList.add(new C0969zo(2));
        arrayList.add(new C0969zo(3));
        arrayList.add(C0969zo.f13991c);
        AbstractC0325iu.m2393g0(this.f9913h.f2602c, arrayList);
        arrayList.add(C0969zo.f13990b);
        k82 k82Var = this.f9914i;
        et1 et1Var = this.f9913h;
        et1Var.getClass();
        v52 v52Var = new v52(this, arrayList, 0, null, k82Var, et1Var.f2623x, et1Var.f2624y, et1Var.f2625z, et1Var.f2606g, et1Var.f2620u, et1Var.f2599E, et1Var.f2609j, et1Var.f2610k, et1Var.f2619t, et1Var.f2611l, et1Var.f2613n, et1Var.f2612m, et1Var.f2604e, et1Var.f2614o, et1Var.f2615p, et1Var.f2616q, et1Var.f2621v);
        boolean z = false;
        try {
            try {
                r92 r92VarM5624b = v52Var.m5624b(this.f9914i);
                if (this.f9929x) {
                    ug3.m5494b(r92VarM5624b);
                    throw new IOException("Canceled");
                }
                m4736l(null);
                return r92VarM5624b;
            } catch (IOException e) {
                z = true;
                IOException iOExceptionM4736l = m4736l(e);
                iOExceptionM4736l.getClass();
                throw iOExceptionM4736l;
            }
        } catch (Throwable th) {
            if (!z) {
            }
            throw th;
        }
        if (!z) {
            m4736l(null);
        }
        throw th;
    }

    /* JADX INFO: renamed from: k */
    public final IOException m4735k(f90 f90Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        f90Var.getClass();
        if (f90Var.equals(this.f9930y)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.f9924s) {
                            if ((z2 || !this.f9925t) && ((!z4 || !this.f9926u) && (!z3 || !this.f9927v))) {
                            }
                        }
                        if (z) {
                            this.f9924s = false;
                        }
                        if (z2) {
                            this.f9925t = false;
                        }
                        if (z4) {
                            this.f9926u = false;
                        }
                        if (z3) {
                            this.f9927v = false;
                        }
                        boolean z7 = (this.f9924s || this.f9925t || this.f9926u || this.f9927v) ? false : true;
                        if (z7) {
                            if (!this.f9928w) {
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
                this.f9930y = null;
                t52 t52Var = this.f9921p;
                if (t52Var != null) {
                    synchronized (t52Var) {
                        t52Var.f10573m++;
                    }
                }
            }
            if (z6) {
                return m4730f(iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: l */
    public final IOException m4736l(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f9928w) {
                this.f9928w = false;
                if (!this.f9924s && !this.f9925t && !this.f9926u) {
                    if (!this.f9927v) {
                        z = true;
                    }
                }
            }
        }
        return z ? m4730f(iOException) : iOException;
    }

    /* JADX INFO: renamed from: m */
    public final Socket m4737m() {
        t52 t52Var = this.f9921p;
        t52Var.getClass();
        TimeZone timeZone = wg3.f12507a;
        ArrayList arrayList = t52Var.f10576p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (t11.m5086l(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C0676s.m4653l("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.f9921p = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        t52Var.f10577q = System.nanoTime();
        ud0 ud0Var = this.f9915j;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ud0Var.f11241d;
        TimeZone timeZone2 = wg3.f12507a;
        if (!t52Var.f10570j) {
            ((hy2) ud0Var.f11239b).m2236c((u52) ud0Var.f11240c, 0L);
            return null;
        }
        t52Var.f10570j = true;
        concurrentLinkedQueue.remove(t52Var);
        if (concurrentLinkedQueue.isEmpty()) {
            hy2 hy2Var = (hy2) ud0Var.f11239b;
            synchronized (hy2Var.f4185a) {
                if (hy2Var.m2235a()) {
                    hy2Var.f4185a.m2420c(hy2Var);
                }
            }
        }
        return t52Var.f10565e;
    }
}
