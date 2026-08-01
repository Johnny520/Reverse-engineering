package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y60 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.y60> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public java.lang.String f12469;

    /* JADX INFO: renamed from: ζ */
    public int f12470;

    static {
            j r0 = new j
            r1 = 4
            r0.<init>(r1)
            p000.y60.CREATOR = r0
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
            java.lang.String r2 = r0.f12469
            r1.writeString(r2)
            int r0 = r0.f12470
            r1.writeInt(r0)
            return
    }
}
