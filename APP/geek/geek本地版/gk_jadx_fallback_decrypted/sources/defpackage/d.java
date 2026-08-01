package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.d> CREATOR = null;
    public static final defpackage.b b = null;
    public final android.os.Parcelable a;

    static {
            b r0 = new b
            r0.<init>()
            defpackage.d.b = r0
            c r0 = new c
            r1 = 0
            r0.<init>(r1)
            defpackage.d.CREATOR = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    public d(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            b r1 = defpackage.d.b
        Lc:
            r0.a = r1
            return
    }

    public d(android.os.Parcelable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Le
            b r0 = defpackage.d.b
            if (r2 == r0) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.a = r2
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "superState must not be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            android.os.Parcelable r0 = r1.a
            r2.writeParcelable(r0, r3)
            return
    }
}
