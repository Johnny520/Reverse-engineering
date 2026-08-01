package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cs0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.cs0> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public int f2734;

    /* JADX INFO: renamed from: ζ */
    public int f2735;

    /* JADX INFO: renamed from: η */
    public boolean f2736;

    static {
            j r0 = new j
            r1 = 8
            r0.<init>(r1)
            p000.cs0.CREATOR = r0
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
            int r2 = r0.f2734
            r1.writeInt(r2)
            int r2 = r0.f2735
            r1.writeInt(r2)
            boolean r0 = r0.f2736
            r1.writeInt(r0)
            return
    }
}
