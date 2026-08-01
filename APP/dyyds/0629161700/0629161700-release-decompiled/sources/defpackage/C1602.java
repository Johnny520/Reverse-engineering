package defpackage;

/* JADX INFO: renamed from: ᛸᲈᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1602 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.C1602> CREATOR = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f7089;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f7090;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f7091;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 3
            r0.<init>(r1)
            defpackage.C1602.CREATOR = r0
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
            int r2 = r0.f7091
            r1.writeInt(r2)
            int r2 = r0.f7090
            r1.writeInt(r2)
            boolean r0 = r0.f7089
            r1.writeInt(r0)
            return
    }
}
