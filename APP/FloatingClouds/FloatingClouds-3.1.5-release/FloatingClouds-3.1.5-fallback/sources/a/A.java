package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class A<V> implements java.util.concurrent.Future {
    public static final boolean d = false;
    public static final java.util.logging.Logger e = null;
    public static final a.A.a f = null;
    public static final java.lang.Object g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f0a;
    public volatile a.A.d b;
    public volatile a.A.h c;

    public static abstract class a {
        public abstract boolean a(a.A r1, a.A.d r2);

        public abstract boolean b(a.A<?> r1, java.lang.Object r2, java.lang.Object r3);

        public abstract boolean c(a.A<?> r1, a.A.h r2, a.A.h r3);

        public abstract void d(a.A.h r1, a.A.h r2);

        public abstract void e(a.A.h r1, java.lang.Thread r2);
    }

    public static final class b {
        public static final a.A.b b = null;
        public static final a.A.b c = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.concurrent.CancellationException f1a;

        static {
                boolean r0 = a.A.d
                r1 = 0
                if (r0 == 0) goto La
                a.A.b.c = r1
                a.A.b.b = r1
                return
            La:
                a.A$b r0 = new a.A$b
                r2 = 0
                r0.<init>(r2, r1)
                a.A.b.c = r0
                a.A$b r0 = new a.A$b
                r2 = 1
                r0.<init>(r2, r1)
                a.A.b.b = r0
                return
        }

        public b(boolean r1, java.util.concurrent.CancellationException r2) {
                r0 = this;
                r0.<init>()
                r0.f1a = r2
                return
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Throwable f2a;

        public class a extends java.lang.Throwable {
            @Override // java.lang.Throwable
            public final synchronized java.lang.Throwable fillInStackTrace() {
                    r0 = this;
                    monitor-enter(r0)
                    monitor-exit(r0)
                    return r0
            }
        }

        static {
                a.A$c r0 = new a.A$c
                a.A$c$a r1 = new a.A$c$a
                java.lang.String r2 = "Failure occurred while trying to finish a future."
                r1.<init>(r2)
                r0.<init>(r1)
                return
        }

        public c(java.lang.Throwable r2) {
                r1 = this;
                r1.<init>()
                boolean r0 = a.A.d
                r2.getClass()
                r1.f2a = r2
                return
        }
    }

    public static final class d {
        public static final a.A.d b = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.A.d f3a;

        static {
                a.A$d r0 = new a.A$d
                r0.<init>()
                a.A.d.b = r0
                return
        }

        public d() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class e extends a.A.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A.h, java.lang.Thread> f4a;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A.h, a.A.h> b;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A, a.A.h> c;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A, a.A.d> d;
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A, java.lang.Object> e;

        public e(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A.h, java.lang.Thread> r1, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A.h, a.A.h> r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A, a.A.h> r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A, a.A.d> r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A, java.lang.Object> r5) {
                r0 = this;
                r0.<init>()
                r0.f4a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                return
        }

        @Override // a.A.a
        public final boolean a(a.A r4, a.A.d r5) {
                r3 = this;
                a.A$d r0 = a.A.d.b
            L2:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A, a.A$d> r1 = r3.d
                boolean r2 = r1.compareAndSet(r4, r5, r0)
                if (r2 == 0) goto Lc
                r4 = 1
                return r4
            Lc:
                java.lang.Object r1 = r1.get(r4)
                if (r1 == r5) goto L2
                r4 = 0
                return r4
        }

        @Override // a.A.a
        public final boolean b(a.A<?> r3, java.lang.Object r4, java.lang.Object r5) {
                r2 = this;
            L0:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A, java.lang.Object> r0 = r2.e
                boolean r1 = r0.compareAndSet(r3, r4, r5)
                if (r1 == 0) goto La
                r3 = 1
                return r3
            La:
                java.lang.Object r0 = r0.get(r3)
                if (r0 == r4) goto L0
                r3 = 0
                return r3
        }

        @Override // a.A.a
        public final boolean c(a.A<?> r3, a.A.h r4, a.A.h r5) {
                r2 = this;
            L0:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A, a.A$h> r0 = r2.c
                boolean r1 = r0.compareAndSet(r3, r4, r5)
                if (r1 == 0) goto La
                r3 = 1
                return r3
            La:
                java.lang.Object r0 = r0.get(r3)
                if (r0 == r4) goto L0
                r3 = 0
                return r3
        }

        @Override // a.A.a
        public final void d(a.A.h r2, a.A.h r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A$h, a.A$h> r0 = r1.b
                r0.lazySet(r2, r3)
                return
        }

        @Override // a.A.a
        public final void e(a.A.h r2, java.lang.Thread r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<a.A$h, java.lang.Thread> r0 = r1.f4a
                r0.lazySet(r2, r3)
                return
        }
    }

    public static final class f<V> implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                r0 = 0
                throw r0
        }
    }

    public static final class g extends a.A.a {
        @Override // a.A.a
        public final boolean a(a.A r3, a.A.d r4) {
                r2 = this;
                a.A$d r0 = a.A.d.b
                monitor-enter(r3)
                a.A$d r1 = r3.b     // Catch: java.lang.Throwable -> Lc
                if (r1 != r4) goto Le
                r3.b = r0     // Catch: java.lang.Throwable -> Lc
                r4 = 1
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
                return r4
            Lc:
                r4 = move-exception
                goto L11
            Le:
                r4 = 0
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
                return r4
            L11:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
                throw r4
        }

        @Override // a.A.a
        public final boolean b(a.A<?> r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                monitor-enter(r2)
                java.lang.Object r0 = r2.f0a     // Catch: java.lang.Throwable -> La
                if (r0 != r3) goto Lc
                r2.f0a = r4     // Catch: java.lang.Throwable -> La
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                return r3
            La:
                r3 = move-exception
                goto Lf
            Lc:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                return r3
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                throw r3
        }

        @Override // a.A.a
        public final boolean c(a.A<?> r2, a.A.h r3, a.A.h r4) {
                r1 = this;
                monitor-enter(r2)
                a.A$h r0 = r2.c     // Catch: java.lang.Throwable -> La
                if (r0 != r3) goto Lc
                r2.c = r4     // Catch: java.lang.Throwable -> La
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                return r3
            La:
                r3 = move-exception
                goto Lf
            Lc:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                return r3
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                throw r3
        }

        @Override // a.A.a
        public final void d(a.A.h r1, a.A.h r2) {
                r0 = this;
                r1.b = r2
                return
        }

        @Override // a.A.a
        public final void e(a.A.h r1, java.lang.Thread r2) {
                r0 = this;
                r1.f5a = r2
                return
        }
    }

    public static final class h {
        public static final a.A.h c = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile java.lang.Thread f5a;
        public volatile a.A.h b;

        static {
                a.A$h r0 = new a.A$h
                r0.<init>()
                a.A.h.c = r0
                return
        }

        public h() {
                r2 = this;
                r2.<init>()
                a.A$a r0 = a.A.f
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.e(r2, r1)
                return
        }
    }

    static {
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<a.A$h> r2 = a.A.h.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            a.A.d = r3
            java.lang.Class<a.A> r3 = a.A.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            a.A.e = r4
            a.A$e r5 = new a.A$e     // Catch: java.lang.Throwable -> L43
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r1)     // Catch: java.lang.Throwable -> L43
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r4)     // Catch: java.lang.Throwable -> L43
            java.lang.Class<a.A$d> r2 = a.A.d.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch: java.lang.Throwable -> L43
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch: java.lang.Throwable -> L43
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L43
            r0 = 0
            goto L49
        L43:
            r0 = move-exception
            a.A$g r5 = new a.A$g
            r5.<init>()
        L49:
            a.A.f = r5
            if (r0 == 0) goto L56
            java.util.logging.Logger r1 = a.A.e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L56:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.A.g = r0
            return
    }

    public A() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void b(a.A<?> r5) {
        L0:
            a.A$h r0 = r5.c
            a.A$a r1 = a.A.f
            a.A$h r2 = a.A.h.c
            boolean r1 = r1.c(r5, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Thread r2 = r0.f5a
            if (r2 == 0) goto L18
            r0.f5a = r1
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L18:
            a.A$h r0 = r0.b
            goto Lc
        L1b:
            a.A$d r0 = r5.b
            a.A$a r2 = a.A.f
            boolean r2 = r2.a(r5, r0)
            if (r2 == 0) goto L1b
            r5 = r1
        L26:
            if (r0 == 0) goto L2f
            a.A$d r2 = r0.f3a
            r0.f3a = r5
            r5 = r0
            r0 = r2
            goto L26
        L2f:
            if (r5 != 0) goto L32
            return
        L32:
            a.A$d r5 = r5.f3a
            throw r1     // Catch: java.lang.RuntimeException -> L35
        L35:
            r0 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "RuntimeException while executing runnable null with executor null"
            java.util.logging.Logger r4 = a.A.e
            r4.log(r2, r3, r0)
            goto L2f
    }

    public static java.lang.Object c(java.lang.Object r2) {
            boolean r0 = r2 instanceof a.A.b
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof a.A.c
            if (r0 != 0) goto Le
            java.lang.Object r0 = a.A.g
            if (r2 != r0) goto Ld
            r2 = 0
        Ld:
            return r2
        Le:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            a.A$c r2 = (a.A.c) r2
            java.lang.Throwable r2 = r2.f2a
            r0.<init>(r2)
            throw r0
        L18:
            a.A$b r2 = (a.A.b) r2
            java.util.concurrent.CancellationException r2 = r2.f1a
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Task was cancelled."
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
    }

    public static java.lang.Object d(a.A r1) {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    public final void a(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = d(r3)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            if (r1 != r3) goto L10
            java.lang.String r1 = "this future"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
        L14:
            r4.append(r1)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            return
        L1b:
            r0 = move-exception
            goto L1f
        L1d:
            r1 = move-exception
            goto L37
        L1f:
            java.lang.String r1 = "UNKNOWN, cause=["
            r4.append(r1)
            java.lang.Class r0 = r0.getClass()
            r4.append(r0)
            java.lang.String r0 = " thrown from get()]"
            r4.append(r0)
            goto L46
        L31:
            java.lang.String r0 = "CANCELLED"
            r4.append(r0)
            goto L46
        L37:
            java.lang.String r2 = "FAILURE, cause=["
            r4.append(r2)
            java.lang.Throwable r1 = r1.getCause()
            r4.append(r1)
            r4.append(r0)
        L46:
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r7) {
            r6 = this;
            java.lang.Object r0 = r6.f0a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof a.A.f
            r3 = r3 | r4
            if (r3 == 0) goto L43
            boolean r3 = a.A.d
            if (r3 == 0) goto L1f
            a.A$b r3 = new a.A$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r7, r4)
            goto L26
        L1f:
            if (r7 == 0) goto L24
            a.A$b r3 = a.A.b.b
            goto L26
        L24:
            a.A$b r3 = a.A.b.c
        L26:
            a.A$a r7 = a.A.f
            boolean r7 = r7.b(r6, r0, r3)
            if (r7 == 0) goto L3d
            b(r6)
            boolean r7 = r0 instanceof a.A.f
            if (r7 != 0) goto L36
            return r1
        L36:
            a.A$f r0 = (a.A.f) r0
            r0.getClass()
            r7 = 0
            throw r7
        L3d:
            java.lang.Object r0 = r6.f0a
            boolean r7 = r0 instanceof a.A.f
            if (r7 != 0) goto L26
        L43:
            return r2
    }

    public final java.lang.String e() {
            r3 = this;
            java.lang.Object r0 = r3.f0a
            boolean r1 = r0 instanceof a.A.f
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "setFuture=["
            r1.<init>(r2)
            a.A$f r0 = (a.A.f) r0
            r0.getClass()
            java.lang.String r0 = "null"
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L21:
            boolean r0 = r3 instanceof java.util.concurrent.ScheduledFuture
            if (r0 == 0) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "remaining delay=["
            r0.<init>(r1)
            r1 = r3
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1.getDelay(r2)
            r0.append(r1)
            java.lang.String r1 = " ms]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L42:
            r0 = 0
            return r0
    }

    public final void f(a.A.h r5) {
            r4 = this;
            r0 = 0
            r5.f5a = r0
        L3:
            a.A$h r5 = r4.c
            a.A$h r1 = a.A.h.c
            if (r5 != r1) goto La
            goto L29
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            a.A$h r2 = r5.b
            java.lang.Thread r3 = r5.f5a
            if (r3 == 0) goto L15
            r1 = r5
            goto L27
        L15:
            if (r1 == 0) goto L1e
            r1.b = r2
            java.lang.Thread r5 = r1.f5a
            if (r5 != 0) goto L27
            goto L3
        L1e:
            a.A$a r3 = a.A.f
            boolean r5 = r3.c(r4, r5, r2)
            if (r5 != 0) goto L27
            goto L3
        L27:
            r5 = r2
            goto Lb
        L29:
            return
    }

    @Override // java.util.concurrent.Future
    public final V get() {
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L5f
            java.lang.Object r0 = r6.f0a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = r2
            goto Lf
        Le:
            r3 = r1
        Lf:
            boolean r4 = r0 instanceof a.A.f
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = c(r0)
            return r0
        L1a:
            a.A$h r0 = r6.c
            a.A$h r3 = a.A.h.c
            if (r0 == r3) goto L58
            a.A$h r4 = new a.A$h
            r4.<init>()
        L25:
            a.A$a r5 = a.A.f
            r5.d(r4, r0)
            boolean r0 = r5.c(r6, r0, r4)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.f0a
            if (r0 == 0) goto L3f
            r3 = r2
            goto L40
        L3f:
            r3 = r1
        L40:
            boolean r5 = r0 instanceof a.A.f
            r5 = r5 ^ r2
            r3 = r3 & r5
            if (r3 == 0) goto L30
            java.lang.Object r0 = c(r0)
            return r0
        L4b:
            r6.f(r4)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            a.A$h r0 = r6.c
            if (r0 != r3) goto L25
        L58:
            java.lang.Object r0 = r6.f0a
            java.lang.Object r0 = c(r0)
            return r0
        L5f:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public final V get(long r21, java.util.concurrent.TimeUnit r23) {
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = r23
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L178
            java.lang.Object r6 = r0.f0a
            r8 = 1
            if (r6 == 0) goto L17
            r9 = r8
            goto L18
        L17:
            r9 = 0
        L18:
            boolean r10 = r6 instanceof a.A.f
            r10 = r10 ^ r8
            r9 = r9 & r10
            if (r9 == 0) goto L23
            java.lang.Object r1 = c(r6)
            return r1
        L23:
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L2f
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 + r4
            goto L30
        L2f:
            r11 = r9
        L30:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 < 0) goto L8d
            a.A$h r6 = r0.c
            a.A$h r15 = a.A.h.c
            if (r6 == r15) goto L86
            a.A$h r7 = new a.A$h
            r7.<init>()
            r17 = r8
        L43:
            a.A$a r8 = a.A.f
            r8.d(r7, r6)
            boolean r6 = r8.c(r0, r6, r7)
            if (r6 == 0) goto L82
        L4e:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L79
            java.lang.Object r4 = r0.f0a
            if (r4 == 0) goto L5e
            r5 = r17
            goto L5f
        L5e:
            r5 = 0
        L5f:
            boolean r6 = r4 instanceof a.A.f
            r6 = r6 ^ 1
            r5 = r5 & r6
            if (r5 == 0) goto L6b
            java.lang.Object r1 = c(r4)
            return r1
        L6b:
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L4e
            r0.f(r7)
            goto L8f
        L79:
            r0.f(r7)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L82:
            a.A$h r6 = r0.c
            if (r6 != r15) goto L43
        L86:
            java.lang.Object r1 = r0.f0a
            java.lang.Object r1 = c(r1)
            return r1
        L8d:
            r17 = r8
        L8f:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto Lba
            java.lang.Object r4 = r0.f0a
            if (r4 == 0) goto L9a
            r5 = r17
            goto L9b
        L9a:
            r5 = 0
        L9b:
            boolean r6 = r4 instanceof a.A.f
            r6 = r6 ^ 1
            r5 = r5 & r6
            if (r5 == 0) goto La7
            java.lang.Object r1 = c(r4)
            return r1
        La7:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto Lb4
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            goto L8f
        Lb4:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        Lba:
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = r3.toString()
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Waited "
            r11.<init>(r12)
            r11.append(r1)
            java.lang.String r1 = " "
            r11.append(r1)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r2.toLowerCase(r8)
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            long r11 = r4 + r13
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 >= 0) goto L14c
            java.lang.String r8 = " (plus "
            java.lang.String r2 = a.C0487z.f(r2, r8)
            long r4 = -r4
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = r3.convert(r4, r8)
            long r18 = r3.toNanos(r11)
            long r4 = r4 - r18
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 == 0) goto L10b
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 <= 0) goto L108
            goto L10b
        L108:
            r16 = 0
            goto L10d
        L10b:
            r16 = r17
        L10d:
            if (r3 <= 0) goto L130
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r11)
            r3.append(r1)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            if (r16 == 0) goto L12c
            java.lang.String r3 = ","
            java.lang.String r2 = a.C0487z.f(r2, r3)
        L12c:
            java.lang.String r2 = a.C0487z.f(r2, r1)
        L130:
            if (r16 == 0) goto L146
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " nanoseconds "
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L146:
            java.lang.String r1 = "delay)"
            java.lang.String r2 = a.C0487z.f(r2, r1)
        L14c:
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L15e
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = " but future completed as timeout expired"
            java.lang.String r2 = a.C0487z.f(r2, r3)
            r1.<init>(r2)
            throw r1
        L15e:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " for "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L178:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.f0a
            boolean r0 = r0 instanceof a.A.b
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r3 = this;
            java.lang.Object r0 = r3.f0a
            r1 = 1
            if (r0 == 0) goto L7
            r2 = r1
            goto L8
        L7:
            r2 = 0
        L8:
            boolean r0 = r0 instanceof a.A.f
            r0 = r0 ^ r1
            r0 = r0 & r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r5.f0a
            boolean r1 = r1 instanceof a.A.b
            java.lang.String r2 = "]"
            if (r1 == 0) goto L1f
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L64
        L1f:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L29
            r5.a(r0)
            goto L64
        L29:
            java.lang.String r1 = r5.e()     // Catch: java.lang.RuntimeException -> L2e
            goto L41
        L2e:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception thrown from implementation: "
            r3.<init>(r4)
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L41:
            if (r1 == 0) goto L55
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L55
            java.lang.String r3 = "PENDING, info=["
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            goto L64
        L55:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L5f
            r5.a(r0)
            goto L64
        L5f:
            java.lang.String r1 = "PENDING"
            r0.append(r1)
        L64:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
