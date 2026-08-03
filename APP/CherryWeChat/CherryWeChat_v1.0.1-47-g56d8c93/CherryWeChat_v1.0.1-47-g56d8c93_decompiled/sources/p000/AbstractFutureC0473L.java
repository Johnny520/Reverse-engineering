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

/* JADX INFO: renamed from: L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC0473L implements Future {

    /* JADX INFO: renamed from: d */
    public static final boolean f1563d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f1564e = Logger.getLogger(AbstractFutureC0473L.class.getName());

    /* JADX INFO: renamed from: f */
    public static final AbstractC0628Oj f1565f;

    /* JADX INFO: renamed from: g */
    public static final Object f1566g;

    /* JADX INFO: renamed from: a */
    public volatile Object f1567a;

    /* JADX INFO: renamed from: b */
    public volatile C0301H f1568b;

    /* JADX INFO: renamed from: c */
    public volatile C0430K f1569c;

    static {
        AbstractC0628Oj c0387j;
        try {
            c0387j = new C0344I(AtomicReferenceFieldUpdater.newUpdater(C0430K.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0430K.class, C0430K.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0473L.class, C0430K.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0473L.class, C0301H.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0473L.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0387j = new C0387J();
        }
        f1565f = c0387j;
        if (th != null) {
            f1564e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1566g = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m923b(AbstractFutureC0473L abstractFutureC0473L) {
        C0430K c0430k;
        C0301H c0301h;
        do {
            c0430k = abstractFutureC0473L.f1569c;
        } while (!f1565f.mo734h(abstractFutureC0473L, c0430k, C0430K.f1415c));
        while (c0430k != null) {
            Thread thread = c0430k.f1416a;
            if (thread != null) {
                c0430k.f1416a = null;
                LockSupport.unpark(thread);
            }
            c0430k = c0430k.f1417b;
        }
        do {
            c0301h = abstractFutureC0473L.f1568b;
        } while (!f1565f.mo732f(abstractFutureC0473L, c0301h));
        C0301H c0301h2 = null;
        while (c0301h != null) {
            C0301H c0301h3 = c0301h.f1015a;
            c0301h.f1015a = c0301h2;
            c0301h2 = c0301h;
            c0301h = c0301h3;
        }
        while (c0301h2 != null) {
            c0301h2 = c0301h2.f1015a;
            try {
                throw null;
            } catch (RuntimeException e) {
                f1564e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m924c(Object obj) throws ExecutionException {
        if (obj instanceof C0215F) {
            Throwable th = ((C0215F) obj).f634a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0258G) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f1566g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m925d(AbstractFutureC0473L abstractFutureC0473L) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC0473L.get();
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
    public final void m926a(StringBuilder sb) {
        try {
            Object objM925d = m925d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM925d == this ? "this future" : String.valueOf(objM925d));
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
        Object obj = this.f1567a;
        if (obj != null) {
            return false;
        }
        if (!f1565f.mo733g(this, obj, f1563d ? new C0215F(new CancellationException("Future.cancel() was called."), z) : z ? C0215F.f632b : C0215F.f633c)) {
            return false;
        }
        m923b(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m927e(C0430K c0430k) {
        c0430k.f1416a = null;
        while (true) {
            C0430K c0430k2 = this.f1569c;
            if (c0430k2 == C0430K.f1415c) {
                return;
            }
            C0430K c0430k3 = null;
            while (c0430k2 != null) {
                C0430K c0430k4 = c0430k2.f1417b;
                if (c0430k2.f1416a != null) {
                    c0430k3 = c0430k2;
                } else if (c0430k3 != null) {
                    c0430k3.f1417b = c0430k4;
                    if (c0430k3.f1416a == null) {
                        break;
                    }
                } else if (!f1565f.mo734h(this, c0430k2, c0430k4)) {
                    break;
                }
                c0430k2 = c0430k4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0430K c0430k = C0430K.f1415c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1567a;
        if (obj != null) {
            return m924c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0430K c0430k2 = this.f1569c;
            if (c0430k2 != c0430k) {
                C0430K c0430k3 = new C0430K();
                do {
                    AbstractC0628Oj abstractC0628Oj = f1565f;
                    abstractC0628Oj.mo730O(c0430k3, c0430k2);
                    if (abstractC0628Oj.mo734h(this, c0430k2, c0430k3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m927e(c0430k3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1567a;
                            if (obj2 != null) {
                                return m924c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m927e(c0430k3);
                    } else {
                        c0430k2 = this.f1569c;
                    }
                } while (c0430k2 != c0430k);
            }
            return m924c(this.f1567a);
        }
        while (nanos > 0) {
            Object obj3 = this.f1567a;
            if (obj3 != null) {
                return m924c(obj3);
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
        String strM407e = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM407e2 = AbstractC0213Ey.m407e(strM407e, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM407e3 = strM407e2 + jConvert + " " + lowerCase;
                if (z) {
                    strM407e3 = AbstractC0213Ey.m407e(strM407e3, ",");
                }
                strM407e2 = AbstractC0213Ey.m407e(strM407e3, " ");
            }
            if (z) {
                strM407e2 = strM407e2 + nanos2 + " nanoseconds ";
            }
            strM407e = AbstractC0213Ey.m407e(strM407e2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0213Ey.m407e(strM407e, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM407e + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1567a instanceof C0215F;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1567a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f1567a instanceof C0215F) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m926a(sb);
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
                m926a(sb);
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
        C0430K c0430k = C0430K.f1415c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1567a;
            if (obj2 != null) {
                return m924c(obj2);
            }
            C0430K c0430k2 = this.f1569c;
            if (c0430k2 != c0430k) {
                C0430K c0430k3 = new C0430K();
                do {
                    AbstractC0628Oj abstractC0628Oj = f1565f;
                    abstractC0628Oj.mo730O(c0430k3, c0430k2);
                    if (abstractC0628Oj.mo734h(this, c0430k2, c0430k3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1567a;
                            } else {
                                m927e(c0430k3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m924c(obj);
                    }
                    c0430k2 = this.f1569c;
                } while (c0430k2 != c0430k);
            }
            return m924c(this.f1567a);
        }
        throw new InterruptedException();
    }
}
