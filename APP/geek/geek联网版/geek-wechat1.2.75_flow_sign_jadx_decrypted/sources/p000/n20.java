package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n20 extends AbstractC0133d {
    public static final Parcelable.Creator<n20> CREATOR = new C0086c(6);

    /* JADX INFO: renamed from: c */
    public boolean f3211c;

    public n20(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3211c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3211c + "}";
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f3211c));
    }
}
