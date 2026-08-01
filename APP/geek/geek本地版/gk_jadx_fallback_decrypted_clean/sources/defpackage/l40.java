package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l40 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.l40> CREATOR = null;
    public int a;
    public int b;
    public int[] c;
    public boolean d;

    static {
            t1 r0 = new t1
            r1 = 13
            r0.<init>(r1)
            defpackage.l40.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FullSpanItem{mPosition="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", mGapDir="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mHasUnwantedGapAfter="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", mGapPerSpan="
            r0.append(r1)
            int[] r1 = r2.c
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r3 = r1.a
            r2.writeInt(r3)
            int r3 = r1.b
            r2.writeInt(r3)
            boolean r3 = r1.d
            r2.writeInt(r3)
            int[] r3 = r1.c
            if (r3 == 0) goto L20
            int r0 = r3.length
            if (r0 <= 0) goto L20
            int r3 = r3.length
            r2.writeInt(r3)
            int[] r3 = r1.c
            r2.writeIntArray(r3)
            return
        L20:
            r3 = 0
            r2.writeInt(r3)
            return
    }
}
