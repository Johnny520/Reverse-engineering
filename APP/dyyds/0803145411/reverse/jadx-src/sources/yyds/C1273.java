package yyds;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: yyds.ᛶᛱᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1273 implements Parcelable {
    public static final Parcelable.Creator<C1273> CREATOR = new C1499(2);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f5858;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f5859;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f5860;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5859);
        parcel.writeInt(this.f5860);
        parcel.writeInt(this.f5858 ? 1 : 0);
    }
}
