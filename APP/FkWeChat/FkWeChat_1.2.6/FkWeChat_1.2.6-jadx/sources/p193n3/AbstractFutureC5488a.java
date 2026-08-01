package p193n3;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: n3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC5488a implements Future {

    /* JADX INFO: renamed from: t */
    public static final boolean f16876t = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: u */
    public static final Logger f16877u = Logger.getLogger(AbstractFutureC5488a.class.getName());

    /* JADX INFO: renamed from: v */
    public static final b f16878v;

    /* JADX INFO: renamed from: w */
    public static final Object f16879w;

    /* JADX INFO: renamed from: q */
    public volatile Object f16880q;

    /* JADX INFO: renamed from: r */
    public volatile e f16881r;

    /* JADX INFO: renamed from: s */
    public volatile h f16882s;

    /* JADX INFO: renamed from: n3.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo22327a(AbstractFutureC5488a abstractFutureC5488a, e eVar, e eVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo22328b(AbstractFutureC5488a abstractFutureC5488a, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo22329c(AbstractFutureC5488a abstractFutureC5488a, h hVar, h hVar2);

        /* JADX INFO: renamed from: d */
        public abstract void mo22330d(h hVar, h hVar2);

        /* JADX INFO: renamed from: e */
        public abstract void mo22331e(h hVar, Thread thread);
    }

    /* JADX INFO: renamed from: n3.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: c */
        public static final c f16883c;

        /* JADX INFO: renamed from: d */
        public static final c f16884d;

        /* JADX INFO: renamed from: a */
        public final boolean f16885a;

        /* JADX INFO: renamed from: b */
        public final Throwable f16886b;

        static {
            if (AbstractFutureC5488a.f16876t) {
                f16884d = null;
                f16883c = null;
            } else {
                f16884d = new c(false, null);
                f16883c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th) {
            this.f16885a = z10;
            this.f16886b = th;
        }
    }

    /* JADX INFO: renamed from: n3.a$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final Throwable f16887a;
    }

    /* JADX INFO: renamed from: n3.a$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e {

        /* JADX INFO: renamed from: d */
        public static final e f16888d = new e(null, null);

        /* JADX INFO: renamed from: a */
        public final Runnable f16889a;

        /* JADX INFO: renamed from: b */
        public final Executor f16890b;

        /* JADX INFO: renamed from: c */
        public e f16891c;

        public e(Runnable runnable, Executor executor) {
            this.f16889a = runnable;
            this.f16890b = executor;
        }
    }

    /* JADX INFO: renamed from: n3.a$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater f16892a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater f16893b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater f16894c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater f16895d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater f16896e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f16892a = atomicReferenceFieldUpdater;
            this.f16893b = atomicReferenceFieldUpdater2;
            this.f16894c = atomicReferenceFieldUpdater3;
            this.f16895d = atomicReferenceFieldUpdater4;
            this.f16896e = atomicReferenceFieldUpdater5;
        }

        @Override // p193n3.AbstractFutureC5488a.b
        /* JADX INFO: renamed from: a */
        public boolean mo22327a(AbstractFutureC5488a abstractFutureC5488a, e eVar, e eVar2) {
            return AbstractC5489b.m22334a(this.f16895d, abstractFutureC5488a, eVar, eVar2);
        }

        @Override // p193n3.AbstractFutureC5488a.b
        /* JADX INFO: renamed from: b */
        public boolean mo22328b(AbstractFutureC5488a abstractFutureC5488a, Object obj, Object obj2) {
            return AbstractC5489b.m22334a(this.f16896e, abstractFutureC5488a, obj, obj2);
        }

        @Override // p193n3.AbstractFutureC5488a.b
        /* JADX INFO: renamed from: c */
        public boolean mo22329c(AbstractFutureC5488a abstractFutureC5488a, h hVar, h hVar2) {
            return AbstractC5489b.m22334a(this.f16894c, abstractFutureC5488a, hVar, hVar2);
        }

        @Override // p193n3.AbstractFutureC5488a.b
        /* JADX INFO: renamed from: d */
        public void mo22330d(h hVar, h hVar2) {
            this.f16893b.lazySet(hVar, hVar2);
        }

        @Override // p193n3.AbstractFutureC5488a.b
        /* JADX INFO: renamed from: e */
        public void mo22331e(h hVar, Thread thread) {
            this.f16892a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: renamed from: n3.a$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // p193n3.AbstractFutureC5488a.b
        /* JADX INFO: renamed from: a */
        public boolean mo22327a(AbstractFutureC5488a abstractFutureC5488a, e eVar, e eVar2) {
            synchronized (abstractFutureC5488a) {
                try {
                    if (abstractFutureC5488a.f16881r != eVar) {
                        return false;
                    }
                    abstractFutureC5488a.f16881r = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p193n3.AbstractFutureC5488a.b
        /* JADX INFO: renamed from: b */
        public boolean mo22328b(AbstractFutureC5488a abstractFutureC5488a, Object obj, Object obj2) {
            synchronized (abstractFutureC5488a) {
                try {
                    if (abstractFutureC5488a.f16880q != obj) {
                        return false;
                    }
                    abstractFutureC5488a.f16880q = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p193n3.AbstractFutureC5488a.b
        /* JADX INFO: renamed from: c */
        public boolean mo22329c(AbstractFutureC5488a abstractFutureC5488a, h hVar, h hVar2) {
            synchronized (abstractFutureC5488a) {
                try {
                    if (abstractFutureC5488a.f16882s != hVar) {
                        return false;
                    }
                    abstractFutureC5488a.f16882s = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p193n3.AbstractFutureC5488a.b
        /* JADX INFO: renamed from: d */
        public void mo22330d(h hVar, h hVar2) {
            hVar.f16899b = hVar2;
        }

        @Override // p193n3.AbstractFutureC5488a.b
        /* JADX INFO: renamed from: e */
        public void mo22331e(h hVar, Thread thread) {
            hVar.f16898a = thread;
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC5488a.class, h.class, "s"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC5488a.class, e.class, "r"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC5488a.class, Object.class, "q"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f16878v = gVar;
        if (th != null) {
            f16877u.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f16879w = new Object();
    }

    /* JADX INFO: renamed from: c */
    public static CancellationException m22313c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: e */
    public static void m22314e(AbstractFutureC5488a abstractFutureC5488a) {
        abstractFutureC5488a.m22323k();
        abstractFutureC5488a.m22318b();
        e eVarM22319d = abstractFutureC5488a.m22319d(null);
        while (eVarM22319d != null) {
            e eVar = eVarM22319d.f16891c;
            m22315f(eVarM22319d.f16889a, eVarM22319d.f16890b);
            eVarM22319d = eVar;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m22315f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f16877u.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Object m22316h(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m22317a(StringBuilder sb2) {
        try {
            Object objM22316h = m22316h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m22326n(objM22316h));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f16880q;
        if (obj == null) {
            if (f16878v.mo22328b(this, obj, f16876t ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f16883c : c.f16884d)) {
                if (z10) {
                    m22321i();
                }
                m22314e(this);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final e m22319d(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f16881r;
        } while (!f16878v.mo22327a(this, eVar2, e.f16888d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f16891c;
            eVar4.f16891c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX INFO: renamed from: g */
    public final Object m22320g(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m22313c("Task was cancelled.", ((c) obj).f16886b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f16887a);
        }
        if (obj == f16879w) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f16880q;
        if (obj != null) {
            return m22320g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f16882s;
            if (hVar != h.f16897c) {
                h hVar2 = new h();
                do {
                    hVar2.m22332a(hVar);
                    if (f16878v.mo22329c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m22324l(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f16880q;
                            if (obj2 != null) {
                                return m22320g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m22324l(hVar2);
                    } else {
                        hVar = this.f16882s;
                    }
                } while (hVar != h.f16897c);
            }
            return m22320g(this.f16880q);
        }
        while (nanos > 0) {
            Object obj3 = this.f16880q;
            if (obj3 != null) {
                return m22320g(obj3);
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
        String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z10) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z10) {
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
        return this.f16880q instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16880q != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public String m22322j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: k */
    public final void m22323k() {
        h hVar;
        do {
            hVar = this.f16882s;
        } while (!f16878v.mo22329c(this, hVar, h.f16897c));
        while (hVar != null) {
            hVar.m22333b();
            hVar = hVar.f16899b;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m22324l(h hVar) {
        hVar.f16898a = null;
        while (true) {
            h hVar2 = this.f16882s;
            if (hVar2 == h.f16897c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f16899b;
                if (hVar2.f16898a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f16899b = hVar4;
                    if (hVar3.f16898a == null) {
                        break;
                    }
                } else if (!f16878v.mo22329c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean mo22325m(Object obj) {
        if (obj == null) {
            obj = f16879w;
        }
        if (!f16878v.mo22328b(this, null, obj)) {
            return false;
        }
        m22314e(this);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final String m22326n(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public String toString() {
        String strM22322j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m22317a(sb2);
        } else {
            try {
                strM22322j = m22322j();
            } catch (RuntimeException e10) {
                strM22322j = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM22322j != null && !strM22322j.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strM22322j);
                sb2.append("]");
            } else if (isDone()) {
                m22317a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: n3.a$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class h {

        /* JADX INFO: renamed from: c */
        public static final h f16897c = new h(false);

        /* JADX INFO: renamed from: a */
        public volatile Thread f16898a;

        /* JADX INFO: renamed from: b */
        public volatile h f16899b;

        public h() {
            AbstractFutureC5488a.f16878v.mo22331e(this, Thread.currentThread());
        }

        /* JADX INFO: renamed from: a */
        public void m22332a(h hVar) {
            AbstractFutureC5488a.f16878v.mo22330d(this, hVar);
        }

        /* JADX INFO: renamed from: b */
        public void m22333b() {
            Thread thread = this.f16898a;
            if (thread != null) {
                this.f16898a = null;
                LockSupport.unpark(thread);
            }
        }

        public h(boolean z10) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m22318b() {
    }

    /* JADX INFO: renamed from: i */
    public void m22321i() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f16880q;
            if (obj2 != null) {
                return m22320g(obj2);
            }
            h hVar = this.f16882s;
            if (hVar != h.f16897c) {
                h hVar2 = new h();
                do {
                    hVar2.m22332a(hVar);
                    if (f16878v.mo22329c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f16880q;
                            } else {
                                m22324l(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return m22320g(obj);
                    }
                    hVar = this.f16882s;
                } while (hVar != h.f16897c);
            }
            return m22320g(this.f16880q);
        }
        throw new InterruptedException();
    }
}
