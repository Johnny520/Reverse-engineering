package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class C7625 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.C7625> CREATOR = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.lang.String f29328;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.lang.String f29329;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean f29330;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f29331;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f29332;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final java.lang.String f29333;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean f29334;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean f29335;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final boolean f29336;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final boolean f29337;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final int f29338;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final java.lang.String f29339;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final int f29340;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final boolean f29341;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۦ$ۥ, reason: contains not printable characters */
    public class C7626 implements android.os.Parcelable.Creator<androidx.fragment.app.C7625> {
        public C7626() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.C7625 createFromParcel(android.os.Parcel r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟۟۟ۦ r1 = r0.m29378(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.C7625[] newArray(int r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟۟۟ۦ[] r1 = r0.m29379(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.fragment.app.C7625 m29378(android.os.Parcel r2) {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۟ۦ r0 = new androidx.fragment.app.ۥ۟۟۟ۦ
                r0.<init>(r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.fragment.app.C7625[] m29379(int r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟۟۟ۦ[] r1 = new androidx.fragment.app.C7625[r1]
                return r1
        }
    }

    static {
            androidx.fragment.app.ۥ۟۟۟ۦ$ۥ r0 = new androidx.fragment.app.ۥ۟۟۟ۦ$ۥ
            r0.<init>()
            androidx.fragment.app.C7625.CREATOR = r0
            return
    }

    public C7625(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.f29328 = r0
            java.lang.String r0 = r4.readString()
            r3.f29329 = r0
            int r0 = r4.readInt()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            r3.f29330 = r0
            int r0 = r4.readInt()
            r3.f29331 = r0
            int r0 = r4.readInt()
            r3.f29332 = r0
            java.lang.String r0 = r4.readString()
            r3.f29333 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r1
        L37:
            r3.f29334 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L41
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            r3.f29335 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L4c
            r0 = r2
            goto L4d
        L4c:
            r0 = r1
        L4d:
            r3.f29336 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L57
            r0 = r2
            goto L58
        L57:
            r0 = r1
        L58:
            r3.f29337 = r0
            int r0 = r4.readInt()
            r3.f29338 = r0
            java.lang.String r0 = r4.readString()
            r3.f29339 = r0
            int r0 = r4.readInt()
            r3.f29340 = r0
            int r4 = r4.readInt()
            if (r4 == 0) goto L73
            r1 = r2
        L73:
            r3.f29341 = r1
            return
    }

    public C7625(androidx.fragment.app.Fragment r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.f29328 = r0
            java.lang.String r0 = r2.mWho
            r1.f29329 = r0
            boolean r0 = r2.mFromLayout
            r1.f29330 = r0
            int r0 = r2.mFragmentId
            r1.f29331 = r0
            int r0 = r2.mContainerId
            r1.f29332 = r0
            java.lang.String r0 = r2.mTag
            r1.f29333 = r0
            boolean r0 = r2.mRetainInstance
            r1.f29334 = r0
            boolean r0 = r2.mRemoving
            r1.f29335 = r0
            boolean r0 = r2.mDetached
            r1.f29336 = r0
            boolean r0 = r2.mHidden
            r1.f29337 = r0
            androidx.lifecycle.Lifecycle$State r0 = r2.mMaxState
            int r0 = r0.ordinal()
            r1.f29338 = r0
            java.lang.String r0 = r2.mTargetWho
            r1.f29339 = r0
            int r0 = r2.mTargetRequestCode
            r1.f29340 = r0
            boolean r2 = r2.mUserVisibleHint
            r1.f29341 = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentState{"
            r0.append(r1)
            java.lang.String r1 = r2.f29328
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r2.f29329
            r0.append(r1)
            java.lang.String r1 = ")}:"
            r0.append(r1)
            boolean r1 = r2.f29330
            if (r1 == 0) goto L29
            java.lang.String r1 = " fromLayout"
            r0.append(r1)
        L29:
            int r1 = r2.f29332
            if (r1 == 0) goto L3b
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.f29332
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L3b:
            java.lang.String r1 = r2.f29333
            if (r1 == 0) goto L4f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4f
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r1 = r2.f29333
            r0.append(r1)
        L4f:
            boolean r1 = r2.f29334
            if (r1 == 0) goto L58
            java.lang.String r1 = " retainInstance"
            r0.append(r1)
        L58:
            boolean r1 = r2.f29335
            if (r1 == 0) goto L61
            java.lang.String r1 = " removing"
            r0.append(r1)
        L61:
            boolean r1 = r2.f29336
            if (r1 == 0) goto L6a
            java.lang.String r1 = " detached"
            r0.append(r1)
        L6a:
            boolean r1 = r2.f29337
            if (r1 == 0) goto L73
            java.lang.String r1 = " hidden"
            r0.append(r1)
        L73:
            java.lang.String r1 = r2.f29339
            if (r1 == 0) goto L8b
            java.lang.String r1 = " targetWho="
            r0.append(r1)
            java.lang.String r1 = r2.f29339
            r0.append(r1)
            java.lang.String r1 = " targetRequestCode="
            r0.append(r1)
            int r1 = r2.f29340
            r0.append(r1)
        L8b:
            boolean r1 = r2.f29341
            if (r1 == 0) goto L94
            java.lang.String r1 = " userVisibleHint"
            r0.append(r1)
        L94:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f29328
            r1.writeString(r2)
            java.lang.String r2 = r0.f29329
            r1.writeString(r2)
            boolean r2 = r0.f29330
            r1.writeInt(r2)
            int r2 = r0.f29331
            r1.writeInt(r2)
            int r2 = r0.f29332
            r1.writeInt(r2)
            java.lang.String r2 = r0.f29333
            r1.writeString(r2)
            boolean r2 = r0.f29334
            r1.writeInt(r2)
            boolean r2 = r0.f29335
            r1.writeInt(r2)
            boolean r2 = r0.f29336
            r1.writeInt(r2)
            boolean r2 = r0.f29337
            r1.writeInt(r2)
            int r2 = r0.f29338
            r1.writeInt(r2)
            java.lang.String r2 = r0.f29339
            r1.writeString(r2)
            int r2 = r0.f29340
            r1.writeInt(r2)
            boolean r2 = r0.f29341
            r1.writeInt(r2)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29377(@Yue.InterfaceC4410 androidx.fragment.app.C7616 r2, @Yue.InterfaceC4410 java.lang.ClassLoader r3) {
            r1 = this;
            java.lang.String r0 = r1.f29328
            androidx.fragment.app.Fragment r2 = r2.mo29237(r3, r0)
            java.lang.String r3 = r1.f29329
            r2.mWho = r3
            boolean r3 = r1.f29330
            r2.mFromLayout = r3
            r3 = 1
            r2.mRestored = r3
            int r3 = r1.f29331
            r2.mFragmentId = r3
            int r3 = r1.f29332
            r2.mContainerId = r3
            java.lang.String r3 = r1.f29333
            r2.mTag = r3
            boolean r3 = r1.f29334
            r2.mRetainInstance = r3
            boolean r3 = r1.f29335
            r2.mRemoving = r3
            boolean r3 = r1.f29336
            r2.mDetached = r3
            boolean r3 = r1.f29337
            r2.mHidden = r3
            androidx.lifecycle.Lifecycle$State[] r3 = androidx.lifecycle.Lifecycle.State.values()
            int r0 = r1.f29338
            r3 = r3[r0]
            r2.mMaxState = r3
            java.lang.String r3 = r1.f29339
            r2.mTargetWho = r3
            int r3 = r1.f29340
            r2.mTargetRequestCode = r3
            boolean r3 = r1.f29341
            r2.mUserVisibleHint = r3
            return r2
    }
}
