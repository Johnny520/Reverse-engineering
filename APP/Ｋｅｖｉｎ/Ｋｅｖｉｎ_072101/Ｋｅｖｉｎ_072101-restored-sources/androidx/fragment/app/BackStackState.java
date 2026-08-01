package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
final class BackStackState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackState> CREATOR = null;
    private static final java.lang.String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final java.lang.CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final java.lang.CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final java.util.ArrayList<java.lang.String> mFragmentWhos;
    final int mIndex;
    final java.lang.String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    final java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    final int mTransition;


    static {
            androidx.fragment.app.BackStackState$1 r0 = new androidx.fragment.app.BackStackState$1
            r0.<init>()
            androidx.fragment.app.BackStackState.CREATOR = r0
            return
    }

    public BackStackState(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = r2.createIntArray()
            r1.mOps = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mFragmentWhos = r0
            int[] r0 = r2.createIntArray()
            r1.mOldMaxLifecycleStates = r0
            int[] r0 = r2.createIntArray()
            r1.mCurrentMaxLifecycleStates = r0
            int r0 = r2.readInt()
            r1.mTransition = r0
            java.lang.String r0 = r2.readString()
            r1.mName = r0
            int r0 = r2.readInt()
            r1.mIndex = r0
            int r0 = r2.readInt()
            r1.mBreadCrumbTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.mBreadCrumbTitleText = r0
            int r0 = r2.readInt()
            r1.mBreadCrumbShortTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.mBreadCrumbShortTitleText = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mSharedElementSourceNames = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mSharedElementTargetNames = r0
            int r0 = r2.readInt()
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            r1.mReorderingAllowed = r0
            return
    }

    public BackStackState(androidx.fragment.app.BackStackRecord r8) {
            r7 = this;
            r7.<init>()
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r8.mOps
            int r0 = r0.size()
            int r1 = r0 * 5
            int[] r1 = new int[r1]
            r7.mOps = r1
            boolean r1 = r8.mAddToBackStack
            if (r1 == 0) goto La6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r7.mFragmentWhos = r1
            int[] r1 = new int[r0]
            r7.mOldMaxLifecycleStates = r1
            int[] r1 = new int[r0]
            r7.mCurrentMaxLifecycleStates = r1
            r1 = 0
            r2 = 0
        L24:
            if (r2 >= r0) goto L7d
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r8.mOps
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.C0291Op) r3
            int[] r4 = r7.mOps
            int r5 = r1 + 1
            int r6 = r3.mCmd
            r4[r1] = r6
            java.util.ArrayList<java.lang.String> r1 = r7.mFragmentWhos
            androidx.fragment.app.Fragment r4 = r3.mFragment
            if (r4 == 0) goto L41
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.String r4 = r4.mWho
            goto L42
        L41:
            r4 = 0
        L42:
            r1.add(r4)
            int[] r1 = r7.mOps
            int r4 = r5 + 1
            int r6 = r3.mEnterAnim
            r1[r5] = r6
            int[] r1 = r7.mOps
            int r5 = r4 + 1
            int r6 = r3.mExitAnim
            r1[r4] = r6
            int[] r1 = r7.mOps
            int r4 = r5 + 1
            int r6 = r3.mPopEnterAnim
            r1[r5] = r6
            int[] r1 = r7.mOps
            int r5 = r4 + 1
            int r6 = r3.mPopExitAnim
            r1[r4] = r6
            int[] r1 = r7.mOldMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r4 = r3.mOldMaxState
            int r4 = r4.ordinal()
            r1[r2] = r4
            int[] r1 = r7.mCurrentMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r4 = r3.mCurrentMaxState
            int r4 = r4.ordinal()
            r1[r2] = r4
            int r2 = r2 + 1
            r1 = r5
            goto L24
        L7d:
            int r2 = r8.mTransition
            r7.mTransition = r2
            java.lang.String r2 = r8.mName
            r7.mName = r2
            int r2 = r8.mIndex
            r7.mIndex = r2
            int r2 = r8.mBreadCrumbTitleRes
            r7.mBreadCrumbTitleRes = r2
            java.lang.CharSequence r2 = r8.mBreadCrumbTitleText
            r7.mBreadCrumbTitleText = r2
            int r2 = r8.mBreadCrumbShortTitleRes
            r7.mBreadCrumbShortTitleRes = r2
            java.lang.CharSequence r2 = r8.mBreadCrumbShortTitleText
            r7.mBreadCrumbShortTitleText = r2
            java.util.ArrayList<java.lang.String> r2 = r8.mSharedElementSourceNames
            r7.mSharedElementSourceNames = r2
            java.util.ArrayList<java.lang.String> r2 = r8.mSharedElementTargetNames
            r7.mSharedElementTargetNames = r2
            boolean r2 = r8.mReorderingAllowed
            r7.mReorderingAllowed = r2
            return
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not on back stack"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.fragment.app.BackStackRecord instantiate(androidx.fragment.app.FragmentManager r8) {
            r7 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r8)
            r1 = 0
            r2 = 0
        L7:
            int[] r3 = r7.mOps
            int r3 = r3.length
            if (r1 >= r3) goto Lb5
            androidx.fragment.app.FragmentTransaction$Op r3 = new androidx.fragment.app.FragmentTransaction$Op
            r3.<init>()
            int[] r4 = r7.mOps
            int r5 = r1 + 1
            r1 = r4[r1]
            r3.mCmd = r1
            r1 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r1 == 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Instantiate "
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r4 = " op #"
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r4 = " base fragment #"
            java.lang.StringBuilder r1 = r1.append(r4)
            int[] r4 = r7.mOps
            r4 = r4[r5]
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r1)
        L50:
            java.util.ArrayList<java.lang.String> r1 = r7.mFragmentWhos
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L61
            androidx.fragment.app.Fragment r4 = r8.findActiveFragment(r1)
            r3.mFragment = r4
            goto L64
        L61:
            r4 = 0
            r3.mFragment = r4
        L64:
            androidx.lifecycle.Lifecycle$State[] r4 = androidx.lifecycle.Lifecycle.State.values()
            int[] r6 = r7.mOldMaxLifecycleStates
            r6 = r6[r2]
            r4 = r4[r6]
            r3.mOldMaxState = r4
            androidx.lifecycle.Lifecycle$State[] r4 = androidx.lifecycle.Lifecycle.State.values()
            int[] r6 = r7.mCurrentMaxLifecycleStates
            r6 = r6[r2]
            r4 = r4[r6]
            r3.mCurrentMaxState = r4
            int[] r4 = r7.mOps
            int r6 = r5 + 1
            r4 = r4[r5]
            r3.mEnterAnim = r4
            int[] r4 = r7.mOps
            int r5 = r6 + 1
            r4 = r4[r6]
            r3.mExitAnim = r4
            int[] r4 = r7.mOps
            int r6 = r5 + 1
            r4 = r4[r5]
            r3.mPopEnterAnim = r4
            int[] r4 = r7.mOps
            int r5 = r6 + 1
            r4 = r4[r6]
            r3.mPopExitAnim = r4
            int r4 = r3.mEnterAnim
            r0.mEnterAnim = r4
            int r4 = r3.mExitAnim
            r0.mExitAnim = r4
            int r4 = r3.mPopEnterAnim
            r0.mPopEnterAnim = r4
            int r4 = r3.mPopExitAnim
            r0.mPopExitAnim = r4
            r0.addOp(r3)
            int r2 = r2 + 1
            r1 = r5
            goto L7
        Lb5:
            int r3 = r7.mTransition
            r0.mTransition = r3
            java.lang.String r3 = r7.mName
            r0.mName = r3
            int r3 = r7.mIndex
            r0.mIndex = r3
            r3 = 1
            r0.mAddToBackStack = r3
            int r4 = r7.mBreadCrumbTitleRes
            r0.mBreadCrumbTitleRes = r4
            java.lang.CharSequence r4 = r7.mBreadCrumbTitleText
            r0.mBreadCrumbTitleText = r4
            int r4 = r7.mBreadCrumbShortTitleRes
            r0.mBreadCrumbShortTitleRes = r4
            java.lang.CharSequence r4 = r7.mBreadCrumbShortTitleText
            r0.mBreadCrumbShortTitleText = r4
            java.util.ArrayList<java.lang.String> r4 = r7.mSharedElementSourceNames
            r0.mSharedElementSourceNames = r4
            java.util.ArrayList<java.lang.String> r4 = r7.mSharedElementTargetNames
            r0.mSharedElementTargetNames = r4
            boolean r4 = r7.mReorderingAllowed
            r0.mReorderingAllowed = r4
            r0.bumpBackStackNesting(r3)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int[] r0 = r2.mOps
            r3.writeIntArray(r0)
            java.util.ArrayList<java.lang.String> r0 = r2.mFragmentWhos
            r3.writeStringList(r0)
            int[] r0 = r2.mOldMaxLifecycleStates
            r3.writeIntArray(r0)
            int[] r0 = r2.mCurrentMaxLifecycleStates
            r3.writeIntArray(r0)
            int r0 = r2.mTransition
            r3.writeInt(r0)
            java.lang.String r0 = r2.mName
            r3.writeString(r0)
            int r0 = r2.mIndex
            r3.writeInt(r0)
            int r0 = r2.mBreadCrumbTitleRes
            r3.writeInt(r0)
            java.lang.CharSequence r0 = r2.mBreadCrumbTitleText
            r1 = 0
            android.text.TextUtils.writeToParcel(r0, r3, r1)
            int r0 = r2.mBreadCrumbShortTitleRes
            r3.writeInt(r0)
            java.lang.CharSequence r0 = r2.mBreadCrumbShortTitleText
            android.text.TextUtils.writeToParcel(r0, r3, r1)
            java.util.ArrayList<java.lang.String> r0 = r2.mSharedElementSourceNames
            r3.writeStringList(r0)
            java.util.ArrayList<java.lang.String> r0 = r2.mSharedElementTargetNames
            r3.writeStringList(r0)
            boolean r0 = r2.mReorderingAllowed
            r3.writeInt(r0)
            return
    }
}
