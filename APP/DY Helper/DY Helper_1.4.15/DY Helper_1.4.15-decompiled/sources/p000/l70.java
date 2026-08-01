package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l70 extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<p000.l70> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public java.lang.String f6462;

    static {
            j r0 = new j
            r1 = 7
            r0.<init>(r1)
            p000.l70.CREATOR = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentTabHost.SavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " curTab="
            r0.append(r1)
            java.lang.String r2 = r2.f6462
            java.lang.String r1 = "}"
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.lang.String r0 = r0.f6462
            r1.writeString(r0)
            return
    }
}
