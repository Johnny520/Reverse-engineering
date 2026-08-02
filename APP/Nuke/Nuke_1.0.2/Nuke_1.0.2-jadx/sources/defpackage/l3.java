package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l3 implements Future {
    public static final boolean k = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger l = Logger.getLogger(l3.class.getName());
    public static final tp0 m;
    public static final Object n;
    public volatile Object h;
    public volatile h3 i;
    public volatile k3 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        tp0 j3Var;
        try {
            j3Var = new i3(AtomicReferenceFieldUpdater.newUpdater(k3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k3.class, k3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(l3.class, k3.class, "j"), AtomicReferenceFieldUpdater.newUpdater(l3.class, h3.class, "i"), AtomicReferenceFieldUpdater.newUpdater(l3.class, Object.class, "h"));
            th = null;
        } catch (Throwable th) {
            th = th;
            j3Var = new j3();
        }
        m = j3Var;
        if (th != null) {
            l.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        n = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(l3 l3Var) {
        k3 k3Var;
        h3 h3Var;
        do {
            k3Var = l3Var.j;
        } while (!m.l(l3Var, k3Var, k3.c));
        while (k3Var != null) {
            Thread thread = k3Var.a;
            if (thread != null) {
                k3Var.a = null;
                LockSupport.unpark(thread);
            }
            k3Var = k3Var.b;
        }
        do {
            h3Var = l3Var.i;
        } while (!m.j(l3Var, h3Var));
        h3 h3Var2 = null;
        while (h3Var != null) {
            h3 h3Var3 = h3Var.a;
            h3Var.a = h3Var2;
            h3Var2 = h3Var;
            h3Var = h3Var3;
        }
        while (h3Var2 != null) {
            h3Var2 = h3Var2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                l.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof f3) {
            Throwable th = ((f3) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof g3) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == n) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object d(l3 l3Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = l3Var.get();
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
    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
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
        Object obj = this.h;
        if (obj != null) {
            return false;
        }
        if (!m.k(this, obj, k ? new f3(new CancellationException("Future.cancel() was called."), z) : z ? f3.b : f3.c)) {
            return false;
        }
        b(this);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(k3 k3Var) {
        k3Var.a = null;
        while (true) {
            k3 k3Var2 = this.j;
            if (k3Var2 == k3.c) {
                return;
            }
            k3 k3Var3 = null;
            while (k3Var2 != null) {
                k3 k3Var4 = k3Var2.b;
                if (k3Var2.a != null) {
                    k3Var3 = k3Var2;
                } else if (k3Var3 != null) {
                    k3Var3.b = k3Var4;
                    if (k3Var3.a == null) {
                        break;
                    }
                } else if (!m.l(this, k3Var2, k3Var4)) {
                    break;
                }
                k3Var2 = k3Var4;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        k3 k3Var = k3.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.h;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k3 k3Var2 = this.j;
            if (k3Var2 != k3Var) {
                k3 k3Var3 = new k3();
                do {
                    tp0 tp0Var = m;
                    tp0Var.F(k3Var3, k3Var2);
                    if (tp0Var.l(this, k3Var2, k3Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(k3Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.h;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(k3Var3);
                    } else {
                        k3Var2 = this.j;
                    }
                } while (k3Var2 != k3Var);
            }
            return c(this.h);
        }
        while (nanos > 0) {
            Object obj3 = this.h;
            if (obj3 != null) {
                return c(obj3);
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
        return this.h instanceof f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.h != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: l3 */
    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.h instanceof f3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
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
                a(sb);
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
        k3 k3Var = k3.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.h;
            if (obj2 != null) {
                return c(obj2);
            }
            k3 k3Var2 = this.j;
            if (k3Var2 != k3Var) {
                k3 k3Var3 = new k3();
                do {
                    tp0 tp0Var = m;
                    tp0Var.F(k3Var3, k3Var2);
                    if (tp0Var.l(this, k3Var2, k3Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.h;
                            } else {
                                e(k3Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    k3Var2 = this.j;
                } while (k3Var2 != k3Var);
            }
            return c(this.h);
        }
        throw new InterruptedException();
    }
}
