package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: xq */
/* JADX INFO: loaded from: classes.dex */
public final class C0902xq implements Parcelable {
    public static final Parcelable.Creator<C0902xq> CREATOR = new C0729t1(8);

    /* JADX INFO: renamed from: a */
    public int f5182a;

    /* JADX INFO: renamed from: b */
    public int f5183b;

    /* JADX INFO: renamed from: c */
    public boolean f5184c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5182a);
        parcel.writeInt(this.f5183b);
        parcel.writeInt(this.f5184c ? 1 : 0);
    }
}
