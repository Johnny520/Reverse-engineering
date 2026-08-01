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

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements Future {
    public static final boolean d = false;
    public static final Logger e = null;
    public static final ff f = null;
    public static final Object g = null;
    public volatile Object a;
    public volatile p b;
    public volatile s c;

    static {
        d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        e = Logger.getLogger(t.class.getName());
        ff r5 = new q(AtomicReferenceFieldUpdater.newUpdater(s.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(s.class, s.class, "b"), AtomicReferenceFieldUpdater.newUpdater(t.class, s.class, "c"), AtomicReferenceFieldUpdater.newUpdater(t.class, p.class, "b"), AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "a"));     // Catch: Throwable -> L5
        th = null;
    L7:
        f = r5;
        if (th == null) goto L10;
        e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
    L10:
        g = new Object();
        return;
    L5:
        th = th;
        r5 = new r();
        goto L7
    }

    public static void b(t r5) {
    L2:
        s r0 = r5.c;
        if (f.g(r5, r0, s.c) == false) goto L2;
    L5:
        if (r0 == null) goto L10;
        Thread r2 = r0.a;
        if (r2 == null) goto L9;
        r0.a = null;
        LockSupport.unpark(r2);
    L9:
        r0 = r0.b;
    L10:
        p r02 = r5.b;
        if (f.e(r5, r02) == false) goto L10;
        p r52 = null;
    L13:
        if (r02 == null) goto L15;
        p r22 = r02.a;
        r02.a = r52;
        r52 = r02;
        r02 = r22;
    L15:
        if (r52 == null) goto L16;
        r52 = r52.a;
        throw null;     // Catch: RuntimeException -> L19
    L19:
        e = move-exception;
        e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", e);
        goto L15
    }

    public static Object c(Object r2) {
        if ((r2 instanceof n) == false) goto L5;
        Throwable r22 = ((n) r2).a;
        CancellationException r0 = new CancellationException("Task was cancelled.");
        r0.initCause(r22);
        throw r0;
    L5:
        if ((r2 instanceof o) == true) goto L11;
        if (r2 != g) goto L14;
        return null;
    L14:
        return r2;
    L11:
        throw new ExecutionException(null);
    }

    public static Object d(t r1) {
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

    public final void a(StringBuilder r4) {
        Object r1 = d(this);     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
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
        Object r0 = this.a;
        if (r0 == null) goto L5;
        return false;
    L5:
        if (d == false) goto L7;
        n r1 = new n(new CancellationException("Future.cancel() was called."), r5);
    L11:
        if (f.f(this, r0, r1) == false) goto L16;
        b(this);
        return true;
    L16:
        return false;
    L7:
        if (r5 == false) goto L9;
        r1 = n.b;
        goto L11
    L9:
        r1 = n.c;
        goto L11
    }

    public final void e(s r5) {
        r5.a = null;
    L3:
        s r52 = this.c;
        if (r52 == s.c) goto L19;
        s r1 = null;
    L7:
        if (r52 == null) goto L28;
        s r2 = r52.b;
        if (r52.a == null) goto L11;
        r1 = r52;
    L18:
        r52 = r2;
        goto L7
    L11:
        if (r1 == null) goto L16;
        r1.b = r2;
        if (r1.a != null) goto L18;
    L16:
        if (f.g(this, r52, r2) == true) goto L18;
    L28:
        return;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r18, TimeUnit r20) {
        s r4 = s.c;
        long r5 = r20.toNanos(r18);
        if (Thread.interrupted() == true) goto L69;
        Object r7 = this.a;
        if (r7 == null) goto L9;
        return c(r7);
    L9:
        if (r5 <= 0) goto L11;
        long r9 = System.nanoTime() + r5;
    L13:
        if (r5 < 1000) goto L35;
        s r13 = this.c;
        if (r13 == r4) goto L33;
        s r14 = new s();
    L17:
        ff r15 = f;
        r15.F(r14, r13);
        if (r15.g(this, r13, r14) == true) goto L19;
        r13 = this.c;
        if (r13 != r4) goto L17;
    L19:
        LockSupport.parkNanos(this, r5);
        if (Thread.interrupted() == true) goto L28;
        Object r42 = this.a;
        if (r42 != null) goto L24;
        r5 = r9 - System.nanoTime();
        if (r5 >= 1000) goto L19;
        e(r14);
        goto L35
    L24:
        return c(r42);
    L28:
        e(r14);
        throw new InterruptedException();
    L33:
        return c(this.a);
    L35:
        if (r5 <= 0) goto L45;
        Object r43 = this.a;
        if (r43 != null) goto L39;
        if (Thread.interrupted() == true) goto L44;
        r5 = r9 - System.nanoTime();
        goto L35
    L44:
        throw new InterruptedException();
    L39:
        return c(r43);
    L45:
        String r44 = toString();
        String r92 = r20.toString();
        Locale r10 = Locale.ROOT;
        String r93 = r92.toLowerCase(r10);
        String r2 = "Waited " + r18 + " " + r20.toString().toLowerCase(r10);
        if ((r5 + 1000) >= 0) goto L63;
        String r22 = z30.i(r2, " (plus ");
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
        r23 = z30.i(r23, ",");
    L58:
        r22 = z30.i(r23, " ");
    L59:
        if (r72 == false) goto L61;
        r22 = r22 + r53 + " nanoseconds ";
    L61:
        r2 = z30.i(r22, "delay)");
        goto L63
    L50:
        if (r53 > 1000) goto L53;
        r72 = false;
    L63:
        if (isDone() == false) goto L67;
        throw new TimeoutException(z30.i(r2, " but future completed as timeout expired"));
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
        return this.a instanceof n;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.a == null) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r0.append("[status=");
        if ((this.a instanceof n) == false) goto L6;
        r0.append("CANCELLED");
    L23:
        r0.append("]");
        return r0.toString();
    L6:
        if (isDone() == false) goto L25;
        a(r0);
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
        a(r0);
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
        s r0 = s.c;
        if (Thread.interrupted() == true) goto L26;
        Object r1 = this.a;
        if (r1 != null) goto L7;
        s r12 = this.c;
        if (r12 == r0) goto L24;
        s r2 = new s();
    L11:
        ff r3 = f;
        r3.F(r2, r12);
        if (r3.g(this, r12, r2) == true) goto L13;
        r12 = this.c;
        if (r12 != r0) goto L11;
    L13:
        LockSupport.park(this);
        if (Thread.interrupted() == true) goto L19;
        Object r02 = this.a;
        if (r02 == null) goto L13;
        return c(r02);
    L19:
        e(r2);
        throw new InterruptedException();
    L24:
        return c(this.a);
    L7:
        return c(r1);
    L26:
        throw new InterruptedException();
    }
}
