package p010F;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: F.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0112c implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Parcelable f407a;

    /* JADX INFO: renamed from: b */
    public static final C0110a f406b = new C0110a();
    public static final Parcelable.Creator<AbstractC0112c> CREATOR = new C0111b(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0112c() {
        this.f407a = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f407a, i2);
    }

    public AbstractC0112c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f407a = parcelable == f406b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0112c(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f407a = parcelable == null ? f406b : parcelable;
    }
}
