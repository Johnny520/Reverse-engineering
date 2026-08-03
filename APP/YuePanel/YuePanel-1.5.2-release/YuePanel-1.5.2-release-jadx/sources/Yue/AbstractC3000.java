package Yue;

import Yue.InterfaceC7144;
import com.google.common.util.concurrent.ListenableFuture;
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

/* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC3000<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final boolean f4348 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Logger f4349 = Logger.getLogger(AbstractC3000.class.getName());

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final long f4350 = 1000;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final AbstractC0023 f4351;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final Object f4352;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6490
    public volatile Object f4353;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6490
    public volatile C3003 f4354;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6490
    public volatile C3007 f4355;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۠$ۥ۟ */
    public static abstract class AbstractC0023 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC0023() {
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract boolean mo70(AbstractC3000<?> abstractC3000, C3003 c3003, C3003 c30032);

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract boolean mo71(AbstractC3000<?> abstractC3000, Object obj, Object obj2);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public abstract boolean mo5838(AbstractC3000<?> abstractC3000, C3007 c3007, C3007 c30072);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public abstract void mo5839(C3007 c3007, C3007 c30072);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public abstract void mo5840(C3007 c3007, Thread thread);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۠$ۥ۟۟, reason: contains not printable characters */
    public static final class C3001 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final C3001 f4356;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final C3001 f4357;

        /* JADX INFO: renamed from: ۥ */
        public final boolean f26;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public final Throwable f27;

        static {
            if (AbstractC3000.f4348) {
                f4357 = null;
                f4356 = null;
            } else {
                f4357 = new C3001(false, null);
                f4356 = new C3001(true, null);
            }
        }

        public C3001(boolean z, @InterfaceC6490 Throwable th) {
            this.f26 = z;
            this.f27 = th;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۠$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C3002 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static final C3002 f28 = new C3002(new C0024("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: ۥ */
        public final Throwable f29;

        /* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۠$ۥ۟۟۟$ۥ */
        public class C0024 extends Throwable {
            public C0024(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C3002(Throwable th) {
            this.f29 = (Throwable) AbstractC3000.m5821(th);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C3003 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final C3003 f4358 = new C3003(null, null);

        /* JADX INFO: renamed from: ۥ */
        public final Runnable f30;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Executor f31;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public C3003 f4359;

        public C3003(Runnable runnable, Executor executor) {
            this.f30 = runnable;
            this.f31 = executor;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C3004 extends AbstractC0023 {

        /* JADX INFO: renamed from: ۥ */
        public final AtomicReferenceFieldUpdater<C3007, Thread> f32;

        /* JADX INFO: renamed from: ۥ۟ */
        public final AtomicReferenceFieldUpdater<C3007, C3007> f33;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final AtomicReferenceFieldUpdater<AbstractC3000, C3007> f4360;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final AtomicReferenceFieldUpdater<AbstractC3000, C3003> f4361;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final AtomicReferenceFieldUpdater<AbstractC3000, Object> f4362;

        public C3004(AtomicReferenceFieldUpdater<C3007, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C3007, C3007> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC3000, C3007> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC3000, C3003> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC3000, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f32 = atomicReferenceFieldUpdater;
            this.f33 = atomicReferenceFieldUpdater2;
            this.f4360 = atomicReferenceFieldUpdater3;
            this.f4361 = atomicReferenceFieldUpdater4;
            this.f4362 = atomicReferenceFieldUpdater5;
        }

        @Override // Yue.AbstractC3000.AbstractC0023
        /* JADX INFO: renamed from: ۥ */
        public boolean mo70(AbstractC3000<?> abstractC3000, C3003 c3003, C3003 c30032) {
            return C3008.m74(this.f4361, abstractC3000, c3003, c30032);
        }

        @Override // Yue.AbstractC3000.AbstractC0023
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo71(AbstractC3000<?> abstractC3000, Object obj, Object obj2) {
            return C3008.m74(this.f4362, abstractC3000, obj, obj2);
        }

        @Override // Yue.AbstractC3000.AbstractC0023
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo5838(AbstractC3000<?> abstractC3000, C3007 c3007, C3007 c30072) {
            return C3008.m74(this.f4360, abstractC3000, c3007, c30072);
        }

        @Override // Yue.AbstractC3000.AbstractC0023
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo5839(C3007 c3007, C3007 c30072) {
            this.f33.lazySet(c3007, c30072);
        }

        @Override // Yue.AbstractC3000.AbstractC0023
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo5840(C3007 c3007, Thread thread) {
            this.f32.lazySet(c3007, thread);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class RunnableC3005<V> implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final AbstractC3000<V> f4363;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final ListenableFuture<? extends V> f4364;

        public RunnableC3005(AbstractC3000<V> abstractC3000, ListenableFuture<? extends V> listenableFuture) {
            this.f4363 = abstractC3000;
            this.f4364 = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4363.f4353 != this) {
                return;
            }
            if (AbstractC3000.f4351.mo71(this.f4363, this, AbstractC3000.m5824(this.f4364))) {
                AbstractC3000.m5822(this.f4363);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C3006 extends AbstractC0023 {
        public C3006() {
            super();
        }

        @Override // Yue.AbstractC3000.AbstractC0023
        /* JADX INFO: renamed from: ۥ */
        public boolean mo70(AbstractC3000<?> abstractC3000, C3003 c3003, C3003 c30032) {
            synchronized (abstractC3000) {
                try {
                    if (abstractC3000.f4354 != c3003) {
                        return false;
                    }
                    abstractC3000.f4354 = c30032;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Yue.AbstractC3000.AbstractC0023
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo71(AbstractC3000<?> abstractC3000, Object obj, Object obj2) {
            synchronized (abstractC3000) {
                try {
                    if (abstractC3000.f4353 != obj) {
                        return false;
                    }
                    abstractC3000.f4353 = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Yue.AbstractC3000.AbstractC0023
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo5838(AbstractC3000<?> abstractC3000, C3007 c3007, C3007 c30072) {
            synchronized (abstractC3000) {
                try {
                    if (abstractC3000.f4355 != c3007) {
                        return false;
                    }
                    abstractC3000.f4355 = c30072;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Yue.AbstractC3000.AbstractC0023
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo5839(C3007 c3007, C3007 c30072) {
            c3007.f35 = c30072;
        }

        @Override // Yue.AbstractC3000.AbstractC0023
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo5840(C3007 c3007, Thread thread) {
            c3007.f34 = thread;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۠$ۥۣ۟۟۟, reason: contains not printable characters */
    public static final class C3007 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final C3007 f4365 = new C3007(false);

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6490
        public volatile Thread f34;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public volatile C3007 f35;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3007(boolean z) {
        }

        /* JADX INFO: renamed from: ۥ */
        public void m72(C3007 c3007) {
            AbstractC3000.f4351.mo5839(this, c3007);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m73() {
            Thread thread = this.f34;
            if (thread != null) {
                this.f34 = null;
                LockSupport.unpark(thread);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C3007() {
            AbstractC3000.f4351.mo5840(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0023 c3006;
        try {
            c3006 = new C3004(AtomicReferenceFieldUpdater.newUpdater(C3007.class, Thread.class, "ۥ"), AtomicReferenceFieldUpdater.newUpdater(C3007.class, C3007.class, "ۥ۟"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3000.class, C3007.class, "ۥ۟۟۠ۥ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3000.class, C3003.class, "ۥ۟۟۠ۤ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3000.class, Object.class, "ۥۣ۟۟۠"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c3006 = new C3006();
        }
        f4351 = c3006;
        if (th != null) {
            f4349.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4352 = new Object();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static CancellationException m5820(@InterfaceC6490 String str, @InterfaceC6490 Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T> T m5821(@InterfaceC6490 T t) {
        t.getClass();
        return t;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m5822(AbstractC3000<?> abstractC3000) {
        C3003 c3003 = null;
        while (true) {
            abstractC3000.m5831();
            abstractC3000.m69();
            C3003 c3003M5826 = abstractC3000.m5826(c3003);
            while (c3003M5826 != null) {
                c3003 = c3003M5826.f4359;
                Runnable runnable = c3003M5826.f30;
                if (runnable instanceof RunnableC3005) {
                    RunnableC3005 runnableC3005 = (RunnableC3005) runnable;
                    abstractC3000 = runnableC3005.f4363;
                    if (abstractC3000.f4353 == runnableC3005) {
                        if (f4351.mo71(abstractC3000, runnableC3005, m5824(runnableC3005.f4364))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m5823(runnable, c3003M5826.f31);
                }
                c3003M5826 = c3003;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m5823(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f4349.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Object m5824(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof AbstractC3000) {
            Object obj = ((AbstractC3000) listenableFuture).f4353;
            if (!(obj instanceof C3001)) {
                return obj;
            }
            C3001 c3001 = (C3001) obj;
            return c3001.f26 ? c3001.f27 != null ? new C3001(false, c3001.f27) : C3001.f4357 : obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!f4348) && zIsCancelled) {
            return C3001.f4357;
        }
        try {
            Object objM5825 = m5825(listenableFuture);
            return objM5825 == null ? f4352 : objM5825;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new C3001(false, e);
            }
            return new C3002(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
        } catch (ExecutionException e2) {
            return new C3002(e2.getCause());
        } catch (Throwable th) {
            return new C3002(th);
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static <V> V m5825(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
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
        return v;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        m5821(runnable);
        m5821(executor);
        C3003 c3003 = this.f4354;
        if (c3003 != C3003.f4358) {
            C3003 c30032 = new C3003(runnable, executor);
            do {
                c30032.f4359 = c3003;
                if (f4351.mo70(this, c3003, c30032)) {
                    return;
                } else {
                    c3003 = this.f4354;
                }
            } while (c3003 != C3003.f4358);
        }
        m5823(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f4353;
        if (!(obj == null) && !(obj instanceof RunnableC3005)) {
            return false;
        }
        C3001 c3001 = f4348 ? new C3001(z, new CancellationException("Future.cancel() was called.")) : z ? C3001.f4356 : C3001.f4357;
        AbstractC3000<V> abstractC3000 = this;
        boolean z2 = false;
        while (true) {
            if (f4351.mo71(abstractC3000, obj, c3001)) {
                if (z) {
                    abstractC3000.m5828();
                }
                m5822(abstractC3000);
                if (!(obj instanceof RunnableC3005)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((RunnableC3005) obj).f4364;
                if (!(listenableFuture instanceof AbstractC3000)) {
                    listenableFuture.cancel(z);
                    return true;
                }
                abstractC3000 = (AbstractC3000) listenableFuture;
                obj = abstractC3000.f4353;
                if (!(obj == null) && !(obj instanceof RunnableC3005)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC3000.f4353;
                if (!(obj instanceof RunnableC3005)) {
                    return z2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4353;
        if ((obj != null) && (!(obj instanceof RunnableC3005))) {
            return m5827(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C3007 c3007 = this.f4355;
            if (c3007 != C3007.f4365) {
                C3007 c30072 = new C3007();
                do {
                    c30072.m72(c3007);
                    if (f4351.mo5838(this, c3007, c30072)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m5832(c30072);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4353;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC3005))) {
                                return m5827(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m5832(c30072);
                    } else {
                        c3007 = this.f4355;
                    }
                } while (c3007 != C3007.f4365);
            }
            return m5827(this.f4353);
        }
        while (nanos > 0) {
            Object obj3 = this.f4353;
            if ((obj3 != null) && (!(obj3 instanceof RunnableC3005))) {
                return m5827(obj3);
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
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4353 instanceof C3001;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof RunnableC3005)) & (this.f4353 != null);
    }

    public String toString() {
        String strMo5830;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m68(sb);
        } else {
            try {
                strMo5830 = mo5830();
            } catch (RuntimeException e) {
                strMo5830 = "Exception thrown from implementation: " + e.getClass();
            }
            if (strMo5830 != null && !strMo5830.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo5830);
                sb.append("]");
            } else if (isDone()) {
                m68(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m68(StringBuilder sb) {
        try {
            Object objM5825 = m5825(this);
            sb.append("SUCCESS, result=[");
            sb.append(m5836(objM5825));
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

    /* JADX INFO: renamed from: ۥ۟ */
    public void m69() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C3003 m5826(C3003 c3003) {
        C3003 c30032;
        do {
            c30032 = this.f4354;
        } while (!f4351.mo70(this, c30032, C3003.f4358));
        C3003 c30033 = c3003;
        C3003 c30034 = c30032;
        while (c30034 != null) {
            C3003 c30035 = c30034.f4359;
            c30034.f4359 = c30033;
            c30033 = c30034;
            c30034 = c30035;
        }
        return c30033;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final V m5827(Object obj) throws ExecutionException {
        if (obj instanceof C3001) {
            throw m5820("Task was cancelled.", ((C3001) obj).f27);
        }
        if (obj instanceof C3002) {
            throw new ExecutionException(((C3002) obj).f29);
        }
        if (obj == f4352) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m5828() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m5829(@InterfaceC6490 Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m5837());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥ۟۟ۢ۠<V> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public String mo5830() {
        Object obj = this.f4353;
        if (obj instanceof RunnableC3005) {
            return "setFuture=[" + m5836(((RunnableC3005) obj).f4364) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m5831() {
        C3007 c3007;
        do {
            c3007 = this.f4355;
        } while (!f4351.mo5838(this, c3007, C3007.f4365));
        while (c3007 != null) {
            c3007.m73();
            c3007 = c3007.f35;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m5832(C3007 c3007) {
        c3007.f34 = null;
        while (true) {
            C3007 c30072 = this.f4355;
            if (c30072 == C3007.f4365) {
                return;
            }
            C3007 c30073 = null;
            while (c30072 != null) {
                C3007 c30074 = c30072.f35;
                if (c30072.f34 != null) {
                    c30073 = c30072;
                } else if (c30073 != null) {
                    c30073.f35 = c30074;
                    if (c30073.f34 == null) {
                        break;
                    }
                } else if (!f4351.mo5838(this, c30072, c30074)) {
                    break;
                }
                c30072 = c30074;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean mo5833(@InterfaceC6490 V v) {
        if (v == null) {
            v = (V) f4352;
        }
        if (!f4351.mo71(this, null, v)) {
            return false;
        }
        m5822(this);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean mo5834(Throwable th) {
        if (!f4351.mo71(this, null, new C3002((Throwable) m5821(th)))) {
            return false;
        }
        m5822(this);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean mo5835(ListenableFuture<? extends V> listenableFuture) {
        C3002 c3002;
        m5821(listenableFuture);
        Object obj = this.f4353;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f4351.mo71(this, null, m5824(listenableFuture))) {
                    return false;
                }
                m5822(this);
                return true;
            }
            RunnableC3005 runnableC3005 = new RunnableC3005(this, listenableFuture);
            if (f4351.mo71(this, null, runnableC3005)) {
                try {
                    listenableFuture.addListener(runnableC3005, EnumC4403.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c3002 = new C3002(th);
                    } catch (Throwable unused) {
                        c3002 = C3002.f28;
                    }
                    f4351.mo71(this, runnableC3005, c3002);
                }
                return true;
            }
            obj = this.f4353;
        }
        if (obj instanceof C3001) {
            listenableFuture.cancel(((C3001) obj).f26);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final String m5836(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m5837() {
        Object obj = this.f4353;
        return (obj instanceof C3001) && ((C3001) obj).f26;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4353;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC3005))) {
                return m5827(obj2);
            }
            C3007 c3007 = this.f4355;
            if (c3007 != C3007.f4365) {
                C3007 c30072 = new C3007();
                do {
                    c30072.m72(c3007);
                    if (f4351.mo5838(this, c3007, c30072)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4353;
                            } else {
                                m5832(c30072);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC3005))));
                        return m5827(obj);
                    }
                    c3007 = this.f4355;
                } while (c3007 != C3007.f4365);
            }
            return m5827(this.f4353);
        }
        throw new InterruptedException();
    }
}
