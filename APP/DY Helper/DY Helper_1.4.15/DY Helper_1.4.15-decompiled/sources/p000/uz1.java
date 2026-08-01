package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class uz1 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.uz1> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public int f11034;

    /* JADX INFO: renamed from: ζ */
    public int f11035;

    /* JADX INFO: renamed from: η */
    public int f11036;

    /* JADX INFO: renamed from: θ */
    public int[] f11037;

    /* JADX INFO: renamed from: ι */
    public int f11038;

    /* JADX INFO: renamed from: κ */
    public int[] f11039;

    /* JADX INFO: renamed from: λ */
    public java.util.ArrayList f11040;

    /* JADX INFO: renamed from: μ */
    public boolean f11041;

    /* JADX INFO: renamed from: ν */
    public boolean f11042;

    /* JADX INFO: renamed from: ξ */
    public boolean f11043;

    static {
            j r0 = new j
            r1 = 15
            r0.<init>(r1)
            p000.uz1.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.f11034
            r1.writeInt(r2)
            int r2 = r0.f11035
            r1.writeInt(r2)
            int r2 = r0.f11036
            r1.writeInt(r2)
            int r2 = r0.f11036
            if (r2 <= 0) goto L18
            int[] r2 = r0.f11037
            r1.writeIntArray(r2)
        L18:
            int r2 = r0.f11038
            r1.writeInt(r2)
            int r2 = r0.f11038
            if (r2 <= 0) goto L26
            int[] r2 = r0.f11039
            r1.writeIntArray(r2)
        L26:
            boolean r2 = r0.f11041
            r1.writeInt(r2)
            boolean r2 = r0.f11042
            r1.writeInt(r2)
            boolean r2 = r0.f11043
            r1.writeInt(r2)
            java.util.ArrayList r0 = r0.f11040
            r1.writeList(r0)
            return
    }
}
