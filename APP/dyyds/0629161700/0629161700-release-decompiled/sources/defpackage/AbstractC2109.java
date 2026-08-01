package defpackage;

/* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2109 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.AbstractC2109> CREATOR = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C1235 f9062 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.os.Parcelable f9063;

    static {
            ᛷᛲᲇᲈ r0 = new ᛷᛲᲇᲈ
            r0.<init>()
            defpackage.AbstractC2109.f9062 = r0
            ᛵᛱᛵᛲ r0 = new ᛵᛱᛵᛲ
            r1 = 0
            r0.<init>(r1)
            defpackage.AbstractC2109.CREATOR = r0
            return
    }

    public AbstractC2109() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f9063 = r0
            return
    }

    public AbstractC2109(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            ᛷᛲᲇᲈ r1 = defpackage.AbstractC2109.f9062
        Lc:
            r0.f9063 = r1
            return
    }

    public AbstractC2109(android.os.Parcelable r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            if (r3 == 0) goto Lf
            ᛷᛲᲇᲈ r1 = defpackage.AbstractC2109.f9062
            if (r3 == r1) goto Lb
            goto Lc
        Lb:
            r3 = r0
        Lc:
            r2.f9063 = r3
            return
        Lf:
            java.lang.String r2 = "superState must not be null"
            defpackage.C2264.m3684(r2)
            throw r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.Parcelable r0 = r0.f9063
            r1.writeParcelable(r0, r2)
            return
    }
}
