package androidx.fragment.app;

import Yue.AbstractC5078;
import Yue.C4658;
import Yue.C5093;
import Yue.C6884;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Lifecycle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewModelStoreOwner;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC8887;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8882 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f29745 = "FragmentManager";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f29746 = "state";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f29747 = "savedInstanceState";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f29748 = "registryState";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f29749 = "childFragmentManager";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f29750 = "viewState";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f29751 = "viewRegistryState";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final String f29752 = "arguments";

    /* JADX INFO: renamed from: ۥ */
    public final C8878 f3836;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C8884 f3837;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final Fragment f29753;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f29754 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f29755 = -1;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۧ$ۥ */
    public class ViewOnAttachStateChangeListenerC1702 implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ View f29756;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ViewOnAttachStateChangeListenerC1702(View view) {
            this.f29756 = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f29756.removeOnAttachStateChangeListener(this);
            C8273.m27433(this.f29756);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۧ$ۥ۟ */
    public static /* synthetic */ class C1703 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3838;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f3838 = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3838[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3838[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3838[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8882(@InterfaceC6391 C8878 c8878, @InterfaceC6391 C8884 c8884, @InterfaceC6391 Fragment fragment) {
        this.f3836 = c8878;
        this.f3837 = c8884;
        this.f29753 = fragment;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4851() {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f29753);
        }
        Bundle bundle = this.f29753.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f29747) : null;
        this.f29753.performActivityCreated(bundle2);
        this.f3836.m4842(this.f29753, bundle2, false);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4852() {
        Fragment fragmentM29737 = FragmentManager.m29737(this.f29753.mContainer);
        Fragment parentFragment = this.f29753.getParentFragment();
        if (fragmentM29737 != null && !fragmentM29737.equals(parentFragment)) {
            Fragment fragment = this.f29753;
            C5093.m15709(fragment, fragmentM29737, fragment.mContainerId);
        }
        int iM30020 = this.f3837.m30020(this.f29753);
        Fragment fragment2 = this.f29753;
        fragment2.mContainer.addView(fragment2.mView, iM30020);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29992() {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f29753);
        }
        Fragment fragment = this.f29753;
        Fragment fragment2 = fragment.mTarget;
        C8882 c8882M30025 = null;
        if (fragment2 != null) {
            C8882 c8882M300252 = this.f3837.m30025(fragment2.mWho);
            if (c8882M300252 == null) {
                throw new IllegalStateException("Fragment " + this.f29753 + " declared target fragment " + this.f29753.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f29753;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            c8882M30025 = c8882M300252;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c8882M30025 = this.f3837.m30025(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f29753 + " declared target fragment " + this.f29753.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c8882M30025 != null) {
            c8882M30025.m30002();
        }
        Fragment fragment4 = this.f29753;
        fragment4.mHost = fragment4.mFragmentManager.m29812();
        Fragment fragment5 = this.f29753;
        fragment5.mParentFragment = fragment5.mFragmentManager.m29815();
        this.f3836.m29969(this.f29753, false);
        this.f29753.performAttach();
        this.f3836.m4843(this.f29753, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m29993() {
        Fragment fragment = this.f29753;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f29755;
        int i = C1703.f3838[fragment.mMaxState.ordinal()];
        if (i != 1) {
            iMin = i != 2 ? i != 3 ? i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f29753;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f29755, 2);
                View view = this.f29753.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f29755 < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f29753.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f29753;
        ViewGroup viewGroup = fragment3.mContainer;
        AbstractC8887.C8888.EnumC1707 enumC1707M30087 = viewGroup != null ? AbstractC8887.m30076(viewGroup, fragment3.getParentFragmentManager()).m30087(this) : null;
        if (enumC1707M30087 == AbstractC8887.C8888.EnumC1707.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (enumC1707M30087 == AbstractC8887.C8888.EnumC1707.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f29753;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f29753;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f29753);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29994() {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f29753);
        }
        Bundle bundle = this.f29753.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f29747) : null;
        Fragment fragment = this.f29753;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f3836.m29970(fragment, bundle2, false);
            this.f29753.performCreate(bundle2);
            this.f3836.m29965(this.f29753, bundle2, false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m29995() {
        String resourceName;
        if (this.f29753.mFromLayout) {
            return;
        }
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f29753);
        }
        Bundle bundle = this.f29753.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f29747) : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f29753.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f29753;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f29753 + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.m29806().mo15627(this.f29753.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f29753;
                    if (!fragment2.mRestored) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f29753.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = C4658.f1036;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f29753.mContainerId) + " (" + resourceName + ") for fragment " + this.f29753);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C5093.m15708(this.f29753, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f29753;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f29753.mView != null) {
            if (FragmentManager.m29739(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f29753);
            }
            this.f29753.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f29753;
            fragment4.mView.setTag(C6884.C6885.f2414, fragment4);
            if (viewGroup != null) {
                m4852();
            }
            Fragment fragment5 = this.f29753;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (C8273.m27397(this.f29753.mView)) {
                C8273.m27433(this.f29753.mView);
            } else {
                View view = this.f29753.mView;
                view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1702(view));
            }
            this.f29753.performViewCreated();
            C8878 c8878 = this.f3836;
            Fragment fragment6 = this.f29753;
            c8878.m29975(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f29753.mView.getVisibility();
            this.f29753.setPostOnViewCreatedAlpha(this.f29753.mView.getAlpha());
            Fragment fragment7 = this.f29753;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f29753.setFocusedView(viewFindFocus);
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f29753);
                    }
                }
                this.f29753.mView.setAlpha(0.0f);
            }
        }
        this.f29753.mState = 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m29996() {
        Fragment fragmentM30016;
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f29753);
        }
        Fragment fragment = this.f29753;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        if (z) {
            Fragment fragment2 = this.f29753;
            if (!fragment2.mBeingSaved) {
                this.f3837.m30039(fragment2.mWho, null);
            }
        }
        if (!z && !this.f3837.m30027().m29991(this.f29753)) {
            String str = this.f29753.mTargetWho;
            if (str != null && (fragmentM30016 = this.f3837.m30016(str)) != null && fragmentM30016.mRetainInstance) {
                this.f29753.mTarget = fragmentM30016;
            }
            this.f29753.mState = 0;
            return;
        }
        AbstractC5078<?> abstractC5078 = this.f29753.mHost;
        if (abstractC5078 instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = this.f3837.m30027().m29987();
        } else if (abstractC5078.m15670() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) abstractC5078.m15670()).isChangingConfigurations();
        }
        if ((z && !this.f29753.mBeingSaved) || zIsChangingConfigurations) {
            this.f3837.m30027().m4847(this.f29753);
        }
        this.f29753.performDestroy();
        this.f3836.m29966(this.f29753, false);
        for (C8882 c8882 : this.f3837.m30022()) {
            if (c8882 != null) {
                Fragment fragmentM30000 = c8882.m30000();
                if (this.f29753.mWho.equals(fragmentM30000.mTargetWho)) {
                    fragmentM30000.mTarget = this.f29753;
                    fragmentM30000.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f29753;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f3837.m30016(str2);
        }
        this.f3837.m30030(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m29997() {
        View view;
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f29753);
        }
        Fragment fragment = this.f29753;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f29753.performDestroyView();
        this.f3836.m29976(this.f29753, false);
        Fragment fragment2 = this.f29753;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f29753.mInLayout = false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m29998() {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f29753);
        }
        this.f29753.performDetach();
        this.f3836.m29967(this.f29753, false);
        Fragment fragment = this.f29753;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f3837.m30027().m29991(this.f29753)) {
            return;
        }
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f29753);
        }
        this.f29753.initState();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m29999() {
        Fragment fragment = this.f29753;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m29739(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f29753);
            }
            Bundle bundle = this.f29753.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle(f29747) : null;
            Fragment fragment2 = this.f29753;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f29753.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f29753;
                fragment3.mView.setTag(C6884.C6885.f2414, fragment3);
                Fragment fragment4 = this.f29753;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f29753.performViewCreated();
                C8878 c8878 = this.f3836;
                Fragment fragment5 = this.f29753;
                c8878.m29975(fragment5, fragment5.mView, bundle2, false);
                this.f29753.mState = 2;
            }
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Fragment m30000() {
        return this.f29753;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m30001(@InterfaceC6391 View view) {
        if (view == this.f29753.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f29753.mView) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m30002() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f29754) {
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m30000());
                return;
            }
            return;
        }
        try {
            this.f29754 = true;
            boolean z = false;
            while (true) {
                int iM29993 = m29993();
                Fragment fragment = this.f29753;
                int i = fragment.mState;
                if (iM29993 == i) {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f29753.mBeingSaved) {
                        if (FragmentManager.m29739(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f29753);
                        }
                        this.f3837.m30027().m4847(this.f29753);
                        this.f3837.m30030(this);
                        if (FragmentManager.m29739(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f29753);
                        }
                        this.f29753.initState();
                    }
                    Fragment fragment2 = this.f29753;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            AbstractC8887 abstractC8887M30076 = AbstractC8887.m30076(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f29753.mHidden) {
                                abstractC8887M30076.m30079(this);
                            } else {
                                abstractC8887M30076.m30081(this);
                            }
                        }
                        Fragment fragment3 = this.f29753;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.m29822(fragment3);
                        }
                        Fragment fragment4 = this.f29753;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f29753.mChildFragmentManager.m29771();
                    }
                    this.f29754 = false;
                    return;
                }
                if (iM29993 <= i) {
                    switch (i - 1) {
                        case -1:
                            m29998();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f3837.m30028(fragment.mWho) == null) {
                                this.f3837.m30039(this.f29753.mWho, m30007());
                            }
                            m29996();
                            break;
                        case 1:
                            m29997();
                            this.f29753.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.m29739(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f29753);
                            }
                            Fragment fragment5 = this.f29753;
                            if (fragment5.mBeingSaved) {
                                this.f3837.m30039(fragment5.mWho, m30007());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                m30008();
                            }
                            Fragment fragment6 = this.f29753;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                AbstractC8887.m30076(viewGroup2, fragment6.getParentFragmentManager()).m30080(this);
                            }
                            this.f29753.mState = 3;
                            break;
                        case 4:
                            m30011();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m30003();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m29992();
                            break;
                        case 1:
                            m29994();
                            break;
                        case 2:
                            m29999();
                            m29995();
                            break;
                        case 3:
                            m4851();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                AbstractC8887.m30076(viewGroup3, fragment.getParentFragmentManager()).m30078(AbstractC8887.C8888.EnumC1708.m30106(this.f29753.mView.getVisibility()), this);
                            }
                            this.f29753.mState = 4;
                            break;
                        case 5:
                            m30010();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m30005();
                            break;
                    }
                }
                z = true;
            }
        } catch (Throwable th) {
            this.f29754 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m30003() {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f29753);
        }
        this.f29753.performPause();
        this.f3836.m29968(this.f29753, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m30004(@InterfaceC6391 ClassLoader classLoader) {
        Bundle bundle = this.f29753.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f29753.mSavedFragmentState.getBundle(f29747) == null) {
            this.f29753.mSavedFragmentState.putBundle(f29747, new Bundle());
        }
        Fragment fragment = this.f29753;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(f29750);
        Fragment fragment2 = this.f29753;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(f29751);
        C8881 c8881 = (C8881) this.f29753.mSavedFragmentState.getParcelable("state");
        if (c8881 != null) {
            Fragment fragment3 = this.f29753;
            fragment3.mTargetWho = c8881.f29742;
            fragment3.mTargetRequestCode = c8881.f29743;
            Boolean bool = fragment3.mSavedUserVisibleHint;
            if (bool != null) {
                fragment3.mUserVisibleHint = bool.booleanValue();
                this.f29753.mSavedUserVisibleHint = null;
            } else {
                fragment3.mUserVisibleHint = c8881.f29744;
            }
        }
        Fragment fragment4 = this.f29753;
        if (fragment4.mUserVisibleHint) {
            return;
        }
        fragment4.mDeferStart = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m30005() {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f29753);
        }
        View focusedView = this.f29753.getFocusedView();
        if (focusedView != null && m30001(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.m29739(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f29753);
                sb.append(" resulting in focused view ");
                sb.append(this.f29753.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f29753.setFocusedView(null);
        this.f29753.performResume();
        this.f3836.m29971(this.f29753, false);
        this.f3837.m30039(this.f29753.mWho, null);
        Fragment fragment = this.f29753;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Fragment.C8845 m30006() {
        if (this.f29753.mState > -1) {
            return new Fragment.C8845(m30007());
        }
        return null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Bundle m30007() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f29753;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C8881(this.f29753));
        if (this.f29753.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f29753.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle(f29747, bundle3);
            }
            this.f3836.m29972(this.f29753, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f29753.mSavedStateRegistryController.m22642(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle(f29748, bundle4);
            }
            Bundle bundleM29831 = this.f29753.mChildFragmentManager.m29831();
            if (!bundleM29831.isEmpty()) {
                bundle2.putBundle(f29749, bundleM29831);
            }
            if (this.f29753.mView != null) {
                m30008();
            }
            SparseArray<Parcelable> sparseArray = this.f29753.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray(f29750, sparseArray);
            }
            Bundle bundle5 = this.f29753.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle(f29751, bundle5);
            }
        }
        Bundle bundle6 = this.f29753.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle(f29752, bundle6);
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m30008() {
        if (this.f29753.mView == null) {
            return;
        }
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f29753 + " with view " + this.f29753.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f29753.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f29753.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f29753.mViewLifecycleOwner.m30071(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f29753.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m30009(int i) {
        this.f29755 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m30010() {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f29753);
        }
        this.f29753.performStart();
        this.f3836.m29973(this.f29753, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m30011() {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f29753);
        }
        this.f29753.performStop();
        this.f3836.m29974(this.f29753, false);
    }

    public C8882(@InterfaceC6391 C8878 c8878, @InterfaceC6391 C8884 c8884, @InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 C8876 c8876, @InterfaceC6391 Bundle bundle) {
        this.f3836 = c8878;
        this.f3837 = c8884;
        Fragment fragmentM4848 = ((C8881) bundle.getParcelable("state")).m4848(c8876, classLoader);
        this.f29753 = fragmentM4848;
        fragmentM4848.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle(f29752);
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentM4848.setArguments(bundle2);
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentM4848);
        }
    }

    public C8882(@InterfaceC6391 C8878 c8878, @InterfaceC6391 C8884 c8884, @InterfaceC6391 Fragment fragment, @InterfaceC6391 Bundle bundle) {
        this.f3836 = c8878;
        this.f3837 = c8884;
        this.f29753 = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle(f29752);
    }
}
