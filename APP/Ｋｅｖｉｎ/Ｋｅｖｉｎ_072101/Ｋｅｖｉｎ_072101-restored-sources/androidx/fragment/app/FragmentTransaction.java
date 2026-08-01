package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentTransaction {
    static final int OP_ADD = 1;
    static final int OP_ATTACH = 7;
    static final int OP_DETACH = 6;
    static final int OP_HIDE = 4;
    static final int OP_NULL = 0;
    static final int OP_REMOVE = 3;
    static final int OP_REPLACE = 2;
    static final int OP_SET_MAX_LIFECYCLE = 10;
    static final int OP_SET_PRIMARY_NAV = 8;
    static final int OP_SHOW = 5;
    static final int OP_UNSET_PRIMARY_NAV = 9;
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    java.lang.CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    java.lang.CharSequence mBreadCrumbTitleText;
    private final java.lang.ClassLoader mClassLoader;
    java.util.ArrayList<java.lang.Runnable> mCommitRunnables;
    int mEnterAnim;
    int mExitAnim;
    private final androidx.fragment.app.FragmentFactory mFragmentFactory;
    java.lang.String mName;
    java.util.ArrayList<androidx.fragment.app.FragmentTransaction.C0291Op> mOps;
    int mPopEnterAnim;
    int mPopExitAnim;
    boolean mReorderingAllowed;
    java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    int mTransition;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentTransaction$Op */
    static final class C0291Op {
        int mCmd;
        androidx.lifecycle.Lifecycle.State mCurrentMaxState;
        int mEnterAnim;
        int mExitAnim;
        androidx.fragment.app.Fragment mFragment;
        androidx.lifecycle.Lifecycle.State mOldMaxState;
        int mPopEnterAnim;
        int mPopExitAnim;

        C0291Op() {
                r0 = this;
                r0.<init>()
                return
        }

        C0291Op(int r2, androidx.fragment.app.Fragment r3) {
                r1 = this;
                r1.<init>()
                r1.mCmd = r2
                r1.mFragment = r3
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
                r1.mOldMaxState = r0
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
                r1.mCurrentMaxState = r0
                return
        }

        C0291Op(int r2, androidx.fragment.app.Fragment r3, androidx.lifecycle.Lifecycle.State r4) {
                r1 = this;
                r1.<init>()
                r1.mCmd = r2
                r1.mFragment = r3
                androidx.lifecycle.Lifecycle$State r0 = r3.mMaxState
                r1.mOldMaxState = r0
                r1.mCurrentMaxState = r4
                return
        }
    }

    @java.lang.Deprecated
    public FragmentTransaction() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOps = r0
            r0 = 1
            r1.mAllowAddToBackStack = r0
            r0 = 0
            r1.mReorderingAllowed = r0
            r0 = 0
            r1.mFragmentFactory = r0
            r1.mClassLoader = r0
            return
    }

    FragmentTransaction(androidx.fragment.app.FragmentFactory r2, java.lang.ClassLoader r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOps = r0
            r0 = 1
            r1.mAllowAddToBackStack = r0
            r0 = 0
            r1.mReorderingAllowed = r0
            r1.mFragmentFactory = r2
            r1.mClassLoader = r3
            return
    }

    private androidx.fragment.app.Fragment createFragment(java.lang.Class<? extends androidx.fragment.app.Fragment> r4, android.os.Bundle r5) {
            r3 = this;
            androidx.fragment.app.FragmentFactory r0 = r3.mFragmentFactory
            if (r0 == 0) goto L22
            java.lang.ClassLoader r0 = r3.mClassLoader
            if (r0 == 0) goto L1a
            androidx.fragment.app.FragmentFactory r0 = r3.mFragmentFactory
            java.lang.ClassLoader r1 = r3.mClassLoader
            java.lang.String r2 = r4.getName()
            androidx.fragment.app.Fragment r0 = r0.instantiate(r1, r2)
            if (r5 == 0) goto L19
            r0.setArguments(r5)
        L19:
            return r0
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The FragmentManager must be attached to itshost to create a Fragment"
            r0.<init>(r1)
            throw r0
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()"
            r0.<init>(r1)
            throw r0
    }

    public androidx.fragment.app.FragmentTransaction add(int r3, androidx.fragment.app.Fragment r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.doAddOp(r3, r4, r0, r1)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction add(int r2, androidx.fragment.app.Fragment r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.doAddOp(r2, r3, r4, r0)
            return r1
    }

    public final androidx.fragment.app.FragmentTransaction add(int r2, java.lang.Class<? extends androidx.fragment.app.Fragment> r3, android.os.Bundle r4) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.createFragment(r3, r4)
            androidx.fragment.app.FragmentTransaction r0 = r1.add(r2, r0)
            return r0
    }

    public final androidx.fragment.app.FragmentTransaction add(int r2, java.lang.Class<? extends androidx.fragment.app.Fragment> r3, android.os.Bundle r4, java.lang.String r5) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.createFragment(r3, r4)
            androidx.fragment.app.FragmentTransaction r0 = r1.add(r2, r0, r5)
            return r0
    }

    androidx.fragment.app.FragmentTransaction add(android.view.ViewGroup r2, androidx.fragment.app.Fragment r3, java.lang.String r4) {
            r1 = this;
            r3.mContainer = r2
            int r0 = r2.getId()
            androidx.fragment.app.FragmentTransaction r0 = r1.add(r0, r3, r4)
            return r0
    }

    public androidx.fragment.app.FragmentTransaction add(androidx.fragment.app.Fragment r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.doAddOp(r0, r3, r4, r1)
            return r2
    }

    public final androidx.fragment.app.FragmentTransaction add(java.lang.Class<? extends androidx.fragment.app.Fragment> r2, android.os.Bundle r3, java.lang.String r4) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.createFragment(r2, r3)
            androidx.fragment.app.FragmentTransaction r0 = r1.add(r0, r4)
            return r0
    }

    void addOp(androidx.fragment.app.FragmentTransaction.C0291Op r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r1.mOps
            r0.add(r2)
            int r0 = r1.mEnterAnim
            r2.mEnterAnim = r0
            int r0 = r1.mExitAnim
            r2.mExitAnim = r0
            int r0 = r1.mPopEnterAnim
            r2.mPopEnterAnim = r0
            int r0 = r1.mPopExitAnim
            r2.mPopExitAnim = r0
            return
    }

    public androidx.fragment.app.FragmentTransaction addSharedElement(android.view.View r6, java.lang.String r7) {
            r5 = this;
            boolean r0 = androidx.fragment.app.FragmentTransition.supportsTransition()
            if (r0 == 0) goto L7e
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r6)
            if (r0 == 0) goto L76
            java.util.ArrayList<java.lang.String> r1 = r5.mSharedElementSourceNames
            if (r1 != 0) goto L1f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.mSharedElementSourceNames = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.mSharedElementTargetNames = r1
            goto L31
        L1f:
            java.util.ArrayList<java.lang.String> r1 = r5.mSharedElementTargetNames
            boolean r1 = r1.contains(r7)
            java.lang.String r2 = "' has already been added to the transaction."
            if (r1 != 0) goto L59
            java.util.ArrayList<java.lang.String> r1 = r5.mSharedElementSourceNames
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L3c
        L31:
            java.util.ArrayList<java.lang.String> r1 = r5.mSharedElementSourceNames
            r1.add(r0)
            java.util.ArrayList<java.lang.String> r1 = r5.mSharedElementTargetNames
            r1.add(r7)
            goto L7e
        L3c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "A shared element with the source name '"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L59:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "A shared element with the target name '"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L76:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Unique transitionNames are required for all sharedElements"
            r1.<init>(r2)
            throw r1
        L7e:
            return r5
    }

    public androidx.fragment.app.FragmentTransaction addToBackStack(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.mAllowAddToBackStack
            if (r0 == 0) goto La
            r0 = 1
            r2.mAddToBackStack = r0
            r2.mName = r3
            return r2
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This FragmentTransaction is not allowed to be added to the back stack."
            r0.<init>(r1)
            throw r0
    }

    public androidx.fragment.app.FragmentTransaction attach(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 7
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    public androidx.fragment.app.FragmentTransaction detach(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 6
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction disallowAddToBackStack() {
            r2 = this;
            boolean r0 = r2.mAddToBackStack
            if (r0 != 0) goto L8
            r0 = 0
            r2.mAllowAddToBackStack = r0
            return r2
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
    }

    void doAddOp(int r8, androidx.fragment.app.Fragment r9, java.lang.String r10, int r11) {
            r7 = this;
            java.lang.Class r0 = r9.getClass()
            int r1 = r0.getModifiers()
            boolean r2 = r0.isAnonymousClass()
            if (r2 != 0) goto Ld0
            boolean r2 = java.lang.reflect.Modifier.isPublic(r1)
            if (r2 == 0) goto Ld0
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L20
            boolean r2 = java.lang.reflect.Modifier.isStatic(r1)
            if (r2 == 0) goto Ld0
        L20:
            java.lang.String r2 = " now "
            java.lang.String r3 = ": was "
            if (r10 == 0) goto L60
            java.lang.String r4 = r9.mTag
            if (r4 == 0) goto L5e
            java.lang.String r4 = r9.mTag
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L33
            goto L5e
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Can't change tag of fragment "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r9)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = r9.mTag
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            r4.<init>(r2)
            throw r4
        L5e:
            r9.mTag = r10
        L60:
            if (r8 == 0) goto Lc7
            r4 = -1
            if (r8 == r4) goto L9e
            int r4 = r9.mFragmentId
            if (r4 == 0) goto L99
            int r4 = r9.mFragmentId
            if (r4 != r8) goto L6e
            goto L99
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Can't change container ID of fragment "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r9)
            java.lang.StringBuilder r3 = r5.append(r3)
            int r5 = r9.mFragmentId
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r2 = r2.toString()
            r4.<init>(r2)
            throw r4
        L99:
            r9.mFragmentId = r8
            r9.mContainerId = r8
            goto Lc7
        L9e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Can't add fragment "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r4 = " with tag "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r10)
            java.lang.String r4 = " to container view with no id"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        Lc7:
            androidx.fragment.app.FragmentTransaction$Op r2 = new androidx.fragment.app.FragmentTransaction$Op
            r2.<init>(r11, r9)
            r7.addOp(r2)
            return
        Ld0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Fragment "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r0.getCanonicalName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " must be a public static class to be  properly recreated from instance state."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public androidx.fragment.app.FragmentTransaction hide(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 4
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public boolean isAddToBackStackAllowed() {
            r1 = this;
            boolean r0 = r1.mAllowAddToBackStack
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r1.mOps
            boolean r0 = r0.isEmpty()
            return r0
    }

    public androidx.fragment.app.FragmentTransaction remove(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 3
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction replace(int r2, androidx.fragment.app.Fragment r3) {
            r1 = this;
            r0 = 0
            androidx.fragment.app.FragmentTransaction r0 = r1.replace(r2, r3, r0)
            return r0
    }

    public androidx.fragment.app.FragmentTransaction replace(int r3, androidx.fragment.app.Fragment r4, java.lang.String r5) {
            r2 = this;
            if (r3 == 0) goto L7
            r0 = 2
            r2.doAddOp(r3, r4, r5, r0)
            return r2
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must use non-zero containerViewId"
            r0.<init>(r1)
            throw r0
    }

    public final androidx.fragment.app.FragmentTransaction replace(int r2, java.lang.Class<? extends androidx.fragment.app.Fragment> r3, android.os.Bundle r4) {
            r1 = this;
            r0 = 0
            androidx.fragment.app.FragmentTransaction r0 = r1.replace(r2, r3, r4, r0)
            return r0
    }

    public final androidx.fragment.app.FragmentTransaction replace(int r2, java.lang.Class<? extends androidx.fragment.app.Fragment> r3, android.os.Bundle r4, java.lang.String r5) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.createFragment(r3, r4)
            androidx.fragment.app.FragmentTransaction r0 = r1.replace(r2, r0, r5)
            return r0
    }

    public androidx.fragment.app.FragmentTransaction runOnCommit(java.lang.Runnable r2) {
            r1 = this;
            r1.disallowAddToBackStack()
            java.util.ArrayList<java.lang.Runnable> r0 = r1.mCommitRunnables
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mCommitRunnables = r0
        Le:
            java.util.ArrayList<java.lang.Runnable> r0 = r1.mCommitRunnables
            r0.add(r2)
            return r1
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setAllowOptimization(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentTransaction r0 = r1.setReorderingAllowed(r2)
            return r0
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbShortTitle(int r2) {
            r1 = this;
            r1.mBreadCrumbShortTitleRes = r2
            r0 = 0
            r1.mBreadCrumbShortTitleText = r0
            return r1
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbShortTitle(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            r1.mBreadCrumbShortTitleRes = r0
            r1.mBreadCrumbShortTitleText = r2
            return r1
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbTitle(int r2) {
            r1 = this;
            r1.mBreadCrumbTitleRes = r2
            r0 = 0
            r1.mBreadCrumbTitleText = r0
            return r1
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbTitle(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            r1.mBreadCrumbTitleRes = r0
            r1.mBreadCrumbTitleText = r2
            return r1
    }

    public androidx.fragment.app.FragmentTransaction setCustomAnimations(int r2, int r3) {
            r1 = this;
            r0 = 0
            androidx.fragment.app.FragmentTransaction r0 = r1.setCustomAnimations(r2, r3, r0, r0)
            return r0
    }

    public androidx.fragment.app.FragmentTransaction setCustomAnimations(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mEnterAnim = r1
            r0.mExitAnim = r2
            r0.mPopEnterAnim = r3
            r0.mPopExitAnim = r4
            return r0
    }

    public androidx.fragment.app.FragmentTransaction setMaxLifecycle(androidx.fragment.app.Fragment r3, androidx.lifecycle.Lifecycle.State r4) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 10
            r0.<init>(r1, r3, r4)
            r2.addOp(r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction setPrimaryNavigationFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 8
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction setReorderingAllowed(boolean r1) {
            r0 = this;
            r0.mReorderingAllowed = r1
            return r0
    }

    public androidx.fragment.app.FragmentTransaction setTransition(int r1) {
            r0 = this;
            r0.mTransition = r1
            return r0
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setTransitionStyle(int r1) {
            r0 = this;
            return r0
    }

    public androidx.fragment.app.FragmentTransaction show(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 5
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }
}
