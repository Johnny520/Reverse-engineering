package androidx.versionedparcelable;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z3.d f320g;

    static {
            z3.a r0 = new z3.a
            r0.<init>()
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    public ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            z3.c r0 = new z3.c
            r0.<init>(r2)
            z3.d r2 = r0.g()
            r1.f320g = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            z3.c r2 = new z3.c
            r2.<init>(r1)
            z3.d r1 = r0.f320g
            r2.i(r1)
            return
    }
}
