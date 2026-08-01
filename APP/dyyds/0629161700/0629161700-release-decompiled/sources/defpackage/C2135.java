package defpackage;

/* JADX INFO: renamed from: ᲇᲁᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2135 extends defpackage.AbstractC2109 {
    public static final android.os.Parcelable.Creator<defpackage.C2135> CREATOR = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f9107;

    static {
            ᛵᛱᛵᛲ r0 = new ᛵᛱᛵᛲ
            r1 = 2
            r0.<init>(r1)
            defpackage.C2135.CREATOR = r0
            return
    }

    public C2135(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            java.lang.Object r1 = r1.readValue(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.f9107 = r1
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
            boolean r2 = r2.f9107
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.AbstractC2109, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r0 = r0.f9107
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.writeValue(r0)
            return
    }
}
