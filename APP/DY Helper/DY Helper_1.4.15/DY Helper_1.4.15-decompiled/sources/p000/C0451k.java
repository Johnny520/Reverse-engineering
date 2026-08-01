package p000;

/* JADX INFO: renamed from: k */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0451k implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.C0451k> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public final int f5679;

    /* JADX INFO: renamed from: ζ */
    public final android.content.Intent f5680;

    static {
            j r0 = new j
            r1 = 0
            r0.<init>(r1)
            p000.C0451k.CREATOR = r0
            return
    }

    public C0451k(int r1, android.content.Intent r2) {
            r0 = this;
            r0.<init>()
            r0.f5679 = r1
            r0.f5680 = r2
            return
    }

    public C0451k(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.f5679 = r0
            int r0 = r2.readInt()
            if (r0 != 0) goto L11
            r2 = 0
            goto L19
        L11:
            android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
            java.lang.Object r2 = r0.createFromParcel(r2)
            android.content.Intent r2 = (android.content.Intent) r2
        L19:
            r1.f5680 = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ActivityResult{resultCode="
            r0.<init>(r1)
            r1 = -1
            int r2 = r3.f5679
            if (r2 == r1) goto L16
            if (r2 == 0) goto L13
            java.lang.String r1 = java.lang.String.valueOf(r2)
            goto L18
        L13:
            java.lang.String r1 = "RESULT_CANCELED"
            goto L18
        L16:
            java.lang.String r1 = "RESULT_OK"
        L18:
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            android.content.Intent r3 = r3.f5680
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r0 = r1.f5679
            r2.writeInt(r0)
            android.content.Intent r1 = r1.f5680
            if (r1 != 0) goto Lb
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            r2.writeInt(r0)
            if (r1 == 0) goto L14
            r1.writeToParcel(r2, r3)
        L14:
            return
    }
}
