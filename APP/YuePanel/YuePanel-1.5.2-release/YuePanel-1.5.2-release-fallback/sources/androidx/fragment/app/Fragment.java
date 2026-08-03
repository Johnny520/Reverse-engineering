package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, Yue.InterfaceC5504, Yue.InterfaceC0220 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final java.lang.Object USE_DEFAULT_TRANSITION = null;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    androidx.fragment.app.Fragment.C7566 mAnimationInfo;
    android.os.Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @Yue.InterfaceC4410
    androidx.fragment.app.FragmentManager mChildFragmentManager;
    android.view.ViewGroup mContainer;
    int mContainerId;

    @Yue.InterfaceC3573
    private int mContentLayoutId;
    androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    androidx.fragment.app.FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    Yue.AbstractC2764<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private java.lang.Boolean mIsPrimaryNavigationFragment;
    android.view.LayoutInflater mLayoutInflater;
    androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    androidx.lifecycle.Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final java.util.ArrayList<androidx.fragment.app.Fragment.AbstractC7569> mOnPreAttachedListeners;
    androidx.fragment.app.Fragment mParentFragment;
    boolean mPerformedCreateView;
    java.lang.Runnable mPostponedDurationRunnable;
    android.os.Handler mPostponedHandler;

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC4544
    public java.lang.String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    android.os.Bundle mSavedFragmentState;
    private final androidx.fragment.app.Fragment.AbstractC7569 mSavedStateAttachListener;
    Yue.C5502 mSavedStateRegistryController;

    @Yue.InterfaceC4544
    java.lang.Boolean mSavedUserVisibleHint;
    android.os.Bundle mSavedViewRegistryState;
    android.util.SparseArray<android.os.Parcelable> mSavedViewState;
    int mState;
    java.lang.String mTag;
    androidx.fragment.app.Fragment mTarget;
    int mTargetRequestCode;
    java.lang.String mTargetWho;
    boolean mUserVisibleHint;
    android.view.View mView;

    @Yue.InterfaceC4544
    androidx.fragment.app.C7634 mViewLifecycleOwner;
    androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> mViewLifecycleOwnerLiveData;

    @Yue.InterfaceC4410
    java.lang.String mWho;


    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ, reason: contains not printable characters */
    public class C7557<I> extends Yue.AbstractC0254<I> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f29122;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0221 f29123;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f29124;

        public C7557(androidx.fragment.app.Fragment r1, java.util.concurrent.atomic.AtomicReference r2, Yue.AbstractC0221 r3) {
                r0 = this;
                r0.f29124 = r1
                r0.f29122 = r2
                r0.f29123 = r3
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC0254
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ */
        public Yue.AbstractC0221<I, ?> mo1198() {
                r1 = this;
                Yue.ۥ۟۟ۨۢ r0 = r1.f29123
                return r0
        }

        @Override // Yue.AbstractC0254
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo1200(I r2, @Yue.InterfaceC4544 Yue.C0206 r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r1.f29122
                java.lang.Object r0 = r0.get()
                Yue.ۥ۟۟ۨۦ r0 = (Yue.AbstractC0254) r0
                if (r0 == 0) goto Le
                r0.mo1200(r2, r3)
                return
            Le:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "Operation cannot be started before fragment is in created state"
                r2.<init>(r3)
                throw r2
        }

        @Override // Yue.AbstractC0254
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo1201() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r2.f29122
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)
                Yue.ۥ۟۟ۨۦ r0 = (Yue.AbstractC0254) r0
                if (r0 == 0) goto Le
                r0.mo1201()
            Le:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟, reason: contains not printable characters */
    public class RunnableC7558 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f29125;

        public RunnableC7558(androidx.fragment.app.Fragment r1) {
                r0 = this;
                r0.f29125 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.f29125
                r0.startPostponedEnterTransition()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟, reason: contains not printable characters */
    public class C7559 extends androidx.fragment.app.Fragment.AbstractC7569 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f29126;

        public C7559(androidx.fragment.app.Fragment r1) {
                r0 = this;
                r0.f29126 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // androidx.fragment.app.Fragment.AbstractC7569
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo29056() {
                r2 = this;
                androidx.fragment.app.Fragment r0 = r2.f29126
                Yue.ۥۡۧۤۡ r0 = r0.mSavedStateRegistryController
                r0.m20697()
                androidx.fragment.app.Fragment r0 = r2.f29126
                androidx.lifecycle.SavedStateHandleSupport.enableSavedStateHandles(r0)
                androidx.fragment.app.Fragment r0 = r2.f29126
                android.os.Bundle r0 = r0.mSavedFragmentState
                if (r0 == 0) goto L19
                java.lang.String r1 = "registryState"
                android.os.Bundle r0 = r0.getBundle(r1)
                goto L1a
            L19:
                r0 = 0
            L1a:
                androidx.fragment.app.Fragment r1 = r2.f29126
                Yue.ۥۡۧۤۡ r1 = r1.mSavedStateRegistryController
                r1.m20698(r0)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟, reason: contains not printable characters */
    public class RunnableC7560 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f29127;

        public RunnableC7560(androidx.fragment.app.Fragment r1) {
                r0 = this;
                r0.f29127 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.fragment.app.Fragment r0 = r2.f29127
                r1 = 0
                r0.callStartTransitionListener(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟۟, reason: contains not printable characters */
    public class RunnableC7561 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.AbstractC7635 f29128;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f29129;

        public RunnableC7561(androidx.fragment.app.Fragment r1, androidx.fragment.app.AbstractC7635 r2) {
                r0 = this;
                r0.f29129 = r1
                r0.f29128 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۠ۡ r0 = r1.f29128
                r0.m29478()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C7562 extends Yue.AbstractC2762 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f29130;

        public C7562(androidx.fragment.app.Fragment r1) {
                r0 = this;
                r0.f29130 = r1
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC2762
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟ */
        public android.view.View mo12069(int r3) {
                r2 = this;
                androidx.fragment.app.Fragment r0 = r2.f29130
                android.view.View r0 = r0.mView
                if (r0 == 0) goto Lb
                android.view.View r3 = r0.findViewById(r3)
                return r3
            Lb:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Fragment "
                r0.append(r1)
                androidx.fragment.app.Fragment r1 = r2.f29130
                r0.append(r1)
                java.lang.String r1 = " does not have a view"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // Yue.AbstractC2762
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo12070() {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.f29130
                android.view.View r0 = r0.mView
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C7563 implements Yue.InterfaceC2848<java.lang.Void, androidx.activity.result.ActivityResultRegistry> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f29131;

        public C7563(androidx.fragment.app.Fragment r1) {
                r0 = this;
                r0.f29131 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2848
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResultRegistry apply(java.lang.Void r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                androidx.activity.result.ActivityResultRegistry r1 = r0.m29057(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.activity.result.ActivityResultRegistry m29057(java.lang.Void r3) {
                r2 = this;
                androidx.fragment.app.Fragment r3 = r2.f29131
                Yue.ۥ۠ۢۨ<?> r0 = r3.mHost
                boolean r1 = r0 instanceof Yue.InterfaceC0255
                if (r1 == 0) goto Lf
                Yue.ۥ۟۟ۨۧ r0 = (Yue.InterfaceC0255) r0
                androidx.activity.result.ActivityResultRegistry r3 = r0.getActivityResultRegistry()
                return r3
            Lf:
                androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
                androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
                return r3
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C7564 implements Yue.InterfaceC2848<java.lang.Void, androidx.activity.result.ActivityResultRegistry> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.result.ActivityResultRegistry f29132;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f29133;

        public C7564(androidx.fragment.app.Fragment r1, androidx.activity.result.ActivityResultRegistry r2) {
                r0 = this;
                r0.f29133 = r1
                r0.f29132 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2848
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResultRegistry apply(java.lang.Void r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                androidx.activity.result.ActivityResultRegistry r1 = r0.m29058(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.activity.result.ActivityResultRegistry m29058(java.lang.Void r1) {
                r0 = this;
                androidx.activity.result.ActivityResultRegistry r1 = r0.f29132
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥۣ۟۟۟, reason: contains not printable characters */
    public class C7565 extends androidx.fragment.app.Fragment.AbstractC7569 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2848 f29134;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f29135;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0221 f29136;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC0219 f29137;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f29138;

        public C7565(androidx.fragment.app.Fragment r1, Yue.InterfaceC2848 r2, java.util.concurrent.atomic.AtomicReference r3, Yue.AbstractC0221 r4, Yue.InterfaceC0219 r5) {
                r0 = this;
                r0.f29138 = r1
                r0.f29134 = r2
                r0.f29135 = r3
                r0.f29136 = r4
                r0.f29137 = r5
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // androidx.fragment.app.Fragment.AbstractC7569
        /* JADX INFO: renamed from: ۥ */
        public void mo29056() {
                r6 = this;
                androidx.fragment.app.Fragment r0 = r6.f29138
                java.lang.String r0 = r0.generateActivityResultKey()
                Yue.ۥۣۣ۠۠ r1 = r6.f29134
                r2 = 0
                java.lang.Object r1 = r1.apply(r2)
                androidx.activity.result.ActivityResultRegistry r1 = (androidx.activity.result.ActivityResultRegistry) r1
                java.util.concurrent.atomic.AtomicReference r2 = r6.f29135
                androidx.fragment.app.Fragment r3 = r6.f29138
                Yue.ۥ۟۟ۨۢ r4 = r6.f29136
                Yue.ۥ۟۟ۨ۠ r5 = r6.f29137
                Yue.ۥ۟۟ۨۦ r0 = r1.m27782(r0, r3, r4, r5)
                r2.set(r0)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C7566 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.view.View f29139;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f29140;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC0353
        public int f29141;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC0353
        public int f29142;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC0353
        public int f29143;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC0353
        public int f29144;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f29145;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public java.util.ArrayList<java.lang.String> f29146;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public java.util.ArrayList<java.lang.String> f29147;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public java.lang.Object f29148;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public java.lang.Object f29149;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public java.lang.Object f29150;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public java.lang.Object f29151;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public java.lang.Object f29152;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f29153;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public java.lang.Boolean f29154;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public java.lang.Boolean f29155;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public Yue.AbstractC5739 f29156;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public Yue.AbstractC5739 f29157;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public float f29158;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public android.view.View f29159;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f29160;

        public C7566() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f29148 = r0
                java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
                r2.f29149 = r1
                r2.f29150 = r0
                r2.f29151 = r1
                r2.f29152 = r0
                r2.f29153 = r1
                r2.f29156 = r0
                r2.f29157 = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.f29158 = r1
                r2.f29159 = r0
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static class C7567 {
        public C7567() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m29059(@Yue.InterfaceC4410 android.view.View r0) {
                r0.cancelPendingInputEvents()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C7568 extends java.lang.RuntimeException {
        public C7568(@Yue.InterfaceC4410 java.lang.String r1, @Yue.InterfaceC4544 java.lang.Exception r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static abstract class AbstractC7569 {
        public AbstractC7569() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AbstractC7569(androidx.fragment.app.Fragment.RunnableC7558 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract void mo29056();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @android.annotation.SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class C7570 implements android.os.Parcelable {

        @Yue.InterfaceC4410
        public static final android.os.Parcelable.Creator<androidx.fragment.app.Fragment.C7570> CREATOR = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final android.os.Bundle f29161;

        /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۨ$ۥ, reason: contains not printable characters */
        public class C7571 implements android.os.Parcelable.ClassLoaderCreator<androidx.fragment.app.Fragment.C7570> {
            public C7571() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r1 = r0.m29060(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ androidx.fragment.app.Fragment.C7570 createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r1 = r0.m29061(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.fragment.app.Fragment$ۥ۟۟۟ۨ[] r1 = r0.m29062(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public androidx.fragment.app.Fragment.C7570 m29060(android.os.Parcel r3) {
                    r2 = this;
                    androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r0 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۨ
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public androidx.fragment.app.Fragment.C7570 m29061(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r0 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۨ
                    r0.<init>(r2, r3)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public androidx.fragment.app.Fragment.C7570[] m29062(int r1) {
                    r0 = this;
                    androidx.fragment.app.Fragment$ۥ۟۟۟ۨ[] r1 = new androidx.fragment.app.Fragment.C7570[r1]
                    return r1
            }
        }

        static {
                androidx.fragment.app.Fragment$ۥ۟۟۟ۨ$ۥ r0 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۨ$ۥ
                r0.<init>()
                androidx.fragment.app.Fragment.C7570.CREATOR = r0
                return
        }

        public C7570(android.os.Bundle r1) {
                r0 = this;
                r0.<init>()
                r0.f29161 = r1
                return
        }

        public C7570(@Yue.InterfaceC4410 android.os.Parcel r1, @Yue.InterfaceC4544 java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>()
                android.os.Bundle r1 = r1.readBundle()
                r0.f29161 = r1
                if (r2 == 0) goto L10
                if (r1 == 0) goto L10
                r1.setClassLoader(r2)
            L10:
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Yue.InterfaceC4410 android.os.Parcel r1, int r2) {
                r0 = this;
                android.os.Bundle r2 = r0.f29161
                r1.writeBundle(r2)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION = r0
            return
    }

    public Fragment() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mState = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.mWho = r0
            r0 = 0
            r1.mTargetWho = r0
            r1.mIsPrimaryNavigationFragment = r0
            Yue.ۥ۠ۢۨۤ r0 = new Yue.ۥ۠ۢۨۤ
            r0.<init>()
            r1.mChildFragmentManager = r0
            r0 = 1
            r1.mMenuVisible = r0
            r1.mUserVisibleHint = r0
            androidx.fragment.app.Fragment$ۥ۟ r0 = new androidx.fragment.app.Fragment$ۥ۟
            r0.<init>(r1)
            r1.mPostponedDurationRunnable = r0
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            r1.mMaxState = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.mViewLifecycleOwnerLiveData = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.mNextLocalRequestCode = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnPreAttachedListeners = r0
            androidx.fragment.app.Fragment$ۥ۟۟ r0 = new androidx.fragment.app.Fragment$ۥ۟۟
            r0.<init>(r1)
            r1.mSavedStateAttachListener = r0
            r1.m29051()
            return
    }

    @Yue.InterfaceC1578
    public Fragment(@Yue.InterfaceC3573 int r1) {
            r0 = this;
            r0.<init>()
            r0.mContentLayoutId = r1
            return
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public static androidx.fragment.app.Fragment instantiate(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.lang.String r2) {
            r0 = 0
            androidx.fragment.app.Fragment r1 = instantiate(r1, r2, r0)
            return r1
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public static androidx.fragment.app.Fragment instantiate(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC4544 android.os.Bundle r5) {
            java.lang.String r0 = ": make sure class name exists, is public, and has an empty constructor that is public"
            java.lang.String r1 = "Unable to instantiate fragment "
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            java.lang.Class r3 = androidx.fragment.app.C7616.m29343(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            r2 = 0
            java.lang.reflect.Constructor r3 = r3.getConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            java.lang.Object r3 = r3.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            if (r5 == 0) goto L30
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            r5.setClassLoader(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            r3.setArguments(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            goto L30
        L28:
            r3 = move-exception
            goto L31
        L2a:
            r3 = move-exception
            goto L4b
        L2c:
            r3 = move-exception
            goto L65
        L2e:
            r3 = move-exception
            goto L7d
        L30:
            return r3
        L31:
            androidx.fragment.app.Fragment$ۥ۟۟۟ۦ r5 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۦ
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ": calling Fragment constructor caused an exception"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4, r3)
            throw r5
        L4b:
            androidx.fragment.app.Fragment$ۥ۟۟۟ۦ r5 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۦ
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ": could not find Fragment constructor"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4, r3)
            throw r5
        L65:
            androidx.fragment.app.Fragment$ۥ۟۟۟ۦ r5 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۦ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r5.<init>(r4, r3)
            throw r5
        L7d:
            androidx.fragment.app.Fragment$ۥ۟۟۟ۦ r5 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۦ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r5.<init>(r4, r3)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m29047(androidx.fragment.app.Fragment r0) {
            r0.m29052()
            return
    }

    public void callStartTransitionListener(boolean r3) {
            r2 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r2.mAnimationInfo
            if (r0 == 0) goto L7
            r1 = 0
            r0.f29160 = r1
        L7:
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L3a
            android.view.ViewGroup r0 = r2.mContainer
            if (r0 == 0) goto L3a
            androidx.fragment.app.FragmentManager r1 = r2.mFragmentManager
            if (r1 == 0) goto L3a
            androidx.fragment.app.ۥ۟۟۠ۡ r0 = androidx.fragment.app.AbstractC7635.m29472(r0, r1)
            r0.m29485()
            if (r3 == 0) goto L2b
            Yue.ۥ۠ۢۨ<?> r3 = r2.mHost
            android.os.Handler r3 = r3.m12115()
            androidx.fragment.app.Fragment$ۥ۟۟۟۟ r1 = new androidx.fragment.app.Fragment$ۥ۟۟۟۟
            r1.<init>(r2, r0)
            r3.post(r1)
            goto L2e
        L2b:
            r0.m29478()
        L2e:
            android.os.Handler r3 = r2.mPostponedHandler
            if (r3 == 0) goto L3a
            java.lang.Runnable r0 = r2.mPostponedDurationRunnable
            r3.removeCallbacks(r0)
            r3 = 0
            r2.mPostponedHandler = r3
        L3a:
            return
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC2762 createFragmentContainer() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟۠ r0 = new androidx.fragment.app.Fragment$ۥ۟۟۟۠
            r0.<init>(r1)
            return r0
    }

    public void dump(@Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4544 java.io.FileDescriptor r4, @Yue.InterfaceC4410 java.io.PrintWriter r5, @Yue.InterfaceC4544 java.lang.String[] r6) {
            r2 = this;
            r5.print(r3)
            java.lang.String r0 = "mFragmentId=#"
            r5.print(r0)
            int r0 = r2.mFragmentId
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r5.print(r0)
            int r0 = r2.mContainerId
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mTag="
            r5.print(r0)
            java.lang.String r0 = r2.mTag
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mState="
            r5.print(r0)
            int r0 = r2.mState
            r5.print(r0)
            java.lang.String r0 = " mWho="
            r5.print(r0)
            java.lang.String r0 = r2.mWho
            r5.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r5.print(r0)
            int r0 = r2.mBackStackNesting
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mAdded="
            r5.print(r0)
            boolean r0 = r2.mAdded
            r5.print(r0)
            java.lang.String r0 = " mRemoving="
            r5.print(r0)
            boolean r0 = r2.mRemoving
            r5.print(r0)
            java.lang.String r0 = " mFromLayout="
            r5.print(r0)
            boolean r0 = r2.mFromLayout
            r5.print(r0)
            java.lang.String r0 = " mInLayout="
            r5.print(r0)
            boolean r0 = r2.mInLayout
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mHidden="
            r5.print(r0)
            boolean r0 = r2.mHidden
            r5.print(r0)
            java.lang.String r0 = " mDetached="
            r5.print(r0)
            boolean r0 = r2.mDetached
            r5.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r5.print(r0)
            boolean r0 = r2.mMenuVisible
            r5.print(r0)
            java.lang.String r0 = " mHasMenu="
            r5.print(r0)
            boolean r0 = r2.mHasMenu
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mRetainInstance="
            r5.print(r0)
            boolean r0 = r2.mRetainInstance
            r5.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r5.print(r0)
            boolean r0 = r2.mUserVisibleHint
            r5.println(r0)
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto Lc8
            r5.print(r3)
            java.lang.String r0 = "mFragmentManager="
            r5.print(r0)
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            r5.println(r0)
        Lc8:
            Yue.ۥ۠ۢۨ<?> r0 = r2.mHost
            if (r0 == 0) goto Ld9
            r5.print(r3)
            java.lang.String r0 = "mHost="
            r5.print(r0)
            Yue.ۥ۠ۢۨ<?> r0 = r2.mHost
            r5.println(r0)
        Ld9:
            androidx.fragment.app.Fragment r0 = r2.mParentFragment
            if (r0 == 0) goto Lea
            r5.print(r3)
            java.lang.String r0 = "mParentFragment="
            r5.print(r0)
            androidx.fragment.app.Fragment r0 = r2.mParentFragment
            r5.println(r0)
        Lea:
            android.os.Bundle r0 = r2.mArguments
            if (r0 == 0) goto Lfb
            r5.print(r3)
            java.lang.String r0 = "mArguments="
            r5.print(r0)
            android.os.Bundle r0 = r2.mArguments
            r5.println(r0)
        Lfb:
            android.os.Bundle r0 = r2.mSavedFragmentState
            if (r0 == 0) goto L10c
            r5.print(r3)
            java.lang.String r0 = "mSavedFragmentState="
            r5.print(r0)
            android.os.Bundle r0 = r2.mSavedFragmentState
            r5.println(r0)
        L10c:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.mSavedViewState
            if (r0 == 0) goto L11d
            r5.print(r3)
            java.lang.String r0 = "mSavedViewState="
            r5.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.mSavedViewState
            r5.println(r0)
        L11d:
            android.os.Bundle r0 = r2.mSavedViewRegistryState
            if (r0 == 0) goto L12e
            r5.print(r3)
            java.lang.String r0 = "mSavedViewRegistryState="
            r5.print(r0)
            android.os.Bundle r0 = r2.mSavedViewRegistryState
            r5.println(r0)
        L12e:
            r0 = 0
            androidx.fragment.app.Fragment r0 = r2.m29050(r0)
            if (r0 == 0) goto L14a
            r5.print(r3)
            java.lang.String r1 = "mTarget="
            r5.print(r1)
            r5.print(r0)
            java.lang.String r0 = " mTargetRequestCode="
            r5.print(r0)
            int r0 = r2.mTargetRequestCode
            r5.println(r0)
        L14a:
            r5.print(r3)
            java.lang.String r0 = "mPopDirection="
            r5.print(r0)
            boolean r0 = r2.getPopDirection()
            r5.println(r0)
            int r0 = r2.getEnterAnim()
            if (r0 == 0) goto L16e
            r5.print(r3)
            java.lang.String r0 = "getEnterAnim="
            r5.print(r0)
            int r0 = r2.getEnterAnim()
            r5.println(r0)
        L16e:
            int r0 = r2.getExitAnim()
            if (r0 == 0) goto L183
            r5.print(r3)
            java.lang.String r0 = "getExitAnim="
            r5.print(r0)
            int r0 = r2.getExitAnim()
            r5.println(r0)
        L183:
            int r0 = r2.getPopEnterAnim()
            if (r0 == 0) goto L198
            r5.print(r3)
            java.lang.String r0 = "getPopEnterAnim="
            r5.print(r0)
            int r0 = r2.getPopEnterAnim()
            r5.println(r0)
        L198:
            int r0 = r2.getPopExitAnim()
            if (r0 == 0) goto L1ad
            r5.print(r3)
            java.lang.String r0 = "getPopExitAnim="
            r5.print(r0)
            int r0 = r2.getPopExitAnim()
            r5.println(r0)
        L1ad:
            android.view.ViewGroup r0 = r2.mContainer
            if (r0 == 0) goto L1be
            r5.print(r3)
            java.lang.String r0 = "mContainer="
            r5.print(r0)
            android.view.ViewGroup r0 = r2.mContainer
            r5.println(r0)
        L1be:
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L1cf
            r5.print(r3)
            java.lang.String r0 = "mView="
            r5.print(r0)
            android.view.View r0 = r2.mView
            r5.println(r0)
        L1cf:
            android.view.View r0 = r2.getAnimatingAway()
            if (r0 == 0) goto L1e4
            r5.print(r3)
            java.lang.String r0 = "mAnimatingAway="
            r5.print(r0)
            android.view.View r0 = r2.getAnimatingAway()
            r5.println(r0)
        L1e4:
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L1f1
            Yue.ۥۣ۠ۧۦ r0 = Yue.AbstractC3658.m14801(r2)
            r0.mo14803(r3, r4, r5, r6)
        L1f1:
            r5.print(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Child "
            r0.append(r1)
            androidx.fragment.app.FragmentManager r1 = r2.mChildFragmentManager
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "  "
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.m29136(r3, r4, r5, r6)
            return
    }

    public final boolean equals(@Yue.InterfaceC4544 java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Yue.InterfaceC4544
    public androidx.fragment.app.Fragment findFragmentByWho(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.mWho
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return r1
        L9:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            androidx.fragment.app.Fragment r2 = r0.m29148(r2)
            return r2
    }

    @Yue.InterfaceC4410
    public java.lang.String generateActivityResultKey() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fragment_"
            r0.append(r1)
            java.lang.String r1 = r2.mWho
            r0.append(r1)
            java.lang.String r1 = "_rq#"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.mNextLocalRequestCode
            int r1 = r1.getAndIncrement()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4544
    public final androidx.fragment.app.FragmentActivity getActivity() {
            r1 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r1.mHost
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            android.app.Activity r0 = r0.m12113()
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
        Lc:
            return r0
    }

    public boolean getAllowEnterTransitionOverlap() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 == 0) goto Le
            java.lang.Boolean r0 = r0.f29155
            if (r0 != 0) goto L9
            goto Le
        L9:
            boolean r0 = r0.booleanValue()
            goto Lf
        Le:
            r0 = 1
        Lf:
            return r0
    }

    public boolean getAllowReturnTransitionOverlap() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 == 0) goto Le
            java.lang.Boolean r0 = r0.f29154
            if (r0 != 0) goto L9
            goto Le
        L9:
            boolean r0 = r0.booleanValue()
            goto Lf
        Le:
            r0 = 1
        Lf:
            return r0
    }

    public android.view.View getAnimatingAway() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.f29139
            return r0
    }

    @Yue.InterfaceC4544
    public final android.os.Bundle getArguments() {
            r1 = this;
            android.os.Bundle r0 = r1.mArguments
            return r0
    }

    @Yue.InterfaceC4410
    public final androidx.fragment.app.FragmentManager getChildFragmentManager() {
            r3 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r3.mHost
            if (r0 == 0) goto L7
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " has not been attached yet."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4544
    public android.content.Context getContext() {
            r1 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r1.mHost
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            android.content.Context r0 = r0.m12114()
        La:
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @Yue.InterfaceC4410
    @Yue.InterfaceC0907
    public androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r3 = this;
            android.content.Context r0 = r3.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
        L8:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1a
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L13
            android.app.Application r0 = (android.app.Application) r0
            goto L1b
        L13:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L8
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L47
            r1 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r1)
            if (r1 == 0) goto L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find Application instance from Context "
            r1.append(r2)
            android.content.Context r2 = r3.requireContext()
            android.content.Context r2 = r2.getApplicationContext()
            r1.append(r2)
            java.lang.String r2 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L47:
            androidx.lifecycle.viewmodel.MutableCreationExtras r1 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            r1.<init>()
            if (r0 == 0) goto L53
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r2 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            r1.set(r2, r0)
        L53:
            androidx.lifecycle.viewmodel.CreationExtras$Key<Yue.ۥۡۧۤۢ> r0 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            r1.set(r0, r3)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r0 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            r1.set(r0, r3)
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L6c
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r0 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            android.os.Bundle r2 = r3.getArguments()
            r1.set(r0, r2)
        L6c:
            return r1
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @Yue.InterfaceC4410
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L5d
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            if (r0 != 0) goto L5a
            android.content.Context r0 = r3.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
        L10:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L22
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L1b
            android.app.Application r0 = (android.app.Application) r0
            goto L23
        L1b:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L10
        L22:
            r0 = 0
        L23:
            if (r0 != 0) goto L4f
            r1 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r1)
            if (r1 == 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find Application instance from Context "
            r1.append(r2)
            android.content.Context r2 = r3.requireContext()
            android.content.Context r2 = r2.getApplicationContext()
            r1.append(r2)
            java.lang.String r2 = ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L4f:
            androidx.lifecycle.SavedStateViewModelFactory r1 = new androidx.lifecycle.SavedStateViewModelFactory
            android.os.Bundle r2 = r3.getArguments()
            r1.<init>(r0, r3, r2)
            r3.mDefaultFactory = r1
        L5a:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            return r0
        L5d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC0353
    public int getEnterAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f29141
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.Object getEnterTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.f29148
            return r0
    }

    public Yue.AbstractC5739 getEnterTransitionCallback() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            Yue.ۥۡۨۨ۟ r0 = r0.f29156
            return r0
    }

    @Yue.InterfaceC0353
    public int getExitAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f29142
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.Object getExitTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.f29150
            return r0
    }

    public Yue.AbstractC5739 getExitTransitionCallback() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            Yue.ۥۡۨۨ۟ r0 = r0.f29157
            return r0
    }

    public android.view.View getFocusedView() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.f29159
            return r0
    }

    @Yue.InterfaceC4544
    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            return r0
    }

    @Yue.InterfaceC4544
    public final java.lang.Object getHost() {
            r1 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r1.mHost
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.Object r0 = r0.mo12117()
        La:
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.mFragmentId
            return r0
    }

    @Yue.InterfaceC4410
    public final android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.mLayoutInflater
            if (r0 != 0) goto L9
            r0 = 0
            android.view.LayoutInflater r0 = r1.performGetLayoutInflater(r0)
        L9:
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.Deprecated
    public android.view.LayoutInflater getLayoutInflater(@Yue.InterfaceC4544 android.os.Bundle r2) {
            r1 = this;
            Yue.ۥ۠ۢۨ<?> r2 = r1.mHost
            if (r2 == 0) goto L12
            android.view.LayoutInflater r2 = r2.mo12118()
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            android.view.LayoutInflater$Factory2 r0 = r0.m29164()
            Yue.C3570.m14504(r2, r0)
            return r2
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @Yue.InterfaceC4410
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public Yue.AbstractC3658 getLoaderManager() {
            r1 = this;
            Yue.ۥۣ۠ۧۦ r0 = Yue.AbstractC3658.m14801(r1)
            return r0
    }

    public int getNextTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f29145
            return r0
    }

    @Yue.InterfaceC4544
    public final androidx.fragment.app.Fragment getParentFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mParentFragment
            return r0
    }

    @Yue.InterfaceC4410
    public final androidx.fragment.app.FragmentManager getParentFragmentManager() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " not associated with a fragment manager."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean getPopDirection() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.f29140
            return r0
    }

    @Yue.InterfaceC0353
    public int getPopEnterAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f29143
            return r0
    }

    @Yue.InterfaceC0353
    public int getPopExitAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f29144
            return r0
    }

    public float getPostOnViewCreatedAlpha() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L7
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L7:
            float r0 = r0.f29158
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.Object getReenterTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.f29151
            java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.getExitTransition()
        L10:
            return r0
    }

    @Yue.InterfaceC4410
    public final android.content.res.Resources getResources() {
            r1 = this;
            android.content.Context r0 = r1.requireContext()
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    @java.lang.Deprecated
    public final boolean getRetainInstance() {
            r1 = this;
            Yue.C2779.m12156(r1)
            boolean r0 = r1.mRetainInstance
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.Object getReturnTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.f29149
            java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.getEnterTransition()
        L10:
            return r0
    }

    @Override // Yue.InterfaceC5504
    @Yue.InterfaceC4410
    public final androidx.savedstate.C7816 getSavedStateRegistry() {
            r1 = this;
            Yue.ۥۡۧۤۡ r0 = r1.mSavedStateRegistryController
            androidx.savedstate.ۥ r0 = r0.m20696()
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.Object getSharedElementEnterTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.f29152
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.Object getSharedElementReturnTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.f29153
            java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.getSharedElementEnterTransition()
        L10:
            return r0
    }

    @Yue.InterfaceC4410
    public java.util.ArrayList<java.lang.String> getSharedElementSourceNames() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 == 0) goto La
            java.util.ArrayList<java.lang.String> r0 = r0.f29146
            if (r0 != 0) goto L9
            goto La
        L9:
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4410
    public java.util.ArrayList<java.lang.String> getSharedElementTargetNames() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 == 0) goto La
            java.util.ArrayList<java.lang.String> r0 = r0.f29147
            if (r0 != 0) goto L9
            goto La
        L9:
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4410
    public final java.lang.String getString(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    @Yue.InterfaceC4410
    public final java.lang.String getString(@Yue.InterfaceC5971 int r2, @Yue.InterfaceC4544 java.lang.Object... r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = r0.getString(r2, r3)
            return r2
    }

    @Yue.InterfaceC4544
    public final java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = r1.mTag
            return r0
    }

    @Yue.InterfaceC4544
    @java.lang.Deprecated
    public final androidx.fragment.app.Fragment getTargetFragment() {
            r1 = this;
            r0 = 1
            androidx.fragment.app.Fragment r0 = r1.m29050(r0)
            return r0
    }

    @java.lang.Deprecated
    public final int getTargetRequestCode() {
            r1 = this;
            Yue.C2779.m12157(r1)
            int r0 = r1.mTargetRequestCode
            return r0
    }

    @Yue.InterfaceC4410
    public final java.lang.CharSequence getText(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            return r2
    }

    @java.lang.Deprecated
    public boolean getUserVisibleHint() {
            r1 = this;
            boolean r0 = r1.mUserVisibleHint
            return r0
    }

    @Yue.InterfaceC4544
    public android.view.View getView() {
            r1 = this;
            android.view.View r0 = r1.mView
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC3875
    public androidx.lifecycle.LifecycleOwner getViewLifecycleOwner() {
            r3 = this;
            androidx.fragment.app.ۥ۟۟۠۠ r0 = r3.mViewLifecycleOwner
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't access the Fragment View's LifecycleOwner for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " when getView() is null i.e., before onCreateView() or after onDestroyView()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4410
    public androidx.lifecycle.LiveData<androidx.lifecycle.LifecycleOwner> getViewLifecycleOwnerLiveData() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r1.mViewLifecycleOwnerLiveData
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @Yue.InterfaceC4410
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L1f
            int r0 = r2.m29049()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            int r1 = r1.ordinal()
            if (r0 == r1) goto L17
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.lifecycle.ViewModelStore r0 = r0.m29170(r2)
            return r0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"
            r0.<init>(r1)
            throw r0
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
            r1 = this;
            boolean r0 = r1.mHasMenu
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public void initState() {
            r3 = this;
            r3.m29051()
            java.lang.String r0 = r3.mWho
            r3.mPreviousWho = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.mWho = r0
            r0 = 0
            r3.mAdded = r0
            r3.mRemoving = r0
            r3.mFromLayout = r0
            r3.mInLayout = r0
            r3.mRestored = r0
            r3.mBackStackNesting = r0
            r1 = 0
            r3.mFragmentManager = r1
            Yue.ۥ۠ۢۨۤ r2 = new Yue.ۥ۠ۢۨۤ
            r2.<init>()
            r3.mChildFragmentManager = r2
            r3.mHost = r1
            r3.mFragmentId = r0
            r3.mContainerId = r0
            r3.mTag = r1
            r3.mHidden = r0
            r3.mDetached = r0
            return
    }

    public final boolean isAdded() {
            r1 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r1.mHost
            if (r0 == 0) goto La
            boolean r0 = r1.mAdded
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean isDetached() {
            r1 = this;
            boolean r0 = r1.mDetached
            return r0
    }

    public final boolean isHidden() {
            r2 = this;
            boolean r0 = r2.mHidden
            if (r0 != 0) goto L13
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L11
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r0.m29177(r1)
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    public final boolean isInBackStack() {
            r1 = this;
            int r0 = r1.mBackStackNesting
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean isInLayout() {
            r1 = this;
            boolean r0 = r1.mInLayout
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public final boolean isMenuVisible() {
            r2 = this;
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L12
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L10
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r0.m29178(r1)
            if (r0 == 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean isPostponed() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.f29160
            return r0
    }

    public final boolean isRemoving() {
            r1 = this;
            boolean r0 = r1.mRemoving
            return r0
    }

    public final boolean isResumed() {
            r2 = this;
            int r0 = r2.mState
            r1 = 7
            if (r0 < r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public final boolean isStateSaved() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.m29181()
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L20
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L20
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L20
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L20
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    public void noteStateNotSaved() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            r0.m29191()
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public void onActivityCreated(@Yue.InterfaceC4544 android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    @java.lang.Deprecated
    public void onActivityResult(int r3, int r4, @Yue.InterfaceC4544 android.content.Intent r5) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " received the following in onActivityResult(): requestCode: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " resultCode: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " data: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L35:
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public void onAttach(@Yue.InterfaceC4410 android.app.Activity r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onAttach(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r2 = 1
            r1.mCalled = r2
            Yue.ۥ۠ۢۨ<?> r2 = r1.mHost
            if (r2 != 0) goto L9
            r2 = 0
            goto Ld
        L9:
            android.app.Activity r2 = r2.m12113()
        Ld:
            if (r2 == 0) goto L15
            r0 = 0
            r1.mCalled = r0
            r1.onAttach(r2)
        L15:
            return
    }

    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public void onAttachFragment(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    @Yue.InterfaceC0907
    public void onConfigurationChanged(@Yue.InterfaceC4410 android.content.res.Configuration r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    @Yue.InterfaceC3875
    public boolean onContextItemSelected(@Yue.InterfaceC4410 android.view.MenuItem r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onCreate(@Yue.InterfaceC4544 android.os.Bundle r2) {
            r1 = this;
            r2 = 1
            r1.mCalled = r2
            r1.restoreChildFragmentState()
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            boolean r2 = r0.m29180(r2)
            if (r2 != 0) goto L13
            androidx.fragment.app.FragmentManager r2 = r1.mChildFragmentManager
            r2.m29115()
        L13:
            return
    }

    @Yue.InterfaceC4544
    @Yue.InterfaceC3875
    public android.view.animation.Animation onCreateAnimation(int r1, boolean r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Yue.InterfaceC4544
    @Yue.InterfaceC3875
    public android.animation.Animator onCreateAnimator(int r1, boolean r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @Yue.InterfaceC3875
    public void onCreateContextMenu(@Yue.InterfaceC4410 android.view.ContextMenu r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4544 android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            r0.onCreateContextMenu(r2, r3, r4)
            return
    }

    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public void onCreateOptionsMenu(@Yue.InterfaceC4410 android.view.Menu r1, @Yue.InterfaceC4410 android.view.MenuInflater r2) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4544
    @Yue.InterfaceC3875
    public android.view.View onCreateView(@Yue.InterfaceC4410 android.view.LayoutInflater r2, @Yue.InterfaceC4544 android.view.ViewGroup r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
            r1 = this;
            int r4 = r1.mContentLayoutId
            if (r4 == 0) goto La
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            return r2
        La:
            r2 = 0
            return r2
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onDestroy() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public void onDestroyOptionsMenu() {
            r0 = this;
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onDestroyView() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onDetach() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @Yue.InterfaceC4410
    public android.view.LayoutInflater onGetLayoutInflater(@Yue.InterfaceC4544 android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.getLayoutInflater(r1)
            return r1
    }

    @Yue.InterfaceC3875
    public void onHiddenChanged(boolean r1) {
            r0 = this;
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC6567
    @java.lang.Deprecated
    public void onInflate(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC4410 android.util.AttributeSet r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC6567
    public void onInflate(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.util.AttributeSet r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
            r1 = this;
            r2 = 1
            r1.mCalled = r2
            Yue.ۥ۠ۢۨ<?> r2 = r1.mHost
            if (r2 != 0) goto L9
            r2 = 0
            goto Ld
        L9:
            android.app.Activity r2 = r2.m12113()
        Ld:
            if (r2 == 0) goto L15
            r0 = 0
            r1.mCalled = r0
            r1.onInflate(r2, r3, r4)
        L15:
            return
    }

    @Override // android.content.ComponentCallbacks
    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onLowMemory() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onMultiWindowModeChanged(boolean r1) {
            r0 = this;
            return
    }

    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public boolean onOptionsItemSelected(@Yue.InterfaceC4410 android.view.MenuItem r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public void onOptionsMenuClosed(@Yue.InterfaceC4410 android.view.Menu r1) {
            r0 = this;
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onPause() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onPictureInPictureModeChanged(boolean r1) {
            r0 = this;
            return
    }

    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public void onPrepareOptionsMenu(@Yue.InterfaceC4410 android.view.Menu r1) {
            r0 = this;
            return
    }

    @Yue.InterfaceC3875
    public void onPrimaryNavigationFragmentChanged(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onRequestPermissionsResult(int r1, @Yue.InterfaceC4410 java.lang.String[] r2, @Yue.InterfaceC4410 int[] r3) {
            r0 = this;
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onResume() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @Yue.InterfaceC3875
    public void onSaveInstanceState(@Yue.InterfaceC4410 android.os.Bundle r1) {
            r0 = this;
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onStart() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onStop() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @Yue.InterfaceC3875
    public void onViewCreated(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4544 android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    public void onViewStateRestored(@Yue.InterfaceC4544 android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    public void performActivityCreated(android.os.Bundle r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            r0.m29191()
            r0 = 3
            r2.mState = r0
            r0 = 0
            r2.mCalled = r0
            r2.onActivityCreated(r3)
            boolean r3 = r2.mCalled
            if (r3 == 0) goto L1b
            r2.m29055()
            androidx.fragment.app.FragmentManager r3 = r2.mChildFragmentManager
            r3.m29111()
            return
        L1b:
            Yue.ۥۢ۠ۤۦ r3 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " did not call through to super.onActivityCreated()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void performAttach() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۧ> r0 = r3.mOnPreAttachedListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment$ۥ۟۟۟ۧ r1 = (androidx.fragment.app.Fragment.AbstractC7569) r1
            r1.mo29056()
            goto L6
        L16:
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۧ> r0 = r3.mOnPreAttachedListeners
            r0.clear()
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            Yue.ۥ۠ۢۨ<?> r1 = r3.mHost
            Yue.ۥ۠ۢۧۧ r2 = r3.createFragmentContainer()
            r0.m29098(r1, r2, r3)
            r0 = 0
            r3.mState = r0
            r3.mCalled = r0
            Yue.ۥ۠ۢۨ<?> r0 = r3.mHost
            android.content.Context r0 = r0.m12114()
            r3.onAttach(r0)
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L43
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            r0.m29121(r3)
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29112()
            return
        L43:
            Yue.ۥۢ۠ۤۦ r0 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void performConfigurationChanged(@Yue.InterfaceC4410 android.content.res.Configuration r1) {
            r0 = this;
            r0.onConfigurationChanged(r1)
            return
    }

    public boolean performContextItemSelected(@Yue.InterfaceC4410 android.view.MenuItem r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L13
            boolean r0 = r1.onContextItemSelected(r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            boolean r2 = r0.m29114(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public void performCreate(android.os.Bundle r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29191()
            r0 = 1
            r3.mState = r0
            r1 = 0
            r3.mCalled = r1
            androidx.lifecycle.LifecycleRegistry r1 = r3.mLifecycleRegistry
            androidx.fragment.app.Fragment$6 r2 = new androidx.fragment.app.Fragment$6
            r2.<init>(r3)
            r1.addObserver(r2)
            r3.onCreate(r4)
            r3.mIsCreated = r0
            boolean r4 = r3.mCalled
            if (r4 == 0) goto L26
            androidx.lifecycle.LifecycleRegistry r4 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r4.handleLifecycleEvent(r0)
            return
        L26:
            Yue.ۥۢ۠ۤۦ r4 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " did not call through to super.onCreate()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    public boolean performCreateOptionsMenu(@Yue.InterfaceC4410 android.view.Menu r3, @Yue.InterfaceC4410 android.view.MenuInflater r4) {
            r2 = this;
            boolean r0 = r2.mHidden
            r1 = 0
            if (r0 != 0) goto L18
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L11
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L11
            r2.onCreateOptionsMenu(r3, r4)
            r1 = 1
        L11:
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            boolean r3 = r0.m29116(r3, r4)
            r1 = r1 | r3
        L18:
            return r1
    }

    public void performCreateView(@Yue.InterfaceC4410 android.view.LayoutInflater r4, @Yue.InterfaceC4544 android.view.ViewGroup r5, @Yue.InterfaceC4544 android.os.Bundle r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29191()
            r0 = 1
            r3.mPerformedCreateView = r0
            androidx.fragment.app.ۥ۟۟۠۠ r0 = new androidx.fragment.app.ۥ۟۟۠۠
            androidx.lifecycle.ViewModelStore r1 = r3.getViewModelStore()
            Yue.ۥ۠ۢۧۢ r2 = new Yue.ۥ۠ۢۧۢ
            r2.<init>(r3)
            r0.<init>(r3, r1, r2)
            r3.mViewLifecycleOwner = r0
            android.view.View r4 = r3.onCreateView(r4, r5, r6)
            r3.mView = r4
            if (r4 == 0) goto L69
            androidx.fragment.app.ۥ۟۟۠۠ r4 = r3.mViewLifecycleOwner
            r4.m29462()
            r4 = 3
            boolean r4 = androidx.fragment.app.FragmentManager.m29090(r4)
            if (r4 == 0) goto L4c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Setting ViewLifecycleOwner on View "
            r4.append(r5)
            android.view.View r5 = r3.mView
            r4.append(r5)
            java.lang.String r5 = " for Fragment "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.d(r5, r4)
        L4c:
            android.view.View r4 = r3.mView
            androidx.fragment.app.ۥ۟۟۠۠ r5 = r3.mViewLifecycleOwner
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r4, r5)
            android.view.View r4 = r3.mView
            androidx.fragment.app.ۥ۟۟۠۠ r5 = r3.mViewLifecycleOwner
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r4, r5)
            android.view.View r4 = r3.mView
            androidx.fragment.app.ۥ۟۟۠۠ r5 = r3.mViewLifecycleOwner
            Yue.C6920.m26786(r4, r5)
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r4 = r3.mViewLifecycleOwnerLiveData
            androidx.fragment.app.ۥ۟۟۠۠ r5 = r3.mViewLifecycleOwner
            r4.setValue(r5)
            goto L74
        L69:
            androidx.fragment.app.ۥ۟۟۠۠ r4 = r3.mViewLifecycleOwner
            boolean r4 = r4.m29463()
            if (r4 != 0) goto L75
            r4 = 0
            r3.mViewLifecycleOwner = r4
        L74:
            return
        L75:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Called getViewLifecycleOwner() but onCreateView() returned null"
            r4.<init>(r5)
            throw r4
    }

    public void performDestroy() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29117()
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r3.mState = r0
            r3.mCalled = r0
            r3.mIsCreated = r0
            r3.onDestroy()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L1b
            return
        L1b:
            Yue.ۥۢ۠ۤۦ r0 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDestroy()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void performDestroyView() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29118()
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L22
            androidx.fragment.app.ۥ۟۟۠۠ r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L22
            androidx.fragment.app.ۥ۟۟۠۠ r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.m29461(r1)
        L22:
            r0 = 1
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onDestroyView()
            boolean r1 = r3.mCalled
            if (r1 == 0) goto L39
            Yue.ۥۣ۠ۧۦ r1 = Yue.AbstractC3658.m14801(r3)
            r1.mo14807()
            r3.mPerformedCreateView = r0
            return
        L39:
            Yue.ۥۢ۠ۤۦ r0 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDestroyView()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void performDetach() {
            r3 = this;
            r0 = -1
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onDetach()
            r0 = 0
            r3.mLayoutInflater = r0
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L25
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            boolean r0 = r0.m29174()
            if (r0 != 0) goto L24
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29117()
            Yue.ۥ۠ۢۨۤ r0 = new Yue.ۥ۠ۢۨۤ
            r0.<init>()
            r3.mChildFragmentManager = r0
        L24:
            return
        L25:
            Yue.ۥۢ۠ۤۦ r0 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDetach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4410
    public android.view.LayoutInflater performGetLayoutInflater(@Yue.InterfaceC4544 android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.onGetLayoutInflater(r1)
            r0.mLayoutInflater = r1
            return r1
    }

    public void performLowMemory() {
            r0 = this;
            r0.onLowMemory()
            return
    }

    public void performMultiWindowModeChanged(boolean r1) {
            r0 = this;
            r0.onMultiWindowModeChanged(r1)
            return
    }

    public boolean performOptionsItemSelected(@Yue.InterfaceC4410 android.view.MenuItem r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L1b
            boolean r0 = r1.mHasMenu
            if (r0 == 0) goto L14
            boolean r0 = r1.mMenuVisible
            if (r0 == 0) goto L14
            boolean r0 = r1.onOptionsItemSelected(r2)
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            boolean r2 = r0.m29123(r2)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public void performOptionsMenuClosed(@Yue.InterfaceC4410 android.view.Menu r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L14
            boolean r0 = r1.mHasMenu
            if (r0 == 0) goto Lf
            boolean r0 = r1.mMenuVisible
            if (r0 == 0) goto Lf
            r1.onOptionsMenuClosed(r2)
        Lf:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            r0.m29124(r2)
        L14:
            return
    }

    public void performPause() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29126()
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L10
            androidx.fragment.app.ۥ۟۟۠۠ r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.m29461(r1)
        L10:
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
            r0 = 6
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onPause()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L25
            return
        L25:
            Yue.ۥۢ۠ۤۦ r0 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onPause()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void performPictureInPictureModeChanged(boolean r1) {
            r0 = this;
            r0.onPictureInPictureModeChanged(r1)
            return
    }

    public boolean performPrepareOptionsMenu(@Yue.InterfaceC4410 android.view.Menu r3) {
            r2 = this;
            boolean r0 = r2.mHidden
            r1 = 0
            if (r0 != 0) goto L18
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L11
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L11
            r2.onPrepareOptionsMenu(r3)
            r1 = 1
        L11:
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            boolean r3 = r0.m29128(r3)
            r1 = r1 | r3
        L18:
            return r1
    }

    public void performPrimaryNavigationFragmentChanged() {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            boolean r0 = r0.m29179(r2)
            java.lang.Boolean r1 = r2.mIsPrimaryNavigationFragment
            if (r1 == 0) goto L10
            boolean r1 = r1.booleanValue()
            if (r1 == r0) goto L1e
        L10:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2.mIsPrimaryNavigationFragment = r1
            r2.onPrimaryNavigationFragmentChanged(r0)
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            r0.m29129()
        L1e:
            return
    }

    public void performResume() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29191()
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r1 = 1
            r0.m29140(r1)
            r0 = 7
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onResume()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L2e
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L28
            androidx.fragment.app.ۥ۟۟۠۠ r0 = r3.mViewLifecycleOwner
            r0.m29461(r1)
        L28:
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29130()
            return
        L2e:
            Yue.ۥۢ۠ۤۦ r0 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onResume()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void performSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            r0.onSaveInstanceState(r1)
            return
    }

    public void performStart() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29191()
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r1 = 1
            r0.m29140(r1)
            r0 = 5
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onStart()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L2e
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L28
            androidx.fragment.app.ۥ۟۟۠۠ r0 = r3.mViewLifecycleOwner
            r0.m29461(r1)
        L28:
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29131()
            return
        L2e:
            Yue.ۥۢ۠ۤۦ r0 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onStart()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void performStop() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.m29133()
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L10
            androidx.fragment.app.ۥ۟۟۠۠ r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.m29461(r1)
        L10:
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            r0 = 4
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onStop()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L25
            return
        L25:
            Yue.ۥۢ۠ۤۦ r0 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onStop()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void performViewCreated() {
            r2 = this;
            android.os.Bundle r0 = r2.mSavedFragmentState
            if (r0 == 0) goto Lb
            java.lang.String r1 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r1 = r2.mView
            r2.onViewCreated(r1, r0)
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            r0.m29134()
            return
    }

    public void postponeEnterTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r2.m29048()
            r1 = 1
            r0.f29160 = r1
            return
    }

    public final void postponeEnterTransition(long r3, @Yue.InterfaceC4410 java.util.concurrent.TimeUnit r5) {
            r2 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r2.m29048()
            r1 = 1
            r0.f29160 = r1
            android.os.Handler r0 = r2.mPostponedHandler
            if (r0 == 0) goto L10
            java.lang.Runnable r1 = r2.mPostponedDurationRunnable
            r0.removeCallbacks(r1)
        L10:
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L1f
            Yue.ۥ۠ۢۨ r0 = r0.m29163()
            android.os.Handler r0 = r0.m12115()
            r2.mPostponedHandler = r0
            goto L2a
        L1f:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mPostponedHandler = r0
        L2a:
            android.os.Handler r0 = r2.mPostponedHandler
            java.lang.Runnable r1 = r2.mPostponedDurationRunnable
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r2.mPostponedHandler
            java.lang.Runnable r1 = r2.mPostponedDurationRunnable
            long r3 = r5.toMillis(r3)
            r0.postDelayed(r1, r3)
            return
    }

    @Override // Yue.InterfaceC0220
    @Yue.InterfaceC4410
    @Yue.InterfaceC3875
    public final <I, O> Yue.AbstractC0254<I> registerForActivityResult(@Yue.InterfaceC4410 Yue.AbstractC0221<I, O> r2, @Yue.InterfaceC4410 Yue.InterfaceC0219<O> r3) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۡ r0 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۡ
            r0.<init>(r1)
            Yue.ۥ۟۟ۨۦ r2 = r1.m29053(r2, r0, r3)
            return r2
    }

    @Override // Yue.InterfaceC0220
    @Yue.InterfaceC4410
    @Yue.InterfaceC3875
    public final <I, O> Yue.AbstractC0254<I> registerForActivityResult(@Yue.InterfaceC4410 Yue.AbstractC0221<I, O> r2, @Yue.InterfaceC4410 androidx.activity.result.ActivityResultRegistry r3, @Yue.InterfaceC4410 Yue.InterfaceC0219<O> r4) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۢ r0 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۢ
            r0.<init>(r1, r3)
            Yue.ۥ۟۟ۨۦ r2 = r1.m29053(r2, r0, r4)
            return r2
    }

    public void registerForContextMenu(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            r1.setOnCreateContextMenuListener(r0)
            return
    }

    @java.lang.Deprecated
    public final void requestPermissions(@Yue.InterfaceC4410 java.lang.String[] r2, int r3) {
            r1 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r1.mHost
            if (r0 == 0) goto Lc
            androidx.fragment.app.FragmentManager r0 = r1.getParentFragmentManager()
            r0.m29187(r1, r2, r3)
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Fragment "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " not attached to Activity"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC4410
    public final androidx.fragment.app.FragmentActivity requireActivity() {
            r3 = this;
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " not attached to an activity."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4410
    public final android.os.Bundle requireArguments() {
            r3 = this;
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " does not have any arguments."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4410
    public final android.content.Context requireContext() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " not attached to a context."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManager requireFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.getParentFragmentManager()
            return r0
    }

    @Yue.InterfaceC4410
    public final java.lang.Object requireHost() {
            r3 = this;
            java.lang.Object r0 = r3.getHost()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " not attached to a host."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4410
    public final androidx.fragment.app.Fragment requireParentFragment() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.getParentFragment()
            if (r0 != 0) goto L49
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "Fragment "
            if (r0 != 0) goto L28
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = " is not attached to any Fragment or host"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = " is not a child Fragment, it is directly attached to "
            r2.append(r1)
            android.content.Context r1 = r3.getContext()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L49:
            return r0
    }

    @Yue.InterfaceC4410
    public final android.view.View requireView() {
            r3 = this;
            android.view.View r0 = r3.getView()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not return a View from onCreateView() or this was called before onCreateView()."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void restoreChildFragmentState() {
            r2 = this;
            android.os.Bundle r0 = r2.mSavedFragmentState
            if (r0 == 0) goto L16
            java.lang.String r1 = "childFragmentManager"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 == 0) goto L16
            androidx.fragment.app.FragmentManager r1 = r2.mChildFragmentManager
            r1.m29216(r0)
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            r0.m29115()
        L16:
            return
    }

    public final void restoreViewState(android.os.Bundle r3) {
            r2 = this;
            android.util.SparseArray<android.os.Parcelable> r0 = r2.mSavedViewState
            if (r0 == 0) goto Lc
            android.view.View r1 = r2.mView
            r1.restoreHierarchyState(r0)
            r0 = 0
            r2.mSavedViewState = r0
        Lc:
            r0 = 0
            r2.mCalled = r0
            r2.onViewStateRestored(r3)
            boolean r3 = r2.mCalled
            if (r3 == 0) goto L22
            android.view.View r3 = r2.mView
            if (r3 == 0) goto L21
            androidx.fragment.app.ۥ۟۟۠۠ r3 = r2.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r3.m29461(r0)
        L21:
            return
        L22:
            Yue.ۥۢ۠ۤۦ r3 = new Yue.ۥۢ۠ۤۦ
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " did not call through to super.onViewStateRestored()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void setAllowEnterTransitionOverlap(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.f29155 = r2
            return
    }

    public void setAllowReturnTransitionOverlap(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.f29154 = r2
            return
    }

    public void setAnimations(@Yue.InterfaceC0353 int r2, @Yue.InterfaceC0353 int r3, @Yue.InterfaceC0353 int r4, @Yue.InterfaceC0353 int r5) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            if (r3 != 0) goto Ld
            if (r4 != 0) goto Ld
            if (r5 != 0) goto Ld
            return
        Ld:
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29141 = r2
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r2 = r1.m29048()
            r2.f29142 = r3
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r2 = r1.m29048()
            r2.f29143 = r4
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r2 = r1.m29048()
            r2.f29144 = r5
            return
    }

    public void setArguments(@Yue.InterfaceC4544 android.os.Bundle r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 == 0) goto L13
            boolean r0 = r1.isStateSaved()
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added and state has been saved"
            r2.<init>(r0)
            throw r2
        L13:
            r1.mArguments = r2
            return
    }

    public void setEnterSharedElementCallback(@Yue.InterfaceC4544 Yue.AbstractC5739 r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29156 = r2
            return
    }

    public void setEnterTransition(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29148 = r2
            return
    }

    public void setExitSharedElementCallback(@Yue.InterfaceC4544 Yue.AbstractC5739 r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29157 = r2
            return
    }

    public void setExitTransition(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29150 = r2
            return
    }

    public void setFocusedView(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29159 = r2
            return
    }

    @java.lang.Deprecated
    public void setHasOptionsMenu(boolean r2) {
            r1 = this;
            boolean r0 = r1.mHasMenu
            if (r0 == r2) goto L17
            r1.mHasMenu = r2
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L17
            boolean r2 = r1.isHidden()
            if (r2 != 0) goto L17
            Yue.ۥ۠ۢۨ<?> r2 = r1.mHost
            r2.mo12127()
        L17:
            return
    }

    public void setInitialSavedState(@Yue.InterfaceC4544 androidx.fragment.app.Fragment.C7570 r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 != 0) goto Lf
            if (r2 == 0) goto Lb
            android.os.Bundle r2 = r2.f29161
            if (r2 == 0) goto Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.mSavedFragmentState = r2
            return
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added"
            r2.<init>(r0)
            throw r2
    }

    public void setMenuVisibility(boolean r2) {
            r1 = this;
            boolean r0 = r1.mMenuVisible
            if (r0 == r2) goto L1b
            r1.mMenuVisible = r2
            boolean r2 = r1.mHasMenu
            if (r2 == 0) goto L1b
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L1b
            boolean r2 = r1.isHidden()
            if (r2 != 0) goto L1b
            Yue.ۥ۠ۢۨ<?> r2 = r1.mHost
            r2.mo12127()
        L1b:
            return
    }

    public void setNextTransition(int r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L7
            if (r2 != 0) goto L7
            return
        L7:
            r1.m29048()
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            r0.f29145 = r2
            return
    }

    public void setPopDirection(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto L5
            return
        L5:
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29140 = r2
            return
    }

    public void setPostOnViewCreatedAlpha(float r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29158 = r2
            return
    }

    public void setReenterTransition(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29151 = r2
            return
    }

    @java.lang.Deprecated
    public void setRetainInstance(boolean r2) {
            r1 = this;
            Yue.C2779.m12159(r1)
            r1.mRetainInstance = r2
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 == 0) goto L13
            if (r2 == 0) goto Lf
            r0.m29096(r1)
            goto L16
        Lf:
            r0.m29210(r1)
            goto L16
        L13:
            r2 = 1
            r1.mRetainInstanceChangedWhileDetached = r2
        L16:
            return
    }

    public void setReturnTransition(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29149 = r2
            return
    }

    public void setSharedElementEnterTransition(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29152 = r2
            return
    }

    public void setSharedElementNames(@Yue.InterfaceC4544 java.util.ArrayList<java.lang.String> r2, @Yue.InterfaceC4544 java.util.ArrayList<java.lang.String> r3) {
            r1 = this;
            r1.m29048()
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            r0.f29146 = r2
            r0.f29147 = r3
            return
    }

    public void setSharedElementReturnTransition(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.m29048()
            r0.f29153 = r2
            return
    }

    @java.lang.Deprecated
    public void setTargetFragment(@Yue.InterfaceC4544 androidx.fragment.app.Fragment r4, int r5) {
            r3 = this;
            if (r4 == 0) goto L5
            Yue.C2779.m12160(r3, r4, r5)
        L5:
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            r1 = 0
            if (r4 == 0) goto Ld
            androidx.fragment.app.FragmentManager r2 = r4.mFragmentManager
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r0 == 0) goto L31
            if (r2 == 0) goto L31
            if (r0 != r2) goto L15
            goto L31
        L15:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " must share the same FragmentManager to be set as a target fragment"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L31:
            r0 = r4
        L32:
            if (r0 == 0) goto L64
            boolean r2 = r0.equals(r3)
            if (r2 != 0) goto L40
            r2 = 0
            androidx.fragment.app.Fragment r0 = r0.m29050(r2)
            goto L32
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Setting "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " as the target of "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = " would create a target cycle"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L64:
            if (r4 != 0) goto L6b
            r3.mTargetWho = r1
            r3.mTarget = r1
            goto L7e
        L6b:
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L7a
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L7a
            java.lang.String r4 = r4.mWho
            r3.mTargetWho = r4
            r3.mTarget = r1
            goto L7e
        L7a:
            r3.mTargetWho = r1
            r3.mTarget = r4
        L7e:
            r3.mTargetRequestCode = r5
            return
    }

    @java.lang.Deprecated
    public void setUserVisibleHint(boolean r4) {
            r3 = this;
            Yue.C2779.m12161(r3, r4)
            boolean r0 = r3.mUserVisibleHint
            r1 = 5
            if (r0 != 0) goto L25
            if (r4 == 0) goto L25
            int r0 = r3.mState
            if (r0 >= r1) goto L25
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L25
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L25
            boolean r0 = r3.mIsCreated
            if (r0 == 0) goto L25
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = r0.m29109(r3)
            r0.m29194(r2)
        L25:
            r3.mUserVisibleHint = r4
            int r0 = r3.mState
            if (r0 >= r1) goto L2f
            if (r4 != 0) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            r3.mDeferStart = r0
            android.os.Bundle r0 = r3.mSavedFragmentState
            if (r0 == 0) goto L3c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.mSavedUserVisibleHint = r4
        L3c:
            return
    }

    public boolean shouldShowRequestPermissionRationale(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r1.mHost
            if (r0 == 0) goto L9
            boolean r2 = r0.mo12123(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void startActivity(@Yue.InterfaceC4410 android.content.Intent r2) {
            r1 = this;
            r0 = 0
            r1.startActivity(r2, r0)
            return
    }

    public void startActivity(@Yue.InterfaceC4410 android.content.Intent r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
            r2 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r2.mHost
            if (r0 == 0) goto L9
            r1 = -1
            r0.m12125(r2, r3, r1, r4)
            return
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Fragment "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " not attached to Activity"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @java.lang.Deprecated
    public void startActivityForResult(@Yue.InterfaceC4410 android.content.Intent r2, int r3) {
            r1 = this;
            r0 = 0
            r1.startActivityForResult(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public void startActivityForResult(@Yue.InterfaceC4410 android.content.Intent r2, int r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
            r1 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r1.mHost
            if (r0 == 0) goto Lc
            androidx.fragment.app.FragmentManager r0 = r1.getParentFragmentManager()
            r0.m29188(r1, r2, r3, r4)
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Fragment "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " not attached to Activity"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @java.lang.Deprecated
    public void startIntentSenderForResult(@Yue.InterfaceC4410 android.content.IntentSender r11, int r12, @Yue.InterfaceC4544 android.content.Intent r13, int r14, int r15, int r16, @Yue.InterfaceC4544 android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r10 = this;
            r9 = r10
            Yue.ۥ۠ۢۨ<?> r0 = r9.mHost
            java.lang.String r1 = "Fragment "
            if (r0 == 0) goto L5f
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " received the following in startIntentSenderForResult() requestCode: "
            r0.append(r1)
            r3 = r12
            r0.append(r12)
            java.lang.String r1 = " IntentSender: "
            r0.append(r1)
            r2 = r11
            r0.append(r11)
            java.lang.String r1 = " fillInIntent: "
            r0.append(r1)
            r4 = r13
            r0.append(r13)
            java.lang.String r1 = " options: "
            r0.append(r1)
            r8 = r17
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
            goto L4d
        L48:
            r2 = r11
            r3 = r12
            r4 = r13
            r8 = r17
        L4d:
            androidx.fragment.app.FragmentManager r0 = r10.getParentFragmentManager()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.m29189(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " not attached to Activity"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    public void startPostponedEnterTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r2.mAnimationInfo
            if (r0 == 0) goto L3c
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r2.m29048()
            boolean r0 = r0.f29160
            if (r0 != 0) goto Ld
            goto L3c
        Ld:
            Yue.ۥ۠ۢۨ<?> r0 = r2.mHost
            if (r0 != 0) goto L19
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r2.m29048()
            r1 = 0
            r0.f29160 = r1
            goto L3c
        L19:
            android.os.Looper r0 = android.os.Looper.myLooper()
            Yue.ۥ۠ۢۨ<?> r1 = r2.mHost
            android.os.Handler r1 = r1.m12115()
            android.os.Looper r1 = r1.getLooper()
            if (r0 == r1) goto L38
            Yue.ۥ۠ۢۨ<?> r0 = r2.mHost
            android.os.Handler r0 = r0.m12115()
            androidx.fragment.app.Fragment$ۥ۟۟۟ r1 = new androidx.fragment.app.Fragment$ۥ۟۟۟
            r1.<init>(r2)
            r0.postAtFrontOfQueue(r1)
            goto L3c
        L38:
            r0 = 1
            r2.callStartTransitionListener(r0)
        L3c:
            return
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r2.mWho
            r0.append(r1)
            int r1 = r2.mFragmentId
            if (r1 == 0) goto L43
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.mFragmentId
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L43:
            java.lang.String r1 = r2.mTag
            if (r1 == 0) goto L51
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r1 = r2.mTag
            r0.append(r1)
        L51:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void unregisterForContextMenu(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            r0 = 0
            r2.setOnCreateContextMenuListener(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.fragment.app.Fragment.C7566 m29048() {
            r1 = this;
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            if (r0 != 0) goto Lb
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = new androidx.fragment.app.Fragment$ۥ۟۟۟ۤ
            r0.<init>()
            r1.mAnimationInfo = r0
        Lb:
            androidx.fragment.app.Fragment$ۥ۟۟۟ۤ r0 = r1.mAnimationInfo
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m29049() {
            r2 = this;
            androidx.lifecycle.Lifecycle$State r0 = r2.mMaxState
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1a
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            if (r1 != 0) goto Lb
            goto L1a
        Lb:
            int r0 = r0.ordinal()
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            int r1 = r1.m29049()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L1a:
            int r0 = r0.ordinal()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final androidx.fragment.app.Fragment m29050(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            Yue.C2779.m12158(r1)
        L5:
            androidx.fragment.app.Fragment r2 = r1.mTarget
            if (r2 == 0) goto La
            return r2
        La:
            androidx.fragment.app.FragmentManager r2 = r1.mFragmentManager
            if (r2 == 0) goto L17
            java.lang.String r0 = r1.mTargetWho
            if (r0 == 0) goto L17
            androidx.fragment.app.Fragment r2 = r2.m29144(r0)
            return r2
        L17:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m29051() {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r2)
            r2.mLifecycleRegistry = r0
            Yue.ۥۡۧۤۡ r0 = Yue.C5502.m20695(r2)
            r2.mSavedStateRegistryController = r0
            r0 = 0
            r2.mDefaultFactory = r0
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۧ> r0 = r2.mOnPreAttachedListeners
            androidx.fragment.app.Fragment$ۥ۟۟۟ۧ r1 = r2.mSavedStateAttachListener
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1f
            androidx.fragment.app.Fragment$ۥ۟۟۟ۧ r0 = r2.mSavedStateAttachListener
            r2.m29054(r0)
        L1f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ void m29052() {
            r2 = this;
            androidx.fragment.app.ۥ۟۟۠۠ r0 = r2.mViewLifecycleOwner
            android.os.Bundle r1 = r2.mSavedViewRegistryState
            r0.m29464(r1)
            r0 = 0
            r2.mSavedViewRegistryState = r0
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final <I, O> Yue.AbstractC0254<I> m29053(@Yue.InterfaceC4410 Yue.AbstractC0221<I, O> r9, @Yue.InterfaceC4410 Yue.InterfaceC2848<java.lang.Void, androidx.activity.result.ActivityResultRegistry> r10, @Yue.InterfaceC4410 Yue.InterfaceC0219<O> r11) {
            r8 = this;
            int r0 = r8.mState
            r1 = 1
            if (r0 > r1) goto L1e
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            androidx.fragment.app.Fragment$ۥۣ۟۟۟ r1 = new androidx.fragment.app.Fragment$ۥۣ۟۟۟
            r2 = r1
            r3 = r8
            r4 = r10
            r5 = r0
            r6 = r9
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r8.m29054(r1)
            androidx.fragment.app.Fragment$ۥ r10 = new androidx.fragment.app.Fragment$ۥ
            r10.<init>(r8, r0, r9)
            return r10
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Fragment "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m29054(@Yue.InterfaceC4410 androidx.fragment.app.Fragment.AbstractC7569 r2) {
            r1 = this;
            int r0 = r1.mState
            if (r0 < 0) goto L8
            r2.mo29056()
            goto Ld
        L8:
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۧ> r0 = r1.mOnPreAttachedListeners
            r0.add(r2)
        Ld:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m29055() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESTORE_VIEW_STATE: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            android.view.View r0 = r3.mView
            r1 = 0
            if (r0 == 0) goto L31
            android.os.Bundle r0 = r3.mSavedFragmentState
            if (r0 == 0) goto L2d
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r2)
            goto L2e
        L2d:
            r0 = r1
        L2e:
            r3.restoreViewState(r0)
        L31:
            r3.mSavedFragmentState = r1
            return
    }
}
