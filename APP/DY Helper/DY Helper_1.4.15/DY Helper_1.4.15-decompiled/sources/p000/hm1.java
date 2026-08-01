package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 extends androidx.customview.view.AbstractC0046 {
    public static final android.os.Parcelable.Creator<p000.hm1> CREATOR = null;

    /* JADX INFO: renamed from: η */
    public android.os.Parcelable f4777;

    static {
            w91 r0 = new w91
            r1 = 2
            r0.<init>(r1)
            p000.hm1.CREATOR = r0
            return
    }

    public hm1(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r2 == 0) goto L6
            goto Lc
        L6:
            java.lang.Class<zl1> r2 = p000.zl1.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
        Lc:
            android.os.Parcelable r1 = r1.readParcelable(r2)
            r0.f4777 = r1
            return
    }

    @Override // androidx.customview.view.AbstractC0046, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            android.os.Parcelable r0 = r0.f4777
            r2 = 0
            r1.writeParcelable(r0, r2)
            return
    }
}
