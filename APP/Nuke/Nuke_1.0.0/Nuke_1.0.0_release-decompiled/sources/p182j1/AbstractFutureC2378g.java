package p182j1;

import com.bumptech.glide.AbstractC1924f;
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

/* JADX INFO: renamed from: j1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC2378g implements Future {

    /* JADX INFO: renamed from: g */
    public static final boolean f7716g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: h */
    public static final Logger f7717h = Logger.getLogger(AbstractFutureC2378g.class.getName());

    /* JADX INFO: renamed from: i */
    public static final AbstractC1924f f7718i;

    /* JADX INFO: renamed from: j */
    public static final Object f7719j;

    /* JADX INFO: renamed from: d */
    public volatile Object f7720d;

    /* JADX INFO: renamed from: e */
    public volatile C2374c f7721e;

    /* JADX INFO: renamed from: f */
    public volatile C2377f f7722f;

    static {
        AbstractC1924f c2376e;
        try {
            c2376e = new C2375d(AtomicReferenceFieldUpdater.newUpdater(C2377f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2377f.class, C2377f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2378g.class, C2377f.class, "f"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2378g.class, C2374c.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2378g.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2376e = new C2376e(16);
        }
        f7718i = c2376e;
        if (th != null) {
            f7717h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7719j = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m4228b(AbstractFutureC2378g abstractFutureC2378g) {
        C2377f c2377f;
        C2374c c2374c;
        do {
            c2377f = abstractFutureC2378g.f7722f;
        } while (!f7718i.mo3515g(abstractFutureC2378g, c2377f, C2377f.f7713c));
        while (c2377f != null) {
            Thread thread = c2377f.f7714a;
            if (thread != null) {
                c2377f.f7714a = null;
                LockSupport.unpark(thread);
            }
            c2377f = c2377f.f7715b;
        }
        do {
            c2374c = abstractFutureC2378g.f7721e;
        } while (!f7718i.mo3513e(abstractFutureC2378g, c2374c));
        C2374c c2374c2 = null;
        while (c2374c != null) {
            C2374c c2374c3 = c2374c.f7707a;
            c2374c.f7707a = c2374c2;
            c2374c2 = c2374c;
            c2374c = c2374c3;
        }
        while (c2374c2 != null) {
            c2374c2 = c2374c2.f7707a;
            try {
                throw null;
            } catch (RuntimeException e5) {
                f7717h.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e5);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m4229c(Object obj) throws ExecutionException {
        if (obj instanceof C2372a) {
            Throwable th = ((C2372a) obj).f7705a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC2373b) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f7719j) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m4230d(AbstractFutureC2378g abstractFutureC2378g) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = abstractFutureC2378g.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m4231a(StringBuilder sb) {
        try {
            Object objM4230d = m4230d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM4230d == this ? "this future" : String.valueOf(objM4230d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f7720d;
        if (obj != null) {
            return false;
        }
        if (!f7718i.mo3514f(this, obj, f7716g ? new C2372a(new CancellationException("Future.cancel() was called."), z5) : z5 ? C2372a.f7703b : C2372a.f7704c)) {
            return false;
        }
        m4228b(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m4232e(C2377f c2377f) {
        c2377f.f7714a = null;
        while (true) {
            C2377f c2377f2 = this.f7722f;
            if (c2377f2 == C2377f.f7713c) {
                return;
            }
            C2377f c2377f3 = null;
            while (c2377f2 != null) {
                C2377f c2377f4 = c2377f2.f7715b;
                if (c2377f2.f7714a != null) {
                    c2377f3 = c2377f2;
                } else if (c2377f3 != null) {
                    c2377f3.f7715b = c2377f4;
                    if (c2377f3.f7714a == null) {
                        break;
                    }
                } else if (!f7718i.mo3515g(this, c2377f2, c2377f4)) {
                    break;
                }
                c2377f2 = c2377f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C2377f c2377f = C2377f.f7713c;
        long nanos = timeUnit.toNanos(j5);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7720d;
        if (obj != null) {
            return m4229c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2377f c2377f2 = this.f7722f;
            if (c2377f2 != c2377f) {
                C2377f c2377f3 = new C2377f();
                do {
                    AbstractC1924f abstractC1924f = f7718i;
                    abstractC1924f.mo3516r(c2377f3, c2377f2);
                    if (abstractC1924f.mo3515g(this, c2377f2, c2377f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m4232e(c2377f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7720d;
                            if (obj2 != null) {
                                return m4229c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m4232e(c2377f3);
                    } else {
                        c2377f2 = this.f7722f;
                    }
                } while (c2377f2 != c2377f);
            }
            return m4229c(this.f7720d);
        }
        while (nanos > 0) {
            Object obj3 = this.f7720d;
            if (obj3 != null) {
                return m4229c(obj3);
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
        String str = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j6 = -nanos;
            long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(jConvert);
            boolean z5 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z5) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z5) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7720d instanceof C2372a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7720d != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7720d instanceof C2372a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m4231a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e5) {
                str = "Exception thrown from implementation: " + e5.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m4231a(sb);
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
        C2377f c2377f = C2377f.f7713c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7720d;
            if (obj2 != null) {
                return m4229c(obj2);
            }
            C2377f c2377f2 = this.f7722f;
            if (c2377f2 != c2377f) {
                C2377f c2377f3 = new C2377f();
                do {
                    AbstractC1924f abstractC1924f = f7718i;
                    abstractC1924f.mo3516r(c2377f3, c2377f2);
                    if (abstractC1924f.mo3515g(this, c2377f2, c2377f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7720d;
                            } else {
                                m4232e(c2377f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m4229c(obj);
                    }
                    c2377f2 = this.f7722f;
                } while (c2377f2 != c2377f);
            }
            return m4229c(this.f7720d);
        }
        throw new InterruptedException();
    }
}
