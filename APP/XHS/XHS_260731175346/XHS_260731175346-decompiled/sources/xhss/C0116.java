package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲈᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0116 extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<xhss.C0116> CREATOR = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f500;

    static {
            xhss.ᛳᲁᛵᛳ r0 = new xhss.ᛳᲁᛵᛳ
            r1 = 0
            r0.<init>(r1)
            xhss.C0116.CREATOR = r0
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
            int r2 = r2.f500
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r0 = r0.f500
            r1.writeInt(r0)
            return
    }
}
