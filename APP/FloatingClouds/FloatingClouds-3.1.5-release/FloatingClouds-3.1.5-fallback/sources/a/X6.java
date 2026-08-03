package a;

/* JADX INFO: loaded from: classes.dex */
public class X6 extends androidx.activity.ComponentActivity implements a.U {
    static final java.lang.String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.h mFragmentLifecycleRegistry;
    final a.Y6 mFragments;
    boolean mResumed;
    boolean mStopped;

    public class a extends a.Z6<a.X6> implements a.Zb, a.InterfaceC0160gc, a.InterfaceC0069bc, a.InterfaceC0088cc, a.Gg, a.Yb, a.InterfaceC0112e0, a.Ld, a.InterfaceC0244l7, a.Xa {
        public final /* synthetic */ a.X6 e;

        public a(a.X6 r1) {
                r0 = this;
                r0.e = r1
                r0.<init>(r1)
                return
        }

        @Override // a.InterfaceC0244l7
        public final void a(androidx.fragment.app.b r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.onAttachFragment(r2)
                return
        }

        @Override // a.Xa
        public final void addMenuProvider(a.InterfaceC0159gb r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.addMenuProvider(r2)
                return
        }

        @Override // a.Zb
        public final void addOnConfigurationChangedListener(a.Q3<android.content.res.Configuration> r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.addOnConfigurationChangedListener(r2)
                return
        }

        @Override // a.InterfaceC0069bc
        public final void addOnMultiWindowModeChangedListener(a.Q3<a.C0499zb> r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.addOnMultiWindowModeChangedListener(r2)
                return
        }

        @Override // a.InterfaceC0088cc
        public final void addOnPictureInPictureModeChangedListener(a.Q3<a.C0410uc> r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.addOnPictureInPictureModeChangedListener(r2)
                return
        }

        @Override // a.InterfaceC0160gc
        public final void addOnTrimMemoryListener(a.Q3<java.lang.Integer> r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.addOnTrimMemoryListener(r2)
                return
        }

        @Override // a.AbstractC0040a2
        public final android.view.View c(int r2) {
                r1 = this;
                a.X6 r0 = r1.e
                android.view.View r2 = r0.findViewById(r2)
                return r2
        }

        @Override // a.AbstractC0040a2
        public final boolean f() {
                r1 = this;
                a.X6 r0 = r1.e
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L10
                android.view.View r0 = r0.peekDecorView()
                if (r0 == 0) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }

        @Override // a.InterfaceC0112e0
        public final androidx.activity.result.a getActivityResultRegistry() {
                r1 = this;
                a.X6 r0 = r1.e
                androidx.activity.result.a r0 = r0.getActivityResultRegistry()
                return r0
        }

        @Override // a.InterfaceC0479y9
        public final androidx.lifecycle.e getLifecycle() {
                r1 = this;
                a.X6 r0 = r1.e
                androidx.lifecycle.h r0 = r0.mFragmentLifecycleRegistry
                return r0
        }

        @Override // a.Yb
        public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
                r1 = this;
                a.X6 r0 = r1.e
                androidx.activity.OnBackPressedDispatcher r0 = r0.getOnBackPressedDispatcher()
                return r0
        }

        @Override // a.Ld
        public final androidx.savedstate.a getSavedStateRegistry() {
                r1 = this;
                a.X6 r0 = r1.e
                androidx.savedstate.a r0 = r0.getSavedStateRegistry()
                return r0
        }

        @Override // a.Gg
        public final a.Fg getViewModelStore() {
                r1 = this;
                a.X6 r0 = r1.e
                a.Fg r0 = r0.getViewModelStore()
                return r0
        }

        @Override // a.Xa
        public final void removeMenuProvider(a.InterfaceC0159gb r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.removeMenuProvider(r2)
                return
        }

        @Override // a.Zb
        public final void removeOnConfigurationChangedListener(a.Q3<android.content.res.Configuration> r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.removeOnConfigurationChangedListener(r2)
                return
        }

        @Override // a.InterfaceC0069bc
        public final void removeOnMultiWindowModeChangedListener(a.Q3<a.C0499zb> r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.removeOnMultiWindowModeChangedListener(r2)
                return
        }

        @Override // a.InterfaceC0088cc
        public final void removeOnPictureInPictureModeChangedListener(a.Q3<a.C0410uc> r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.removeOnPictureInPictureModeChangedListener(r2)
                return
        }

