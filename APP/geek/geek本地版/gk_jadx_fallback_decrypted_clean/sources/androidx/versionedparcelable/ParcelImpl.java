package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;
    public final defpackage.l90 a;

    static {
            t1 r0 = new t1
            r1 = 12
            r0.<init>(r1)
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    public ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            k90 r0 = new k90
            r0.<init>(r2)
            l90 r2 = r0.g()
            r1.a = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            k90 r2 = new k90
            r2.<init>(r1)
            l90 r1 = r0.a
            r2.i(r1)
            return
    }
}
