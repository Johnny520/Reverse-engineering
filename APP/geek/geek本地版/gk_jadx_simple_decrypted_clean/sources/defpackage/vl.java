package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class vl implements Parcelable {
    public static final Parcelable.Creator<vl> CREATOR = null;
    public String a;
    public int b;

    static {
        CREATOR = new t1(5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.a);
        r1.writeInt(this.b);
    }
}
