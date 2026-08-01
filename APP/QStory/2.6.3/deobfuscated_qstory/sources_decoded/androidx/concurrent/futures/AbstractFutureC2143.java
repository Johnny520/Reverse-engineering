package androidx.concurrent.futures;

import io.ktor.client.plugins.AbstractC3933;
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

/* JADX INFO: renamed from: androidx.concurrent.futures.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC2143 implements Future {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final AbstractC3933 f6316;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Object f6317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile C2139 f6318;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile C2136 f6319;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile Object f6320;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final boolean f6315 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final Logger f6314 = Logger.getLogger(AbstractFutureC2143.class.getName());

    static {
        AbstractC3933 c2137;
        try {
            c2137 = new C2138(AtomicReferenceFieldUpdater.newUpdater(C2136.class, Thread.class, "飘花落叶言子楪世苏哲兰"), AtomicReferenceFieldUpdater.newUpdater(C2136.class, C2136.class, "飘花落叶言子楪世苏兰哲"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2143.class, C2136.class, "飘花落叶言子楪哲兰苏世"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2143.class, C2139.class, "飘花落叶言子楪哲兰世苏"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2143.class, Object.class, "飘花落叶言子楪哲苏兰世"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2137 = new C2137();
        }
        f6316 = c2137;
        if (th != null) {
            f6314.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f6317 = new Object();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m3873(AbstractFutureC2143 abstractFutureC2143) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC2143.get();
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m3874(Object obj) throws ExecutionException {
        if (obj instanceof C2141) {
            Throwable th = ((C2141) obj).f6313;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC2140) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f6317) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m3875(AbstractFutureC2143 abstractFutureC2143) {
        C2136 c2136;
        C2139 c2139;
        do {
            c2136 = abstractFutureC2143.f6319;
        } while (!f6316.mo3870(abstractFutureC2143, c2136, C2136.f6301));
        while (c2136 != null) {
            Thread thread = c2136.f6303;
            if (thread != null) {
                c2136.f6303 = null;
                LockSupport.unpark(thread);
            }
            c2136 = c2136.f6302;
        }
        do {
            c2139 = abstractFutureC2143.f6318;
        } while (!f6316.mo3872(abstractFutureC2143, c2139));
        C2139 c21392 = null;
        while (c2139 != null) {
            C2139 c21393 = c2139.f6310;
            c2139.f6310 = c21392;
            c21392 = c2139;
            c2139 = c21393;
        }
        while (c21392 != null) {
            c21392 = c21392.f6310;
            try {
                throw null;
            } catch (RuntimeException e) {
                f6314.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f6320;
        if (obj != null) {
            return false;
        }
        if (!f6316.mo3871(this, obj, f6315 ? new C2141(new CancellationException("Future.cancel() was called."), z) : z ? C2141.f6312 : C2141.f6311)) {
            return false;
        }
        m3875(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C2136 c2136 = C2136.f6301;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6320;
        if (obj != null) {
            return m3874(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2136 c21362 = this.f6319;
            if (c21362 != c2136) {
                C2136 c21363 = new C2136();
                do {
                    AbstractC3933 abstractC3933 = f6316;
                    abstractC3933.mo3869(c21363, c21362);
                    if (abstractC3933.mo3870(this, c21362, c21363)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m3876(c21363);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f6320;
                            if (obj2 != null) {
                                return m3874(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m3876(c21363);
                    } else {
                        c21362 = this.f6319;
                    }
                } while (c21362 != c2136);
            }
            return m3874(this.f6320);
        }
        while (nanos > 0) {
            Object obj3 = this.f6320;
            if (obj3 != null) {
                return m3874(obj3);
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
        return this.f6320 instanceof C2141;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6320 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f6320 instanceof C2141) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m3877(sb);
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
                m3877(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3876(C2136 c2136) {
        c2136.f6303 = null;
        while (true) {
            C2136 c21362 = this.f6319;
            if (c21362 == C2136.f6301) {
                return;
            }
            C2136 c21363 = null;
            while (c21362 != null) {
                C2136 c21364 = c21362.f6302;
                if (c21362.f6303 != null) {
                    c21363 = c21362;
                } else if (c21363 != null) {
                    c21363.f6302 = c21364;
                    if (c21363.f6303 == null) {
                        break;
                    }
                } else if (!f6316.mo3870(this, c21362, c21364)) {
                    break;
                }
                c21362 = c21364;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3877(StringBuilder sb) {
        try {
            Object objM3873 = m3873(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM3873 == this ? "this future" : String.valueOf(objM3873));
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
        C2136 c2136 = C2136.f6301;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6320;
            if (obj2 != null) {
                return m3874(obj2);
            }
            C2136 c21362 = this.f6319;
            if (c21362 != c2136) {
                C2136 c21363 = new C2136();
                do {
                    AbstractC3933 abstractC3933 = f6316;
                    abstractC3933.mo3869(c21363, c21362);
                    if (abstractC3933.mo3870(this, c21362, c21363)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6320;
                            } else {
                                m3876(c21363);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m3874(obj);
                    }
                    c21362 = this.f6319;
                } while (c21362 != c2136);
            }
            return m3874(this.f6320);
        }
        throw new InterruptedException();
    }
}
