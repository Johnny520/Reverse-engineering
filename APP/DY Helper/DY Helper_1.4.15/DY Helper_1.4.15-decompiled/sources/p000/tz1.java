package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tz1 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.tz1> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public int f10516;

    /* JADX INFO: renamed from: ζ */
    public int f10517;

    /* JADX INFO: renamed from: η */
    public int[] f10518;

    /* JADX INFO: renamed from: θ */
    public boolean f10519;

    static {
            j r0 = new j
            r1 = 14
            r0.<init>(r1)
            p000.tz1.CREATOR = r0
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
            int r1 = r2.f10516
            r0.append(r1)
            java.lang.String r1 = ", mGapDir="
            r0.append(r1)
            int r1 = r2.f10517
            r0.append(r1)
            java.lang.String r1 = ", mHasUnwantedGapAfter="
            r0.append(r1)
            boolean r1 = r2.f10519
            r0.append(r1)
            java.lang.String r1 = ", mGapPerSpan="
            r0.append(r1)
            int[] r2 = r2.f10518
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
            int r3 = r1.f10516
            r2.writeInt(r3)
            int r3 = r1.f10517
            r2.writeInt(r3)
            boolean r3 = r1.f10519
            r2.writeInt(r3)
            int[] r3 = r1.f10518
            if (r3 == 0) goto L20
            int r0 = r3.length
            if (r0 <= 0) goto L20
            int r3 = r3.length
            r2.writeInt(r3)
            int[] r1 = r1.f10518
            r2.writeIntArray(r1)
            return
        L20:
            r1 = 0
            r2.writeInt(r1)
            return
    }
}
