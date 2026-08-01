package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y42 extends androidx.customview.view.AbstractC0046 {
    public static final android.os.Parcelable.Creator<p000.y42> CREATOR = null;

    /* JADX INFO: renamed from: η */
    public int f12454;

    /* JADX INFO: renamed from: θ */
    public boolean f12455;

    static {
            w91 r0 = new w91
            r1 = 3
            r0.<init>(r1)
            p000.y42.CREATOR = r0
            return
    }

    public y42(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r2 = r1.readInt()
            r0.f12454 = r2
            int r1 = r1.readInt()
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r0.f12455 = r1
            return
    }

    @Override // androidx.customview.view.AbstractC0046, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.f12454
            r1.writeInt(r2)
            boolean r0 = r0.f12455
            r1.writeInt(r0)
            return
    }
}
