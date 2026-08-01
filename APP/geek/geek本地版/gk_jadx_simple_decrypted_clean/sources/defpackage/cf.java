package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cf implements Parcelable {
    public static final Parcelable.Creator<cf> CREATOR = null;
    public final long a;

    static {
        CREATOR = new t1(4);
    }

    public cf(long r1) {
        this.a = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof cf) == true) goto L9;
        return false;
    L9:
        if (this.a != ((cf) r8).a) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeLong(this.a);
    }
}
