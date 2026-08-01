package androidx.versionedparcelable;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1905 f343;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 5
            r0.<init>(r1)
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    public ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            ᛸᲁᲈᛳ r0 = new ᛸᲁᲈᛳ
            r0.<init>(r2)
            ᲁᛸᲇᛸ r2 = r0.m356()
            r1.f343 = r2
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
            ᛸᲁᲈᛳ r2 = new ᛸᲁᲈᛳ
            r2.<init>(r1)
            ᲁᛸᲇᛸ r0 = r0.f343
            r2.m349(r0)
            return
    }
}
