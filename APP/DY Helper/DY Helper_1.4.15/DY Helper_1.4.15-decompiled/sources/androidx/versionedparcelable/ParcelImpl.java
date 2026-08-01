package androidx.versionedparcelable;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public final p000.x72 f1200;

    static {
            j r0 = new j
            r1 = 10
            r0.<init>(r1)
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    public ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            w72 r0 = new w72
            r0.<init>(r2)
            x72 r2 = r0.m6059()
            r1.f1200 = r2
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
            w72 r2 = new w72
            r2.<init>(r1)
            x72 r0 = r0.f1200
            r2.m6061(r0)
            return
    }
}
