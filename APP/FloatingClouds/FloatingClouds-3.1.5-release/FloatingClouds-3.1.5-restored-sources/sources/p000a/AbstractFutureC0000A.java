package p000a;

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

/* JADX INFO: renamed from: a.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC0000A<V> implements Future {

    /* JADX INFO: renamed from: d */
    public static final boolean f0d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f1e = Logger.getLogger(AbstractFutureC0000A.class.getName());

    /* JADX INFO: renamed from: f */
    public static final a f2f;

    /* JADX INFO: renamed from: g */
    public static final Object f3g;

    /* JADX INFO: renamed from: a */
    public volatile Object f4a;

    /* JADX INFO: renamed from: b */
    public volatile d f5b;

    /* JADX INFO: renamed from: c */
    public volatile h f6c;

    /* JADX INFO: renamed from: a.A$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo6a(AbstractFutureC0000A abstractFutureC0000A, d dVar);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo7b(AbstractFutureC0000A<?> abstractFutureC0000A, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo8c(AbstractFutureC0000A<?> abstractFutureC0000A, h hVar, h hVar2);

        /* JADX INFO: renamed from: d */
        public abstract void mo9d(h hVar, h hVar2);

        /* JADX INFO: renamed from: e */
        public abstract void mo10e(h hVar, Thread thread);
    }

    /* JADX INFO: renamed from: a.A$b */
    public static final class b {

        /* JADX INFO: renamed from: b */
        public static final b f7b;

        /* JADX INFO: renamed from: c */
        public static final b f8c;

        /* JADX INFO: renamed from: a */
        public final CancellationException f9a;

        static {
            if (AbstractFutureC0000A.f0d) {
                f8c = null;
                f7b = null;
            } else {
                f8c = new b(false, null);
                f7b = new b(true, null);
            }
        }

        public b(boolean z, CancellationException cancellationException) {
            this.f9a = cancellationException;
        }
    }

    /* JADX INFO: renamed from: a.A$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final Throwable f10a;

        /* JADX INFO: renamed from: a.A$c$a */
        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new a("Failure occurred while trying to finish a future."));
        }

        public c(Throwable th) {
            boolean z = AbstractFutureC0000A.f0d;
            th.getClass();
            this.f10a = th;
        }
    }

    /* JADX INFO: renamed from: a.A$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f11b = new d();

        /* JADX INFO: renamed from: a */
        public d f12a;
    }

    /* JADX INFO: renamed from: a.A$e */
    public static final class e extends a {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<h, Thread> f13a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<h, h> f14b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFutureC0000A, h> f15c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFutureC0000A, d> f16d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFutureC0000A, Object> f17e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFutureC0000A, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFutureC0000A, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFutureC0000A, Object> atomicReferenceFieldUpdater5) {
            this.f13a = atomicReferenceFieldUpdater;
            this.f14b = atomicReferenceFieldUpdater2;
            this.f15c = atomicReferenceFieldUpdater3;
            this.f16d = atomicReferenceFieldUpdater4;
            this.f17e = atomicReferenceFieldUpdater5;
        }

        @Override // p000a.AbstractFutureC0000A.a
        /* JADX INFO: renamed from: a */
        public final boolean mo6a(AbstractFutureC0000A abstractFutureC0000A, d dVar) {
            AtomicReferenceFieldUpdater<AbstractFutureC0000A, d> atomicReferenceFieldUpdater;
            d dVar2 = d.f11b;
            do {
                atomicReferenceFieldUpdater = this.f16d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0000A, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFutureC0000A) == dVar);
            return false;
        }

        @Override // p000a.AbstractFutureC0000A.a
        /* JADX INFO: renamed from: b */
        public final boolean mo7b(AbstractFutureC0000A<?> abstractFutureC0000A, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractFutureC0000A, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f17e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0000A, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFutureC0000A) == obj);
            return false;
        }

        @Override // p000a.AbstractFutureC0000A.a
        /* JADX INFO: renamed from: c */
        public final boolean mo8c(AbstractFutureC0000A<?> abstractFutureC0000A, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<AbstractFutureC0000A, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f15c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0000A, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFutureC0000A) == hVar);
            return false;
        }

        @Override // p000a.AbstractFutureC0000A.a
        /* JADX INFO: renamed from: d */
        public final void mo9d(h hVar, h hVar2) {
            this.f14b.lazySet(hVar, hVar2);
        }

        @Override // p000a.AbstractFutureC0000A.a
        /* JADX INFO: renamed from: e */
        public final void mo10e(h hVar, Thread thread) {
            this.f13a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: renamed from: a.A$f */
    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: a.A$g */
    public static final class g extends a {
        @Override // p000a.AbstractFutureC0000A.a
        /* JADX INFO: renamed from: a */
        public final boolean mo6a(AbstractFutureC0000A abstractFutureC0000A, d dVar) {
            d dVar2 = d.f11b;
            synchronized (abstractFutureC0000A) {
                try {
                    if (abstractFutureC0000A.f5b != dVar) {
                        return false;
                    }
                    abstractFutureC0000A.f5b = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000a.AbstractFutureC0000A.a
        /* JADX INFO: renamed from: b */
        public final boolean mo7b(AbstractFutureC0000A<?> abstractFutureC0000A, Object obj, Object obj2) {
            synchronized (abstractFutureC0000A) {
                try {
                    if (abstractFutureC0000A.f4a != obj) {
                        return false;
                    }
                    abstractFutureC0000A.f4a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000a.AbstractFutureC0000A.a
        /* JADX INFO: renamed from: c */
        public final boolean mo8c(AbstractFutureC0000A<?> abstractFutureC0000A, h hVar, h hVar2) {
            synchronized (abstractFutureC0000A) {
                try {
                    if (abstractFutureC0000A.f6c != hVar) {
                        return false;
                    }
                    abstractFutureC0000A.f6c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000a.AbstractFutureC0000A.a
        /* JADX INFO: renamed from: d */
        public final void mo9d(h hVar, h hVar2) {
            hVar.f20b = hVar2;
        }

        @Override // p000a.AbstractFutureC0000A.a
        /* JADX INFO: renamed from: e */
        public final void mo10e(h hVar, Thread thread) {
            hVar.f19a = thread;
        }
    }

    /* JADX INFO: renamed from: a.A$h */
    public static final class h {

        /* JADX INFO: renamed from: c */
        public static final h f18c = new h();

        /* JADX INFO: renamed from: a */
        public volatile Thread f19a;

        /* JADX INFO: renamed from: b */
        public volatile h f20b;

        public h() {
            AbstractFutureC0000A.f2f.mo10e(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0000A.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0000A.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0000A.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f2f = gVar;
        if (th != null) {
            f1e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3g = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m0b(AbstractFutureC0000A<?> abstractFutureC0000A) {
        h hVar;
        d dVar;
        do {
            hVar = abstractFutureC0000A.f6c;
        } while (!f2f.mo8c(abstractFutureC0000A, hVar, h.f18c));
        while (hVar != null) {
            Thread thread = hVar.f19a;
            if (thread != null) {
                hVar.f19a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f20b;
        }
        do {
            dVar = abstractFutureC0000A.f5b;
        } while (!f2f.mo6a(abstractFutureC0000A, dVar));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f12a;
            dVar.f12a = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            dVar2 = dVar2.f12a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f1e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m1c(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f9a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f10a);
        }
        if (obj == f3g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m2d(AbstractFutureC0000A abstractFutureC0000A) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC0000A.get();
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
    public final void m3a(StringBuilder sb) {
        try {
            Object objM2d = m2d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM2d == this ? "this future" : String.valueOf(objM2d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f4a;
        if ((obj == null) | (obj instanceof f)) {
            b bVar = f0d ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.f7b : b.f8c;
            while (!f2f.mo7b(this, obj, bVar)) {
                obj = this.f4a;
                if (!(obj instanceof f)) {
                }
            }
            m0b(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.A<V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final String m4e() {
        Object obj = this.f4a;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb.append("null");
            sb.append("]");
            return sb.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: f */
    public final void m5f(h hVar) {
        hVar.f19a = null;
        while (true) {
            h hVar2 = this.f6c;
            if (hVar2 == h.f18c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f20b;
                if (hVar2.f19a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f20b = hVar4;
                    if (hVar3.f19a == null) {
                        break;
                    }
                } else if (!f2f.mo8c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4a;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) m1c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f6c;
            h hVar2 = h.f18c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                z = true;
                do {
                    a aVar = f2f;
                    aVar.mo9d(hVar3, hVar);
                    if (aVar.mo8c(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m5f(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) m1c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m5f(hVar3);
                    } else {
                        hVar = this.f6c;
                    }
                } while (hVar != hVar2);
            }
            return (V) m1c(this.f4a);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.f4a;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof f))) {
                return (V) m1c(obj3);
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
        String strM2226f = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM2226f2 = C0944z.m2226f(strM2226f, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strM2226f3 = strM2226f2 + jConvert + " " + lowerCase;
                if (z2) {
                    strM2226f3 = C0944z.m2226f(strM2226f3, ",");
                }
                strM2226f2 = C0944z.m2226f(strM2226f3, " ");
            }
            if (z2) {
                strM2226f2 = strM2226f2 + nanos2 + " nanoseconds ";
            }
            strM2226f = C0944z.m2226f(strM2226f2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(C0944z.m2226f(strM2226f, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM2226f + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f4a != null);
    }

    public final String toString() {
        String strM4e;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4a instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m3a(sb);
        } else {
            try {
                strM4e = m4e();
            } catch (RuntimeException e2) {
                strM4e = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strM4e != null && !strM4e.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM4e);
                sb.append("]");
            } else if (isDone()) {
                m3a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) m1c(obj2);
            }
            h hVar = this.f6c;
            h hVar2 = h.f18c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    a aVar = f2f;
                    aVar.mo9d(hVar3, hVar);
                    if (aVar.mo8c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4a;
                            } else {
                                m5f(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) m1c(obj);
                    }
                    hVar = this.f6c;
                } while (hVar != hVar2);
            }
            return (V) m1c(this.f4a);
        }
        throw new InterruptedException();
    }
}
