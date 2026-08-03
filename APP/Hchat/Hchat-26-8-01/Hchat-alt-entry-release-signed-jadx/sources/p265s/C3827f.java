package p265s;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: s.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3827f implements Parcelable.Creator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C3830g(parcel.readInt());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        return new C3830g[i9];
    }
}
