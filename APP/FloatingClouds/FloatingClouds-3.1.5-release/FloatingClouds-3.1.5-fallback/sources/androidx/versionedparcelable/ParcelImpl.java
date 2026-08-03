package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0289ng f1037a;

    public static class a implements android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public final androidx.versionedparcelable.ParcelImpl createFromParcel(android.os.Parcel r2) {
                r1 = this;
                androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final androidx.versionedparcelable.ParcelImpl[] newArray(int r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl[] r1 = new androidx.versionedparcelable.ParcelImpl[r1]
                return r1
        }
    }

    static {
            androidx.versionedparcelable.ParcelImpl$a r0 = new androidx.versionedparcelable.ParcelImpl$a
            r0.<init>()
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    public ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            a.mg r0 = new a.mg
            r0.<init>(r2)
            a.ng r2 = r0.l()
            r1.f1037a = r2
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
            a.mg r2 = new a.mg
            r2.<init>(r1)
            a.ng r1 = r0.f1037a
            r2.t(r1)
            return
    }
}
