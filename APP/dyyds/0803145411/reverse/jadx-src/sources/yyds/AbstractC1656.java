package yyds;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: yyds.ᛷᲇᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1656 implements Parcelable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Parcelable f8458;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C1999 f8457 = new C1999();
    public static final Parcelable.Creator<AbstractC1656> CREATOR = new C1580(0);

    public AbstractC1656(Parcelable parcelable) {
        if (parcelable != null) {
            this.f8458 = parcelable == f8457 ? null : parcelable;
        } else {
            C0188.m798("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8458, i);
    }

    public AbstractC1656() {
        this.f8458 = null;
    }

    public AbstractC1656(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f8458 = parcelable == null ? f8457 : parcelable;
    }
}
