package p374z2;

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
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: z2.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC6081g implements Future {

    /* JADX INFO: renamed from: j */
    public static final boolean f24571j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: k */
    public static final Logger f24572k = Logger.getLogger(AbstractFutureC6081g.class.getName());

    /* JADX INFO: renamed from: l */
    public static final AbstractC3754e0 f24573l;

    /* JADX INFO: renamed from: m */
    public static final Object f24574m;

    /* JADX INFO: renamed from: g */
    public volatile Object f24575g;

    /* JADX INFO: renamed from: h */
    public volatile C6077c f24576h;

    /* JADX INFO: renamed from: i */
    public volatile C6080f f24577i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC3754e0 c6079e;
        try {
            c6079e = new C6078d(AtomicReferenceFieldUpdater.newUpdater(C6080f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C6080f.class, C6080f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC6081g.class, C6080f.class, "i"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC6081g.class, C6077c.class, "h"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC6081g.class, Object.class, "g"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c6079e = new C6079e();
        }
        f24573l = c6079e;
        if (th != null) {
            f24572k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f24574m = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m10811b(AbstractFutureC6081g abstractFutureC6081g) {
        C6080f c6080f;
        C6077c c6077c;
        do {
            c6080f = abstractFutureC6081g.f24577i;
        } while (!f24573l.mo7924m(abstractFutureC6081g, c6080f, C6080f.f24568c));
        while (c6080f != null) {
            Thread thread = c6080f.f24569a;
            if (thread != null) {
                c6080f.f24569a = null;
                LockSupport.unpark(thread);
            }
            c6080f = c6080f.f24570b;
        }
        do {
            c6077c = abstractFutureC6081g.f24576h;
        } while (!f24573l.mo7922k(abstractFutureC6081g, c6077c));
        C6077c c6077c2 = null;
        while (c6077c != null) {
            C6077c c6077c3 = c6077c.f24562a;
            c6077c.f24562a = c6077c2;
            c6077c2 = c6077c;
            c6077c = c6077c3;
        }
        while (c6077c2 != null) {
            c6077c2 = c6077c2.f24562a;
            try {
                throw null;
            } catch (RuntimeException e6) {
                f24572k.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e6);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Object m10812c(Object obj) throws ExecutionException {
        if (obj instanceof C6075a) {
            Throwable th2 = ((C6075a) obj).f24560a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof AbstractC6076b) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f24574m) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m10813d(AbstractFutureC6081g abstractFutureC6081g) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = abstractFutureC6081g.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th2) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10814a(StringBuilder sb2) {
        try {
            Object objM10813d = m10813d(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objM10813d == this ? "this future" : String.valueOf(objM10813d));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e6.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e7) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e7.getCause());
            sb2.append("]");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        Object obj = this.f24575g;
        if (obj != null) {
            return false;
        }
        if (!f24573l.mo7923l(this, obj, f24571j ? new C6075a(new CancellationException("Future.cancel() was called."), z9) : z9 ? C6075a.f24558b : C6075a.f24559c)) {
            return false;
        }
        m10811b(this);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10815e(C6080f c6080f) {
        c6080f.f24569a = null;
        while (true) {
            C6080f c6080f2 = this.f24577i;
            if (c6080f2 == C6080f.f24568c) {
                return;
            }
            C6080f c6080f3 = null;
            while (c6080f2 != null) {
                C6080f c6080f4 = c6080f2.f24570b;
                if (c6080f2.f24569a != null) {
                    c6080f3 = c6080f2;
                } else if (c6080f3 != null) {
                    c6080f3.f24570b = c6080f4;
                    if (c6080f3.f24569a == null) {
                        break;
                    }
                } else if (!f24573l.mo7924m(this, c6080f2, c6080f4)) {
                    break;
                }
                c6080f2 = c6080f4;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C6080f c6080f = C6080f.f24568c;
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f24575g;
        if (obj != null) {
            return m10812c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C6080f c6080f2 = this.f24577i;
            if (c6080f2 != c6080f) {
                C6080f c6080f3 = new C6080f();
                do {
                    AbstractC3754e0 abstractC3754e0 = f24573l;
                    abstractC3754e0.mo7920a0(c6080f3, c6080f2);
                    if (abstractC3754e0.mo7924m(this, c6080f2, c6080f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m10815e(c6080f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f24575g;
                            if (obj2 != null) {
                                return m10812c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m10815e(c6080f3);
                    } else {
                        c6080f2 = this.f24577i;
                    }
                } while (c6080f2 != c6080f);
            }
            return m10812c(this.f24575g);
        }
        while (nanos > 0) {
            Object obj3 = this.f24575g;
            if (obj3 != null) {
                return m10812c(obj3);
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
        StringBuilder sbM6842o = AbstractC3199a.m6842o(j3, "Waited ", " ");
        sbM6842o.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM6842o.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j4 = -nanos;
            long jConvert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(jConvert);
            boolean z9 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z9) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z9) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC4855en.m9264h(string3, " for ", string));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24575g instanceof C6075a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24575g != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: z2.g */
    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f24575g instanceof C6075a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m10814a(sb2);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e6) {
                str = "Exception thrown from implementation: " + e6.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                m10814a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C6080f c6080f = C6080f.f24568c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f24575g;
            if (obj2 != null) {
                return m10812c(obj2);
            }
            C6080f c6080f2 = this.f24577i;
            if (c6080f2 != c6080f) {
                C6080f c6080f3 = new C6080f();
                do {
                    AbstractC3754e0 abstractC3754e0 = f24573l;
                    abstractC3754e0.mo7920a0(c6080f3, c6080f2);
                    if (abstractC3754e0.mo7924m(this, c6080f2, c6080f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f24575g;
                            } else {
                                m10815e(c6080f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m10812c(obj);
                    }
                    c6080f2 = this.f24577i;
                } while (c6080f2 != c6080f);
            }
            return m10812c(this.f24575g);
        }
        throw new InterruptedException();
    }
}
