package p000;

/* JADX INFO: renamed from: l8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0503l8 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.C0503l8> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public final int[] f6468;

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayList f6469;

    /* JADX INFO: renamed from: η */
    public final int[] f6470;

    /* JADX INFO: renamed from: θ */
    public final int[] f6471;

    /* JADX INFO: renamed from: ι */
    public final int f6472;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f6473;

    /* JADX INFO: renamed from: λ */
    public final int f6474;

    /* JADX INFO: renamed from: μ */
    public final int f6475;

    /* JADX INFO: renamed from: ν */
    public final java.lang.CharSequence f6476;

    /* JADX INFO: renamed from: ξ */
    public final int f6477;

    /* JADX INFO: renamed from: ο */
    public final java.lang.CharSequence f6478;

    /* JADX INFO: renamed from: π */
    public final java.util.ArrayList f6479;

    /* JADX INFO: renamed from: ρ */
    public final java.util.ArrayList f6480;

    /* JADX INFO: renamed from: σ */
    public final boolean f6481;

    static {
            j r0 = new j
            r1 = 2
            r0.<init>(r1)
            p000.C0503l8.CREATOR = r0
            return
    }

    public C0503l8(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int[] r0 = r3.createIntArray()
            r2.f6468 = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.f6469 = r0
            int[] r0 = r3.createIntArray()
            r2.f6470 = r0
            int[] r0 = r3.createIntArray()
            r2.f6471 = r0
            int r0 = r3.readInt()
            r2.f6472 = r0
            java.lang.String r0 = r3.readString()
            r2.f6473 = r0
            int r0 = r3.readInt()
            r2.f6474 = r0
            int r0 = r3.readInt()
            r2.f6475 = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r1 = r0.createFromParcel(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.f6476 = r1
            int r1 = r3.readInt()
            r2.f6477 = r1
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.f6478 = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.f6479 = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.f6480 = r0
            int r3 = r3.readInt()
            if (r3 == 0) goto L5f
            r3 = 1
            goto L60
        L5f:
            r3 = 0
        L60:
            r2.f6481 = r3
            return
    }

    public C0503l8(p000.C0460k8 r9) {
            r8 = this;
            r8.<init>()
            java.util.ArrayList r0 = r9.f5790
            int r0 = r0.size()
            int r1 = r0 * 6
            int[] r1 = new int[r1]
            r8.f6468 = r1
            boolean r1 = r9.f5796
            if (r1 == 0) goto La3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r8.f6469 = r1
            int[] r1 = new int[r0]
            r8.f6470 = r1
            int[] r1 = new int[r0]
            r8.f6471 = r1
            r1 = 0
            r2 = r1
        L24:
            if (r1 >= r0) goto L7a
            java.util.ArrayList r3 = r9.f5790
            java.lang.Object r3 = r3.get(r1)
            m70 r3 = (p000.m70) r3
            int[] r4 = r8.f6468
            int r5 = r2 + 1
            int r6 = r3.f6991
            r4[r2] = r6
            java.util.ArrayList r4 = r8.f6469
            n60 r6 = r3.f6992
            if (r6 == 0) goto L3f
            java.lang.String r6 = r6.f7426
            goto L40
        L3f:
            r6 = 0
        L40:
            r4.add(r6)
            int[] r4 = r8.f6468
            int r6 = r2 + 2
            boolean r7 = r3.f6993
            r4[r5] = r7
            int r5 = r2 + 3
            int r7 = r3.f6994
            r4[r6] = r7
            int r6 = r2 + 4
            int r7 = r3.f6995
            r4[r5] = r7
            int r5 = r2 + 5
            int r7 = r3.f6996
            r4[r6] = r7
            int r2 = r2 + 6
            int r6 = r3.f6997
            r4[r5] = r6
            int[] r4 = r8.f6470
            cr0 r5 = r3.f6998
            int r5 = r5.ordinal()
            r4[r1] = r5
            int[] r4 = r8.f6471
            cr0 r3 = r3.f6999
            int r3 = r3.ordinal()
            r4[r1] = r3
            int r1 = r1 + 1
            goto L24
        L7a:
            int r0 = r9.f5795
            r8.f6472 = r0
            java.lang.String r0 = r9.f5797
            r8.f6473 = r0
            int r0 = r9.f5807
            r8.f6474 = r0
            int r0 = r9.f5798
            r8.f6475 = r0
            java.lang.CharSequence r0 = r9.f5799
            r8.f6476 = r0
            int r0 = r9.f5800
            r8.f6477 = r0
            java.lang.CharSequence r0 = r9.f5801
            r8.f6478 = r0
            java.util.ArrayList r0 = r9.f5802
            r8.f6479 = r0
            java.util.ArrayList r0 = r9.f5803
            r8.f6480 = r0
            boolean r9 = r9.f5804
            r8.f6481 = r9
            return
        La3:
            java.lang.String r8 = "Not on back stack"
            p000.C1080.m7279(r8)
            r8 = 0
            throw r8
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int[] r3 = r1.f6468
            r2.writeIntArray(r3)
            java.util.ArrayList r3 = r1.f6469
            r2.writeStringList(r3)
            int[] r3 = r1.f6470
            r2.writeIntArray(r3)
            int[] r3 = r1.f6471
            r2.writeIntArray(r3)
            int r3 = r1.f6472
            r2.writeInt(r3)
            java.lang.String r3 = r1.f6473
            r2.writeString(r3)
            int r3 = r1.f6474
            r2.writeInt(r3)
            int r3 = r1.f6475
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.f6476
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.f6477
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.f6478
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList r3 = r1.f6479
            r2.writeStringList(r3)
            java.util.ArrayList r3 = r1.f6480
            r2.writeStringList(r3)
            boolean r1 = r1.f6481
            r2.writeInt(r1)
            return
    }
}
