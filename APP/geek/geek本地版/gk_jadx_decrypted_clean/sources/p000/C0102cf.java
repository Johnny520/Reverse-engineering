package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: cf */
/* JADX INFO: loaded from: classes.dex */
public final class C0102cf implements Parcelable {
    public static final Parcelable.Creator<C0102cf> CREATOR = new C0729t1(4);

    /* JADX INFO: renamed from: a */
    public final long f956a;

    public C0102cf(long j) {
        this.f956a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0102cf) && this.f956a == ((C0102cf) obj).f956a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f956a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f956a);
    }
}
