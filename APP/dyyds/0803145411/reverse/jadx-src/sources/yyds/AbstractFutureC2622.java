package yyds;

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

/* JADX INFO: renamed from: yyds.ᲈᛳᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC2622 implements Future {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final AbstractC0395 f12901;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final Object f12902;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public volatile C1037 f12905;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public volatile Object f12906;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public volatile C1336 f12907;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final boolean f12904 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final Logger f12903 = Logger.getLogger(AbstractFutureC2622.class.getName());

    static {
        AbstractC0395 c2559;
        try {
            c2559 = new C0579(AtomicReferenceFieldUpdater.newUpdater(C1037.class, Thread.class, "ᛲᲈᲁ"), AtomicReferenceFieldUpdater.newUpdater(C1037.class, C1037.class, "ᛵᛸᛸᛷ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2622.class, C1037.class, "ᛲᛴᛳᛲ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2622.class, C1336.class, "ᲇᲈᛵᛷ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2622.class, Object.class, "ᲀᛲᛳᲀ"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2559 = new C2559();
        }
        f12901 = c2559;
        if (th != null) {
            f12903.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f12902 = new Object();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m4735(AbstractFutureC2622 abstractFutureC2622) {
        C1037 c1037;
        C1336 c1336;
        do {
            c1037 = abstractFutureC2622.f12905;
        } while (!f12901.mo1144(abstractFutureC2622, c1037, C1037.f4700));
        while (c1037 != null) {
            Thread thread = c1037.f4701;
            if (thread != null) {
                c1037.f4701 = null;
                LockSupport.unpark(thread);
            }
            c1037 = c1037.f4702;
        }
        do {
            c1336 = abstractFutureC2622.f12907;
        } while (!f12901.mo1146(abstractFutureC2622, c1336));
        C1336 c13362 = null;
        while (c1336 != null) {
            C1336 c13363 = c1336.f6187;
            c1336.f6187 = c13362;
            c13362 = c1336;
            c1336 = c13363;
        }
        while (c13362 != null) {
            c13362 = c13362.f6187;
            try {
                throw null;
            } catch (RuntimeException e) {
                f12903.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static Object m4736(Object obj) throws ExecutionException {
        if (obj instanceof C0909) {
            Throwable th = ((C0909) obj).f4137;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC1251) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f12902) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static Object m4737(AbstractFutureC2622 abstractFutureC2622) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC2622.get();
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f12906;
        if (obj != null) {
            return false;
        }
        if (!f12901.mo1147(this, obj, f12904 ? new C0909(new CancellationException("Future.cancel() was called."), z) : z ? C0909.f4135 : C0909.f4136)) {
            return false;
        }
        m4735(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C1037 c1037 = C1037.f4700;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f12906;
        if (obj != null) {
            return m4736(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1037 c10372 = this.f12905;
            if (c10372 != c1037) {
                C1037 c10373 = new C1037();
                do {
                    AbstractC0395 abstractC0395 = f12901;
                    abstractC0395.mo1145(c10373, c10372);
                    if (abstractC0395.mo1144(this, c10372, c10373)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m4738(c10373);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f12906;
                            if (obj2 != null) {
                                return m4736(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m4738(c10373);
                    } else {
                        c10372 = this.f12905;
                    }
                } while (c10372 != c1037);
            }
            return m4736(this.f12906);
        }
        while (nanos > 0) {
            Object obj3 = this.f12906;
            if (obj3 != null) {
                return m4736(obj3);
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
        throw new TimeoutException(AbstractC2104.m4014(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12906 instanceof C0909;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12906 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f12906 instanceof C0909) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m4739(sb);
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
                m4739(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m4738(C1037 c1037) {
        c1037.f4701 = null;
        while (true) {
            C1037 c10372 = this.f12905;
            if (c10372 == C1037.f4700) {
                return;
            }
            C1037 c10373 = null;
            while (c10372 != null) {
                C1037 c10374 = c10372.f4702;
                if (c10372.f4701 != null) {
                    c10373 = c10372;
                } else if (c10373 != null) {
                    c10373.f4702 = c10374;
                    if (c10373.f4701 == null) {
                        break;
                    }
                } else if (!f12901.mo1144(this, c10372, c10374)) {
                    break;
                }
                c10372 = c10374;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4739(StringBuilder sb) {
        try {
            Object objM4737 = m4737(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM4737 == this ? "this future" : String.valueOf(objM4737));
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
    public final Object get() throws InterruptedException {
        Object obj;
        C1037 c1037 = C1037.f4700;
        if (!Thread.interrupted()) {
            Object obj2 = this.f12906;
            if (obj2 != null) {
                return m4736(obj2);
            }
            C1037 c10372 = this.f12905;
            if (c10372 != c1037) {
                C1037 c10373 = new C1037();
                do {
                    AbstractC0395 abstractC0395 = f12901;
                    abstractC0395.mo1145(c10373, c10372);
                    if (abstractC0395.mo1144(this, c10372, c10373)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f12906;
                            } else {
                                m4738(c10373);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m4736(obj);
                    }
                    c10372 = this.f12905;
                } while (c10372 != c1037);
            }
            return m4736(this.f12906);
        }
        throw new InterruptedException();
    }
}
