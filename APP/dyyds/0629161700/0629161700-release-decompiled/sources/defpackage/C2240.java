package defpackage;

/* JADX INFO: renamed from: ᲈᛵᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2240 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.C2240> CREATOR = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int[] f9538;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f9539;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f9540;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public java.util.ArrayList f9541;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f9542;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f9543;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f9544;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean f9545;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int[] f9546;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f9547;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 12
            r0.<init>(r1)
            defpackage.C2240.CREATOR = r0
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
            int r2 = r0.f9544
            r1.writeInt(r2)
            int r2 = r0.f9543
            r1.writeInt(r2)
            int r2 = r0.f9542
            r1.writeInt(r2)
            int r2 = r0.f9542
            if (r2 <= 0) goto L18
            int[] r2 = r0.f9546
            r1.writeIntArray(r2)
        L18:
            int r2 = r0.f9547
            r1.writeInt(r2)
            int r2 = r0.f9547
            if (r2 <= 0) goto L26
            int[] r2 = r0.f9538
            r1.writeIntArray(r2)
        L26:
            boolean r2 = r0.f9545
            r1.writeInt(r2)
            boolean r2 = r0.f9539
            r1.writeInt(r2)
            boolean r2 = r0.f9540
            r1.writeInt(r2)
            java.util.ArrayList r0 = r0.f9541
            r1.writeList(r0)
            return
    }
}
