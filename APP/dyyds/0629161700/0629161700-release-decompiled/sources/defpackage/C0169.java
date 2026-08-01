package defpackage;

/* JADX INFO: renamed from: ᛱᲀᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0169 extends defpackage.AbstractC2109 {
    public static final android.os.Parcelable.Creator<defpackage.C0169> CREATOR = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.os.Parcelable f1147;

    static {
            ᛵᛱᛵᛲ r0 = new ᛵᛱᛵᛲ
            r1 = 1
            r0.<init>(r1)
            defpackage.C0169.CREATOR = r0
            return
    }

    public C0169(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r2 == 0) goto L6
            goto Lc
        L6:
            java.lang.Class<ᛷᛵᛱᲀ> r2 = defpackage.AbstractC1270.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
        Lc:
            android.os.Parcelable r1 = r1.readParcelable(r2)
            r0.f1147 = r1
            return
    }

    @Override // defpackage.AbstractC2109, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            android.os.Parcelable r0 = r0.f1147
            r2 = 0
            r1.writeParcelable(r0, r2)
            return
    }
}
