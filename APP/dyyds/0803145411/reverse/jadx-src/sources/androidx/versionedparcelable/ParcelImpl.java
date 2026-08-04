package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import yyds.C1499;
import yyds.C2664;
import yyds.InterfaceC2636;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1499(4);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC2636 f372;

    public ParcelImpl(Parcel parcel) {
        this.f372 = new C2664(parcel).m2365();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C2664(parcel).m2361(this.f372);
    }
}
