package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wt extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<defpackage.wt> CREATOR = null;
    public int a;

    static {
            t1 r0 = new t1
            r1 = 9
            r0.<init>(r1)
            defpackage.wt.CREATOR = r0
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MaterialCheckBox.SavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " CheckedState="
            r0.append(r1)
            int r1 = r3.a
            r2 = 1
            if (r1 == r2) goto L25
            r2 = 2
            if (r1 == r2) goto L22
            java.lang.String r1 = "unchecked"
            goto L27
        L22:
            java.lang.String r1 = "indeterminate"
            goto L27
        L25:
            java.lang.String r1 = "checked"
        L27:
            java.lang.String r2 = "}"
            java.lang.String r0 = defpackage.z30.l(r0, r1, r2)
            return r0
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.writeValue(r2)
            return
    }
}
