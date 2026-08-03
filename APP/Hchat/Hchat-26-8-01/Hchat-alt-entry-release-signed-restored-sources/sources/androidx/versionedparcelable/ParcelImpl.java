package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p375z3.C6083a;
import p375z3.C6085c;
import p375z3.InterfaceC6086d;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C6083a();

    /* JADX INFO: renamed from: g */
    public final InterfaceC6086d f320g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParcelImpl(Parcel parcel) {
        this.f320g = new C6085c(parcel).m10822g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        new C6085c(parcel).m10824i(this.f320g);
    }
}
