package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: vl */
/* JADX INFO: loaded from: classes.dex */
public final class C0823vl implements Parcelable {
    public static final Parcelable.Creator<C0823vl> CREATOR = new C0729t1(5);

    /* JADX INFO: renamed from: a */
    public String f4868a;

    /* JADX INFO: renamed from: b */
    public int f4869b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4868a);
        parcel.writeInt(this.f4869b);
    }
}
