package p064M1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import p117X2.AbstractC1665j;
import p157f.C2064a;

/* JADX INFO: renamed from: M1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0994a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3070a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3070a) {
            case 0:
                return new ParcelImpl(parcel);
            default:
                AbstractC1665j.m2985e(parcel, "parcel");
                return new C2064a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f3070a) {
            case 0:
                return new ParcelImpl[i5];
            default:
                return new C2064a[i5];
        }
    }
}
