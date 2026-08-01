package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: xl */
/* JADX INFO: loaded from: classes.dex */
public final class C0897xl implements Parcelable {
    public static final Parcelable.Creator<C0897xl> CREATOR = new C0728t1(5);

    /* JADX INFO: renamed from: a */
    public String f5271a;

    /* JADX INFO: renamed from: b */
    public int f5272b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5271a);
        parcel.writeInt(this.f5272b);
    }
}
