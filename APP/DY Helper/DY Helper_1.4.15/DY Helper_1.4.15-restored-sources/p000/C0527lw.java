package p000;

/* JADX INFO: renamed from: lw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0527lw extends androidx.customview.view.AbstractC0046 {
    public static final android.os.Parcelable.Creator<p000.C0527lw> CREATOR = null;

    /* JADX INFO: renamed from: η */
    public int f6817;

    /* JADX INFO: renamed from: θ */
    public int f6818;

    /* JADX INFO: renamed from: ι */
    public int f6819;

    /* JADX INFO: renamed from: κ */
    public int f6820;

    /* JADX INFO: renamed from: λ */
    public int f6821;

    static {
            hx1 r0 = new hx1
            r1 = 1
            r0.<init>(r1)
            p000.C0527lw.CREATOR = r0
            return
    }

    public C0527lw(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.f6817 = r2
            int r2 = r1.readInt()
            r0.f6817 = r2
            int r2 = r1.readInt()
            r0.f6818 = r2
            int r2 = r1.readInt()
            r0.f6819 = r2
            int r2 = r1.readInt()
            r0.f6820 = r2
            int r1 = r1.readInt()
            r0.f6821 = r1
            return
    }

    @Override // androidx.customview.view.AbstractC0046, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.f6817
            r1.writeInt(r2)
            int r2 = r0.f6818
            r1.writeInt(r2)
            int r2 = r0.f6819
            r1.writeInt(r2)
            int r2 = r0.f6820
            r1.writeInt(r2)
            int r0 = r0.f6821
            r1.writeInt(r0)
            return
    }
}
