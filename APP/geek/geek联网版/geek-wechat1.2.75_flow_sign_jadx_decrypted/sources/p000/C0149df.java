package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: df */
/* JADX INFO: loaded from: classes.dex */
public final class C0149df implements Parcelable {
    public static final Parcelable.Creator<C0149df> CREATOR = new C0728t1(4);

    /* JADX INFO: renamed from: a */
    public final long f1389a;

    public C0149df(long j) {
        this.f1389a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0149df) && this.f1389a == ((C0149df) obj).f1389a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f1389a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1389a);
    }
}
