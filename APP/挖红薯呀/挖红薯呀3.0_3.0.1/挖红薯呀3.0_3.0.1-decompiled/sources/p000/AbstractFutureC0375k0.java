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

/* JADX INFO: renamed from: k0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC0375k0 implements Future {

    /* JADX INFO: renamed from: g */
    public static final boolean f2967g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: h */
    public static final Logger f2968h = Logger.getLogger(AbstractFutureC0375k0.class.getName());

    /* JADX INFO: renamed from: i */
    public static final pf1 f2969i;

    /* JADX INFO: renamed from: j */
    public static final Object f2970j;

    /* JADX INFO: renamed from: d */
    public volatile Object f2971d;

    /* JADX INFO: renamed from: e */
    public volatile C0229g0 f2972e;

    /* JADX INFO: renamed from: f */
    public volatile C0338j0 f2973f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        pf1 c0303i0;
        try {
            c0303i0 = new C0266h0(AtomicReferenceFieldUpdater.newUpdater(C0338j0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0338j0.class, C0338j0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0375k0.class, C0338j0.class, "f"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0375k0.class, C0229g0.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0375k0.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0303i0 = new C0303i0();
        }
        f2969i = c0303i0;
        if (th != null) {
            f2968h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2970j = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1742b(AbstractFutureC0375k0 abstractFutureC0375k0) {
        C0338j0 c0338j0;
        C0229g0 c0229g0;
        do {
            c0338j0 = abstractFutureC0375k0.f2973f;
        } while (!f2969i.mo1271l(abstractFutureC0375k0, c0338j0, C0338j0.f2648c));
        while (c0338j0 != null) {
            Thread thread = c0338j0.f2649a;
            if (thread != null) {
                c0338j0.f2649a = null;
                LockSupport.unpark(thread);
            }
            c0338j0 = c0338j0.f2650b;
        }
        do {
            c0229g0 = abstractFutureC0375k0.f2972e;
        } while (!f2969i.mo1269j(abstractFutureC0375k0, c0229g0));
        C0229g0 c0229g02 = null;
        while (c0229g0 != null) {
            C0229g0 c0229g03 = c0229g0.f1833a;
            c0229g0.f1833a = c0229g02;
            c0229g02 = c0229g0;
            c0229g0 = c0229g03;
        }
        while (c0229g02 != null) {
            c0229g02 = c0229g02.f1833a;
            try {
                throw null;
            } catch (RuntimeException e) {
                f2968h.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Object m1743c(Object obj) throws ExecutionException {
        if (obj instanceof C0155e0) {
            Throwable th = ((C0155e0) obj).f1251a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0192f0) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f2970j) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m1744d(AbstractFutureC0375k0 abstractFutureC0375k0) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC0375k0.get();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1745a(StringBuilder sb) {
        try {
            Object objM1744d = m1744d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM1744d == this ? "this future" : String.valueOf(objM1744d));
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f2971d;
        if (obj != null) {
            return false;
        }
        if (!f2969i.mo1270k(this, obj, f2967g ? new C0155e0(new CancellationException("Future.cancel() was called."), z) : z ? C0155e0.f1249b : C0155e0.f1250c)) {
            return false;
        }
        m1742b(this);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1746e(C0338j0 c0338j0) {
        c0338j0.f2649a = null;
        while (true) {
            C0338j0 c0338j02 = this.f2973f;
            if (c0338j02 == C0338j0.f2648c) {
                return;
            }
            C0338j0 c0338j03 = null;
            while (c0338j02 != null) {
                C0338j0 c0338j04 = c0338j02.f2650b;
                if (c0338j02.f2649a != null) {
                    c0338j03 = c0338j02;
                } else if (c0338j03 != null) {
                    c0338j03.f2650b = c0338j04;
                    if (c0338j03.f2649a == null) {
                        break;
                    }
                } else if (!f2969i.mo1271l(this, c0338j02, c0338j04)) {
                    break;
                }
                c0338j02 = c0338j04;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0338j0 c0338j0 = C0338j0.f2648c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2971d;
        if (obj != null) {
            return m1743c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0338j0 c0338j02 = this.f2973f;
            if (c0338j02 != c0338j0) {
                C0338j0 c0338j03 = new C0338j0();
                do {
                    pf1 pf1Var = f2969i;
                    pf1Var.mo1267L(c0338j03, c0338j02);
                    if (pf1Var.mo1271l(this, c0338j02, c0338j03)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m1746e(c0338j03);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2971d;
                            if (obj2 != null) {
                                return m1743c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m1746e(c0338j03);
                    } else {
                        c0338j02 = this.f2973f;
                    }
                } while (c0338j02 != c0338j0);
            }
            return m1743c(this.f2971d);
        }
        while (nanos > 0) {
            Object obj3 = this.f2971d;
            if (obj3 != null) {
                return m1743c(obj3);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2971d instanceof C0155e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2971d != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: k0 */
    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2971d instanceof C0155e0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m1745a(sb);
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
                m1745a(sb);
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
        C0338j0 c0338j0 = C0338j0.f2648c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2971d;
            if (obj2 != null) {
                return m1743c(obj2);
            }
            C0338j0 c0338j02 = this.f2973f;
            if (c0338j02 != c0338j0) {
                C0338j0 c0338j03 = new C0338j0();
                do {
                    pf1 pf1Var = f2969i;
                    pf1Var.mo1267L(c0338j03, c0338j02);
                    if (pf1Var.mo1271l(this, c0338j02, c0338j03)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2971d;
                            } else {
                                m1746e(c0338j03);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m1743c(obj);
                    }
                    c0338j02 = this.f2973f;
                } while (c0338j02 != c0338j0);
            }
            return m1743c(this.f2971d);
        }
        throw new InterruptedException();
    }
}
