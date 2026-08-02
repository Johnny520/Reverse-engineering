package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: renamed from: d5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0118d5 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1867a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1867a) {
            case 0:
                parcel.getClass();
                return new C0154e5(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
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

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1867a) {
            case 0:
                return new C0154e5[i];
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
