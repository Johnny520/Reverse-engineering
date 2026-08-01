package p076m;

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
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: m.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC0761g implements Future {

    /* JADX INFO: renamed from: d */
    public static final boolean f2574d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f2575e = Logger.getLogger(AbstractFutureC0761g.class.getName());

    /* JADX INFO: renamed from: f */
    public static final AbstractC0503h f2576f;

    /* JADX INFO: renamed from: g */
    public static final Object f2577g;

    /* JADX INFO: renamed from: a */
    public volatile Object f2578a;

    /* JADX INFO: renamed from: b */
    public volatile C0757c f2579b;

    /* JADX INFO: renamed from: c */
    public volatile C0760f f2580c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC0503h c0759e;
        try {
            c0759e = new C0758d(AtomicReferenceFieldUpdater.newUpdater(C0760f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0760f.class, C0760f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0761g.class, C0760f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0761g.class, C0757c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0761g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0759e = new C0759e();
        }
        f2576f = c0759e;
        if (th != null) {
            f2575e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2577g = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1422b(AbstractFutureC0761g abstractFutureC0761g) {
        C0760f c0760f;
        C0757c c0757c;
        do {
            c0760f = abstractFutureC0761g.f2580c;
        } while (!f2576f.mo1000f(abstractFutureC0761g, c0760f, C0760f.f2571c));
        while (c0760f != null) {
            Thread thread = c0760f.f2572a;
            if (thread != null) {
                c0760f.f2572a = null;
                LockSupport.unpark(thread);
            }
            c0760f = c0760f.f2573b;
        }
        do {
            c0757c = abstractFutureC0761g.f2579b;
        } while (!f2576f.mo998d(abstractFutureC0761g, c0757c));
        C0757c c0757c2 = null;
        while (c0757c != null) {
            C0757c c0757c3 = c0757c.f2565a;
            c0757c.f2565a = c0757c2;
            c0757c2 = c0757c;
            c0757c = c0757c3;
        }
        while (c0757c2 != null) {
            c0757c2 = c0757c2.f2565a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f2575e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Object m1423c(Object obj) throws ExecutionException {
        if (obj instanceof C0755a) {
            CancellationException cancellationException = ((C0755a) obj).f2563a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0756b) {
            ((AbstractC0756b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f2577g) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m1424d(AbstractFutureC0761g abstractFutureC0761g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC0761g.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1425a(StringBuilder sb) {
        try {
            Object objM1424d = m1424d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM1424d == this ? "this future" : String.valueOf(objM1424d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f2578a;
        if (obj != null) {
            return false;
        }
        if (!f2576f.mo999e(this, obj, f2574d ? new C0755a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0755a.f2561b : C0755a.f2562c)) {
            return false;
        }
        m1422b(this);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1426e(C0760f c0760f) {
        c0760f.f2572a = null;
        while (true) {
            C0760f c0760f2 = this.f2580c;
            if (c0760f2 == C0760f.f2571c) {
                return;
            }
            C0760f c0760f3 = null;
            while (c0760f2 != null) {
                C0760f c0760f4 = c0760f2.f2573b;
                if (c0760f2.f2572a != null) {
                    c0760f3 = c0760f2;
                } else if (c0760f3 != null) {
                    c0760f3.f2573b = c0760f4;
                    if (c0760f3.f2572a == null) {
                        break;
                    }
                } else if (!f2576f.mo1000f(this, c0760f2, c0760f4)) {
                    break;
                }
                c0760f2 = c0760f4;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2578a;
        if (obj != null) {
            return m1423c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0760f c0760f = this.f2580c;
            C0760f c0760f2 = C0760f.f2571c;
            if (c0760f != c0760f2) {
                C0760f c0760f3 = new C0760f();
                do {
                    AbstractC0503h abstractC0503h = f2576f;
                    abstractC0503h.mo994K(c0760f3, c0760f);
                    if (abstractC0503h.mo1000f(this, c0760f, c0760f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m1426e(c0760f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2578a;
                            if (obj2 != null) {
                                return m1423c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m1426e(c0760f3);
                    } else {
                        c0760f = this.f2580c;
                    }
                } while (c0760f != c0760f2);
            }
            return m1423c(this.f2578a);
        }
        while (nanos > 0) {
            Object obj3 = this.f2578a;
            if (obj3 != null) {
                return m1423c(obj3);
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
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z2) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z2) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2578a instanceof C0755a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2578a != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: m.g */
    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2578a instanceof C0755a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m1425a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m1425a(sb);
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f2578a;
            if (obj2 != null) {
                return m1423c(obj2);
            }
            C0760f c0760f = this.f2580c;
            C0760f c0760f2 = C0760f.f2571c;
            if (c0760f != c0760f2) {
                C0760f c0760f3 = new C0760f();
                do {
                    AbstractC0503h abstractC0503h = f2576f;
                    abstractC0503h.mo994K(c0760f3, c0760f);
                    if (abstractC0503h.mo1000f(this, c0760f, c0760f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2578a;
                            } else {
                                m1426e(c0760f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m1423c(obj);
                    }
                    c0760f = this.f2580c;
                } while (c0760f != c0760f2);
            }
            return m1423c(this.f2578a);
        }
        throw new InterruptedException();
    }
}
