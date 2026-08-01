package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h70 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.h70> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f4595;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f4596;

    /* JADX INFO: renamed from: η */
    public final boolean f4597;

    /* JADX INFO: renamed from: θ */
    public final int f4598;

    /* JADX INFO: renamed from: ι */
    public final int f4599;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f4600;

    /* JADX INFO: renamed from: λ */
    public final boolean f4601;

    /* JADX INFO: renamed from: μ */
    public final boolean f4602;

    /* JADX INFO: renamed from: ν */
    public final boolean f4603;

    /* JADX INFO: renamed from: ξ */
    public final boolean f4604;

    /* JADX INFO: renamed from: ο */
    public final int f4605;

    /* JADX INFO: renamed from: π */
    public final java.lang.String f4606;

    /* JADX INFO: renamed from: ρ */
    public final int f4607;

    /* JADX INFO: renamed from: σ */
    public final boolean f4608;

    static {
            j r0 = new j
            r1 = 6
            r0.<init>(r1)
            p000.h70.CREATOR = r0
            return
    }

    public h70(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.f4595 = r0
            java.lang.String r0 = r4.readString()
            r3.f4596 = r0
            int r0 = r4.readInt()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            r3.f4597 = r0
            int r0 = r4.readInt()
            r3.f4598 = r0
            int r0 = r4.readInt()
            r3.f4599 = r0
            java.lang.String r0 = r4.readString()
            r3.f4600 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r1
        L37:
            r3.f4601 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L41
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            r3.f4602 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L4c
            r0 = r2
            goto L4d
        L4c:
            r0 = r1
        L4d:
            r3.f4603 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L57
            r0 = r2
            goto L58
        L57:
            r0 = r1
        L58:
            r3.f4604 = r0
            int r0 = r4.readInt()
            r3.f4605 = r0
            java.lang.String r0 = r4.readString()
            r3.f4606 = r0
            int r0 = r4.readInt()
            r3.f4607 = r0
            int r4 = r4.readInt()
            if (r4 == 0) goto L73
            r1 = r2
        L73:
            r3.f4608 = r1
            return
    }

    public h70(p000.n60 r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.f4595 = r0
            java.lang.String r0 = r2.f7426
            r1.f4596 = r0
            boolean r0 = r2.f7434
            r1.f4597 = r0
            int r0 = r2.f7401
            r1.f4598 = r0
            int r0 = r2.f7402
            r1.f4599 = r0
            java.lang.String r0 = r2.f7403
            r1.f4600 = r0
            boolean r0 = r2.f7406
            r1.f4601 = r0
            boolean r0 = r2.f7433
            r1.f4602 = r0
            boolean r0 = r2.f7405
            r1.f4603 = r0
            boolean r0 = r2.f7404
            r1.f4604 = r0
            cr0 r0 = r2.f7416
            int r0 = r0.ordinal()
            r1.f4605 = r0
            java.lang.String r0 = r2.f7429
            r1.f4606 = r0
            int r0 = r2.f7430
            r1.f4607 = r0
            boolean r2 = r2.f7411
            r1.f4608 = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentState{"
            r0.append(r1)
            java.lang.String r1 = r3.f4595
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r3.f4596
            r0.append(r1)
            java.lang.String r1 = ")}:"
            r0.append(r1)
            boolean r1 = r3.f4597
            if (r1 == 0) goto L29
            java.lang.String r1 = " fromLayout"
            r0.append(r1)
        L29:
            int r1 = r3.f4599
            if (r1 == 0) goto L39
            java.lang.String r2 = " id=0x"
            r0.append(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L39:
            java.lang.String r1 = r3.f4600
            if (r1 == 0) goto L4b
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L4b
            java.lang.String r2 = " tag="
            r0.append(r2)
            r0.append(r1)
        L4b:
            boolean r1 = r3.f4601
            if (r1 == 0) goto L54
            java.lang.String r1 = " retainInstance"
            r0.append(r1)
        L54:
            boolean r1 = r3.f4602
            if (r1 == 0) goto L5d
            java.lang.String r1 = " removing"
            r0.append(r1)
        L5d:
            boolean r1 = r3.f4603
            if (r1 == 0) goto L66
            java.lang.String r1 = " detached"
            r0.append(r1)
        L66:
            boolean r1 = r3.f4604
            if (r1 == 0) goto L6f
            java.lang.String r1 = " hidden"
            r0.append(r1)
        L6f:
            java.lang.String r1 = r3.f4606
            if (r1 == 0) goto L85
            java.lang.String r2 = " targetWho="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " targetRequestCode="
            r0.append(r1)
            int r1 = r3.f4607
            r0.append(r1)
        L85:
            boolean r3 = r3.f4608
            if (r3 == 0) goto L8e
            java.lang.String r3 = " userVisibleHint"
            r0.append(r3)
        L8e:
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f4595
            r1.writeString(r2)
            java.lang.String r2 = r0.f4596
            r1.writeString(r2)
            boolean r2 = r0.f4597
            r1.writeInt(r2)
            int r2 = r0.f4598
            r1.writeInt(r2)
            int r2 = r0.f4599
            r1.writeInt(r2)
            java.lang.String r2 = r0.f4600
            r1.writeString(r2)
            boolean r2 = r0.f4601
            r1.writeInt(r2)
            boolean r2 = r0.f4602
            r1.writeInt(r2)
            boolean r2 = r0.f4603
            r1.writeInt(r2)
            boolean r2 = r0.f4604
            r1.writeInt(r2)
            int r2 = r0.f4605
            r1.writeInt(r2)
            java.lang.String r2 = r0.f4606
            r1.writeString(r2)
            int r2 = r0.f4607
            r1.writeInt(r2)
            boolean r0 = r0.f4608
            r1.writeInt(r0)
            return
    }
}
