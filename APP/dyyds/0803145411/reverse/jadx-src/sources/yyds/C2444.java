package yyds;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: yyds.ᲇᛴᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2444 extends AbstractC1656 {
    public static final Parcelable.Creator<C2444> CREATOR = new C1580(1);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Parcelable f12025;

    public C2444(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12025 = parcel.readParcelable(classLoader == null ? AbstractC2551.class.getClassLoader() : classLoader);
    }

    @Override // yyds.AbstractC1656, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f12025, 0);
    }
}