        @Override // a.InterfaceC0160gc
        public final void removeOnTrimMemoryListener(a.Q3<java.lang.Integer> r2) {
                r1 = this;
                a.X6 r0 = r1.e
                r0.removeOnTrimMemoryListener(r2)
                return
        }
    }

    public X6() {
            r2 = this;
            r2.<init>()
            a.X6$a r0 = new a.X6$a
            r0.<init>(r2)
            a.Y6 r1 = new a.Y6
            r1.<init>(r0)
            r2.mFragments = r1
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r2)
            r2.mFragmentLifecycleRegistry = r0
            r0 = 1
            r2.mStopped = r0
            r2.init()
            return
    }

    public X6(int r2) {
            r1 = this;
            r1.<init>(r2)
            a.X6$a r2 = new a.X6$a
            r2.<init>(r1)
            a.Y6 r0 = new a.Y6
            r0.<init>(r2)
            r1.mFragments = r0
            androidx.lifecycle.h r2 = new androidx.lifecycle.h
            r2.<init>(r1)
            r1.mFragmentLifecycleRegistry = r2
            r2 = 1
            r1.mStopped = r2
            r1.init()
            return
    }

    public static /* synthetic */ void d(a.X6 r0, androidx.activity.ComponentActivity r1) {
            r0.lambda$init$3(r1)
            return
    }

    public static /* synthetic */ void e(a.X6 r0, android.content.res.Configuration r1) {
            r0.lambda$init$1(r1)
            return
    }

    public static /* synthetic */ android.os.Bundle f(a.X6 r0) {
            android.os.Bundle r0 = r0.lambda$init$0()
            return r0
    }

    public static /* synthetic */ void g(a.X6 r0, android.content.Intent r1) {
            r0.lambda$init$2(r1)
            return
    }

    private void init() {
            r3 = this;
            androidx.savedstate.a r0 = r3.getSavedStateRegistry()
            a.B3 r1 = new a.B3
            r2 = 1
            r1.<init>(r2, r3)
            java.lang.String r2 = "android:support:lifecycle"
            r0.c(r2, r1)
            a.W6 r0 = new a.W6
            r1 = 0
            r0.<init>(r3, r1)
            r3.addOnConfigurationChangedListener(r0)
            a.W6 r0 = new a.W6
            r1 = 1
            r0.<init>(r3, r1)
            r3.addOnNewIntentListener(r0)
            a.C3 r0 = new a.C3
            r0.<init>(r3, r1)
            r3.addOnContextAvailableListener(r0)
            return
    }

    private /* synthetic */ android.os.Bundle lambda$init$0() {
            r2 = this;
            r2.markFragmentsCreated()
            androidx.lifecycle.h r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_STOP
            r0.f(r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    private /* synthetic */ void lambda$init$1(android.content.res.Configuration r1) {
            r0 = this;
            a.Y6 r1 = r0.mFragments
            r1.a()
            return
    }

    private /* synthetic */ void lambda$init$2(android.content.Intent r1) {
            r0 = this;
            a.Y6 r1 = r0.mFragments
            r1.a()
            return
    }

    private void lambda$init$3(android.content.Context r3) {
            r2 = this;
            a.Y6 r3 = r2.mFragments
            a.X6$a r3 = r3.f352a
            r0 = 0
            a.i7 r1 = r3.d
            r1.b(r3, r3, r0)
            return
    }

    private static boolean markState(a.AbstractC0119e7 r5, androidx.lifecycle.e.b r6) {
            a.A2 r5 = r5.c
            java.util.List r5 = r5.g()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        Lb:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r5.next()
            androidx.fragment.app.b r1 = (androidx.fragment.app.b) r1
            if (r1 != 0) goto L1a
            goto Lb
        L1a:
            a.X6$a r2 = r1.u
            if (r2 != 0) goto L20
            r2 = 0
            goto L22
        L20:
            a.X6 r2 = r2.e
        L22:
            if (r2 == 0) goto L2d
            a.e7 r2 = r1.c()
            boolean r2 = markState(r2, r6)
            r0 = r0 | r2
        L2d:
            a.q7 r2 = r1.P
            androidx.lifecycle.e$b r3 = androidx.lifecycle.e.b.d
            r4 = 1
            if (r2 == 0) goto L49
            r2.b()
            androidx.lifecycle.h r2 = r2.d
            androidx.lifecycle.e$b r2 = r2.c
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L49
            a.q7 r0 = r1.P
            androidx.lifecycle.h r0 = r0.d
            r0.h(r6)
            r0 = r4
        L49:
            androidx.lifecycle.h r2 = r1.O
            androidx.lifecycle.e$b r2 = r2.c
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto Lb
            androidx.lifecycle.h r0 = r1.O
            r0.h(r6)
            r0 = r4
            goto Lb
        L5a:
            return r0
    }

    public final android.view.View dispatchFragmentsOnCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            a.Y6 r0 = r1.mFragments
            a.X6$a r0 = r0.f352a
            a.i7 r0 = r0.d
            a.a7 r0 = r0.f
            android.view.View r2 = r0.onCreateView(r2, r3, r4, r5)
            return r2
    }

    @Override // android.app.Activity
    public void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
            r3 = this;
            super.dump(r4, r5, r6, r7)
            boolean r0 = r3.shouldDumpInternalState(r7)
            if (r0 != 0) goto La
            return
        La:
            r6.print(r4)
            java.lang.String r0 = "Local FragmentActivity "
            r6.print(r0)
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r6.print(r0)
            java.lang.String r0 = " State:"
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.print(r0)
            java.lang.String r1 = "mCreated="
            r6.print(r1)
            boolean r1 = r3.mCreated
            r6.print(r1)
            java.lang.String r1 = " mResumed="
            r6.print(r1)
            boolean r1 = r3.mResumed
            r6.print(r1)
            java.lang.String r1 = " mStopped="
            r6.print(r1)
            boolean r1 = r3.mStopped
            r6.print(r1)
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto L66
            a.I9 r1 = new a.I9
            a.Fg r2 = r3.getViewModelStore()
            r1.<init>(r3, r2)
            r1.a(r0, r6)
        L66:
            a.Y6 r0 = r3.mFragments
            a.X6$a r0 = r0.f352a
            a.i7 r0 = r0.d
            r0.v(r4, r5, r6, r7)
            return
    }

    public a.AbstractC0119e7 getSupportFragmentManager() {
            r1 = this;
            a.Y6 r0 = r1.mFragments
            a.X6$a r0 = r0.f352a
            a.i7 r0 = r0.d
            return r0
    }

    @java.lang.Deprecated
    public a.H9 getSupportLoaderManager() {
            r2 = this;
            a.I9 r0 = new a.I9
            a.Fg r1 = r2.getViewModelStore()
            r0.<init>(r2, r1)
            return r0
    }

    public void markFragmentsCreated() {
            r2 = this;
        L0:
            a.e7 r0 = r2.getSupportFragmentManager()
            androidx.lifecycle.e$b r1 = androidx.lifecycle.e.b.c
            boolean r0 = markState(r0, r1)
            if (r0 != 0) goto L0
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            a.Y6 r0 = r1.mFragments
            r0.a()
            super.onActivityResult(r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public void onAttachFragment(androidx.fragment.app.b r1) {
            r0 = this;
            return
    }

    @Override // androidx.activity.ComponentActivity, a.D3, android.app.Activity
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            androidx.lifecycle.h r3 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_CREATE
            r3.f(r0)
            a.Y6 r3 = r2.mFragments
            a.X6$a r3 = r3.f352a
            a.i7 r3 = r3.d
            r0 = 0
            r3.G = r0
            r3.H = r0
            a.k7 r1 = r3.N
            r1.i = r0
            r0 = 1
            r3.u(r0)
            return
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            android.view.View r0 = r1.dispatchFragmentsOnCreateView(r2, r3, r4, r5)
            if (r0 != 0) goto Lb
            android.view.View r2 = super.onCreateView(r2, r3, r4, r5)
            return r2
        Lb:
            return r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r0 = r1.dispatchFragmentsOnCreateView(r0, r2, r3, r4)
            if (r0 != 0) goto Lc
            android.view.View r2 = super.onCreateView(r2, r3, r4)
            return r2
        Lc:
            return r0
    }

    @Override // android.app.Activity
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            a.Y6 r0 = r2.mFragments
            a.X6$a r0 = r0.f352a
            a.i7 r0 = r0.d
            r0.l()
            androidx.lifecycle.h r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_DESTROY
            r0.f(r1)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, android.view.MenuItem r2) {
            r0 = this;
            boolean r2 = super.onMenuItemSelected(r1, r2)
            if (r2 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r2 = 6
            if (r1 != r2) goto L16
            a.Y6 r1 = r0.mFragments
            a.X6$a r1 = r1.f352a
            a.i7 r1 = r1.d
            boolean r1 = r1.j()
            return r1
        L16:
            r1 = 0
            return r1
    }

    @Override // android.app.Activity
    public void onPause() {
            r2 = this;
            super.onPause()
            r0 = 0
            r2.mResumed = r0
            a.Y6 r0 = r2.mFragments
            a.X6$a r0 = r0.f352a
            r1 = 5
            a.i7 r0 = r0.d
            r0.u(r1)
            androidx.lifecycle.h r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_PAUSE
            r0.f(r1)
            return
    }

    @Override // android.app.Activity
    public void onPostResume() {
            r0 = this;
            super.onPostResume()
            r0.onResumeFragments()
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            a.Y6 r0 = r1.mFragments
            r0.a()
            super.onRequestPermissionsResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void onResume() {
            r2 = this;
            a.Y6 r0 = r2.mFragments
            r0.a()
            super.onResume()
            r0 = 1
            r2.mResumed = r0
            a.Y6 r1 = r2.mFragments
            a.X6$a r1 = r1.f352a
            a.i7 r1 = r1.d
            r1.z(r0)
            return
    }

    public void onResumeFragments() {
            r3 = this;
            androidx.lifecycle.h r0 = r3.mFragmentLifecycleRegistry
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_RESUME
            r0.f(r1)
            a.Y6 r0 = r3.mFragments
            a.X6$a r0 = r0.f352a
            a.i7 r0 = r0.d
            r1 = 0
            r0.G = r1
            r0.H = r1
            a.k7 r2 = r0.N
            r2.i = r1
            r1 = 7
            r0.u(r1)
            return
    }

    @Override // android.app.Activity
    public void onStart() {
            r4 = this;
            a.Y6 r0 = r4.mFragments
            r0.a()
            super.onStart()
            r0 = 0
            r4.mStopped = r0
            boolean r1 = r4.mCreated
            r2 = 1
            if (r1 != 0) goto L24
            r4.mCreated = r2
            a.Y6 r1 = r4.mFragments
            a.X6$a r1 = r1.f352a
            a.i7 r1 = r1.d
            r1.G = r0
            r1.H = r0
            a.k7 r3 = r1.N
            r3.i = r0
            r3 = 4
            r1.u(r3)
        L24:
            a.Y6 r1 = r4.mFragments
            a.X6$a r1 = r1.f352a
            a.i7 r1 = r1.d
            r1.z(r2)
            androidx.lifecycle.h r1 = r4.mFragmentLifecycleRegistry
            androidx.lifecycle.e$a r2 = androidx.lifecycle.e.a.ON_START
            r1.f(r2)
            a.Y6 r1 = r4.mFragments
            a.X6$a r1 = r1.f352a
            a.i7 r1 = r1.d
            r1.G = r0
            r1.H = r0
            a.k7 r2 = r1.N
            r2.i = r0
            r0 = 5
            r1.u(r0)
            return
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
            r1 = this;
            a.Y6 r0 = r1.mFragments
            r0.a()
            return
    }

    @Override // android.app.Activity
    public void onStop() {
            r3 = this;
            super.onStop()
            r0 = 1
            r3.mStopped = r0
            r3.markFragmentsCreated()
            a.Y6 r1 = r3.mFragments
            a.X6$a r1 = r1.f352a
            a.i7 r1 = r1.d
            r1.H = r0
            a.k7 r2 = r1.N
            r2.i = r0
            r0 = 4
            r1.u(r0)
            androidx.lifecycle.h r0 = r3.mFragmentLifecycleRegistry
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_STOP
            r0.f(r1)
            return
    }

    public void setEnterSharedElementCallback(a.AbstractC0052ae r1) {
            r0 = this;
            r1 = 0
            a.S.c(r0, r1)
            return
    }

    public void setExitSharedElementCallback(a.AbstractC0052ae r1) {
            r0 = this;
            r1 = 0
            a.S.d(r0, r1)
            return
    }

    public void startActivityFromFragment(androidx.fragment.app.b r2, android.content.Intent r3, int r4) {
            r1 = this;
            r0 = 0
            r1.startActivityFromFragment(r2, r3, r4, r0)
            return
    }

    public void startActivityFromFragment(androidx.fragment.app.b r4, android.content.Intent r5, int r6, android.os.Bundle r7) {
            r3 = this;
            r0 = -1
            if (r6 != r0) goto L7
            r3.startActivityForResult(r5, r0, r7)
            return
        L7:
            a.X6$a r1 = r4.u
            if (r1 == 0) goto L46
            a.e7 r1 = r4.f()
            a.d0 r2 = r1.B
            if (r2 == 0) goto L2c
            a.e7$g r0 = new a.e7$g
            java.lang.String r4 = r4.e
            r0.<init>(r4, r6)
            java.util.ArrayDeque<a.e7$g> r4 = r1.E
            r4.addLast(r0)
            if (r7 == 0) goto L26
            java.lang.String r4 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r5.putExtra(r4, r7)
        L26:
            a.d0 r4 = r1.B
            r4.a(r5)
            return
        L2c:
            a.X6$a r4 = r1.v
            r4.getClass()
            java.lang.String r1 = "intent"
            a.C0193i9.e(r5, r1)
            if (r6 != r0) goto L3e
            a.X6 r4 = r4.b
            r4.startActivity(r5, r7)
            return
        L3e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Starting activity with a requestCode requires a FragmentActivity host"
            r4.<init>(r5)
            throw r4
        L46:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Fragment "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = " not attached to Activity"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    @java.lang.Deprecated
    public void startIntentSenderFromFragment(androidx.fragment.app.b r13, android.content.IntentSender r14, int r15, android.content.Intent r16, int r17, int r18, int r19, android.os.Bundle r20) {
            r12 = this;
            r8 = -1
            if (r15 != r8) goto L14
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
        L14:
            r3 = r16
            r7 = r20
            a.X6$a r0 = r13.u
            java.lang.String r4 = "Fragment "
            if (r0 == 0) goto Lff
            r0 = 2
            boolean r5 = a.AbstractC0119e7.J(r0)
            java.lang.String r6 = "FragmentManager"
            if (r5 == 0) goto L56
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r13)
            java.lang.String r9 = " received the following in startIntentSenderForResult() requestCode: "
            r5.append(r9)
            r5.append(r15)
            java.lang.String r9 = " IntentSender: "
            r5.append(r9)
            r5.append(r14)
            java.lang.String r9 = " fillInIntent: "
            r5.append(r9)
            r5.append(r3)
            java.lang.String r9 = " options: "
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r6, r5)
        L56:
            a.e7 r5 = r13.f()
            a.d0 r9 = r5.C
            if (r9 == 0) goto Ld3
            if (r7 == 0) goto L99
            if (r3 != 0) goto L6d
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r8 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r9 = 1
            r3.putExtra(r8, r9)
        L6d:
            boolean r8 = a.AbstractC0119e7.J(r0)
            if (r8 == 0) goto L94
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ActivityOptions "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r9 = " were added to fillInIntent "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = " for fragment "
            r8.append(r9)
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r6, r8)
        L94:
            java.lang.String r8 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r3.putExtra(r8, r7)
        L99:
            java.lang.String r7 = "intentSender"
            a.C0193i9.e(r14, r7)
            a.g9 r7 = new a.g9
            r9 = r17
            r10 = r18
            r7.<init>(r14, r3, r9, r10)
            a.e7$g r14 = new a.e7$g
            java.lang.String r1 = r13.e
            r14.<init>(r1, r15)
            java.util.ArrayDeque<a.e7$g> r15 = r5.E
            r15.addLast(r14)
            boolean r14 = a.AbstractC0119e7.J(r0)
            if (r14 == 0) goto Lcd
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r4)
            r14.append(r13)
            java.lang.String r13 = "is launching an IntentSender for result "
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            android.util.Log.v(r6, r13)
        Lcd:
            a.d0 r13 = r5.C
            r13.a(r7)
            return
        Ld3:
            r9 = r17
            r10 = r18
            a.X6$a r13 = r5.v
            r13.getClass()
            java.lang.String r0 = "intent"
            a.C0193i9.e(r14, r0)
            java.lang.String r11 = "Starting intent sender with a requestCode requires a FragmentActivity host"
            if (r15 != r8) goto Lf9
            a.X6 r0 = r13.f370a
            if (r0 == 0) goto Lf3
            r1 = r14
            r2 = r15
            r6 = r19
            r4 = r9
            r5 = r10
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
        Lf3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r11)
            throw r13
        Lf9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r11)
            throw r13
        Lff:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r4)
            r15.append(r13)
            java.lang.String r13 = " not attached to Activity"
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            r14.<init>(r13)
            throw r14
    }

    public void supportFinishAfterTransition() {
            r0 = this;
            a.S.a(r0)
            return
    }

    @java.lang.Deprecated
    public void supportInvalidateOptionsMenu() {
            r0 = this;
            r0.invalidateMenu()
            return
    }

    public void supportPostponeEnterTransition() {
            r0 = this;
            a.S.b(r0)
            return
    }

    public void supportStartPostponedEnterTransition() {
            r0 = this;
            a.S.e(r0)
            return
    }

    @Override // a.U
    @java.lang.Deprecated
    public final void validateRequestPermissionsRequestCode(int r1) {
            r0 = this;
            return
    }
}
