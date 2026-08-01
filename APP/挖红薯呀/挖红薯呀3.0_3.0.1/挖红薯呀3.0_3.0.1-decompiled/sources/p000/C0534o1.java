package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: renamed from: o1 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0534o1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4382a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4382a) {
            case 0:
                parcel.getClass();
                return new C0599p1(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new C0097cm(parcel.readInt());
            case 2:
                return new ParcelImpl(parcel);
            case 3:
                return new cp0(parcel.readFloat());
            case 4:
                return new dp0(parcel.readInt());
            default:
                return new ep0(parcel.readLong());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4382a) {
            case 0:
                return new C0599p1[i];
            case 1:
                return new C0097cm[i];
            case 2:
                return new ParcelImpl[i];
            case 3:
                return new cp0[i];
            case 4:
                return new dp0[i];
            default:
                return new ep0[i];
        }
    }
}
