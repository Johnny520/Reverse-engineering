package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c70 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.c70> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public java.util.ArrayList f1974;

    /* JADX INFO: renamed from: ζ */
    public java.util.ArrayList f1975;

    /* JADX INFO: renamed from: η */
    public p000.C0503l8[] f1976;

    /* JADX INFO: renamed from: θ */
    public int f1977;

    /* JADX INFO: renamed from: ι */
    public java.lang.String f1978;

    /* JADX INFO: renamed from: κ */
    public java.util.ArrayList f1979;

    /* JADX INFO: renamed from: λ */
    public java.util.ArrayList f1980;

    /* JADX INFO: renamed from: μ */
    public java.util.ArrayList f1981;

    static {
            j r0 = new j
            r1 = 5
            r0.<init>(r1)
            p000.c70.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.util.ArrayList r0 = r1.f1974
            r2.writeStringList(r0)
            java.util.ArrayList r0 = r1.f1975
            r2.writeStringList(r0)
            l8[] r0 = r1.f1976
            r2.writeTypedArray(r0, r3)
            int r3 = r1.f1977
            r2.writeInt(r3)
            java.lang.String r3 = r1.f1978
            r2.writeString(r3)
            java.util.ArrayList r3 = r1.f1979
            r2.writeStringList(r3)
            java.util.ArrayList r3 = r1.f1980
            r2.writeTypedList(r3)
            java.util.ArrayList r1 = r1.f1981
            r2.writeTypedList(r1)
            return
    }
}
