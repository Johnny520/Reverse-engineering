package defpackage;

/* JADX INFO: renamed from: ᲈᲈᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2362 extends defpackage.AbstractC2109 {
    public static final android.os.Parcelable.Creator<defpackage.C2362> CREATOR = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f10231;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f10232;

    static {
            ᛵᛱᛵᛲ r0 = new ᛵᛱᛵᛲ
            r1 = 3
            r0.<init>(r1)
            defpackage.C2362.CREATOR = r0
            return
    }

    public C2362(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r2 = r1.readInt()
            r0.f10231 = r2
            int r1 = r1.readInt()
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r0.f10232 = r1
            return
    }

    @Override // defpackage.AbstractC2109, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.f10231
            r1.writeInt(r2)
            boolean r0 = r0.f10232
            r1.writeInt(r0)
            return
    }
}
