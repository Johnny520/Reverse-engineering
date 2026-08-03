package p019K;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.C0023I;

/* JADX INFO: renamed from: K.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0239b implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Parcelable f481a;

    /* JADX INFO: renamed from: b */
    public static final C0238a f480b = new C0238a();
    public static final Parcelable.Creator<AbstractC0239b> CREATOR = new C0023I(1);

    public AbstractC0239b() {
        this.f481a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f481a, i2);
    }

    public AbstractC0239b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f481a = parcelable == f480b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0239b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f481a = parcelable == null ? f480b : parcelable;
    }
}
