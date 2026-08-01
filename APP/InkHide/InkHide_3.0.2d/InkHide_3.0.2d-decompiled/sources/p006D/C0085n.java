package p006D;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.C0379a;
import androidx.fragment.app.C0410A;
import androidx.fragment.app.C0413D;
import androidx.fragment.app.C0424b;
import androidx.fragment.app.C0447y;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import p069i.C0643S;

/* JADX INFO: renamed from: D.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0085n implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f358a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f358a) {
            case 0:
                C0086o c0086o = new C0086o(parcel);
                c0086o.f359a = parcel.readInt();
                return c0086o;
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                return new C0379a(parcel);
            case 3:
                return new C0424b(parcel);
            case 4:
                C0447y c0447y = new C0447y();
                c0447y.f1421a = parcel.readString();
                c0447y.f1422b = parcel.readInt();
                return c0447y;
            case 5:
                C0410A c0410a = new C0410A();
                c0410a.f1226e = null;
                c0410a.f1227f = new ArrayList();
                c0410a.f1228g = new ArrayList();
                c0410a.f1222a = parcel.createTypedArrayList(C0413D.CREATOR);
                c0410a.f1223b = parcel.createStringArrayList();
                c0410a.f1224c = (C0424b[]) parcel.createTypedArray(C0424b.CREATOR);
                c0410a.f1225d = parcel.readInt();
                c0410a.f1226e = parcel.readString();
                c0410a.f1227f = parcel.createStringArrayList();
                c0410a.f1228g = parcel.createTypedArrayList(Bundle.CREATOR);
                c0410a.f1229h = parcel.createTypedArrayList(C0447y.CREATOR);
                return c0410a;
            case 6:
                return new C0413D(parcel);
            default:
                C0643S c0643s = new C0643S(parcel);
                c0643s.f2201a = parcel.readByte() != 0;
                return c0643s;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f358a) {
            case 0:
                return new C0086o[i2];
            case 1:
                return new ParcelImpl[i2];
            case 2:
                return new C0379a[i2];
            case 3:
                return new C0424b[i2];
            case 4:
                return new C0447y[i2];
            case 5:
                return new C0410A[i2];
            case 6:
                return new C0413D[i2];
            default:
                return new C0643S[i2];
        }
    }
}
