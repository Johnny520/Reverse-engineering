package p000;

/* JADX INFO: renamed from: w5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0935w5 extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<p000.C0935w5> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public boolean f11566;

    static {
            j r0 = new j
            r1 = 1
            r0.<init>(r1)
            p000.C0935w5.CREATOR = r0
            return
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r0 = r0.f11566
            byte r0 = (byte) r0
            r1.writeByte(r0)
            return
    }
}
