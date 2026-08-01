package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w92 extends androidx.customview.view.AbstractC0046 {
    public static final android.os.Parcelable.Creator<p000.w92> CREATOR = null;

    /* JADX INFO: renamed from: η */
    public int f11615;

    /* JADX INFO: renamed from: θ */
    public final android.os.Parcelable f11616;

    static {
            hx1 r0 = new hx1
            r1 = 3
            r0.<init>(r1)
            p000.w92.CREATOR = r0
            return
    }

    public w92(android.os.Parcel r2, java.lang.ClassLoader r3) {
            r1 = this;
            r1.<init>(r2, r3)
            if (r3 != 0) goto Lb
            java.lang.Class<w92> r3 = p000.w92.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
        Lb:
            int r0 = r2.readInt()
            r1.f11615 = r0
            android.os.Parcelable r2 = r2.readParcelable(r3)
            r1.f11616 = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentPager.SavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " position="
            r0.append(r1)
            int r2 = r2.f11615
            java.lang.String r1 = "}"
            java.lang.String r2 = p000.AbstractC0602nx.m4131(r0, r2, r1)
            return r2
    }

    @Override // androidx.customview.view.AbstractC0046, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            super.writeToParcel(r2, r3)
            int r0 = r1.f11615
            r2.writeInt(r0)
            android.os.Parcelable r1 = r1.f11616
            r2.writeParcelable(r1, r3)
            return
    }
}
