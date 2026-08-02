package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new e5(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new u50(parcel.readInt());
            case 2:
                return new ParcelImpl(parcel);
            case 3:
                return new jx1(parcel.readFloat());
            case 4:
                return new kx1(parcel.readInt());
            default:
                return new lx1(parcel.readLong());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new e5[i];
            case 1:
                return new u50[i];
            case 2:
                return new ParcelImpl[i];
            case 3:
                return new jx1[i];
            case 4:
                return new kx1[i];
            default:
                return new lx1[i];
        }
    }
}
