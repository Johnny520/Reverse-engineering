package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class C7596 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.C7596> CREATOR = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final java.lang.String f29254 = "FragmentManager";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int[] f29255;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.util.ArrayList<java.lang.String> f29256;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int[] f29257;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int[] f29258;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f29259;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final java.lang.String f29260;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int f29261;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final int f29262;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final java.lang.CharSequence f29263;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final int f29264;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final java.lang.CharSequence f29265;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final java.util.ArrayList<java.lang.String> f29266;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final java.util.ArrayList<java.lang.String> f29267;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final boolean f29268;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟$ۥ, reason: contains not printable characters */
    public class C7597 implements android.os.Parcelable.Creator<androidx.fragment.app.C7596> {
        public C7597() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.C7596 createFromParcel(android.os.Parcel r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟ r1 = r0.m29293(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.C7596[] newArray(int r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟[] r1 = r0.m29294(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.fragment.app.C7596 m29293(android.os.Parcel r2) {
                r1 = this;
                androidx.fragment.app.ۥ۟ r0 = new androidx.fragment.app.ۥ۟
                r0.<init>(r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.fragment.app.C7596[] m29294(int r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟[] r1 = new androidx.fragment.app.C7596[r1]
                return r1
        }
    }

    static {
            androidx.fragment.app.ۥ۟$ۥ r0 = new androidx.fragment.app.ۥ۟$ۥ
            r0.<init>()
            androidx.fragment.app.C7596.CREATOR = r0
            return
    }

    public C7596(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int[] r0 = r3.createIntArray()
            r2.f29255 = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.f29256 = r0
            int[] r0 = r3.createIntArray()
            r2.f29257 = r0
            int[] r0 = r3.createIntArray()
            r2.f29258 = r0
            int r0 = r3.readInt()
            r2.f29259 = r0
            java.lang.String r0 = r3.readString()
            r2.f29260 = r0
            int r0 = r3.readInt()
            r2.f29261 = r0
            int r0 = r3.readInt()
            r2.f29262 = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r1 = r0.createFromParcel(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.f29263 = r1
            int r1 = r3.readInt()
            r2.f29264 = r1
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.f29265 = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.f29266 = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.f29267 = r0
            int r3 = r3.readInt()
            if (r3 == 0) goto L5f
            r3 = 1
            goto L60
        L5f:
            r3 = 0
        L60:
            r2.f29268 = r3
            return
    }

    public C7596(androidx.fragment.app.C7595 r9) {
            r8 = this;
            r8.<init>()
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r0 = r9.f29396
            int r0 = r0.size()
            int r1 = r0 * 6
            int[] r1 = new int[r1]
            r8.f29255 = r1
            boolean r1 = r9.f29402
            if (r1 == 0) goto La3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r8.f29256 = r1
            int[] r1 = new int[r0]
            r8.f29257 = r1
            int[] r1 = new int[r0]
            r8.f29258 = r1
            r1 = 0
            r2 = r1
        L24:
            if (r1 >= r0) goto L7a
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r3 = r9.f29396
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r3 = (androidx.fragment.app.AbstractC7632.C7633) r3
            int[] r4 = r8.f29255
            int r5 = r2 + 1
            int r6 = r3.f29413
            r4[r2] = r6
            java.util.ArrayList<java.lang.String> r4 = r8.f29256
            androidx.fragment.app.Fragment r6 = r3.f29414
            if (r6 == 0) goto L3f
            java.lang.String r6 = r6.mWho
            goto L40
        L3f:
            r6 = 0
        L40:
            r4.add(r6)
            int[] r4 = r8.f29255
            int r6 = r2 + 2
            boolean r7 = r3.f29415
            r4[r5] = r7
            int r5 = r2 + 3
            int r7 = r3.f29416
            r4[r6] = r7
            int r6 = r2 + 4
            int r7 = r3.f29417
            r4[r5] = r7
            int r5 = r2 + 5
            int r7 = r3.f29418
            r4[r6] = r7
            int r2 = r2 + 6
            int r6 = r3.f29419
            r4[r5] = r6
            int[] r4 = r8.f29257
            androidx.lifecycle.Lifecycle$State r5 = r3.f29420
            int r5 = r5.ordinal()
            r4[r1] = r5
            int[] r4 = r8.f29258
            androidx.lifecycle.Lifecycle$State r3 = r3.f29421
            int r3 = r3.ordinal()
            r4[r1] = r3
            int r1 = r1 + 1
            goto L24
        L7a:
            int r0 = r9.f29401
            r8.f29259 = r0
            java.lang.String r0 = r9.f29404
            r8.f29260 = r0
            int r0 = r9.f29252
            r8.f29261 = r0
            int r0 = r9.f29405
            r8.f29262 = r0
            java.lang.CharSequence r0 = r9.f29406
            r8.f29263 = r0
            int r0 = r9.f29407
            r8.f29264 = r0
            java.lang.CharSequence r0 = r9.f29408
            r8.f29265 = r0
            java.util.ArrayList<java.lang.String> r0 = r9.f29409
            r8.f29266 = r0
            java.util.ArrayList<java.lang.String> r0 = r9.f29410
            r8.f29267 = r0
            boolean r9 = r9.f29411
            r8.f29268 = r9
            return
        La3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not on back stack"
            r9.<init>(r0)
            throw r9
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
            int[] r3 = r1.f29255
            r2.writeIntArray(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.f29256
            r2.writeStringList(r3)
            int[] r3 = r1.f29257
            r2.writeIntArray(r3)
            int[] r3 = r1.f29258
            r2.writeIntArray(r3)
            int r3 = r1.f29259
            r2.writeInt(r3)
            java.lang.String r3 = r1.f29260
            r2.writeString(r3)
            int r3 = r1.f29261
            r2.writeInt(r3)
            int r3 = r1.f29262
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.f29263
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.f29264
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.f29265
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList<java.lang.String> r3 = r1.f29266
            r2.writeStringList(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.f29267
            r2.writeStringList(r3)
            boolean r3 = r1.f29268
            r2.writeInt(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m29290(@Yue.InterfaceC4410 androidx.fragment.app.C7595 r10) {
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int[] r3 = r9.f29255
            int r3 = r3.length
            r4 = 1
            if (r1 >= r3) goto L92
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r3 = new androidx.fragment.app.ۥ۟۟۠۟$ۥ
            r3.<init>()
            int[] r5 = r9.f29255
            int r6 = r1 + 1
            r5 = r5[r1]
            r3.f29413 = r5
            r5 = 2
            boolean r5 = androidx.fragment.app.FragmentManager.m29090(r5)
            if (r5 == 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Instantiate "
            r5.append(r7)
            r5.append(r10)
            java.lang.String r7 = " op #"
            r5.append(r7)
            r5.append(r2)
            java.lang.String r7 = " base fragment #"
            r5.append(r7)
            int[] r7 = r9.f29255
            r7 = r7[r6]
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "FragmentManager"
            android.util.Log.v(r7, r5)
        L47:
            androidx.lifecycle.Lifecycle$State[] r5 = androidx.lifecycle.Lifecycle.State.values()
            int[] r7 = r9.f29257
            r7 = r7[r2]
            r5 = r5[r7]
            r3.f29420 = r5
            androidx.lifecycle.Lifecycle$State[] r5 = androidx.lifecycle.Lifecycle.State.values()
            int[] r7 = r9.f29258
            r7 = r7[r2]
            r5 = r5[r7]
            r3.f29421 = r5
            int[] r5 = r9.f29255
            int r7 = r1 + 2
            r6 = r5[r6]
            if (r6 == 0) goto L68
            goto L69
        L68:
            r4 = r0
        L69:
            r3.f29415 = r4
            int r4 = r1 + 3
            r6 = r5[r7]
            r3.f29416 = r6
            int r7 = r1 + 4
            r4 = r5[r4]
            r3.f29417 = r4
            int r8 = r1 + 5
            r7 = r5[r7]
            r3.f29418 = r7
            int r1 = r1 + 6
            r5 = r5[r8]
            r3.f29419 = r5
            r10.f29397 = r6
            r10.f29398 = r4
            r10.f29399 = r7
            r10.f29400 = r5
            r10.m29439(r3)
            int r2 = r2 + 1
            goto L3
        L92:
            int r0 = r9.f29259
            r10.f29401 = r0
            java.lang.String r0 = r9.f29260
            r10.f29404 = r0
            r10.f29402 = r4
            int r0 = r9.f29262
            r10.f29405 = r0
            java.lang.CharSequence r0 = r9.f29263
            r10.f29406 = r0
            int r0 = r9.f29264
            r10.f29407 = r0
            java.lang.CharSequence r0 = r9.f29265
            r10.f29408 = r0
            java.util.ArrayList<java.lang.String> r0 = r9.f29266
            r10.f29409 = r0
            java.util.ArrayList<java.lang.String> r0 = r9.f29267
            r10.f29410 = r0
            boolean r0 = r9.f29268
            r10.f29411 = r0
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public androidx.fragment.app.C7595 m29291(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r5) {
            r4 = this;
            androidx.fragment.app.ۥ r0 = new androidx.fragment.app.ۥ
            r0.<init>(r5)
            r4.m29290(r0)
            int r1 = r4.f29261
            r0.f29252 = r1
            r1 = 0
        Ld:
            java.util.ArrayList<java.lang.String> r2 = r4.f29256
            int r2 = r2.size()
            if (r1 >= r2) goto L30
            java.util.ArrayList<java.lang.String> r2 = r4.f29256
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L2d
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r3 = r0.f29396
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r3 = (androidx.fragment.app.AbstractC7632.C7633) r3
            androidx.fragment.app.Fragment r2 = r5.m29144(r2)
            r3.f29414 = r2
        L2d:
            int r1 = r1 + 1
            goto Ld
        L30:
            r5 = 1
            r0.m29280(r5)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public androidx.fragment.app.C7595 m29292(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r4, @Yue.InterfaceC4410 java.util.Map<java.lang.String, androidx.fragment.app.Fragment> r5) {
            r3 = this;
            androidx.fragment.app.ۥ r0 = new androidx.fragment.app.ۥ
            r0.<init>(r4)
            r3.m29290(r0)
            r4 = 0
        L9:
            java.util.ArrayList<java.lang.String> r1 = r3.f29256
            int r1 = r1.size()
            if (r4 >= r1) goto L57
            java.util.ArrayList<java.lang.String> r1 = r3.f29256
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L54
            java.lang.Object r2 = r5.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L2e
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r1 = r0.f29396
            java.lang.Object r1 = r1.get(r4)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r1 = (androidx.fragment.app.AbstractC7632.C7633) r1
            r1.f29414 = r2
            goto L54
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Restoring FragmentTransaction "
            r5.append(r0)
            java.lang.String r0 = r3.f29260
            r5.append(r0)
            java.lang.String r0 = " failed due to missing saved state for Fragment ("
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = ")"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L54:
            int r4 = r4 + 1
            goto L9
        L57:
            return r0
    }
}
