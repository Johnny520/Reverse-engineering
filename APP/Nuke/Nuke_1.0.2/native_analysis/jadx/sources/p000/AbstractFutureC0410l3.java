package p000;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC0410l3 implements Future {

    /* JADX INFO: renamed from: k */
    public static final boolean f5897k = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: l */
    public static final Logger f5898l = Logger.getLogger(AbstractFutureC0410l3.class.getName());

    /* JADX INFO: renamed from: m */
    public static final tp0 f5899m;

    /* JADX INFO: renamed from: n */
    public static final Object f5900n;

    /* JADX INFO: renamed from: h */
    public volatile Object f5901h;

    /* JADX INFO: renamed from: i */
    public volatile C0263h3 f5902i;

    /* JADX INFO: renamed from: j */
    public volatile C0373k3 f5903j;

    static {
        tp0 c0335j3;
        try {
            c0335j3 = new C0300i3(AtomicReferenceFieldUpdater.newUpdater(C0373k3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0373k3.class, C0373k3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0410l3.class, C0373k3.class, "j"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0410l3.class, C0263h3.class, "i"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0410l3.class, Object.class, "h"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0335j3 = new C0335j3();
        }
        f5899m = c0335j3;
        if (th != null) {
            f5898l.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5900n = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m2788b(AbstractFutureC0410l3 abstractFutureC0410l3) {
        C0373k3 c0373k3;
        C0263h3 c0263h3;
        do {
            c0373k3 = abstractFutureC0410l3.f5903j;
        } while (!f5899m.mo2258l(abstractFutureC0410l3, c0373k3, C0373k3.f5328c));
        while (c0373k3 != null) {
            Thread thread = c0373k3.f5329a;
            if (thread != null) {
                c0373k3.f5329a = null;
                LockSupport.unpark(thread);
            }
            c0373k3 = c0373k3.f5330b;
        }
        do {
            c0263h3 = abstractFutureC0410l3.f5902i;
        } while (!f5899m.mo2256j(abstractFutureC0410l3, c0263h3));
        C0263h3 c0263h32 = null;
        while (c0263h3 != null) {
            C0263h3 c0263h33 = c0263h3.f3809a;
            c0263h3.f3809a = c0263h32;
            c0263h32 = c0263h3;
            c0263h3 = c0263h33;
        }
        while (c0263h32 != null) {
            c0263h32 = c0263h32.f3809a;
            try {
                throw null;
            } catch (RuntimeException e) {
                f5898l.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m2789c(Object obj) throws ExecutionException {
        if (obj instanceof C0189f3) {
            Throwable th = ((C0189f3) obj).f2750a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0226g3) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f5900n) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m2790d(AbstractFutureC0410l3 abstractFutureC0410l3) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC0410l3.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m2791a(StringBuilder sb) {
        try {
            Object objM2790d = m2790d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM2790d == this ? "this future" : String.valueOf(objM2790d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f5901h;
        if (obj != null) {
            return false;
        }
        if (!f5899m.mo2257k(this, obj, f5897k ? new C0189f3(new CancellationException("Future.cancel() was called."), z) : z ? C0189f3.f2748b : C0189f3.f2749c)) {
            return false;
        }
        m2788b(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m2792e(C0373k3 c0373k3) {
        c0373k3.f5329a = null;
        while (true) {
            C0373k3 c0373k32 = this.f5903j;
            if (c0373k32 == C0373k3.f5328c) {
                return;
            }
            C0373k3 c0373k33 = null;
            while (c0373k32 != null) {
                C0373k3 c0373k34 = c0373k32.f5330b;
                if (c0373k32.f5329a != null) {
                    c0373k33 = c0373k32;
                } else if (c0373k33 != null) {
                    c0373k33.f5330b = c0373k34;
                    if (c0373k33.f5329a == null) {
                        break;
                    }
                } else if (!f5899m.mo2258l(this, c0373k32, c0373k34)) {
                    break;
                }
                c0373k32 = c0373k34;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0373k3 c0373k3 = C0373k3.f5328c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5901h;
        if (obj != null) {
            return m2789c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0373k3 c0373k32 = this.f5903j;
            if (c0373k32 != c0373k3) {
                C0373k3 c0373k33 = new C0373k3();
                do {
                    tp0 tp0Var = f5899m;
                    tp0Var.mo2254F(c0373k33, c0373k32);
                    if (tp0Var.mo2258l(this, c0373k32, c0373k33)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m2792e(c0373k33);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5901h;
                            if (obj2 != null) {
                                return m2789c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m2792e(c0373k33);
                    } else {
                        c0373k32 = this.f5903j;
                    }
                } while (c0373k32 != c0373k3);
            }
            return m2789c(this.f5901h);
        }
        while (nanos > 0) {
            Object obj3 = this.f5901h;
            if (obj3 != null) {
                return m2789c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5901h instanceof C0189f3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5901h != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5901h instanceof C0189f3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2791a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m2791a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C0373k3 c0373k3 = C0373k3.f5328c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5901h;
            if (obj2 != null) {
                return m2789c(obj2);
            }
            C0373k3 c0373k32 = this.f5903j;
            if (c0373k32 != c0373k3) {
                C0373k3 c0373k33 = new C0373k3();
                do {
                    tp0 tp0Var = f5899m;
                    tp0Var.mo2254F(c0373k33, c0373k32);
                    if (tp0Var.mo2258l(this, c0373k32, c0373k33)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5901h;
                            } else {
                                m2792e(c0373k33);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m2789c(obj);
                    }
                    c0373k32 = this.f5903j;
                } while (c0373k32 != c0373k3);
            }
            return m2789c(this.f5901h);
        }
        throw new InterruptedException();
    }
}
