package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kr1 extends androidx.customview.view.AbstractC0046 {
    public static final android.os.Parcelable.Creator<p000.kr1> CREATOR = null;

    /* JADX INFO: renamed from: η */
    public boolean f6097;

    static {
            hx1 r0 = new hx1
            r1 = 2
            r0.<init>(r1)
            p000.kr1.CREATOR = r0
            return
    }

    public kr1(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            java.lang.Object r1 = r1.readValue(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.f6097 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SearchView.SavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " isIconified="
            r0.append(r1)
            boolean r2 = r2.f6097
            java.lang.String r1 = "}"
            java.lang.String r2 = p000.lz1.m3693(r0, r2, r1)
            return r2
    }

    @Override // androidx.customview.view.AbstractC0046, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r0 = r0.f6097
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.writeValue(r0)
            return
    }
}
