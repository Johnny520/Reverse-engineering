package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class a31 extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<p000.a31> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public int f56;

    static {
            j r0 = new j
            r1 = 9
            r0.<init>(r1)
            p000.a31.CREATOR = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HorizontalScrollView.SavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " scrollPosition="
            r0.append(r1)
            int r2 = r2.f56
            java.lang.String r1 = "}"
            java.lang.String r2 = p000.AbstractC0602nx.m4131(r0, r2, r1)
            return r2
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r0 = r0.f56
            r1.writeInt(r0)
            return
    }
}
