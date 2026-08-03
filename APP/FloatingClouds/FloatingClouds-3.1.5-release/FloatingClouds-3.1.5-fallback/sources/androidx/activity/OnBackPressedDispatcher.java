package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f792a;
    public final a.F1<a.Ub> b;
    public a.Ub c;
    public final android.window.OnBackInvokedCallback d;
    public android.window.OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/g;", "La/K2;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.g, a.K2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.e f793a;
        public final a.AbstractC0119e7.a b;
        public androidx.activity.OnBackPressedDispatcher.c c;
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher d;

        public LifecycleOnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher r2, androidx.lifecycle.e r3, a.AbstractC0119e7.a r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "onBackPressedCallback"
                a.C0193i9.e(r4, r0)
                r1.d = r2
                r1.f793a = r3
                r1.b = r4
                r3.a(r1)
                return
        }

        @Override // androidx.lifecycle.g
        public final void a(a.InterfaceC0479y9 r8, androidx.lifecycle.e.a r9) {
                r7 = this;
                androidx.lifecycle.e$a r8 = androidx.lifecycle.e.a.ON_START
                if (r9 != r8) goto L34
                androidx.activity.OnBackPressedDispatcher r2 = r7.d
                r2.getClass()
                a.e7$a r8 = r7.b
                java.lang.String r9 = "onBackPressedCallback"
                a.C0193i9.e(r8, r9)
                a.F1<a.Ub> r9 = r2.b
                r9.addLast(r8)
                androidx.activity.OnBackPressedDispatcher$c r9 = new androidx.activity.OnBackPressedDispatcher$c
                r9.<init>(r2, r8)
                java.util.concurrent.CopyOnWriteArrayList<a.K2> r0 = r8.b
                r0.add(r9)
                r2.d()
                a.Xb r0 = new a.Xb
                r1 = 0
                java.lang.String r5 = "updateEnabledCallbacks()V"
                java.lang.Class<androidx.activity.OnBackPressedDispatcher> r3 = androidx.activity.OnBackPressedDispatcher.class
                java.lang.String r4 = "updateEnabledCallbacks"
                r6 = 1
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r8.c = r0
                r7.c = r9
                return
            L34:
                androidx.lifecycle.e$a r8 = androidx.lifecycle.e.a.ON_STOP
                if (r9 != r8) goto L40
                androidx.activity.OnBackPressedDispatcher$c r8 = r7.c
                if (r8 == 0) goto L47
                r8.cancel()
                return
            L40:
                androidx.lifecycle.e$a r8 = androidx.lifecycle.e.a.ON_DESTROY
                if (r9 != r8) goto L47
                r7.cancel()
            L47:
                return
        }

        @Override // a.K2
        public final void cancel() {
                r1 = this;
                androidx.lifecycle.e r0 = r1.f793a
                r0.c(r1)
                a.e7$a r0 = r1.b
                java.util.concurrent.CopyOnWriteArrayList<a.K2> r0 = r0.b
                r0.remove(r1)
                androidx.activity.OnBackPressedDispatcher$c r0 = r1.c
                if (r0 == 0) goto L13
                r0.cancel()
            L13:
                r0 = 0
                r1.c = r0
                return
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.activity.OnBackPressedDispatcher.a f794a = null;

        static {
                androidx.activity.OnBackPressedDispatcher$a r0 = new androidx.activity.OnBackPressedDispatcher$a
                r0.<init>()
                androidx.activity.OnBackPressedDispatcher.a.f794a = r0
                return
        }

        public final android.window.OnBackInvokedCallback a(a.InterfaceC0369s7<a.Wf> r3) {
                r2 = this;
                java.lang.String r0 = "onBackInvoked"
                a.C0193i9.e(r3, r0)
                a.V0 r0 = new a.V0
                r1 = 1
                r0.<init>(r1, r3)
                return r0
        }

        public final void b(java.lang.Object r2, int r3, java.lang.Object r4) {
                r1 = this;
                java.lang.String r0 = "dispatcher"
                a.C0193i9.e(r2, r0)
                java.lang.String r0 = "callback"
                a.C0193i9.e(r4, r0)
                android.window.OnBackInvokedDispatcher r2 = (android.window.OnBackInvokedDispatcher) r2
                android.window.OnBackInvokedCallback r4 = (android.window.OnBackInvokedCallback) r4
                r2.registerOnBackInvokedCallback(r3, r4)
                return
        }

        public final void c(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = "dispatcher"
                a.C0193i9.e(r2, r0)
                java.lang.String r0 = "callback"
                a.C0193i9.e(r3, r0)
                android.window.OnBackInvokedDispatcher r2 = (android.window.OnBackInvokedDispatcher) r2
                android.window.OnBackInvokedCallback r3 = (android.window.OnBackInvokedCallback) r3
                r2.unregisterOnBackInvokedCallback(r3)
                return
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.activity.OnBackPressedDispatcher.b f795a = null;

        public static final class a implements android.window.OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.D7<a.R1, a.Wf> f796a;
            public final /* synthetic */ a.D7<a.R1, a.Wf> b;
            public final /* synthetic */ a.InterfaceC0369s7<a.Wf> c;
            public final /* synthetic */ a.InterfaceC0369s7<a.Wf> d;

            public a(a.D7<? super a.R1, a.Wf> r1, a.D7<? super a.R1, a.Wf> r2, a.InterfaceC0369s7<a.Wf> r3, a.InterfaceC0369s7<a.Wf> r4) {
                    r0 = this;
                    r0.<init>()
                    r0.f796a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.d = r4
                    return
            }

            public final void onBackCancelled() {
                    r1 = this;
                    a.s7<a.Wf> r0 = r1.d
                    r0.a()
                    return
            }

            public final void onBackInvoked() {
                    r1 = this;
                    a.s7<a.Wf> r0 = r1.c
                    r0.a()
                    return
            }

            public final void onBackProgressed(android.window.BackEvent r3) {
                    r2 = this;
                    java.lang.String r0 = "backEvent"
                    a.C0193i9.e(r3, r0)
                    a.D7<a.R1, a.Wf> r0 = r2.b
                    a.R1 r1 = new a.R1
                    r1.<init>(r3)
                    r0.f(r1)
                    return
            }

            public final void onBackStarted(android.window.BackEvent r3) {
                    r2 = this;
                    java.lang.String r0 = "backEvent"
                    a.C0193i9.e(r3, r0)
                    a.D7<a.R1, a.Wf> r0 = r2.f796a
                    a.R1 r1 = new a.R1
                    r1.<init>(r3)
                    r0.f(r1)
                    return
            }
        }

        static {
                androidx.activity.OnBackPressedDispatcher$b r0 = new androidx.activity.OnBackPressedDispatcher$b
                r0.<init>()
                androidx.activity.OnBackPressedDispatcher.b.f795a = r0
                return
        }

        public final android.window.OnBackInvokedCallback a(a.D7<? super a.R1, a.Wf> r2, a.D7<? super a.R1, a.Wf> r3, a.InterfaceC0369s7<a.Wf> r4, a.InterfaceC0369s7<a.Wf> r5) {
                r1 = this;
                java.lang.String r0 = "onBackStarted"
                a.C0193i9.e(r2, r0)
                java.lang.String r0 = "onBackProgressed"
                a.C0193i9.e(r3, r0)
                java.lang.String r0 = "onBackInvoked"
                a.C0193i9.e(r4, r0)
                java.lang.String r0 = "onBackCancelled"
                a.C0193i9.e(r5, r0)
                androidx.activity.OnBackPressedDispatcher$b$a r0 = new androidx.activity.OnBackPressedDispatcher$b$a
                r0.<init>(r2, r3, r4, r5)
                return r0
        }
    }

    public final class c implements a.K2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.AbstractC0119e7.a f797a;
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher b;

        public c(androidx.activity.OnBackPressedDispatcher r2, a.AbstractC0119e7.a r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "onBackPressedCallback"
                a.C0193i9.e(r3, r0)
                r1.b = r2
                r1.f797a = r3
                return
        }

        @Override // a.K2
        public final void cancel() {
                r4 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r4.b
                a.F1<a.Ub> r1 = r0.b
                a.e7$a r2 = r4.f797a
                r1.remove(r2)
                a.Ub r1 = r0.c
                boolean r1 = a.C0193i9.a(r1, r2)
                r3 = 0
                if (r1 == 0) goto L17
                r2.a()
                r0.c = r3
            L17:
                java.util.concurrent.CopyOnWriteArrayList<a.K2> r0 = r2.b
                r0.remove(r4)
                a.S7 r0 = r2.c
                if (r0 == 0) goto L23
                r0.a()
            L23:
                r2.c = r3
                return
        }
    }

    public OnBackPressedDispatcher() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public OnBackPressedDispatcher(java.lang.Runnable r6) {
            r5 = this;
            r5.<init>()
            r5.f792a = r6
            a.F1 r6 = new a.F1
            r6.<init>()
            r5.b = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r6 < r0) goto L43
            r0 = 34
            if (r6 < r0) goto L35
            androidx.activity.OnBackPressedDispatcher$b r6 = androidx.activity.OnBackPressedDispatcher.b.f795a
            a.Vb r0 = new a.Vb
            r1 = 0
            r0.<init>(r5, r1)
            a.Vb r1 = new a.Vb
            r2 = 1
            r1.<init>(r5, r2)
            a.Wb r2 = new a.Wb
            r3 = 0
            r2.<init>(r5, r3)
            a.Wb r3 = new a.Wb
            r4 = 1
            r3.<init>(r5, r4)
            android.window.OnBackInvokedCallback r6 = r6.a(r0, r1, r2, r3)
            goto L41
        L35:
            androidx.activity.OnBackPressedDispatcher$a r6 = androidx.activity.OnBackPressedDispatcher.a.f794a
            a.Wb r0 = new a.Wb
            r1 = 2
            r0.<init>(r5, r1)
            android.window.OnBackInvokedCallback r6 = r6.a(r0)
        L41:
            r5.d = r6
        L43:
            return
    }

    public final void a(a.InterfaceC0479y9 r9, a.AbstractC0119e7.a r10) {
            r8 = this;
            java.lang.String r0 = "onBackPressedCallback"
            a.C0193i9.e(r10, r0)
            androidx.lifecycle.e r9 = r9.getLifecycle()
            androidx.lifecycle.e$b r0 = r9.b()
            androidx.lifecycle.e$b r1 = androidx.lifecycle.e.b.f932a
            if (r0 != r1) goto L12
            return
        L12:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r0.<init>(r8, r9, r10)
            java.util.concurrent.CopyOnWriteArrayList<a.K2> r9 = r10.b
            r9.add(r0)
            r8.d()
            a.Xb r1 = new a.Xb
            java.lang.Class<androidx.activity.OnBackPressedDispatcher> r4 = androidx.activity.OnBackPressedDispatcher.class
            java.lang.String r5 = "updateEnabledCallbacks"
            r2 = 0
            java.lang.String r6 = "updateEnabledCallbacks()V"
            r7 = 0
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.c = r1
            return
    }

    public final void b() {
            r4 = this;
            a.Ub r0 = r4.c
            r1 = 0
            if (r0 != 0) goto L26
            a.F1<a.Ub> r0 = r4.b
            r0.getClass()
            int r2 = r0.c
            java.util.ListIterator r0 = r0.listIterator(r2)
        L10:
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.previous()
            r3 = r2
            a.Ub r3 = (a.Ub) r3
            boolean r3 = r3.f292a
            if (r3 == 0) goto L10
            goto L23
        L22:
            r2 = r1
        L23:
            r0 = r2
            a.Ub r0 = (a.Ub) r0
        L26:
            r4.c = r1
            if (r0 == 0) goto L2e
            r0.b()
            return
        L2e:
            java.lang.Runnable r0 = r4.f792a
            if (r0 == 0) goto L35
            r0.run()
        L35:
            return
    }

    public final void c(boolean r6) {
            r5 = this;
            android.window.OnBackInvokedDispatcher r0 = r5.e
            android.window.OnBackInvokedCallback r1 = r5.d
            if (r0 == 0) goto L23
            if (r1 == 0) goto L23
            androidx.activity.OnBackPressedDispatcher$a r2 = androidx.activity.OnBackPressedDispatcher.a.f794a
            r3 = 0
            if (r6 == 0) goto L18
            boolean r4 = r5.f
            if (r4 != 0) goto L18
            r2.b(r0, r3, r1)
            r6 = 1
            r5.f = r6
            return
        L18:
            if (r6 != 0) goto L23
            boolean r6 = r5.f
            if (r6 == 0) goto L23
            r2.c(r0, r1)
            r5.f = r3
        L23:
            return
    }

    public final void d() {
            r4 = this;
            boolean r0 = r4.g
            r1 = 0
            a.F1<a.Ub> r2 = r4.b
            if (r2 == 0) goto Le
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Le
            goto L23
        Le:
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            a.Ub r3 = (a.Ub) r3
            boolean r3 = r3.f292a
            if (r3 == 0) goto L12
            r1 = 1
        L23:
            r4.g = r1
            if (r1 == r0) goto L30
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L30
            r4.c(r1)
        L30:
            return
    }
}
