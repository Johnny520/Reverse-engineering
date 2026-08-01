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
public abstract class AbstractFutureC0726t implements Future {

    /* JADX INFO: renamed from: d */
    public static final boolean f4377d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f4378e = Logger.getLogger(AbstractFutureC0726t.class.getName());

    /* JADX INFO: renamed from: f */
    public static final AbstractC0259gf f4379f;

    /* JADX INFO: renamed from: g */
    public static final Object f4380g;

    /* JADX INFO: renamed from: a */
    public volatile Object f4381a;

    /* JADX INFO: renamed from: b */
    public volatile C0578p f4382b;

    /* JADX INFO: renamed from: c */
    public volatile C0689s f4383c;

    static {
        AbstractC0259gf c0652r;
        try {
            c0652r = new C0615q(AtomicReferenceFieldUpdater.newUpdater(C0689s.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0689s.class, C0689s.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0726t.class, C0689s.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0726t.class, C0578p.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0726t.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0652r = new C0652r();
        }
        f4379f = c0652r;
        if (th != null) {
            f4378e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4380g = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m2389b(AbstractFutureC0726t abstractFutureC0726t) {
        C0689s c0689s;
        C0578p c0578p;
        do {
            c0689s = abstractFutureC0726t.f4383c;
        } while (!f4379f.mo1272o(abstractFutureC0726t, c0689s, C0689s.f4176c));
        while (c0689s != null) {
            Thread thread = c0689s.f4177a;
            if (thread != null) {
                c0689s.f4177a = null;
                LockSupport.unpark(thread);
            }
            c0689s = c0689s.f4178b;
        }
        do {
            c0578p = abstractFutureC0726t.f4382b;
        } while (!f4379f.mo1270m(abstractFutureC0726t, c0578p));
        C0578p c0578p2 = null;
        while (c0578p != null) {
            C0578p c0578p3 = c0578p.f3558a;
            c0578p.f3558a = c0578p2;
            c0578p2 = c0578p;
            c0578p = c0578p3;
        }
        while (c0578p2 != null) {
            c0578p2 = c0578p2.f3558a;
            try {
                throw null;
            } catch (RuntimeException e) {
                f4378e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m2390c(Object obj) throws ExecutionException {
        if (obj instanceof C0504n) {
            Throwable th = ((C0504n) obj).f3200a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0541o) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f4380g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m2391d(AbstractFutureC0726t abstractFutureC0726t) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC0726t.get();
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
    public final void m2392a(StringBuilder sb) {
        try {
            Object objM2391d = m2391d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM2391d == this ? "this future" : String.valueOf(objM2391d));
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
        Object obj = this.f4381a;
        if (obj != null) {
            return false;
        }
        if (!f4379f.mo1271n(this, obj, f4377d ? new C0504n(new CancellationException("Future.cancel() was called."), z) : z ? C0504n.f3198b : C0504n.f3199c)) {
            return false;
        }
        m2389b(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m2393e(C0689s c0689s) {
        c0689s.f4177a = null;
        while (true) {
            C0689s c0689s2 = this.f4383c;
            if (c0689s2 == C0689s.f4176c) {
                return;
            }
            C0689s c0689s3 = null;
            while (c0689s2 != null) {
                C0689s c0689s4 = c0689s2.f4178b;
                if (c0689s2.f4177a != null) {
                    c0689s3 = c0689s2;
                } else if (c0689s3 != null) {
                    c0689s3.f4178b = c0689s4;
                    if (c0689s3.f4177a == null) {
                        break;
                    }
                } else if (!f4379f.mo1272o(this, c0689s2, c0689s4)) {
                    break;
                }
                c0689s2 = c0689s4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0689s c0689s = C0689s.f4176c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4381a;
        if (obj != null) {
            return m2390c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0689s c0689s2 = this.f4383c;
            if (c0689s2 != c0689s) {
                C0689s c0689s3 = new C0689s();
                do {
                    AbstractC0259gf abstractC0259gf = f4379f;
                    abstractC0259gf.mo1267O(c0689s3, c0689s2);
                    if (abstractC0259gf.mo1272o(this, c0689s2, c0689s3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m2393e(c0689s3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4381a;
                            if (obj2 != null) {
                                return m2390c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m2393e(c0689s3);
                    } else {
                        c0689s2 = this.f4383c;
                    }
                } while (c0689s2 != c0689s);
            }
            return m2390c(this.f4381a);
        }
        while (nanos > 0) {
            Object obj3 = this.f4381a;
            if (obj3 != null) {
                return m2390c(obj3);
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
        String strM1146i = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM1146i2 = g40.m1146i(strM1146i, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM1146i3 = strM1146i2 + jConvert + " " + lowerCase;
                if (z) {
                    strM1146i3 = g40.m1146i(strM1146i3, ",");
                }
                strM1146i2 = g40.m1146i(strM1146i3, " ");
            }
            if (z) {
                strM1146i2 = strM1146i2 + nanos2 + " nanoseconds ";
            }
            strM1146i = g40.m1146i(strM1146i2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(g40.m1146i(strM1146i, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM1146i + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4381a instanceof C0504n;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4381a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4381a instanceof C0504n) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2392a(sb);
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
                m2392a(sb);
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
        C0689s c0689s = C0689s.f4176c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4381a;
            if (obj2 != null) {
                return m2390c(obj2);
            }
            C0689s c0689s2 = this.f4383c;
            if (c0689s2 != c0689s) {
                C0689s c0689s3 = new C0689s();
                do {
                    AbstractC0259gf abstractC0259gf = f4379f;
                    abstractC0259gf.mo1267O(c0689s3, c0689s2);
                    if (abstractC0259gf.mo1272o(this, c0689s2, c0689s3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4381a;
                            } else {
                                m2393e(c0689s3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m2390c(obj);
                    }
                    c0689s2 = this.f4383c;
                } while (c0689s2 != c0689s);
            }
            return m2390c(this.f4381a);
        }
        throw new InterruptedException();
    }
}
