package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: wi */
/* JADX INFO: loaded from: classes.dex */
public final class C2676wi implements Parcelable {
    public static final Parcelable.Creator<C2676wi> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public String f9236a;

    /* JADX INFO: renamed from: b */
    public int f9237b;

    static {
        CREATOR = new C0646P0(6);
    }

    public C2676wi(String r1, int r2) {
        this.f9236a = r1;
        this.f9237b = r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.f9236a);
        r1.writeInt(this.f9237b);
    }
}
