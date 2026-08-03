package p065k;

import com.abc.core.runtime.AbstractC0805P;
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
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: k.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC0975g implements Future {

    /* JADX INFO: renamed from: d */
    public static final boolean f3453d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f3454e = Logger.getLogger(AbstractFutureC0975g.class.getName());

    /* JADX INFO: renamed from: f */
    public static final AbstractC0805P f3455f;

    /* JADX INFO: renamed from: g */
    public static final Object f3456g;

    /* JADX INFO: renamed from: a */
    public volatile Object f3457a;

    /* JADX INFO: renamed from: b */
    public volatile C0971c f3458b;

    /* JADX INFO: renamed from: c */
    public volatile C0974f f3459c;

    static {
        AbstractC0805P c0973e;
        try {
            c0973e = new C0972d(AtomicReferenceFieldUpdater.newUpdater(C0974f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0974f.class, C0974f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0975g.class, C0974f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0975g.class, C0971c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0975g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0973e = new C0973e();
        }
        f3455f = c0973e;
        if (th != null) {
            f3454e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3456g = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m2329b(AbstractFutureC0975g abstractFutureC0975g) {
        C0974f c0974f;
        C0971c c0971c;
        do {
            c0974f = abstractFutureC0975g.f3459c;
        } while (!f3455f.mo2069e(abstractFutureC0975g, c0974f, C0974f.f3450c));
        while (c0974f != null) {
            Thread thread = c0974f.f3451a;
            if (thread != null) {
                c0974f.f3451a = null;
                LockSupport.unpark(thread);
            }
            c0974f = c0974f.f3452b;
        }
        do {
            c0971c = abstractFutureC0975g.f3458b;
        } while (!f3455f.mo2067c(abstractFutureC0975g, c0971c));
        C0971c c0971c2 = null;
        while (c0971c != null) {
            C0971c c0971c3 = c0971c.f3444a;
            c0971c.f3444a = c0971c2;
            c0971c2 = c0971c;
            c0971c = c0971c3;
        }
        while (c0971c2 != null) {
            c0971c2 = c0971c2.f3444a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f3454e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m2330c(Object obj) throws ExecutionException {
        if (obj instanceof C0969a) {
            Throwable th = ((C0969a) obj).f3442a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0970b) {
            ((AbstractC0970b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f3456g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m2331a(StringBuilder sb) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f3457a;
        if (obj != null) {
            return false;
        }
        if (!f3455f.mo2068d(this, obj, f3453d ? new C0969a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0969a.f3440b : C0969a.f3441c)) {
            return false;
        }
        m2329b(this);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m2332d(C0974f c0974f) {
        c0974f.f3451a = null;
        while (true) {
            C0974f c0974f2 = this.f3459c;
            if (c0974f2 == C0974f.f3450c) {
                return;
            }
            C0974f c0974f3 = null;
            while (c0974f2 != null) {
                C0974f c0974f4 = c0974f2.f3452b;
                if (c0974f2.f3451a != null) {
                    c0974f3 = c0974f2;
                } else if (c0974f3 != null) {
                    c0974f3.f3452b = c0974f4;
                    if (c0974f3.f3451a == null) {
                        break;
                    }
                } else if (!f3455f.mo2069e(this, c0974f2, c0974f4)) {
                    break;
                }
                c0974f2 = c0974f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3457a;
        if (obj != null) {
            return m2330c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0974f c0974f = this.f3459c;
            C0974f c0974f2 = C0974f.f3450c;
            if (c0974f != c0974f2) {
                C0974f c0974f3 = new C0974f();
                do {
                    AbstractC0805P abstractC0805P = f3455f;
                    abstractC0805P.mo2061O(c0974f3, c0974f);
                    if (abstractC0805P.mo2069e(this, c0974f, c0974f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m2332d(c0974f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3457a;
                            if (obj2 != null) {
                                return m2330c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m2332d(c0974f3);
                    } else {
                        c0974f = this.f3459c;
                    }
                } while (c0974f != c0974f2);
            }
            return m2330c(this.f3457a);
        }
        while (nanos > 0) {
            Object obj3 = this.f3457a;
            if (obj3 != null) {
                return m2330c(obj3);
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
        String strM722e = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM722e2 = AbstractC0324d.m722e(strM722e, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM722e3 = strM722e2 + jConvert + " " + lowerCase;
                if (z2) {
                    strM722e3 = AbstractC0324d.m722e(strM722e3, ",");
                }
                strM722e2 = AbstractC0324d.m722e(strM722e3, " ");
            }
            if (z2) {
                strM722e2 = strM722e2 + nanos2 + " nanoseconds ";
            }
            strM722e = AbstractC0324d.m722e(strM722e2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0324d.m722e(strM722e, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM722e + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3457a instanceof C0969a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3457a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3457a instanceof C0969a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2331a(sb);
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
                m2331a(sb);
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
            Object obj2 = this.f3457a;
            if (obj2 != null) {
                return m2330c(obj2);
            }
            C0974f c0974f = this.f3459c;
            C0974f c0974f2 = C0974f.f3450c;
            if (c0974f != c0974f2) {
                C0974f c0974f3 = new C0974f();
                do {
                    AbstractC0805P abstractC0805P = f3455f;
                    abstractC0805P.mo2061O(c0974f3, c0974f);
                    if (abstractC0805P.mo2069e(this, c0974f, c0974f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3457a;
                            } else {
                                m2332d(c0974f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m2330c(obj);
                    }
                    c0974f = this.f3459c;
                } while (c0974f != c0974f2);
            }
            return m2330c(this.f3457a);
        }
        throw new InterruptedException();
    }
}
