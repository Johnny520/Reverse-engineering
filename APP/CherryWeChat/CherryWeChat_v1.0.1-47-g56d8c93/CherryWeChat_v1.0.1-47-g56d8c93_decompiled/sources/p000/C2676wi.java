package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: wi */
/* JADX INFO: loaded from: classes.dex */
public final class C2676wi implements Parcelable {
    public static final Parcelable.Creator<C2676wi> CREATOR = new C0646P0(6);

    /* JADX INFO: renamed from: a */
    public String f9236a;

    /* JADX INFO: renamed from: b */
    public int f9237b;

    public C2676wi(String str, int i) {
        this.f9236a = str;
        this.f9237b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9236a);
        parcel.writeInt(this.f9237b);
    }
}
