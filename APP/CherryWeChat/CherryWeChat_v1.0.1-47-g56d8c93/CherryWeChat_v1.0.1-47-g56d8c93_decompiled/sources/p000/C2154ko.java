package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ko */
/* JADX INFO: loaded from: classes.dex */
public final class C2154ko implements Parcelable {
    public static final Parcelable.Creator<C2154ko> CREATOR = new C0646P0(10);

    /* JADX INFO: renamed from: a */
    public int f7531a;

    /* JADX INFO: renamed from: b */
    public int f7532b;

    /* JADX INFO: renamed from: c */
    public boolean f7533c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7531a);
        parcel.writeInt(this.f7532b);
        parcel.writeInt(this.f7533c ? 1 : 0);
    }
}
