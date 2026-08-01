package p069i;

import android.os.Parcel;
import android.os.Parcelable;
import p010F.AbstractC0112c;
import p010F.C0111b;

/* JADX INFO: renamed from: i.Z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0658Z0 extends AbstractC0112c {
    public static final Parcelable.Creator<C0658Z0> CREATOR = new C0111b(1);

    /* JADX INFO: renamed from: c */
    public boolean f2223c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0658Z0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2223c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2223c + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p010F.AbstractC0112c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Boolean.valueOf(this.f2223c));
    }
}
