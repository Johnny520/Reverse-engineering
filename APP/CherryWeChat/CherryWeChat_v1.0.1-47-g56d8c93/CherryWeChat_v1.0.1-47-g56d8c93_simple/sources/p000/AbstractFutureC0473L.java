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
    public static final boolean f1563d = false;

    /* JADX INFO: renamed from: e */
    public static final Logger f1564e = null;

    /* JADX INFO: renamed from: f */
    public static final AbstractC0628Oj f1565f = null;

    /* JADX INFO: renamed from: g */
    public static final Object f1566g = null;

    /* JADX INFO: renamed from: a */
    public volatile Object f1567a;

    /* JADX INFO: renamed from: b */
    public volatile C0301H f1568b;

    /* JADX INFO: renamed from: c */
    public volatile C0430K f1569c;

    static {
        f1563d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        f1564e = Logger.getLogger(AbstractFutureC0473L.class.getName());
        AbstractC0628Oj r5 = new C0344I(AtomicReferenceFieldUpdater.newUpdater(C0430K.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0430K.class, C0430K.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0473L.class, C0430K.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0473L.class, C0301H.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0473L.class, Object.class, "a"));     // Catch: Throwable -> L5
        th = null;
    L7:
        f1565f = r5;
        if (th == null) goto L10;
        f1564e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
    L10:
        f1566g = new Object();
        return;
    L5:
        th = th;
        r5 = new C0387J();
        goto L7
    }

    /* JADX INFO: renamed from: b */
    public static void m923b(AbstractFutureC0473L r5) {
    L2:
        C0430K r0 = r5.f1569c;
        if (f1565f.mo734h(r5, r0, C0430K.f1415c) == false) goto L2;
    L5:
        if (r0 == null) goto L10;
        Thread r2 = r0.f1416a;
        if (r2 == null) goto L9;
        r0.f1416a = null;
        LockSupport.unpark(r2);
    L9:
        r0 = r0.f1417b;
    L10:
        C0301H r02 = r5.f1568b;
        if (f1565f.mo732f(r5, r02) == false) goto L10;
        C0301H r52 = null;
    L13:
        if (r02 == null) goto L15;
        C0301H r22 = r02.f1015a;
        r02.f1015a = r52;
        r52 = r02;
        r02 = r22;
    L15:
        if (r52 == null) goto L16;
        r52 = r52.f1015a;
        throw null;     // Catch: RuntimeException -> L19
    L19:
        e = move-exception;
        f1564e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", e);
        goto L15
    }

    /* JADX INFO: renamed from: c */
    public static Object m924c(Object r2) {
        if ((r2 instanceof C0215F) == false) goto L5;
        Throwable r22 = ((C0215F) r2).f634a;
        CancellationException r0 = new CancellationException("Task was cancelled.");
        r0.initCause(r22);
        throw r0;
    L5:
        if ((r2 instanceof AbstractC0258G) == true) goto L11;
        if (r2 != f1566g) goto L14;
        return null;
    L14:
        return r2;
    L11:
        throw new ExecutionException(null);
    }

    /* JADX INFO: renamed from: d */
    public static Object m925d(AbstractFutureC0473L r1) {
        boolean r0 = false;
    L12:
        Object r12 = r1.get();     // Catch: Throwable -> L7 InterruptedException -> L11
    L4:
        if (r0 == false) goto L6;
        Thread.currentThread().interrupt();
    L6:
        return r12;
    L11:
        r0 = true;
    L7:
        th = move-exception;
        if (r0 == false) goto L10;
        Thread.currentThread().interrupt();
    L10:
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public final void m926a(StringBuilder r4) {
        Object r1 = m925d(this);     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        r4.append("SUCCESS, result=[");     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        if (r1 != this) goto L6;
        String r12 = "this future";
    L7:
        r4.append(r12);     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        r4.append("]");     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        return;
    L6:
        r12 = String.valueOf(r1);     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
    L14:
        r4.append("CANCELLED");
        return;
    L9:
        e = move-exception;
        r4.append("UNKNOWN, cause=[");
        r4.append(e.getClass());
        r4.append(" thrown from get()]");
        return;
    L11:
        e = move-exception;
        r4.append("FAILURE, cause=[");
        r4.append(e.getCause());
        r4.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r5) {
        Object r0 = this.f1567a;
        if (r0 == null) goto L5;
        return false;
    L5:
        if (f1563d == false) goto L7;
        C0215F r1 = new C0215F(new CancellationException("Future.cancel() was called."), r5);
    L11:
        if (f1565f.mo733g(this, r0, r1) == false) goto L16;
        m923b(this);
        return true;
    L16:
        return false;
    L7:
        if (r5 == false) goto L9;
        r1 = C0215F.f632b;
        goto L11
    L9:
        r1 = C0215F.f633c;
        goto L11
    }

    /* JADX INFO: renamed from: e */
    public final void m927e(C0430K r5) {
        r5.f1416a = null;
    L3:
        C0430K r52 = this.f1569c;
        if (r52 == C0430K.f1415c) goto L19;
        C0430K r1 = null;
    L7:
        if (r52 == null) goto L28;
        C0430K r2 = r52.f1417b;
        if (r52.f1416a == null) goto L11;
        r1 = r52;
    L18:
        r52 = r2;
        goto L7
    L11:
        if (r1 == null) goto L16;
        r1.f1417b = r2;
        if (r1.f1416a != null) goto L18;
    L16:
        if (f1565f.mo734h(this, r52, r2) == true) goto L18;
    L28:
        return;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r18, TimeUnit r20) {
        C0430K r4 = C0430K.f1415c;
        long r5 = r20.toNanos(r18);
        if (Thread.interrupted() == true) goto L69;
        Object r7 = this.f1567a;
        if (r7 == null) goto L9;
        return m924c(r7);
    L9:
        if (r5 <= 0) goto L11;
        long r9 = System.nanoTime() + r5;
    L13:
        if (r5 < 1000) goto L35;
        C0430K r13 = this.f1569c;
        if (r13 == r4) goto L33;
        C0430K r14 = new C0430K();
    L17:
        AbstractC0628Oj r15 = f1565f;
        r15.mo730O(r14, r13);
        if (r15.mo734h(this, r13, r14) == true) goto L19;
        r13 = this.f1569c;
        if (r13 != r4) goto L17;
    L19:
        LockSupport.parkNanos(this, r5);
        if (Thread.interrupted() == true) goto L28;
        Object r42 = this.f1567a;
        if (r42 != null) goto L24;
        r5 = r9 - System.nanoTime();
        if (r5 >= 1000) goto L19;
        m927e(r14);
        goto L35
    L24:
        return m924c(r42);
    L28:
        m927e(r14);
        throw new InterruptedException();
    L33:
        return m924c(this.f1567a);
    L35:
        if (r5 <= 0) goto L45;
        Object r43 = this.f1567a;
        if (r43 != null) goto L39;
        if (Thread.interrupted() == true) goto L44;
        r5 = r9 - System.nanoTime();
        goto L35
    L44:
        throw new InterruptedException();
    L39:
        return m924c(r43);
    L45:
        String r44 = toString();
        String r92 = r20.toString();
        Locale r10 = Locale.ROOT;
        String r93 = r92.toLowerCase(r10);
        String r2 = "Waited " + r18 + " " + r20.toString().toLowerCase(r10);
        if ((r5 + 1000) >= 0) goto L63;
        String r22 = AbstractC0213Ey.m407e(r2, " (plus ");
        long r52 = -r5;
        long r132 = r20.convert(r52, TimeUnit.NANOSECONDS);
        long r53 = r52 - r20.toNanos(r132);
        if (r132 != 0) goto L50;
    L53:
        boolean r72 = true;
    L54:
        if (r132 <= 0) goto L59;
        String r23 = r22 + r132 + " " + r93;
        if (r72 == false) goto L58;
        r23 = AbstractC0213Ey.m407e(r23, ",");
    L58:
        r22 = AbstractC0213Ey.m407e(r23, " ");
    L59:
        if (r72 == false) goto L61;
        r22 = r22 + r53 + " nanoseconds ";
    L61:
        r2 = AbstractC0213Ey.m407e(r22, "delay)");
        goto L63
    L50:
        if (r53 > 1000) goto L53;
        r72 = false;
    L63:
        if (isDone() == false) goto L67;
        throw new TimeoutException(AbstractC0213Ey.m407e(r2, " but future completed as timeout expired"));
    L67:
        throw new TimeoutException(r2 + " for " + r44);
    L11:
        r9 = 0;
        goto L13
    L69:
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1567a instanceof C0215F;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f1567a == null) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r0.append("[status=");
        if ((this.f1567a instanceof C0215F) == false) goto L6;
        r0.append("CANCELLED");
    L23:
        r0.append("]");
        return r0.toString();
    L6:
        if (isDone() == false) goto L25;
        m926a(r0);
        goto L23
    L25:
    L13:
        e = move-exception;
        String r1 = "Exception thrown from implementation: " + e.getClass();
    L15:
        if (r1 == null) goto L20;
        if (r1.isEmpty() == true) goto L20;
        r0.append("PENDING, info=[");
        r0.append(r1);
        r0.append("]");
    L20:
        if (isDone() == false) goto L22;
        m926a(r0);
        goto L23
    L22:
        r0.append("PENDING");
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
        C0430K r0 = C0430K.f1415c;
        if (Thread.interrupted() == true) goto L26;
        Object r1 = this.f1567a;
        if (r1 != null) goto L7;
        C0430K r12 = this.f1569c;
        if (r12 == r0) goto L24;
        C0430K r2 = new C0430K();
    L11:
        AbstractC0628Oj r3 = f1565f;
        r3.mo730O(r2, r12);
        if (r3.mo734h(this, r12, r2) == true) goto L13;
        r12 = this.f1569c;
        if (r12 != r0) goto L11;
    L13:
        LockSupport.park(this);
        if (Thread.interrupted() == true) goto L19;
        Object r02 = this.f1567a;
        if (r02 == null) goto L13;
        return m924c(r02);
    L19:
        m927e(r2);
        throw new InterruptedException();
    L24:
        return m924c(this.f1567a);
    L7:
        return m924c(r1);
    L26:
        throw new InterruptedException();
    }
}
