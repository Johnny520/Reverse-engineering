package androidx.concurrent.futures;

import io.ktor.client.plugins.AbstractC4765;
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
public abstract class AbstractFutureC2976 implements Future {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final AbstractC4765 f6661;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Object f6662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile C2972 f6663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile C2969 f6664;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile Object f6665;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final boolean f6660 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final Logger f6659 = Logger.getLogger(AbstractFutureC2976.class.getName());

    static {
        AbstractC4765 c2970;
        try {
            c2970 = new C2971(AtomicReferenceFieldUpdater.newUpdater(C2969.class, Thread.class, "飘花落叶言子楪世苏哲兰"), AtomicReferenceFieldUpdater.newUpdater(C2969.class, C2969.class, "飘花落叶言子楪世苏兰哲"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2976.class, C2969.class, "飘花落叶言子楪哲兰苏世"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2976.class, C2972.class, "飘花落叶言子楪哲兰世苏"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2976.class, Object.class, "飘花落叶言子楪哲苏兰世"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2970 = new C2970();
        }
        f6661 = c2970;
        if (th != null) {
            f6659.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f6662 = new Object();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m4433(AbstractFutureC2976 abstractFutureC2976) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC2976.get();
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
    public static Object m4434(Object obj) throws ExecutionException {
        if (obj instanceof C2974) {
            Throwable th = ((C2974) obj).f6658;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC2973) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f6662) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m4435(AbstractFutureC2976 abstractFutureC2976) {
        C2969 c2969;
        C2972 c2972;
        do {
            c2969 = abstractFutureC2976.f6664;
        } while (!f6661.mo4430(abstractFutureC2976, c2969, C2969.f6646));
        while (c2969 != null) {
            Thread thread = c2969.f6648;
            if (thread != null) {
                c2969.f6648 = null;
                LockSupport.unpark(thread);
            }
            c2969 = c2969.f6647;
        }
        do {
            c2972 = abstractFutureC2976.f6663;
        } while (!f6661.mo4432(abstractFutureC2976, c2972));
        C2972 c29722 = null;
        while (c2972 != null) {
            C2972 c29723 = c2972.f6655;
            c2972.f6655 = c29722;
            c29722 = c2972;
            c2972 = c29723;
        }
        while (c29722 != null) {
            c29722 = c29722.f6655;
            try {
                throw null;
            } catch (RuntimeException e) {
                f6659.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f6665;
        if (obj != null) {
            return false;
        }
        if (!f6661.mo4431(this, obj, f6660 ? new C2974(new CancellationException("Future.cancel() was called."), z) : z ? C2974.f6657 : C2974.f6656)) {
            return false;
        }
        m4435(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C2969 c2969 = C2969.f6646;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6665;
        if (obj != null) {
            return m4434(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2969 c29692 = this.f6664;
            if (c29692 != c2969) {
                C2969 c29693 = new C2969();
                do {
                    AbstractC4765 abstractC4765 = f6661;
                    abstractC4765.mo4429(c29693, c29692);
                    if (abstractC4765.mo4430(this, c29692, c29693)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m4436(c29693);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f6665;
                            if (obj2 != null) {
                                return m4434(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m4436(c29693);
                    } else {
                        c29692 = this.f6664;
                    }
                } while (c29692 != c2969);
            }
            return m4434(this.f6665);
        }
        while (nanos > 0) {
            Object obj3 = this.f6665;
            if (obj3 != null) {
                return m4434(obj3);
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
        return this.f6665 instanceof C2974;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6665 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f6665 instanceof C2974) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m4437(sb);
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
                m4437(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4436(C2969 c2969) {
        c2969.f6648 = null;
        while (true) {
            C2969 c29692 = this.f6664;
            if (c29692 == C2969.f6646) {
                return;
            }
            C2969 c29693 = null;
            while (c29692 != null) {
                C2969 c29694 = c29692.f6647;
                if (c29692.f6648 != null) {
                    c29693 = c29692;
                } else if (c29693 != null) {
                    c29693.f6647 = c29694;
                    if (c29693.f6648 == null) {
                        break;
                    }
                } else if (!f6661.mo4430(this, c29692, c29694)) {
                    break;
                }
                c29692 = c29694;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4437(StringBuilder sb) {
        try {
            Object objM4433 = m4433(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM4433 == this ? "this future" : String.valueOf(objM4433));
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
        C2969 c2969 = C2969.f6646;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6665;
            if (obj2 != null) {
                return m4434(obj2);
            }
            C2969 c29692 = this.f6664;
            if (c29692 != c2969) {
                C2969 c29693 = new C2969();
                do {
                    AbstractC4765 abstractC4765 = f6661;
                    abstractC4765.mo4429(c29693, c29692);
                    if (abstractC4765.mo4430(this, c29692, c29693)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6665;
                            } else {
                                m4436(c29693);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m4434(obj);
                    }
                    c29692 = this.f6664;
                } while (c29692 != c2969);
            }
            return m4434(this.f6665);
        }
        throw new InterruptedException();
    }
}
