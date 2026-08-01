package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.vl> CREATOR = null;
    public java.lang.String a;
    public int b;

    static {
            t1 r0 = new t1
            r1 = 5
            r0.<init>(r1)
            defpackage.vl.CREATOR = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            int r2 = r0.b
            r1.writeInt(r2)
            return
    }
}
