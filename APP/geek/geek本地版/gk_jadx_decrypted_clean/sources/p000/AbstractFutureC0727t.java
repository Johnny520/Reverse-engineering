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

/* JADX INFO: renamed from: t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC0727t implements Future {

    /* JADX INFO: renamed from: d */
    public static final boolean f4474d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f4475e = Logger.getLogger(AbstractFutureC0727t.class.getName());

    /* JADX INFO: renamed from: f */
    public static final AbstractC0222ff f4476f;

    /* JADX INFO: renamed from: g */
    public static final Object f4477g;

    /* JADX INFO: renamed from: a */
    public volatile Object f4478a;

    /* JADX INFO: renamed from: b */
    public volatile C0578p f4479b;

    /* JADX INFO: renamed from: c */
    public volatile C0690s f4480c;

    static {
        AbstractC0222ff c0653r;
        try {
            c0653r = new C0616q(AtomicReferenceFieldUpdater.newUpdater(C0690s.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0690s.class, C0690s.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0727t.class, C0690s.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0727t.class, C0578p.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0727t.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0653r = new C0653r();
        }
        f4476f = c0653r;
        if (th != null) {
            f4475e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4477g = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m2342b(AbstractFutureC0727t abstractFutureC0727t) {
        C0690s c0690s;
        C0578p c0578p;
        do {
            c0690s = abstractFutureC0727t.f4480c;
        } while (!f4476f.mo1210g(abstractFutureC0727t, c0690s, C0690s.f4362c));
        while (c0690s != null) {
            Thread thread = c0690s.f4363a;
            if (thread != null) {
                c0690s.f4363a = null;
                LockSupport.unpark(thread);
            }
            c0690s = c0690s.f4364b;
        }
        do {
            c0578p = abstractFutureC0727t.f4479b;
        } while (!f4476f.mo1208e(abstractFutureC0727t, c0578p));
        C0578p c0578p2 = null;
        while (c0578p != null) {
            C0578p c0578p3 = c0578p.f3626a;
            c0578p.f3626a = c0578p2;
            c0578p2 = c0578p;
            c0578p = c0578p3;
        }
        while (c0578p2 != null) {
            c0578p2 = c0578p2.f3626a;
            try {
                throw null;
            } catch (RuntimeException e) {
                f4475e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m2343c(Object obj) throws ExecutionException {
        if (obj instanceof C0504n) {
            Throwable th = ((C0504n) obj).f3303a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0541o) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f4477g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m2344d(AbstractFutureC0727t abstractFutureC0727t) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC0727t.get();
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
    public final void m2345a(StringBuilder sb) {
        try {
            Object objM2344d = m2344d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM2344d == this ? "this future" : String.valueOf(objM2344d));
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
        Object obj = this.f4478a;
        if (obj != null) {
            return false;
        }
        if (!f4476f.mo1209f(this, obj, f4474d ? new C0504n(new CancellationException("Future.cancel() was called."), z) : z ? C0504n.f3301b : C0504n.f3302c)) {
            return false;
        }
        m2342b(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m2346e(C0690s c0690s) {
        c0690s.f4363a = null;
        while (true) {
            C0690s c0690s2 = this.f4480c;
            if (c0690s2 == C0690s.f4362c) {
                return;
            }
            C0690s c0690s3 = null;
            while (c0690s2 != null) {
                C0690s c0690s4 = c0690s2.f4364b;
                if (c0690s2.f4363a != null) {
                    c0690s3 = c0690s2;
                } else if (c0690s3 != null) {
                    c0690s3.f4364b = c0690s4;
                    if (c0690s3.f4363a == null) {
                        break;
                    }
                } else if (!f4476f.mo1210g(this, c0690s2, c0690s4)) {
                    break;
                }
                c0690s2 = c0690s4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0690s c0690s = C0690s.f4362c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4478a;
        if (obj != null) {
            return m2343c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0690s c0690s2 = this.f4480c;
            if (c0690s2 != c0690s) {
                C0690s c0690s3 = new C0690s();
                do {
                    AbstractC0222ff abstractC0222ff = f4476f;
                    abstractC0222ff.mo1206F(c0690s3, c0690s2);
                    if (abstractC0222ff.mo1210g(this, c0690s2, c0690s3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m2346e(c0690s3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4478a;
                            if (obj2 != null) {
                                return m2343c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m2346e(c0690s3);
                    } else {
                        c0690s2 = this.f4480c;
                    }
                } while (c0690s2 != c0690s);
            }
            return m2343c(this.f4478a);
        }
        while (nanos > 0) {
            Object obj3 = this.f4478a;
            if (obj3 != null) {
                return m2343c(obj3);
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
        String strM2764i = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM2764i2 = z30.m2764i(strM2764i, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM2764i3 = strM2764i2 + jConvert + " " + lowerCase;
                if (z) {
                    strM2764i3 = z30.m2764i(strM2764i3, ",");
                }
                strM2764i2 = z30.m2764i(strM2764i3, " ");
            }
            if (z) {
                strM2764i2 = strM2764i2 + nanos2 + " nanoseconds ";
            }
            strM2764i = z30.m2764i(strM2764i2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(z30.m2764i(strM2764i, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM2764i + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4478a instanceof C0504n;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4478a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4478a instanceof C0504n) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2345a(sb);
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
                m2345a(sb);
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
        C0690s c0690s = C0690s.f4362c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4478a;
            if (obj2 != null) {
                return m2343c(obj2);
            }
            C0690s c0690s2 = this.f4480c;
            if (c0690s2 != c0690s) {
                C0690s c0690s3 = new C0690s();
                do {
                    AbstractC0222ff abstractC0222ff = f4476f;
                    abstractC0222ff.mo1206F(c0690s3, c0690s2);
                    if (abstractC0222ff.mo1210g(this, c0690s2, c0690s3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4478a;
                            } else {
                                m2346e(c0690s3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m2343c(obj);
                    }
                    c0690s2 = this.f4480c;
                } while (c0690s2 != c0690s);
            }
            return m2343c(this.f4478a);
        }
        throw new InterruptedException();
    }
}
