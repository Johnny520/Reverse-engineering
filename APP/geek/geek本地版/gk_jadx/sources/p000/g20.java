package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g20 extends AbstractC0133d {
    public static final Parcelable.Creator<g20> CREATOR = new C0086c(6);

    /* JADX INFO: renamed from: c */
    public boolean f2010c;

    public g20(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2010c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2010c + "}";
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f2010c));
    }
}
