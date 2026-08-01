package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0133d implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Parcelable f1344a;

    /* JADX INFO: renamed from: b */
    public static final C0050b f1343b = new C0050b();
    public static final Parcelable.Creator<AbstractC0133d> CREATOR = new C0086c(0);

    public AbstractC0133d() {
        this.f1344a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1344a, i);
    }

    public AbstractC0133d(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1344a = parcelable == f1343b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0133d(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1344a = parcelable == null ? f1343b : parcelable;
    }
}
