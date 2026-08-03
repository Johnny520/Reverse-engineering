package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends androidx.activity.ComponentActivity implements Yue.C0188.InterfaceC0197, Yue.C0188.InterfaceC0199 {
    static final java.lang.String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.LifecycleRegistry mFragmentLifecycleRegistry;
    final Yue.C2763 mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentActivity$ۥ, reason: contains not printable characters */
    public class C7572 extends Yue.AbstractC2764<androidx.fragment.app.FragmentActivity> implements Yue.InterfaceC4612, Yue.InterfaceC4621, Yue.InterfaceC4616, Yue.InterfaceC4618, androidx.lifecycle.ViewModelStoreOwner, Yue.InterfaceC4611, Yue.InterfaceC0255, Yue.InterfaceC5504, Yue.InterfaceC2772, Yue.InterfaceC4120 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentActivity f29162;

        public C7572(androidx.fragment.app.FragmentActivity r1) {
                r0 = this;
                r0.f29162 = r1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC4120
        public void addMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.addMenuProvider(r2)
                return
        }

        @Override // Yue.InterfaceC4120
        public void addMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r3) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.addMenuProvider(r2, r3)
                return
        }

        @Override // Yue.InterfaceC4120
        public void addMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r3, @Yue.InterfaceC4410 androidx.lifecycle.Lifecycle.State r4) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.addMenuProvider(r2, r3, r4)
                return
        }

        @Override // Yue.InterfaceC4612
        public void addOnConfigurationChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<android.content.res.Configuration> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.addOnConfigurationChangedListener(r2)
                return
        }

        @Override // Yue.InterfaceC4616
        public void addOnMultiWindowModeChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.C4298> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.addOnMultiWindowModeChangedListener(r2)
                return
        }

        @Override // Yue.InterfaceC4618
        public void addOnPictureInPictureModeChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.C4767> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.addOnPictureInPictureModeChangedListener(r2)
                return
        }

        @Override // Yue.InterfaceC4621
        public void addOnTrimMemoryListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<java.lang.Integer> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.addOnTrimMemoryListener(r2)
                return
        }

        @Override // Yue.InterfaceC0255
        @Yue.InterfaceC4410
        public androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                androidx.activity.result.ActivityResultRegistry r0 = r0.getActivityResultRegistry()
                return r0
        }

        @Override // androidx.lifecycle.LifecycleOwner
        @Yue.InterfaceC4410
        public androidx.lifecycle.Lifecycle getLifecycle() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                androidx.lifecycle.LifecycleRegistry r0 = r0.mFragmentLifecycleRegistry
                return r0
        }

        @Override // Yue.InterfaceC4611
        @Yue.InterfaceC4410
        public androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                androidx.activity.OnBackPressedDispatcher r0 = r0.getOnBackPressedDispatcher()
                return r0
        }

        @Override // Yue.InterfaceC5504
        @Yue.InterfaceC4410
        public androidx.savedstate.C7816 getSavedStateRegistry() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                androidx.savedstate.ۥ r0 = r0.getSavedStateRegistry()
                return r0
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        @Yue.InterfaceC4410
        public androidx.lifecycle.ViewModelStore getViewModelStore() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                return r0
        }

        @Override // Yue.InterfaceC4120
        public void invalidateMenu() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.invalidateMenu()
                return
        }

        @Override // Yue.InterfaceC4120
        public void removeMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.removeMenuProvider(r2)
                return
        }

        @Override // Yue.InterfaceC4612
        public void removeOnConfigurationChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<android.content.res.Configuration> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.removeOnConfigurationChangedListener(r2)
                return
        }

        @Override // Yue.InterfaceC4616
        public void removeOnMultiWindowModeChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.C4298> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.removeOnMultiWindowModeChangedListener(r2)
                return
        }

        @Override // Yue.InterfaceC4618
        public void removeOnPictureInPictureModeChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.C4767> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.removeOnPictureInPictureModeChangedListener(r2)
                return
        }

        @Override // Yue.InterfaceC4621
        public void removeOnTrimMemoryListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<java.lang.Integer> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.removeOnTrimMemoryListener(r2)
                return
        }

        @Override // Yue.InterfaceC2772
        /* JADX INFO: renamed from: ۥ */
        public void mo12132(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
                r0 = this;
                androidx.fragment.app.FragmentActivity r1 = r0.f29162
                r1.onAttachFragment(r2)
                return
        }

        @Override // Yue.AbstractC2764, Yue.AbstractC2762
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟ */
        public android.view.View mo12069(int r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                android.view.View r2 = r0.findViewById(r2)
                return r2
        }

        @Override // Yue.AbstractC2764, Yue.AbstractC2762
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo12070() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L10
                android.view.View r0 = r0.peekDecorView()
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // Yue.AbstractC2764
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo12116(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 java.io.FileDescriptor r3, @Yue.InterfaceC4410 java.io.PrintWriter r4, @Yue.InterfaceC4544 java.lang.String[] r5) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                r0.dump(r2, r3, r4, r5)
                return
        }

        @Override // Yue.AbstractC2764
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public /* bridge */ /* synthetic */ androidx.fragment.app.FragmentActivity mo12117() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.m29073()
                return r0
        }

        @Override // Yue.AbstractC2764
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public android.view.LayoutInflater mo12118() {
                r2 = this;
                androidx.fragment.app.FragmentActivity r0 = r2.f29162
                android.view.LayoutInflater r0 = r0.getLayoutInflater()
                androidx.fragment.app.FragmentActivity r1 = r2.f29162
                android.view.LayoutInflater r0 = r0.cloneInContext(r1)
                return r0
        }

        @Override // Yue.AbstractC2764
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public int mo12119() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                android.view.Window r0 = r0.getWindow()
                if (r0 != 0) goto La
                r0 = 0
                goto L10
            La:
                android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
                int r0 = r0.windowAnimations
            L10:
                return r0
        }

        @Override // Yue.AbstractC2764
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo12120() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // Yue.AbstractC2764
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public boolean mo12122(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1) {
                r0 = this;
                androidx.fragment.app.FragmentActivity r1 = r0.f29162
                boolean r1 = r1.isFinishing()
                r1 = r1 ^ 1
                return r1
        }

        @Override // Yue.AbstractC2764
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public boolean mo12123(@Yue.InterfaceC4410 java.lang.String r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                boolean r2 = Yue.C0188.m1054(r0, r2)
                return r2
        }

        @Override // Yue.AbstractC2764
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public void mo12127() {
                r0 = this;
                r0.invalidateMenu()
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public androidx.fragment.app.FragmentActivity m29073() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.f29162
                return r0
        }
    }

    public FragmentActivity() {
            r1 = this;
            r1.<init>()
            androidx.fragment.app.FragmentActivity$ۥ r0 = new androidx.fragment.app.FragmentActivity$ۥ
            r0.<init>(r1)
            Yue.ۥ۠ۢۧۨ r0 = Yue.C2763.m12071(r0)
            r1.mFragments = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mFragmentLifecycleRegistry = r0
            r0 = 1
            r1.mStopped = r0
            r1.m29068()
            return
    }

    @Yue.InterfaceC1578
    public FragmentActivity(@Yue.InterfaceC3573 int r1) {
            r0 = this;
            r0.<init>(r1)
            androidx.fragment.app.FragmentActivity$ۥ r1 = new androidx.fragment.app.FragmentActivity$ۥ
            r1.<init>(r0)
            Yue.ۥ۠ۢۧۨ r1 = Yue.C2763.m12071(r1)
            r0.mFragments = r1
            androidx.lifecycle.LifecycleRegistry r1 = new androidx.lifecycle.LifecycleRegistry
            r1.<init>(r0)
            r0.mFragmentLifecycleRegistry = r1
            r1 = 1
            r0.mStopped = r1
            r0.m29068()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m29063(androidx.fragment.app.FragmentActivity r0, android.content.Context r1) {
            r0.m29072(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m29064(androidx.fragment.app.FragmentActivity r0, android.content.res.Configuration r1) {
            r0.m29070(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ android.os.Bundle m29065(androidx.fragment.app.FragmentActivity r0) {
            android.os.Bundle r0 = r0.m29069()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m29066(androidx.fragment.app.FragmentActivity r0, android.content.Intent r1) {
            r0.m29071(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static boolean m29067(androidx.fragment.app.FragmentManager r5, androidx.lifecycle.Lifecycle.State r6) {
            java.util.List r5 = r5.m29162()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r5.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 != 0) goto L18
            goto L9
        L18:
            java.lang.Object r2 = r1.getHost()
            if (r2 == 0) goto L27
            androidx.fragment.app.FragmentManager r2 = r1.getChildFragmentManager()
            boolean r2 = m29067(r2, r6)
            r0 = r0 | r2
        L27:
            androidx.fragment.app.ۥ۟۟۠۠ r2 = r1.mViewLifecycleOwner
            r3 = 1
            if (r2 == 0) goto L42
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r2 = r2.isAtLeast(r4)
            if (r2 == 0) goto L42
            androidx.fragment.app.ۥ۟۟۠۠ r0 = r1.mViewLifecycleOwner
            r0.m29466(r6)
            r0 = r3
        L42:
            androidx.lifecycle.LifecycleRegistry r2 = r1.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r2 = r2.isAtLeast(r4)
            if (r2 == 0) goto L9
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.setCurrentState(r6)
            r0 = r3
            goto L9
        L57:
            return r0
    }

    @Yue.InterfaceC4544
    public final android.view.View dispatchFragmentsOnCreateView(@Yue.InterfaceC4544 android.view.View r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4410 android.content.Context r4, @Yue.InterfaceC4410 android.util.AttributeSet r5) {
            r1 = this;
            Yue.ۥ۠ۢۧۨ r0 = r1.mFragments
            android.view.View r2 = r0.m12103(r2, r3, r4, r5)
            return r2
    }

    @Override // android.app.Activity
    public void dump(@Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4544 java.io.FileDescriptor r4, @Yue.InterfaceC4410 java.io.PrintWriter r5, @Yue.InterfaceC4544 java.lang.String[] r6) {
            r2 = this;
            super.dump(r3, r4, r5, r6)
            boolean r0 = r2.shouldDumpInternalState(r6)
            if (r0 != 0) goto La
            return
        La:
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.mCreated
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.mResumed
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.mStopped
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto L61
            Yue.ۥۣ۠ۧۦ r1 = Yue.AbstractC3658.m14801(r2)
            r1.mo14803(r0, r4, r5, r6)
        L61:
            Yue.ۥ۠ۢۧۨ r0 = r2.mFragments
            androidx.fragment.app.FragmentManager r0 = r0.m12100()
            r0.m29136(r3, r4, r5, r6)
            return
    }

    @Yue.InterfaceC4410
    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
            r1 = this;
            Yue.ۥ۠ۢۧۨ r0 = r1.mFragments
            androidx.fragment.app.FragmentManager r0 = r0.m12100()
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public Yue.AbstractC3658 getSupportLoaderManager() {
            r1 = this;
            Yue.ۥۣ۠ۧۦ r0 = Yue.AbstractC3658.m14801(r1)
            return r0
    }

    public void markFragmentsCreated() {
            r2 = this;
        L0:
            androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r0 = m29067(r0, r1)
            if (r0 != 0) goto L0
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @Yue.InterfaceC0907
    public void onActivityResult(int r2, int r3, @Yue.InterfaceC4544 android.content.Intent r4) {
            r1 = this;
            Yue.ۥ۠ۢۧۨ r0 = r1.mFragments
            r0.m12102()
            super.onActivityResult(r2, r3, r4)
            return
    }

    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public void onAttachFragment(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1) {
            r0 = this;
            return
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Yue.InterfaceC4544 android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            androidx.lifecycle.LifecycleRegistry r2 = r1.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r2.handleLifecycleEvent(r0)
            Yue.ۥ۠ۢۧۨ r2 = r1.mFragments
            r2.m12076()
            return
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Yue.InterfaceC4544
    public android.view.View onCreateView(@Yue.InterfaceC4544 android.view.View r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4410 android.content.Context r4, @Yue.InterfaceC4410 android.util.AttributeSet r5) {
            r1 = this;
            android.view.View r0 = r1.dispatchFragmentsOnCreateView(r2, r3, r4, r5)
            if (r0 != 0) goto Lb
            android.view.View r2 = super.onCreateView(r2, r3, r4, r5)
            return r2
        Lb:
            return r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Yue.InterfaceC4544
    public android.view.View onCreateView(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 android.util.AttributeSet r4) {
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
            Yue.ۥ۠ۢۧۨ r0 = r2.mFragments
            r0.m12078()
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, @Yue.InterfaceC4410 android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            r0 = 6
            if (r2 != r0) goto L12
            Yue.ۥ۠ۢۧۨ r2 = r1.mFragments
            boolean r2 = r2.m12075(r3)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // android.app.Activity
    public void onPause() {
            r2 = this;
            super.onPause()
            r0 = 0
            r2.mResumed = r0
            Yue.ۥ۠ۢۧۨ r0 = r2.mFragments
            r0.m12084()
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
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
    @Yue.InterfaceC0907
    public void onRequestPermissionsResult(int r2, @Yue.InterfaceC4410 java.lang.String[] r3, @Yue.InterfaceC4410 int[] r4) {
            r1 = this;
            Yue.ۥ۠ۢۧۨ r0 = r1.mFragments
            r0.m12102()
            super.onRequestPermissionsResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void onResume() {
            r1 = this;
            Yue.ۥ۠ۢۧۨ r0 = r1.mFragments
            r0.m12102()
            super.onResume()
            r0 = 1
            r1.mResumed = r0
            Yue.ۥ۠ۢۧۨ r0 = r1.mFragments
            r0.m12096()
            return
    }

    public void onResumeFragments() {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            Yue.ۥ۠ۢۧۨ r0 = r2.mFragments
            r0.m12088()
            return
    }

    @Override // android.app.Activity
    public void onStart() {
            r2 = this;
            Yue.ۥ۠ۢۧۨ r0 = r2.mFragments
            r0.m12102()
            super.onStart()
            r0 = 0
            r2.mStopped = r0
            boolean r0 = r2.mCreated
            if (r0 != 0) goto L17
            r0 = 1
            r2.mCreated = r0
            Yue.ۥ۠ۢۧۨ r0 = r2.mFragments
            r0.m12073()
        L17:
            Yue.ۥ۠ۢۧۨ r0 = r2.mFragments
            r0.m12096()
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
            Yue.ۥ۠ۢۧۨ r0 = r2.mFragments
            r0.m12089()
            return
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
            r1 = this;
            Yue.ۥ۠ۢۧۨ r0 = r1.mFragments
            r0.m12102()
            return
    }

    @Override // android.app.Activity
    public void onStop() {
            r2 = this;
            super.onStop()
            r0 = 1
            r2.mStopped = r0
            r2.markFragmentsCreated()
            Yue.ۥ۠ۢۧۨ r0 = r2.mFragments
            r0.m12090()
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            return
    }

    public void setEnterSharedElementCallback(@Yue.InterfaceC4544 Yue.AbstractC5739 r1) {
            r0 = this;
            Yue.C0188.m1050(r0, r1)
            return
    }

    public void setExitSharedElementCallback(@Yue.InterfaceC4544 Yue.AbstractC5739 r1) {
            r0 = this;
            Yue.C0188.m1051(r0, r1)
            return
    }

    public void startActivityFromFragment(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 android.content.Intent r3, int r4) {
            r1 = this;
            r0 = 0
            r1.startActivityFromFragment(r2, r3, r4, r0)
            return
    }

    public void startActivityFromFragment(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 android.content.Intent r3, int r4, @Yue.InterfaceC4544 android.os.Bundle r5) {
            r1 = this;
            r0 = -1
            if (r4 != r0) goto L7
            Yue.C0188.m1055(r1, r3, r0, r5)
            return
        L7:
            r2.startActivityForResult(r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public void startIntentSenderFromFragment(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r10, @Yue.InterfaceC4410 android.content.IntentSender r11, int r12, @Yue.InterfaceC4544 android.content.Intent r13, int r14, int r15, int r16, @Yue.InterfaceC4544 android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            r0 = -1
            r3 = r12
            if (r3 != r0) goto L12
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            Yue.C0188.m1056(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L12:
            r10.startIntentSenderForResult(r11, r12, r13, r14, r15, r16, r17)
            return
    }

    public void supportFinishAfterTransition() {
            r0 = this;
            Yue.C0188.m1039(r0)
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
            Yue.C0188.m1045(r0)
            return
    }

    public void supportStartPostponedEnterTransition() {
            r0 = this;
            Yue.C0188.m1057(r0)
            return
    }

    @Override // Yue.C0188.InterfaceC0199
    @java.lang.Deprecated
    public final void validateRequestPermissionsRequestCode(int r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m29068() {
            r3 = this;
            androidx.savedstate.ۥ r0 = r3.getSavedStateRegistry()
            Yue.ۥۣ۠ۢۧ r1 = new Yue.ۥۣ۠ۢۧ
            r1.<init>(r3)
            java.lang.String r2 = "android:support:lifecycle"
            r0.m30366(r2, r1)
            Yue.ۥ۠ۢۧۤ r0 = new Yue.ۥ۠ۢۧۤ
            r0.<init>(r3)
            r3.addOnConfigurationChangedListener(r0)
            Yue.ۥ۠ۢۧۥ r0 = new Yue.ۥ۠ۢۧۥ
            r0.<init>(r3)
            r3.addOnNewIntentListener(r0)
            Yue.ۥ۠ۢۧۦ r0 = new Yue.ۥ۠ۢۧۦ
            r0.<init>(r3)
            r3.addOnContextAvailableListener(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final /* synthetic */ android.os.Bundle m29069() {
            r2 = this;
            r2.markFragmentsCreated()
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final /* synthetic */ void m29070(android.content.res.Configuration r1) {
            r0 = this;
            Yue.ۥ۠ۢۧۨ r1 = r0.mFragments
            r1.m12102()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final /* synthetic */ void m29071(android.content.Intent r1) {
            r0 = this;
            Yue.ۥ۠ۢۧۨ r1 = r0.mFragments
            r1.m12102()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final /* synthetic */ void m29072(android.content.Context r2) {
            r1 = this;
            Yue.ۥ۠ۢۧۨ r2 = r1.mFragments
            r0 = 0
            r2.m12072(r0)
            return
    }
}
