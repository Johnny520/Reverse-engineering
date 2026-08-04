package yyds;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛱᲈᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0265 implements Parcelable {
    public static final Parcelable.Creator<C0265> CREATOR = new C1499(11);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int[] f1453;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public ArrayList f1454;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f1455;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f1456;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f1457;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f1458;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f1459;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f1460;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int[] f1461;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f1462;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1460);
        parcel.writeInt(this.f1462);
        parcel.writeInt(this.f1455);
        if (this.f1455 > 0) {
            parcel.writeIntArray(this.f1461);
        }
        parcel.writeInt(this.f1456);
        if (this.f1456 > 0) {
            parcel.writeIntArray(this.f1453);
        }
        parcel.writeInt(this.f1459 ? 1 : 0);
        parcel.writeInt(this.f1457 ? 1 : 0);
        parcel.writeInt(this.f1458 ? 1 : 0);
        parcel.writeList(this.f1454);
    }
}
