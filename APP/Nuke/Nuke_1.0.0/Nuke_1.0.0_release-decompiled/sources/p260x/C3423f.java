package p260x;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: x.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3423f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C3424g(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        return new C3424g[i5];
    }
}
