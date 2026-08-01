package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g20 extends defpackage.d {
    public static final android.os.Parcelable.Creator<defpackage.g20> CREATOR = null;
    public boolean c;

    static {
            c r0 = new c
            r1 = 6
            r0.<init>(r1)
            defpackage.g20.CREATOR = r0
            return
    }

    public g20(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            java.lang.Object r1 = r1.readValue(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.c = r1
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
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r2 = r0.c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.writeValue(r2)
            return
    }
}
