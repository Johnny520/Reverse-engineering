package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7627 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f29342 = "FragmentManager";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f29343 = "state";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f29344 = "savedInstanceState";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f29345 = "registryState";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f29346 = "childFragmentManager";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f29347 = "viewState";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f29348 = "viewRegistryState";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final java.lang.String f29349 = "arguments";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.fragment.app.C7619 f29350;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.fragment.app.C7631 f29351;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.fragment.app.Fragment f29352;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f29353;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f29354;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۧ$ۥ, reason: contains not printable characters */
    public class ViewOnAttachStateChangeListenerC7628 implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f29355;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.C7627 f29356;

        public ViewOnAttachStateChangeListenerC7628(androidx.fragment.app.C7627 r1, android.view.View r2) {
                r0 = this;
                r0.f29356 = r1
                r0.f29355 = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                android.view.View r1 = r0.f29355
                r1.removeOnAttachStateChangeListener(r0)
                android.view.View r1 = r0.f29355
                Yue.C6794.m26217(r1)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۧ$ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ class C7629 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f29357 = null;

        static {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.C7627.C7629.f29357 = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.fragment.app.C7627.C7629.f29357     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.fragment.app.C7627.C7629.f29357     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.fragment.app.C7627.C7629.f29357     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public C7627(@Yue.InterfaceC4410 androidx.fragment.app.C7619 r2, @Yue.InterfaceC4410 androidx.fragment.app.C7631 r3, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f29353 = r0
            r0 = -1
            r1.f29354 = r0
            r1.f29350 = r2
            r1.f29351 = r3
            r1.f29352 = r4
            return
    }

    public C7627(@Yue.InterfaceC4410 androidx.fragment.app.C7619 r3, @Yue.InterfaceC4410 androidx.fragment.app.C7631 r4, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r5, @Yue.InterfaceC4410 android.os.Bundle r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f29353 = r0
            r1 = -1
            r2.f29354 = r1
            r2.f29350 = r3
            r2.f29351 = r4
            r2.f29352 = r5
            r3 = 0
            r5.mSavedViewState = r3
            r5.mSavedViewRegistryState = r3
            r5.mBackStackNesting = r0
            r5.mInLayout = r0
            r5.mAdded = r0
            androidx.fragment.app.Fragment r4 = r5.mTarget
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.mWho
            goto L22
        L21:
            r4 = r3
        L22:
            r5.mTargetWho = r4
            r5.mTarget = r3
            r5.mSavedFragmentState = r6
            java.lang.String r3 = "arguments"
            android.os.Bundle r3 = r6.getBundle(r3)
            r5.mArguments = r3
            return
    }

    public C7627(@Yue.InterfaceC4410 androidx.fragment.app.C7619 r2, @Yue.InterfaceC4410 androidx.fragment.app.C7631 r3, @Yue.InterfaceC4410 java.lang.ClassLoader r4, @Yue.InterfaceC4410 androidx.fragment.app.C7616 r5, @Yue.InterfaceC4410 android.os.Bundle r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f29353 = r0
            r0 = -1
            r1.f29354 = r0
            r1.f29350 = r2
            r1.f29351 = r3
            java.lang.String r2 = "state"
            android.os.Parcelable r2 = r6.getParcelable(r2)
            androidx.fragment.app.ۥ۟۟۟ۦ r2 = (androidx.fragment.app.C7625) r2
            androidx.fragment.app.Fragment r2 = r2.m29377(r5, r4)
            r1.f29352 = r2
            r2.mSavedFragmentState = r6
            java.lang.String r3 = "arguments"
            android.os.Bundle r3 = r6.getBundle(r3)
            if (r3 == 0) goto L28
            r3.setClassLoader(r4)
        L28:
            r2.setArguments(r3)
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.m29090(r3)
            if (r3 == 0) goto L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Instantiated fragment "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L48:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m29380() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.f29352
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r4.f29352
            android.os.Bundle r0 = r0.mSavedFragmentState
            if (r0 == 0) goto L2c
            java.lang.String r1 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r1)
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.fragment.app.Fragment r1 = r4.f29352
            r1.performActivityCreated(r0)
            androidx.fragment.app.ۥۣ۟۟۟ r1 = r4.f29350
            androidx.fragment.app.Fragment r2 = r4.f29352
            r3 = 0
            r1.m29344(r2, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m29381() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.f29352
            android.view.ViewGroup r0 = r0.mContainer
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.FragmentManager.m29088(r0)
            androidx.fragment.app.Fragment r1 = r3.f29352
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r0 == 0) goto L1d
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1d
            androidx.fragment.app.Fragment r1 = r3.f29352
            int r2 = r1.mContainerId
            Yue.C2779.m12163(r1, r0, r2)
        L1d:
            androidx.fragment.app.ۥ۟۟۠ r0 = r3.f29351
            androidx.fragment.app.Fragment r1 = r3.f29352
            int r0 = r0.m29412(r1)
            androidx.fragment.app.Fragment r1 = r3.f29352
            android.view.ViewGroup r2 = r1.mContainer
            android.view.View r1 = r1.mView
            r2.addView(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29382() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ATTACHED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r6.f29352
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r6.f29352
            androidx.fragment.app.Fragment r1 = r0.mTarget
            r2 = 0
            java.lang.String r3 = " that does not belong to this FragmentManager!"
            java.lang.String r4 = " declared target fragment "
            java.lang.String r5 = "Fragment "
            if (r1 == 0) goto L66
            androidx.fragment.app.ۥ۟۟۠ r0 = r6.f29351
            java.lang.String r1 = r1.mWho
            androidx.fragment.app.ۥ۟۟۟ۧ r0 = r0.m29417(r1)
            if (r0 == 0) goto L42
            androidx.fragment.app.Fragment r1 = r6.f29352
            androidx.fragment.app.Fragment r3 = r1.mTarget
            java.lang.String r3 = r3.mWho
            r1.mTargetWho = r3
            r1.mTarget = r2
            r2 = r0
            goto L97
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            androidx.fragment.app.Fragment r2 = r6.f29352
            r1.append(r2)
            r1.append(r4)
            androidx.fragment.app.Fragment r2 = r6.f29352
            androidx.fragment.app.Fragment r2 = r2.mTarget
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L66:
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L97
            androidx.fragment.app.ۥ۟۟۠ r1 = r6.f29351
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = r1.m29417(r0)
            if (r2 == 0) goto L73
            goto L97
        L73:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            androidx.fragment.app.Fragment r2 = r6.f29352
            r1.append(r2)
            r1.append(r4)
            androidx.fragment.app.Fragment r2 = r6.f29352
            java.lang.String r2 = r2.mTargetWho
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L97:
            if (r2 == 0) goto L9c
            r2.m29392()
        L9c:
            androidx.fragment.app.Fragment r0 = r6.f29352
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            Yue.ۥ۠ۢۨ r1 = r1.m29163()
            r0.mHost = r1
            androidx.fragment.app.Fragment r0 = r6.f29352
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            androidx.fragment.app.Fragment r1 = r1.m29166()
            r0.mParentFragment = r1
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r6.f29350
            androidx.fragment.app.Fragment r1 = r6.f29352
            r2 = 0
            r0.m29350(r1, r2)
            androidx.fragment.app.Fragment r0 = r6.f29352
            r0.performAttach()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r6.f29350
            androidx.fragment.app.Fragment r1 = r6.f29352
            r0.m29345(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m29383() {
            r9 = this;
            androidx.fragment.app.Fragment r0 = r9.f29352
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            if (r1 != 0) goto L9
            int r0 = r0.mState
            return r0
        L9:
            int r1 = r9.f29354
            int[] r2 = androidx.fragment.app.C7627.C7629.f29357
            androidx.lifecycle.Lifecycle$State r0 = r0.mMaxState
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 5
            r3 = -1
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L37
            if (r0 == r6) goto L33
            if (r0 == r4) goto L2e
            if (r0 == r5) goto L28
            int r1 = java.lang.Math.min(r1, r3)
            goto L37
        L28:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
            goto L37
        L2e:
            int r1 = java.lang.Math.min(r1, r7)
            goto L37
        L33:
            int r1 = java.lang.Math.min(r1, r2)
        L37:
            androidx.fragment.app.Fragment r0 = r9.f29352
            boolean r8 = r0.mFromLayout
            if (r8 == 0) goto L67
            boolean r8 = r0.mInLayout
            if (r8 == 0) goto L58
            int r0 = r9.f29354
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.Fragment r0 = r9.f29352
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L67
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L67
            int r1 = java.lang.Math.min(r1, r6)
            goto L67
        L58:
            int r8 = r9.f29354
            if (r8 >= r5) goto L63
            int r0 = r0.mState
            int r1 = java.lang.Math.min(r1, r0)
            goto L67
        L63:
            int r1 = java.lang.Math.min(r1, r7)
        L67:
            androidx.fragment.app.Fragment r0 = r9.f29352
            boolean r0 = r0.mAdded
            if (r0 != 0) goto L71
            int r1 = java.lang.Math.min(r1, r7)
        L71:
            androidx.fragment.app.Fragment r0 = r9.f29352
            android.view.ViewGroup r8 = r0.mContainer
            if (r8 == 0) goto L84
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥ۟۟۠ۡ r0 = androidx.fragment.app.AbstractC7635.m29472(r8, r0)
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r0 = r0.m29483(r9)
            goto L85
        L84:
            r0 = 0
        L85:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r8 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29443
            if (r0 != r8) goto L8f
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto Lad
        L8f:
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ r8 = androidx.fragment.app.AbstractC7635.C7638.EnumC7639.f29444
            if (r0 != r8) goto L98
            int r1 = java.lang.Math.max(r1, r4)
            goto Lad
        L98:
            androidx.fragment.app.Fragment r0 = r9.f29352
            boolean r4 = r0.mRemoving
            if (r4 == 0) goto Lad
            boolean r0 = r0.isInBackStack()
            if (r0 == 0) goto La9
            int r1 = java.lang.Math.min(r1, r7)
            goto Lad
        La9:
            int r1 = java.lang.Math.min(r1, r3)
        Lad:
            androidx.fragment.app.Fragment r0 = r9.f29352
            boolean r3 = r0.mDeferStart
            if (r3 == 0) goto Lbb
            int r0 = r0.mState
            if (r0 >= r2) goto Lbb
            int r1 = java.lang.Math.min(r1, r5)
        Lbb:
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r6)
            if (r0 == 0) goto Le1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "computeExpectedState() of "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = " for "
            r0.append(r2)
            androidx.fragment.app.Fragment r2 = r9.f29352
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        Le1:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29384() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.f29352
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r4.f29352
            android.os.Bundle r0 = r0.mSavedFragmentState
            if (r0 == 0) goto L2c
            java.lang.String r1 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r1)
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.fragment.app.Fragment r1 = r4.f29352
            boolean r2 = r1.mIsCreated
            if (r2 != 0) goto L46
            androidx.fragment.app.ۥۣ۟۟۟ r2 = r4.f29350
            r3 = 0
            r2.m29351(r1, r0, r3)
            androidx.fragment.app.Fragment r1 = r4.f29352
            r1.performCreate(r0)
            androidx.fragment.app.ۥۣ۟۟۟ r1 = r4.f29350
            androidx.fragment.app.Fragment r2 = r4.f29352
            r1.m29346(r2, r0, r3)
            goto L4c
        L46:
            r0 = 1
            r1.mState = r0
            r1.restoreChildFragmentState()
        L4c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m29385() {
            r8 = this;
            androidx.fragment.app.Fragment r0 = r8.f29352
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "moveto CREATE_VIEW: "
            r1.append(r3)
            androidx.fragment.app.Fragment r3 = r8.f29352
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L26:
            androidx.fragment.app.Fragment r1 = r8.f29352
            android.os.Bundle r1 = r1.mSavedFragmentState
            r3 = 0
            if (r1 == 0) goto L34
            java.lang.String r4 = "savedInstanceState"
            android.os.Bundle r1 = r1.getBundle(r4)
            goto L35
        L34:
            r1 = r3
        L35:
            androidx.fragment.app.Fragment r4 = r8.f29352
            android.view.LayoutInflater r4 = r4.performGetLayoutInflater(r1)
            androidx.fragment.app.Fragment r5 = r8.f29352
            android.view.ViewGroup r6 = r5.mContainer
            if (r6 == 0) goto L44
            r3 = r6
            goto Lcc
        L44:
            int r6 = r5.mContainerId
            if (r6 == 0) goto Lcc
            r3 = -1
            if (r6 == r3) goto Lae
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            Yue.ۥ۠ۢۧۧ r3 = r3.m29157()
            androidx.fragment.app.Fragment r5 = r8.f29352
            int r5 = r5.mContainerId
            android.view.View r3 = r3.mo12069(r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 != 0) goto La4
            androidx.fragment.app.Fragment r5 = r8.f29352
            boolean r6 = r5.mRestored
            if (r6 == 0) goto L64
            goto Lcc
        L64:
            android.content.res.Resources r0 = r5.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L71
            androidx.fragment.app.Fragment r1 = r8.f29352     // Catch: android.content.res.Resources.NotFoundException -> L71
            int r1 = r1.mContainerId     // Catch: android.content.res.Resources.NotFoundException -> L71
            java.lang.String r0 = r0.getResourceName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L71
            goto L73
        L71:
            java.lang.String r0 = "unknown"
        L73:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            androidx.fragment.app.Fragment r3 = r8.f29352
            int r3 = r3.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r8.f29352
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        La4:
            boolean r5 = r3 instanceof androidx.fragment.app.FragmentContainerView
            if (r5 != 0) goto Lcc
            androidx.fragment.app.Fragment r5 = r8.f29352
            Yue.C2779.m12162(r5, r3)
            goto Lcc
        Lae:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r8.f29352
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lcc:
            androidx.fragment.app.Fragment r5 = r8.f29352
            r5.mContainer = r3
            r5.performCreateView(r4, r3, r1)
            androidx.fragment.app.Fragment r4 = r8.f29352
            android.view.View r4 = r4.mView
            r5 = 2
            if (r4 == 0) goto L19b
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto Lf6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "moveto VIEW_CREATED: "
            r0.append(r4)
            androidx.fragment.app.Fragment r4 = r8.f29352
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        Lf6:
            androidx.fragment.app.Fragment r0 = r8.f29352
            android.view.View r0 = r0.mView
            r4 = 0
            r0.setSaveFromParentEnabled(r4)
            androidx.fragment.app.Fragment r0 = r8.f29352
            android.view.View r6 = r0.mView
            int r7 = Yue.C5040.C5043.f16384
            r6.setTag(r7, r0)
            if (r3 == 0) goto L10c
            r8.m29381()
        L10c:
            androidx.fragment.app.Fragment r0 = r8.f29352
            boolean r3 = r0.mHidden
            if (r3 == 0) goto L119
            android.view.View r0 = r0.mView
            r3 = 8
            r0.setVisibility(r3)
        L119:
            androidx.fragment.app.Fragment r0 = r8.f29352
            android.view.View r0 = r0.mView
            boolean r0 = Yue.C6794.m26181(r0)
            if (r0 == 0) goto L12b
            androidx.fragment.app.Fragment r0 = r8.f29352
            android.view.View r0 = r0.mView
            Yue.C6794.m26217(r0)
            goto L137
        L12b:
            androidx.fragment.app.Fragment r0 = r8.f29352
            android.view.View r0 = r0.mView
            androidx.fragment.app.ۥ۟۟۟ۧ$ۥ r3 = new androidx.fragment.app.ۥ۟۟۟ۧ$ۥ
            r3.<init>(r8, r0)
            r0.addOnAttachStateChangeListener(r3)
        L137:
            androidx.fragment.app.Fragment r0 = r8.f29352
            r0.performViewCreated()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r8.f29350
            androidx.fragment.app.Fragment r3 = r8.f29352
            android.view.View r6 = r3.mView
            r0.m29356(r3, r6, r1, r4)
            androidx.fragment.app.Fragment r0 = r8.f29352
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r1 = r8.f29352
            android.view.View r1 = r1.mView
            float r1 = r1.getAlpha()
            androidx.fragment.app.Fragment r3 = r8.f29352
            r3.setPostOnViewCreatedAlpha(r1)
            androidx.fragment.app.Fragment r1 = r8.f29352
            android.view.ViewGroup r3 = r1.mContainer
            if (r3 == 0) goto L19b
            if (r0 != 0) goto L19b
            android.view.View r0 = r1.mView
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L193
            androidx.fragment.app.Fragment r1 = r8.f29352
            r1.setFocusedView(r0)
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r5)
            if (r1 == 0) goto L193
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "requestFocus: Saved focused view "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " for Fragment "
            r1.append(r0)
            androidx.fragment.app.Fragment r0 = r8.f29352
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
        L193:
            androidx.fragment.app.Fragment r0 = r8.f29352
            android.view.View r0 = r0.mView
            r1 = 0
            r0.setAlpha(r1)
        L19b:
            androidx.fragment.app.Fragment r0 = r8.f29352
            r0.mState = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m29386() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r6.f29352
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r6.f29352
            boolean r1 = r0.mRemoving
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L2f
            r0 = r3
            goto L30
        L2f:
            r0 = r2
        L30:
            r1 = 0
            if (r0 == 0) goto L40
            androidx.fragment.app.Fragment r4 = r6.f29352
            boolean r5 = r4.mBeingSaved
            if (r5 != 0) goto L40
            androidx.fragment.app.ۥ۟۟۠ r5 = r6.f29351
            java.lang.String r4 = r4.mWho
            r5.m29431(r4, r1)
        L40:
            if (r0 != 0) goto L6d
            androidx.fragment.app.ۥ۟۟۠ r4 = r6.f29351
            androidx.fragment.app.ۥ۟۟۟ۥ r4 = r4.m29419()
            androidx.fragment.app.Fragment r5 = r6.f29352
            boolean r4 = r4.m29376(r5)
            if (r4 == 0) goto L51
            goto L6d
        L51:
            androidx.fragment.app.Fragment r0 = r6.f29352
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L67
            androidx.fragment.app.ۥ۟۟۠ r1 = r6.f29351
            androidx.fragment.app.Fragment r0 = r1.m29408(r0)
            if (r0 == 0) goto L67
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto L67
            androidx.fragment.app.Fragment r1 = r6.f29352
            r1.mTarget = r0
        L67:
            androidx.fragment.app.Fragment r0 = r6.f29352
            r0.mState = r2
            goto Lf6
        L6d:
            androidx.fragment.app.Fragment r4 = r6.f29352
            Yue.ۥ۠ۢۨ<?> r4 = r4.mHost
            boolean r5 = r4 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r5 == 0) goto L80
            androidx.fragment.app.ۥ۟۟۠ r3 = r6.f29351
            androidx.fragment.app.ۥ۟۟۟ۥ r3 = r3.m29419()
            boolean r3 = r3.m29372()
            goto L93
        L80:
            android.content.Context r5 = r4.m12114()
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L93
            android.content.Context r4 = r4.m12114()
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r4 = r4.isChangingConfigurations()
            r3 = r3 ^ r4
        L93:
            if (r0 == 0) goto L9b
            androidx.fragment.app.Fragment r0 = r6.f29352
            boolean r0 = r0.mBeingSaved
            if (r0 == 0) goto L9d
        L9b:
            if (r3 == 0) goto La8
        L9d:
            androidx.fragment.app.ۥ۟۟۠ r0 = r6.f29351
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = r0.m29419()
            androidx.fragment.app.Fragment r3 = r6.f29352
            r0.m29364(r3)
        La8:
            androidx.fragment.app.Fragment r0 = r6.f29352
            r0.performDestroy()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r6.f29350
            androidx.fragment.app.Fragment r3 = r6.f29352
            r0.m29347(r3, r2)
            androidx.fragment.app.ۥ۟۟۠ r0 = r6.f29351
            java.util.List r0 = r0.m29414()
            java.util.Iterator r0 = r0.iterator()
        Lbe:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Le3
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = (androidx.fragment.app.C7627) r2
            if (r2 == 0) goto Lbe
            androidx.fragment.app.Fragment r2 = r2.m29390()
            androidx.fragment.app.Fragment r3 = r6.f29352
            java.lang.String r3 = r3.mWho
            java.lang.String r4 = r2.mTargetWho
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lbe
            androidx.fragment.app.Fragment r3 = r6.f29352
            r2.mTarget = r3
            r2.mTargetWho = r1
            goto Lbe
        Le3:
            androidx.fragment.app.Fragment r0 = r6.f29352
            java.lang.String r1 = r0.mTargetWho
            if (r1 == 0) goto Lf1
            androidx.fragment.app.ۥ۟۟۠ r2 = r6.f29351
            androidx.fragment.app.Fragment r1 = r2.m29408(r1)
            r0.mTarget = r1
        Lf1:
            androidx.fragment.app.ۥ۟۟۠ r0 = r6.f29351
            r0.m29422(r6)
        Lf6:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m29387() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.f29352
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r3.f29352
            android.view.ViewGroup r1 = r0.mContainer
            if (r1 == 0) goto L2c
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L2c
            r1.removeView(r0)
        L2c:
            androidx.fragment.app.Fragment r0 = r3.f29352
            r0.performDestroyView()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r3.f29350
            androidx.fragment.app.Fragment r1 = r3.f29352
            r2 = 0
            r0.m29357(r1, r2)
            androidx.fragment.app.Fragment r0 = r3.f29352
            r1 = 0
            r0.mContainer = r1
            r0.mView = r1
            r0.mViewLifecycleOwner = r1
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r0.mViewLifecycleOwnerLiveData
            r0.setValue(r1)
            androidx.fragment.app.Fragment r0 = r3.f29352
            r0.mInLayout = r2
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m29388() {
            r5 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom ATTACHED: "
            r1.append(r3)
            androidx.fragment.app.Fragment r3 = r5.f29352
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1f:
            androidx.fragment.app.Fragment r1 = r5.f29352
            r1.performDetach()
            androidx.fragment.app.ۥۣ۟۟۟ r1 = r5.f29350
            androidx.fragment.app.Fragment r3 = r5.f29352
            r4 = 0
            r1.m29348(r3, r4)
            androidx.fragment.app.Fragment r1 = r5.f29352
            r3 = -1
            r1.mState = r3
            r3 = 0
            r1.mHost = r3
            r1.mParentFragment = r3
            r1.mFragmentManager = r3
            boolean r3 = r1.mRemoving
            if (r3 == 0) goto L43
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L43
            goto L51
        L43:
            androidx.fragment.app.ۥ۟۟۠ r1 = r5.f29351
            androidx.fragment.app.ۥ۟۟۟ۥ r1 = r1.m29419()
            androidx.fragment.app.Fragment r3 = r5.f29352
            boolean r1 = r1.m29376(r3)
            if (r1 == 0) goto L72
        L51:
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "initState called for fragment: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r5.f29352
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L6d:
            androidx.fragment.app.Fragment r0 = r5.f29352
            r0.initState()
        L72:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m29389() {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.f29352
            boolean r1 = r0.mFromLayout
            if (r1 == 0) goto L78
            boolean r1 = r0.mInLayout
            if (r1 == 0) goto L78
            boolean r0 = r0.mPerformedCreateView
            if (r0 != 0) goto L78
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r5.f29352
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L2d:
            androidx.fragment.app.Fragment r0 = r5.f29352
            android.os.Bundle r0 = r0.mSavedFragmentState
            r1 = 0
            if (r0 == 0) goto L3b
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r2)
            goto L3c
        L3b:
            r0 = r1
        L3c:
            androidx.fragment.app.Fragment r2 = r5.f29352
            android.view.LayoutInflater r3 = r2.performGetLayoutInflater(r0)
            r2.performCreateView(r3, r1, r0)
            androidx.fragment.app.Fragment r1 = r5.f29352
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L78
            r2 = 0
            r1.setSaveFromParentEnabled(r2)
            androidx.fragment.app.Fragment r1 = r5.f29352
            android.view.View r3 = r1.mView
            int r4 = Yue.C5040.C5043.f16384
            r3.setTag(r4, r1)
            androidx.fragment.app.Fragment r1 = r5.f29352
            boolean r3 = r1.mHidden
            if (r3 == 0) goto L65
            android.view.View r1 = r1.mView
            r3 = 8
            r1.setVisibility(r3)
        L65:
            androidx.fragment.app.Fragment r1 = r5.f29352
            r1.performViewCreated()
            androidx.fragment.app.ۥۣ۟۟۟ r1 = r5.f29350
            androidx.fragment.app.Fragment r3 = r5.f29352
            android.view.View r4 = r3.mView
            r1.m29356(r3, r4, r0, r2)
            androidx.fragment.app.Fragment r0 = r5.f29352
            r1 = 2
            r0.mState = r1
        L78:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29390() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.f29352
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m29391(@Yue.InterfaceC4410 android.view.View r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f29352
            android.view.View r0 = r0.mView
            r1 = 1
            if (r3 != r0) goto L8
            return r1
        L8:
            android.view.ViewParent r3 = r3.getParent()
        Lc:
            if (r3 == 0) goto L1a
            androidx.fragment.app.Fragment r0 = r2.f29352
            android.view.View r0 = r0.mView
            if (r3 != r0) goto L15
            return r1
        L15:
            android.view.ViewParent r3 = r3.getParent()
            goto Lc
        L1a:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29392() {
            r9 = this;
            boolean r0 = r9.f29353
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r0 == 0) goto L26
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r1)
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring re-entrant call to moveToExpectedState() for "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r9.m29390()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L25:
            return
        L26:
            r0 = 0
            r3 = 1
            r9.f29353 = r3     // Catch: java.lang.Throwable -> L44
            r4 = r0
        L2b:
            int r5 = r9.m29383()     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.Fragment r6 = r9.f29352     // Catch: java.lang.Throwable -> L44
            int r7 = r6.mState     // Catch: java.lang.Throwable -> L44
            r8 = 3
            if (r5 == r7) goto L129
            if (r5 <= r7) goto L8e
            int r7 = r7 + 1
            switch(r7) {
                case 0: goto L89;
                case 1: goto L84;
                case 2: goto L7c;
                case 3: goto L77;
                case 4: goto L51;
                case 5: goto L4c;
                case 6: goto L47;
                case 7: goto L3f;
                default: goto L3d;
            }     // Catch: java.lang.Throwable -> L44
        L3d:
            goto L126
        L3f:
            r9.m29395()     // Catch: java.lang.Throwable -> L44
            goto L126
        L44:
            r1 = move-exception
            goto L1ca
        L47:
            r4 = 6
            r6.mState = r4     // Catch: java.lang.Throwable -> L44
            goto L126
        L4c:
            r9.m29400()     // Catch: java.lang.Throwable -> L44
            goto L126
        L51:
            android.view.View r4 = r6.mView     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L70
            android.view.ViewGroup r4 = r6.mContainer     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L70
            androidx.fragment.app.FragmentManager r5 = r6.getParentFragmentManager()     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.ۥ۟۟۠ۡ r4 = androidx.fragment.app.AbstractC7635.m29472(r4, r5)     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.Fragment r5 = r9.f29352     // Catch: java.lang.Throwable -> L44
            android.view.View r5 = r5.mView     // Catch: java.lang.Throwable -> L44
            int r5 = r5.getVisibility()     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ r5 = androidx.fragment.app.AbstractC7635.C7638.EnumC7640.m29508(r5)     // Catch: java.lang.Throwable -> L44
            r4.m29474(r5, r9)     // Catch: java.lang.Throwable -> L44
        L70:
            androidx.fragment.app.Fragment r4 = r9.f29352     // Catch: java.lang.Throwable -> L44
            r5 = 4
            r4.mState = r5     // Catch: java.lang.Throwable -> L44
            goto L126
        L77:
            r9.m29380()     // Catch: java.lang.Throwable -> L44
            goto L126
        L7c:
            r9.m29389()     // Catch: java.lang.Throwable -> L44
            r9.m29385()     // Catch: java.lang.Throwable -> L44
            goto L126
        L84:
            r9.m29384()     // Catch: java.lang.Throwable -> L44
            goto L126
        L89:
            r9.m29382()     // Catch: java.lang.Throwable -> L44
            goto L126
        L8e:
            int r7 = r7 + (-1)
            switch(r7) {
                case -1: goto L123;
                case 0: goto L104;
                case 1: goto Lfc;
                case 2: goto Lf7;
                case 3: goto La4;
                case 4: goto L9f;
                case 5: goto L9a;
                case 6: goto L95;
                default: goto L93;
            }     // Catch: java.lang.Throwable -> L44
        L93:
            goto L126
        L95:
            r9.m29393()     // Catch: java.lang.Throwable -> L44
            goto L126
        L9a:
            r4 = 5
            r6.mState = r4     // Catch: java.lang.Throwable -> L44
            goto L126
        L9f:
            r9.m29401()     // Catch: java.lang.Throwable -> L44
            goto L126
        La4:
            boolean r4 = androidx.fragment.app.FragmentManager.m29090(r8)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto Lc0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r4.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "movefrom ACTIVITY_CREATED: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.Fragment r5 = r9.f29352     // Catch: java.lang.Throwable -> L44
            r4.append(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L44
            android.util.Log.d(r2, r4)     // Catch: java.lang.Throwable -> L44
        Lc0:
            androidx.fragment.app.Fragment r4 = r9.f29352     // Catch: java.lang.Throwable -> L44
            boolean r5 = r4.mBeingSaved     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto Ld2
            androidx.fragment.app.ۥ۟۟۠ r5 = r9.f29351     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = r4.mWho     // Catch: java.lang.Throwable -> L44
            android.os.Bundle r6 = r9.m29397()     // Catch: java.lang.Throwable -> L44
            r5.m29431(r4, r6)     // Catch: java.lang.Throwable -> L44
            goto Ldd
        Ld2:
            android.view.View r5 = r4.mView     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto Ldd
            android.util.SparseArray<android.os.Parcelable> r4 = r4.mSavedViewState     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto Ldd
            r9.m29398()     // Catch: java.lang.Throwable -> L44
        Ldd:
            androidx.fragment.app.Fragment r4 = r9.f29352     // Catch: java.lang.Throwable -> L44
            android.view.View r5 = r4.mView     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto Lf2
            android.view.ViewGroup r5 = r4.mContainer     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto Lf2
            androidx.fragment.app.FragmentManager r4 = r4.getParentFragmentManager()     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.ۥ۟۟۠ۡ r4 = androidx.fragment.app.AbstractC7635.m29472(r5, r4)     // Catch: java.lang.Throwable -> L44
            r4.m29476(r9)     // Catch: java.lang.Throwable -> L44
        Lf2:
            androidx.fragment.app.Fragment r4 = r9.f29352     // Catch: java.lang.Throwable -> L44
            r4.mState = r8     // Catch: java.lang.Throwable -> L44
            goto L126
        Lf7:
            r6.mInLayout = r0     // Catch: java.lang.Throwable -> L44
            r6.mState = r1     // Catch: java.lang.Throwable -> L44
            goto L126
        Lfc:
            r9.m29387()     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.Fragment r4 = r9.f29352     // Catch: java.lang.Throwable -> L44
            r4.mState = r3     // Catch: java.lang.Throwable -> L44
            goto L126
        L104:
            boolean r4 = r6.mBeingSaved     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L11f
            androidx.fragment.app.ۥ۟۟۠ r4 = r9.f29351     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r6.mWho     // Catch: java.lang.Throwable -> L44
            android.os.Bundle r4 = r4.m29420(r5)     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L11f
            androidx.fragment.app.ۥ۟۟۠ r4 = r9.f29351     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.Fragment r5 = r9.f29352     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r5.mWho     // Catch: java.lang.Throwable -> L44
            android.os.Bundle r6 = r9.m29397()     // Catch: java.lang.Throwable -> L44
            r4.m29431(r5, r6)     // Catch: java.lang.Throwable -> L44
        L11f:
            r9.m29386()     // Catch: java.lang.Throwable -> L44
            goto L126
        L123:
            r9.m29388()     // Catch: java.lang.Throwable -> L44
        L126:
            r4 = r3
            goto L2b
        L129:
            if (r4 != 0) goto L18b
            r1 = -1
            if (r7 != r1) goto L18b
            boolean r1 = r6.mRemoving     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L18b
            boolean r1 = r6.isInBackStack()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L18b
            androidx.fragment.app.Fragment r1 = r9.f29352     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.mBeingSaved     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L18b
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r8)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L15a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r1.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "Cleaning up state of never attached fragment: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.Fragment r3 = r9.f29352     // Catch: java.lang.Throwable -> L44
            r1.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L44
            android.util.Log.d(r2, r1)     // Catch: java.lang.Throwable -> L44
        L15a:
            androidx.fragment.app.ۥ۟۟۠ r1 = r9.f29351     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.ۥ۟۟۟ۥ r1 = r1.m29419()     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.Fragment r3 = r9.f29352     // Catch: java.lang.Throwable -> L44
            r1.m29364(r3)     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.ۥ۟۟۠ r1 = r9.f29351     // Catch: java.lang.Throwable -> L44
            r1.m29422(r9)     // Catch: java.lang.Throwable -> L44
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r8)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L186
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r1.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "initState called for fragment: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.Fragment r3 = r9.f29352     // Catch: java.lang.Throwable -> L44
            r1.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L44
            android.util.Log.d(r2, r1)     // Catch: java.lang.Throwable -> L44
        L186:
            androidx.fragment.app.Fragment r1 = r9.f29352     // Catch: java.lang.Throwable -> L44
            r1.initState()     // Catch: java.lang.Throwable -> L44
        L18b:
            androidx.fragment.app.Fragment r1 = r9.f29352     // Catch: java.lang.Throwable -> L44
            boolean r2 = r1.mHiddenChanged     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L1c7
            android.view.View r2 = r1.mView     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L1ae
            android.view.ViewGroup r2 = r1.mContainer     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L1ae
            androidx.fragment.app.FragmentManager r1 = r1.getParentFragmentManager()     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.ۥ۟۟۠ۡ r1 = androidx.fragment.app.AbstractC7635.m29472(r2, r1)     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.Fragment r2 = r9.f29352     // Catch: java.lang.Throwable -> L44
            boolean r2 = r2.mHidden     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L1ab
            r1.m29475(r9)     // Catch: java.lang.Throwable -> L44
            goto L1ae
        L1ab:
            r1.m29477(r9)     // Catch: java.lang.Throwable -> L44
        L1ae:
            androidx.fragment.app.Fragment r1 = r9.f29352     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.FragmentManager r2 = r1.mFragmentManager     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L1b7
            r2.m29173(r1)     // Catch: java.lang.Throwable -> L44
        L1b7:
            androidx.fragment.app.Fragment r1 = r9.f29352     // Catch: java.lang.Throwable -> L44
            r1.mHiddenChanged = r0     // Catch: java.lang.Throwable -> L44
            boolean r2 = r1.mHidden     // Catch: java.lang.Throwable -> L44
            r1.onHiddenChanged(r2)     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.Fragment r1 = r9.f29352     // Catch: java.lang.Throwable -> L44
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager     // Catch: java.lang.Throwable -> L44
            r1.m29122()     // Catch: java.lang.Throwable -> L44
        L1c7:
            r9.f29353 = r0
            return
        L1ca:
            r9.f29353 = r0
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m29393() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.f29352
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r3.f29352
            r0.performPause()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r3.f29350
            androidx.fragment.app.Fragment r1 = r3.f29352
            r2 = 0
            r0.m29349(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m29394(@Yue.InterfaceC4410 java.lang.ClassLoader r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f29352
            android.os.Bundle r0 = r0.mSavedFragmentState
            if (r0 != 0) goto L7
            return
        L7:
            r0.setClassLoader(r3)
            androidx.fragment.app.Fragment r3 = r2.f29352
            android.os.Bundle r3 = r3.mSavedFragmentState
            java.lang.String r0 = "savedInstanceState"
            android.os.Bundle r3 = r3.getBundle(r0)
            if (r3 != 0) goto L22
            androidx.fragment.app.Fragment r3 = r2.f29352
            android.os.Bundle r3 = r3.mSavedFragmentState
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r3.putBundle(r0, r1)
        L22:
            androidx.fragment.app.Fragment r3 = r2.f29352
            android.os.Bundle r0 = r3.mSavedFragmentState
            java.lang.String r1 = "viewState"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r3.mSavedViewState = r0
            androidx.fragment.app.Fragment r3 = r2.f29352
            android.os.Bundle r0 = r3.mSavedFragmentState
            java.lang.String r1 = "viewRegistryState"
            android.os.Bundle r0 = r0.getBundle(r1)
            r3.mSavedViewRegistryState = r0
            androidx.fragment.app.Fragment r3 = r2.f29352
            android.os.Bundle r3 = r3.mSavedFragmentState
            java.lang.String r0 = "state"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            androidx.fragment.app.ۥ۟۟۟ۦ r3 = (androidx.fragment.app.C7625) r3
            if (r3 == 0) goto L66
            androidx.fragment.app.Fragment r0 = r2.f29352
            java.lang.String r1 = r3.f29339
            r0.mTargetWho = r1
            int r1 = r3.f29340
            r0.mTargetRequestCode = r1
            java.lang.Boolean r1 = r0.mSavedUserVisibleHint
            if (r1 == 0) goto L62
            boolean r3 = r1.booleanValue()
            r0.mUserVisibleHint = r3
            androidx.fragment.app.Fragment r3 = r2.f29352
            r0 = 0
            r3.mSavedUserVisibleHint = r0
            goto L66
        L62:
            boolean r3 = r3.f29341
            r0.mUserVisibleHint = r3
        L66:
            androidx.fragment.app.Fragment r3 = r2.f29352
            boolean r0 = r3.mUserVisibleHint
            if (r0 != 0) goto L6f
            r0 = 1
            r3.mDeferStart = r0
        L6f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m29395() {
            r5 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            r0.append(r2)
            androidx.fragment.app.Fragment r2 = r5.f29352
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r5.f29352
            android.view.View r0 = r0.getFocusedView()
            if (r0 == 0) goto L75
            boolean r2 = r5.m29391(r0)
            if (r2 == 0) goto L75
            boolean r2 = r0.requestFocus()
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.m29090(r3)
            if (r3 == 0) goto L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "requestFocus: Restoring focused view "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            if (r2 == 0) goto L4f
            java.lang.String r0 = "succeeded"
            goto L51
        L4f:
            java.lang.String r0 = "failed"
        L51:
            r3.append(r0)
            java.lang.String r0 = " on Fragment "
            r3.append(r0)
            androidx.fragment.app.Fragment r0 = r5.f29352
            r3.append(r0)
            java.lang.String r0 = " resulting in focused view "
            r3.append(r0)
            androidx.fragment.app.Fragment r0 = r5.f29352
            android.view.View r0 = r0.mView
            android.view.View r0 = r0.findFocus()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.v(r1, r0)
        L75:
            androidx.fragment.app.Fragment r0 = r5.f29352
            r1 = 0
            r0.setFocusedView(r1)
            androidx.fragment.app.Fragment r0 = r5.f29352
            r0.performResume()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r5.f29350
            androidx.fragment.app.Fragment r2 = r5.f29352
            r3 = 0
            r0.m29352(r2, r3)
            androidx.fragment.app.ۥ۟۟۠ r0 = r5.f29351
            androidx.fragment.app.Fragment r2 = r5.f29352
            java.lang.String r2 = r2.mWho
            r0.m29431(r2, r1)
            androidx.fragment.app.Fragment r0 = r5.f29352
            r0.mSavedFragmentState = r1
            r0.mSavedViewState = r1
            r0.mSavedViewRegistryState = r1
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public androidx.fragment.app.Fragment.C7570 m29396() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f29352
            int r0 = r0.mState
            r1 = -1
            if (r0 <= r1) goto L11
            androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r0 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۨ
            android.os.Bundle r1 = r2.m29397()
            r0.<init>(r1)
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public android.os.Bundle m29397() {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r5.f29352
            int r2 = r1.mState
            r3 = -1
            if (r2 != r3) goto L13
            android.os.Bundle r1 = r1.mSavedFragmentState
            if (r1 == 0) goto L13
            r0.putAll(r1)
        L13:
            androidx.fragment.app.ۥ۟۟۟ۦ r1 = new androidx.fragment.app.ۥ۟۟۟ۦ
            androidx.fragment.app.Fragment r2 = r5.f29352
            r1.<init>(r2)
            java.lang.String r2 = "state"
            r0.putParcelable(r2, r1)
            androidx.fragment.app.Fragment r1 = r5.f29352
            int r1 = r1.mState
            if (r1 <= r3) goto L8b
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            androidx.fragment.app.Fragment r2 = r5.f29352
            r2.performSaveInstanceState(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L3a
            java.lang.String r2 = "savedInstanceState"
            r0.putBundle(r2, r1)
        L3a:
            androidx.fragment.app.ۥۣ۟۟۟ r2 = r5.f29350
            androidx.fragment.app.Fragment r3 = r5.f29352
            r4 = 0
            r2.m29353(r3, r1, r4)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            androidx.fragment.app.Fragment r2 = r5.f29352
            Yue.ۥۡۧۤۡ r2 = r2.mSavedStateRegistryController
            r2.m20699(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L59
            java.lang.String r2 = "registryState"
            r0.putBundle(r2, r1)
        L59:
            androidx.fragment.app.Fragment r1 = r5.f29352
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            android.os.Bundle r1 = r1.m29219()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L6c
            java.lang.String r2 = "childFragmentManager"
            r0.putBundle(r2, r1)
        L6c:
            androidx.fragment.app.Fragment r1 = r5.f29352
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L75
            r5.m29398()
        L75:
            androidx.fragment.app.Fragment r1 = r5.f29352
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            if (r1 == 0) goto L80
            java.lang.String r2 = "viewState"
            r0.putSparseParcelableArray(r2, r1)
        L80:
            androidx.fragment.app.Fragment r1 = r5.f29352
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            if (r1 == 0) goto L8b
            java.lang.String r2 = "viewRegistryState"
            r0.putBundle(r2, r1)
        L8b:
            androidx.fragment.app.Fragment r1 = r5.f29352
            android.os.Bundle r1 = r1.mArguments
            if (r1 == 0) goto L96
            java.lang.String r2 = "arguments"
            r0.putBundle(r2, r1)
        L96:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m29398() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f29352
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Saving view state for fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r2.f29352
            r0.append(r1)
            java.lang.String r1 = " with view "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r2.f29352
            android.view.View r1 = r1.mView
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L32:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r2.f29352
            android.view.View r1 = r1.mView
            r1.saveHierarchyState(r0)
            int r1 = r0.size()
            if (r1 <= 0) goto L48
            androidx.fragment.app.Fragment r1 = r2.f29352
            r1.mSavedViewState = r0
        L48:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r2.f29352
            androidx.fragment.app.ۥ۟۟۠۠ r1 = r1.mViewLifecycleOwner
            r1.m29465(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L5e
            androidx.fragment.app.Fragment r1 = r2.f29352
            r1.mSavedViewRegistryState = r0
        L5e:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29399(int r1) {
            r0 = this;
            r0.f29354 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m29400() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.f29352
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r3.f29352
            r0.performStart()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r3.f29350
            androidx.fragment.app.Fragment r1 = r3.f29352
            r2 = 0
            r0.m29354(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m29401() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.f29352
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r3.f29352
            r0.performStop()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r3.f29350
            androidx.fragment.app.Fragment r1 = r3.f29352
            r2 = 0
            r0.m29355(r1, r2)
            return
    }
}
