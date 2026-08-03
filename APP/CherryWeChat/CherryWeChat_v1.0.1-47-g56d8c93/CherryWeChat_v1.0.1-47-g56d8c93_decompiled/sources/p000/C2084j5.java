package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: j5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2084j5 implements Parcelable {
    public static final Parcelable.Creator<C2084j5> CREATOR = new C0646P0(3);

    /* JADX INFO: renamed from: a */
    public final ArrayList f7344a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f7345b;

    public C2084j5(Parcel parcel) {
        this.f7344a = parcel.createStringArrayList();
        this.f7345b = parcel.createTypedArrayList(C1527i5.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f7344a);
        parcel.writeTypedList(this.f7345b);
    }
}
