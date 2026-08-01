package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: br */
/* JADX INFO: loaded from: classes.dex */
public final class C0078br implements Parcelable {
    public static final Parcelable.Creator<C0078br> CREATOR = new C0728t1(8);

    /* JADX INFO: renamed from: a */
    public int f753a;

    /* JADX INFO: renamed from: b */
    public int f754b;

    /* JADX INFO: renamed from: c */
    public boolean f755c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f753a);
        parcel.writeInt(this.f754b);
        parcel.writeInt(this.f755c ? 1 : 0);
    }
}
