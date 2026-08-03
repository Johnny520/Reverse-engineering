package androidx.fragment.app;

import Yue.AbstractC3115;
import Yue.AbstractC3138;
import Yue.AbstractC5076;
import Yue.AbstractC5078;
import Yue.AbstractC5748;
import Yue.AbstractC7430;
import Yue.C3105;
import Yue.C5084;
import Yue.C5093;
import Yue.C5681;
import Yue.C7234;
import Yue.C7676;
import Yue.C8365;
import Yue.InterfaceC3113;
import Yue.InterfaceC3114;
import Yue.InterfaceC3139;
import Yue.InterfaceC3218;
import Yue.InterfaceC3647;
import Yue.InterfaceC4183;
import Yue.InterfaceC5147;
import Yue.InterfaceC5683;
import Yue.InterfaceC5922;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7235;
import Yue.InterfaceC7613;
import Yue.InterfaceC8086;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.C9041ViewTreeViewModelStoreOwner;
import android.view.ContextMenu;
import android.view.HasDefaultViewModelProviderFactory;
import android.view.LayoutInflater;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.LifecycleRegistry;
import android.view.LiveData;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MutableLiveData;
import android.view.SavedStateHandleSupport;
import android.view.SavedStateViewModelFactory;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewModelProvider;
import android.view.ViewModelStore;
import android.view.ViewModelStoreOwner;
import android.view.animation.Animation;
import android.view.viewmodel.CreationExtras;
import android.view.viewmodel.MutableCreationExtras;
import androidx.activity.result.ActivityResultRegistry;
import androidx.savedstate.C1794;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, InterfaceC7235, InterfaceC3114 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C8841 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @InterfaceC6391
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;

    @InterfaceC5683
    private int mContentLayoutId;
    ViewModelProvider.Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC5078<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC8844> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final AbstractC8844 mSavedStateAttachListener;
    C7234 mSavedStateRegistryController;

    @InterfaceC6490
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;

    @InterfaceC6490
    C8886 mViewLifecycleOwner;
    MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;

    @InterfaceC6391
    String mWho;

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ */
    public class C1679<I> extends AbstractC3138<I> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ AtomicReference f3790;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AbstractC3115 f3791;

        public C1679(AtomicReference atomicReference, AbstractC3115 abstractC3115) {
            this.f3790 = atomicReference;
            this.f3791 = abstractC3115;
        }

        @Override // Yue.AbstractC3138
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public AbstractC3115<I, ?> mo227() {
            return this.f3791;
        }

        @Override // Yue.AbstractC3138
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo6415(I i, @InterfaceC6490 C3105 c3105) {
            AbstractC3138 abstractC3138 = (AbstractC3138) this.f3790.get();
            if (abstractC3138 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC3138.mo6415(i, c3105);
        }

        @Override // Yue.AbstractC3138
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo6416() {
            AbstractC3138 abstractC3138 = (AbstractC3138) this.f3790.getAndSet(null);
            if (abstractC3138 != null) {
                abstractC3138.mo6416();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟ */
    public class RunnableC1680 implements Runnable {
        public RunnableC1680() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟, reason: contains not printable characters */
    public class C8834 extends AbstractC8844 {
        public C8834() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.AbstractC8844
        /* JADX INFO: renamed from: ۥ */
        public void mo4806() {
            Fragment.this.mSavedStateRegistryController.m22640();
            SavedStateHandleSupport.enableSavedStateHandles(Fragment.this);
            Bundle bundle = Fragment.this.mSavedFragmentState;
            Fragment.this.mSavedStateRegistryController.m22641(bundle != null ? bundle.getBundle(C8882.f29748) : null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟, reason: contains not printable characters */
    public class RunnableC8835 implements Runnable {
        public RunnableC8835() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟۟, reason: contains not printable characters */
    public class RunnableC8836 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ AbstractC8887 f29574;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC8836(AbstractC8887 abstractC8887) {
            this.f29574 = abstractC8887;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29574.m30082();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C8837 extends AbstractC5076 {
        public C8837() {
        }

        @Override // Yue.AbstractC5076
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ */
        public View mo15627(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // Yue.AbstractC5076
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo15628() {
            return Fragment.this.mView != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C8838 implements InterfaceC5147<Void, ActivityResultRegistry> {
        public C8838() {
        }

        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5147
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r3) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof InterfaceC3139 ? ((InterfaceC3139) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C8839 implements InterfaceC5147<Void, ActivityResultRegistry> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ ActivityResultRegistry f3794;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C8839(ActivityResultRegistry activityResultRegistry) {
            this.f3794 = activityResultRegistry;
        }

        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5147
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r1) {
            return this.f3794;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥۣ۟۟۟, reason: contains not printable characters */
    public class C8840 extends AbstractC8844 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5147 f3796;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AtomicReference f3797;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ AbstractC3115 f29577;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC3113 f29578;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8840(InterfaceC5147 interfaceC5147, AtomicReference atomicReference, AbstractC3115 abstractC3115, InterfaceC3113 interfaceC3113) {
            super(null);
            this.f3796 = interfaceC5147;
            this.f3797 = atomicReference;
            this.f29577 = abstractC3115;
            this.f29578 = interfaceC3113;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC8844
        /* JADX INFO: renamed from: ۥ */
        public void mo4806() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f3797.set(((ActivityResultRegistry) this.f3796.apply(null)).m28657(strGenerateActivityResultKey, Fragment.this, this.f29577, this.f29578));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C8841 {

        /* JADX INFO: renamed from: ۥ */
        public View f3798;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f3799;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC3218
        public int f29580;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC3218
        public int f29581;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC3218
        public int f29582;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC3218
        public int f29583;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f29584;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public ArrayList<String> f29585;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public ArrayList<String> f29586;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public Object f29587 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public Object f29588;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public Object f29589;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public Object f29590;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public Object f29591;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public Object f29592;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public Boolean f29593;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public Boolean f29594;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public AbstractC7430 f29595;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public AbstractC7430 f29596;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public float f29597;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public View f29598;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f29599;

        public C8841() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f29588 = obj;
            this.f29589 = null;
            this.f29590 = obj;
            this.f29591 = null;
            this.f29592 = obj;
            this.f29595 = null;
            this.f29596 = null;
            this.f29597 = 1.0f;
            this.f29598 = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC7113(19)
    public static class C8842 {
        /* JADX INFO: renamed from: ۥ */
        public static void m4809(@InterfaceC6391 View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C8843 extends RuntimeException {
        public C8843(@InterfaceC6391 String str, @InterfaceC6490 Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static abstract class AbstractC8844 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC8844() {
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract void mo4806();

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: androidx.fragment.app.Fragment.ۥ۟۟۟ۧ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ AbstractC8844(RunnableC1680 runnableC1680) {
            this();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C5084();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC1680();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C8834();
        m29708();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    @Deprecated
    public static Fragment instantiate(@InterfaceC6391 Context context, @InterfaceC6391 String str) {
        return instantiate(context, str, null);
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 != null) {
            c8841.f29599 = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        AbstractC8887 abstractC8887M30076 = AbstractC8887.m30076(viewGroup, fragmentManager);
        abstractC8887M30076.m30089();
        if (z) {
            this.mHost.m15671().post(new RunnableC8836(abstractC8887M30076));
        } else {
            abstractC8887M30076.m30082();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @InterfaceC6391
    public AbstractC5076 createFragmentContainer() {
        return new C8837();
    }

    public void dump(@InterfaceC6391 String str, @InterfaceC6490 FileDescriptor fileDescriptor, @InterfaceC6391 PrintWriter printWriter, @InterfaceC6490 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment fragmentM29707 = m29707(false);
        if (fragmentM29707 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentM29707);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC5748.m17830(this).mo2426(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m29785(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@InterfaceC6490 Object obj) {
        return super.equals(obj);
    }

    @InterfaceC6490
    public Fragment findFragmentByWho(@InterfaceC6391 String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m29797(str);
    }

    @InterfaceC6391
    public String generateActivityResultKey() {
        return FragmentManager.f29609 + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @InterfaceC6490
    public final FragmentActivity getActivity() {
        AbstractC5078<?> abstractC5078 = this.mHost;
        if (abstractC5078 == null) {
            return null;
        }
        return (FragmentActivity) abstractC5078.m15669();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null || (bool = c8841.f29594) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null || (bool = c8841.f29593) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return null;
        }
        return c8841.f3798;
    }

    @InterfaceC6490
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @InterfaceC6391
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @InterfaceC6490
    public Context getContext() {
        AbstractC5078<?> abstractC5078 = this.mHost;
        if (abstractC5078 == null) {
            return null;
        }
        return abstractC5078.m15670();
    }

    @Override // android.view.HasDefaultViewModelProviderFactory
    @InterfaceC6391
    @InterfaceC3647
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // android.view.HasDefaultViewModelProviderFactory
    @InterfaceC6391
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.m29739(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new SavedStateViewModelFactory(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @InterfaceC3218
    public int getEnterAnim() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return 0;
        }
        return c8841.f29580;
    }

    @InterfaceC6490
    public Object getEnterTransition() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return null;
        }
        return c8841.f29587;
    }

    public AbstractC7430 getEnterTransitionCallback() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return null;
        }
        return c8841.f29595;
    }

    @InterfaceC3218
    public int getExitAnim() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return 0;
        }
        return c8841.f29581;
    }

    @InterfaceC6490
    public Object getExitTransition() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return null;
        }
        return c8841.f29589;
    }

    public AbstractC7430 getExitTransitionCallback() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return null;
        }
        return c8841.f29596;
    }

    public View getFocusedView() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return null;
        }
        return c8841.f29598;
    }

    @InterfaceC6490
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @InterfaceC6490
    public final Object getHost() {
        AbstractC5078<?> abstractC5078 = this.mHost;
        if (abstractC5078 == null) {
            return null;
        }
        return abstractC5078.mo15673();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // android.view.LifecycleOwner
    @InterfaceC6391
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @InterfaceC6391
    @Deprecated
    public AbstractC5748 getLoaderManager() {
        return AbstractC5748.m17830(this);
    }

    public int getNextTransition() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return 0;
        }
        return c8841.f29584;
    }

    @InterfaceC6490
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @InterfaceC6391
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return false;
        }
        return c8841.f3799;
    }

    @InterfaceC3218
    public int getPopEnterAnim() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return 0;
        }
        return c8841.f29582;
    }

    @InterfaceC3218
    public int getPopExitAnim() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return 0;
        }
        return c8841.f29583;
    }

    public float getPostOnViewCreatedAlpha() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return 1.0f;
        }
        return c8841.f29597;
    }

    @InterfaceC6490
    public Object getReenterTransition() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return null;
        }
        Object obj = c8841.f29590;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @InterfaceC6391
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C5093.m15702(this);
        return this.mRetainInstance;
    }

    @InterfaceC6490
    public Object getReturnTransition() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return null;
        }
        Object obj = c8841.f29588;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // Yue.InterfaceC7235
    @InterfaceC6391
    public final C1794 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m3518();
    }

    @InterfaceC6490
    public Object getSharedElementEnterTransition() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return null;
        }
        return c8841.f29591;
    }

    @InterfaceC6490
    public Object getSharedElementReturnTransition() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return null;
        }
        Object obj = c8841.f29592;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @InterfaceC6391
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C8841 c8841 = this.mAnimationInfo;
        return (c8841 == null || (arrayList = c8841.f29585) == null) ? new ArrayList<>() : arrayList;
    }

    @InterfaceC6391
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C8841 c8841 = this.mAnimationInfo;
        return (c8841 == null || (arrayList = c8841.f29586) == null) ? new ArrayList<>() : arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public final String getString(@InterfaceC7613 int i) {
        return getResources().getString(i);
    }

    @InterfaceC6490
    public final String getTag() {
        return this.mTag;
    }

    @InterfaceC6490
    @Deprecated
    public final Fragment getTargetFragment() {
        return m29707(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C5093.m15703(this);
        return this.mTargetRequestCode;
    }

    @InterfaceC6391
    public final CharSequence getText(@InterfaceC7613 int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @InterfaceC6490
    public View getView() {
        return this.mView;
    }

    @InterfaceC6391
    @InterfaceC5922
    public LifecycleOwner getViewLifecycleOwner() {
        C8886 c8886 = this.mViewLifecycleOwner;
        if (c8886 != null) {
            return c8886;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @InterfaceC6391
    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // android.view.ViewModelStoreOwner
    @InterfaceC6391
    public ViewModelStore getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m29706() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.m29819(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        m29708();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C5084();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.m29826(this.mParentFragment));
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.m29827(this.mParentFragment));
    }

    public boolean isPostponed() {
        C8841 c8841 = this.mAnimationInfo;
        if (c8841 == null) {
            return false;
        }
        return c8841.f29599;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m29830();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m29840();
    }

    @InterfaceC3647
    @InterfaceC5922
    @Deprecated
    public void onActivityCreated(@InterfaceC6490 Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @InterfaceC6490 Intent intent) {
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3647
    @InterfaceC5922
    public void onAttach(@InterfaceC6391 Context context) {
        this.mCalled = true;
        AbstractC5078<?> abstractC5078 = this.mHost;
        Activity activityM15669 = abstractC5078 == null ? null : abstractC5078.m15669();
        if (activityM15669 != null) {
            this.mCalled = false;
            onAttach(activityM15669);
        }
    }

    @InterfaceC5922
    @Deprecated
    public void onAttachFragment(@InterfaceC6391 Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC3647
    public void onConfigurationChanged(@InterfaceC6391 Configuration configuration) {
        this.mCalled = true;
    }

    @InterfaceC5922
    public boolean onContextItemSelected(@InterfaceC6391 MenuItem menuItem) {
        return false;
    }

    @InterfaceC3647
    @InterfaceC5922
    public void onCreate(@InterfaceC6490 Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.m29829(1)) {
            return;
        }
        this.mChildFragmentManager.m29764();
    }

    @InterfaceC6490
    @InterfaceC5922
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @InterfaceC6490
    @InterfaceC5922
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @InterfaceC5922
    public void onCreateContextMenu(@InterfaceC6391 ContextMenu contextMenu, @InterfaceC6391 View view, @InterfaceC6490 ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @InterfaceC5922
    @Deprecated
    public void onCreateOptionsMenu(@InterfaceC6391 Menu menu, @InterfaceC6391 MenuInflater menuInflater) {
    }

    @InterfaceC6490
    @InterfaceC5922
    public View onCreateView(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, @InterfaceC6490 Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @InterfaceC3647
    @InterfaceC5922
    public void onDestroy() {
        this.mCalled = true;
    }

    @InterfaceC5922
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @InterfaceC3647
    @InterfaceC5922
    public void onDestroyView() {
        this.mCalled = true;
    }

    @InterfaceC3647
    @InterfaceC5922
    public void onDetach() {
        this.mCalled = true;
    }

    @InterfaceC6391
    public LayoutInflater onGetLayoutInflater(@InterfaceC6490 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @InterfaceC5922
    public void onHiddenChanged(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3647
    @InterfaceC8086
    public void onInflate(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Bundle bundle) {
        this.mCalled = true;
        AbstractC5078<?> abstractC5078 = this.mHost;
        Activity activityM15669 = abstractC5078 == null ? null : abstractC5078.m15669();
        if (activityM15669 != null) {
            this.mCalled = false;
            onInflate(activityM15669, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC3647
    @InterfaceC5922
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @InterfaceC5922
    @Deprecated
    public boolean onOptionsItemSelected(@InterfaceC6391 MenuItem menuItem) {
        return false;
    }

    @InterfaceC5922
    @Deprecated
    public void onOptionsMenuClosed(@InterfaceC6391 Menu menu) {
    }

    @InterfaceC3647
    @InterfaceC5922
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @InterfaceC5922
    @Deprecated
    public void onPrepareOptionsMenu(@InterfaceC6391 Menu menu) {
    }

    @InterfaceC5922
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @InterfaceC6391 String[] strArr, @InterfaceC6391 int[] iArr) {
    }

    @InterfaceC3647
    @InterfaceC5922
    public void onResume() {
        this.mCalled = true;
    }

    @InterfaceC5922
    public void onSaveInstanceState(@InterfaceC6391 Bundle bundle) {
    }

    @InterfaceC3647
    @InterfaceC5922
    public void onStart() {
        this.mCalled = true;
    }

    @InterfaceC3647
    @InterfaceC5922
    public void onStop() {
        this.mCalled = true;
    }

    @InterfaceC5922
    public void onViewCreated(@InterfaceC6391 View view, @InterfaceC6490 Bundle bundle) {
    }

    @InterfaceC3647
    @InterfaceC5922
    public void onViewStateRestored(@InterfaceC6490 Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m29840();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            m29712();
            this.mChildFragmentManager.m29760();
        } else {
            throw new C7676("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void performAttach() {
        Iterator<AbstractC8844> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo4806();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m29747(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m15670());
        if (this.mCalled) {
            this.mFragmentManager.m29770(this);
            this.mChildFragmentManager.m29761();
        } else {
            throw new C7676("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public void performConfigurationChanged(@InterfaceC6391 Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@InterfaceC6391 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m29763(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m29840();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.6
            @Override // android.view.LifecycleEventObserver
            public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
                View view;
                if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                C8842.m4809(view);
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new C7676("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(@InterfaceC6391 Menu menu, @InterfaceC6391 MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.m29765(menu, menuInflater);
    }

    public void performCreateView(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, @InterfaceC6490 Bundle bundle) {
        this.mChildFragmentManager.m29840();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C8886(this, getViewModelStore(), new Runnable() { // from class: Yue.ۥ۠ۢۧۢ
            @Override // java.lang.Runnable
            public final void run() {
                this.f12026.m29709();
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.m30069()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.m4856();
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        android.view.View.set(this.mView, this.mViewLifecycleOwner);
        C9041ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
        C8365.m4339(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m29766();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new C7676("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m29767();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.m4855(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC5748.m17830(this).mo17834();
            this.mPerformedCreateView = false;
        } else {
            throw new C7676("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.m29823()) {
                return;
            }
            this.mChildFragmentManager.m29766();
            this.mChildFragmentManager = new C5084();
            return;
        }
        throw new C7676("Fragment " + this + " did not call through to super.onDetach()");
    }

    @InterfaceC6391
    public LayoutInflater performGetLayoutInflater(@InterfaceC6490 Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(@InterfaceC6391 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m29772(menuItem);
    }

    public void performOptionsMenuClosed(@InterfaceC6391 Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m29773(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m29775();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4855(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new C7676("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(@InterfaceC6391 Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.m29777(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zM29828 = this.mFragmentManager.m29828(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM29828) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM29828);
            onPrimaryNavigationFragmentChanged(zM29828);
            this.mChildFragmentManager.m29778();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m29840();
        this.mChildFragmentManager.m29789(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C7676("Fragment " + this + " did not call through to super.onResume()");
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4855(event);
        }
        this.mChildFragmentManager.m29779();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.m29840();
        this.mChildFragmentManager.m29789(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C7676("Fragment " + this + " did not call through to super.onStart()");
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4855(event);
        }
        this.mChildFragmentManager.m29780();
    }

    public void performStop() {
        this.mChildFragmentManager.m29782();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4855(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new C7676("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle(C8882.f29747) : null);
        this.mChildFragmentManager.m29783();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void postponeEnterTransition() {
        m4805().f29599 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC3114
    @InterfaceC6391
    @InterfaceC5922
    public final <I, O> AbstractC3138<I> registerForActivityResult(@InterfaceC6391 AbstractC3115<I, O> abstractC3115, @InterfaceC6391 InterfaceC3113<O> interfaceC3113) {
        return m29710(abstractC3115, new C8838(), interfaceC3113);
    }

    public void registerForContextMenu(@InterfaceC6391 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@InterfaceC6391 String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().m29836(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @InterfaceC6391
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @InterfaceC6391
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @InterfaceC6391
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @InterfaceC6391
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @InterfaceC6391
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @InterfaceC6391
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @InterfaceC6391
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle(C8882.f29749)) == null) {
            return;
        }
        this.mChildFragmentManager.m29865(bundle);
        this.mChildFragmentManager.m29764();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m4855(Lifecycle.Event.ON_CREATE);
            }
        } else {
            throw new C7676("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        m4805().f29594 = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        m4805().f29593 = Boolean.valueOf(z);
    }

    public void setAnimations(@InterfaceC3218 int i, @InterfaceC3218 int i2, @InterfaceC3218 int i3, @InterfaceC3218 int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m4805().f29580 = i;
        m4805().f29581 = i2;
        m4805().f29582 = i3;
        m4805().f29583 = i4;
    }

    public void setArguments(@InterfaceC6490 Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@InterfaceC6490 AbstractC7430 abstractC7430) {
        m4805().f29595 = abstractC7430;
    }

    public void setEnterTransition(@InterfaceC6490 Object obj) {
        m4805().f29587 = obj;
    }

    public void setExitSharedElementCallback(@InterfaceC6490 AbstractC7430 abstractC7430) {
        m4805().f29596 = abstractC7430;
    }

    public void setExitTransition(@InterfaceC6490 Object obj) {
        m4805().f29589 = obj;
    }

    public void setFocusedView(View view) {
        m4805().f29598 = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo15683();
        }
    }

    public void setInitialSavedState(@InterfaceC6490 C8845 c8845) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c8845 == null || (bundle = c8845.f29600) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo15683();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        m4805();
        this.mAnimationInfo.f29584 = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m4805().f3799 = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        m4805().f29597 = f;
    }

    public void setReenterTransition(@InterfaceC6490 Object obj) {
        m4805().f29590 = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C5093.m15705(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.m29745(this);
        } else {
            fragmentManager.m29859(this);
        }
    }

    public void setReturnTransition(@InterfaceC6490 Object obj) {
        m4805().f29588 = obj;
    }

    public void setSharedElementEnterTransition(@InterfaceC6490 Object obj) {
        m4805().f29591 = obj;
    }

    public void setSharedElementNames(@InterfaceC6490 ArrayList<String> arrayList, @InterfaceC6490 ArrayList<String> arrayList2) {
        m4805();
        C8841 c8841 = this.mAnimationInfo;
        c8841.f29585 = arrayList;
        c8841.f29586 = arrayList2;
    }

    public void setSharedElementReturnTransition(@InterfaceC6490 Object obj) {
        m4805().f29592 = obj;
    }

    @Deprecated
    public void setTargetFragment(@InterfaceC6490 Fragment fragment, int i) {
        if (fragment != null) {
            C5093.m15706(this, fragment, i);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragmentM29707 = fragment; fragmentM29707 != null; fragmentM29707 = fragmentM29707.m29707(false)) {
            if (fragmentM29707.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        C5093.m15707(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.m29843(fragmentManager.m29758(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@InterfaceC6391 String str) {
        AbstractC5078<?> abstractC5078 = this.mHost;
        if (abstractC5078 != null) {
            return abstractC5078.mo15679(str);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void startActivity(@InterfaceC6391 Intent intent) {
        startActivity(intent, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void startActivityForResult(@InterfaceC6391 Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@InterfaceC6391 IntentSender intentSender, int i, @InterfaceC6490 Intent intent, int i2, int i3, int i4, @InterfaceC6490 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().m29838(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m4805().f29599) {
            return;
        }
        if (this.mHost == null) {
            m4805().f29599 = false;
        } else if (Looper.myLooper() != this.mHost.m15671().getLooper()) {
            this.mHost.m15671().postAtFrontOfQueue(new RunnableC8835());
        } else {
            callStartTransitionListener(true);
        }
    }

    @InterfaceC6391
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@InterfaceC6391 View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final C8841 m4805() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C8841();
        }
        return this.mAnimationInfo;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m29706() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.m29706());
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Fragment m29707(boolean z) {
        String str;
        if (z) {
            C5093.m15704(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.m29793(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m29708() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = C7234.m3517(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        m29711(this.mSavedStateAttachListener);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ void m29709() {
        this.mViewLifecycleOwner.m30070(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final <I, O> AbstractC3138<I> m29710(@InterfaceC6391 AbstractC3115<I, O> abstractC3115, @InterfaceC6391 InterfaceC5147<Void, ActivityResultRegistry> interfaceC5147, @InterfaceC6391 InterfaceC3113<O> interfaceC3113) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            m29711(new C8840(interfaceC5147, atomicReference, abstractC3115, interfaceC3113));
            return new C1679(atomicReference, abstractC3115);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m29711(@InterfaceC6391 AbstractC8844 abstractC8844) {
        if (this.mState >= 0) {
            abstractC8844.mo4806();
        } else {
            this.mOnPreAttachedListeners.add(abstractC8844);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m29712() {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle(C8882.f29747) : null);
        }
        this.mSavedFragmentState = null;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class C8845 implements Parcelable {

        @InterfaceC6391
        public static final Parcelable.Creator<C8845> CREATOR = new C1681();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Bundle f29600;

        /* JADX INFO: renamed from: androidx.fragment.app.Fragment$ۥ۟۟۟ۨ$ۥ */
        public class C1681 implements Parcelable.ClassLoaderCreator<C8845> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8845 createFromParcel(Parcel parcel) {
                return new C8845(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8845 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C8845(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public C8845[] newArray(int i) {
                return new C8845[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8845(Bundle bundle) {
            this.f29600 = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
            parcel.writeBundle(this.f29600);
        }

        public C8845(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f29600 = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    @Deprecated
    public static Fragment instantiate(@InterfaceC6391 Context context, @InterfaceC6391 String str, @InterfaceC6490 Bundle bundle) {
        try {
            Fragment fragmentNewInstance = C8876.m29964(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e) {
            throw new C8843("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C8843("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C8843("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C8843("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public final String getString(@InterfaceC7613 int i, @InterfaceC6490 Object... objArr) {
        return getResources().getString(i, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void postponeEnterTransition(long j, @InterfaceC6391 TimeUnit timeUnit) {
        m4805().f29599 = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.m29812().m15671();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC3114
    @InterfaceC6391
    @InterfaceC5922
    public final <I, O> AbstractC3138<I> registerForActivityResult(@InterfaceC6391 AbstractC3115<I, O> abstractC3115, @InterfaceC6391 ActivityResultRegistry activityResultRegistry, @InterfaceC6391 InterfaceC3113<O> interfaceC3113) {
        return m29710(abstractC3115, new C8839(activityResultRegistry), interfaceC3113);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void startActivity(@InterfaceC6391 Intent intent, @InterfaceC6490 Bundle bundle) {
        AbstractC5078<?> abstractC5078 = this.mHost;
        if (abstractC5078 != null) {
            abstractC5078.m15681(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public void startActivityForResult(@InterfaceC6391 Intent intent, int i, @InterfaceC6490 Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m29837(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@InterfaceC6490 Bundle bundle) {
        AbstractC5078<?> abstractC5078 = this.mHost;
        if (abstractC5078 != null) {
            LayoutInflater layoutInflaterMo15674 = abstractC5078.mo15674();
            C5681.m17588(layoutInflaterMo15674, this.mChildFragmentManager.m29813());
            return layoutInflaterMo15674;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @InterfaceC3647
    @InterfaceC5922
    @Deprecated
    public void onAttach(@InterfaceC6391 Activity activity) {
        this.mCalled = true;
    }

    @InterfaceC3647
    @InterfaceC8086
    @Deprecated
    public void onInflate(@InterfaceC6391 Activity activity, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Bundle bundle) {
        this.mCalled = true;
    }

    @InterfaceC4183
    public Fragment(@InterfaceC5683 int i) {
        this();
        this.mContentLayoutId = i;
    }
}
