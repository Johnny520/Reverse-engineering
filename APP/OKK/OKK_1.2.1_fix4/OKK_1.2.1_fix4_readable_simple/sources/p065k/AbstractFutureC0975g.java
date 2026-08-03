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
    public static final boolean f3453d = false;

    /* JADX INFO: renamed from: e */
    public static final Logger f3454e = null;

    /* JADX INFO: renamed from: f */
    public static final AbstractC0805P f3455f = null;

    /* JADX INFO: renamed from: g */
    public static final Object f3456g = null;

    /* JADX INFO: renamed from: a */
    public volatile Object f3457a;

    /* JADX INFO: renamed from: b */
    public volatile C0971c f3458b;

    /* JADX INFO: renamed from: c */
    public volatile C0974f f3459c;

    static {
        f3453d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        f3454e = Logger.getLogger(AbstractFutureC0975g.class.getName());
        AbstractC0805P r4 = new C0972d(AtomicReferenceFieldUpdater.newUpdater(C0974f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0974f.class, C0974f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0975g.class, C0974f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0975g.class, C0971c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0975g.class, Object.class, "a"));     // Catch: Throwable -> L5
        th = null;
    L7:
        f3455f = r4;
        if (th == null) goto L10;
        f3454e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
    L10:
        f3456g = new Object();
        return;
    L5:
        th = th;
        r4 = new C0973e();
        goto L7
    }

    /* JADX INFO: renamed from: b */
    public static void m2329b(AbstractFutureC0975g r5) {
    L2:
        C0974f r02 = r5.f3459c;
        if (f3455f.mo2069e(r5, r02, C0974f.f3450c) == false) goto L2;
    L5:
        if (r02 == null) goto L10;
        Thread r2 = r02.f3451a;
        if (r2 == null) goto L9;
        r02.f3451a = null;
        LockSupport.unpark(r2);
    L9:
        r02 = r02.f3452b;
    L10:
        C0971c r03 = r5.f3458b;
        if (f3455f.mo2067c(r5, r03) == false) goto L10;
        C0971c r52 = null;
    L13:
        if (r03 == null) goto L15;
        C0971c r22 = r03.f3444a;
        r03.f3444a = r52;
        r52 = r03;
        r03 = r22;
    L15:
        if (r52 == null) goto L16;
        r52 = r52.f3444a;
        throw null;     // Catch: RuntimeException -> L19
    L19:
        e = move-exception;
        f3454e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", e);
        goto L15
    }

    /* JADX INFO: renamed from: c */
    public static Object m2330c(Object r2) {
        if ((r2 instanceof C0969a) == false) goto L5;
        Throwable r22 = ((C0969a) r2).f3442a;
        CancellationException r02 = new CancellationException("Task was cancelled.");
        r02.initCause(r22);
        throw r02;
    L5:
        if ((r2 instanceof AbstractC0970b) == false) goto L7;
        ((AbstractC0970b) r2).getClass();
        throw new ExecutionException(null);
    L7:
        if (r2 != f3456g) goto L14;
        return null;
    L14:
        return r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2331a(StringBuilder r4) {
        boolean r1 = false;
    L24:
        Object r2 = get();     // Catch: Throwable -> L15 InterruptedException -> L23
    L4:
        if (r1 == false) goto L6;
        Thread.currentThread().interrupt();     // Catch: RuntimeException -> L11 ExecutionException -> L13 CancellationException -> L20
    L6:
        r4.append("SUCCESS, result=[");     // Catch: RuntimeException -> L11 ExecutionException -> L13 CancellationException -> L20
        if (r2 != this) goto L9;
        String r12 = "this future";
    L10:
        r4.append(r12);     // Catch: RuntimeException -> L11 ExecutionException -> L13 CancellationException -> L20
        r4.append("]");     // Catch: RuntimeException -> L11 ExecutionException -> L13 CancellationException -> L20
        return;
    L9:
        r12 = String.valueOf(r2);     // Catch: RuntimeException -> L11 ExecutionException -> L13 CancellationException -> L20
    L23:
        r1 = true;
    L15:
        th = move-exception;
        if (r1 == false) goto L18;
        Thread.currentThread().interrupt();     // Catch: RuntimeException -> L11 ExecutionException -> L13 CancellationException -> L20
    L18:
        throw th;     // Catch: RuntimeException -> L11 ExecutionException -> L13 CancellationException -> L20
    L20:
        r4.append("CANCELLED");
        return;
    L11:
        e = move-exception;
        r4.append("UNKNOWN, cause=[");
        r4.append(e.getClass());
        r4.append(" thrown from get()]");
        return;
    L13:
        e = move-exception;
        r4.append("FAILURE, cause=[");
        r4.append(e.getCause());
        r4.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r6) {
        Object r02 = this.f3457a;
        if (r02 == null) goto L5;
        return false;
    L5:
        if (f3453d == false) goto L7;
        C0969a r2 = new C0969a(r6, new CancellationException("Future.cancel() was called."));
    L11:
        if (f3455f.mo2068d(this, r02, r2) == false) goto L15;
        m2329b(this);
        return true;
    L15:
        return false;
    L7:
        if (r6 == false) goto L9;
        r2 = C0969a.f3440b;
        goto L11
    L9:
        r2 = C0969a.f3441c;
        goto L11
    }

    /* JADX INFO: renamed from: d */
    public final void m2332d(C0974f r5) {
        r5.f3451a = null;
    L3:
        C0974f r52 = this.f3459c;
        if (r52 == C0974f.f3450c) goto L5;
        C0974f r1 = null;
    L7:
        if (r52 == null) goto L19;
        C0974f r2 = r52.f3452b;
        if (r52.f3451a == null) goto L11;
        r1 = r52;
    L18:
        r52 = r2;
        goto L7
    L11:
        if (r1 == null) goto L16;
        r1.f3452b = r2;
        if (r1.f3451a != null) goto L18;
    L16:
        if (f3455f.mo2069e(this, r52, r2) == true) goto L18;
    L19:
        return;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r13, TimeUnit r15) {
        long r02 = r15.toNanos(r13);
        if (Thread.interrupted() == true) goto L69;
        Object r2 = this.f3457a;
        if (r2 == null) goto L9;
        return m2330c(r2);
    L9:
        if (r02 <= 0) goto L11;
        long r4 = System.nanoTime() + r02;
    L13:
        if (r02 < 1000) goto L35;
        C0974f r8 = this.f3459c;
        C0974f r9 = C0974f.f3450c;
        if (r8 == r9) goto L33;
        C0974f r10 = new C0974f();
    L17:
        AbstractC0805P r11 = f3455f;
        r11.mo2061O(r10, r8);
        if (r11.mo2069e(this, r8, r10) == true) goto L19;
        r8 = this.f3459c;
        if (r8 != r9) goto L17;
    L19:
        LockSupport.parkNanos(this, r02);
        if (Thread.interrupted() == true) goto L28;
        Object r03 = this.f3457a;
        if (r03 != null) goto L24;
        r02 = r4 - System.nanoTime();
        if (r02 >= 1000) goto L19;
        m2332d(r10);
        goto L35
    L24:
        return m2330c(r03);
    L28:
        m2332d(r10);
        throw new InterruptedException();
    L33:
        return m2330c(this.f3457a);
    L35:
        if (r02 <= 0) goto L45;
        Object r04 = this.f3457a;
        if (r04 != null) goto L39;
        if (Thread.interrupted() == true) goto L44;
        r02 = r4 - System.nanoTime();
        goto L35
    L44:
        throw new InterruptedException();
    L39:
        return m2330c(r04);
    L45:
        String r42 = toString();
        String r5 = r15.toString();
        Locale r82 = Locale.ROOT;
        String r52 = r5.toLowerCase(r82);
        String r14 = "Waited " + r13 + " " + r15.toString().toLowerCase(r82);
        if ((r02 + 1000) >= 0) goto L63;
        String r142 = AbstractC0324d.m722e(r14, " (plus ");
        long r05 = -r02;
        long r83 = r15.convert(r05, TimeUnit.NANOSECONDS);
        long r06 = r05 - r15.toNanos(r83);
        if (r83 != 0) goto L50;
    L53:
        boolean r22 = true;
    L54:
        if (r83 <= 0) goto L59;
        String r143 = r142 + r83 + " " + r52;
        if (r22 == false) goto L58;
        r143 = AbstractC0324d.m722e(r143, ",");
    L58:
        r142 = AbstractC0324d.m722e(r143, " ");
    L59:
        if (r22 == false) goto L61;
        r142 = r142 + r06 + " nanoseconds ";
    L61:
        r14 = AbstractC0324d.m722e(r142, "delay)");
        goto L63
    L50:
        if (r06 > 1000) goto L53;
        r22 = false;
    L63:
        if (isDone() == false) goto L67;
        throw new TimeoutException(AbstractC0324d.m722e(r14, " but future completed as timeout expired"));
    L67:
        throw new TimeoutException(r14 + " for " + r42);
    L11:
        r4 = 0;
        goto L13
    L69:
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3457a instanceof C0969a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f3457a == null) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(super.toString());
        r02.append("[status=");
        if ((this.f3457a instanceof C0969a) == false) goto L6;
        r02.append("CANCELLED");
    L23:
        r02.append("]");
        return r02.toString();
    L6:
        if (isDone() == false) goto L25;
        m2331a(r02);
        goto L23
    L25:
    L13:
        e = move-exception;
        String r1 = "Exception thrown from implementation: " + e.getClass();
    L15:
        if (r1 == null) goto L20;
        if (r1.isEmpty() == true) goto L20;
        r02.append("PENDING, info=[");
        r02.append(r1);
        r02.append("]");
    L20:
        if (isDone() == false) goto L22;
        m2331a(r02);
        goto L23
    L22:
        r02.append("PENDING");
        goto L23
    L9:
        if ((this instanceof ScheduledFuture) == false) goto L12;
        r1 = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";     // Catch: RuntimeException -> L13
        goto L15
    L12:
        r1 = null;
        goto L15
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        if (Thread.interrupted() == true) goto L26;
        Object r02 = this.f3457a;
        if (r02 != null) goto L7;
        C0974f r03 = this.f3459c;
        C0974f r1 = C0974f.f3450c;
        if (r03 == r1) goto L24;
        C0974f r2 = new C0974f();
    L11:
        AbstractC0805P r3 = f3455f;
        r3.mo2061O(r2, r03);
        if (r3.mo2069e(this, r03, r2) == true) goto L13;
        r03 = this.f3459c;
        if (r03 != r1) goto L11;
    L13:
        LockSupport.park(this);
        if (Thread.interrupted() == true) goto L19;
        Object r04 = this.f3457a;
        if (r04 == null) goto L13;
        return m2330c(r04);
    L19:
        m2332d(r2);
        throw new InterruptedException();
    L24:
        return m2330c(this.f3457a);
    L7:
        return m2330c(r02);
    L26:
        throw new InterruptedException();
    }
}
