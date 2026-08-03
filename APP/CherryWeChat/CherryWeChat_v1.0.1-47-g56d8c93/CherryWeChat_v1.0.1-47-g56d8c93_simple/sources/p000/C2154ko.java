package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ko */
/* JADX INFO: loaded from: classes.dex */
public final class C2154ko implements Parcelable {
    public static final Parcelable.Creator<C2154ko> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public int f7531a;

    /* JADX INFO: renamed from: b */
    public int f7532b;

    /* JADX INFO: renamed from: c */
    public boolean f7533c;

    static {
        CREATOR = new C0646P0(10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f7531a);
        r1.writeInt(this.f7532b);
        r1.writeInt(this.f7533c ? 1 : 0);
    }
}
