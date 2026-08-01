package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hw extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<defpackage.hw> CREATOR = null;
    public int a;

    static {
            t1 r0 = new t1
            r1 = 11
            r0.<init>(r1)
            defpackage.hw.CREATOR = r0
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
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.a
            r1.writeInt(r2)
            return
    }
}
