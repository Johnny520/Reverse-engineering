package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
class FragmentStateManager {
    private static final java.lang.String TAG = "FragmentManager";
    private static final java.lang.String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    private static final java.lang.String TARGET_STATE_TAG = "android:target_state";
    private static final java.lang.String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    private static final java.lang.String VIEW_REGISTRY_STATE_TAG = "android:view_registry_state";
    private static final java.lang.String VIEW_STATE_TAG = "android:view_state";
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mDispatcher;
    private final androidx.fragment.app.Fragment mFragment;
    private int mFragmentManagerState;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private boolean mMovingToState;


    /* JADX INFO: renamed from: androidx.fragment.app.FragmentStateManager$2 */
    static /* synthetic */ class C02892 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State = null;

        static {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.FragmentStateManager.C02892.$SwitchMap$androidx$lifecycle$Lifecycle$State = r0
                int[] r0 = androidx.fragment.app.FragmentStateManager.C02892.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L15
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = androidx.fragment.app.FragmentStateManager.C02892.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L22
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = androidx.fragment.app.FragmentStateManager.C02892.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L2f
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = androidx.fragment.app.FragmentStateManager.C02892.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L3c
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2, androidx.fragment.app.FragmentStore r3, androidx.fragment.app.Fragment r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMovingToState = r0
            r0 = -1
            r1.mFragmentManagerState = r0
            r1.mDispatcher = r2
            r1.mFragmentStore = r3
            r1.mFragment = r4
            return
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r4, androidx.fragment.app.FragmentStore r5, androidx.fragment.app.Fragment r6, androidx.fragment.app.FragmentState r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mMovingToState = r0
            r1 = -1
            r3.mFragmentManagerState = r1
            r3.mDispatcher = r4
            r3.mFragmentStore = r5
            r3.mFragment = r6
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r1.mSavedViewState = r2
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r1.mSavedViewRegistryState = r2
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r1.mBackStackNesting = r0
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r1.mInLayout = r0
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r1.mAdded = r0
            androidx.fragment.app.Fragment r0 = r3.mFragment
            androidx.fragment.app.Fragment r1 = r3.mFragment
            androidx.fragment.app.Fragment r1 = r1.mTarget
            if (r1 == 0) goto L33
            androidx.fragment.app.Fragment r1 = r3.mFragment
            androidx.fragment.app.Fragment r1 = r1.mTarget
            java.lang.String r1 = r1.mWho
            goto L34
        L33:
            r1 = r2
        L34:
            r0.mTargetWho = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mTarget = r2
            android.os.Bundle r0 = r7.mSavedFragmentState
            if (r0 == 0) goto L45
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r1 = r7.mSavedFragmentState
            r0.mSavedFragmentState = r1
            goto L4e
        L45:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.mSavedFragmentState = r1
        L4e:
            return
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r4, androidx.fragment.app.FragmentStore r5, java.lang.ClassLoader r6, androidx.fragment.app.FragmentFactory r7, androidx.fragment.app.FragmentState r8) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mMovingToState = r0
            r0 = -1
            r3.mFragmentManagerState = r0
            r3.mDispatcher = r4
            r3.mFragmentStore = r5
            java.lang.String r0 = r8.mClassName
            androidx.fragment.app.Fragment r0 = r7.instantiate(r6, r0)
            r3.mFragment = r0
            android.os.Bundle r0 = r8.mArguments
            if (r0 == 0) goto L1e
            android.os.Bundle r0 = r8.mArguments
            r0.setClassLoader(r6)
        L1e:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r1 = r8.mArguments
            r0.setArguments(r1)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            java.lang.String r1 = r8.mWho
            r0.mWho = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            boolean r1 = r8.mFromLayout
            r0.mFromLayout = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r1 = 1
            r0.mRestored = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            int r1 = r8.mFragmentId
            r0.mFragmentId = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            int r1 = r8.mContainerId
            r0.mContainerId = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            java.lang.String r1 = r8.mTag
            r0.mTag = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            boolean r1 = r8.mRetainInstance
            r0.mRetainInstance = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            boolean r1 = r8.mRemoving
            r0.mRemoving = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            boolean r1 = r8.mDetached
            r0.mDetached = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            boolean r1 = r8.mHidden
            r0.mHidden = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            androidx.lifecycle.Lifecycle$State[] r1 = androidx.lifecycle.Lifecycle.State.values()
            int r2 = r8.mMaxLifecycleState
            r1 = r1[r2]
            r0.mMaxState = r1
            android.os.Bundle r0 = r8.mSavedFragmentState
            if (r0 == 0) goto L77
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r1 = r8.mSavedFragmentState
            r0.mSavedFragmentState = r1
            goto L80
        L77:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.mSavedFragmentState = r1
        L80:
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto La1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Instantiated fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        La1:
            return
    }

    private boolean isFragmentViewChild(android.view.View r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.View r0 = r0.mView
            r1 = 1
            if (r4 != r0) goto L8
            return r1
        L8:
            android.view.ViewParent r0 = r4.getParent()
        Lc:
            if (r0 == 0) goto L1a
            androidx.fragment.app.Fragment r2 = r3.mFragment
            android.view.View r2 = r2.mView
            if (r0 != r2) goto L15
            return r1
        L15:
            android.view.ViewParent r0 = r0.getParent()
            goto Lc
        L1a:
            r1 = 0
            return r1
    }

    private android.os.Bundle saveBasicState() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r1.performSaveInstanceState(r0)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r3 = 0
            r1.dispatchOnFragmentSaveInstanceState(r2, r0, r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L19
            r0 = 0
        L19:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L22
            r4.saveViewState()
        L22:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            if (r1 == 0) goto L39
            if (r0 != 0) goto L30
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0 = r1
        L30:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            java.lang.String r2 = "android:view_state"
            r0.putSparseParcelableArray(r2, r1)
        L39:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            if (r1 == 0) goto L50
            if (r0 != 0) goto L47
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0 = r1
        L47:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            java.lang.String r2 = "android:view_registry_state"
            r0.putBundle(r2, r1)
        L50:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mUserVisibleHint
            if (r1 != 0) goto L67
            if (r0 != 0) goto L5e
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0 = r1
        L5e:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mUserVisibleHint
            java.lang.String r2 = "android:user_visible_hint"
            r0.putBoolean(r2, r1)
        L67:
            return r0
    }

    void activityCreated() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            r0.performActivityCreated(r1)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            androidx.fragment.app.Fragment r2 = r4.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            r3 = 0
            r0.dispatchOnFragmentActivityCreated(r1, r2, r3)
            return
    }

    void addViewToContainer() {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            androidx.fragment.app.Fragment r1 = r3.mFragment
            int r0 = r0.findFragmentIndexInContainer(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.ViewGroup r1 = r1.mContainer
            androidx.fragment.app.Fragment r2 = r3.mFragment
            android.view.View r2 = r2.mView
            r1.addView(r2, r0)
            return
    }

    void attach() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ATTACHED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r6.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.Fragment r0 = r0.mTarget
            java.lang.String r1 = " that does not belong to this FragmentManager!"
            java.lang.String r2 = " declared target fragment "
            java.lang.String r3 = "Fragment "
            if (r0 == 0) goto L74
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.Fragment r4 = r6.mFragment
            androidx.fragment.app.Fragment r4 = r4.mTarget
            java.lang.String r4 = r4.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r4)
            if (r0 == 0) goto L4b
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r2.mTarget
            java.lang.String r2 = r2.mWho
            r1.mTargetWho = r2
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r2 = 0
            r1.mTarget = r2
            goto Lb1
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            androidx.fragment.app.Fragment r5 = r6.mFragment
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r2 = r3.append(r2)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            androidx.fragment.app.Fragment r3 = r3.mTarget
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r4.<init>(r1)
            throw r4
        L74:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto Lb0
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.Fragment r4 = r6.mFragment
            java.lang.String r4 = r4.mTargetWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r4)
            if (r0 == 0) goto L87
            goto Lb1
        L87:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            androidx.fragment.app.Fragment r5 = r6.mFragment
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r2 = r3.append(r2)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            java.lang.String r3 = r3.mTargetWho
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r4.<init>(r1)
            throw r4
        Lb0:
            r0 = 0
        Lb1:
            if (r0 == 0) goto Lc3
            boolean r1 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r1 != 0) goto Lc0
            androidx.fragment.app.Fragment r1 = r0.getFragment()
            int r1 = r1.mState
            r2 = 1
            if (r1 >= r2) goto Lc3
        Lc0:
            r0.moveToExpectedState()
        Lc3:
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r6.mFragment
            androidx.fragment.app.FragmentManager r2 = r2.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r2 = r2.getHost()
            r1.mHost = r2
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r6.mFragment
            androidx.fragment.app.FragmentManager r2 = r2.mFragmentManager
            androidx.fragment.app.Fragment r2 = r2.getParent()
            r1.mParentFragment = r2
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r6.mDispatcher
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r3 = 0
            r1.dispatchOnFragmentPreAttached(r2, r3)
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r1.performAttach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r6.mDispatcher
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r1.dispatchOnFragmentAttached(r2, r3)
            return
    }

    int computeExpectedState() {
            r9 = this;
            androidx.fragment.app.Fragment r0 = r9.mFragment
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            if (r0 != 0) goto Lb
            androidx.fragment.app.Fragment r0 = r9.mFragment
            int r0 = r0.mState
            return r0
        Lb:
            int r0 = r9.mFragmentManagerState
            int[] r1 = androidx.fragment.app.FragmentStateManager.C02892.$SwitchMap$androidx$lifecycle$Lifecycle$State
            androidx.fragment.app.Fragment r2 = r9.mFragment
            androidx.lifecycle.Lifecycle$State r2 = r2.mMaxState
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = -1
            r3 = 5
            r4 = 1
            switch(r1) {
                case 1: goto L34;
                case 2: goto L2f;
                case 3: goto L2a;
                case 4: goto L24;
                default: goto L1f;
            }
        L1f:
            int r0 = java.lang.Math.min(r0, r2)
            goto L35
        L24:
            r1 = 0
            int r0 = java.lang.Math.min(r0, r1)
            goto L35
        L2a:
            int r0 = java.lang.Math.min(r0, r4)
            goto L35
        L2f:
            int r0 = java.lang.Math.min(r0, r3)
            goto L35
        L34:
        L35:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mFromLayout
            r5 = 4
            r6 = 2
            if (r1 == 0) goto L6f
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mInLayout
            if (r1 == 0) goto L5e
            int r1 = r9.mFragmentManagerState
            int r0 = java.lang.Math.max(r1, r6)
            androidx.fragment.app.Fragment r1 = r9.mFragment
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L6f
            androidx.fragment.app.Fragment r1 = r9.mFragment
            android.view.View r1 = r1.mView
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L6f
            int r0 = java.lang.Math.min(r0, r6)
            goto L6f
        L5e:
            int r1 = r9.mFragmentManagerState
            if (r1 >= r5) goto L6b
            androidx.fragment.app.Fragment r1 = r9.mFragment
            int r1 = r1.mState
            int r0 = java.lang.Math.min(r0, r1)
            goto L6f
        L6b:
            int r0 = java.lang.Math.min(r0, r4)
        L6f:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mAdded
            if (r1 != 0) goto L79
            int r0 = java.lang.Math.min(r0, r4)
        L79:
            r1 = 0
            boolean r7 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r7 == 0) goto L96
            androidx.fragment.app.Fragment r7 = r9.mFragment
            android.view.ViewGroup r7 = r7.mContainer
            if (r7 == 0) goto L96
            androidx.fragment.app.Fragment r7 = r9.mFragment
            android.view.ViewGroup r7 = r7.mContainer
            androidx.fragment.app.Fragment r8 = r9.mFragment
            androidx.fragment.app.FragmentManager r8 = r8.getParentFragmentManager()
            androidx.fragment.app.SpecialEffectsController r7 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r7, r8)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = r7.getAwaitingCompletionLifecycleImpact(r9)
        L96:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r7 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r1 != r7) goto La0
            r2 = 6
            int r0 = java.lang.Math.min(r0, r2)
            goto Lc1
        La0:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r7 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            if (r1 != r7) goto Laa
            r2 = 3
            int r0 = java.lang.Math.max(r0, r2)
            goto Lc1
        Laa:
            androidx.fragment.app.Fragment r7 = r9.mFragment
            boolean r7 = r7.mRemoving
            if (r7 == 0) goto Lc1
            androidx.fragment.app.Fragment r7 = r9.mFragment
            boolean r7 = r7.isInBackStack()
            if (r7 == 0) goto Lbd
            int r0 = java.lang.Math.min(r0, r4)
            goto Lc1
        Lbd:
            int r0 = java.lang.Math.min(r0, r2)
        Lc1:
            androidx.fragment.app.Fragment r2 = r9.mFragment
            boolean r2 = r2.mDeferStart
            if (r2 == 0) goto Ld1
            androidx.fragment.app.Fragment r2 = r9.mFragment
            int r2 = r2.mState
            if (r2 >= r3) goto Ld1
            int r0 = java.lang.Math.min(r0, r5)
        Ld1:
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r2 == 0) goto Lfb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "computeExpectedState() of "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " for "
            java.lang.StringBuilder r2 = r2.append(r3)
            androidx.fragment.app.Fragment r3 = r9.mFragment
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        Lfb:
            return r0
    }

    void create() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            boolean r0 = r0.mIsCreated
            if (r0 != 0) goto L48
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            androidx.fragment.app.Fragment r2 = r4.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            r3 = 0
            r0.dispatchOnFragmentPreCreated(r1, r2, r3)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            r0.performCreate(r1)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            androidx.fragment.app.Fragment r2 = r4.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            r0.dispatchOnFragmentCreated(r1, r2, r3)
            goto L56
        L48:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            r0.restoreChildFragmentState(r1)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r1 = 1
            r0.mState = r1
        L56:
            return
    }

    void createView() {
            r9 = this;
            androidx.fragment.app.Fragment r0 = r9.mFragment
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.fragment.app.Fragment r2 = r9.mFragment
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L28:
            androidx.fragment.app.Fragment r0 = r9.mFragment
            androidx.fragment.app.Fragment r2 = r9.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            android.view.LayoutInflater r0 = r0.performGetLayoutInflater(r2)
            r2 = 0
            androidx.fragment.app.Fragment r3 = r9.mFragment
            android.view.ViewGroup r3 = r3.mContainer
            if (r3 == 0) goto L3f
            androidx.fragment.app.Fragment r3 = r9.mFragment
            android.view.ViewGroup r2 = r3.mContainer
            goto Ld3
        L3f:
            androidx.fragment.app.Fragment r3 = r9.mFragment
            int r3 = r3.mContainerId
            if (r3 == 0) goto Ld3
            androidx.fragment.app.Fragment r3 = r9.mFragment
            int r3 = r3.mContainerId
            r4 = -1
            if (r3 == r4) goto Lb2
            androidx.fragment.app.Fragment r3 = r9.mFragment
            androidx.fragment.app.FragmentManager r3 = r3.mFragmentManager
            androidx.fragment.app.FragmentContainer r3 = r3.getContainer()
            androidx.fragment.app.Fragment r4 = r9.mFragment
            int r4 = r4.mContainerId
            android.view.View r4 = r3.onFindViewById(r4)
            r2 = r4
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto Ld3
            androidx.fragment.app.Fragment r4 = r9.mFragment
            boolean r4 = r4.mRestored
            if (r4 == 0) goto L68
            goto Ld3
        L68:
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: android.content.res.Resources.NotFoundException -> L77
            android.content.res.Resources r1 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L77
            androidx.fragment.app.Fragment r4 = r9.mFragment     // Catch: android.content.res.Resources.NotFoundException -> L77
            int r4 = r4.mContainerId     // Catch: android.content.res.Resources.NotFoundException -> L77
            java.lang.String r1 = r1.getResourceName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L77
            goto L7b
        L77:
            r1 = move-exception
            java.lang.String r4 = "unknown"
            r1 = r4
        L7b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "No view found for id 0x"
            java.lang.StringBuilder r5 = r5.append(r6)
            androidx.fragment.app.Fragment r6 = r9.mFragment
            int r6 = r6.mContainerId
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " ("
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r6 = ") for fragment "
            java.lang.StringBuilder r5 = r5.append(r6)
            androidx.fragment.app.Fragment r6 = r9.mFragment
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lb2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot create fragment "
            java.lang.StringBuilder r3 = r3.append(r4)
            androidx.fragment.app.Fragment r4 = r9.mFragment
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " for a container view with no id"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            throw r1
        Ld3:
            androidx.fragment.app.Fragment r3 = r9.mFragment
            r3.mContainer = r2
            androidx.fragment.app.Fragment r3 = r9.mFragment
            androidx.fragment.app.Fragment r4 = r9.mFragment
            android.os.Bundle r4 = r4.mSavedFragmentState
            r3.performCreateView(r0, r2, r4)
            androidx.fragment.app.Fragment r3 = r9.mFragment
            android.view.View r3 = r3.mView
            r4 = 2
            if (r3 == 0) goto L1ae
            androidx.fragment.app.Fragment r3 = r9.mFragment
            android.view.View r3 = r3.mView
            r5 = 0
            r3.setSaveFromParentEnabled(r5)
            androidx.fragment.app.Fragment r3 = r9.mFragment
            android.view.View r3 = r3.mView
            int r6 = androidx.fragment.C0240R.id.fragment_container_view_tag
            androidx.fragment.app.Fragment r7 = r9.mFragment
            r3.setTag(r6, r7)
            if (r2 == 0) goto Lff
            r9.addViewToContainer()
        Lff:
            androidx.fragment.app.Fragment r3 = r9.mFragment
            boolean r3 = r3.mHidden
            if (r3 == 0) goto L10e
            androidx.fragment.app.Fragment r3 = r9.mFragment
            android.view.View r3 = r3.mView
            r6 = 8
            r3.setVisibility(r6)
        L10e:
            androidx.fragment.app.Fragment r3 = r9.mFragment
            android.view.View r3 = r3.mView
            boolean r3 = androidx.core.view.ViewCompat.isAttachedToWindow(r3)
            if (r3 == 0) goto L120
            androidx.fragment.app.Fragment r3 = r9.mFragment
            android.view.View r3 = r3.mView
            androidx.core.view.ViewCompat.requestApplyInsets(r3)
            goto L12c
        L120:
            androidx.fragment.app.Fragment r3 = r9.mFragment
            android.view.View r3 = r3.mView
            androidx.fragment.app.FragmentStateManager$1 r6 = new androidx.fragment.app.FragmentStateManager$1
            r6.<init>(r9, r3)
            r3.addOnAttachStateChangeListener(r6)
        L12c:
            androidx.fragment.app.Fragment r3 = r9.mFragment
            r3.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3 = r9.mDispatcher
            androidx.fragment.app.Fragment r6 = r9.mFragment
            androidx.fragment.app.Fragment r7 = r9.mFragment
            android.view.View r7 = r7.mView
            androidx.fragment.app.Fragment r8 = r9.mFragment
            android.os.Bundle r8 = r8.mSavedFragmentState
            r3.dispatchOnFragmentViewCreated(r6, r7, r8, r5)
            androidx.fragment.app.Fragment r3 = r9.mFragment
            android.view.View r3 = r3.mView
            int r3 = r3.getVisibility()
            androidx.fragment.app.Fragment r6 = r9.mFragment
            android.view.View r6 = r6.mView
            float r6 = r6.getAlpha()
            boolean r7 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r7 == 0) goto L1a1
            androidx.fragment.app.Fragment r5 = r9.mFragment
            r5.setPostOnViewCreatedAlpha(r6)
            androidx.fragment.app.Fragment r5 = r9.mFragment
            android.view.ViewGroup r5 = r5.mContainer
            if (r5 == 0) goto L1ae
            if (r3 != 0) goto L1ae
            androidx.fragment.app.Fragment r5 = r9.mFragment
            android.view.View r5 = r5.mView
            android.view.View r5 = r5.findFocus()
            if (r5 == 0) goto L198
            androidx.fragment.app.Fragment r7 = r9.mFragment
            r7.setFocusedView(r5)
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
            if (r7 == 0) goto L198
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "requestFocus: Saved focused view "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r8 = " for Fragment "
            java.lang.StringBuilder r7 = r7.append(r8)
            androidx.fragment.app.Fragment r8 = r9.mFragment
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r1, r7)
        L198:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            android.view.View r1 = r1.mView
            r7 = 0
            r1.setAlpha(r7)
            goto L1ae
        L1a1:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            if (r3 != 0) goto L1ac
            androidx.fragment.app.Fragment r7 = r9.mFragment
            android.view.ViewGroup r7 = r7.mContainer
            if (r7 == 0) goto L1ac
            r5 = 1
        L1ac:
            r1.mIsNewlyAdded = r5
        L1ae:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            r1.mState = r4
            return
    }

    void destroy() {
            r9 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r9.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r9.mFragment
            boolean r0 = r0.mRemoving
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L33
            androidx.fragment.app.Fragment r0 = r9.mFragment
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            if (r0 != 0) goto L47
            androidx.fragment.app.FragmentStore r3 = r9.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r3 = r3.getNonConfig()
            androidx.fragment.app.Fragment r4 = r9.mFragment
            boolean r3 = r3.shouldDestroy(r4)
            if (r3 == 0) goto L45
            goto L47
        L45:
            r3 = r2
            goto L48
        L47:
            r3 = r1
        L48:
            if (r3 == 0) goto Ld7
            androidx.fragment.app.Fragment r4 = r9.mFragment
            androidx.fragment.app.FragmentHostCallback<?> r4 = r4.mHost
            boolean r5 = r4 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r5 == 0) goto L5d
            androidx.fragment.app.FragmentStore r1 = r9.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            boolean r1 = r1.isCleared()
            goto L72
        L5d:
            android.content.Context r5 = r4.getContext()
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L71
            android.content.Context r5 = r4.getContext()
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r6 = r5.isChangingConfigurations()
            r1 = r1 ^ r6
            goto L72
        L71:
            r1 = 1
        L72:
            if (r0 != 0) goto L76
            if (r1 == 0) goto L81
        L76:
            androidx.fragment.app.FragmentStore r5 = r9.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r5 = r5.getNonConfig()
            androidx.fragment.app.Fragment r6 = r9.mFragment
            r5.clearNonConfigState(r6)
        L81:
            androidx.fragment.app.Fragment r5 = r9.mFragment
            r5.performDestroy()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r5 = r9.mDispatcher
            androidx.fragment.app.Fragment r6 = r9.mFragment
            r5.dispatchOnFragmentDestroyed(r6, r2)
            androidx.fragment.app.FragmentStore r2 = r9.mFragmentStore
            java.util.List r2 = r2.getActiveFragmentStateManagers()
            java.util.Iterator r2 = r2.iterator()
        L97:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lbd
            java.lang.Object r5 = r2.next()
            androidx.fragment.app.FragmentStateManager r5 = (androidx.fragment.app.FragmentStateManager) r5
            if (r5 == 0) goto Lbc
            androidx.fragment.app.Fragment r6 = r5.getFragment()
            androidx.fragment.app.Fragment r7 = r9.mFragment
            java.lang.String r7 = r7.mWho
            java.lang.String r8 = r6.mTargetWho
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Lbc
            androidx.fragment.app.Fragment r7 = r9.mFragment
            r6.mTarget = r7
            r7 = 0
            r6.mTargetWho = r7
        Lbc:
            goto L97
        Lbd:
            androidx.fragment.app.Fragment r2 = r9.mFragment
            java.lang.String r2 = r2.mTargetWho
            if (r2 == 0) goto Ld1
            androidx.fragment.app.Fragment r2 = r9.mFragment
            androidx.fragment.app.FragmentStore r5 = r9.mFragmentStore
            androidx.fragment.app.Fragment r6 = r9.mFragment
            java.lang.String r6 = r6.mTargetWho
            androidx.fragment.app.Fragment r5 = r5.findActiveFragment(r6)
            r2.mTarget = r5
        Ld1:
            androidx.fragment.app.FragmentStore r2 = r9.mFragmentStore
            r2.makeInactive(r9)
            goto Lf5
        Ld7:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            java.lang.String r1 = r1.mTargetWho
            if (r1 == 0) goto Lf1
            androidx.fragment.app.FragmentStore r1 = r9.mFragmentStore
            androidx.fragment.app.Fragment r4 = r9.mFragment
            java.lang.String r4 = r4.mTargetWho
            androidx.fragment.app.Fragment r1 = r1.findActiveFragment(r4)
            if (r1 == 0) goto Lf1
            boolean r4 = r1.mRetainInstance
            if (r4 == 0) goto Lf1
            androidx.fragment.app.Fragment r4 = r9.mFragment
            r4.mTarget = r1
        Lf1:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            r1.mState = r2
        Lf5:
            return
    }

    void destroyFragmentView() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATE_VIEW: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.ViewGroup r0 = r0.mContainer
            if (r0 == 0) goto L38
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L38
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.ViewGroup r0 = r0.mContainer
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.View r1 = r1.mView
            r0.removeView(r1)
        L38:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performDestroyView()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentViewDestroyed(r1, r2)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r1 = 0
            r0.mContainer = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mView = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mViewLifecycleOwner = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r0.mViewLifecycleOwnerLiveData
            r0.setValue(r1)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mInLayout = r2
            return
    }

    void detach() {
            r5 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom ATTACHED: "
            java.lang.StringBuilder r1 = r1.append(r3)
            androidx.fragment.app.Fragment r3 = r5.mFragment
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L21:
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.performDetach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r5.mDispatcher
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r4 = 0
            r1.dispatchOnFragmentDetached(r3, r4)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r3 = -1
            r1.mState = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r3 = 0
            r1.mHost = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mParentFragment = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mFragmentManager = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            boolean r1 = r1.mRemoving
            if (r1 == 0) goto L4f
            androidx.fragment.app.Fragment r1 = r5.mFragment
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L4f
            r4 = 1
        L4f:
            r1 = r4
            if (r1 != 0) goto L60
            androidx.fragment.app.FragmentStore r3 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r3 = r3.getNonConfig()
            androidx.fragment.app.Fragment r4 = r5.mFragment
            boolean r3 = r3.shouldDestroy(r4)
            if (r3 == 0) goto L83
        L60:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "initState called for fragment: "
            java.lang.StringBuilder r0 = r0.append(r3)
            androidx.fragment.app.Fragment r3 = r5.mFragment
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L7e:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.initState()
        L83:
            return
    }

    void ensureInflatedView() {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L88
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mInLayout
            if (r0 == 0) goto L88
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mPerformedCreateView
            if (r0 != 0) goto L88
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L33:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            androidx.fragment.app.Fragment r1 = r5.mFragment
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            android.view.LayoutInflater r1 = r1.performGetLayoutInflater(r2)
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            r3 = 0
            r0.performCreateView(r1, r3, r2)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L88
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            r1 = 0
            r0.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            int r2 = androidx.fragment.C0240R.id.fragment_container_view_tag
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r0.setTag(r2, r3)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mHidden
            if (r0 == 0) goto L6f
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        L6f:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r5.mDispatcher
            androidx.fragment.app.Fragment r2 = r5.mFragment
            androidx.fragment.app.Fragment r3 = r5.mFragment
            android.view.View r3 = r3.mView
            androidx.fragment.app.Fragment r4 = r5.mFragment
            android.os.Bundle r4 = r4.mSavedFragmentState
            r0.dispatchOnFragmentViewCreated(r2, r3, r4, r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r1 = 2
            r0.mState = r1
        L88:
            return
    }

    androidx.fragment.app.Fragment getFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mFragment
            return r0
    }

    void moveToExpectedState() {
            r9 = this;
            boolean r0 = r9.mMovingToState
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L28
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Ignoring re-entrant call to moveToExpectedState() for "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.fragment.app.Fragment r2 = r9.getFragment()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L27:
            return
        L28:
            r0 = 0
            r3 = 1
            r9.mMovingToState = r3     // Catch: java.lang.Throwable -> L16c
        L2c:
            int r4 = r9.computeExpectedState()     // Catch: java.lang.Throwable -> L16c
            r5 = r4
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            int r6 = r6.mState     // Catch: java.lang.Throwable -> L16c
            if (r4 == r6) goto L11b
            androidx.fragment.app.Fragment r4 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            int r4 = r4.mState     // Catch: java.lang.Throwable -> L16c
            if (r5 <= r4) goto L98
            androidx.fragment.app.Fragment r4 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            int r4 = r4.mState     // Catch: java.lang.Throwable -> L16c
            int r4 = r4 + r3
            switch(r4) {
                case 0: goto L93;
                case 1: goto L8f;
                case 2: goto L88;
                case 3: goto L84;
                case 4: goto L54;
                case 5: goto L50;
                case 6: goto L4a;
                case 7: goto L46;
                default: goto L45;
            }     // Catch: java.lang.Throwable -> L16c
        L45:
            goto L97
        L46:
            r9.resume()     // Catch: java.lang.Throwable -> L16c
            goto L97
        L4a:
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            r7 = 6
            r6.mState = r7     // Catch: java.lang.Throwable -> L16c
            goto L97
        L50:
            r9.start()     // Catch: java.lang.Throwable -> L16c
            goto L97
        L54:
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.View r6 = r6.mView     // Catch: java.lang.Throwable -> L16c
            if (r6 == 0) goto L7e
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.ViewGroup r6 = r6.mContainer     // Catch: java.lang.Throwable -> L16c
            if (r6 == 0) goto L7e
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.ViewGroup r6 = r6.mContainer     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r7 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.FragmentManager r7 = r7.getParentFragmentManager()     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.SpecialEffectsController r6 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r6, r7)     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r7 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.View r7 = r7.mView     // Catch: java.lang.Throwable -> L16c
            int r7 = r7.getVisibility()     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.SpecialEffectsController$Operation$State r8 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r7)     // Catch: java.lang.Throwable -> L16c
            r6.enqueueAdd(r8, r9)     // Catch: java.lang.Throwable -> L16c
        L7e:
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            r7 = 4
            r6.mState = r7     // Catch: java.lang.Throwable -> L16c
            goto L97
        L84:
            r9.activityCreated()     // Catch: java.lang.Throwable -> L16c
            goto L97
        L88:
            r9.ensureInflatedView()     // Catch: java.lang.Throwable -> L16c
            r9.createView()     // Catch: java.lang.Throwable -> L16c
            goto L97
        L8f:
            r9.create()     // Catch: java.lang.Throwable -> L16c
            goto L97
        L93:
            r9.attach()     // Catch: java.lang.Throwable -> L16c
        L97:
            goto L2c
        L98:
            androidx.fragment.app.Fragment r4 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            int r4 = r4.mState     // Catch: java.lang.Throwable -> L16c
            int r4 = r4 - r3
            switch(r4) {
                case -1: goto L116;
                case 0: goto L112;
                case 1: goto L10a;
                case 2: goto L101;
                case 3: goto Lb1;
                case 4: goto Lad;
                case 5: goto La7;
                case 6: goto La2;
                default: goto La0;
            }     // Catch: java.lang.Throwable -> L16c
        La0:
            goto L119
        La2:
            r9.pause()     // Catch: java.lang.Throwable -> L16c
            goto L119
        La7:
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            r7 = 5
            r6.mState = r7     // Catch: java.lang.Throwable -> L16c
            goto L119
        Lad:
            r9.stop()     // Catch: java.lang.Throwable -> L16c
            goto L119
        Lb1:
            r6 = 3
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)     // Catch: java.lang.Throwable -> L16c
            if (r7 == 0) goto Ld0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16c
            r7.<init>()     // Catch: java.lang.Throwable -> L16c
            java.lang.String r8 = "movefrom ACTIVITY_CREATED: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r8 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L16c
            android.util.Log.d(r1, r7)     // Catch: java.lang.Throwable -> L16c
        Ld0:
            androidx.fragment.app.Fragment r7 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.View r7 = r7.mView     // Catch: java.lang.Throwable -> L16c
            if (r7 == 0) goto Ldf
            androidx.fragment.app.Fragment r7 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.util.SparseArray<android.os.Parcelable> r7 = r7.mSavedViewState     // Catch: java.lang.Throwable -> L16c
            if (r7 != 0) goto Ldf
            r9.saveViewState()     // Catch: java.lang.Throwable -> L16c
        Ldf:
            androidx.fragment.app.Fragment r7 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.View r7 = r7.mView     // Catch: java.lang.Throwable -> L16c
            if (r7 == 0) goto Lfc
            androidx.fragment.app.Fragment r7 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.ViewGroup r7 = r7.mContainer     // Catch: java.lang.Throwable -> L16c
            if (r7 == 0) goto Lfc
            androidx.fragment.app.Fragment r7 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.ViewGroup r7 = r7.mContainer     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r8 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.FragmentManager r8 = r8.getParentFragmentManager()     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.SpecialEffectsController r7 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r7, r8)     // Catch: java.lang.Throwable -> L16c
            r7.enqueueRemove(r9)     // Catch: java.lang.Throwable -> L16c
        Lfc:
            androidx.fragment.app.Fragment r7 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            r7.mState = r6     // Catch: java.lang.Throwable -> L16c
            goto L119
        L101:
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            r6.mInLayout = r0     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            r6.mState = r2     // Catch: java.lang.Throwable -> L16c
            goto L119
        L10a:
            r9.destroyFragmentView()     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            r6.mState = r3     // Catch: java.lang.Throwable -> L16c
            goto L119
        L112:
            r9.destroy()     // Catch: java.lang.Throwable -> L16c
            goto L119
        L116:
            r9.detach()     // Catch: java.lang.Throwable -> L16c
        L119:
            goto L2c
        L11b:
            boolean r1 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER     // Catch: java.lang.Throwable -> L16c
            if (r1 == 0) goto L168
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            boolean r1 = r1.mHiddenChanged     // Catch: java.lang.Throwable -> L16c
            if (r1 == 0) goto L168
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.View r1 = r1.mView     // Catch: java.lang.Throwable -> L16c
            if (r1 == 0) goto L14c
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.ViewGroup r1 = r1.mContainer     // Catch: java.lang.Throwable -> L16c
            if (r1 == 0) goto L14c
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            android.view.ViewGroup r1 = r1.mContainer     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r2 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.FragmentManager r2 = r2.getParentFragmentManager()     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.SpecialEffectsController r1 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r1, r2)     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r2 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            boolean r2 = r2.mHidden     // Catch: java.lang.Throwable -> L16c
            if (r2 == 0) goto L149
            r1.enqueueHide(r9)     // Catch: java.lang.Throwable -> L16c
            goto L14c
        L149:
            r1.enqueueShow(r9)     // Catch: java.lang.Throwable -> L16c
        L14c:
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.FragmentManager r1 = r1.mFragmentManager     // Catch: java.lang.Throwable -> L16c
            if (r1 == 0) goto L15b
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.FragmentManager r1 = r1.mFragmentManager     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r2 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            r1.invalidateMenuForFragment(r2)     // Catch: java.lang.Throwable -> L16c
        L15b:
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            r1.mHiddenChanged = r0     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            androidx.fragment.app.Fragment r2 = r9.mFragment     // Catch: java.lang.Throwable -> L16c
            boolean r2 = r2.mHidden     // Catch: java.lang.Throwable -> L16c
            r1.onHiddenChanged(r2)     // Catch: java.lang.Throwable -> L16c
        L168:
            r9.mMovingToState = r0
            return
        L16c:
            r1 = move-exception
            r9.mMovingToState = r0
            throw r1
    }

    void pause() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performPause()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentPaused(r1, r2)
            return
    }

    void restoreState(java.lang.ClassLoader r5) {
            r4 = this;
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r0 = r0.mSavedFragmentState
            if (r0 != 0) goto L7
            return
        L7:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r0 = r0.mSavedFragmentState
            r0.setClassLoader(r5)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            java.lang.String r2 = "android:view_state"
            android.util.SparseArray r1 = r1.getSparseParcelableArray(r2)
            r0.mSavedViewState = r1
            androidx.fragment.app.Fragment r0 = r4.mFragment
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            java.lang.String r2 = "android:view_registry_state"
            android.os.Bundle r1 = r1.getBundle(r2)
            r0.mSavedViewRegistryState = r1
            androidx.fragment.app.Fragment r0 = r4.mFragment
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            java.lang.String r2 = "android:target_state"
            java.lang.String r1 = r1.getString(r2)
            r0.mTargetWho = r1
            androidx.fragment.app.Fragment r0 = r4.mFragment
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L4d
            androidx.fragment.app.Fragment r0 = r4.mFragment
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            java.lang.String r2 = "android:target_req_state"
            r3 = 0
            int r1 = r1.getInt(r2, r3)
            r0.mTargetRequestCode = r1
        L4d:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            java.lang.Boolean r0 = r0.mSavedUserVisibleHint
            r1 = 1
            if (r0 == 0) goto L66
            androidx.fragment.app.Fragment r0 = r4.mFragment
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.Boolean r2 = r2.mSavedUserVisibleHint
            boolean r2 = r2.booleanValue()
            r0.mUserVisibleHint = r2
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r2 = 0
            r0.mSavedUserVisibleHint = r2
            goto L74
        L66:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            androidx.fragment.app.Fragment r2 = r4.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            java.lang.String r3 = "android:user_visible_hint"
            boolean r2 = r2.getBoolean(r3, r1)
            r0.mUserVisibleHint = r2
        L74:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            boolean r0 = r0.mUserVisibleHint
            if (r0 != 0) goto L7e
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r0.mDeferStart = r1
        L7e:
            return
    }

    void resume() {
            r5 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.fragment.app.Fragment r2 = r5.mFragment
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.getFocusedView()
            if (r0 == 0) goto L7f
            boolean r2 = r5.isFragmentViewChild(r0)
            if (r2 == 0) goto L7f
            boolean r2 = r0.requestFocus()
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L7f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "requestFocus: Restoring focused view "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = " "
            java.lang.StringBuilder r3 = r3.append(r4)
            if (r2 == 0) goto L54
            java.lang.String r4 = "succeeded"
            goto L56
        L54:
            java.lang.String r4 = "failed"
        L56:
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " on Fragment "
            java.lang.StringBuilder r3 = r3.append(r4)
            androidx.fragment.app.Fragment r4 = r5.mFragment
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " resulting in focused view "
            java.lang.StringBuilder r3 = r3.append(r4)
            androidx.fragment.app.Fragment r4 = r5.mFragment
            android.view.View r4 = r4.mView
            android.view.View r4 = r4.findFocus()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r1, r3)
        L7f:
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r2 = 0
            r1.setFocusedView(r2)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.performResume()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r5.mDispatcher
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r4 = 0
            r1.dispatchOnFragmentResumed(r3, r4)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mSavedFragmentState = r2
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mSavedViewState = r2
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mSavedViewRegistryState = r2
            return
    }

    androidx.fragment.app.Fragment.SavedState saveInstanceState() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            int r0 = r0.mState
            r1 = -1
            r2 = 0
            if (r0 <= r1) goto L14
            android.os.Bundle r0 = r3.saveBasicState()
            if (r0 == 0) goto L13
            androidx.fragment.app.Fragment$SavedState r2 = new androidx.fragment.app.Fragment$SavedState
            r2.<init>(r0)
        L13:
            return r2
        L14:
            return r2
    }

    androidx.fragment.app.FragmentState saveState() {
            r4 = this;
            androidx.fragment.app.FragmentState r0 = new androidx.fragment.app.FragmentState
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            int r1 = r1.mState
            r2 = -1
            if (r1 <= r2) goto L46
            android.os.Bundle r1 = r0.mSavedFragmentState
            if (r1 != 0) goto L46
            android.os.Bundle r1 = r4.saveBasicState()
            r0.mSavedFragmentState = r1
            androidx.fragment.app.Fragment r1 = r4.mFragment
            java.lang.String r1 = r1.mTargetWho
            if (r1 == 0) goto L4c
            android.os.Bundle r1 = r0.mSavedFragmentState
            if (r1 != 0) goto L29
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.mSavedFragmentState = r1
        L29:
            android.os.Bundle r1 = r0.mSavedFragmentState
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.String r2 = r2.mTargetWho
            java.lang.String r3 = "android:target_state"
            r1.putString(r3, r2)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            int r1 = r1.mTargetRequestCode
            if (r1 == 0) goto L4c
            android.os.Bundle r1 = r0.mSavedFragmentState
            androidx.fragment.app.Fragment r2 = r4.mFragment
            int r2 = r2.mTargetRequestCode
            java.lang.String r3 = "android:target_req_state"
            r1.putInt(r3, r2)
            goto L4c
        L46:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            r0.mSavedFragmentState = r1
        L4c:
            return r0
    }

    void saveViewState() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L7
            return
        L7:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.View r1 = r1.mView
            r1.saveHierarchyState(r0)
            int r1 = r0.size()
            if (r1 <= 0) goto L1d
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r1.mSavedViewState = r0
        L1d:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            androidx.fragment.app.Fragment r2 = r3.mFragment
            androidx.fragment.app.FragmentViewLifecycleOwner r2 = r2.mViewLifecycleOwner
            r2.performSave(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L33
            androidx.fragment.app.Fragment r2 = r3.mFragment
            r2.mSavedViewRegistryState = r1
        L33:
            return
    }

    void setFragmentManagerState(int r1) {
            r0 = this;
            r0.mFragmentManagerState = r1
            return
    }

    void start() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStart()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStarted(r1, r2)
            return
    }

    void stop() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStop()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStopped(r1, r2)
            return
    }
}
