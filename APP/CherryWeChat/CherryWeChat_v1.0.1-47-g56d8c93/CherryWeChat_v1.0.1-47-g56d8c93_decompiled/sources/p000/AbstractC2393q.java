package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2393q implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Parcelable f8397a;

    /* JADX INFO: renamed from: b */
    public static final C2299o f8396b = new C2299o();
    public static final Parcelable.Creator<AbstractC2393q> CREATOR = new C2342p(0);

    public AbstractC2393q() {
        this.f8397a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8397a, i);
    }

    public AbstractC2393q(Parcelable parcelable) {
        if (parcelable != null) {
            this.f8397a = parcelable == f8396b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC2393q(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f8397a = parcelable == null ? f8396b : parcelable;
    }
}
