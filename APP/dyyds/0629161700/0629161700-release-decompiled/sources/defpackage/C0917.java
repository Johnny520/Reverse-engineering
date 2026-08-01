package defpackage;

/* JADX INFO: renamed from: ᛵᛶᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0917 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.C0917> CREATOR = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int[] f4157;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f4158;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f4159;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f4160;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 11
            r0.<init>(r1)
            defpackage.C0917.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FullSpanItem{mPosition="
            r0.<init>(r1)
            int r1 = r2.f4159
            r0.append(r1)
            java.lang.String r1 = ", mGapDir="
            r0.append(r1)
            int r1 = r2.f4158
            r0.append(r1)
            java.lang.String r1 = ", mHasUnwantedGapAfter="
            r0.append(r1)
            boolean r1 = r2.f4160
            r0.append(r1)
            java.lang.String r1 = ", mGapPerSpan="
            r0.append(r1)
            int[] r2 = r2.f4157
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r3 = r1.f4159
            r2.writeInt(r3)
            int r3 = r1.f4158
            r2.writeInt(r3)
            boolean r3 = r1.f4160
            r2.writeInt(r3)
            int[] r3 = r1.f4157
            if (r3 == 0) goto L20
            int r0 = r3.length
            if (r0 <= 0) goto L20
            int r3 = r3.length
            r2.writeInt(r3)
            int[] r1 = r1.f4157
            r2.writeIntArray(r1)
            return
        L20:
            r1 = 0
            r2.writeInt(r1)
            return
    }
}
