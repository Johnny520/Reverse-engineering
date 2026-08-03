package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public class C7598 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.C7598> CREATOR = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.util.List<java.lang.String> f29269;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.util.List<androidx.fragment.app.C7596> f29270;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟$ۥ, reason: contains not printable characters */
    public class C7599 implements android.os.Parcelable.Creator<androidx.fragment.app.C7598> {
        public C7599() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.C7598 createFromParcel(android.os.Parcel r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟۟ r1 = r0.m29296(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.C7598[] newArray(int r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟۟[] r1 = r0.m29297(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.fragment.app.C7598 m29296(android.os.Parcel r2) {
                r1 = this;
                androidx.fragment.app.ۥ۟۟ r0 = new androidx.fragment.app.ۥ۟۟
                r0.<init>(r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.fragment.app.C7598[] m29297(int r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟۟[] r1 = new androidx.fragment.app.C7598[r1]
                return r1
        }
    }

    static {
            androidx.fragment.app.ۥ۟۟$ۥ r0 = new androidx.fragment.app.ۥ۟۟$ۥ
            r0.<init>()
            androidx.fragment.app.C7598.CREATOR = r0
            return
    }

    public C7598(@Yue.InterfaceC4410 android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f29269 = r0
            android.os.Parcelable$Creator<androidx.fragment.app.ۥ۟> r0 = androidx.fragment.app.C7596.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f29270 = r2
            return
    }

    public C7598(java.util.List<java.lang.String> r1, java.util.List<androidx.fragment.app.C7596> r2) {
            r0 = this;
            r0.<init>()
            r0.f29269 = r1
            r0.f29270 = r2
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
            java.util.List<java.lang.String> r2 = r0.f29269
            r1.writeStringList(r2)
            java.util.List<androidx.fragment.app.ۥ۟> r2 = r0.f29270
            r1.writeTypedList(r2)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.List<androidx.fragment.app.C7595> m29295(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r9, java.util.Map<java.lang.String, androidx.fragment.app.Fragment> r10) {
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.List<java.lang.String> r1 = r8.f29269
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = r8.f29269
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L2b
            java.lang.String r2 = r3.mWho
            r0.put(r2, r3)
            goto L11
        L2b:
            androidx.fragment.app.ۥ۟۟۠ r3 = r9.m29161()
            r4 = 0
            android.os.Bundle r2 = r3.m29431(r2, r4)
            if (r2 == 0) goto L11
            Yue.ۥ۠ۢۨ r3 = r9.m29163()
            android.content.Context r3 = r3.m12114()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.String r4 = "state"
            android.os.Parcelable r4 = r2.getParcelable(r4)
            androidx.fragment.app.ۥ۟۟۟ۦ r4 = (androidx.fragment.app.C7625) r4
            androidx.fragment.app.ۥ۟۟۟ۡ r5 = r9.m29160()
            androidx.fragment.app.Fragment r4 = r4.m29377(r5, r3)
            r4.mSavedFragmentState = r2
            java.lang.String r5 = "savedInstanceState"
            android.os.Bundle r6 = r2.getBundle(r5)
            if (r6 != 0) goto L66
            android.os.Bundle r6 = r4.mSavedFragmentState
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r6.putBundle(r5, r7)
        L66:
            java.lang.String r5 = "arguments"
            android.os.Bundle r2 = r2.getBundle(r5)
            if (r2 == 0) goto L71
            r2.setClassLoader(r3)
        L71:
            r4.setArguments(r2)
            java.lang.String r2 = r4.mWho
            r0.put(r2, r4)
            goto L11
        L7a:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List<androidx.fragment.app.ۥ۟> r1 = r8.f29270
            java.util.Iterator r1 = r1.iterator()
        L85:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L99
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥ۟ r2 = (androidx.fragment.app.C7596) r2
            androidx.fragment.app.ۥ r2 = r2.m29292(r9, r0)
            r10.add(r2)
            goto L85
        L99:
            return r10
    }
}
