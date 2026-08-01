package p000;

/* JADX INFO: renamed from: m8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0540m8 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.C0540m8> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f7010;

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayList f7011;

    static {
            j r0 = new j
            r1 = 3
            r0.<init>(r1)
            p000.C0540m8.CREATOR = r0
            return
    }

    public C0540m8(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f7010 = r0
            android.os.Parcelable$Creator<l8> r0 = p000.C0503l8.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f7011 = r2
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
            java.util.ArrayList r2 = r0.f7010
            r1.writeStringList(r2)
            java.util.ArrayList r0 = r0.f7011
            r1.writeTypedList(r0)
            return
    }
}
