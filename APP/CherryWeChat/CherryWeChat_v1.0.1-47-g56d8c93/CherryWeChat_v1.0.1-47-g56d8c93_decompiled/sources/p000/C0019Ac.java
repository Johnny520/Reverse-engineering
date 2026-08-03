package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: Ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0019Ac implements Parcelable {
    public static final Parcelable.Creator<C0019Ac> CREATOR = new C0646P0(5);

    /* JADX INFO: renamed from: a */
    public final long f36a;

    public C0019Ac(long j) {
        this.f36a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0019Ac) && this.f36a == ((C0019Ac) obj).f36a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f36a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f36a);
    }
}
