package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentManager implements androidx.fragment.app.FragmentResultOwner {
    private static boolean DEBUG = false;
    private static final java.lang.String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    static final java.lang.String TAG = "FragmentManager";
    static boolean USE_STATE_MANAGER;
    java.util.ArrayList<androidx.fragment.app.BackStackRecord> mBackStack;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    private final java.util.concurrent.atomic.AtomicInteger mBackStackIndex;
    private androidx.fragment.app.FragmentContainer mContainer;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mCreatedMenus;
    int mCurState;
    private androidx.fragment.app.SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory;
    private boolean mDestroyed;
    private java.lang.Runnable mExecCommit;
    private boolean mExecutingActions;
    private java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> mExitAnimationCancellationSignals;
    private androidx.fragment.app.FragmentFactory mFragmentFactory;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private final androidx.fragment.app.FragmentTransition.Callback mFragmentTransitionCallback;
    private boolean mHavePendingDeferredStart;
    private androidx.fragment.app.FragmentHostCallback<?> mHost;
    private androidx.fragment.app.FragmentFactory mHostFragmentFactory;
    java.util.ArrayDeque<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> mLaunchedFragments;
    private final androidx.fragment.app.FragmentLayoutInflaterFactory mLayoutInflaterFactory;
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher;
    private boolean mNeedMenuInvalidate;
    private androidx.fragment.app.FragmentManagerViewModel mNonConfig;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> mOnAttachListeners;
    private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
    private androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private androidx.fragment.app.Fragment mParent;
    private final java.util.ArrayList<androidx.fragment.app.FragmentManager.OpGenerator> mPendingActions;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.StartEnterTransitionListener> mPostponedTransactions;
    androidx.fragment.app.Fragment mPrimaryNav;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> mRequestPermissions;
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager.LifecycleAwareResultListener> mResultListeners;
    private final java.util.Map<java.lang.String, android.os.Bundle> mResults;
    private androidx.fragment.app.SpecialEffectsControllerFactory mSpecialEffectsControllerFactory;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> mStartActivityForResult;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mTmpAddedFragments;
    private java.util.ArrayList<java.lang.Boolean> mTmpIsPop;
    private java.util.ArrayList<androidx.fragment.app.BackStackRecord> mTmpRecords;












    public interface BackStackEntry {
        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbShortTitle();

        @java.lang.Deprecated
        int getBreadCrumbShortTitleRes();

        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbTitle();

        @java.lang.Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        java.lang.String getName();
    }

    static class FragmentIntentSenderContract extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        FragmentIntentSenderContract() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r7, androidx.activity.result.IntentSenderRequest r8) {
                r6 = this;
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r0.<init>(r1)
                android.content.Intent r1 = r8.getFillInIntent()
                if (r1 == 0) goto L42
                java.lang.String r2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                android.os.Bundle r3 = r1.getBundleExtra(r2)
                if (r3 == 0) goto L42
                r0.putExtra(r2, r3)
                r1.removeExtra(r2)
                java.lang.String r2 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
                r4 = 0
                boolean r2 = r1.getBooleanExtra(r2, r4)
                if (r2 == 0) goto L42
                androidx.activity.result.IntentSenderRequest$Builder r2 = new androidx.activity.result.IntentSenderRequest$Builder
                android.content.IntentSender r4 = r8.getIntentSender()
                r2.<init>(r4)
                r4 = 0
                androidx.activity.result.IntentSenderRequest$Builder r2 = r2.setFillInIntent(r4)
                int r4 = r8.getFlagsValues()
                int r5 = r8.getFlagsMask()
                androidx.activity.result.IntentSenderRequest$Builder r2 = r2.setFlags(r4, r5)
                androidx.activity.result.IntentSenderRequest r8 = r2.build()
            L42:
                java.lang.String r2 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                r0.putExtra(r2, r8)
                r2 = 2
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r2 == 0) goto L66
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "CreateIntent created the following intent: "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "FragmentManager"
                android.util.Log.v(r3, r2)
            L66:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.IntentSenderRequest r2) {
                r0 = this;
                androidx.activity.result.IntentSenderRequest r2 = (androidx.activity.result.IntentSenderRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
        public FragmentLifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public void onFragmentActivityCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentAttached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentDetached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPaused(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPreAttached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentPreCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentResumed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentSaveInstanceState(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentStarted(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentStopped(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentViewCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.view.View r3, android.os.Bundle r4) {
                r0 = this;
                return
        }

        public void onFragmentViewDestroyed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }
    }

    static class LaunchedFragmentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> CREATOR = null;
        int mRequestCode;
        java.lang.String mWho;


        static {
                androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1 r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1
                r0.<init>()
                androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.CREATOR = r0
                return
        }

        LaunchedFragmentInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.mWho = r0
                int r0 = r2.readInt()
                r1.mRequestCode = r0
                return
        }

        LaunchedFragmentInfo(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mWho = r1
                r0.mRequestCode = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                java.lang.String r0 = r1.mWho
                r2.writeString(r0)
                int r0 = r1.mRequestCode
                r2.writeInt(r0)
                return
        }
    }

    private static class LifecycleAwareResultListener implements androidx.fragment.app.FragmentResultListener {
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.fragment.app.FragmentResultListener mListener;
        private final androidx.lifecycle.LifecycleEventObserver mObserver;

        LifecycleAwareResultListener(androidx.lifecycle.Lifecycle r1, androidx.fragment.app.FragmentResultListener r2, androidx.lifecycle.LifecycleEventObserver r3) {
                r0 = this;
                r0.<init>()
                r0.mLifecycle = r1
                r0.mListener = r2
                r0.mObserver = r3
                return
        }

        public boolean isAtLeast(androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                boolean r0 = r0.isAtLeast(r2)
                return r0
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                androidx.fragment.app.FragmentResultListener r0 = r1.mListener
                r0.onFragmentResult(r2, r3)
                return
        }

        public void removeObserver() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.mLifecycle
                androidx.lifecycle.LifecycleEventObserver r1 = r2.mObserver
                r0.removeObserver(r1)
                return
        }
    }

    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    interface OpGenerator {
        boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1, java.util.ArrayList<java.lang.Boolean> r2);
    }

    private class PopBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        final int mFlags;
        final int mId;
        final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        PopBackStackState(androidx.fragment.app.FragmentManager r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                r0.mId = r3
                r0.mFlags = r4
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9, java.util.ArrayList<java.lang.Boolean> r10) {
                r8 = this;
                androidx.fragment.app.FragmentManager r0 = r8.this$0
                androidx.fragment.app.Fragment r0 = r0.mPrimaryNav
                if (r0 == 0) goto L1e
                int r0 = r8.mId
                if (r0 >= 0) goto L1e
                java.lang.String r0 = r8.mName
                if (r0 != 0) goto L1e
                androidx.fragment.app.FragmentManager r0 = r8.this$0
                androidx.fragment.app.Fragment r0 = r0.mPrimaryNav
                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                boolean r1 = r0.popBackStackImmediate()
                if (r1 == 0) goto L1e
                r1 = 0
                return r1
            L1e:
                androidx.fragment.app.FragmentManager r2 = r8.this$0
                java.lang.String r5 = r8.mName
                int r6 = r8.mId
                int r7 = r8.mFlags
                r3 = r9
                r4 = r10
                boolean r0 = r2.popBackStackState(r3, r4, r5, r6, r7)
                return r0
        }
    }

    static class StartEnterTransitionListener implements androidx.fragment.app.Fragment.OnStartEnterTransitionListener {
        final boolean mIsBack;
        private int mNumPostponed;
        final androidx.fragment.app.BackStackRecord mRecord;

        StartEnterTransitionListener(androidx.fragment.app.BackStackRecord r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.mIsBack = r2
                r0.mRecord = r1
                return
        }

        void cancelTransaction() {
                r4 = this;
                androidx.fragment.app.BackStackRecord r0 = r4.mRecord
                androidx.fragment.app.FragmentManager r0 = r0.mManager
                androidx.fragment.app.BackStackRecord r1 = r4.mRecord
                boolean r2 = r4.mIsBack
                r3 = 0
                r0.completeExecute(r1, r2, r3, r3)
                return
        }

        void completeTransaction() {
                r7 = this;
                int r0 = r7.mNumPostponed
                r1 = 0
                r2 = 1
                if (r0 <= 0) goto L8
                r0 = r2
                goto L9
            L8:
                r0 = r1
            L9:
                androidx.fragment.app.BackStackRecord r3 = r7.mRecord
                androidx.fragment.app.FragmentManager r3 = r3.mManager
                java.util.List r4 = r3.getFragments()
                java.util.Iterator r4 = r4.iterator()
            L15:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L31
                java.lang.Object r5 = r4.next()
                androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
                r6 = 0
                r5.setOnStartEnterTransitionListener(r6)
                if (r0 == 0) goto L30
                boolean r6 = r5.isPostponed()
                if (r6 == 0) goto L30
                r5.startPostponedEnterTransition()
            L30:
                goto L15
            L31:
                androidx.fragment.app.BackStackRecord r4 = r7.mRecord
                androidx.fragment.app.FragmentManager r4 = r4.mManager
                androidx.fragment.app.BackStackRecord r5 = r7.mRecord
                boolean r6 = r7.mIsBack
                if (r0 != 0) goto L3c
                r1 = r2
            L3c:
                r4.completeExecute(r5, r6, r1, r2)
                return
        }

        public boolean isReady() {
                r1 = this;
                int r0 = r1.mNumPostponed
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        public void onStartEnterTransition() {
                r1 = this;
                int r0 = r1.mNumPostponed
                int r0 = r0 + (-1)
                r1.mNumPostponed = r0
                int r0 = r1.mNumPostponed
                if (r0 == 0) goto Lb
                return
            Lb:
                androidx.fragment.app.BackStackRecord r0 = r1.mRecord
                androidx.fragment.app.FragmentManager r0 = r0.mManager
                r0.scheduleCommit()
                return
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        public void startListening() {
                r1 = this;
                int r0 = r1.mNumPostponed
                int r0 = r0 + 1
                r1.mNumPostponed = r0
                return
        }
    }

    static {
            r0 = 0
            androidx.fragment.app.FragmentManager.DEBUG = r0
            r0 = 1
            androidx.fragment.app.FragmentManager.USE_STATE_MANAGER = r0
            return
    }

    public FragmentManager() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mPendingActions = r0
            androidx.fragment.app.FragmentStore r0 = new androidx.fragment.app.FragmentStore
            r0.<init>()
            r2.mFragmentStore = r0
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = new androidx.fragment.app.FragmentLayoutInflaterFactory
            r0.<init>(r2)
            r2.mLayoutInflaterFactory = r0
            androidx.fragment.app.FragmentManager$1 r0 = new androidx.fragment.app.FragmentManager$1
            r1 = 0
            r0.<init>(r2, r1)
            r2.mOnBackPressedCallback = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.mBackStackIndex = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mResults = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mResultListeners = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mExitAnimationCancellationSignals = r0
            androidx.fragment.app.FragmentManager$2 r0 = new androidx.fragment.app.FragmentManager$2
            r0.<init>(r2)
            r2.mFragmentTransitionCallback = r0
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher
            r0.<init>(r2)
            r2.mLifecycleCallbacksDispatcher = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.mOnAttachListeners = r0
            r0 = -1
            r2.mCurState = r0
            r0 = 0
            r2.mFragmentFactory = r0
            androidx.fragment.app.FragmentManager$3 r1 = new androidx.fragment.app.FragmentManager$3
            r1.<init>(r2)
            r2.mHostFragmentFactory = r1
            r2.mSpecialEffectsControllerFactory = r0
            androidx.fragment.app.FragmentManager$4 r0 = new androidx.fragment.app.FragmentManager$4
            r0.<init>(r2)
            r2.mDefaultSpecialEffectsControllerFactory = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.mLaunchedFragments = r0
            androidx.fragment.app.FragmentManager$5 r0 = new androidx.fragment.app.FragmentManager$5
            r0.<init>(r2)
            r2.mExecCommit = r0
            return
    }

    static /* synthetic */ java.util.Map access$000(androidx.fragment.app.FragmentManager r1) {
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r1.mResults
            return r0
    }

    static /* synthetic */ java.util.Map access$100(androidx.fragment.app.FragmentManager r1) {
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r1.mResultListeners
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentStore access$200(androidx.fragment.app.FragmentManager r1) {
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            return r0
    }

    private void addAddedFragments(androidx.collection.ArraySet<androidx.fragment.app.Fragment> r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            int r0 = r4.mCurState
            r1 = 5
            int r0 = java.lang.Math.min(r0, r1)
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            java.util.List r1 = r1.getFragments()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            int r3 = r2.mState
            if (r3 >= r0) goto L39
            r4.moveToState(r2, r0)
            android.view.View r3 = r2.mView
            if (r3 == 0) goto L39
            boolean r3 = r2.mHidden
            if (r3 != 0) goto L39
            boolean r3 = r2.mIsNewlyAdded
            if (r3 == 0) goto L39
            r5.add(r2)
        L39:
            goto L17
        L3a:
            return
    }

    private void cancelExitAnimation(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r3.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r4)
            java.util.HashSet r0 = (java.util.HashSet) r0
            if (r0 == 0) goto L29
            java.util.Iterator r1 = r0.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            androidx.core.os.CancellationSignal r2 = (androidx.core.os.CancellationSignal) r2
            r2.cancel()
            goto Le
        L1e:
            r0.clear()
            r3.destroyFragmentView(r4)
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r1 = r3.mExitAnimationCancellationSignals
            r1.remove(r4)
        L29:
            return
    }

    private void checkStateLoss() {
            r2 = this;
            boolean r0 = r2.isStateSaved()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            r0.<init>(r1)
            throw r0
    }

    private void cleanupExec() {
            r1 = this;
            r0 = 0
            r1.mExecutingActions = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.mTmpIsPop
            r0.clear()
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mTmpRecords
            r0.clear()
            return
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectAllSpecialEffectsController() {
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            java.util.List r1 = r1.getActiveFragmentStateManagers()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            android.view.ViewGroup r3 = r3.mContainer
            if (r3 == 0) goto L2f
        L24:
            androidx.fragment.app.SpecialEffectsControllerFactory r4 = r5.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r4 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r3, r4)
            r0.add(r4)
        L2f:
            goto Lf
        L30:
            return r0
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectChangedControllers(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9, int r10, int r11) {
            r8 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = r10
        L6:
            if (r1 >= r11) goto L33
            java.lang.Object r2 = r9.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r2.mOps
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.C0291Op) r4
            androidx.fragment.app.Fragment r5 = r4.mFragment
            if (r5 == 0) goto L2f
            android.view.ViewGroup r6 = r5.mContainer
            if (r6 == 0) goto L2f
            androidx.fragment.app.SpecialEffectsController r7 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r6, r8)
            r0.add(r7)
        L2f:
            goto L14
        L30:
            int r1 = r1 + 1
            goto L6
        L33:
            return r0
    }

    private void completeShowHideFragment(androidx.fragment.app.Fragment r7) {
            r6 = this;
            android.view.View r0 = r7.mView
            r1 = 0
            if (r0 == 0) goto L7a
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            android.content.Context r0 = r0.getContext()
            boolean r2 = r7.mHidden
            r2 = r2 ^ 1
            boolean r3 = r7.getPopDirection()
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = androidx.fragment.app.FragmentAnim.loadAnimation(r0, r7, r2, r3)
            if (r0 == 0) goto L4f
            android.animation.Animator r2 = r0.animator
            if (r2 == 0) goto L4f
            android.animation.Animator r2 = r0.animator
            android.view.View r3 = r7.mView
            r2.setTarget(r3)
            boolean r2 = r7.mHidden
            if (r2 == 0) goto L44
            boolean r2 = r7.isHideReplaced()
            if (r2 == 0) goto L32
            r7.setHideReplaced(r1)
            goto L49
        L32:
            android.view.ViewGroup r2 = r7.mContainer
            android.view.View r3 = r7.mView
            r2.startViewTransition(r3)
            android.animation.Animator r4 = r0.animator
            androidx.fragment.app.FragmentManager$7 r5 = new androidx.fragment.app.FragmentManager$7
            r5.<init>(r6, r2, r3, r7)
            r4.addListener(r5)
            goto L49
        L44:
            android.view.View r2 = r7.mView
            r2.setVisibility(r1)
        L49:
            android.animation.Animator r2 = r0.animator
            r2.start()
            goto L7a
        L4f:
            if (r0 == 0) goto L5d
            android.view.View r2 = r7.mView
            android.view.animation.Animation r3 = r0.animation
            r2.startAnimation(r3)
            android.view.animation.Animation r2 = r0.animation
            r2.start()
        L5d:
            boolean r2 = r7.mHidden
            if (r2 == 0) goto L6a
            boolean r2 = r7.isHideReplaced()
            if (r2 != 0) goto L6a
            r2 = 8
            goto L6b
        L6a:
            r2 = r1
        L6b:
            android.view.View r3 = r7.mView
            r3.setVisibility(r2)
            boolean r3 = r7.isHideReplaced()
            if (r3 == 0) goto L7a
            r7.setHideReplaced(r1)
        L7a:
            r6.invalidateMenuForFragment(r7)
            r7.mHiddenChanged = r1
            boolean r0 = r7.mHidden
            r7.onHiddenChanged(r0)
            return
    }

    private void destroyFragmentView(androidx.fragment.app.Fragment r4) {
            r3 = this;
            r4.performDestroyView()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mLifecycleCallbacksDispatcher
            r1 = 0
            r0.dispatchOnFragmentViewDestroyed(r4, r1)
            r0 = 0
            r4.mContainer = r0
            r4.mView = r0
            r4.mViewLifecycleOwner = r0
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r2 = r4.mViewLifecycleOwnerLiveData
            r2.setValue(r0)
            r4.mInLayout = r1
            return
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(androidx.fragment.app.Fragment r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.lang.String r0 = r2.mWho
            androidx.fragment.app.Fragment r0 = r1.findActiveFragment(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L11
            r2.performPrimaryNavigationFragmentChanged()
        L11:
            return
    }

    private void dispatchStateChange(int r6) {
            r5 = this;
            r0 = 1
            r1 = 0
            r5.mExecutingActions = r0     // Catch: java.lang.Throwable -> L2f
            androidx.fragment.app.FragmentStore r2 = r5.mFragmentStore     // Catch: java.lang.Throwable -> L2f
            r2.dispatchStateChange(r6)     // Catch: java.lang.Throwable -> L2f
            r5.moveToState(r6, r1)     // Catch: java.lang.Throwable -> L2f
            boolean r2 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L28
            java.util.Set r2 = r5.collectAllSpecialEffectsController()     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L2f
        L18:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L28
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2f
            androidx.fragment.app.SpecialEffectsController r4 = (androidx.fragment.app.SpecialEffectsController) r4     // Catch: java.lang.Throwable -> L2f
            r4.forceCompleteAllOperations()     // Catch: java.lang.Throwable -> L2f
            goto L18
        L28:
            r5.mExecutingActions = r1
            r5.execPendingActions(r0)
            return
        L2f:
            r0 = move-exception
            r5.mExecutingActions = r1
            throw r0
    }

    private void doPendingDeferredStart() {
            r1 = this;
            boolean r0 = r1.mHavePendingDeferredStart
            if (r0 == 0) goto La
            r0 = 0
            r1.mHavePendingDeferredStart = r0
            r1.startPendingDeferredFragments()
        La:
            return
    }

    @java.lang.Deprecated
    public static void enableDebugLogging(boolean r0) {
            androidx.fragment.app.FragmentManager.DEBUG = r0
            return
    }

    public static void enableNewStateManager(boolean r0) {
            androidx.fragment.app.FragmentManager.USE_STATE_MANAGER = r0
            return
    }

    private void endAnimatingAwayFragments() {
            r3 = this;
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L1d
            java.util.Set r0 = r3.collectAllSpecialEffectsController()
            java.util.Iterator r1 = r0.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.forceCompleteAllOperations()
            goto Lc
        L1c:
            goto L42
        L1d:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r3.mExitAnimationCancellationSignals
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r3.mExitAnimationCancellationSignals
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r3.cancelExitAnimation(r1)
            r3.moveToState(r1)
            goto L2f
        L42:
            return
    }

    private void ensureExecReady(boolean r3) {
            r2 = this;
            boolean r0 = r2.mExecutingActions
            if (r0 != 0) goto L5b
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L1c
            boolean r0 = r2.mDestroyed
            if (r0 == 0) goto L14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager has been destroyed"
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager has not been attached to a host."
            r0.<init>(r1)
            throw r0
        L1c:
            android.os.Looper r0 = android.os.Looper.myLooper()
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost
            android.os.Handler r1 = r1.getHandler()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L53
            if (r3 != 0) goto L31
            r2.checkStateLoss()
        L31:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mTmpRecords
            if (r0 != 0) goto L43
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mTmpRecords = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mTmpIsPop = r0
        L43:
            r0 = 1
            r2.mExecutingActions = r0
            r0 = 0
            r1 = 0
            r2.executePostponedTransaction(r1, r1)     // Catch: java.lang.Throwable -> L4f
            r2.mExecutingActions = r0
            return
        L4f:
            r1 = move-exception
            r2.mExecutingActions = r0
            throw r1
        L53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called from main thread of fragment host"
            r0.<init>(r1)
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager is already executing transactions"
            r0.<init>(r1)
            throw r0
    }

    private static void executeOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5, java.util.ArrayList<java.lang.Boolean> r6, int r7, int r8) {
            r0 = r7
        L1:
            if (r0 >= r8) goto L2d
            java.lang.Object r1 = r5.get(r0)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.lang.Object r2 = r6.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 1
            if (r2 == 0) goto L24
            r4 = -1
            r1.bumpBackStackNesting(r4)
            int r4 = r8 + (-1)
            if (r0 != r4) goto L1f
            goto L20
        L1f:
            r3 = 0
        L20:
            r1.executePopOps(r3)
            goto L2a
        L24:
            r1.bumpBackStackNesting(r3)
            r1.executeOps()
        L2a:
            int r0 = r0 + 1
            goto L1
        L2d:
            return
    }

    private void executeOpsTogether(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r20, java.util.ArrayList<java.lang.Boolean> r21, int r22, int r23) {
            r19 = this;
            r6 = r19
            r15 = r20
            r5 = r21
            r4 = r22
            r3 = r23
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            boolean r2 = r0.mReorderingAllowed
            r0 = 0
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r6.mTmpAddedFragments
            if (r1 != 0) goto L1f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.mTmpAddedFragments = r1
            goto L24
        L1f:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r6.mTmpAddedFragments
            r1.clear()
        L24:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r6.mTmpAddedFragments
            androidx.fragment.app.FragmentStore r7 = r6.mFragmentStore
            java.util.List r7 = r7.getFragments()
            r1.addAll(r7)
            androidx.fragment.app.Fragment r1 = r19.getPrimaryNavigationFragment()
            r7 = r22
            r16 = r0
        L37:
            r0 = 1
            if (r7 >= r3) goto L66
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.BackStackRecord r8 = (androidx.fragment.app.BackStackRecord) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L53
            java.util.ArrayList<androidx.fragment.app.Fragment> r10 = r6.mTmpAddedFragments
            androidx.fragment.app.Fragment r1 = r8.expandOps(r10, r1)
            goto L59
        L53:
            java.util.ArrayList<androidx.fragment.app.Fragment> r10 = r6.mTmpAddedFragments
            androidx.fragment.app.Fragment r1 = r8.trackAddedFragmentsInPop(r10, r1)
        L59:
            if (r16 != 0) goto L61
            boolean r10 = r8.mAddToBackStack
            if (r10 == 0) goto L60
            goto L61
        L60:
            r0 = 0
        L61:
            r16 = r0
            int r7 = r7 + 1
            goto L37
        L66:
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r6.mTmpAddedFragments
            r7.clear()
            if (r2 != 0) goto Lbe
            int r7 = r6.mCurState
            if (r7 < r0) goto Lbe
            boolean r7 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r7 == 0) goto La8
            r7 = r22
        L77:
            if (r7 >= r3) goto La7
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.BackStackRecord r8 = (androidx.fragment.app.BackStackRecord) r8
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r9 = r8.mOps
            java.util.Iterator r9 = r9.iterator()
        L85:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La4
            java.lang.Object r10 = r9.next()
            androidx.fragment.app.FragmentTransaction$Op r10 = (androidx.fragment.app.FragmentTransaction.C0291Op) r10
            androidx.fragment.app.Fragment r11 = r10.mFragment
            if (r11 == 0) goto La3
            androidx.fragment.app.FragmentManager r12 = r11.mFragmentManager
            if (r12 == 0) goto La3
        L9a:
            androidx.fragment.app.FragmentStateManager r12 = r6.createOrGetFragmentStateManager(r11)
            androidx.fragment.app.FragmentStore r13 = r6.mFragmentStore
            r13.makeActive(r12)
        La3:
            goto L85
        La4:
            int r7 = r7 + 1
            goto L77
        La7:
            goto Lbe
        La8:
            androidx.fragment.app.FragmentHostCallback<?> r7 = r6.mHost
            android.content.Context r7 = r7.getContext()
            androidx.fragment.app.FragmentContainer r8 = r6.mContainer
            r13 = 0
            androidx.fragment.app.FragmentTransition$Callback r14 = r6.mFragmentTransitionCallback
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            androidx.fragment.app.FragmentTransition.startTransitions(r7, r8, r9, r10, r11, r12, r13, r14)
        Lbe:
            executeOps(r20, r21, r22, r23)
            boolean r7 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r7 == 0) goto L14b
            int r7 = r3 + (-1)
            java.lang.Object r7 = r5.get(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = r22
        Ld3:
            if (r8 >= r3) goto L120
            java.lang.Object r9 = r15.get(r8)
            androidx.fragment.app.BackStackRecord r9 = (androidx.fragment.app.BackStackRecord) r9
            if (r7 == 0) goto Lfe
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r10 = r9.mOps
            int r10 = r10.size()
            int r10 = r10 - r0
        Le4:
            if (r10 < 0) goto Lfd
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r11 = r9.mOps
            java.lang.Object r11 = r11.get(r10)
            androidx.fragment.app.FragmentTransaction$Op r11 = (androidx.fragment.app.FragmentTransaction.C0291Op) r11
            androidx.fragment.app.Fragment r12 = r11.mFragment
            if (r12 == 0) goto Lfa
        Lf3:
            androidx.fragment.app.FragmentStateManager r13 = r6.createOrGetFragmentStateManager(r12)
            r13.moveToExpectedState()
        Lfa:
            int r10 = r10 + (-1)
            goto Le4
        Lfd:
            goto L11d
        Lfe:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r10 = r9.mOps
            java.util.Iterator r10 = r10.iterator()
        L104:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L11d
            java.lang.Object r11 = r10.next()
            androidx.fragment.app.FragmentTransaction$Op r11 = (androidx.fragment.app.FragmentTransaction.C0291Op) r11
            androidx.fragment.app.Fragment r12 = r11.mFragment
            if (r12 == 0) goto L11c
        L115:
            androidx.fragment.app.FragmentStateManager r13 = r6.createOrGetFragmentStateManager(r12)
            r13.moveToExpectedState()
        L11c:
            goto L104
        L11d:
            int r8 = r8 + 1
            goto Ld3
        L120:
            int r8 = r6.mCurState
            r6.moveToState(r8, r0)
            java.util.Set r0 = r6.collectChangedControllers(r15, r4, r3)
            java.util.Iterator r8 = r0.iterator()
        L12d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L143
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.SpecialEffectsController r9 = (androidx.fragment.app.SpecialEffectsController) r9
            r9.updateOperationDirection(r7)
            r9.markPostponedState()
            r9.executePendingOperations()
            goto L12d
        L143:
            r17 = r1
            r18 = r2
            r4 = r3
            r3 = r5
            goto L1aa
        L14b:
            r7 = r23
            if (r2 == 0) goto L173
            androidx.collection.ArraySet r8 = new androidx.collection.ArraySet
            r8.<init>()
            r6.addAddedFragments(r8)
            r14 = r0
            r0 = r19
            r17 = r1
            r1 = r20
            r18 = r2
            r2 = r21
            r13 = r3
            r3 = r22
            r12 = r4
            r4 = r23
            r11 = r5
            r5 = r8
            int r7 = r0.postponePostponableTransactions(r1, r2, r3, r4, r5)
            r6.makeRemovedFragmentsInvisible(r8)
            r0 = r7
            goto L17c
        L173:
            r14 = r0
            r17 = r1
            r18 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r0 = r7
        L17c:
            if (r0 == r12) goto L1a8
            if (r18 == 0) goto L1a8
            int r1 = r6.mCurState
            if (r1 < r14) goto L19f
            androidx.fragment.app.FragmentHostCallback<?> r1 = r6.mHost
            android.content.Context r7 = r1.getContext()
            androidx.fragment.app.FragmentContainer r8 = r6.mContainer
            r1 = 1
            androidx.fragment.app.FragmentTransition$Callback r2 = r6.mFragmentTransitionCallback
            r9 = r20
            r10 = r21
            r3 = r11
            r11 = r22
            r12 = r0
            r4 = r13
            r13 = r1
            r1 = r14
            r14 = r2
            androidx.fragment.app.FragmentTransition.startTransitions(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L1a2
        L19f:
            r3 = r11
            r4 = r13
            r1 = r14
        L1a2:
            int r2 = r6.mCurState
            r6.moveToState(r2, r1)
            goto L1aa
        L1a8:
            r3 = r11
            r4 = r13
        L1aa:
            r0 = r22
        L1ac:
            if (r0 >= r4) goto L1cd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.lang.Object r2 = r3.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1c7
            int r5 = r1.mIndex
            if (r5 < 0) goto L1c7
            r5 = -1
            r1.mIndex = r5
        L1c7:
            r1.runOnCommitRunnables()
            int r0 = r0 + 1
            goto L1ac
        L1cd:
            if (r16 == 0) goto L1d2
            r19.reportBackStackChanged()
        L1d2:
            return
    }

    private void executePostponedTransaction(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8, java.util.ArrayList<java.lang.Boolean> r9) {
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r7.mPostponedTransactions
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Ld
        L7:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r7.mPostponedTransactions
            int r0 = r0.size()
        Ld:
            r2 = 0
        Le:
            if (r2 >= r0) goto L86
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r3 = r7.mPostponedTransactions
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r3 = (androidx.fragment.app.FragmentManager.StartEnterTransitionListener) r3
            r4 = -1
            if (r8 == 0) goto L42
            boolean r5 = r3.mIsBack
            if (r5 != 0) goto L42
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L42
            if (r9 == 0) goto L42
            java.lang.Object r6 = r9.get(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L42
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r4 = r7.mPostponedTransactions
            r4.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            r3.cancelTransaction()
            goto L83
        L42:
            boolean r5 = r3.isReady()
            if (r5 != 0) goto L56
            if (r8 == 0) goto L83
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r6 = r8.size()
            boolean r5 = r5.interactsWith(r8, r1, r6)
            if (r5 == 0) goto L83
        L56:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r5 = r7.mPostponedTransactions
            r5.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            if (r8 == 0) goto L80
            boolean r5 = r3.mIsBack
            if (r5 != 0) goto L80
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r5 = r8.indexOf(r5)
            r6 = r5
            if (r5 == r4) goto L80
            if (r9 == 0) goto L80
            java.lang.Object r4 = r9.get(r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L80
            r3.cancelTransaction()
            goto L83
        L80:
            r3.completeTransaction()
        L83:
            int r2 = r2 + 1
            goto Le
        L86:
            return
    }

    public static <F extends androidx.fragment.app.Fragment> F findFragment(android.view.View r4) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r4)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "View "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " does not have a Fragment set"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    static androidx.fragment.app.FragmentManager findFragmentManager(android.view.View r6) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r6)
            if (r0 == 0) goto L3a
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L11
            androidx.fragment.app.FragmentManager r1 = r0.getChildFragmentManager()
            goto L5a
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " that owns View "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3a:
            android.content.Context r1 = r6.getContext()
            r2 = 0
        L3f:
            boolean r3 = r1 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L53
            boolean r3 = r1 instanceof androidx.fragment.app.FragmentActivity
            if (r3 == 0) goto L4b
            r2 = r1
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            goto L53
        L4b:
            r3 = r1
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r1 = r3.getBaseContext()
            goto L3f
        L53:
            if (r2 == 0) goto L5b
            androidx.fragment.app.FragmentManager r3 = r2.getSupportFragmentManager()
            r1 = r3
        L5a:
            return r1
        L5b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "View "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = " is not within a subclass of FragmentActivity."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private static androidx.fragment.app.Fragment findViewFragment(android.view.View r4) {
        L1:
            r0 = 0
            if (r4 == 0) goto L18
            androidx.fragment.app.Fragment r1 = getViewFragment(r4)
            if (r1 == 0) goto Lb
            return r1
        Lb:
            android.view.ViewParent r2 = r4.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L16
            r0 = r2
            android.view.View r0 = (android.view.View) r0
        L16:
            r4 = r0
            goto L1
        L18:
            return r0
    }

    private void forcePostponedTransactions() {
            r3 = this;
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L1d
            java.util.Set r0 = r3.collectAllSpecialEffectsController()
            java.util.Iterator r1 = r0.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.forcePostponedExecutePendingOperations()
            goto Lc
        L1c:
            goto L36
        L1d:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r3.mPostponedTransactions
            if (r0 == 0) goto L36
        L21:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r3.mPostponedTransactions
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L36
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r3.mPostponedTransactions
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r0 = (androidx.fragment.app.FragmentManager.StartEnterTransitionListener) r0
            r0.completeTransaction()
            goto L21
        L36:
            return
    }

    private boolean generateOpsForPendingActions(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6, java.util.ArrayList<java.lang.Boolean> r7) {
            r5 = this;
            r0 = 0
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions
            monitor-enter(r1)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r2 = r5.mPendingActions     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto Lf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            r1 = 0
            return r1
        Lf:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r2 = r5.mPendingActions     // Catch: java.lang.Throwable -> L3a
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L3a
            r3 = 0
        L16:
            if (r3 >= r2) goto L28
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r5.mPendingActions     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.FragmentManager$OpGenerator r4 = (androidx.fragment.app.FragmentManager.OpGenerator) r4     // Catch: java.lang.Throwable -> L3a
            boolean r4 = r4.generateOps(r6, r7)     // Catch: java.lang.Throwable -> L3a
            r0 = r0 | r4
            int r3 = r3 + 1
            goto L16
        L28:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r3 = r5.mPendingActions     // Catch: java.lang.Throwable -> L3a
            r3.clear()     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.FragmentHostCallback<?> r3 = r5.mHost     // Catch: java.lang.Throwable -> L3a
            android.os.Handler r3 = r3.getHandler()     // Catch: java.lang.Throwable -> L3a
            java.lang.Runnable r4 = r5.mExecCommit     // Catch: java.lang.Throwable -> L3a
            r3.removeCallbacks(r4)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            return r0
        L3a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            throw r2
    }

    private androidx.fragment.app.FragmentManagerViewModel getChildNonConfig(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getChildNonConfig(r2)
            return r0
    }

    private android.view.ViewGroup getFragmentContainer(androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.view.ViewGroup r0 = r4.mContainer
            if (r0 == 0) goto L7
            android.view.ViewGroup r0 = r4.mContainer
            return r0
        L7:
            int r0 = r4.mContainerId
            r1 = 0
            if (r0 > 0) goto Ld
            return r1
        Ld:
            androidx.fragment.app.FragmentContainer r0 = r3.mContainer
            boolean r0 = r0.onHasView()
            if (r0 == 0) goto L25
            androidx.fragment.app.FragmentContainer r0 = r3.mContainer
            int r2 = r4.mContainerId
            android.view.View r0 = r0.onFindViewById(r2)
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L25
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            return r1
        L25:
            return r1
    }

    static androidx.fragment.app.Fragment getViewFragment(android.view.View r2) {
            int r0 = androidx.fragment.C0240R.id.fragment_container_view_tag
            java.lang.Object r0 = r2.getTag(r0)
            boolean r1 = r0 instanceof androidx.fragment.app.Fragment
            if (r1 == 0) goto Le
            r1 = r0
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            return r1
        Le:
            r1 = 0
            return r1
    }

    static boolean isLoggingEnabled(int r1) {
            boolean r0 = androidx.fragment.app.FragmentManager.DEBUG
            if (r0 != 0) goto Lf
            java.lang.String r0 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private boolean isMenuAvailable(androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L8
            boolean r0 = r2.mMenuVisible
            if (r0 != 0) goto L10
        L8:
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            boolean r0 = r0.checkForMenus()
            if (r0 == 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private void makeRemovedFragmentsInvisible(androidx.collection.ArraySet<androidx.fragment.app.Fragment> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L22
            java.lang.Object r2 = r6.valueAt(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r3 = r2.mAdded
            if (r3 != 0) goto L1f
            android.view.View r3 = r2.requireView()
            float r4 = r3.getAlpha()
            r2.mPostponedAlpha = r4
            r4 = 0
            r3.setAlpha(r4)
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            return
    }

    private boolean popBackStackImmediate(java.lang.String r10, int r11, int r12) {
            r9 = this;
            r0 = 0
            r9.execPendingActions(r0)
            r0 = 1
            r9.ensureExecReady(r0)
            androidx.fragment.app.Fragment r1 = r9.mPrimaryNav
            if (r1 == 0) goto L1d
            if (r11 >= 0) goto L1d
            if (r10 != 0) goto L1d
            androidx.fragment.app.Fragment r1 = r9.mPrimaryNav
            androidx.fragment.app.FragmentManager r1 = r1.getChildFragmentManager()
            boolean r2 = r1.popBackStackImmediate()
            if (r2 == 0) goto L1d
            return r0
        L1d:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r4 = r9.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r5 = r9.mTmpIsPop
            r3 = r9
            r6 = r10
            r7 = r11
            r8 = r12
            boolean r1 = r3.popBackStackState(r4, r5, r6, r7, r8)
            if (r1 == 0) goto L3d
            r9.mExecutingActions = r0
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r9.mTmpRecords     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList<java.lang.Boolean> r2 = r9.mTmpIsPop     // Catch: java.lang.Throwable -> L38
            r9.removeRedundantOperationsAndExecute(r0, r2)     // Catch: java.lang.Throwable -> L38
            r9.cleanupExec()
            goto L3d
        L38:
            r0 = move-exception
            r9.cleanupExec()
            throw r0
        L3d:
            r9.updateOnBackPressedCallbackEnabled()
            r9.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r0 = r9.mFragmentStore
            r0.burpActive()
            return r1
    }

    private int postponePostponableTransactions(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9, java.util.ArrayList<java.lang.Boolean> r10, int r11, int r12, androidx.collection.ArraySet<androidx.fragment.app.Fragment> r13) {
            r8 = this;
            r0 = r12
            int r1 = r12 + (-1)
        L3:
            if (r1 < r11) goto L5a
            java.lang.Object r2 = r9.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.lang.Object r3 = r10.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r4 = r2.isPostponed()
            r5 = 0
            if (r4 == 0) goto L26
            int r4 = r1 + 1
            boolean r4 = r2.interactsWith(r9, r4, r12)
            if (r4 != 0) goto L26
            r4 = 1
            goto L27
        L26:
            r4 = r5
        L27:
            if (r4 == 0) goto L57
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r6 = r8.mPostponedTransactions
            if (r6 != 0) goto L34
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r8.mPostponedTransactions = r6
        L34:
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r6 = new androidx.fragment.app.FragmentManager$StartEnterTransitionListener
            r6.<init>(r2, r3)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r7 = r8.mPostponedTransactions
            r7.add(r6)
            r2.setOnStartPostponedListener(r6)
            if (r3 == 0) goto L47
            r2.executeOps()
            goto L4a
        L47:
            r2.executePopOps(r5)
        L4a:
            int r0 = r0 + (-1)
            if (r1 == r0) goto L54
            r9.remove(r1)
            r9.add(r0, r2)
        L54:
            r8.addAddedFragments(r13)
        L57:
            int r1 = r1 + (-1)
            goto L3
        L5a:
            return r0
    }

    private void removeRedundantOperationsAndExecute(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7, java.util.ArrayList<java.lang.Boolean> r8) {
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r7.size()
            int r1 = r8.size()
            if (r0 != r1) goto L63
            r6.executePostponedTransaction(r7, r8)
            int r0 = r7.size()
            r1 = 0
            r2 = 0
        L1a:
            if (r2 >= r0) goto L5d
            java.lang.Object r3 = r7.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r3 = r3.mReorderingAllowed
            if (r3 != 0) goto L5a
            if (r1 == r2) goto L2b
            r6.executeOpsTogether(r7, r8, r1, r2)
        L2b:
            int r4 = r2 + 1
            java.lang.Object r5 = r8.get(r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L54
        L39:
            if (r4 >= r0) goto L54
            java.lang.Object r5 = r8.get(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r7.get(r4)
            androidx.fragment.app.BackStackRecord r5 = (androidx.fragment.app.BackStackRecord) r5
            boolean r5 = r5.mReorderingAllowed
            if (r5 != 0) goto L54
            int r4 = r4 + 1
            goto L39
        L54:
            r6.executeOpsTogether(r7, r8, r2, r4)
            r1 = r4
            int r2 = r4 + (-1)
        L5a:
            int r2 = r2 + 1
            goto L1a
        L5d:
            if (r1 == r0) goto L62
            r6.executeOpsTogether(r7, r8, r1, r0)
        L62:
            return
        L63:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Internal error with the back stack records"
            r0.<init>(r1)
            throw r0
    }

    private void reportBackStackChanged() {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r2.mBackStackChangeListeners
            if (r0 == 0) goto L1b
            r0 = 0
        L5:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentManager$OnBackStackChangedListener r1 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r1
            r1.onBackStackChanged()
            int r0 = r0 + 1
            goto L5
        L1b:
            return
    }

    static int reverseTransit(int r1) {
            r0 = 0
            switch(r1) {
                case 4097: goto Lb;
                case 4099: goto L8;
                case 8194: goto L5;
                default: goto L4;
            }
        L4:
            goto Le
        L5:
            r0 = 4097(0x1001, float:5.741E-42)
            goto Le
        L8:
            r0 = 4099(0x1003, float:5.744E-42)
            goto Le
        Lb:
            r0 = 8194(0x2002, float:1.1482E-41)
        Le:
            return r0
    }

    private void setVisibleRemovingFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.getFragmentContainer(r4)
            if (r0 == 0) goto L37
            int r1 = r4.getEnterAnim()
            int r2 = r4.getExitAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopEnterAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopExitAnim()
            int r1 = r1 + r2
            if (r1 <= 0) goto L37
            int r1 = androidx.fragment.C0240R.id.visible_removing_fragment_view_tag
            java.lang.Object r1 = r0.getTag(r1)
            if (r1 != 0) goto L28
            int r1 = androidx.fragment.C0240R.id.visible_removing_fragment_view_tag
            r0.setTag(r1, r4)
        L28:
            int r1 = androidx.fragment.C0240R.id.visible_removing_fragment_view_tag
            java.lang.Object r1 = r0.getTag(r1)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r2 = r4.getPopDirection()
            r1.setPopDirection(r2)
        L37:
            return
    }

    private void startPendingDeferredFragments() {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            r2.performPendingDeferredStart(r1)
            goto La
        L1a:
            return
    }

    private void throwException(java.lang.RuntimeException r9) {
            r8 = this;
            java.lang.String r0 = r9.getMessage()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Activity state:"
            android.util.Log.e(r1, r0)
            androidx.fragment.app.LogWriter r0 = new androidx.fragment.app.LogWriter
            r0.<init>(r1)
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            androidx.fragment.app.FragmentHostCallback<?> r3 = r8.mHost
            java.lang.String r4 = "Failed dumping state"
            r5 = 0
            r6 = 0
            java.lang.String r7 = "  "
            if (r3 == 0) goto L2f
            androidx.fragment.app.FragmentHostCallback<?> r3 = r8.mHost     // Catch: java.lang.Exception -> L2a
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Exception -> L2a
            r3.onDump(r7, r6, r2, r5)     // Catch: java.lang.Exception -> L2a
            goto L2e
        L2a:
            r3 = move-exception
            android.util.Log.e(r1, r4, r3)
        L2e:
            goto L39
        L2f:
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch: java.lang.Exception -> L35
            r8.dump(r7, r6, r2, r3)     // Catch: java.lang.Exception -> L35
            goto L39
        L35:
            r3 = move-exception
            android.util.Log.e(r1, r4, r3)
        L39:
            throw r9
    }

    private void updateOnBackPressedCallbackEnabled() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r3.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r3.mPendingActions     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2a
            r2 = 1
            if (r1 != 0) goto L13
            androidx.activity.OnBackPressedCallback r1 = r3.mOnBackPressedCallback     // Catch: java.lang.Throwable -> L2a
            r1.setEnabled(r2)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            androidx.activity.OnBackPressedCallback r0 = r3.mOnBackPressedCallback
            int r1 = r3.getBackStackEntryCount()
            if (r1 <= 0) goto L25
            androidx.fragment.app.Fragment r1 = r3.mParent
            boolean r1 = r3.isPrimaryNavigation(r1)
            if (r1 == 0) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            r0.setEnabled(r2)
            return
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
    }

    void addBackStackState(androidx.fragment.app.BackStackRecord r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStack = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            r0.add(r2)
            return
    }

    void addCancellationSignal(androidx.fragment.app.Fragment r3, androidx.core.os.CancellationSignal r4) {
            r2 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L12
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.put(r3, r1)
        L12:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r3)
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.add(r4)
            return
    }

    androidx.fragment.app.FragmentStateManager addFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            androidx.fragment.app.FragmentStateManager r0 = r3.createOrGetFragmentStateManager(r4)
            r4.mFragmentManager = r3
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.makeActive(r0)
            boolean r1 = r4.mDetached
            if (r1 != 0) goto L45
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.addFragment(r4)
            r1 = 0
            r4.mRemoving = r1
            android.view.View r2 = r4.mView
            if (r2 != 0) goto L3c
            r4.mHiddenChanged = r1
        L3c:
            boolean r1 = r3.isMenuAvailable(r4)
            if (r1 == 0) goto L45
            r1 = 1
            r3.mNeedMenuInvalidate = r1
        L45:
            return r0
    }

    public void addFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.add(r2)
            return
    }

    public void addOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStackChangeListeners = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            r0.add(r2)
            return
    }

    void addRetainedFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.addRetainedFragment(r2)
            return
    }

    int allocBackStackIndex() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.mBackStackIndex
            int r0 = r0.getAndIncrement()
            return r0
    }

    void attachController(androidx.fragment.app.FragmentHostCallback<?> r7, androidx.fragment.app.FragmentContainer r8, androidx.fragment.app.Fragment r9) {
            r6 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            if (r0 != 0) goto L11b
            r6.mHost = r7
            r6.mContainer = r8
            r6.mParent = r9
            androidx.fragment.app.Fragment r0 = r6.mParent
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentManager$8 r0 = new androidx.fragment.app.FragmentManager$8
            r0.<init>(r6, r9)
            r6.addFragmentOnAttachListener(r0)
            goto L21
        L17:
            boolean r0 = r7 instanceof androidx.fragment.app.FragmentOnAttachListener
            if (r0 == 0) goto L21
            r0 = r7
            androidx.fragment.app.FragmentOnAttachListener r0 = (androidx.fragment.app.FragmentOnAttachListener) r0
            r6.addFragmentOnAttachListener(r0)
        L21:
            androidx.fragment.app.Fragment r0 = r6.mParent
            if (r0 == 0) goto L28
            r6.updateOnBackPressedCallbackEnabled()
        L28:
            boolean r0 = r7 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r0 == 0) goto L41
            r0 = r7
            androidx.activity.OnBackPressedDispatcherOwner r0 = (androidx.activity.OnBackPressedDispatcherOwner) r0
            androidx.activity.OnBackPressedDispatcher r1 = r0.getOnBackPressedDispatcher()
            r6.mOnBackPressedDispatcher = r1
            if (r9 == 0) goto L39
            r1 = r9
            goto L3a
        L39:
            r1 = r0
        L3a:
            androidx.activity.OnBackPressedDispatcher r2 = r6.mOnBackPressedDispatcher
            androidx.activity.OnBackPressedCallback r3 = r6.mOnBackPressedCallback
            r2.addCallback(r1, r3)
        L41:
            if (r9 == 0) goto L4c
            androidx.fragment.app.FragmentManager r0 = r9.mFragmentManager
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getChildNonConfig(r9)
            r6.mNonConfig = r0
            goto L66
        L4c:
            boolean r0 = r7 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L5e
            r0 = r7
            androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
            androidx.fragment.app.FragmentManagerViewModel r1 = androidx.fragment.app.FragmentManagerViewModel.getInstance(r0)
            r6.mNonConfig = r1
            goto L66
        L5e:
            androidx.fragment.app.FragmentManagerViewModel r0 = new androidx.fragment.app.FragmentManagerViewModel
            r1 = 0
            r0.<init>(r1)
            r6.mNonConfig = r0
        L66:
            androidx.fragment.app.FragmentManagerViewModel r0 = r6.mNonConfig
            boolean r1 = r6.isStateSaved()
            r0.setIsStateSaved(r1)
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r6.mNonConfig
            r0.setNonConfig(r1)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.activity.result.ActivityResultRegistryOwner
            if (r0 == 0) goto L11a
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.activity.result.ActivityResultRegistryOwner r0 = (androidx.activity.result.ActivityResultRegistryOwner) r0
            androidx.activity.result.ActivityResultRegistry r0 = r0.getActivityResultRegistry()
            if (r9 == 0) goto L9c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.mWho
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L9e
        L9c:
            java.lang.String r1 = ""
        L9e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "FragmentManager:"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "StartActivityForResult"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r4 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r4.<init>()
            androidx.fragment.app.FragmentManager$9 r5 = new androidx.fragment.app.FragmentManager$9
            r5.<init>(r6)
            androidx.activity.result.ActivityResultLauncher r3 = r0.register(r3, r4, r5)
            r6.mStartActivityForResult = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "StartIntentSenderForResult"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.fragment.app.FragmentManager$FragmentIntentSenderContract r4 = new androidx.fragment.app.FragmentManager$FragmentIntentSenderContract
            r4.<init>()
            androidx.fragment.app.FragmentManager$10 r5 = new androidx.fragment.app.FragmentManager$10
            r5.<init>(r6)
            androidx.activity.result.ActivityResultLauncher r3 = r0.register(r3, r4, r5)
            r6.mStartIntentSenderForResult = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "RequestPermissions"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions r4 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions
            r4.<init>()
            androidx.fragment.app.FragmentManager$11 r5 = new androidx.fragment.app.FragmentManager$11
            r5.<init>(r6)
            androidx.activity.result.ActivityResultLauncher r3 = r0.register(r3, r4, r5)
            r6.mRequestPermissions = r3
        L11a:
            return
        L11b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already attached"
            r0.<init>(r1)
            throw r0
    }

    void attachFragment(androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "attach: "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1f:
            boolean r1 = r5.mDetached
            if (r1 == 0) goto L54
            r1 = 0
            r5.mDetached = r1
            boolean r1 = r5.mAdded
            if (r1 != 0) goto L54
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            r1.addFragment(r5)
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L4b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add from attach: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L4b:
            boolean r0 = r4.isMenuAvailable(r5)
            if (r0 == 0) goto L54
            r0 = 1
            r4.mNeedMenuInvalidate = r0
        L54:
            return
    }

    public androidx.fragment.app.FragmentTransaction beginTransaction() {
            r1 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r1)
            return r0
    }

    boolean checkForMenus() {
            r3 = this;
            r0 = 0
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            java.util.List r1 = r1.getActiveFragments()
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L1d
            boolean r0 = r3.isMenuAvailable(r2)
        L1d:
            if (r0 == 0) goto L21
            r1 = 1
            return r1
        L21:
            goto Lb
        L22:
            r1 = 0
            return r1
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r1.mResults
            r0.remove(r2)
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r1.mResultListeners
            java.lang.Object r0 = r0.remove(r2)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r0 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r0
            if (r0 == 0) goto Ld
            r0.removeObserver()
        Ld:
            return
    }

    void completeExecute(androidx.fragment.app.BackStackRecord r12, boolean r13, boolean r14, boolean r15) {
            r11 = this;
            if (r13 == 0) goto L6
            r12.executePopOps(r15)
            goto L9
        L6:
            r12.executeOps()
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r10 = r2
            r0.add(r12)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            r10.add(r2)
            if (r14 == 0) goto L37
            int r2 = r11.mCurState
            if (r2 < r1) goto L37
            androidx.fragment.app.FragmentHostCallback<?> r2 = r11.mHost
            android.content.Context r2 = r2.getContext()
            androidx.fragment.app.FragmentContainer r3 = r11.mContainer
            r8 = 1
            androidx.fragment.app.FragmentTransition$Callback r9 = r11.mFragmentTransitionCallback
            r6 = 0
            r7 = 1
            r4 = r0
            r5 = r10
            androidx.fragment.app.FragmentTransition.startTransitions(r2, r3, r4, r5, r6, r7, r8, r9)
        L37:
            if (r15 == 0) goto L3e
            int r2 = r11.mCurState
            r11.moveToState(r2, r1)
        L3e:
            androidx.fragment.app.FragmentStore r1 = r11.mFragmentStore
            java.util.List r1 = r1.getActiveFragments()
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L81
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L80
            android.view.View r3 = r2.mView
            if (r3 == 0) goto L80
            boolean r3 = r2.mIsNewlyAdded
            if (r3 == 0) goto L80
            int r3 = r2.mContainerId
            boolean r3 = r12.interactsWith(r3)
            if (r3 == 0) goto L80
            float r3 = r2.mPostponedAlpha
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L74
            android.view.View r3 = r2.mView
            float r5 = r2.mPostponedAlpha
            r3.setAlpha(r5)
        L74:
            if (r15 == 0) goto L79
            r2.mPostponedAlpha = r4
            goto L80
        L79:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mPostponedAlpha = r3
            r3 = 0
            r2.mIsNewlyAdded = r3
        L80:
            goto L48
        L81:
            return
    }

    androidx.fragment.app.FragmentStateManager createOrGetFragmentStateManager(androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.lang.String r1 = r5.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            androidx.fragment.app.FragmentStateManager r1 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r4.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r3 = r4.mFragmentStore
            r1.<init>(r2, r3, r5)
            androidx.fragment.app.FragmentHostCallback<?> r2 = r4.mHost
            android.content.Context r2 = r2.getContext()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.restoreState(r2)
            int r2 = r4.mCurState
            r1.setFragmentManagerState(r2)
            return r1
    }

    void detachFragment(androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "detach: "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1f:
            boolean r1 = r5.mDetached
            if (r1 != 0) goto L56
            r1 = 1
            r5.mDetached = r1
            boolean r3 = r5.mAdded
            if (r3 == 0) goto L56
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "remove from detach: "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L46:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            r0.removeFragment(r5)
            boolean r0 = r4.isMenuAvailable(r5)
            if (r0 == 0) goto L53
            r4.mNeedMenuInvalidate = r1
        L53:
            r4.setVisibleRemovingFragment(r5)
        L56:
            return
    }

    void dispatchActivityCreated() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchAttach() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1b
            r1.performConfigurationChanged(r3)
        L1b:
            goto La
        L1c:
            return
    }

    boolean dispatchContextItemSelected(android.view.MenuItem r6) {
            r5 = this;
            int r0 = r5.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L26
            boolean r4 = r3.performContextItemSelected(r6)
            if (r4 == 0) goto L26
            return r2
        L26:
            goto L11
        L27:
            return r1
    }

    void dispatchCreate() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 1
            r2.dispatchStateChange(r0)
            return
    }

    boolean dispatchCreateOptionsMenu(android.view.Menu r6, android.view.MenuInflater r7) {
            r5 = this;
            int r0 = r5.mCurState
            r1 = 1
            if (r0 >= r1) goto L7
            r0 = 0
            return r0
        L7:
            r0 = 0
            r1 = 0
            androidx.fragment.app.FragmentStore r2 = r5.mFragmentStore
            java.util.List r2 = r2.getFragments()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L39
            boolean r4 = r5.isParentMenuVisible(r3)
            if (r4 == 0) goto L39
            boolean r4 = r3.performCreateOptionsMenu(r6, r7)
            if (r4 == 0) goto L39
            r0 = 1
            if (r1 != 0) goto L36
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1 = r4
        L36:
            r1.add(r3)
        L39:
            goto L13
        L3a:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mCreatedMenus
            if (r2 == 0) goto L5d
            r2 = 0
        L3f:
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r5.mCreatedMenus
            int r3 = r3.size()
            if (r2 >= r3) goto L5d
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r5.mCreatedMenus
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r1 == 0) goto L57
            boolean r4 = r1.contains(r3)
            if (r4 != 0) goto L5a
        L57:
            r3.onDestroyOptionsMenu()
        L5a:
            int r2 = r2 + 1
            goto L3f
        L5d:
            r5.mCreatedMenus = r1
            return r0
    }

    void dispatchDestroy() {
            r2 = this;
            r0 = 1
            r2.mDestroyed = r0
            r2.execPendingActions(r0)
            r2.endAnimatingAwayFragments()
            r0 = -1
            r2.dispatchStateChange(r0)
            r0 = 0
            r2.mHost = r0
            r2.mContainer = r0
            r2.mParent = r0
            androidx.activity.OnBackPressedDispatcher r1 = r2.mOnBackPressedDispatcher
            if (r1 == 0) goto L1f
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r1.remove()
            r2.mOnBackPressedDispatcher = r0
        L1f:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mStartActivityForResult
            if (r0 == 0) goto L32
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mStartActivityForResult
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r0 = r2.mStartIntentSenderForResult
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r2.mRequestPermissions
            r0.unregister()
        L32:
            return
    }

    void dispatchDestroyView() {
            r1 = this;
            r0 = 1
            r1.dispatchStateChange(r0)
            return
    }

    void dispatchLowMemory() {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1b
            r1.performLowMemory()
        L1b:
            goto La
        L1c:
            return
    }

    void dispatchMultiWindowModeChanged(boolean r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1b
            r1.performMultiWindowModeChanged(r3)
        L1b:
            goto La
        L1c:
            return
    }

    void dispatchOnAttachFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r2.mOnAttachListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentOnAttachListener r1 = (androidx.fragment.app.FragmentOnAttachListener) r1
            r1.onAttachFragment(r2, r3)
            goto L6
        L16:
            return
    }

    boolean dispatchOptionsItemSelected(android.view.MenuItem r6) {
            r5 = this;
            int r0 = r5.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L26
            boolean r4 = r3.performOptionsItemSelected(r6)
            if (r4 == 0) goto L26
            return r2
        L26:
            goto L11
        L27:
            return r1
    }

    void dispatchOptionsMenuClosed(android.view.Menu r3) {
            r2 = this;
            int r0 = r2.mCurState
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L21
            r1.performOptionsMenuClosed(r3)
        L21:
            goto L10
        L22:
            return
    }

    void dispatchPause() {
            r1 = this;
            r0 = 5
            r1.dispatchStateChange(r0)
            return
    }

    void dispatchPictureInPictureModeChanged(boolean r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1b
            r1.performPictureInPictureModeChanged(r3)
        L1b:
            goto La
        L1c:
            return
    }

    boolean dispatchPrepareOptionsMenu(android.view.Menu r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 1
            if (r0 >= r1) goto L7
            r0 = 0
            return r0
        L7:
            r0 = 0
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            java.util.List r1 = r1.getFragments()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L2d
            boolean r3 = r4.isParentMenuVisible(r2)
            if (r3 == 0) goto L2d
            boolean r3 = r2.performPrepareOptionsMenu(r5)
            if (r3 == 0) goto L2d
            r0 = 1
        L2d:
            goto L12
        L2e:
            return r0
    }

    void dispatchPrimaryNavigationFragmentChanged() {
            r1 = this;
            r1.updateOnBackPressedCallbackEnabled()
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            r1.dispatchParentPrimaryNavigationFragmentChanged(r0)
            return
    }

    void dispatchResume() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 7
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchStart() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 5
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchStop() {
            r2 = this;
            r0 = 1
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchViewCreated() {
            r1 = this;
            r0 = 2
            r1.dispatchStateChange(r0)
            return
    }

    public void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r1 = "    "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentStore r1 = r6.mFragmentStore
            r1.dump(r7, r8, r9, r10)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r6.mCreatedMenus
            if (r1 == 0) goto L51
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r6.mCreatedMenus
            int r1 = r1.size()
            if (r1 <= 0) goto L51
            r9.print(r7)
            java.lang.String r2 = "Fragments Created Menus:"
            r9.println(r2)
            r2 = 0
        L2d:
            if (r2 >= r1) goto L51
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r6.mCreatedMenus
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r9.print(r7)
            java.lang.String r4 = "  #"
            r9.print(r4)
            r9.print(r2)
            java.lang.String r4 = ": "
            r9.print(r4)
            java.lang.String r4 = r3.toString()
            r9.println(r4)
            int r2 = r2 + 1
            goto L2d
        L51:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r6.mBackStack
            if (r1 == 0) goto L8d
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r6.mBackStack
            int r1 = r1.size()
            if (r1 <= 0) goto L8d
            r9.print(r7)
            java.lang.String r2 = "Back Stack:"
            r9.println(r2)
            r2 = 0
        L66:
            if (r2 >= r1) goto L8d
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r6.mBackStack
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            r9.print(r7)
            java.lang.String r4 = "  #"
            r9.print(r4)
            r9.print(r2)
            java.lang.String r4 = ": "
            r9.print(r4)
            java.lang.String r4 = r3.toString()
            r9.println(r4)
            r3.dump(r0, r9)
            int r2 = r2 + 1
            goto L66
        L8d:
            r9.print(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Back Stack Index: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = r6.mBackStackIndex
            int r2 = r2.get()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.println(r1)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r6.mPendingActions
            monitor-enter(r1)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r2 = r6.mPendingActions     // Catch: java.lang.Throwable -> L151
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L151
            if (r2 <= 0) goto Le0
            r9.print(r7)     // Catch: java.lang.Throwable -> L151
            java.lang.String r3 = "Pending Actions:"
            r9.println(r3)     // Catch: java.lang.Throwable -> L151
            r3 = 0
        Lc0:
            if (r3 >= r2) goto Le0
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r6.mPendingActions     // Catch: java.lang.Throwable -> L151
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L151
            androidx.fragment.app.FragmentManager$OpGenerator r4 = (androidx.fragment.app.FragmentManager.OpGenerator) r4     // Catch: java.lang.Throwable -> L151
            r9.print(r7)     // Catch: java.lang.Throwable -> L151
            java.lang.String r5 = "  #"
            r9.print(r5)     // Catch: java.lang.Throwable -> L151
            r9.print(r3)     // Catch: java.lang.Throwable -> L151
            java.lang.String r5 = ": "
            r9.print(r5)     // Catch: java.lang.Throwable -> L151
            r9.println(r4)     // Catch: java.lang.Throwable -> L151
            int r3 = r3 + 1
            goto Lc0
        Le0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L151
            r9.print(r7)
            java.lang.String r1 = "FragmentManager misc state:"
            r9.println(r1)
            r9.print(r7)
            java.lang.String r1 = "  mHost="
            r9.print(r1)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r6.mHost
            r9.println(r1)
            r9.print(r7)
            java.lang.String r1 = "  mContainer="
            r9.print(r1)
            androidx.fragment.app.FragmentContainer r1 = r6.mContainer
            r9.println(r1)
            androidx.fragment.app.Fragment r1 = r6.mParent
            if (r1 == 0) goto L114
            r9.print(r7)
            java.lang.String r1 = "  mParent="
            r9.print(r1)
            androidx.fragment.app.Fragment r1 = r6.mParent
            r9.println(r1)
        L114:
            r9.print(r7)
            java.lang.String r1 = "  mCurState="
            r9.print(r1)
            int r1 = r6.mCurState
            r9.print(r1)
            java.lang.String r1 = " mStateSaved="
            r9.print(r1)
            boolean r1 = r6.mStateSaved
            r9.print(r1)
            java.lang.String r1 = " mStopped="
            r9.print(r1)
            boolean r1 = r6.mStopped
            r9.print(r1)
            java.lang.String r1 = " mDestroyed="
            r9.print(r1)
            boolean r1 = r6.mDestroyed
            r9.println(r1)
            boolean r1 = r6.mNeedMenuInvalidate
            if (r1 == 0) goto L150
            r9.print(r7)
            java.lang.String r1 = "  mNeedMenuInvalidate="
            r9.print(r1)
            boolean r1 = r6.mNeedMenuInvalidate
            r9.println(r1)
        L150:
            return
        L151:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L151
            throw r2
    }

    void enqueueAction(androidx.fragment.app.FragmentManager.OpGenerator r4, boolean r5) {
            r3 = this;
            if (r5 != 0) goto L1d
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 != 0) goto L1a
            boolean r0 = r3.mDestroyed
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager has been destroyed"
            r0.<init>(r1)
            throw r0
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager has not been attached to a host."
            r0.<init>(r1)
            throw r0
        L1a:
            r3.checkStateLoss()
        L1d:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r3.mPendingActions
            monitor-enter(r0)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r3.mHost     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L30
            if (r5 == 0) goto L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "Activity has been destroyed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            throw r1     // Catch: java.lang.Throwable -> L3a
        L30:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r3.mPendingActions     // Catch: java.lang.Throwable -> L3a
            r1.add(r4)     // Catch: java.lang.Throwable -> L3a
            r3.scheduleCommit()     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r1
    }

    boolean execPendingActions(boolean r4) {
            r3 = this;
            r3.ensureExecReady(r4)
            r0 = 0
        L4:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r3.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r2 = r3.mTmpIsPop
            boolean r1 = r3.generateOpsForPendingActions(r1, r2)
            if (r1 == 0) goto L23
            r1 = 1
            r3.mExecutingActions = r1
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r3.mTmpRecords     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList<java.lang.Boolean> r2 = r3.mTmpIsPop     // Catch: java.lang.Throwable -> L1e
            r3.removeRedundantOperationsAndExecute(r1, r2)     // Catch: java.lang.Throwable -> L1e
            r3.cleanupExec()
            r0 = 1
            goto L4
        L1e:
            r1 = move-exception
            r3.cleanupExec()
            throw r1
        L23:
            r3.updateOnBackPressedCallbackEnabled()
            r3.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.burpActive()
            return r0
    }

    void execSingleAction(androidx.fragment.app.FragmentManager.OpGenerator r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto Lb
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 == 0) goto La
            boolean r0 = r2.mDestroyed
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            r2.ensureExecReady(r4)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r1 = r2.mTmpIsPop
            boolean r0 = r3.generateOps(r0, r1)
            if (r0 == 0) goto L2b
            r0 = 1
            r2.mExecutingActions = r0
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mTmpRecords     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList<java.lang.Boolean> r1 = r2.mTmpIsPop     // Catch: java.lang.Throwable -> L26
            r2.removeRedundantOperationsAndExecute(r0, r1)     // Catch: java.lang.Throwable -> L26
            r2.cleanupExec()
            goto L2b
        L26:
            r0 = move-exception
            r2.cleanupExec()
            throw r0
        L2b:
            r2.updateOnBackPressedCallbackEnabled()
            r2.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            r0.burpActive()
            return
    }

    public boolean executePendingTransactions() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.execPendingActions(r0)
            r1.forcePostponedTransactions()
            return r0
    }

    androidx.fragment.app.Fragment findActiveFragment(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r0 = r0.findActiveFragment(r2)
            return r0
    }

    public androidx.fragment.app.Fragment findFragmentById(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r2)
            return r0
    }

    public androidx.fragment.app.Fragment findFragmentByTag(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r2)
            return r0
    }

    androidx.fragment.app.Fragment findFragmentByWho(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r0 = r0.findFragmentByWho(r2)
            return r0
    }

    int getActiveFragmentCount() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            int r0 = r0.getActiveFragmentCount()
            return r0
    }

    java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            return r0
    }

    public androidx.fragment.app.FragmentManager.BackStackEntry getBackStackEntryAt(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            java.lang.Object r0 = r0.get(r2)
            androidx.fragment.app.FragmentManager$BackStackEntry r0 = (androidx.fragment.app.FragmentManager.BackStackEntry) r0
            return r0
    }

    public int getBackStackEntryCount() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            if (r0 == 0) goto Lb
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            int r0 = r0.size()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    androidx.fragment.app.FragmentContainer getContainer() {
            r1 = this;
            androidx.fragment.app.FragmentContainer r0 = r1.mContainer
            return r0
    }

    public androidx.fragment.app.Fragment getFragment(android.os.Bundle r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = r6.getString(r7)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            androidx.fragment.app.Fragment r1 = r5.findActiveFragment(r0)
            if (r1 != 0) goto L33
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Fragment no longer exists for key "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = ": unique id "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            r5.throwException(r2)
        L33:
            return r1
    }

    public androidx.fragment.app.FragmentFactory getFragmentFactory() {
            r1 = this;
            androidx.fragment.app.FragmentFactory r0 = r1.mFragmentFactory
            if (r0 == 0) goto L7
            androidx.fragment.app.FragmentFactory r0 = r1.mFragmentFactory
            return r0
        L7:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r0 = r1.mParent
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.FragmentFactory r0 = r0.getFragmentFactory()
            return r0
        L14:
            androidx.fragment.app.FragmentFactory r0 = r1.mHostFragmentFactory
            return r0
    }

    androidx.fragment.app.FragmentStore getFragmentStore() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            return r0
    }

    public java.util.List<androidx.fragment.app.Fragment> getFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getFragments()
            return r0
    }

    androidx.fragment.app.FragmentHostCallback<?> getHost() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            return r0
    }

    android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() {
            r1 = this;
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = r1.mLayoutInflaterFactory
            return r0
    }

    androidx.fragment.app.FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher() {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            return r0
    }

    androidx.fragment.app.Fragment getParent() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mParent
            return r0
    }

    public androidx.fragment.app.Fragment getPrimaryNavigationFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            return r0
    }

    androidx.fragment.app.SpecialEffectsControllerFactory getSpecialEffectsControllerFactory() {
            r1 = this;
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mSpecialEffectsControllerFactory
            if (r0 == 0) goto L7
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mSpecialEffectsControllerFactory
            return r0
        L7:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r0 = r1.mParent
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r0.getSpecialEffectsControllerFactory()
            return r0
        L14:
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mDefaultSpecialEffectsControllerFactory
            return r0
    }

    androidx.lifecycle.ViewModelStore getViewModelStore(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore(r2)
            return r0
    }

    void handleOnBackPressed() {
            r1 = this;
            r0 = 1
            r1.execPendingActions(r0)
            androidx.activity.OnBackPressedCallback r0 = r1.mOnBackPressedCallback
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L10
            r1.popBackStackImmediate()
            goto L15
        L10:
            androidx.activity.OnBackPressedDispatcher r0 = r1.mOnBackPressedDispatcher
            r0.onBackPressed()
        L15:
            return
    }

    void hideFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hide: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            boolean r0 = r3.mHidden
            if (r0 != 0) goto L2e
            r0 = 1
            r3.mHidden = r0
            boolean r1 = r3.mHiddenChanged
            r0 = r0 ^ r1
            r3.mHiddenChanged = r0
            r2.setVisibleRemovingFragment(r3)
        L2e:
            return
    }

    void invalidateMenuForFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mAdded
            if (r0 == 0) goto Ld
            boolean r0 = r1.isMenuAvailable(r2)
            if (r0 == 0) goto Ld
            r0 = 1
            r1.mNeedMenuInvalidate = r0
        Ld:
            return
    }

    public boolean isDestroyed() {
            r1 = this;
            boolean r0 = r1.mDestroyed
            return r0
    }

    boolean isParentMenuVisible(androidx.fragment.app.Fragment r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r2.isMenuVisible()
            return r0
    }

    boolean isPrimaryNavigation(androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            androidx.fragment.app.FragmentManager r1 = r5.mFragmentManager
            androidx.fragment.app.Fragment r2 = r1.getPrimaryNavigationFragment()
            boolean r3 = r5.equals(r2)
            if (r3 == 0) goto L1a
            androidx.fragment.app.Fragment r3 = r1.mParent
            boolean r3 = r4.isPrimaryNavigation(r3)
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    boolean isStateAtLeast(int r2) {
            r1 = this;
            int r0 = r1.mCurState
            if (r0 < r2) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isStateSaved() {
            r1 = this;
            boolean r0 = r1.mStateSaved
            if (r0 != 0) goto Lb
            boolean r0 = r1.mStopped
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    void launchRequestPermissions(androidx.fragment.app.Fragment r3, java.lang.String[] r4, int r5) {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r2.mRequestPermissions
            if (r0 == 0) goto L16
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r1 = r3.mWho
            r0.<init>(r1, r5)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r1 = r2.mLaunchedFragments
            r1.addLast(r0)
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r1 = r2.mRequestPermissions
            r1.launch(r4)
            goto L1b
        L16:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            r0.onRequestPermissionsFromFragment(r3, r4, r5)
        L1b:
            return
    }

    void launchStartActivityForResult(androidx.fragment.app.Fragment r3, android.content.Intent r4, int r5, android.os.Bundle r6) {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mStartActivityForResult
            if (r0 == 0) goto L1f
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r1 = r3.mWho
            r0.<init>(r1, r5)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r1 = r2.mLaunchedFragments
            r1.addLast(r0)
            if (r4 == 0) goto L19
            if (r6 == 0) goto L19
            java.lang.String r1 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r4.putExtra(r1, r6)
        L19:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r2.mStartActivityForResult
            r1.launch(r4)
            goto L24
        L1f:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            r0.onStartActivityFromFragment(r3, r4, r5, r6)
        L24:
            return
    }

    void launchStartIntentSenderForResult(androidx.fragment.app.Fragment r17, android.content.IntentSender r18, int r19, android.content.Intent r20, int r21, int r22, int r23, android.os.Bundle r24) throws android.content.IntentSender.SendIntentException {
            r16 = this;
            r0 = r16
            r10 = r17
            r11 = r24
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r1 = r0.mStartIntentSenderForResult
            if (r1 == 0) goto La4
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r11 == 0) goto L55
            if (r20 != 0) goto L1d
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r5 = 1
            r3.putExtra(r4, r5)
            goto L1f
        L1d:
            r3 = r20
        L1f:
            boolean r4 = isLoggingEnabled(r2)
            if (r4 == 0) goto L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ActivityOptions "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r11)
            java.lang.String r5 = " were added to fillInIntent "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r5 = " for fragment "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r10)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r1, r4)
        L4f:
            java.lang.String r4 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r3.putExtra(r4, r11)
            goto L57
        L55:
            r3 = r20
        L57:
            androidx.activity.result.IntentSenderRequest$Builder r4 = new androidx.activity.result.IntentSenderRequest$Builder
            r12 = r18
            r4.<init>(r12)
            androidx.activity.result.IntentSenderRequest$Builder r4 = r4.setFillInIntent(r3)
            r13 = r21
            r14 = r22
            androidx.activity.result.IntentSenderRequest$Builder r4 = r4.setFlags(r14, r13)
            androidx.activity.result.IntentSenderRequest r4 = r4.build()
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r5 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r6 = r10.mWho
            r15 = r19
            r5.<init>(r6, r15)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r6 = r0.mLaunchedFragments
            r6.addLast(r5)
            boolean r2 = isLoggingEnabled(r2)
            if (r2 == 0) goto L9e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r6 = "is launching an IntentSender for result "
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r1, r2)
        L9e:
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r1 = r0.mStartIntentSenderForResult
            r1.launch(r4)
            goto Lc3
        La4:
            r12 = r18
            r15 = r19
            r13 = r21
            r14 = r22
            androidx.fragment.app.FragmentHostCallback<?> r1 = r0.mHost
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r1.onStartIntentSenderFromFragment(r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = r20
        Lc3:
            return
    }

    void moveFragmentToExpectedState(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.lang.String r1 = r4.mWho
            boolean r0 = r0.containsActiveFragment(r1)
            if (r0 != 0) goto L40
            r0 = 3
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " to state "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.mCurState
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "since it is not added to "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L3f:
            return
        L40:
            r3.moveToState(r4)
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L8b
            boolean r0 = r4.mIsNewlyAdded
            if (r0 == 0) goto L8b
            android.view.ViewGroup r0 = r4.mContainer
            if (r0 == 0) goto L8b
            float r0 = r4.mPostponedAlpha
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5d
            android.view.View r0 = r4.mView
            float r2 = r4.mPostponedAlpha
            r0.setAlpha(r2)
        L5d:
            r4.mPostponedAlpha = r1
            r0 = 0
            r4.mIsNewlyAdded = r0
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            android.content.Context r0 = r0.getContext()
            boolean r1 = r4.getPopDirection()
            r2 = 1
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = androidx.fragment.app.FragmentAnim.loadAnimation(r0, r4, r2, r1)
            if (r0 == 0) goto L8b
            android.view.animation.Animation r1 = r0.animation
            if (r1 == 0) goto L7f
            android.view.View r1 = r4.mView
            android.view.animation.Animation r2 = r0.animation
            r1.startAnimation(r2)
            goto L8b
        L7f:
            android.animation.Animator r1 = r0.animator
            android.view.View r2 = r4.mView
            r1.setTarget(r2)
            android.animation.Animator r1 = r0.animator
            r1.start()
        L8b:
            boolean r0 = r4.mHiddenChanged
            if (r0 == 0) goto L92
            r3.completeShowHideFragment(r4)
        L92:
            return
    }

    void moveToState(int r7, boolean r8) {
            r6 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            if (r0 != 0) goto L10
            r0 = -1
            if (r7 != r0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No activity"
            r0.<init>(r1)
            throw r0
        L10:
            if (r8 != 0) goto L17
            int r0 = r6.mCurState
            if (r7 != r0) goto L17
            return
        L17:
            r6.mCurState = r7
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            r1 = 0
            if (r0 == 0) goto L24
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            r0.moveToExpectedState()
            goto L74
        L24:
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r6.moveFragmentToExpectedState(r2)
            goto L2e
        L3e:
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            boolean r4 = r3.mIsNewlyAdded
            if (r4 != 0) goto L5f
            r6.moveFragmentToExpectedState(r3)
        L5f:
            boolean r4 = r3.mRemoving
            if (r4 == 0) goto L6b
            boolean r4 = r3.isInBackStack()
            if (r4 != 0) goto L6b
            r4 = 1
            goto L6c
        L6b:
            r4 = r1
        L6c:
            if (r4 == 0) goto L73
            androidx.fragment.app.FragmentStore r5 = r6.mFragmentStore
            r5.makeInactive(r2)
        L73:
            goto L48
        L74:
            r6.startPendingDeferredFragments()
            boolean r0 = r6.mNeedMenuInvalidate
            if (r0 == 0) goto L8b
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            if (r0 == 0) goto L8b
            int r0 = r6.mCurState
            r2 = 7
            if (r0 != r2) goto L8b
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            r0.onSupportInvalidateOptionsMenu()
            r6.mNeedMenuInvalidate = r1
        L8b:
            return
    }

    void moveToState(androidx.fragment.app.Fragment r2) {
            r1 = this;
            int r0 = r1.mCurState
            r1.moveToState(r2, r0)
            return
    }

    void moveToState(androidx.fragment.app.Fragment r11, int r12) {
            r10 = this;
            androidx.fragment.app.FragmentStore r0 = r10.mFragmentStore
            java.lang.String r1 = r11.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            r1 = 1
            if (r0 != 0) goto L18
            androidx.fragment.app.FragmentStateManager r2 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3 = r10.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r4 = r10.mFragmentStore
            r2.<init>(r3, r4, r11)
            r0 = r2
            r0.setFragmentManagerState(r1)
        L18:
            boolean r2 = r11.mFromLayout
            r3 = 2
            if (r2 == 0) goto L29
            boolean r2 = r11.mInLayout
            if (r2 == 0) goto L29
            int r2 = r11.mState
            if (r2 != r3) goto L29
            int r12 = java.lang.Math.max(r12, r3)
        L29:
            int r2 = r0.computeExpectedState()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.mState
            r4 = 5
            r5 = 4
            r6 = 3
            java.lang.String r7 = "FragmentManager"
            r8 = -1
            if (r2 > r12) goto L75
            int r2 = r11.mState
            if (r2 >= r12) goto L4a
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r2 = r10.mExitAnimationCancellationSignals
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L4a
            r10.cancelExitAnimation(r11)
        L4a:
            int r2 = r11.mState
            switch(r2) {
                case -1: goto L50;
                case 0: goto L55;
                case 1: goto L5a;
                case 2: goto L64;
                case 3: goto L4f;
                case 4: goto L69;
                case 5: goto L6e;
                default: goto L4f;
            }
        L4f:
            goto L73
        L50:
            if (r12 <= r8) goto L55
            r0.attach()
        L55:
            if (r12 <= 0) goto L5a
            r0.create()
        L5a:
            if (r12 <= r8) goto L5f
            r0.ensureInflatedView()
        L5f:
            if (r12 <= r1) goto L64
            r0.createView()
        L64:
            if (r12 <= r3) goto L69
            r0.activityCreated()
        L69:
            if (r12 <= r5) goto L6e
            r0.start()
        L6e:
            if (r12 <= r4) goto L73
            r0.resume()
        L73:
            goto L163
        L75:
            int r2 = r11.mState
            if (r2 <= r12) goto L163
            int r2 = r11.mState
            switch(r2) {
                case 0: goto L15e;
                case 1: goto L14f;
                case 2: goto Lbc;
                case 3: goto L7e;
                case 4: goto L8b;
                case 5: goto L86;
                case 6: goto L7e;
                case 7: goto L80;
                default: goto L7e;
            }
        L7e:
            goto L163
        L80:
            r2 = 7
            if (r12 >= r2) goto L86
            r0.pause()
        L86:
            if (r12 >= r4) goto L8b
            r0.stop()
        L8b:
            if (r12 >= r5) goto Lbc
            boolean r2 = isLoggingEnabled(r6)
            if (r2 == 0) goto La9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "movefrom ACTIVITY_CREATED: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r7, r2)
        La9:
            android.view.View r2 = r11.mView
            if (r2 == 0) goto Lbc
            androidx.fragment.app.FragmentHostCallback<?> r2 = r10.mHost
            boolean r2 = r2.onShouldSaveFragmentState(r11)
            if (r2 == 0) goto Lbc
            android.util.SparseArray<android.os.Parcelable> r2 = r11.mSavedViewState
            if (r2 != 0) goto Lbc
            r0.saveViewState()
        Lbc:
            if (r12 >= r3) goto L14f
            r2 = 0
            android.view.View r4 = r11.mView
            if (r4 == 0) goto L144
            android.view.ViewGroup r4 = r11.mContainer
            if (r4 == 0) goto L144
            android.view.ViewGroup r4 = r11.mContainer
            android.view.View r5 = r11.mView
            r4.endViewTransition(r5)
            android.view.View r4 = r11.mView
            r4.clearAnimation()
            boolean r4 = r11.isRemovingParent()
            if (r4 != 0) goto L144
            int r4 = r10.mCurState
            r5 = 0
            if (r4 <= r8) goto Lff
            boolean r4 = r10.mDestroyed
            if (r4 != 0) goto Lff
            android.view.View r4 = r11.mView
            int r4 = r4.getVisibility()
            if (r4 != 0) goto Lff
            float r4 = r11.mPostponedAlpha
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto Lff
            androidx.fragment.app.FragmentHostCallback<?> r4 = r10.mHost
            android.content.Context r4 = r4.getContext()
            boolean r8 = r11.getPopDirection()
            r9 = 0
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r2 = androidx.fragment.app.FragmentAnim.loadAnimation(r4, r11, r9, r8)
        Lff:
            r11.mPostponedAlpha = r5
            android.view.ViewGroup r4 = r11.mContainer
            android.view.View r5 = r11.mView
            if (r2 == 0) goto L10c
            androidx.fragment.app.FragmentTransition$Callback r8 = r10.mFragmentTransitionCallback
            androidx.fragment.app.FragmentAnim.animateRemoveFragment(r11, r2, r8)
        L10c:
            r4.removeView(r5)
            boolean r3 = isLoggingEnabled(r3)
            if (r3 == 0) goto L13f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "Removing view "
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r8 = " for fragment "
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r8 = " from container "
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r7, r3)
        L13f:
            android.view.ViewGroup r3 = r11.mContainer
            if (r4 == r3) goto L144
            return
        L144:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r3 = r10.mExitAnimationCancellationSignals
            java.lang.Object r3 = r3.get(r11)
            if (r3 != 0) goto L14f
            r0.destroyFragmentView()
        L14f:
            if (r12 >= r1) goto L15e
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r1 = r10.mExitAnimationCancellationSignals
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L15b
            r12 = 1
            goto L15e
        L15b:
            r0.destroy()
        L15e:
            if (r12 >= 0) goto L163
            r0.detach()
        L163:
            int r1 = r11.mState
            if (r1 == r12) goto L19b
            boolean r1 = isLoggingEnabled(r6)
            if (r1 == 0) goto L199
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " not updated inline; expected state "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = " found "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r11.mState
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r7, r1)
        L199:
            r11.mState = r12
        L19b:
            return
    }

    void noteStateNotSaved() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L2a
            r1.noteStateNotSaved()
        L2a:
            goto L19
        L2b:
            return
    }

    void onContainerAvailable(androidx.fragment.app.FragmentContainerView r6) {
            r5 = this;
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            int r3 = r2.mContainerId
            int r4 = r6.getId()
            if (r3 != r4) goto L33
            android.view.View r3 = r2.mView
            if (r3 == 0) goto L33
            android.view.View r3 = r2.mView
            android.view.ViewParent r3 = r3.getParent()
            if (r3 != 0) goto L33
            r2.mContainer = r6
            r1.addViewToContainer()
        L33:
            goto La
        L34:
            return
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction openTransaction() {
            r1 = this;
            androidx.fragment.app.FragmentTransaction r0 = r1.beginTransaction()
            return r0
    }

    void performPendingDeferredStart(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            boolean r1 = r0.mDeferStart
            if (r1 == 0) goto L1e
            boolean r1 = r2.mExecutingActions
            if (r1 == 0) goto L10
            r1 = 1
            r2.mHavePendingDeferredStart = r1
            return
        L10:
            r1 = 0
            r0.mDeferStart = r1
            boolean r1 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r1 == 0) goto L1b
            r3.moveToExpectedState()
            goto L1e
        L1b:
            r2.moveToState(r0)
        L1e:
            return
    }

    public void popBackStack() {
            r4 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r2 = -1
            r3 = 0
            r0.<init>(r4, r1, r2, r3)
            r4.enqueueAction(r0, r3)
            return
    }

    public void popBackStack(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto Ld
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r0.<init>(r3, r1, r4, r5)
            r1 = 0
            r3.enqueueAction(r0, r1)
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Bad id: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void popBackStack(java.lang.String r3, int r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = -1
            r0.<init>(r2, r3, r1, r4)
            r1 = 0
            r2.enqueueAction(r0, r1)
            return
    }

    public boolean popBackStackImmediate() {
            r3 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            boolean r0 = r3.popBackStackImmediate(r2, r0, r1)
            return r0
    }

    public boolean popBackStackImmediate(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L8
            r0 = 0
            boolean r0 = r3.popBackStackImmediate(r0, r4, r5)
            return r0
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Bad id: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean popBackStackImmediate(java.lang.String r2, int r3) {
            r1 = this;
            r0 = -1
            boolean r0 = r1.popBackStackImmediate(r2, r0, r3)
            return r0
    }

    boolean popBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6, java.util.ArrayList<java.lang.Boolean> r7, java.lang.String r8, int r9, int r10) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r5.mBackStack
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r8 != 0) goto L2b
            if (r9 >= 0) goto L2b
            r2 = r10 & 1
            if (r2 != 0) goto L2b
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r5.mBackStack
            int r2 = r2.size()
            int r2 = r2 - r0
            if (r2 >= 0) goto L19
            return r1
        L19:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r5.mBackStack
            java.lang.Object r1 = r1.remove(r2)
            r6.add(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r7.add(r1)
            goto La8
        L2b:
            r2 = -1
            if (r8 != 0) goto L30
            if (r9 < 0) goto L82
        L30:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r5.mBackStack
            int r3 = r3.size()
            int r3 = r3 - r0
            r2 = r3
        L38:
            if (r2 < 0) goto L5a
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r5.mBackStack
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            if (r8 == 0) goto L4f
            java.lang.String r4 = r3.getName()
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L4f
            goto L5a
        L4f:
            if (r9 < 0) goto L56
            int r4 = r3.mIndex
            if (r9 != r4) goto L56
            goto L5a
        L56:
            int r2 = r2 + (-1)
            goto L38
        L5a:
            if (r2 >= 0) goto L5d
            return r1
        L5d:
            r3 = r10 & 1
            if (r3 == 0) goto L82
            int r2 = r2 + (-1)
        L63:
            if (r2 < 0) goto L82
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r5.mBackStack
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            if (r8 == 0) goto L79
            java.lang.String r4 = r3.getName()
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L7f
        L79:
            if (r9 < 0) goto L82
            int r4 = r3.mIndex
            if (r9 != r4) goto L82
        L7f:
            int r2 = r2 + (-1)
            goto L63
        L82:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r5.mBackStack
            int r3 = r3.size()
            int r3 = r3 - r0
            if (r2 != r3) goto L8c
            return r1
        L8c:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r5.mBackStack
            int r1 = r1.size()
            int r1 = r1 - r0
        L93:
            if (r1 <= r2) goto La8
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r5.mBackStack
            java.lang.Object r3 = r3.remove(r1)
            r6.add(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r7.add(r3)
            int r1 = r1 + (-1)
            goto L93
        La8:
            return r0
    }

    public void putFragment(android.os.Bundle r4, java.lang.String r5, androidx.fragment.app.Fragment r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            if (r0 == r3) goto L25
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " is not currently in the FragmentManager"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r3.throwException(r0)
        L25:
            java.lang.String r0 = r6.mWho
            r4.putString(r5, r0)
            return
    }

    public void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2, boolean r3) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.registerFragmentLifecycleCallbacks(r2, r3)
            return
    }

    void removeCancellationSignal(androidx.fragment.app.Fragment r4, androidx.core.os.CancellationSignal r5) {
            r3 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r3.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r4)
            java.util.HashSet r0 = (java.util.HashSet) r0
            if (r0 == 0) goto L26
            boolean r1 = r0.remove(r5)
            if (r1 == 0) goto L26
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L26
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r1 = r3.mExitAnimationCancellationSignals
            r1.remove(r4)
            int r1 = r4.mState
            r2 = 5
            if (r1 >= r2) goto L26
            r3.destroyFragmentView(r4)
            r3.moveToState(r4)
        L26:
            return
    }

    void removeFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remove: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " nesting="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r4.mBackStackNesting
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L2b:
            boolean r0 = r4.isInBackStack()
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = r4.mDetached
            if (r2 == 0) goto L37
            if (r0 == 0) goto L49
        L37:
            androidx.fragment.app.FragmentStore r2 = r3.mFragmentStore
            r2.removeFragment(r4)
            boolean r2 = r3.isMenuAvailable(r4)
            if (r2 == 0) goto L44
            r3.mNeedMenuInvalidate = r1
        L44:
            r4.mRemoving = r1
            r3.setVisibleRemovingFragment(r4)
        L49:
            return
    }

    public void removeFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.remove(r2)
            return
    }

    public void removeOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            if (r0 == 0) goto L9
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            r0.remove(r2)
        L9:
            return
    }

    void removeRetainedFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.removeRetainedFragment(r2)
            return
    }

    void restoreAllState(android.os.Parcelable r3, androidx.fragment.app.FragmentManagerNonConfig r4) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            r0.restoreFromSnapshot(r4)
            r2.restoreSaveState(r3)
            return
    }

    void restoreSaveState(android.os.Parcelable r15) {
            r14 = this;
            if (r15 != 0) goto L3
            return
        L3:
            r0 = r15
            androidx.fragment.app.FragmentManagerState r0 = (androidx.fragment.app.FragmentManagerState) r0
            java.util.ArrayList<androidx.fragment.app.FragmentState> r1 = r0.mActive
            if (r1 != 0) goto Lb
            return
        Lb:
            androidx.fragment.app.FragmentStore r1 = r14.mFragmentStore
            r1.resetActiveFragments()
            java.util.ArrayList<androidx.fragment.app.FragmentState> r1 = r0.mActive
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "): "
            r4 = 2
            java.lang.String r5 = "FragmentManager"
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentState r2 = (androidx.fragment.app.FragmentState) r2
            if (r2 == 0) goto Lb5
            androidx.fragment.app.FragmentManagerViewModel r6 = r14.mNonConfig
            java.lang.String r7 = r2.mWho
            androidx.fragment.app.Fragment r12 = r6.findRetainedFragmentByWho(r7)
            if (r12 == 0) goto L59
            boolean r6 = isLoggingEnabled(r4)
            if (r6 == 0) goto L4f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "restoreSaveState: re-attaching retained "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r12)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r5, r6)
        L4f:
            androidx.fragment.app.FragmentStateManager r6 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r7 = r14.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r8 = r14.mFragmentStore
            r6.<init>(r7, r8, r12, r2)
            goto L72
        L59:
            androidx.fragment.app.FragmentStateManager r13 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r7 = r14.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r8 = r14.mFragmentStore
            androidx.fragment.app.FragmentHostCallback<?> r6 = r14.mHost
            android.content.Context r6 = r6.getContext()
            java.lang.ClassLoader r9 = r6.getClassLoader()
            androidx.fragment.app.FragmentFactory r10 = r14.getFragmentFactory()
            r6 = r13
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)
        L72:
            androidx.fragment.app.Fragment r7 = r6.getFragment()
            r7.mFragmentManager = r14
            boolean r4 = isLoggingEnabled(r4)
            if (r4 == 0) goto L9e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "restoreSaveState: active ("
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r8 = r7.mWho
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r5, r3)
        L9e:
            androidx.fragment.app.FragmentHostCallback<?> r3 = r14.mHost
            android.content.Context r3 = r3.getContext()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r6.restoreState(r3)
            androidx.fragment.app.FragmentStore r3 = r14.mFragmentStore
            r3.makeActive(r6)
            int r3 = r14.mCurState
            r6.setFragmentManagerState(r3)
        Lb5:
            goto L16
        Lb7:
            androidx.fragment.app.FragmentManagerViewModel r1 = r14.mNonConfig
            java.util.Collection r1 = r1.getRetainedFragments()
            java.util.Iterator r1 = r1.iterator()
        Lc1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L11c
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentStore r6 = r14.mFragmentStore
            java.lang.String r7 = r2.mWho
            boolean r6 = r6.containsActiveFragment(r7)
            if (r6 != 0) goto L11b
            boolean r6 = isLoggingEnabled(r4)
            if (r6 == 0) goto Lff
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Discarding retained Fragment "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r7 = " that was not found in the set of active Fragments "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.util.ArrayList<androidx.fragment.app.FragmentState> r7 = r0.mActive
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r5, r6)
        Lff:
            androidx.fragment.app.FragmentManagerViewModel r6 = r14.mNonConfig
            r6.removeRetainedFragment(r2)
            r2.mFragmentManager = r14
            androidx.fragment.app.FragmentStateManager r6 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r7 = r14.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r8 = r14.mFragmentStore
            r6.<init>(r7, r8, r2)
            r7 = 1
            r6.setFragmentManagerState(r7)
            r6.moveToExpectedState()
            r2.mRemoving = r7
            r6.moveToExpectedState()
        L11b:
            goto Lc1
        L11c:
            androidx.fragment.app.FragmentStore r1 = r14.mFragmentStore
            java.util.ArrayList<java.lang.String> r2 = r0.mAdded
            r1.restoreAddedFragments(r2)
            androidx.fragment.app.BackStackState[] r1 = r0.mBackStack
            if (r1 == 0) goto L18b
            java.util.ArrayList r1 = new java.util.ArrayList
            androidx.fragment.app.BackStackState[] r2 = r0.mBackStack
            int r2 = r2.length
            r1.<init>(r2)
            r14.mBackStack = r1
            r1 = 0
        L132:
            androidx.fragment.app.BackStackState[] r2 = r0.mBackStack
            int r2 = r2.length
            if (r1 >= r2) goto L18a
            androidx.fragment.app.BackStackState[] r2 = r0.mBackStack
            r2 = r2[r1]
            androidx.fragment.app.BackStackRecord r2 = r2.instantiate(r14)
            boolean r6 = isLoggingEnabled(r4)
            if (r6 == 0) goto L182
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "restoreAllState: back stack #"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r7 = " (index "
            java.lang.StringBuilder r6 = r6.append(r7)
            int r7 = r2.mIndex
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r5, r6)
            androidx.fragment.app.LogWriter r6 = new androidx.fragment.app.LogWriter
            r6.<init>(r5)
            java.io.PrintWriter r7 = new java.io.PrintWriter
            r7.<init>(r6)
            java.lang.String r8 = "  "
            r9 = 0
            r2.dump(r8, r7, r9)
            r7.close()
        L182:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r14.mBackStack
            r6.add(r2)
            int r1 = r1 + 1
            goto L132
        L18a:
            goto L18e
        L18b:
            r1 = 0
            r14.mBackStack = r1
        L18e:
            java.util.concurrent.atomic.AtomicInteger r1 = r14.mBackStackIndex
            int r2 = r0.mBackStackIndex
            r1.set(r2)
            java.lang.String r1 = r0.mPrimaryNavActiveWho
            if (r1 == 0) goto L1a6
            java.lang.String r1 = r0.mPrimaryNavActiveWho
            androidx.fragment.app.Fragment r1 = r14.findActiveFragment(r1)
            r14.mPrimaryNav = r1
            androidx.fragment.app.Fragment r1 = r14.mPrimaryNav
            r14.dispatchParentPrimaryNavigationFragmentChanged(r1)
        L1a6:
            java.util.ArrayList<java.lang.String> r1 = r0.mResultKeys
            if (r1 == 0) goto L1d2
            r2 = 0
        L1ab:
            int r3 = r1.size()
            if (r2 >= r3) goto L1d2
            java.util.ArrayList<android.os.Bundle> r3 = r0.mResults
            java.lang.Object r3 = r3.get(r2)
            android.os.Bundle r3 = (android.os.Bundle) r3
            androidx.fragment.app.FragmentHostCallback<?> r4 = r14.mHost
            android.content.Context r4 = r4.getContext()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r3.setClassLoader(r4)
            java.util.Map<java.lang.String, android.os.Bundle> r4 = r14.mResults
            java.lang.Object r5 = r1.get(r2)
            r4.put(r5, r3)
            int r2 = r2 + 1
            goto L1ab
        L1d2:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            java.util.ArrayList<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r3 = r0.mLaunchedFragments
            r2.<init>(r3)
            r14.mLaunchedFragments = r2
            return
    }

    @java.lang.Deprecated
    androidx.fragment.app.FragmentManagerNonConfig retainNonConfig() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            androidx.fragment.app.FragmentManagerNonConfig r0 = r0.getSnapshot()
            return r0
    }

    android.os.Parcelable saveAllState() {
            r9 = this;
            r9.forcePostponedTransactions()
            r9.endAnimatingAwayFragments()
            r0 = 1
            r9.execPendingActions(r0)
            r9.mStateSaved = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r9.mNonConfig
            r1.setIsStateSaved(r0)
            androidx.fragment.app.FragmentStore r0 = r9.mFragmentStore
            java.util.ArrayList r0 = r0.saveActiveFragments()
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            if (r1 == 0) goto L2d
            boolean r1 = isLoggingEnabled(r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r2, r1)
        L2b:
            r1 = 0
            return r1
        L2d:
            androidx.fragment.app.FragmentStore r1 = r9.mFragmentStore
            java.util.ArrayList r1 = r1.saveAddedFragments()
            r4 = 0
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r9.mBackStack
            if (r5 == 0) goto L83
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r9.mBackStack
            int r5 = r5.size()
            if (r5 <= 0) goto L83
            androidx.fragment.app.BackStackState[] r4 = new androidx.fragment.app.BackStackState[r5]
            r6 = 0
        L43:
            if (r6 >= r5) goto L83
            androidx.fragment.app.BackStackState r7 = new androidx.fragment.app.BackStackState
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8 = r9.mBackStack
            java.lang.Object r8 = r8.get(r6)
            androidx.fragment.app.BackStackRecord r8 = (androidx.fragment.app.BackStackRecord) r8
            r7.<init>(r8)
            r4[r6] = r7
            boolean r7 = isLoggingEnabled(r3)
            if (r7 == 0) goto L80
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "saveAllState: adding back stack #"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r8 = ": "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8 = r9.mBackStack
            java.lang.Object r8 = r8.get(r6)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r2, r7)
        L80:
            int r6 = r6 + 1
            goto L43
        L83:
            androidx.fragment.app.FragmentManagerState r2 = new androidx.fragment.app.FragmentManagerState
            r2.<init>()
            r2.mActive = r0
            r2.mAdded = r1
            r2.mBackStack = r4
            java.util.concurrent.atomic.AtomicInteger r3 = r9.mBackStackIndex
            int r3 = r3.get()
            r2.mBackStackIndex = r3
            androidx.fragment.app.Fragment r3 = r9.mPrimaryNav
            if (r3 == 0) goto La0
            androidx.fragment.app.Fragment r3 = r9.mPrimaryNav
            java.lang.String r3 = r3.mWho
            r2.mPrimaryNavActiveWho = r3
        La0:
            java.util.ArrayList<java.lang.String> r3 = r2.mResultKeys
            java.util.Map<java.lang.String, android.os.Bundle> r5 = r9.mResults
            java.util.Set r5 = r5.keySet()
            r3.addAll(r5)
            java.util.ArrayList<android.os.Bundle> r3 = r2.mResults
            java.util.Map<java.lang.String, android.os.Bundle> r5 = r9.mResults
            java.util.Collection r5 = r5.values()
            r3.addAll(r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r5 = r9.mLaunchedFragments
            r3.<init>(r5)
            r2.mLaunchedFragments = r3
            return r2
    }

    public androidx.fragment.app.Fragment.SavedState saveFragmentInstanceState(androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.lang.String r1 = r5.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r1 = r0.getFragment()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L35
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " is not currently in the FragmentManager"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r4.throwException(r1)
        L35:
            androidx.fragment.app.Fragment$SavedState r1 = r0.saveInstanceState()
            return r1
    }

    void scheduleCommit() {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r5.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r1 = r5.mPostponedTransactions     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L13
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r1 = r5.mPostponedTransactions     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = r2
        L14:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r5.mPendingActions     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L3c
            if (r4 != r3) goto L1d
            r2 = r3
        L1d:
            if (r1 != 0) goto L21
            if (r2 == 0) goto L3a
        L21:
            androidx.fragment.app.FragmentHostCallback<?> r3 = r5.mHost     // Catch: java.lang.Throwable -> L3c
            android.os.Handler r3 = r3.getHandler()     // Catch: java.lang.Throwable -> L3c
            java.lang.Runnable r4 = r5.mExecCommit     // Catch: java.lang.Throwable -> L3c
            r3.removeCallbacks(r4)     // Catch: java.lang.Throwable -> L3c
            androidx.fragment.app.FragmentHostCallback<?> r3 = r5.mHost     // Catch: java.lang.Throwable -> L3c
            android.os.Handler r3 = r3.getHandler()     // Catch: java.lang.Throwable -> L3c
            java.lang.Runnable r4 = r5.mExecCommit     // Catch: java.lang.Throwable -> L3c
            r3.post(r4)     // Catch: java.lang.Throwable -> L3c
            r5.updateOnBackPressedCallbackEnabled()     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r1
    }

    void setExitAnimationOrder(androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            android.view.ViewGroup r0 = r3.getFragmentContainer(r4)
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentContainerView
            if (r1 == 0) goto L12
            r1 = r0
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            r2 = r5 ^ 1
            r1.setDrawDisappearingViewsLast(r2)
        L12:
            return
    }

    public void setFragmentFactory(androidx.fragment.app.FragmentFactory r1) {
            r0 = this;
            r0.mFragmentFactory = r1
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(java.lang.String r3, android.os.Bundle r4) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r2.mResultListeners
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r0 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r0
            if (r0 == 0) goto L16
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r0.isAtLeast(r1)
            if (r1 == 0) goto L16
            r0.onFragmentResult(r3, r4)
            goto L1b
        L16:
            java.util.Map<java.lang.String, android.os.Bundle> r1 = r2.mResults
            r1.put(r3, r4)
        L1b:
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResultListener(java.lang.String r5, androidx.lifecycle.LifecycleOwner r6, androidx.fragment.app.FragmentResultListener r7) {
            r4 = this;
            androidx.lifecycle.Lifecycle r0 = r6.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r2) goto Ld
            return
        Ld:
            androidx.fragment.app.FragmentManager$6 r1 = new androidx.fragment.app.FragmentManager$6
            r1.<init>(r4, r5, r7, r0)
            r0.addObserver(r1)
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r2 = r4.mResultListeners
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r3 = new androidx.fragment.app.FragmentManager$LifecycleAwareResultListener
            r3.<init>(r0, r7, r1)
            java.lang.Object r2 = r2.put(r5, r3)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r2 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r2
            if (r2 == 0) goto L27
            r2.removeObserver()
        L27:
            return
    }

    void setMaxLifecycle(androidx.fragment.app.Fragment r4, androidx.lifecycle.Lifecycle.State r5) {
            r3 = this;
            java.lang.String r0 = r4.mWho
            androidx.fragment.app.Fragment r0 = r3.findActiveFragment(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 != r3) goto L17
        L14:
            r4.mMaxState = r5
            return
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not an active fragment of FragmentManager "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void setPrimaryNavigationFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            if (r4 == 0) goto L3a
            java.lang.String r0 = r4.mWho
            androidx.fragment.app.Fragment r0 = r3.findActiveFragment(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            if (r0 == 0) goto L3a
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 != r3) goto L17
            goto L3a
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not an active fragment of FragmentManager "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3a:
            androidx.fragment.app.Fragment r0 = r3.mPrimaryNav
            r3.mPrimaryNav = r4
            r3.dispatchParentPrimaryNavigationFragmentChanged(r0)
            androidx.fragment.app.Fragment r1 = r3.mPrimaryNav
            r3.dispatchParentPrimaryNavigationFragmentChanged(r1)
            return
    }

    void setSpecialEffectsControllerFactory(androidx.fragment.app.SpecialEffectsControllerFactory r1) {
            r0 = this;
            r0.mSpecialEffectsControllerFactory = r1
            return
    }

    void showFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "show: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            boolean r0 = r3.mHidden
            if (r0 == 0) goto L2c
            r0 = 0
            r3.mHidden = r0
            boolean r0 = r3.mHiddenChanged
            r0 = r0 ^ 1
            r3.mHiddenChanged = r0
        L2c:
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r5)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r5.mParent
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L45
            androidx.fragment.app.Fragment r1 = r5.mParent
            java.lang.Class r1 = r1.getClass()
            java.lang.String r4 = r1.getSimpleName()
            r0.append(r4)
            r0.append(r3)
            androidx.fragment.app.Fragment r3 = r5.mParent
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            r0.append(r2)
            goto L6f
        L45:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r5.mHost
            if (r1 == 0) goto L6a
            androidx.fragment.app.FragmentHostCallback<?> r1 = r5.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r4 = r1.getSimpleName()
            r0.append(r4)
            r0.append(r3)
            androidx.fragment.app.FragmentHostCallback<?> r3 = r5.mHost
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            r0.append(r2)
            goto L6f
        L6a:
            java.lang.String r1 = "null"
            r0.append(r1)
        L6f:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.unregisterFragmentLifecycleCallbacks(r2)
            return
    }
}
