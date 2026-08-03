package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: Ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0019Ac implements Parcelable {
    public static final Parcelable.Creator<C0019Ac> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final long f36a;

    static {
        CREATOR = new C0646P0(5);
    }

    public C0019Ac(long r1) {
        this.f36a = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C0019Ac) == true) goto L9;
        return false;
    L9:
        if (this.f36a != ((C0019Ac) r8).f36a) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f36a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeLong(this.f36a);
    }
}
