package p260x;

import android.os.Parcel;
import android.os.Parcelable;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: x.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3424g implements Parcelable {
    public static final Parcelable.Creator<C3424g> CREATOR = new C3423f();

    /* JADX INFO: renamed from: d */
    public final int f10704d;

    public C3424g(int i5) {
        this.f10704d = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3424g) && this.f10704d == ((C3424g) obj).f10704d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10704d);
    }

    public final String toString() {
        return AbstractC3202a.m5466a(new StringBuilder("DefaultLazyKey(index="), this.f10704d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f10704d);
    }
}
