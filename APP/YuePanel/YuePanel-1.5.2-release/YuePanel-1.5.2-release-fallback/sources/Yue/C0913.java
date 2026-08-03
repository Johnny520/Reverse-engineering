package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0913 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ$ۥ, reason: contains not printable characters */
    public static final class C0914<T> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.Object f2659;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C0913.C0917<T> f2660;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C5348<java.lang.Void> f2661;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f2662;

        public C0914() {
                r1 = this;
                r1.<init>()
                Yue.ۥۡۦۦ۟ r0 = Yue.C5348.m20176()
                r1.f2661 = r0
                return
        }

        public void finalize() {
                r4 = this;
                Yue.ۥۣ۟ۧ$ۥ۟۟۟<T> r0 = r4.f2660
                if (r0 == 0) goto L25
                boolean r1 = r0.isDone()
                if (r1 != 0) goto L25
                Yue.ۥۣ۟ۧ$ۥ۟ r1 = new Yue.ۥۣ۟ۧ$ۥ۟
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "The completer object was garbage collected - this future would otherwise never complete. The tag was: "
                r2.append(r3)
                java.lang.Object r3 = r4.f2659
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                r0.m5265(r1)
            L25:
                boolean r0 = r4.f2662
                if (r0 != 0) goto L31
                Yue.ۥۡۦۦ۟<java.lang.Void> r0 = r4.f2661
                if (r0 == 0) goto L31
                r1 = 0
                r0.mo459(r1)
            L31:
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m5256(@Yue.InterfaceC4410 java.lang.Runnable r2, @Yue.InterfaceC4410 java.util.concurrent.Executor r3) {
                r1 = this;
                Yue.ۥۡۦۦ۟<java.lang.Void> r0 = r1.f2661
                if (r0 == 0) goto L7
                r0.addListener(r2, r3)
            L7:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m5257() {
                r2 = this;
                r0 = 0
                r2.f2659 = r0
                r2.f2660 = r0
                Yue.ۥۡۦۦ۟<java.lang.Void> r1 = r2.f2661
                r1.mo459(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m5258(T r3) {
                r2 = this;
                r0 = 1
                r2.f2662 = r0
                Yue.ۥۣ۟ۧ$ۥ۟۟۟<T> r1 = r2.f2660
                if (r1 == 0) goto Le
                boolean r3 = r1.m5264(r3)
                if (r3 == 0) goto Le
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L14
                r2.m5260()
            L14:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m5259() {
                r2 = this;
                r0 = 1
                r2.f2662 = r0
                Yue.ۥۣ۟ۧ$ۥ۟۟۟<T> r1 = r2.f2660
                if (r1 == 0) goto Le
                boolean r1 = r1.m5263(r0)
                if (r1 == 0) goto Le
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L14
                r2.m5260()
            L14:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m5260() {
                r1 = this;
                r0 = 0
                r1.f2659 = r0
                r1.f2660 = r0
                r1.f2661 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m5261(@Yue.InterfaceC4410 java.lang.Throwable r3) {
                r2 = this;
                r0 = 1
                r2.f2662 = r0
                Yue.ۥۣ۟ۧ$ۥ۟۟۟<T> r1 = r2.f2660
                if (r1 == 0) goto Le
                boolean r3 = r1.m5265(r3)
                if (r3 == 0) goto Le
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L14
                r2.m5260()
            L14:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ$ۥ۟, reason: contains not printable characters */
    public static final class C0915 extends java.lang.Throwable {
        public C0915(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Throwable
        public synchronized java.lang.Throwable fillInStackTrace() {
                r0 = this;
                monitor-enter(r0)
                monitor-exit(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC0916<T> {
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        java.lang.Object m5262(@Yue.InterfaceC4410 Yue.C0913.C0914<T> r1) throws java.lang.Exception;
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C0917<T> implements com.google.common.util.concurrent.ListenableFuture<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final java.lang.ref.WeakReference<Yue.C0913.C0914<T>> f2663;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final Yue.AbstractC0073<T> f2664;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ$ۥ۟۟۟$ۥ, reason: contains not printable characters */
        public class C0918 extends Yue.AbstractC0073<T> {

            /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0913.C0917 f2665;

            public C0918(Yue.C0913.C0917 r1) {
                    r0 = this;
                    r0.f2665 = r1
                    r0.<init>()
                    return
            }

            @Override // Yue.AbstractC0073
            /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
            public java.lang.String mo456() {
                    r3 = this;
                    Yue.ۥۣ۟ۧ$ۥ۟۟۟ r0 = r3.f2665
                    java.lang.ref.WeakReference<Yue.ۥۣ۟ۧ$ۥ<T>> r0 = r0.f2663
                    java.lang.Object r0 = r0.get()
                    Yue.ۥۣ۟ۧ$ۥ r0 = (Yue.C0913.C0914) r0
                    if (r0 != 0) goto Lf
                    java.lang.String r0 = "Completer object has been garbage collected, future will fail soon"
                    return r0
                Lf:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "tag=["
                    r1.append(r2)
                    java.lang.Object r0 = r0.f2659
                    r1.append(r0)
                    java.lang.String r0 = "]"
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    return r0
            }
        }

        public C0917(Yue.C0913.C0914<T> r2) {
                r1 = this;
                r1.<init>()
                Yue.ۥۣ۟ۧ$ۥ۟۟۟$ۥ r0 = new Yue.ۥۣ۟ۧ$ۥ۟۟۟$ۥ
                r0.<init>(r1)
                r1.f2664 = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f2663 = r0
                return
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(@Yue.InterfaceC4410 java.lang.Runnable r2, @Yue.InterfaceC4410 java.util.concurrent.Executor r3) {
                r1 = this;
                Yue.ۥ۟۟ۢ۠<T> r0 = r1.f2664
                r0.addListener(r2, r3)
                return
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean r3) {
                r2 = this;
                java.lang.ref.WeakReference<Yue.ۥۣ۟ۧ$ۥ<T>> r0 = r2.f2663
                java.lang.Object r0 = r0.get()
                Yue.ۥۣ۟ۧ$ۥ r0 = (Yue.C0913.C0914) r0
                Yue.ۥ۟۟ۢ۠<T> r1 = r2.f2664
                boolean r3 = r1.cancel(r3)
                if (r3 == 0) goto L15
                if (r0 == 0) goto L15
                r0.m5257()
            L15:
                return r3
        }

        @Override // java.util.concurrent.Future
        public T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
                r1 = this;
                Yue.ۥ۟۟ۢ۠<T> r0 = r1.f2664
                java.lang.Object r0 = r0.get()
                return r0
        }

        @Override // java.util.concurrent.Future
        public T get(long r2, @Yue.InterfaceC4410 java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
                r1 = this;
                Yue.ۥ۟۟ۢ۠<T> r0 = r1.f2664
                java.lang.Object r2 = r0.get(r2, r4)
                return r2
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
                r1 = this;
                Yue.ۥ۟۟ۢ۠<T> r0 = r1.f2664
                boolean r0 = r0.isCancelled()
                return r0
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
                r1 = this;
                Yue.ۥ۟۟ۢ۠<T> r0 = r1.f2664
                boolean r0 = r0.isDone()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                Yue.ۥ۟۟ۢ۠<T> r0 = r1.f2664
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m5263(boolean r2) {
                r1 = this;
                Yue.ۥ۟۟ۢ۠<T> r0 = r1.f2664
                boolean r2 = r0.cancel(r2)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean m5264(T r2) {
                r1 = this;
                Yue.ۥ۟۟ۢ۠<T> r0 = r1.f2664
                boolean r2 = r0.mo459(r2)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m5265(java.lang.Throwable r2) {
                r1 = this;
                Yue.ۥ۟۟ۢ۠<T> r0 = r1.f2664
                boolean r2 = r0.mo460(r2)
                return r2
        }
    }

    public C0913() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static <T> com.google.common.util.concurrent.ListenableFuture<T> m5255(@Yue.InterfaceC4410 Yue.C0913.InterfaceC0916<T> r3) {
            Yue.ۥۣ۟ۧ$ۥ r0 = new Yue.ۥۣ۟ۧ$ۥ
            r0.<init>()
            Yue.ۥۣ۟ۧ$ۥ۟۟۟ r1 = new Yue.ۥۣ۟ۧ$ۥ۟۟۟
            r1.<init>(r0)
            r0.f2660 = r1
            java.lang.Class r2 = r3.getClass()
            r0.f2659 = r2
            java.lang.Object r3 = r3.m5262(r0)     // Catch: java.lang.Exception -> L1b
            if (r3 == 0) goto L1f
            r0.f2659 = r3     // Catch: java.lang.Exception -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r1.m5265(r3)
        L1f:
            return r1
    }
}
