package androidx.versionedparcelable;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0440 f72;

    static {
            xhss.ᛳᲁᛵᛳ r0 = new xhss.ᛳᲁᛵᛳ
            r1 = 1
            r0.<init>(r1)
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    public ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            xhss.ᛱᛸᛵᛳ r0 = new xhss.ᛱᛸᛵᛳ
            r0.<init>(r2)
            xhss.ᛵᛲᛲᛴ r2 = r0.m1151()
            r1.f72 = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            xhss.ᛱᛸᛵᛳ r2 = new xhss.ᛱᛸᛵᛳ
            r2.<init>(r1)
            xhss.ᛵᛲᛲᛴ r0 = r0.f72
            r2.m1150(r0)
            return
    }
}
