package yyds;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: yyds.ᛴᲁᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0968 extends AbstractC1656 {
    public static final Parcelable.Creator<C0968> CREATOR = new C1580(3);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f4448;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f4449;

    public C0968(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4448 = parcel.readInt();
        this.f4449 = parcel.readInt() != 0;
    }

    @Override // yyds.AbstractC1656, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4448);
        parcel.writeInt(this.f4449 ? 1 : 0);
    }
}
