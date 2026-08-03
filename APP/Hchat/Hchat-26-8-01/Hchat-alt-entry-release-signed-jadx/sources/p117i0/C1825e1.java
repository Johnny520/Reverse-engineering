package p117i0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: i0.e1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1825e1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6055a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6055a) {
            case 0:
                return new C1829f1(parcel.readFloat());
            case 1:
                return new C1833g1(parcel.readInt());
            default:
                return new C1837h1(parcel.readLong());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f6055a) {
            case 0:
                return new C1829f1[i9];
            case 1:
                return new C1833g1[i9];
            default:
                return new C1837h1[i9];
        }
    }
}
