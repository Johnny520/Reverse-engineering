package defpackage;

/* JADX INFO: renamed from: ᛴᛶᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0690 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.C0690> CREATOR = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public long f3315;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f3316;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f3317;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public long f3318;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.String f3319;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f3320;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 2
            r0.<init>(r1)
            defpackage.C0690.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r3.dataPosition()
            r0 = 0
            r3.writeInt(r0)
            long r0 = r2.f3318
            r3.writeLong(r0)
            int r0 = r2.f3317
            r3.writeInt(r0)
            int r0 = r2.f3316
            r3.writeInt(r0)
            java.lang.String r0 = r2.f3319
            r3.writeString(r0)
            int r0 = r2.f3320
            r3.writeInt(r0)
            long r0 = r2.f3315
            r3.writeLong(r0)
            int r2 = r3.dataPosition()
            r3.setDataPosition(r4)
            int r4 = r2 - r4
            r3.writeInt(r4)
            r3.setDataPosition(r2)
            return
    }
}
