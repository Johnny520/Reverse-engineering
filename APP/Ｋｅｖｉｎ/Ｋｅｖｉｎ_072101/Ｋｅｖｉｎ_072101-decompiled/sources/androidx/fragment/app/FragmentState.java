package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
final class FragmentState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentState> CREATOR = null;
    final android.os.Bundle mArguments;
    final java.lang.String mClassName;
    final int mContainerId;
    final boolean mDetached;
    final int mFragmentId;
    final boolean mFromLayout;
    final boolean mHidden;
    final int mMaxLifecycleState;
    final boolean mRemoving;
    final boolean mRetainInstance;
    android.os.Bundle mSavedFragmentState;
    final java.lang.String mTag;
    final java.lang.String mWho;


    static {
            androidx.fragment.app.FragmentState$1 r0 = new androidx.fragment.app.FragmentState$1
            r0.<init>()
            androidx.fragment.app.FragmentState.CREATOR = r0
            return
    }

    FragmentState(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.mClassName = r0
            java.lang.String r0 = r4.readString()
            r3.mWho = r0
            int r0 = r4.readInt()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            r3.mFromLayout = r0
            int r0 = r4.readInt()
            r3.mFragmentId = r0
            int r0 = r4.readInt()
            r3.mContainerId = r0
            java.lang.String r0 = r4.readString()
            r3.mTag = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L36
            r0 = r1
            goto L37
        L36:
            r0 = r2
        L37:
            r3.mRetainInstance = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L41
            r0 = r1
            goto L42
        L41:
            r0 = r2
        L42:
            r3.mRemoving = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L4c
            r0 = r1
            goto L4d
        L4c:
            r0 = r2
        L4d:
            r3.mDetached = r0
            android.os.Bundle r0 = r4.readBundle()
            r3.mArguments = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L5c
            goto L5d
        L5c:
            r1 = r2
        L5d:
            r3.mHidden = r1
            android.os.Bundle r0 = r4.readBundle()
            r3.mSavedFragmentState = r0
            int r0 = r4.readInt()
            r3.mMaxLifecycleState = r0
            return
    }

    FragmentState(androidx.fragment.app.Fragment r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.mClassName = r0
            java.lang.String r0 = r2.mWho
            r1.mWho = r0
            boolean r0 = r2.mFromLayout
            r1.mFromLayout = r0
            int r0 = r2.mFragmentId
            r1.mFragmentId = r0
            int r0 = r2.mContainerId
            r1.mContainerId = r0
            java.lang.String r0 = r2.mTag
            r1.mTag = r0
            boolean r0 = r2.mRetainInstance
            r1.mRetainInstance = r0
            boolean r0 = r2.mRemoving
            r1.mRemoving = r0
            boolean r0 = r2.mDetached
            r1.mDetached = r0
            android.os.Bundle r0 = r2.mArguments
            r1.mArguments = r0
            boolean r0 = r2.mHidden
            r1.mHidden = r0
            androidx.lifecycle.Lifecycle$State r0 = r2.mMaxState
            int r0 = r0.ordinal()
            r1.mMaxLifecycleState = r0
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentState{"
            r0.append(r1)
            java.lang.String r1 = r2.mClassName
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r2.mWho
            r0.append(r1)
            java.lang.String r1 = ")}:"
            r0.append(r1)
            boolean r1 = r2.mFromLayout
            if (r1 == 0) goto L29
            java.lang.String r1 = " fromLayout"
            r0.append(r1)
        L29:
            int r1 = r2.mContainerId
            if (r1 == 0) goto L3b
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.mContainerId
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L3b:
            java.lang.String r1 = r2.mTag
            if (r1 == 0) goto L51
            java.lang.String r1 = r2.mTag
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L51
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r1 = r2.mTag
            r0.append(r1)
        L51:
            boolean r1 = r2.mRetainInstance
            if (r1 == 0) goto L5a
            java.lang.String r1 = " retainInstance"
            r0.append(r1)
        L5a:
            boolean r1 = r2.mRemoving
            if (r1 == 0) goto L63
            java.lang.String r1 = " removing"
            r0.append(r1)
        L63:
            boolean r1 = r2.mDetached
            if (r1 == 0) goto L6c
            java.lang.String r1 = " detached"
            r0.append(r1)
        L6c:
            boolean r1 = r2.mHidden
            if (r1 == 0) goto L75
            java.lang.String r1 = " hidden"
            r0.append(r1)
        L75:
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.mClassName
            r2.writeString(r0)
            java.lang.String r0 = r1.mWho
            r2.writeString(r0)
            boolean r0 = r1.mFromLayout
            r2.writeInt(r0)
            int r0 = r1.mFragmentId
            r2.writeInt(r0)
            int r0 = r1.mContainerId
            r2.writeInt(r0)
            java.lang.String r0 = r1.mTag
            r2.writeString(r0)
            boolean r0 = r1.mRetainInstance
            r2.writeInt(r0)
            boolean r0 = r1.mRemoving
            r2.writeInt(r0)
            boolean r0 = r1.mDetached
            r2.writeInt(r0)
            android.os.Bundle r0 = r1.mArguments
            r2.writeBundle(r0)
            boolean r0 = r1.mHidden
            r2.writeInt(r0)
            android.os.Bundle r0 = r1.mSavedFragmentState
            r2.writeBundle(r0)
            int r0 = r1.mMaxLifecycleState
            r2.writeInt(r0)
            return
    }
}
